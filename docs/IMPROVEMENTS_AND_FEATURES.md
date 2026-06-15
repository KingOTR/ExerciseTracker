# Exercise Tracker — improvements & new features

**Generated:** 15 Jun 2026 (phone ADB + parity doc cross-check)  
**Phone:** Samsung Galaxy S24 Ultra (`SM_S928B`, serial `R5CXB134KXV`) — **connected**  
**Installed original:** `com.exercisetracker.app` v**0.7.93** / versionCode **107** (RunGPS release signature)  
**Rebuilt artifact:** `ExerciseTracker-latest.apk` — same metadata, **36.24 MB** vs **84.54 MB** original (~**96% behavioural** parity per `docs/PARITY.md`)

---

## Phone analysis summary (ADB)

| Field | Value |
|-------|-------|
| ADB state | `device` (USB, authorized) |
| Package | `com.exercisetracker.app` |
| versionCode / versionName | 107 / 0.7.93 |
| Launch activity | `com.example.rungps.MainActivity` |
| firstInstallTime | 2026-06-11 18:00:15 |
| lastUpdateTime | 2026-06-12 12:22:16 |
| APK path (device) | `/data/app/~~WAMEpV2HbpxNLDvLYOs1-A==/com.exercisetracker.app-d2jVzU0EAjBbGL1anN6F-Q==/base.apk` |
| Pulled APK | `reference/phone-installed.apk` (84.54 MB, SHA-256 matches Desktop `ExerciseTracker-v0.7.93.apk`) |
| Signing | Original **RunGPS** keystore — **not** KingOTR rebuilt keystore |
| Shared prefs / `run-as` | **Blocked** (release, not debuggable) |
| External data | `/sdcard/Android/data/com.exercisetracker.app/files` exists |

### Deep links & NFC (original on device)

| Scheme / action | Purpose |
|-----------------|---------|
| `rungps://strava/oauth` | Strava OAuth callback |
| `rungps://gym` | Gym NFC / deep open |
| `exercisetracker://spotify-callback` | Spotify OAuth |
| `http://localhost/oauth`, `/spotify` | Dev OAuth fallbacks |
| `android.nfc.action.TAG_DISCOVERED` | Gym tag check-in |
| `android.nfc.action.NDEF_DISCOVERED` | `rungps://gym` NDEF |

### Runtime permissions granted (sample)

Location (fine/coarse), Bluetooth (connect/scan), Health Connect (read/write steps, sleep, exercise, distance, heart rate), POST_NOTIFICATIONS, NFC, READ_CALENDAR, RECORD_AUDIO, ACTIVITY_RECOGNITION, exact alarms, battery optimization exemption, foreground-service variants (location, microphone, media, special-use).

### Original app feature inventory (7 bottom tabs)

| Tab | Original capabilities (on phone) |
|-----|-----------------------------------|
| **Home** | GPS run start/stop, live MapLibre trail, BLE watch scan, HR zones, steps, route follow |
| **Map** | Offline region download, OSRM route planner, browse vs record modes |
| **History** | Run list, splits, details, Strava PB import, overlay photo export/upload |
| **Gym** | Split programs, train mode, set logging, NFC tap, pulley math, muscle volume, cloud sync |
| **Recovery** | Multi-source load (runs, gym, soccer, ambient steps), muscle atlas |
| **Sleep** | Overnight mic+accel tracking, smart alarm, hypnogram, trends, debt, calendar wake planner, sonar beta, Spotify wind-down |
| **Soccer** | Match/training log, Moyoung watch sync |

**Beyond tabs:** 3 home-screen widgets (Gym, Ride/Run, Recovery), Firebase auth + Firestore sync, web dashboard, Samsung Health + Health Connect writeback, Moyoung BLE protocol, MediaSession/Spotify listener, sleep alarm full-screen activity, bedtime reminders.

### Side-by-side install note

Rebuilt and original share `com.exercisetracker.app` but **different signing certificates** (RunGPS vs KingOTR). Android will **not** install rebuilt over original without **uninstall** or a **work profile** / second user. Smoke-test rebuilt via uninstall → install `ExerciseTracker-latest.apk`, or keep original on primary profile and test rebuilt on work profile.

