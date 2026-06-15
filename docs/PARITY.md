# Exercise Tracker — parity status (15 Jun 2026)

Reference: `Desktop/ExerciseTracker-v0.7.93.apk` (versionCode **107**, ~84.5 MB)  
Rebuilt: `Desktop/ExerciseTracker-latest.apk` (signed release, ~34.4 MB)

## Summary: **~55% overall parity**

100% feature parity is **not achievable** from JADX decompile alone (~1,571 Java files; Kotlin coroutines/Compose lambdas decompile to invalid Java). Original Kotlin tree is unavailable. Maximum recoverable without source: manifest + assets + backend stubs + incremental manual Kotlin ports.

| Area | Weight | Match | Notes |
|------|--------|-------|-------|
| Version / package / signing | 10% | **100%** | 107 / 0.7.93 / `com.exercisetracker.app`, release keystore |
| Permissions (38) | 10% | **100%** | All declared; runtime behaviour partial |
| Manifest app components | 15% | **95%** | All custom `com.example.rungps.*` activities/services/receivers/widgets declared |
| Assets | 15% | **75%** | Core JSON (sleep ML, muscle atlas, maps) present; duplicate map assets deduped vs AAR |
| Backend services (GPS/sleep/gym/BLE) | 25% | **~45%** | **TrackingService** GPS/run pipeline ported (foreground, Room points/splits, pause/lap/hazard, Firestore push); SleepListenService still stub |
| Compose UI (7 tabs + feature screens) | 25% | **20%** | Shell + Gym/Recovery partial; ~400+ UI `.kt` files still in `decompiled-reference/` |
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
| `./gradlew assembleRelease` | **SUCCESS** (15 Jun 2026) |
| Signed APK | `%LOCALAPPDATA%\ExerciseTracker-build\app\outputs\apk\release\app-release.apk` |
| Desktop copy | `OneDrive/Desktop/ExerciseTracker-latest.apk` |
| Launch activity | `com.example.rungps.MainActivity` |
| aapt2 badging | `versionCode=107`, `versionName=0.7.93`, launch `com.example.rungps.MainActivity` |

## Session milestone: TrackingService + run pipeline

Ported manually from `decompiled-reference/` (not bulk Java compile):

- `TrackingService.kt` — GPS fused location, foreground notification, wake lock, auto/manual pause, km splits, lap/hazard markers, TTS/beep/vibrate cues, crash recovery via `TrackingActiveStore`
- `TrackingState` / `TrackingUiState` / `TrackingActiveStore` — live UI state + prefs recovery
- `Repository` + `RunRepository` — `startRun`, `insertPoint`, `insertRunSplit`, `finishRun`, HR samples
- Room v3 — `run_points`, `run_hr_samples`, expanded `runs` / `km_splits` schema
- `RecordingHrBridge`, `RunVoiceAnnouncer`, `RideRunWidgetUpdater` (refresh hook)

## Remaining gaps (line-item)

| Gap | Est. % missing | Blocker |
|-----|----------------|---------|
| Full Compose UI from decompile | ~80% UI | JADX Compose output invalid; needs manual Kotlin port |
| WorkoutEngine / interval plans in TrackingService | ~60% run feature | Plan JSON parsing + cue engine not yet ported |
| SleepListenService + ML pipeline | ~100% feature | 77+ sleep files, TFLite staging |
| Health Connect / Samsung Health | ~90% | SDK + writeback coroutines |
| Strava / Spotify integration | ~100% | OAuth + API clients in decompile |
| MapLibre offline UI | ~90% | MapTabContent not ported |
| Room schema v42 full DAO surface | ~35% | v3 run schema added; sleep_entries etc. still missing |
| Web dashboard Firestore binding | ~60% | `web/` shell only |

## Web parity (~25%)

Live site: https://exercise-tracker-2936d.web.app/ — 7-tab shell in `web/`; most pages not wired to Firestore.

## Next steps toward 100%

1. Port `SleepListenService.kt` + sleep Room tables (`sleep_entries`, `sleep_sound_events`)
2. Port UI tab-by-tab from `android/decompiled-reference/com-example-rungps/rungps/ui/`
3. Port `WorkoutEngine` + interval plan parsing into TrackingService
4. Re-add non-conflicting reference assets (symbols/patterns) with packaging `pickFirsts`
5. Wire `web/` to Firestore paths matching Android sync

See also `docs/APK_PROJECT_PARITY.md`.
