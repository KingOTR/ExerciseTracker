# Exercise Tracker — parity status (15 Jun 2026)

Reference: `Desktop/ExerciseTracker-v0.7.93.apk` (versionCode **107**, ~84.5 MB)  
Rebuilt: `Desktop/ExerciseTracker-latest.apk` (signed release, ~34.4 MB)

## Summary: **~76% overall parity**

100% feature parity is **not achievable** from JADX decompile alone (~1,571 Java files; Kotlin coroutines/Compose lambdas decompile to invalid Java). Original Kotlin tree is unavailable. Maximum recoverable without source: manifest + assets + backend stubs + incremental manual Kotlin ports.

| Area | Weight | Match | Notes |
|------|--------|-------|-------|
| Version / package / signing | 10% | **100%** | 107 / 0.7.93 / `com.exercisetracker.app`, release keystore |
| Permissions (38) | 10% | **100%** | All declared; runtime behaviour partial |
| Manifest app components | 15% | **95%** | All custom `com.example.rungps.*` activities/services/receivers/widgets declared |
| Assets | 15% | **75%** | Core JSON (sleep ML, muscle atlas, maps) present; TFLite models optional (graceful fallback) |
| Backend services (GPS/sleep/gym/BLE) | 25% | **~72%** | **SleepListenService** ML pipeline wired; **TrackingService** GPS/run partial |
| Compose UI (7 tabs + feature screens) | 25% | **~34%** | Sleep tab + night detail sheet, hypnogram, snore/breathing cards |
| APK size | — | **41%** | 34.4 MB vs 84.5 MB (missing full native/media payload + unreleased asset duplicates) |

## Component diff (custom `com.example.rungps.*`)

| Type | Reference v0.7.93 | Rebuilt | Match |
|------|-------------------|---------|-------|
| Activities | 3 (+ 6 library) | 3 (+ 8 library) | **Yes** (custom) |
| Services | 5 (+ 8 library) | 5 (+ 10 library) | **Yes** (custom) |
| Receivers | 11 (+ 10 library) | 11 (+ 13 library) | **Yes** (custom) |
| Providers | 1 (+ 2 library) | 1 (+ 2 library) | **Yes** |
| Activity alias | 1 | 1 | **Yes** |
| Widgets | 3 | 3 | **Yes** (stub providers) |

## Build status

| Check | Status |
|-------|--------|
| `./gradlew assembleRelease` | **SUCCESS** (15 Jun 2026, sleep ML milestone) |
| Signed APK | `%LOCALAPPDATA%\ExerciseTracker-build\app\outputs\apk\release\app-release.apk` |
| Desktop copy | `OneDrive/Desktop/ExerciseTracker-latest.apk` |
| Launch activity | `com.example.rungps.MainActivity` |
| aapt2 badging | `versionCode=107`, `versionName=0.7.93`, launch `com.example.rungps.MainActivity` |

## Session milestone: Sleep ML pipeline + analytics + detail UI

Ported manually from `android/decompiled-reference/` (not bulk Java compile):

### Sleep ML pipeline (18 new Kotlin files)
- `SleepMelFeatureExtractor`, `SleepAudioFeaturePipeline`, `SleepMlClassifier`, `SleepFeatureEncoder`
- `SleepStagingV2Classifier`, `SleepYamNetClassifier`, `SleepTfliteRunner` (optional TFLite assets)
- `SleepStageSmoother`, `SleepStageLabel` — wired into `SleepListenService` bucket loop
- `SleepStageInference` upgraded (smoothed ML labels), `SleepPhaseAnalyzer` smart-alarm scoring

### Sleep analytics (8 Kotlin files)
- `SleepSnoreMetrics`, `SleepBreathingDisruptionAnalyzer`, `SleepOsaRiskScorer`
- `SleepHypnogramEncoder`, `SleepEventMarkersEncoder`, `SleepMinuteEvent`
- `SleepAnalyticsCompact`, `SleepMicCoverage`, `SleepAudioQualityClassifier`

### Sleep UI detail (1 new + 2 upgraded)
- `SleepDetailComponents` — night detail sheet, hypnogram chart, disturbance timeline
- `SleepSnoreMetricsCard`, `SleepBreathingDisruptionsCard`, `SleepOvernightLiveChart`
- `SleepNightStatsSection`, upgraded `SleepTrackingLiveCard` / `SleepTrendCard`

### Integration
- `SleepListenService` — mel partials, 30s epoch compaction, ML bucket features
- `SleepSessionFinisher` — hypnogram, event markers, analytics JSON, mic coverage, OSA hint

### Sleep subsystem total: **~72%** of 95-file target (48 core + 4 UI Kotlin files)

## Remaining gaps (line-item)

| Gap | Est. % missing | Blocker |
|-----|----------------|---------|
| Full Compose UI from decompile | ~66% UI | JADX Compose output invalid; needs manual Kotlin port |
| TFLite model assets (`sleep_staging_v2.tflite`, `yamnet.tflite`) | optional | Graceful JSON-ML fallback when assets absent |
| Health Connect sleep read/write | ~90% | SDK + writeback coroutines |
| WorkoutEngine / interval plans in TrackingService | ~60% run feature | Plan JSON parsing + cue engine not yet ported |
| Strava / Spotify integration | ~100% | OAuth + API clients in decompile |
| MapLibre offline UI | ~90% | MapTabContent not ported |
| Room schema v42 full DAO surface | ~25% | sleep tables added; routes/gear/etc. still missing |
| Web dashboard Firestore binding | ~60% | `web/` shell only |

## Web parity (~25%)

Live site: https://exercise-tracker-2936d.web.app/ — 7-tab shell in `web/`; most pages not wired to Firestore.

## Next steps toward 100%

1. Add optional TFLite assets to `assets/` for staging v2 + YamNet event tags
2. Port `HealthConnectManager` sleep read/write + `SleepHealthFusion`
3. Port UI tab-by-tab from `android/decompiled-reference/com-example-rungps/rungps/ui/`
4. Port `WorkoutEngine` + interval plan parsing into TrackingService
5. Wire `web/` to Firestore paths matching Android sync

See also `docs/APK_PROJECT_PARITY.md`.
