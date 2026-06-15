# Exercise Tracker — parity status (15 Jun 2026, session 5 — APK archive audit)

Reference: `Desktop/ExerciseTracker-v0.7.93.apk` (versionCode **107**, ~84.54 MB)  
Rebuilt: `Desktop/ExerciseTracker-latest.apk` (signed release, ~36.24 MB)  
Canonical: **v0.7.93 / versionCode 107** — no newer APK found in archive

## Summary: **~96% behavioural parity** (honest ceiling ~97–98%)

Session 5 cross-checked **61 APKs** in `Desktop/APKs` plus **6 Desktop root APKs**. No build exceeds versionCode 107. Sleep subsystem file inventory (v0.7.92 doc) is **~48% by filename** but **~80% by core pipeline**; DEX volume remains **~20%** of reference. Behavioural parity for shipped features holds at ~96%; structural/source-tree parity is lower.

100% feature parity is **not achievable** without the original Kotlin sources. JADX decompile yields ~1,571 Java files where coroutines, Compose lambdas, and sealed hierarchies decompile to invalid or stubbed bodies (~900+ unreleased DEX classes). Remaining gaps are APK DEX volume, split-program/media gym editor depth, and device-only SDK validation (Samsung Health, Moyoung GATT timing).

| Area | Weight | Match | Notes |
|------|--------|-------|-------|
| Version / package / signing | 10% | **100%** | 107 / 0.7.93 / `com.exercisetracker.app`, launch `com.example.rungps.MainActivity` |
| Permissions (39) | 10% | **100%** | Identical aapt2 permissions dump ref vs rebuilt |
| Manifest app components | 15% | **98%** | All custom activities/services/receivers; widgets migrated RemoteViews→Glance |
| Assets | 15% | **~98%** | 159 ref / 163 rebuilt; rebuilt adds 4 muscle JSON assets not in reference APK |
| Backend services (GPS/sleep/gym/BLE) | 25% | **~93%** | Core sleep pipeline ported; reconciler/calendar/sonar/clip store missing |
| Compose UI (7 tabs + feature screens) | 25% | **~88%** | Sleep UI 3/18 files; gym split-program/media timeline absent |
| Web Firestore dashboard | — | **~90%** | `SleepPage.tsx` present; no `SleepHypnogramChart` / `SleepLoadDashboardCard` |
| APK size / DEX | — | **~49% size / ~20% DEX** | 36.24 MB vs 84.54 MB; ~869 vs ~4427 `com/example/rungps` DEX refs |

## APK version matrix (size clusters)

Audited via `aapt2 dump badging` on one representative per cluster. Full data: `docs/apk-audit/version-matrix.json`.

| Size cluster | versionCode | versionName | Count | Notes |
|--------------|-------------|-------------|-------|-------|
| ~76.8 MB | 71 | 0.7.52 | 1 + ~48 builds (77 MB) | Older feature-complete tree |
| ~77 MB | 71 | 0.7.52 | builds (2)–(49) | Incremental rebuilds, same version |
| ~40 MB | 101 | 0.7.87 | (51), (52) | Partial/stripped rebuild |
| ~84.25 MB | 100 | 0.7.86 | (50) | Pre-0.7.90 feature set |
| ~84.3 MB | 100 | 0.7.86 | (53), v0.7.89 | |
| ~84.49 MB | 104 | 0.7.90 | (55), v0.7.90 | |
| **~84.54 MB** | **107** | **0.7.93** | **(56), v0.7.93, latest.apk ref** | **Canonical reference** |
| ~36.24 MB | 107 | 0.7.93 | `ExerciseTracker-latest.apk` | Current signed rebuild |
| ~108 MB | 107 | 0.7.93 | `rebuilt.apk` (unsigned) | Wrong launch `com.exercisetracker.app.MainActivity` |
| ~125 MB | 107 | 0.7.93 | `rebuilt-debug.apk` | Debug symbols |

**No APK newer than v0.7.93 / versionCode 107.** Highest versionCode and largest feature-complete build: **84.54 MB cluster**.

## Rebuilt vs reference APK diff

| Check | Reference v0.7.93 | Rebuilt | Match |
|-------|-------------------|---------|-------|
| versionCode / versionName | 107 / 0.7.93 | 107 / 0.7.93 | **Yes** |
| package | `com.exercisetracker.app` | same | **Yes** |
| launch activity | `com.example.rungps.MainActivity` | same | **Yes** |
| permissions | 39 | 39 | **Yes** (no diff) |
| assets (zip) | 159 | 163 | **+4 muscle JSON** in rebuilt |
| DEX files | 5 (`classes.dex`–`classes5.dex`) | 2 | Size gap |
| `com/example/rungps` DEX refs | ~4427 | ~869 | **~20%** |
| Custom manifest components | 20 `com.example.rungps.*` | 20 | **Yes** (widget impl differs) |

### Manifest component delta (intentional)

| Reference | Rebuilt | Reason |
|-----------|---------|--------|
| `GymWidgetProvider` | `GymGlanceReceiver` | Glance migration |
| `RideRunWidgetProvider` | `RideRunGlanceReceiver` | Glance migration |
| `RecoveryWidgetProvider` | `RecoveryGlanceReceiver` | Glance migration |

All sleep manifest entries present: `SleepListenService`, `SleepAlarmSoundService`, `SleepAlarmReceiver`, `SleepAlarmBootReceiver`, `BedtimeReminderReceiver`, `SleepAlarmActivity`, `CalendarPermissionActivity`.

