# Exercise Tracker — setup for a new user

You received the app APK only. **It does not contain anyone else's runs, gym logs, or passwords.** Your data stays on your phone unless you choose to sign in and sync to your own account.

## Install

1. Uninstall any older Exercise Tracker build if Android asks (package: `com.exercisetracker.app`).
2. Open the APK from Files or email → **Install**.
3. Open the app and complete the **onboarding** (tap through the tour, then **Grant** phone permissions and **Health Connect** when prompted).

## First launch checklist

| Step | What to do |
|------|------------|
| Permissions | Onboarding → **Grant phone permissions** (location, notifications, activity, Bluetooth). |
| Health Connect | **Grant Health Connect** (steps, sleep, heart rate). Install Health Connect from Play Store if prompted. |
| Account (optional) | Gym → **More** → sign in with **your** email only if you want cloud backup. Skip if testing offline. |
| Strava (optional) | History → Strava section — only if you have your own Strava API app keys. |

## App tour (bottom tabs)

- **Home** — Start/stop GPS runs, follow a saved route, optional BLE watch scan/connect, today's steps.
- **Map** — Offline map, download regions, plan routes.
- **History** — Past runs, splits, Strava PB import (optional).
- **Gym** — Program/splits, **Train** to log sets, NFC gym card (optional), cloud sync (optional).
- **Recovery** — Load from runs, gym, soccer, and ambient daily steps.
- **Sleep** — Import from Health Connect.
- **Soccer** — Log matches/training or sync from a paired watch.

## Privacy

- Do **not** sign in with someone else's Firebase email — that would download their cloud data.
- The sender's data is **not** in the APK file.

## Problems?

- **Install blocked** — Settings → Security → allow installs from this source.
- **Missing features** — Make sure you installed `ExerciseTracker-latest.apk` (~57 MB), not an older small build.
- **Health Connect empty** — Grant permissions in onboarding or Home → Allow access.