---

## A. Parity fixes (must-have to match original)

Prioritized by user-visible impact and dependency order.

### P0 — User would notice immediately

1. **Sleep detail UI (15 missing cards/charts)** — Original has hypnogram, disturbance timeline, snore/breathing cards, trend charts, night detail sheet, live overnight chart. Rebuilt consolidates into 3 UI files (`SleepTabScreen`, `SleepTabComponents`, `SleepDetailComponents`). Port: `SleepHypnogramDisplay`, `SleepDisturbanceTimeline`, `SleepSnoreMetricsCard`, `SleepBreathingDisruptionsCard`, `SleepTrendCard`, `SleepNightDetailSheet`, `SleepOvernightLiveChart`.
2. **Gym split-program editor + media timeline** — Original program builder, exercise video/GIF timeline, and training-week archive screens are stubbed or absent in rebuilt `GymTabContent` / `GymScreen`. ~15% of gym UX gap.
3. **Onboarding flow** — Original first-launch tour + permission batch (`docs/ExerciseTracker-FRIEND_GUIDE.md`). Rebuilt has **no onboarding** composable; users must discover permissions manually.
4. **Sleep home cards on Run tab** — `SleepRhythmHomeCard`, `SleepDebtHomeCard`, `SleepGymNudgeCard` missing; original surfaces sleep/recovery hints on Home.

### P1 — Core sleep logic gaps

5. **`SleepOvernightReconciler`** — Merges partial nights, fixes clock drift; not in project or DEX.
6. **`SleepDebtTracker` + `SleepConsistencyScorer`** — Debt hours field exists on entity but tracker logic missing.
7. **`SleepCalendarHelper` / `GoogleCalendarLink` / `SleepWakePlanner`** — Calendar-aware smart wake and travel ETA; READ_CALENDAR already granted on device.
8. **`SleepAudioClipStore` + clip player** — Snore/event audio review; high-value differentiator vs Health Connect-only apps.
9. **`SleepSonarBeta` / `SleepSonarProbe`** — Experimental ranging-based sleep detection.
10. **TFLite model assets** — Classifiers reference `yamnet.tflite` and `sleep_staging_v2.tflite`; only `sleep_ml_weights.json` in repo. Without models, staging accuracy diverges from original.

### P2 — Integrations & polish

11. **Samsung Health on-device validation** — Code present (`SamsungHealthManager.kt`); needs S24 Ultra + Samsung Health app certification.
12. **Moyoung BLE timing** — Parser/sync ported; GATT handshake timing unverified on physical watch.
13. **Sleep alarm Spotify wind-down** — `SleepAlarmSpotify`, `SleepSpotifyPicker`, `WindDownAutomation` missing.
14. **Web sleep charts** — `SleepHypnogramChart`, `SleepLoadDashboardCard` absent from `web/src/pages/SleepPage.tsx` (list-only today).
15. **Widget parity (~85%)** — Original `GymWidgetProvider` / `RideRunWidgetProvider` / `RecoveryWidgetProvider` (RemoteViews); rebuilt uses Glance — verify pin/update cadence and tap actions match.

### P3 — Structural parity (lower user visibility)

16. **`SleepSoundDao` + `SleepCycleCsvImporter`** — Data import/export paths.
17. **`SleepScoring` / `SleepNightAnalytics` / `SleepTrendAnalysis` / `SleepScience`** — Scoring and science copy behind original UI.
18. **21 sleep unit tests** — Original had `app/src/test/.../sleep/`; rebuilt has **zero** Kotlin tests.
19. **Modular monorepo layout** — `core/`, `data/`, `feature/sleep` modules from `c:\Users\sydne\run` not restored.

---

## B. UX improvements (better than original)

Modern Compose and product polish that the original (JADX-recovered, monolithic) did not prioritize.