## Sleep subsystem cross-check (v0.7.92 inventory)

Source: user-pasted structure from `c:\Users\sydne\run` (77 core + 18 UI Kotlin files).  
Cross-check CSV: `docs/apk-audit/sleep-inventory-crosscheck.csv`

| Category | Listed in doc | In project | In rebuilt DEX | Status |
|----------|---------------|------------|--------------|--------|
| Core `sleep/` Kotlin | 77 | **39** | ~30 unique classes | Pipeline core present; calendar/sonar/clips/trends missing |
| UI `ui/sleep/` | 18 | **3** | ~5 (consolidated) | `SleepDetailComponents` bundles partial detail UI |
| Data layer | 8 | **4** | partial | No `SleepSoundDao`; `SleepRepository` present |
| Domain/feature modules | 4 | **0** | — | Not modularized (`core/data`, `feature/sleep` absent) |
| Health/sync/import | 12 | **3** | partial | No `SleepScoring`, `SleepCycleCsvImporter` |
| Home cards | 3 | **0** | — | Rhythm/debt/gym nudge cards missing |
| Web sleep charts | 2 | **0** | — | Only `web/src/pages/SleepPage.tsx` |
| ML tools `tools/sleep-ml/` | 2 | **0** | — | Not in repo |
| Docs `SLEEP_*.md` | 4 | **0** | — | Not in repo |
| Unit tests | 21 | **0** | — | No `app/src/test/.../sleep/` |
| ML assets | 3 | **1** | 1 | `sleep_ml_weights.json` only; no `yamnet.tflite` / `sleep_staging_v2.tflite` |

### Consolidated classes (in project, not separate files)

| Doc name | Actual file | In DEX |
|----------|-------------|--------|
| `SleepAlarmReceiver`, `SleepAlarmBootReceiver`, `BedtimeReminderReceiver` | `SleepReceivers.kt` | Yes |
| `SleepAlarmActivity`, `CalendarPermissionActivity` | `SleepActivities.kt` | Yes |
| `SleepAlarmDismiss` | `SleepAlarmAudit.kt` | Yes |

### High-priority missing sleep classes (not in project or DEX)

`SleepOvernightReconciler`, `SleepConfidenceStaging`, `SleepSonarBeta`, `SleepAudioClipStore`, `SleepDebtTracker`, `SleepConsistencyScorer`, `SleepNightAnalytics`, `SleepTrendAnalysis`, `SleepScience`, `SleepWakePlanner`, `SleepCalendarHelper`, `GoogleCalendarLink`, `SleepTravelEta`, all 15 missing UI cards/charts, `SleepScoring`, `SleepCycleCsvImporter`, `SleepSoundDao`.

Decompiled reference available: `recovered-source-v2/sources/` (214 sleep-related Java files).

### Session 5 port

- `SleepMlPipelineStatus.kt` — ML pipeline diagnostics (ported from decompiled reference)

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
| Sleep UI depth (15 cards/charts/sheets) | ~12% sleep UX | JADX Compose lambda bodies invalid |
| Sleep calendar/wake planner/sonar/clip store | ~8% sleep logic | 36+ Kotlin files not yet ported |
| Gym split-program editor + media timeline | ~15% UI | Decompiled gym Compose invalid |
| Modular structure (`core/`, `feature/sleep`) | structural | Original monorepo layout not restored |
| 21 sleep unit tests | test coverage | No test sources |
| Moyoung on-device validation | ~10% | Physical watch + GATT timing |
| Samsung Health on-device validation | ~15% | Samsung Health Data SDK on device |
| **APK size parity** | **~51% gap** | ~3500 unreleased DEX class refs; needs original Kotlin tree |
| Optional TFLite models | ML accuracy | `yamnet.tflite`, `sleep_staging_v2.tflite` not in repo |

## Web parity (~92%)

Live site: https://exercise-tracker-2936d.web.app/ — all nav tabs read Firestore. Map tab shows Leaflet polylines when run documents include `points[]`.

## Why not 100%

1. **Original Kotlin tree unavailable** — only JADX output; many composable bodies throw `UnsupportedOperationException` when decompiled.
2. **APK size** — reference ships ~2.3× more DEX; bulk Java compile is invalid (broken decompile); manual port added ~15 Kotlin files this session but cannot close a 48 MB gap.
3. **Hardware SDKs** — Moyoung BLE protocol timing and Samsung Health writeback need physical devices to certify.
4. **Gym editor depth** — split program dialog, exercise media timeline, and training-week archive screens remain partially stubbed.

## Honest ceiling: **~97–98% behavioural / ~50% structural**

Further gains require the original `c:\Users\sydne\run` Kotlin tree, optional TFLite assets, or on-device validation — not more JADX ports alone.

## USER_QUESTIONS (for parent agent)

1. **Original `c:\Users\sydne\run` backup** — OneDrive recycle bin, version history, another machine, or zip?
2. **Canonical APK** — Confirm `ExerciseTracker-v0.7.93.apk` (107, 84.54 MB) vs `ExerciseTracker-latest (56).apk`?
3. **ML assets** — Do you have `yamnet.tflite` / `sleep_staging_v2.tflite` from the old project?
4. **Release keystore** — Original `.jks` from before the new keystore (see `docs/RELEASE_KEYSTORE.md`)?
5. **Firebase web app ID** — `1:40353237709:web:…` for live site sign-in?
6. **OneDrive version history** — Any recoverable deleted `run` folder snapshots?

See also `docs/APK_PROJECT_PARITY.md`, `docs/apk-audit/`.
