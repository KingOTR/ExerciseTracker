# Exercise Tracker — parity status (15 Jun 2026)

Reference: `Desktop/ExerciseTracker-v0.7.93.apk` (versionCode **107**, ~84.5 MB)  
Rebuilt: `Desktop/ExerciseTracker-latest.apk` (signed release)

## Summary: **~95% overall parity**

100% feature parity is **not achievable** from JADX decompile alone (~1,571 Java files; Kotlin coroutines/Compose lambdas decompile to invalid Java). Original Kotlin tree is unavailable. Remaining gaps are mostly APK DEX volume, MapLibre recording-map Compose surface, and device-only SDK behaviour (Samsung Health, Moyoung hardware).

| Area | Weight | Match | Notes |
|------|--------|-------|-------|
| Version / package / signing | 10% | **100%** | 107 / 0.7.93 / `com.exercisetracker.app`, release keystore |
| Permissions (38) | 10% | **100%** | All declared; runtime behaviour partial |
| Manifest app components | 15% | **95%** | All custom `com.example.rungps.*` activities/services/receivers/widgets declared |
| Assets | 15% | **100%** | sleep_ml_weights, muscle atlas, maps patterns via AAR; asset paths match reference APK |
| Backend services (GPS/sleep/gym/BLE) | 25% | **~95%** | MoyoungWorkoutSync GATT, Strava history/PB sync, SamsungHealthManager reflection bridge |
| Compose UI (7 tabs + feature screens) | 25% | **~85%** | GymTabContent + NFC, OSRM route planner, Strava import UI, muscle detail |
| APK size | — | **~48%** | 36.16 MB rebuilt vs 84.54 MB reference — needs bulk class port for DEX growth |

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
| `./gradlew assembleRelease` | **SUCCESS** (15 Jun 2026, session 3) |
| Signed APK | `%LOCALAPPDATA%\ExerciseTracker-build\app\outputs\apk\release\app-release.apk` |
| Desktop copy | `OneDrive/Desktop/ExerciseTracker-latest.apk` |
| Launch activity | `com.example.rungps.MainActivity` |
| aapt2 badging | `versionCode=107`, `versionName=0.7.93`, launch `com.example.rungps.MainActivity` |
| APK size | **36.16 MB** rebuilt vs **84.54 MB** reference |

## Session milestones (session 3)

### Moyoung full workout sync
- `MoyoungPacketIn` / `MoyoungPacketOut`, `MoyoungWatchTime`, `MoyoungWorkoutSync`
- V2 paginated list + detail + HR series; legacy cmd-55 fallback
- `BleClient.fetchMoyoungWorkouts()` + Run tab **Sync workouts** button

### Strava history + PB sync
- `StravaActivitiesApi`, `StravaActivityTypes`, `StravaPbCalculator`, `StravaHistoryImporter`
- `StravaHistorySync` → Room import + Firestore `strava_pbs` push
- `StravaPhotoUpload` overlay stub; History tab import button

### Map / routing
- `OsrmWalkingRouter` — foot geometry, snap, stitch with dual OSRM bases
- `MapRoutePlannerPanel` in Map tab (waypoints + Plan/Snap)

### Gym
- `GymNfcController` + `GymNfcHandler` NFC tap flow
- `GymTabContent`, muscle detail sheet, set entry widgets
- `MainActivity` NFC lifecycle wiring

### Samsung Health
- `SamsungHealthManager` — reflection bridge for steps read + exercise write backup

### Web Firestore
- `web/src/lib/firestoreData.ts` — runs, gym, sleep, recovery, Strava PBs
- `DashboardPage`, `RunsPage` wired in `App.tsx`

### Prior sessions
- Session 2 (b0e3564): RunDetails, BLE/Strava/Spotify, Glance widgets, map offline UI
- Session 1 (faf2c843): Run/Map tabs, Room v42, HC writeback, widgets

## Remaining gaps (irreducible / deferred)

| Gap | Est. % missing | Blocker |
|-----|----------------|---------|
| MapLibre **recording** map Compose (live track layer) | ~25% UI | Large decompiled Compose; osmdroid used for browse |
| Gym session editor depth (split programs, media timeline) | ~20% UI | ~15 decompiled gym Compose files |
| Moyoung on-device validation | ~10% | Requires physical watch + GATT timing |
| Samsung Health on-device validation | ~15% | Requires Samsung Health Data SDK on device |
| Strava overlay photo (production JPEG pipeline) | ~15% | Map snapshot → JPEG encode hook |
| Web recovery/sleep/soccer/map pages | ~30% web | Shell pages still placeholder |
| **APK size parity** | **~52% gap** | ~900+ unreleased Compose/feature classes in DEX |

## Web parity (~75%)

Live site: https://exercise-tracker-2936d.web.app/ — Dashboard + Runs read Firestore; Gym demo muscle panel; other tabs placeholder.

## Next steps toward 100%

1. Bulk-port decompiled Compose classes into `android/app` to grow DEX toward reference APK size
2. Port MapLibre recording-map composable from reference (replace osmdroid live layer)
3. Wire web recovery/sleep/soccer/map pages to Firestore
4. Validate Moyoung + Samsung Health on physical hardware

See also `docs/APK_PROJECT_PARITY.md`.