1. **Material 3 expressive theming** — Dynamic color, tonal elevation, motion tokens; original used earlier M3 patterns with inconsistent density.
2. **Unified permission rationale sheets** — Replace multi-step onboarding with contextual permission requests at point of use (map → location, sleep → mic, gym → NFC).
3. **Accessibility** — Content descriptions on all `NavigationBarItem`s, talk-back labels for hypnogram/chart gestures, large-text and high-contrast modes.
4. **Performance** — Rebuilt APK is **2.3× smaller** (36 vs 84 MB); lean further with baseline profiles, R8 full-mode, and lazy tab loading to improve cold start on S24-class devices.
5. **Recording HUD** — MapLibre full-screen recording overlay (session 4 port) is already cleaner; extend with configurable data fields and haptic lap markers.
6. **Error surfaces** — Snackbar + retry for Strava/Firestore/BLE failures instead of silent `Toast` patterns in legacy code.
7. **Glance widget previews** — Android 12+ widget preview metadata for Gym/Run/Recovery widgets.
8. **Web responsive layout** — Dashboard currently desktop-oriented; add mobile breakpoints and PWA manifest for quick phone browser access.
9. **Empty states** — Illustrated empty states per tab (no runs, no sleep nights, no gym session) with single primary CTA.
10. **Haptic feedback** — NFC success, lap button, alarm dismiss — lightweight `HapticFeedback` on key actions.

---

## C. New features (beyond original)

Ideas that fit the app’s multi-sport + recovery + sleep positioning without scope creep into StingBoard.

### Training & coaching

1. **AI coaching summaries** — Weekly natural-language recap from runs/gym/sleep/recovery (Firebase Vertex / on-device Gemini Nano when available).
2. **Adaptive gym suggestions** — “Deload recommended” from `RecoveryLoadEngine` + sleep debt signals.
3. **Route recommendations** — Suggest loops from historical pace and current recovery score.

### Social & export

4. **Selective cloud sharing** — Share run or gym week to a friend via Firestore rules + link (original is single-user).
5. **GPX/FIT/TCX export** — Universal run export beyond Strava upload.
6. **PDF training log** — Monthly gym + run summary for coaches.

### Wearables & platform

7. **Wear OS complication + tile** — Quick start run, recovery %, sleep score on watch face.
8. **Health Connect writeback dashboard** — Show sync status per data type with manual reconcile.
9. **Podcast / audiobook wind-down** — Extend Spotify integration to Pocket Casts / Android media session for sleep routine (original had Spotify-only).

### Data & reliability

10. **Cloud backup UI** — Explicit “backup now / restore” in settings; original sync is implicit via Firebase sign-in.
11. **Offline-first conflict resolution** — Visible merge UI when gym session edited on two devices.
12. **Diagnostics export** — One-tap anonymized bundle (like `reference/diagnostics-*_extracted/`) for support.

### Web parity expansion

13. **Web route editor** — Draw routes in browser; push to phone for follow mode.
14. **Web sleep hypnogram** — Match mobile detail once chart components exist.
15. **Family dashboard** — Multi-user read-only view (parents/coaches) with consent.

---

## D. Technical improvements

| Area | Current state | Recommendation |
|------|---------------|--------------|
| **Testing** | 0 unit tests | Port 21 sleep tests first; add `TrackingService` GPS math tests, `RecoveryLoadEngine` golden files, Strava OAuth mockWebServer |
| **CI** | Manual `assembleRelease` | GitHub Actions: lint, unit tests, release APK artifact, `aapt2` parity script vs `reference/phone-installed.apk` |
| **Modularization** | Single `:app` module | Restore `core/domain`, `core/data`, `feature/sleep`, `feature/gym` — enables parallel compiles and feature flags |
| **DEX / size** | ~20% of reference DEX refs | Accept ceiling without original Kotlin tree; avoid bulk JADX compile (invalid bodies) |
| **Firebase Analytics** | Config present | Add structured events: `run_completed`, `sleep_night_finished`, `gym_session_saved`, `strava_upload` |
| **Crashlytics** | Likely wired via Firebase | Symbolicate release builds; tag `versionCode` + `isRebuiltPort` |
| **Secrets** | Strava keys in settings | Encrypted `DataStore` + remote config for client IDs |
| **Room migrations** | v42 schema | Migration tests + schema export JSON in CI |
| **Sleep ML pipeline** | Weights only | Bundle TFLite in `assets/` or download-on-first-use with checksum |
| **Documentation** | Strong parity docs | Keep `PARITY.md` + this file updated per session; auto-generate component diff from `docs/apk-audit/` |

