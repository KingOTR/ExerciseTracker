# APK vs project parity (14 Jun 2026)

**Canonical reference APK:** `Desktop/ExerciseTracker-v0.7.93.apk`  
**Newest by file time on Desktop:** `ExerciseTracker-rebuilt.apk` / `ExerciseTracker-latest.apk` (same versionCode **107**, debug/rebuild artifacts)

| Metadata | Reference APK | Project `build.gradle.kts` |
|----------|---------------|------------------------------|
| Package | `com.exercisetracker.app` | Match |
| versionName | `0.7.93` | Match |
| versionCode | `107` | Match |
| minSdk | 29 | Match |
| targetSdk | 35 | Match |
| Size (release) | ~84.5 MB | Scaffold + libs ~smaller until full port |
| Signing | Original unknown key | **New** `exercise-tracker-release.jks` |

## Manifest components (aapt dump on v0.7.93)

| Type | In APK | In project manifest |
|------|--------|---------------------|
| Activities | 9 | 1 |
| Services | 13 | 0 |
| Receivers | 21 | 0 |
| Providers | 3 | 0 |
| Activity aliases | 1 | 0 |

### APK app components (sample — full list in decompiled reference)

- **Sleep:** `SleepListenService`, `SleepAlarmSoundService`, `SleepAlarmActivity`, `SleepAlarmReceiver`, `SleepAlarmBootReceiver`, `BedtimeReminderReceiver`, `CalendarPermissionActivity`
- **GPS:** `TrackingService`
- **Gym:** `GymActiveSessionForegroundService`, gym widgets
- **Media:** `MediaSessionListenerService` (Spotify)
- **Widgets:** Gym, RideRun, Recovery widget providers + refresh receivers
- **Main:** `com.example.rungps.MainActivity` (Strava/NFC/deep-link intent filters)

Project uses simplified manifest + Kotlin scaffold under `com.exercisetracker.app`. Full manifest backup: `android/decompiled-reference/` (from APK extract).

## Assets (APK zip)

| Asset | In APK | In project |
|-------|--------|------------|
| `assets/sleep_ml_weights.json` | Yes | Yes |
| `assets/muscle-atlas.json` | Yes | Yes |
| `*.tflite` in assets | No (may load dynamically) | TFLite dependency only |
| Map symbols / mapsforge | Yes (full tree) | Yes (~148 files) |

## Source parity (approximate)

| Source | Files | In active build |
|--------|-------|-----------------|
| APK (5× dex) | ~1,500+ classes | Reference only |
| Decompiled (`decompiled-reference/`) | ~1,571 Java | Gitignored, porting reference |
| Kotlin scaffold | 37 `.kt` | **Active** |
| Sleep subsystem (APK inventory) | ~77 + 18 UI | **0 Kotlin** in scaffold; decompiled preserved |

**Estimated feature parity:** ~12–15% (metadata + permissions + assets + sync/muscle shell).

## Feature diff

| Feature / component | Newest APK (v0.7.93) | Project | Action |
|---------------------|----------------------|---------|--------|
| Version metadata | 107 / 0.7.93 | Match | Done |
| Firebase / google-services OAuth | Yes | Merged | Done |
| Release signing | Original key | New keystore | See `RELEASE_KEYSTORE.md` |
| GPS tracking service | Yes | No | Port from decompiled |
| Sleep overnight + ML | Yes | No | Port from `run` or decompiled |
| Health Connect | Yes | Dependency only | Port managers |
| MapLibre offline maps | Yes | Dependency only | Port UI |
| Gym NFC / full train flow | Yes | Partial GymScreen | Port |
| Strava / Spotify | Yes | No | Port |
| Home screen widgets | Yes | No | Port |
| Web dashboard | N/A | 7-tab shell | Wire Firestore |

## v0.7.90 vs v0.7.93 (APK compare)

Manifest component counts identical (9 / 13 / 21). v0.7.93 is the highest versionCode (**107**) in the APK collection; use it as feature baseline.

## Restore sources

1. **`c:\Users\sydne\run`** — primary Kotlin if present (v0.7.92 tree)
2. **Newest APK** — manifest, permissions, assets, version truth
3. **`android/decompiled-reference/`** — JADX Java (does not bulk-compile; port to Kotlin)

See also `docs/PARITY.md` and `docs/RELEASE_KEYSTORE.md`.
