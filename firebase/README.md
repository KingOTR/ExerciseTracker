# Firebase setup

**Project:** `exercise-tracker-2936d`  
**Live web:** https://exercise-tracker-2936d.web.app/

## google-services.json (Android)

**Partially recovered from APK v0.7.93** (project ID, API key, storage bucket). Still need `mobilesdk_app_id` and `project_number` from Console.

1. Open [Firebase Console](https://console.firebase.google.com/project/exercise-tracker-2936d/settings/general)
2. Under **Your apps**, select the Android app (`com.exercisetracker.app`) or add it
3. Download `google-services.json` (recommended — replaces partial file)
4. Or paste missing fields into `android/app/google-services.json`:
   - `mobilesdk_app_id`
   - `project_number` (GCM sender ID)

## Web config

1. In Firebase Console → Project settings → Your apps → Web app
2. Copy the `firebaseConfig` object into `web/src/lib/firebase.ts`

## Deploy

```bash
cd web && npm run build
cd ../firebase && firebase deploy --only hosting,firestore:rules
```

Requires Firebase CLI (`npm i -g firebase-tools`) and `firebase login`.

## Signing keystore (Android release)

Release builds require the original signing keystore. Without it, only debug APKs can be produced. Store keystore credentials securely — never commit to git.
