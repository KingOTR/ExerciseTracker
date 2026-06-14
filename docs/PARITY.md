# Exercise Tracker — parity status (14 Jun 2026)

Reference: `Desktop/ExerciseTracker-v0.7.93.apk` (versionCode **107**, ~84.5 MB)  
Rebuilt: `Desktop/ExerciseTracker-latest.apk` (signed release, ~34.4 MB)

## Summary: **~48% overall parity**

100% feature parity is **not achievable** from JADX decompile alone (~1,571 Java files; Kotlin coroutines/Compose lambdas decompile to invalid Java). Original Kotlin tree (`c:\Users\sydne\run`) is unavailable. Maximum recoverable without source: manifest + assets + backend stubs + 7-tab shell.

| Area | Weight | Match | Notes |
|------|--------|-------|-------|
| Version / package / signing | 10% | **100%** | 107 / 0.7.93 / `com.exercisetracker.app`, release keystore |
| Permissions (38) | 10% | **100%** | All declared; runtime behaviour partial |
| Manifest app components | 15% | **95%** | All custom `com.example.rungps.*` activities/services/receivers/widgets declared; implementations are stubs |
| Assets | 15% | **75%** | Core JSON (sleep ML, muscle atlas, maps) present; duplicate map assets deduped vs AAR |
| Backend services (GPS/sleep/gym/BLE) | 25% | **25%** | Foreground services compile & register; no full TrackingService / SleepListenService logic |
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
| `./gradlew assembleRelease` | **SUCCESS** |
| Signed APK | `%LOCALAPPDATA%\ExerciseTracker-build\app\outputs\apk\release\app-release.apk` |
| Desktop copy | `Desktop/ExerciseTracker-latest.apk` |
| Launch activity | `com.example.rungps.MainActivity` |

## Remaining gaps (line-item)

| Gap | Est. % missing | Blocker |
|-----|----------------|---------|
| Full Compose UI from decompile | ~80% UI | JADX Compose output invalid; needs manual Kotlin port |
| TrackingService GPS/run logic | ~100% feature | ~1,250 lines + dependencies |
| SleepListenService + ML pipeline | ~100% feature | 77+ sleep files, TFLite staging |
| Health Connect / Samsung Health | ~90% | SDK + writeback coroutines |
| Strava / Spotify integration | ~100% | OAuth + API clients in decompile |
| MapLibre offline UI | ~90% | MapTabContent not ported |
| Room schema v42 full DAO surface | ~40% | Scaffold DB smaller than `AppDb` |
| Web dashboard Firestore binding | ~60% | `web/` shell only |

## Web parity (~25%)

Live site: https://exercise-tracker-2936d.web.app/ — 7-tab shell in `web/`; most pages not wired to Firestore.

## Next steps toward 100%

1. Recover original Kotlin from backup/Play bundle if available
2. Port UI tab-by-tab from `android/decompiled-reference/com-example-rungps/rungps/ui/` → new `.kt` (not bulk Java compile)
3. Port `TrackingService.kt` then `SleepListenService.kt` from decompiled reference
4. Re-add non-conflicting reference assets (symbols/patterns) with packaging `pickFirsts`
5. Wire `web/` to Firestore paths matching Android sync

See also `docs/APK_PROJECT_PARITY.md`.
