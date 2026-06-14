# Exercise Tracker — Full Rebuild

Monorepo rebuild of **Exercise Tracker** (`com.exercisetracker.app`, v0.7.93).

- **Firebase project:** `exercise-tracker-2936d`
- **Live web:** https://exercise-tracker-2936d.web.app/
- **Canonical APK:** `ExerciseTracker-latest.apk` on Desktop

## Repository layout

```
ExerciseTracker/
├── android/                 Kotlin + Jetpack Compose (v0.7.93, versionCode 107)
│   ├── app/src/main/java/   com.exercisetracker.app (canonical source)
│   ├── decompiled-reference/  Full JADX output (gitignored, porting reference)
│   └── scaffold-backup/     Original Kotlin scaffold snapshot
├── web/                     React + Vite + TypeScript
├── shared/                  JSON schemas, muscle maps, assets
├── firebase/                Hosting + Firestore rules
├── docs/                    PARITY.md, guides
├── apk-archive/             APK inventory metadata
└── tools/                   JADX portable decompiler
```

**Parity status:** see [`docs/PARITY.md`](docs/PARITY.md) for APK/web comparison vs v0.7.93 reference.

## Phase 1 status (scaffolding) — complete

| Area | Status |
|------|--------|
| APK inventory | 61 APKs in `apk-archive/INVENTORY.md` |
| Asset extraction | 157 files in `shared/assets/` + `android/.../assets/` |
| Android scaffold | Compose + Room + bottom nav |
| Web scaffold | Vite React TS + dashboard |
| Shared schemas | JSON Schema + TS/Kotlin types |

## Phase 2 status (toolchain + porting)

| Area | Status |
|------|--------|
| Toolchain | Git 2.54, Node 24.16 LTS, JDK 17.0.19 installed via winget |
| Git repo | Initialized at project root |
| JADX decompile | **27,735 files** in `recovered-source/` (98 non-fatal errors) |
| Web build | `npm install` + `npm run build` **success** → `web/dist/` |
| Android build | See Phase 3 below |
| Code porting | Firestore sync layer, ViewModels, Repository, muscle mapping — see `recovered-source/ARCHITECTURE.md` |
| Firebase config | **Complete** — `google-services.json` recovered from APK strings (`appId`, sender ID, apiKey) |

## Phase 3 status (production parity rebuild) — 12 Jun 2026

| Area | Status |
|------|--------|
| Android Studio | Installed via winget (`Google.AndroidStudio` 2026.1.1.9) |
| Android SDK | Installed at `%LOCALAPPDATA%\Android\Sdk` (cmdline-tools 12.0, platform-35, build-tools 35.0.0) |
| `local.properties` | `sdk.dir=C:\\Users\\sydne\\AppData\\Local\\Android\\Sdk` |
| `assembleDebug` | **SUCCESS** → `app-debug.apk` (125.5 MB) |
| `assembleRelease` | **SUCCESS** → `app-release-unsigned.apk` (108.4 MB) |
| Desktop copies | `ExerciseTracker-rebuilt.apk` (release), `ExerciseTracker-rebuilt-debug.apk` |
| Code ported | **37 / 1,571** decompiled Java files (**2.4%**); **37 / 635** non-inner-class files (**5.8%**) |
| UI screens ported | **7 tab shells** (placeholder `DataScreen` stubs) vs **112** Compose entry points in decompiled `ui/` |
| Muscle mapping | Integrated — `shared/muscles/` → `android/.../assets/muscles/` + `domain/muscle/` |

### Parity comparison vs `ExerciseTracker-latest.apk`

| Check | Reference | Rebuilt | Match |
|-------|-----------|---------|-------|
| Package | `com.exercisetracker.app` | `com.exercisetracker.app` | Yes |
| versionName | `0.7.93` | `0.7.93` | Yes |
| versionCode | `107` | `107` | Yes |
| minSdk | `29` | `29` | Yes |
| targetSdk | `35` | `35` | Yes |
| APK size (release) | 84.5 MB | 108.4 MB | No (+24 MB) |
| `aapt` permissions (11 listed) | Same set | Same set | Yes |
| Signing | Release keystore (unknown) | Unsigned / debug key | No |
| Feature parity | Full app | Scaffold + sync + muscle engine | ~5% |

### Remaining gaps for exact match

