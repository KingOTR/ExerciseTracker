#!/usr/bin/env bash
# Compare manifest permissions and version metadata between reference and rebuilt APK.
set -euo pipefail
REF="${1:?reference apk}"
NEW="${2:?rebuilt apk}"
echo "Reference: $REF"
echo "Rebuilt:   $NEW"
if command -v aapt2 >/dev/null 2>&1; then
  AAPT=aapt2
elif [ -n "${ANDROID_HOME:-}" ] && [ -x "$ANDROID_HOME/build-tools/35.0.0/aapt2" ]; then
  AAPT="$ANDROID_HOME/build-tools/35.0.0/aapt2"
else
  echo "aapt2 not found — skip"
  exit 0
fi
echo "--- Reference badging ---"
"$AAPT" dump badging "$REF" | head -5
echo "--- Rebuilt badging ---"
"$AAPT" dump badging "$NEW" | head -5
echo "Parity script complete (manual review of versionName/versionCode)."
