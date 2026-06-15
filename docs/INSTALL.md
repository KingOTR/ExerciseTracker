# Installing the rebuilt Exercise Tracker APK

Package: `com.exercisetracker.app` · version **0.7.93** (versionCode **107**)

## Why install can fail

| Error | Cause | Fix |
|-------|-------|-----|
| `INSTALL_FAILED_UPDATE_INCOMPATIBLE` | APK signed with a **different certificate** than the app already on your phone (e.g. Play Store / original RunGPS keystore vs rebuilt KingOTR keystore) | **Uninstall** the existing app first (see below) |
| `INSTALL_FAILED_VERSION_DOWNGRADE` | Installed app has a higher `versionCode` than the APK | Use a newer build or uninstall first |
| `INSTALL_PARSE_FAILED_*` | Corrupt or incomplete APK download | Re-copy from Desktop; verify file is ~38 MB, not 0 bytes |
| `INSTALL_FAILED_NO_MATCHING_ABIS` | APK built for wrong CPU architecture | Use the release APK from this repo (armeabi-v7a + arm64-v8a) |

**Different signing keys cannot be upgraded over each other.** Bumping `versionCode` alone does not help when the certificate changes — Android always requires uninstall first.

## Recommended install steps

### 1. Back up your data

If you previously signed in with Firebase, your gym logs, runs, sleep, and recovery data are synced to the cloud under **your** account. After reinstalling, sign in with the same email to restore.

Local-only data (unsynced workouts, offline map tiles) is removed on uninstall. Export anything important before proceeding.

### 2. Uninstall the existing Exercise Tracker

On your phone:

**Settings → Apps → Exercise Tracker → Uninstall**

Or via USB (device connected, USB debugging on):

```powershell
& "$env:LOCALAPPDATA\Android\Sdk\platform-tools\adb.exe" uninstall com.exercisetracker.app
```

### 3. Install the rebuilt APK

Copy one of these Desktop files to your phone, or install over USB:

- `ExerciseTracker-rebuilt-v0.7.93.apk`
- `ExerciseTracker-latest-rebuilt.apk`

```powershell
& "$env:LOCALAPPDATA\Android\Sdk\platform-tools\adb.exe" install -r "C:\Users\sydne\OneDrive\Desktop\ExerciseTracker-rebuilt-v0.7.93.apk"
```

On the phone: open the APK in Files → **Install** (allow installs from unknown sources if prompted).

### 4. First launch

Complete onboarding (permissions, Health Connect). Sign in with **your** Firebase email if you want cloud sync.

## Alternative: side-by-side install (work profile)

If you must keep the old build installed for comparison:

1. Enable a **work profile** (e.g. Island, Shelter, or Android work profile).
2. Install the rebuilt APK only inside the work profile.
3. The main profile keeps the original app; the work profile runs the rebuilt APK as a separate instance.

## Verify the APK before installing

```powershell
$aapt2 = "$env:LOCALAPPDATA\Android\Sdk\build-tools\35.0.0\aapt2.exe"
& $aapt2 dump badging "C:\Users\sydne\OneDrive\Desktop\ExerciseTracker-rebuilt-v0.7.93.apk" | Select-String "package:|versionCode|versionName"
```

Expected output includes:

```
package: name='com.exercisetracker.app' versionCode='107' versionName='0.7.93'
```

## Build a fresh APK locally

```powershell
cd C:\Users\sydne\OneDrive\ExerciseTracker\android
.\gradlew assembleRelease --no-daemon
```

Output: `%LOCALAPPDATA%\ExerciseTracker-build\app\outputs\apk\release\app-release.apk`

Requires `android/local.properties` with `RELEASE_STORE_FILE` and keystore passwords for a signed release build.
