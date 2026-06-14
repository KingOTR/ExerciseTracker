# APK vs project parity (14 Jun 2026)

**Reference:** `Desktop/ExerciseTracker-v0.7.93.apk` (~84.5 MB, versionCode 107)  
**Rebuilt:** `Desktop/ExerciseTracker-latest.apk` (~34.4 MB, signed release)

## Metadata

| Field | Reference | Rebuilt | Match |
|-------|-----------|---------|-------|
| package | `com.exercisetracker.app` | same | Yes |
| versionName | 0.7.93 | 0.7.93 | Yes |
| versionCode | 107 | 107 | Yes |
| minSdk | 29 | 29 | Yes |
| targetSdk | 35 | 35 | Yes |
| launchable-activity | `com.example.rungps.MainActivity` | same | Yes |
| native ABIs | arm64-v8a, armeabi-v7a | same | Yes |
| APK size | ~84.5 MB | ~34.4 MB | No (~41%) |

## Manifest (aapt2 dump)

| Type | Reference (custom) | Rebuilt (custom) | Match |
|------|-------------------|-----------------|-------|
| Activities | 3 | 3 | Yes |
| Services | 5 | 5 | Yes |
| Receivers | 11 | 11 | Yes |
| Providers | 1 (FileProvider) | 1 | Yes |
| Activity alias | 1 | 1 | Yes |

Library-merged components (Firebase, WorkManager, Health Connect, etc.) differ slightly in count; custom `com.example.rungps.*` entries match reference.

## Assets

| Asset class | Reference APK | Project |
|-------------|---------------|---------|
| sleep_ml_weights.json | Yes | Yes |
| muscle-atlas / muscles JSON | Yes | Yes |
| mapsforge themes | Yes | Via osmdroid-mapsforge AAR |
| Map symbols/patterns | Yes | Via dependency AAR (not duplicated in `assets/`) |
| dexopt profiles | Yes | Generated at build (not checked into assets) |

## Source

| Source | Files | In active build |
|--------|-------|-----------------|
| Reference APK dex | ~1,500 classes | — |
| Decompiled reference | ~1,571 Java | Gitignored; **does not bulk-compile** |
| Active Kotlin | ~50 `.kt` | **Yes** (shell + stubs) |

**Estimated parity: ~48%** — see `docs/PARITY.md` for breakdown.

## Build

```powershell
cd android
.\gradlew.bat assembleRelease
# Output: %LOCALAPPDATA%\ExerciseTracker-build\app\outputs\apk\release\app-release.apk
```
