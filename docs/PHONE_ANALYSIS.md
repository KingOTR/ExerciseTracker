# Phone APK analysis — 15 Jun 2026

Device connected via USB and analyzed with ADB from Android SDK `platform-tools`.

## Device

| Field | Value |
|-------|-------|
| Serial | `R5CXB134KXV` |
| Model | Samsung `SM_S928B` (Galaxy S24 Ultra) |
| ADB state | `device` (authorized) |
| Transport | USB |

## Installed package

| Field | Value |
|-------|-------|
| **Package name** | `com.exercisetracker.app` |
| **versionCode** | `107` |
| **versionName** | `0.7.93` |
| **Launch activity** | `com.example.rungps.MainActivity` |
| **Splits** | `base` only (no config splits) |
| **APK path** | `/data/app/~~WAMEpV2HbpxNLDvLYOs1-A==/com.exercisetracker.app-d2jVzU0EAjBbGL1anN6F-Q==/base.apk` |
| **firstInstallTime** | 2026-06-11 18:00:15 |
| **lastUpdateTime** | 2026-06-12 12:22:16 |
| **Installer** | `com.google.android.packageinstaller` |
| **Debuggable** | No (release build) |

### Package name vs Firebase console

| Source | Package / app id |
|--------|------------------|
| **Phone (installed)** | `com.exercisetracker.app` |
| **Firebase Console (Android app label)** | `Exercise.Tracker` (display name; not the Java package) |
| **`android/app/build.gradle.kts`** | `applicationId = "com.exercisetracker.app"` |
| **`google-services.json`** | `package_name: "com.exercisetracker.app"` |
| **Kotlin/Java namespace** | `com.example.rungps.*` (legacy internal tree) |

The Firebase console “Exercise.Tracker” label is a human-readable app name. The registered Android package in `google-services.json` matches the installed APK and the rebuilt project (`com.exercisetracker.app`). No package mismatch on device.

## Pulled APK

| Field | Value |
|-------|-------|
| Local path | `reference/phone-installed.apk` (gitignored) |
| Size | **84.54 MB** (88,647,581 bytes) |
| SHA-256 | `3927C708AB8959EB59063A0A118BAA6DE07EFF517AE51CD04D2F6957B1B380E3` |

## Signing

| APK | Signer DN | SHA-256 certificate |
|-----|-----------|---------------------|
| **Phone / reference v0.7.93** | `CN=RunGPS, OU=Mobile, O=RunGPS, L=Local, ST=Local, C=AU` | `ad1fc6c0a9da2946734e0098d8445f4a7c89fcf5d2f590a2d068bd306bbcbdaf` |
| **Rebuilt (Desktop latest)** | `CN=William Sydney, OU=Exercise Tracker, O=KingOTR, L=Australia, ST=NSW, C=AU` | `a289c132d70cbe8830748004c20e09b6aa3295240602d4fb0ce6cee286990f3c` |

Phone APK uses the **original RunGPS release keystore**. Rebuilt APK uses the **KingOTR release keystore** — different signature, cannot OTA-update over the original without uninstall.

## aapt badging comparison

| Check | Phone | `Desktop/ExerciseTracker-v0.7.93.apk` | `Desktop/ExerciseTracker-latest.apk` (rebuilt) |
|-------|-------|----------------------------------------|-----------------------------------------------|
| package | `com.exercisetracker.app` | same | same |
| versionCode / Name | 107 / 0.7.93 | same | same |
| minSdk / targetSdk | 29 / 35 | same | same |
| launchable-activity | `com.example.rungps.MainActivity` | same | same |
| native-code | `arm64-v8a`, `armeabi-v7a` | same | same |
| Size | 84.54 MB | 84.54 MB | **36.24 MB** |
| SHA-256 match phone | — | **identical** | different |

**Conclusion:** Phone-installed APK is **byte-for-byte identical** to `Desktop/ExerciseTracker-v0.7.93.apk`. It is the **original reference build**, not the rebuilt port.

## Assets (zip listing)

| APK | Asset file count |
|-----|------------------|
| Phone / reference | 159 |
| Rebuilt | 163 |

- **Phone-only assets:** none (phone ⊆ reference Desktop copy).
- **Rebuilt-only assets:** 4 files under `assets/muscles/` added in the Kotlin port (`cardio-muscle-map.json`, `exercise-muscle-map.json`, `muscle-taxonomy.json`, `README.md`).

## Runtime permissions granted (sample)

Location (fine/coarse), Bluetooth connect, Health Connect (read/write steps, sleep, exercise, distance), POST_NOTIFICATIONS, NFC, calendar read, and standard foreground-service / network permissions.

## Canonical reference recommendation

**Do not promote the phone pull as a new canonical reference.** It is identical to the existing `Desktop/ExerciseTracker-v0.7.93.apk`. Keep that Desktop file (or this pull at `reference/phone-installed.apk`) as the **original reference APK** for parity audits.

The **rebuilt** APK (`ExerciseTracker-latest.apk`, 36.24 MB) is a separate artifact: same version metadata and package id, different signature and DEX volume (~49% smaller).

## Firebase web config (applied locally)

`web/.env` (gitignored) updated with full Web app config including:

- `VITE_FIREBASE_APP_ID=1:40353237709:web:55af473c7784e17258b784`
- `VITE_FIREBASE_MEASUREMENT_ID=G-WN5RGGVNN1`

`npm run build` in `web/` **succeeds** with Firebase env present.

## ADB commands used

```powershell
$adb = "$env:LOCALAPPDATA\Android\Sdk\platform-tools\adb.exe"
adb devices -l
adb shell pm list packages | findstr -i exercise
adb shell dumpsys package com.exercisetracker.app
adb shell pm path com.exercisetracker.app
adb pull <base.apk path> reference/phone-installed.apk
```

## If ADB shows no device

1. Enable **Developer options** → **USB debugging** on the phone.
2. Use a data-capable USB cable; accept the **RSA fingerprint** prompt on the phone.
3. On Samsung: set USB mode to **File transfer / MTP** if the device does not appear.
4. Run `adb kill-server; adb start-server; adb devices` and wait for `device` (not `unauthorized`).
5. Add `%LOCALAPPDATA%\Android\Sdk\platform-tools` to PATH, or call `adb.exe` by full path.
