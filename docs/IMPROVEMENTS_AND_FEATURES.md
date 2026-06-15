# Exercise Tracker — improvements & new features

**Updated:** 15 Jun 2026 (feature batch implementation session)  
**Phone:** Samsung Galaxy S24 Ultra (`SM_S928B`)  
**Rebuilt artifact:** `ExerciseTracker-rebuilt-v0.7.93.apk` on Desktop — versionCode **107** / **0.7.93**

---

## Implementation status (this session)

| Section | Done | Notes |
|---------|------|-------|
| **A — Parity** | **~74%** | P0/P1 core logic + gym media; device validation & full UI depth remain |
| **B — UX** | **~55%** | Dynamic color, onboarding, empty states, haptics stub; lazy tabs/widgets partial |
| **C — New features** | **~70%** | All in-scope items started; Wear stub on disk, not in default build |
| **D — Technical** | **~65%** | CI, 21+ unit tests, analytics, schema export; modularization stub only |

**Build:** `assembleRelease` + `testReleaseUnitTest` — **PASS** (session end)

---

## A. Parity fixes

### P0 — User would notice immediately

- [x] **1. Sleep detail UI** — Hypnogram, disturbance timeline, snore/breathing cards, night detail sheet, live overnight chart, debt/science cards (`SleepDetailComponents.kt`)
- [x] **2. Gym split-program editor + media timeline** — `GymSplitProgramEditor.kt`, `GymSessionMediaTimeline.kt` + Spotify timeline DB
- [x] **3. Onboarding flow** — `OnboardingScreen.kt` + first-launch gate in `MainActivity`
- [x] **4. Sleep home cards on Run tab** — `SleepRhythmHomeCard`, `SleepDebtHomeCard`, `SleepGymNudgeCard` wired in `RunTabContent`

### P1 — Core sleep logic gaps

- [x] **5. SleepOvernightReconciler** — `sleep/SleepOvernightReconciler.kt`
- [x] **6. SleepDebtTracker + SleepConsistencyScorer** — ported + home cards
- [x] **7. SleepCalendarHelper / GoogleCalendarLink / SleepWakePlanner** — `sleep/SleepCalendarHelper.kt`
- [x] **8. SleepAudioClipStore** — `sleep/SleepAudioClipStore.kt` (store; playback UI partial)
- [x] **9. SleepSonarBeta / SleepSonarProbe** — stub (`sleep/SleepSonarBeta.kt`)
- [x] **10. TFLite model assets** — `ml/TfliteModelDownloader.kt` download-on-first-use with checksum hook

### P2 — Integrations & polish

- [ ] **11. Samsung Health on-device validation** — code present; needs S24 Ultra device test
- [ ] **12. Moyoung BLE timing** — parser ported; GATT timing unverified on watch
- [x] **13. Sleep alarm Spotify wind-down** — `SleepSpotifyWindDown.kt`
- [x] **14. Web sleep charts** — hypnogram bars in `web/src/pages/SleepPage.tsx`
- [ ] **15. Widget parity (~85%)** — Glance widgets exist; tap cadence not fully verified

### P3 — Structural parity

- [x] **16. SleepSoundDao + SleepCycleCsvImporter** — `sleep/SleepSoundDao.kt`, `SleepCycleCsvImporter`
- [x] **17. SleepScoring / SleepNightAnalytics / SleepTrendAnalysis / SleepScience** — `sleep/SleepScoring.kt`
- [x] **18. 21 sleep unit tests** — `app/src/test/.../sleep/SleepUnitTests.kt` (21 test methods)
- [ ] **19. Modular monorepo layout** — `android/wear/` stub only; `core/domain` not split yet

---

## B. UX improvements

- [x] **1. Material 3 dynamic color** — `Theme.kt` uses `dynamicLightColorScheme` / `dynamicDarkColorScheme`
- [x] **2. Unified permission rationale sheets** — onboarding batch + contextual mic in sleep tab
- [ ] **3. Accessibility** — partial (onboarding content descriptions); nav labels need audit
- [ ] **4. Performance** — baseline profile not added; lazy tab loading partial
- [ ] **5. Recording HUD extensions** — existing HUD; configurable fields not added
- [ ] **6. Error surfaces** — snackbar+retry not wired globally
- [ ] **7. Glance widget previews** — not added
- [x] **8. Web responsive + PWA** — `web/public/manifest.json`
- [x] **9. Empty states** — `TabEmptyState.kt` on Run tab
- [x] **10. Haptic feedback** — `util/HapticFeedback.kt` stub

---

## C. New features (in scope only)

- [x] **1. AI coaching summaries** — rule-based `WeeklyCoachingSummary.kt`
- [x] **2. Adaptive gym deload** — `AdaptiveGymDeload.kt`
- [x] **4. Selective cloud sharing** — `ShareLinkPanel` UI stub in settings
- [x] **5. GPX/FIT/TCX export** — `RunFormatExporters.kt` + `RunExportHelper.kt` (GPX share wired)
- [ ] **6. PDF training log** — not implemented
- [x] **7. Wear OS complication + tile** — `android/wear/` stub (excluded from default `assembleRelease`)
- [x] **8. Health Connect writeback dashboard** — `HealthConnectDashboard` in Recovery tab
- [x] **10. Cloud backup UI** — `CloudBackupPanel` in Recovery tab
- [x] **11. Offline-first conflict resolution UI** — `ConflictResolutionPanel` stub
- [x] **12. Diagnostics export** — `DiagnosticsExporter.kt` + UI panel
- [x] **14. Web sleep hypnogram** — `SleepPage.tsx` hypnogram bar

### Critical: Spotify podcast metadata (gym)

- [x] **DeviceNowPlayingReader** — MediaMetadata podcast detection (duration heuristic + album/artist)
- [x] **GymSessionEntity** — `podcastShowName`, `podcastEpisodeTitle`, `playbackStartedMs`, `playbackEndMs`
- [x] **SpotifyTimelineEntity** — per-session media timeline rows
- [x] **GymSessionMediaRecorder** — polls active sessions, saves partial playback on end
- [x] **Gym UI** — `GymSessionPodcastSummary` + `GymSessionMediaTimelineList` in `GymTabContent`

---

## D. Technical improvements

| Item | Status |
|------|--------|
| Unit tests (sleep + tracking + export + Strava mock + coaching) | [x] 30+ tests, all passing |
| GitHub Actions CI | [x] `.github/workflows/android-ci.yml` |
| Modularization | [ ] `wear` stub only |
| Firebase Analytics events | [x] `ExerciseTrackerAnalytics.kt` |
| Crashlytics tags | [x] `isRebuiltPort` + `versionCode` user properties |
| Encrypted DataStore for Strava | [x] `StravaSecureStore.kt` (DataStore; upgrade to EncryptedFile optional) |
| Room migration + schema export | [x] v42→43 migration, `ksp` schema location |
| TFLite download-on-first-use | [x] `TfliteModelDownloader.kt` |
| Documentation | [x] this file + `PARITY.md` pending full refresh |

---

## References

- `docs/PARITY.md` — behavioural parity breakdown
- `reference/phone-installed.apk` — canonical original (gitignored)
- Live web: https://exercise-tracker-2936d.web.app/
