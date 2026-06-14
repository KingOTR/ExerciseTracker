# Build & deploy — remaining manual steps

## Done automatically

- Android **debug APK** rebuilt → `Desktop\ExerciseTracker-latest.apk` (installable)
- Web **production build** → `web/dist/`
- `web/.env` created (needs Web app ID)
- `scripts/deploy-web.ps1` added

## 1. Firebase login (required for website deploy)

In **PowerShell** (interactive terminal, not background):

```powershell
cd C:\Users\sydne\OneDrive\ExerciseTracker\firebase
npx firebase-tools login
```

Sign in with the Google account that owns `exercise-tracker-2936d`.

## 2. Web app ID (required for sign-in on site)

1. Open [Firebase project settings](https://console.firebase.google.com/project/exercise-tracker-2936d/settings/general)
2. Under **Your apps**, select the **Web** app (or add one)
3. Copy **App ID** (format `1:40353237709:web:…`)
4. Paste into `web/.env`:

```
VITE_FIREBASE_APP_ID=1:40353237709:web:YOUR_ID_HERE
```

5. Rebuild and deploy:

```powershell
cd C:\Users\sydne\OneDrive\ExerciseTracker
.\scripts\deploy-web.ps1
```

Live URL: https://exercise-tracker-2936d.web.app/

## 3. Install Android app

Copy `ExerciseTracker-latest.apk` to your phone and install (allow unknown sources if prompted).

Package: `com.exercisetracker.app` · version **0.7.93**

**Note:** This is a **debug** build (~125 MB). Your original release was ~84 MB and signed with your release keystore. For store-style updates over the old install, you need the original signing key.

## 4. Full parity with original APK (ongoing)

The rebuild includes gym, recovery (muscle load), Firebase sync layer, and core navigation. The decompiled app had ~1,570 UI files; GPS tracking, full gym train flow, sleep ML, MapLibre offline maps, BLE/NFC, and Strava still need porting from `recovered-source/`.
