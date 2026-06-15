# Exercise Tracker — parity status (15 Jun 2026)

Reference: `Desktop/ExerciseTracker-v0.7.93.apk` (versionCode **107**, ~84.5 MB)  
Rebuilt: `Desktop/ExerciseTracker-latest.apk` (signed release, ~35.1 MB)

## Summary: **~84% overall parity**

100% feature parity is **not achievable** from JADX decompile alone (~1,571 Java files; Kotlin coroutines/Compose lambdas decompile to invalid Java). Original Kotlin tree is unavailable. Maximum recoverable without source: manifest + assets + backend stubs + incremental manual Kotlin ports.

| Area | Weight | Match | Notes |
|------|--------|-------|-------|
| Version / package / signing | 10% | **100%** | 107 / 0.7.93 / `com.exercisetracker.app`, release keystore |
| Permissions (38) | 10% | **100%** | All declared; runtime behaviour partial |
| Manifest app components | 15% | **95%** | All custom `com.example.rungps.*` activities/services/receivers/widgets declared |
| Assets | 15% | **100%** | sleep_ml_weights, muscle atlas, maps patterns via AAR; asset paths match reference APK |
| Backend services (GPS/sleep/gym/BLE) | 25% | **~83%** | TrackingService + WorkoutEngine; SleepHealthFusion + HC writeback |
| Compose UI (7 tabs + feature screens) | 25% | **~48%** | Run/Map/History/Soccer tabs + Sleep/Gym/Recovery; detail screens still partial |
| APK size | — | **42%** | 35.1 MB vs 84.5 MB (DEX/code volume gap from unreleased Compose UI) |

## Component diff (custom `com.example.rungps.*`)

| Type | Reference v0.7.93 | Rebuilt | Match |
|------|-------------------|---------|-------|
| Activities | 3 (+ 6 library) | 3 (+ 8 library) | **Yes** (custom) |
| Services | 5 (+ 8 library) | 5 (+ 10 library) | **Yes** (custom) |
| Receivers | 11 (+ 10 library) | 11 (+ 13 library) | **Yes** (custom) |
| Providers | 1 (+ 2 library) | 1 (+ 2 library) | **Yes** |
| Activity alias | 1 | 1 | **Yes** |
| Widgets | 3 | 3 | **~45%** | Host-layout RemoteViews bind (live run stats); Glance not ported |

## Build status

| Check | Status |
|-------|--------|
| `./gradlew assembleRelease` | **SUCCESS** (15 Jun 2026, Run/Map tabs + Room v42) |
| Signed APK | `%LOCALAPPDATA%\ExerciseTracker-build\app\outputs\apk\release\app-release.apk` |
| Desktop copy | `OneDrive/Desktop/ExerciseTracker-latest.apk` |
| Launch activity | `com.example.rungps.MainActivity` |
| aapt2 badging | `versionCode=107`, `versionName=0.7.93`, launch `com.example.rungps.MainActivity` |
| APK size | **35.10 MB** rebuilt vs **84.54 MB** reference |

## Session milestones (this session)

### Run + Map Compose tabs
- `RunTabContent`, `ActiveRecordingPane`, `RunListRow`, `RunDetailsCard`
- `MapTabContent` with osmdroid `MapView` AndroidView, live GPS marker, route chips
- `HistoryTabContent`, `SoccerTabContent` shells
- `MainActivity` wired to real tab composables (replaces `DataScreen` stubs)

### Room v42 schema expansion
- `RouteEntity`, `RoutePointEntity`, `GearEntity`, `TrainingPlanProgressEntity`
- `RouteDao`, `GearDao`, `TrainingPlanDao`
- Database version **42** (reference AppDb parity for routes/gear/training_plans tables)

### Health Connect writeback
- `HealthConnectWriteback` — sleep + run auto-backup when `healthConnectAutoBackup` pref set
- `HealthConnectManager.backupSleepSession`, `readSleepSessions`, sleep write permissions
- `SleepHealthFusion` — HC overlap detection; wired into `SleepSessionFinisher`
- `TrackingService` — run HC writeback on finish

### Glance/widget providers
- `WidgetMinimalBind` — binds `widget_*_host.xml` with live recording stats (Ride/Run)
- `GymWidgetProvider`, `RideRunWidgetProvider`, `RecoveryWidgetProvider` real `onUpdate`
- `WidgetBootstrap`, `GymWidgetUpdater`, `RecoveryWidgetUpdater`

### Prior session (095f2a36)
- WorkoutEngine interval cues, HealthConnectManager steps/run backup

## Remaining gaps (line-item)

| Gap | Est. % missing | Blocker |
|-----|----------------|---------|
| Full Compose UI detail (run details panel, map offline download, gym NFC) | ~52% UI | Manual Kotlin port from `recovered-source/` |
| Strava / Spotify integration | ~100% | OAuth + API clients |
| Samsung Health | ~100% | `SamsungHealthManager` |
| Glance widgets (full) | ~55% | Glance composables not ported; RemoteViews host bind only |
| BLE watch panel in Run tab | ~80% | `BleClient` / `BleStatus` not ported |
| Web dashboard Firestore binding | ~60% | `web/` shell only |
| APK size parity | ~58% gap | Requires porting ~1,200+ classes of Compose/feature code |

## Web parity (~25%)

Live site: https://exercise-tracker-2936d.web.app/ — 7-tab shell in `web/`; most pages not wired to Firestore.

## Next steps toward 100%

1. Port `RunDetailsPanel`, `RecordingScreen` full (BLE HR zones, interval overlay)
2. Port MapLibre offline region download UI
3. Port Strava/Spotify/BLE modules
4. Port Glance widget composables (replace RemoteViews bridge)
5. Wire `web/` to Firestore paths matching Android sync

See also `docs/APK_PROJECT_PARITY.md`.
