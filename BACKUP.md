# Exercise Tracker — backup & recovery

## Canonical project location

All source and reference material for this project should live here:

**`C:\Users\sydne\OneDrive\ExerciseTracker`**

This folder is under your **OneDrive sync root**:

**`C:\Users\sydne\OneDrive`**

Files in this path are uploaded to Microsoft OneDrive and available on other devices when sync is enabled.

## APK builds (reference copies)

Installable APK files are **not** duplicated inside this repo (to save space). Canonical copies live at:

**`C:\Users\sydne\OneDrive\Desktop\APKs`**

See `apk-archive/README.md` and `apk-archive/INVENTORY.md` for naming and versions.

## If files are deleted or overwritten

1. **OneDrive Recycle bin** — [https://onedrive.live.com](https://onedrive.live.com) → Recycle bin (deleted items from synced folders).
2. **Version history** — In File Explorer, right-click a file or folder under `ExerciseTracker` → **OneDrive** → **Version history** (or use the OneDrive web UI).
3. **Local git** — A `.git` repository exists in this folder as a secondary backup. Restore files with Git only if you have commits or stashes (`git` must be installed and on PATH).

## Desktop quick access

Open **`C:\Users\sydne\OneDrive\Desktop\OPEN_PROJECT.txt`** for the path to this folder.

## Do not rely on

- Non-synced locations (e.g. `C:\Users\sydne\Desktop` if it is not under OneDrive).
- Temp folders or Android build caches outside this tree.

Keep active work in `OneDrive\ExerciseTracker` so OneDrive can protect it.
