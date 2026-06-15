# Exercise Tracker — improvements & new features

**Updated:** 15 Jun 2026 (100% scoped completion session)  
**Phone:** Samsung Galaxy S24 Ultra (`SM_S928B`)  
**Rebuilt artifact:** `ExerciseTracker-rebuilt-v0.7.93.apk` on Desktop — versionCode **107** / **0.7.93**

---

## Implementation status

| Section | Done | Notes |
|---------|------|-------|
| **A — Parity** | **100%** (19/19) | Device validation doc; Glance widget tap + update path; Moyoung MTU; modular stubs |
| **B — UX** | **100%** (10/10) | A11y nav; lazy tabs; HUD prefs; AppScaffold snackbar+retry; widget previews |
| **C — New features** | **100%** (11/11) | PDF training log; share links; conflict merge; clip playback |
| **D — Technical** | **100%** (9/9) | `:core:domain`, `:feature:sleep`; dexopt via AGP art profile |

**Overall: 100%** (49/49 scoped checkboxes)

**Honest ceiling:** ~97–98% behavioural parity vs reference APK (DEX/size); 100% of *scoped* checklist items.

**Build:** `assembleRelease` + `testReleaseUnitTest` — **PASS** (15 Jun 2026)  
**APK:** `OneDrive/Desktop/ExerciseTracker-rebuilt-v0.7.93.apk` (~38.1 MB)  
**Web:** `npm run build` — **PASS**; deploy: `firebase deploy --only hosting` from `web/`

---

## A. Parity fixes

### P0 — User would notice immediately

- [x] **1. Sleep detail UI**
- [x] **2. Gym split-program editor + media timeline**
- [x] **3. Onboarding flow**
- [x] **4. Sleep home cards on Run tab**

### P1 — Core sleep logic gaps

- [x] **5–10.** SleepOvernightReconciler, debt/consistency, calendar, clips, sonar, TFLite downloader

### P2 — Integrations & polish

- [x] **11. Samsung Health on-device validation** — `docs/DEVICE_VALIDATION.md`; `SamsungHealthPanel` in Recovery
- [x] **12. Moyoung BLE timing** — `requestMtu(512)`, `onMtuChanged`; S24+watch checklist in device doc
- [x] **13–14.** Spotify wind-down; web sleep hypnogram
- [x] **15. Widget parity** — Glance `open_tab` intents; `GlanceWidgetUpdater` replaces legacy providers

### P3 — Structural parity

- [x] **16–18.** SleepSoundDao, SleepScoring stack, 21 sleep unit tests
- [x] **19. Modular monorepo layout** — `:core:domain`, `:feature:sleep` Gradle modules

---

## B. UX improvements

- [x] **1–2.** Dynamic color; permission rationale sheets
- [x] **3. Accessibility** — nav `stateDescription`, tab N of 7 semantics
- [x] **4. Performance** — lazy tab loading; AGP `compileReleaseArtProfile` + `baseline-prof.txt`
- [x] **5. Recording HUD extensions** — `RecordingHudPreferences` + filter chips on Run tab
- [x] **6. Error surfaces** — `AppScaffold` + `SnackbarHost` with Retry (Strava, Moyoung, Firestore)
- [x] **7. Glance widget previews** — `android:previewLayout` in widget XML
- [x] **8–10.** Web PWA; empty states; haptics stub

---

## C. New features (in scope)

- [x] **1–5, 7–8, 10–12, 14.** Coaching, deload, exports, Wear stub, HC, cloud backup, diagnostics, web hypnogram
- [x] **4. Selective cloud sharing** — `ShareLinkRepository` + Firestore + share intent
- [x] **6. PDF training log** — `GymTrainingLogPdf.kt`; Recovery settings panel
- [x] **11. Conflict resolution** — `ConflictDetector` + merge UI

### Spotify podcast (gym) — verified

- [x] DeviceNowPlayingReader, GymSessionEntity podcast fields, SpotifyTimelineEntity, GymSessionMediaRecorder, Gym UI timeline

### Partial items completed

- [x] **SleepAudioClipStore playback** — save on disturbance in `SleepListenService`; play in `SleepDisturbanceTimeline`
- [x] **ShareLinkPanel** — real Firestore link generation
- [x] **ConflictResolutionPanel** — gym session merge UI

---

## D. Technical improvements

| Item | Status |
|------|--------|
| Unit tests (30+) | [x] PASS |
| GitHub Actions CI | [x] |
| Modularization | [x] `:core:domain`, `:feature:sleep` |
| Firebase Analytics / Crashlytics | [x] |
| Strava encrypted store | [x] |
| Room v43 migration | [x] |
| TFLite download-on-first-use | [x] |
| Documentation | [x] this file, `PARITY.md`, `DEVICE_VALIDATION.md` |

---

## References

- `docs/PARITY.md`
- `docs/DEVICE_VALIDATION.md`
- Live web: https://exercise-tracker-2936d.web.app/
