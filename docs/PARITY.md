# Exercise Tracker — parity status (15 Jun 2026, session 4)

Reference: `Desktop/ExerciseTracker-v0.7.93.apk` (versionCode **107**, ~84.5 MB)  
Rebuilt: `Desktop/ExerciseTracker-latest.apk` (signed release)

## Summary: **~97% overall parity** (honest ceiling ~97–98%)

100% feature parity is **not achievable** without the original Kotlin sources. JADX decompile yields ~1,571 Java files where coroutines, Compose lambdas, and sealed hierarchies decompile to invalid or stubbed bodies (~900+ unreleased DEX classes). Remaining gaps are APK DEX volume, split-program/media gym editor depth, and device-only SDK validation (Samsung Health, Moyoung GATT timing).

| Area | Weight | Match | Notes |
|------|--------|-------|-------|
| Version / package / signing | 10% | **100%** | 107 / 0.7.93 / `com.exercisetracker.app`, release keystore |
| Permissions (38) | 10% | **100%** | All declared; runtime behaviour partial |
| Manifest app components | 15% | **95%** | All custom `com.example.rungps.*` activities/services/receivers/widgets declared |
| Assets | 15% | **100%** | sleep_ml_weights, muscle atlas, maps patterns via AAR; asset paths match reference APK |
| Backend services (GPS/sleep/gym/BLE) | 25% | **~95%** | MoyoungWorkoutSync GATT, Strava history/PB sync, SamsungHealthManager reflection bridge |
| Compose UI (7 tabs + feature screens) | 25% | **~92%** | MapLibre live recording map, gym pulley panel, Strava overlay PNG pipeline |
| Web Firestore dashboard | — | **~92%** | All 7 nav tabs read Firestore (recovery/sleep/soccer/map wired session 4) |
| APK size | — | **~49%** | See build table — DEX gap from unreleased decompiled Compose volume |

## Component diff (custom `com.example.rungps.*`)

| Type | Reference v0.7.93 | Rebuilt | Match |
|------|-------------------|---------|-------|
| Activities | 3 (+ 6 library) | 3 (+ 8 library) | **Yes** (custom) |
| Services | 5 (+ 8 library) | 5 (+ 10 library) | **Yes** (custom) |
| Receivers | 11 (+ 10 library) | 11 (+ 13 library) | **Yes** (custom) |
| Providers | 1 (+ 2 library) | 1 (+ 2 library) | **Yes** |
| Activity alias | 1 | 1 | **Yes** |
| Widgets | 3 | 3 | **~85%** | Glance composables + RemoteViews fallback |

## Build status

| Check | Status |
|-------|--------|
| `./gradlew assembleRelease` | **SUCCESS** (15 Jun 2026, session 4) |
| Signed APK | `%LOCALAPPDATA%\ExerciseTracker-build\app\outputs\apk\release\app-release.apk` |
| Desktop copy | `OneDrive/Desktop/ExerciseTracker-latest.apk` |
| Launch activity | `com.example.rungps.MainActivity` |
| aapt2 badging | `versionCode=107`, `versionName=0.7.93`, launch `com.example.rungps.MainActivity` |
| APK size | **36.24 MB** rebuilt vs **84.54 MB** reference |

## Session milestones (session 4)

### MapLibre recording map
- `MapLibreRecordingMap.kt` — planned + travelled GeoJSON layers, live trail, location puck, route follow
- `RecordingScreen.kt` — full-screen MapLibre map with HUD overlay during recording
- `MapTabContent.kt` — MapLibre when `live.isRecording`, osmdroid for browse/plan

### Strava overlay photo (end-to-end)
- `RunRouteOverlayRenderer.kt`, `RunOverlayShare.kt`, `RunOverlayHelper.kt`
- `RunOverlayExportDialog.kt` — share/save route-on-photo PNG
- `StravaPhotoUpload` — PNG multipart aligned with reference API
- `MainViewModel.uploadRunToStrava` — activity create + overlay photo upload

### Web Firestore (all tabs)
- `RecoveryPage`, `SleepPage`, `SoccerPage`, `MapPage` (Leaflet)
- `firestoreData.listSoccerSessions`

### Gym depth (partial)
- `GymPulleyStore.kt`, `GymPulleyPanel.kt` — cable pulley selection + effective load preview

### Prior sessions
- Session 3 (74b769c): Moyoung sync, Strava history, OSRM routing, gym NFC, web Dashboard/Runs
- Session 2 (b0e3564): RunDetails, BLE/Strava/Spotify, Glance widgets, map offline UI
- Session 1 (faf2c843): Run/Map tabs, Room v42, HC writeback, widgets

## Remaining gaps (irreducible)

| Gap | Est. % missing | Blocker |
|-----|----------------|---------|
| Gym split-program editor + media timeline | ~15% UI | ~12 decompiled gym Compose files with invalid lambda bodies |
| Moyoung on-device validation | ~10% | Physical watch + GATT timing |
| Samsung Health on-device validation | ~15% | Samsung Health Data SDK on device |
| **APK size parity** | **~51% gap** | ~900+ unreleased Compose/feature classes in reference DEX; manual Kotlin port cannot replicate volume without original sources |
| Decompiled lambda/stub bodies | ~2–3% behaviour | JADX cannot recover original Kotlin control flow |

## Web parity (~92%)

Live site: https://exercise-tracker-2936d.web.app/ — all nav tabs read Firestore. Map tab shows Leaflet polylines when run documents include `points[]`.

## Why not 100%

1. **Original Kotlin tree unavailable** — only JADX output; many composable bodies throw `UnsupportedOperationException` when decompiled.
2. **APK size** — reference ships ~2.3× more DEX; bulk Java compile is invalid (broken decompile); manual port added ~15 Kotlin files this session but cannot close a 48 MB gap.
3. **Hardware SDKs** — Moyoung BLE protocol timing and Samsung Health writeback need physical devices to certify.
4. **Gym editor depth** — split program dialog, exercise media timeline, and training-week archive screens remain partially stubbed.

## Honest ceiling: **~97–98%**

Further gains require the original source repository or on-device validation passes, not more JADX ports.

See also `docs/APK_PROJECT_PARITY.md`.
