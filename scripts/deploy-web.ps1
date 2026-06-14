# Deploy Exercise Tracker web dashboard to Firebase Hosting
# Prerequisite: firebase login (once)
param(
  [switch]$SkipBuild
)

$ErrorActionPreference = "Stop"
$root = Split-Path -Parent $PSScriptRoot
$web = Join-Path $root "web"
$firebase = Join-Path $root "firebase"

if (-not (Test-Path (Join-Path $web ".env"))) {
  Write-Warning "Copy web/.env.example to web/.env and set VITE_FIREBASE_APP_ID before auth will work."
}

if (-not $SkipBuild) {
  Push-Location $web
  npm run build
  Pop-Location
}

Push-Location $firebase
npx firebase-tools deploy --only hosting,firestore:rules --project exercise-tracker-2936d
Pop-Location

Write-Host "Live: https://exercise-tracker-2936d.web.app/"