1. **~1,534 decompiled source files** not yet ported (GPS `TrackingService`, full Room `AppDb` schema, Health Connect, BLE watch, NFC gym, TFLite sleep, Strava OAuth, widgets, foreground services)
2. **Manifest** — rebuilt has 1 activity; reference has 4 activities, 6 services, 12 receivers, 3 widgets, Health Connect alias, Strava/Spotify/NFC intent filters
3. **APK size** — rebuilt is larger (no R8 minify, unoptimized native libs, debug-oriented packaging); reference uses `extractNativeLibs=false` with tuned splits
4. **Release signing** — original `.jks` keystore not found; rebuilt APK is unsigned
5. **ProGuard/R8** — reference may use minification; current `isMinifyEnabled = false`

### Install rebuilt APK on phone

```powershell
# USB debugging enabled; device connected
adb install -r "C:\Users\sydne\OneDrive\Desktop\ExerciseTracker-rebuilt-debug.apk"

# Or release (unsigned — may need: adb install -r --bypass-low-target-sdk-block)
adb install -r "C:\Users\sydne\OneDrive\Desktop\ExerciseTracker-rebuilt.apk"
```

To sign release builds with the original keystore (if found):

```powershell
# After locating original .jks
apksigner sign --ks path\to\release.jks --out signed.apk app-release-unsigned.apk
```

### Ported from decompiled `com.example.rungps`

- `FirestorePaths` — all `users/{uid}/...` collection paths
- `CloudSyncManager` — orchestrates gym/runs/soccer/sleep/recovery pull
- `GymFirestoreSync`, `RunFirestoreSync`, `SleepFirestoreSync`, `SoccerFirestoreSync`
- `MainViewModel`, `GymViewModel`, `RunsViewModel`
- `ExerciseTrackerRepository` + Room singleton
- `MainActivity` wired to ViewModel with sync buttons on Home/Gym tabs

## Build commands

### Android

Requires **Android Studio** (Ladybug+) or JDK 17 + Android SDK.

```bash
cd android
# First time: open in Android Studio to generate Gradle wrapper, or:
# gradle wrapper --gradle-version 8.10

./gradlew assembleDebug          # Linux/macOS
gradlew.bat assembleDebug        # Windows
```

Output: `android/app/build/outputs/apk/debug/app-debug.apk`

### Web

Requires **Node.js 18+** and npm.

```bash
cd web
npm install
npm run dev       # http://localhost:5173
npm run build     # output → web/dist/
```

### Firebase deploy

```bash
cd web && npm run build
cd ../firebase && firebase deploy --only hosting,firestore:rules
```

## Firebase setup

`android/app/google-services.json` is populated from APK-extracted values (`project_number` 40353237709, `mobilesdk_app_id` `1:40353237709:android:22fc221528db802c58b784`). Web config may still need the same values in `web/src/lib/firebase.ts` — see `firebase/README.md`.

## Signing keystore (user action required)

Release APKs matching the Play Store / distributed builds need the original `.jks` keystore. Without it, only debug builds are possible.

## Data model reference

Schemas derived from `export.json` diagnostics export:

- `shared/schemas/gym-sessions.schema.json` — GymSession + GymSet
- `shared/schemas/runs.schema.json` — Run + KmSplit
- `shared/schemas/soccer-sessions.schema.json` — SoccerSession
- `shared/schemas/sleep.schema.json` — SleepRecord

Room entities in `android/.../data/entity/` mirror these models.

## App features (from original)

| Tab | Purpose |
|-----|---------|
| Home | GPS runs, BLE watch, steps |
| Map | Offline MapLibre maps, route planning |
| History | Run history, splits, Strava |
| Gym | Programs, set logging, NFC, sync |
| Recovery | Load tracking |
| Sleep | Health Connect + ML scoring |
| Soccer | Matches/training, watch sync |

## What's next (Phase 4+)

- Port GPS tracking (`com.example.rungps.tracking.TrackingService`)
- Port full Room schema from `data/AppDb_Impl.java` (all entities, DAOs, migrations)
- Port Compose UI from `ui/shell/AppScreenKt`, `GymTabContentKt`, `SleepTabScreenBodyKt`, etc.
- Match `AndroidManifest.xml` to recovered reference (services, receivers, widgets, intent filters)
- Enable R8 minify + copy native libs from reference APK to reduce size
- Firebase Auth sign-in flow (email)
- Leaflet map on web + Firestore data binding

## Blockers needing user input

1. **Release signing keystore** (`.jks`) — for APKs that upgrade in-place over existing installs
