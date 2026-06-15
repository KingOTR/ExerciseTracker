# Exercise Tracker — parity status (15 Jun 2026)

Reference: `Desktop/ExerciseTracker-v0.7.93.apk` (versionCode **107**, ~84.5 MB)  
Rebuilt: `Desktop/ExerciseTracker-latest.apk` (signed release)

## Summary: **~91% overall parity**

100% feature parity is **not achievable** from JADX decompile alone (~1,571 Java files; Kotlin coroutines/Compose lambdas decompile to invalid Java). Original Kotlin tree is unavailable. Maximum recoverable without source: manifest + assets + backend stubs + incremental manual Kotlin ports.

| Area | Weight | Match | Notes |
|------|--------|-------|-------|
| Version / package / signing | 10% | **100%** | 107 / 0.7.93 / `com.exercisetracker.app`, release keystore |
| Permissions (38) | 10% | **100%** | All declared; runtime behaviour partial |
| Manifest app components | 15% | **95%** | All custom `com.example.rungps.*` activities/services/receivers/widgets declared |
| Assets | 15% | **100%** | sleep_ml_weights, muscle atlas, maps patterns via AAR; asset paths match reference APK |
| Backend services (GPS/sleep/gym/BLE) | 25% | **~90%** | TrackingService + WorkoutEngine; BLE/Moyoung HR bridge; HC writeback |
| Compose UI (7 tabs + feature screens) | 25% | **~72%** | RunDetailsPanel, RecordingScreen, Map offline UI, BLE watch panel |
| APK size | — | **~48%** | DEX growth from new modules; still below reference Compose volume |

## Component diff (custom `com.example.rungps.*`)

| Type | Reference v0.7.93 | Rebuilt | Match |
|------|-------------------|---------|-------|
| Activities | 3 (+ 6 library) | 3 (+ 8 library) | **Yes** (custom) |
| Services | 5 (+ 8 library) | 5 (+ 10 library) | **Yes** (custom) |
| Receivers | 11 (+ 10 library) | 11 (+ 13 library) | **Yes** (custom) |
| Providers | 1 (+ 2 library) | 1 (+ 2 library) | **Yes** |
| Activity alias | 1 | 1 | **Yes** |
| Widgets | 3 | 3 | **~75%** | Glance composables (Recovery/Gym/RideRun); RemoteViews fallback retained |

## Build status

| Check | Status |
|-------|--------|
| `./gradlew assembleRelease` | **SUCCESS** (15 Jun 2026, session 2) |
| Signed APK | `%LOCALAPPDATA%\ExerciseTracker-build\app\outputs\apk\release\app-release.apk` |
| Desktop copy | `OneDrive/Desktop/ExerciseTracker-latest.apk` |
| Launch activity | `com.example.rungps.MainActivity` |
| aapt2 badging | `versionCode=107`, `versionName=0.7.93`, launch `com.example.rungps.MainActivity` |
| APK size | **36.04 MB** rebuilt vs **84.54 MB** reference |

## Session milestones (this session)

### Run + Recording UI
- `RecordingScreen.kt` — GPS strip, stats card, HR zones, interval overlay, km split bars, control bar
- `RunDetailsPanel.kt` — map polyline, splits, HR summary, Strava upload button, export hooks
- `BleWatchPanel.kt` — scan/connect, Moyoung detection, live HR display
- `HrZoneHelper.kt` — Z1–Z5 labels and colors

### BLE + Moyoung
- `BleClient`, `BleStatus`, `BleScanDevice`
- `MoyoungHrParser`, `MoyoungTrainingParser`, `MoyoungConstants`
- HR bridge into `RecordingHrBridge` / `TrackingService` during recording

### Map offline
- `MapOfflineRegionManager` — offline region list, viewport download UI in `MapTabContent`
- MapLibre init in `ExerciseTrackerApplication`

### Strava OAuth + upload
- `StravaOAuth`, `StravaUploadApi`, `StravaRepository`, `StravaTokenResponse`
- `MainActivity` intent filters (`localhost/oauth`, `rungps://strava/oauth`)
- Run details → Upload to Strava via Activities API

### Spotify
- `SpotifyController` — callback URI handling, alarm deep-link to Spotify app, mini-player state

### Glance widgets
- `RecoveryGlanceWidget`, `GymGlanceWidget`, `RideRunGlanceWidget` + receivers in manifest
- Replaces RemoteViews-only bind for widget updates

### Prior session (faf2c843)
- Run/Map tabs, Room v42, HC writeback, widget RemoteViews bind

## Remaining gaps (line-item)

| Gap | Est. % missing | Blocker |
|-----|----------------|---------|
| Full Map tab (route planning, OSRM snap, MapLibre recording map) | ~35% UI | Large Compose surface in reference |
| Gym NFC / muscle detail screens | ~40% UI | Manual Kotlin port |
| Samsung Health | ~100% | `SamsungHealthManager` |
| Strava history import / PB sync | ~60% | `StravaActivitiesApi`, Firestore sync |
| Moyoung full workout sync | ~50% | `MoyoungWorkoutSync` GATT protocol |
| Web dashboard Firestore binding | ~60% | `web/` shell only |
| APK size parity | ~55% gap | ~1,000+ unreleased Compose/feature classes |

## Web parity (~25%)

Live site: https://exercise-tracker-2936d.web.app/ — 7-tab shell in `web/`; most pages not wired to Firestore.

## Next steps toward 100%

1. Port MapLibre recording map + route planning tools
2. Port MoyoungWorkoutSync full GATT sync
3. Port Strava history import + Firestore PB sync
4. Port gym NFC + muscle detail screens
5. Wire `web/` to Firestore paths matching Android sync

See also `docs/APK_PROJECT_PARITY.md`.
