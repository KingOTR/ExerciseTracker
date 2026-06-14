import exerciseMap from '../../../shared/muscles/exercise-muscle-map.json';
import taxonomy from '../../../shared/muscles/muscle-taxonomy.json';
import { MuscleVolumePanel } from '../components/MuscleVolumePanel';
import type { MuscleLoad, MuscleVolumeEntry } from '../../../shared/types/muscles';

function distributeDemo(weightKg: number, reps: number, loads: MuscleLoad[]): MuscleVolumeEntry[] {
  const total = weightKg * reps;
  const muscleById = Object.fromEntries(taxonomy.muscles.map((m) => [m.id, m]));
  return loads.map((load) => {
    const muscle = muscleById[load.muscleId];
    return {
      muscleId: load.muscleId,
      label: muscle?.label ?? load.muscleId,
      groupId: muscle?.groupId ?? '',
      regionId: (muscle?.regionId ?? 'upper') as MuscleVolumeEntry['regionId'],
      volume: total * (load.percent / 100),
    };
  });
}

const bench = exerciseMap.exercises.find((e) => e.name === 'Bench Press');
const demoEntries = bench ? distributeDemo(80, 10, bench.loads) : [];

export function GymPage() {
  return (
    <section className="section-card">
      <h2>Gym</h2>
      <p>Training programs, logged sets, and muscle recovery atlas.</p>
      <MuscleVolumePanel
        title="Example: Bench Press 80 kg × 10 (from exercise-muscle-map.json)"
        entries={demoEntries}
      />
    </section>
  );
}
