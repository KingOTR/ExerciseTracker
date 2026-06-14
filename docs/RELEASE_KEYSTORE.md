# Release keystore — Exercise Tracker

## What this is

A **release keystore** (`.jks`) holds the private key used to sign Android APKs for distribution. Android verifies the signature on install and on updates: an update APK must be signed with the **same key** as the installed app, or the install is rejected.

## Current setup (14 Jun 2026)

| Item | Value |
|------|--------|
| Keystore file | `android/exercise-tracker-release.jks` (gitignored) |
| Key alias | `exercisetracker` |
| Validity | 10,000 days (~27 years) |
| Algorithm | RSA 2048, SHA256withRSA |
| DN | CN=William Sydney, OU=Exercise Tracker, O=KingOTR, L=Australia, ST=NSW, C=AU |

**This is a NEW keystore** created for the rebuilt project. It does **not** match the signature on the original distributed APK (`ExerciseTracker-v0.7.93.apk` on Desktop). That APK was signed with an unknown original key.

### What that means for installs

- **Fresh install:** Signed release APK installs normally.
- **In-place upgrade** over the original v0.7.93 app: **will fail** unless you uninstall the old app first (signature mismatch).
- **Future rebuilds** signed with this same `.jks`: upgrades work between those builds.

Store passwords and aliases live only in `android/local.properties` (gitignored). **Never commit** the `.jks` file or passwords to Git.

## Where to look for the ORIGINAL keystore (if you need matching updates)

1. Old dev machine / Android Studio — **Build → Generate Signed Bundle/APK** history, or `~/.android/` / project folders
2. OneDrive / backup drives — search `*.jks`, `*.keystore`, `upload-keystore`
3. Password manager — entries for “Android keystore”, “Exercise Tracker signing”
4. **Google Play Console** — if Play App Signing is enabled, Google holds the app signing key; you may only need the upload key from your records
5. Email / project notes from initial release

If the original is lost and the app was never on Play with App Signing, you cannot produce APKs that upgrade existing installs without uninstalling first.

## Create a new keystore (already done for this project)

```powershell
keytool -genkeypair -v `
  -keystore "android/exercise-tracker-release.jks" `
  -keyalg RSA -keysize 2048 -validity 10000 `
  -alias exercisetracker `
  -storepass YOUR_STORE_PASSWORD `
  -keypass YOUR_KEY_PASSWORD `
  -dname "CN=Your Name, OU=Exercise Tracker, O=KingOTR, L=City, ST=State, C=AU"
```

Replace passwords with strong secrets and record them securely (password manager, not Git).

## Local configuration

Add to `android/local.properties` (gitignored):

```properties
RELEASE_STORE_FILE=exercise-tracker-release.jks
RELEASE_STORE_PASSWORD=your_store_password
RELEASE_KEY_ALIAS=exercisetracker
RELEASE_KEY_PASSWORD=your_key_password
```

Paths are relative to the `android/` directory.

## Gradle wiring

`android/app/build.gradle.kts` reads the four `RELEASE_*` properties from `local.properties` and applies `signingConfigs.release` to `buildTypes.release` when the keystore file exists.

Build signed release:

```powershell
cd android
.\gradlew.bat assembleRelease
```

Output: `%LOCALAPPDATA%\ExerciseTracker-build\app\outputs\apk\release\app-release.apk` (build dir redirected off OneDrive).

Verify signature:

```powershell
$apksigner = "$env:LOCALAPPDATA\Android\Sdk\build-tools\35.0.0\apksigner.bat"
& $apksigner verify --verbose "path\to\app-release.apk"
```

## Security checklist

- [x] `*.jks` in `.gitignore`
- [x] `android/local.properties` in `.gitignore`
- [ ] Back up `exercise-tracker-release.jks` to encrypted storage (OneDrive vault, password manager attachment)
- [ ] Store passwords in password manager — not in chat logs or committed files

## Rotating or replacing the key

If you must replace this keystore later, generate a new `.jks`, update `local.properties`, and treat all prior signed builds as a different app identity for upgrade purposes (users uninstall old, install new).
