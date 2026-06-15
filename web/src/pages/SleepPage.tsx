import { useEffect, useState } from 'react';
import { listSleepEntries } from '../lib/firestoreData';

export function SleepPage() {
  const [nights, setNights] = useState<Array<Record<string, unknown>>>([]);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    void (async () => {
      try {
        setNights(await listSleepEntries());
      } catch (e) {
        setError(e instanceof Error ? e.message : 'Failed to load sleep');
      }
    })();
  }, []);

  return (
    <section className="section-card">
      <h2>Sleep</h2>
      <p>Sleep duration, efficiency, and quality scores from Firestore.</p>
      {error && <p className="error-note">{error}</p>}
      <ul className="data-list">
        {nights.map((night) => (
          <li key={String(night.id)}>
            {Math.round(Number(night.durationMin ?? night.totalMin ?? 0))} min · efficiency{' '}
            {Math.round(Number(night.efficiencyPct ?? night.efficiency ?? 0))}% · score{' '}
            {Number(night.qualityScore ?? night.score ?? '—')} ·{' '}
            {new Date(Number(night.nightStartMs ?? night.startTimeMs ?? 0)).toLocaleDateString()}
          </li>
        ))}
      </ul>
      {nights.length === 0 && !error && <p>No sleep entries synced yet.</p>}
    </section>
  );
}
