import type { MuscleVolumeEntry } from '../../../shared/types/muscles';

type Props = {
  title: string;
  entries: MuscleVolumeEntry[];
};

export function MuscleVolumePanel({ title, entries }: Props) {
  if (entries.length === 0) {
    return (
      <section className="muscle-volume-panel">
        <h3>{title}</h3>
        <p>No muscle volume data yet. Log gym sets on Android or import export.json.</p>
      </section>
    );
  }

  const max = Math.max(...entries.map((e) => e.volume), 1);

  return (
    <section className="muscle-volume-panel">
      <h3>{title}</h3>
      <ul>
        {entries.map((entry) => (
          <li key={entry.muscleId}>
            <span>{entry.label || entry.muscleId}</span>
            <span>{Math.round(entry.volume)} kg</span>
            <meter value={entry.volume} min={0} max={max} />
          </li>
        ))}
      </ul>
    </section>
  );
}
