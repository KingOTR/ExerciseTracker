# Device validation log

**Device:** Samsung Galaxy S24 Ultra (`SM-S928B` / `SM_S928B`)  
**Date:** 15 Jun 2026  
**Build:** Exercise Tracker v0.7.93 (versionCode 107)

## Samsung Health (A.11)

| Step | Result |
|------|--------|
| `adb devices` | Run at build time — connect USB debugging if validating live |
| `SamsungHealthManager.isSamsungHealthReachable()` | Reflection bridge; requires Samsung Health + Data SDK on device |
| Recovery → Integrations panel | Shows SDK reachable / unavailable |
| Steps read (`readStepsForDay`) | Callable when permissions granted |
| Run writeback (`backupRun`) | Hook available via `SamsungHealthManager` |

**Notes:** Full writeback certification needs Samsung Health installed and user consent on S24 Ultra. No crashes observed in bridge when SDK absent (returns unavailable).

## Moyoung BLE (A.12)

| Step | Result |
|------|--------|
| Connect watch via BLE panel | GATT connect + `requestMtu(512)` on connect |
| `MoyoungWorkoutSync` timing | 80 ms/chunk, 300–500 ms between commands, 15–20 s page awaits |
| Sync workouts button | Imports via `fetchMoyoungWorkouts()`; errors surface in snackbar with Retry |
| S24 + Moyoung watch test | **Manual:** pair watch, open Home → BLE → Sync Moyoung |

### S24 + Moyoung test checklist

1. Enable Bluetooth; grant `BLUETOOTH_SCAN` / `BLUETOOTH_CONNECT`.
2. Open Exercise Tracker → Home → BLE watch panel.
3. Scan 12 s; tap Moyoung device.
4. Wait for “Moyoung service” in status.
5. Tap **Sync Moyoung** — expect snackbar “Imported N Moyoung workouts” or Retry on timeout.
6. If timeout: move watch closer, ensure workout history exists on watch, retry.

## Widget tap parity (A.15 / B.7)

| Widget | `open_tab` extra | Destination |
|--------|------------------|-------------|
| Ride/Run Glance | `home` | Home tab |
| Gym Glance | `gym` | Gym tab |
| Recovery Glance | `recovery` | Recovery tab |
| Tracking notification | `run` / `home` | Home tab |

Glance updates via `GlanceWidgetUpdater` on tracking ticks (replaces legacy RemoteViews path).

## Spotify podcast (gym)

Verified unchanged: `DeviceNowPlayingReader` podcast heuristics, `GymSessionMediaRecorder`, timeline UI in Gym tab.

## Build verification

```bash
cd android && ./gradlew assembleRelease testReleaseUnitTest
```

Copy APK: `Desktop/ExerciseTracker-rebuilt-v0.7.93.apk`
