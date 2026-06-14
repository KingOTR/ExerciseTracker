# Full import from v0.7.93 decompiled APK (JADX)

## What was imported
- **1,571 Java sources** → `app/src/main/java/com/example/rungps/`
- **114 res folders** from original APK (strings, drawables, xml, widgets)
- **Original AndroidManifest** (app components only; library entries removed — Gradle supplies those)
- **157 asset files** including muscle-atlas, mapsforge, sleep ML weights
- **New muscle maps** → `assets/muscles/` (117 exercises, 42 muscles — merged on top)

## Build
```powershell
cd C:\Users\sydne\OneDrive\ExerciseTracker\android
.\gradlew.bat assembleRelease
```

Output: `app/build/outputs/apk/release/app-release-unsigned.apk`  
Installable debug: `.\gradlew.bat assembleDebug`

## vs original APK
| | Original | Rebuilt |
|---|----------|---------|
| Package | com.exercisetracker.app | same |
| Version | 0.7.93 (107) | same |
| Source | Kotlin (lost) | JADX Java + new muscle JSON |
| Signing | Release keystore | Debug or unsigned release |

**Exact byte match** requires your original release keystore. Functionality should match v0.7.93 plus expanded muscle load mapping.

## Scaffold backup
Previous Kotlin scaffold (37 files) → `android/scaffold-backup/exercisetracker-kotlin/`

## Known build notes
- Removed decompiled `public.xml`, `attrs.xml`, and library styles (Gradle deps provide these)
- OneDrive may lock `app/build/` — pause sync or delete build folder if clean fails
