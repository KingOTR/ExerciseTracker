# Exercise Tracker — parity status (15 Jun 2026)

Reference: `Desktop/ExerciseTracker-v0.7.93.apk` (versionCode **107**, ~84.5 MB)  
Rebuilt: `Desktop/ExerciseTracker-latest.apk` (signed release, ~35.0 MB)

## Summary: **~76% overall parity**

100% feature parity is **not achievable** from JADX decompile alone (~1,571 Java files; Kotlin coroutines/Compose lambdas decompile to invalid Java). Original Kotlin tree is unavailable. Maximum recoverable without source: manifest + assets + backend stubs + incremental manual Kotlin ports.

| Area | Weight | Match | Notes |
|------|--------|-------|-------|
| Version / package / signing | 10% | **100%** | 107 / 0.7.93 / `com.exercisetracker.app`, release keystore |
| Permissions (38) | 10% | **100%** | All declared; runtime behaviour partial |
| Manifest app components | 15% | **95%** | All custom `com.example.rungps.*` activities/services/receivers/widgets declared |
| Assets | 15% | **100%** | sleep_ml_weights, muscle atlas, maps patterns via AAR; asset paths match reference APK |
| Backend services (GPS/sleep/gym/BLE) | 25% | **~78%** | TrackingService + **WorkoutEngine** interval cues; SleepListenService + ML pipeline |
| Compose UI (7 tabs + feature screens) | 25% | **~28%** | Sleep tab + partial Gym/Recovery; ~380 UI `.kt` files still in `decompiled-reference/` |
| APK size | — | **41%** | 35.0 MB vs 84.5 MB (DEX/code volume gap from unreleased Compose UI) |

## Component diff (custom `com.example.rungps.*`)

| Type | Reference v0.7.93 | Rebuilt | Match |
|------|-------------------|---------|-------|
| Activities | 3 (+ 6 library) | 3 (+ 8 library) | **Yes** (custom) |
| Services | 5 (+ 8 library) | 5 (+ 10 library) | **Yes** (custom) |
| Receivers | 11 (+ 10 library) | 11 (+ 13 library) | **Yes** (custom) |
| Providers | 1 (+ 2 library) | 1 (+ 2 library) | **Yes** |
| Activity alias | 1 | 1 | **Yes** |
| Widgets | 3 | 3 | **Yes** (stub RemoteViews; Glance logic not ported) |

## Build status

| Check | Status |
|-------|--------|
| `./gradlew assembleRelease` | **SUCCESS** (15 Jun 2026, WorkoutEngine + sleep ML) |
| Signed APK | `%LOCALAPPDATA%\ExerciseTracker-build\app\outputs\apk\release\app-release.apk` |
| Desktop copy | `OneDrive/Desktop/ExerciseTracker-latest.apk` |
| Launch activity | `com.example.rungps.MainActivity` |
| aapt2 badging | `versionCode=107`, `versionName=0.7.93`, launch `com.example.rungps.MainActivity` |
| APK size | **34.96 MB** rebuilt vs **84.54 MB** reference |

## Session milestones

### Sleep ML + staging (commit pending push)
Ported manually from `decompiled-reference/`:

- `SleepStagingV2Classifier`, `SleepMelFeatureExtractor`, `SleepTfliteRunner`, `SleepMlClassifier`
- `SleepYamNetClassifier`, `SleepHypnogramEncoder`, `SleepSnoreMetrics`, `SleepOsaRiskScorer`
- `SleepAudioFeaturePipeline`, `SleepStageSmoother`, `SleepDetailComponents`
- Integrated into `SleepListenService`, `SleepSessionFinisher`, `SleepPhaseAnalyzer`

### WorkoutEngine + Health Connect (latest)
- `intervals/` package: `WorkoutEngine`, `WorkoutPlan`, `CustomPlan`, `WorkoutPlanResolver`
- `TrackingService`: plan JSON parsing, interval beeps/TTS cues, segment progress in `TrackingUiState`
- `health/HealthConnectManager`: SDK status, permissions, steps read, run backup write

## Remaining gaps (line-item)

| Gap | Est. % missing | Blocker |
|-----|----------------|---------|
| Full Compose UI from decompile | ~72% UI | JADX Compose output invalid; manual Kotlin port |
| Sleep UI detail (night sheet full, HC banner wired) | ~40% sleep UI | Compose screens not ported |
| Health Connect sleep writeback + Samsung Health | ~70% HC | `HealthConnectWriteback`, `SamsungHealthManager` |
| Strava / Spotify integration | ~100% | OAuth + API clients in decompile |
| MapLibre offline UI | ~90% | MapTabContent not ported |
| Glance widgets (real) | ~90% | Widget providers are stub RemoteViews |
| Room schema v42 full DAO surface | ~25% | routes/gear/training_plans tables missing |
| Web dashboard Firestore binding | ~60% | `web/` shell only |
| APK size parity | ~59% gap | Requires porting ~1,500 classes of Compose/feature code |

## Web parity (~25%)

Live site: https://exercise-tracker-2936d.web.app/ — 7-tab shell in `web/`; most pages not wired to Firestore.

## Next steps toward 100%

1. Port `RunTabContent` + `MapTabContent` from decompiled-reference UI
2. Port Glance widget providers (`GymWidgetProvider`, `RideRunWidgetProvider`, `RecoveryWidgetProvider`)
3. Port `HealthConnectWriteback` + sleep HC banner UI
4. Port Strava/Spotify/BLE modules
5. Wire `web/` to Firestore paths matching Android sync

See also `docs/APK_PROJECT_PARITY.md`.
