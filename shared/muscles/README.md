# Muscle taxonomy and load mapping

Research-based muscle activation percentages for gym exercises and cardio activities used by Exercise Tracker recovery and gym logging.

## Files

| File | Purpose |
|------|---------|
| `muscle-taxonomy.json` | Hierarchical regions, groups, and specific muscles with `atlasIds` linking to `shared/assets/muscle-atlas.json` |
| `exercise-muscle-map.json` | 100+ gym exercises with `loads: [{ muscleId, percent }]` summing to ~100% |
| `cardio-muscle-map.json` | Running, cycling, soccer, and steps muscle stress distributions |

## Methodology

Percentages represent **relative EMG-normalized activation** during a rep or activity unit, not literal force share. They are calibrated from:

1. Peer-reviewed EMG studies (normalized %MVIC or relative rankings converted to shares)
2. ACE (American Council on Exercise) commissioned EMG summaries where available
3. Schoenfeld / Contreras / McGill reviews for composite and stability movements
4. Expert consensus when only rank-order EMG data exists

Each exercise entry includes a `sources` array citing the primary literature used. Values are rounded to sum to 100%.

### Gym volume formula

```
muscleVolume[m] = Σ_sets (weightKg × reps × loadPercent[m] / 100)
```

Bodyweight exercises use an effective load (e.g. 65 kg) when weight is not logged.

### Cardio load formula

```
muscleLoad[m] = activityUnits × baseLoadPerUnit × intensityFactor × loadPercent[m] / 100
```

- **Running:** units = distance km, `baseLoadPerUnit = 1.0`
- **Cycling:** units = distance km, `baseLoadPerUnit = 0.65` (lower impact)
- **Soccer:** units = play minutes × (intensity / 5)
- **Steps:** units = steps / 1000, `baseLoadPerUnit = 0.08`

## Key references

### Chest / pressing
- Saeterbakken AH, Fimland MS (2013) — bench press muscle activation
- Barnett C et al. (1995) — incline/decline bench EMG
- Schanke W et al. (2012) — fly variations

### Back / pulling
- Signorile JF et al. (2002) — lat pulldown grips
- Fenwick CMJ et al. (2009) — rowing variations
- Youdas JW et al. (2010) — pull-up/chin-up

### Shoulders
- Saeterbakken AH, Fimland MS (2013) — overhead press
- Botton CE et al. (2013) — lateral raise

### Legs
- Caterisano A et al. (2002) — squat depth and EMG
- Escamilla RF et al. (2001) — leg press, squat family
- Contreras B et al. (2015) — hip thrust vs squat
- Mohamed SI et al. (2014) — leg curl hamstring heads

### Arms
- Oliveira LF et al. (2009) — biceps curl variations
- Kholinne E et al. (2018) — triceps head activation

### Cardio
- Dorn TW et al. (2012) — running muscle mechanics
- Ericson MO (1985) — cycling EMG
- Mohr M et al. (2010) — soccer physical demands
- Perry J, Burnfield JM (2010) — gait analysis (walking/steps)

### Reviews
- Schoenfeld BJ — hypertrophy and regional activation reviews
- ACE Exercise Library EMG rankings (acefitness.org)

## User overrides

Unknown exercises trigger a muscle picker in the Gym tab. Confirmed mappings are stored in Room (`user_exercise_overrides`) and take precedence over the built-in map.

## Pattern templates

`muscle-taxonomy.json` includes preset templates (`push`, `pull`, `squat`, `hinge`, `lunge`) for quick assignment when an exercise is not in the database.
