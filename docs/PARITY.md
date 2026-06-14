# Exercise Tracker — parity status (14 Jun 2026)

Reference targets:

| Target | Path / URL | versionName | versionCode | Size |
|--------|------------|-------------|-------------|------|
| **Canonical release** | `Desktop/ExerciseTracker-v0.7.93.apk` | 0.7.93 | 107 | ~84.5 MB |
| APKs folder copy | `Desktop/APKs/ExerciseTracker-latest.apk` | 0.7.52 | 71 | ~76.8 MB (older build) |
| Live web | https://exercise-tracker-2936d.web.app/ | 0.7.93 (package.json) | — | Firebase Hosting |

## Android APK parity

| Check | Reference (v0.7.93) | Rebuilt scaffold | Match |
|-------|---------------------|------------------|-------|
| Package | `com.exercisetracker.app` | `com.exercisetracker.app` | Yes |
| versionName | `0.7.93` | `0.7.93` | Yes |
| versionCode | `107` | `107` | Yes |
| minSdk | 29 | 29 | Yes |
| targetSdk | 35 | 35 | Yes |
| Permissions (declared) | 38 | 38 (manifest) | Declared yes / runtime no |
| Activities | 4+ | 1 (`MainActivity`) | No |
| Services | 6+ | 0 | No |
| Receivers / widgets | 12+ | 0 | No |
| APK size (release) | ~84.5 MB | TBD (scaffold + libs) | No |
| Release signing | Original keystore | Unsigned | No |
| Feature parity | Full app | ~15% (tabs + sync + muscle) | No |

### Ported (Kotlin scaffold)

- 7-tab Compose shell (Home, Map, History, Gym, Recovery, Sleep, Soccer)
- Room DB (gym, runs, splits, soccer, sleep, muscle overrides)
- Firestore sync layer (`CloudSyncManager`, per-domain sync)
- Muscle load engine (`shared/muscles/` → assets + domain)
- Firebase Auth + Firestore (google-services.json with OAuth client)

### Not yet ported (from `android/decompiled-reference/`)

Full decompiled tree (~1,571 Java files) is preserved under `android/decompiled-reference/` (gitignored). JADX output does not compile cleanly; port incrementally to Kotlin.

| Area | Reference components | Status |
|------|---------------------|--------|
| GPS tracking | `TrackingService`, run recording UI | Not ported |
| MapLibre offline | `MapTabContentKt`, map tiles | Dependency only |
| Gym train flow | NFC, session media, full `GymTabContentKt` | Partial (GymScreen) |
| Sleep ML | `SleepListenService`, TFLite staging | Not ported |
| Health Connect | `HealthConnectManager` | Not ported |
| BLE watch | Moyoung parsers, sync | Not ported |
| Strava OAuth | Activities API, upload | Not ported |
| Spotify | Mini player, timeline | Not ported |
| Widgets | Recovery, Gym, Run widgets | Not ported |
| Foreground services | 6 services in full manifest | Not ported |

### Blockers for exact APK match

1. **Release keystore** (`.jks`) — required for in-place upgrade over Play/distributed builds
2. **~1,500 decompiled UI/logic files** — need manual Kotlin port, not bulk compile
3. **Native libs / R8 tuning** — reference uses optimized packaging (`extractNativeLibs=false`)
4. **Signing** — rebuilt APK is unsigned unless keystore is provided

## Web parity

| Check | Live site (expected) | `web/` rebuild | Match |
|-------|---------------------|----------------|-------|
| Hosting | Firebase `exercise-tracker-2936d.web.app` | `web/dist/` | Deploy pending |
| Auth | Email/password Firebase | `AuthPanel` + `firebase.ts` | Partial (needs `VITE_FIREBASE_APP_ID`) |
| Dashboard tabs | 7 sections | 7 routes in `App.tsx` | Yes (shell) |
| Gym muscle atlas | Volume from Firestore | Demo from `shared/muscles/` | Partial |
| Runs / map | History + Leaflet | Placeholder `SectionPage` | No |
| Firestore data binding | Live user data | Not wired on most pages | No |

### Web setup

Copy Web app ID from [Firebase Console](https://console.firebase.google.com/project/exercise-tracker-2936d/settings/general) into `web/.env`:

```
VITE_FIREBASE_APP_ID=1:40353237709:web:YOUR_ID
```

Then: `cd web && npm run build && cd ../firebase && npx firebase-tools deploy --only hosting`

## Repository layout (optimized)

```
ExerciseTracker/
├── android/                 Kotlin + Compose app (canonical source)
│   ├── app/src/main/java/   com.exercisetracker.app.*
│   ├── decompiled-reference/  JADX output (gitignored, porting reference)
│   └── scaffold-backup/     Original Kotlin scaffold snapshot
├── web/                     React + Vite dashboard
├── shared/                  JSON schemas, muscle maps, assets
├── firebase/                Hosting + Firestore rules
├── docs/                    PARITY.md, guides
├── apk-archive/             APK inventory metadata
└── recovered-source-v2/   Additional decompile artifacts
```

## Next steps (Phase 4+)

1. Port `TrackingService` + run recording from decompiled reference
2. Restore full `AndroidManifest.xml` from `decompiled-reference/AndroidManifest-full.xml` as features land
3. Wire web pages to Firestore (`users/{uid}/runs`, gym, sleep)
4. Provide release keystore for signed builds matching distributed APK