### Recover original sources (highest leverage)

The honest ceiling is **~97–98% behavioural** without `c:\Users\sydne\run` Kotlin sources. Check OneDrive version history, recycle bin, other machines, or zip backups — one recoverable tree closes more gap than incremental JADX ports.

---

## E. Quick wins vs long-term roadmap

| Effort | Impact | Description |
|--------|--------|-------------|
| **S** | High | Add onboarding composable mirroring FRIEND_GUIDE permission checklist |
| **S** | High | Wire `SleepHypnogramDisplay` from decompiled reference into `SleepDetailComponents` |
| **S** | Medium | Web `SleepPage` — duration/efficiency bar chart (no hypnogram yet) |
| **S** | Medium | Firebase Analytics events for core user actions |
| **S** | Low | Widget tap → `open_tab` intent extras (verify Glance receivers) |
| **M** | High | Port `SleepDebtTracker` + home card on Run tab |
| **M** | High | Gym split-program editor (minimum viable: create/rename/reorder days) |
| **M** | High | 10–15 critical sleep unit tests (staging, alarm scheduler, finisher) |
| **M** | Medium | GPX export from `RunRepository` |
| **M** | Medium | GitHub Actions CI with `assembleRelease` + badging check |
| **M** | Medium | Samsung Health + Moyoung on-device test matrix (S24 Ultra) |
| **L** | High | Full sleep UI parity (15 cards, calendar, sonar, clips) |
| **L** | High | Gym media timeline + training-week archive |
| **L** | Medium | Modular `feature/sleep` + `core/domain` restore |
| **L** | Medium | Wear OS complication |
| **L** | Medium | AI weekly coaching summary |
| **L** | Low | APK size parity (~84 MB) — only if original Kotlin tree recovered |
| **L** | High | Recover `c:\Users\sydne\run` source tree — unlocks 80%+ of remaining gaps |

---

## Testing rebuilt without uninstalling original

| Method | Notes |
|--------|-------|
| **Uninstall original → install rebuilt** | Simplest; backup via Firebase sign-in or diagnostics export first |
| **Android work profile** | Install rebuilt in work profile; keep original on personal profile |
| **Secondary user / guest** | Samsung supports multiple users; same package allowed per user |
| **Logcat smoke test** | If rebuilt already on another profile: `adb logcat -s ExerciseTracker MainActivity TrackingService SleepListenService` |
| **Cannot side-by-side same profile** | Same `applicationId` + different signature = package conflict |

---

## References

- `docs/PARITY.md` — ~96% behavioural parity breakdown
- `docs/PHONE_ANALYSIS.md` — prior phone pull (identical to this session)
- `docs/APK_PROJECT_PARITY.md` — manifest/assets/metadata
- `docs/apk-audit/sleep-inventory-crosscheck.csv` — 48% filename / ~80% pipeline
- `docs/apk-audit/sleep-missing.txt` — 71 missing sleep classes
- `reference/phone-installed.apk` — device pull (gitignored)
- Live web: https://exercise-tracker-2936d.web.app/

---

## Top 10 parity improvements (summary)

1. Sleep detail UI — hypnogram, trends, disturbance timeline  
2. Gym split-program editor + media timeline  
3. First-launch onboarding + permission flow  
4. Sleep debt / rhythm home cards on Run tab  
5. `SleepOvernightReconciler` + scoring analytics  
6. Calendar-linked wake planner (`SleepWakePlanner`)  
7. TFLite models (`yamnet`, `sleep_staging_v2`) in assets  
8. Sleep audio clip store + playback  
9. Web hypnogram + sleep load dashboard  
10. On-device Samsung Health + Moyoung validation on S24 Ultra  

## Top 10 new features (summary)

1. AI weekly coaching summary  
2. GPX/FIT export  
3. Cloud backup / restore UI  
4. Wear OS complication + quick-start tile  
5. Adaptive gym deload suggestions from recovery + sleep  
6. Web route editor synced to phone  
7. Selective run/gym sharing link  
8. Podcast/audiobook wind-down (beyond Spotify)  
9. One-tap anonymized diagnostics export  
10. Family / coach read-only dashboard  
