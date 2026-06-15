import { useEffect, useState } from 'react';
import { listSleepEntries } from '../lib/firestoreData';

function HypnogramBar({ compact }: { compact?: string }) {
  if (!compact) return null;
  const colors: Record<string, string> = {
    '0': '#f59e0b',
    '1': '#60a5fa',
    '2': '#1d4ed8',
    '3': '#a78bfa',
  };
  return (
    <div className="hypnogram-bar" role="img" aria-label="Sleep hypnogram">
      {compact.split('').map((c, i) => (
        <span
          key={i}
          style={{
            display: 'inline-block',
            width: 3,
            height: 18,
            marginRight: 1,
            background: colors[c] ?? '#94a3b8',
            borderRadius: 1,
          }}
        />
      ))}
    </div>
  );
}

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
      <p>Sleep duration, efficiency, hypnogram, and quality scores from Firestore.</p>
      {error && <p className="error-note">{error}</p>}
      <ul className="data-list">
        {nights.map((night) => (
          <li key={String(night.id)} style={{ marginBottom: 12 }}>
            <div>
              {Math.round(Number(night.durationMin ?? night.totalMin ?? night.totalSleepMin ?? 0))} min ·
              efficiency {Math.round(Number(night.efficiencyPct ?? night.efficiency ?? night.sleepEfficiency ?? 0))}% ·
              score {Number(night.qualityScore ?? night.score ?? '—')} ·{' '}
              {new Date(Number(night.nightStartMs ?? night.startTimeMs ?? 0)).toLocaleDateString()}
            </div>
            <HypnogramBar compact={String(night.hypnogramCompact ?? '')} />
          </li>
        ))}
      </ul>
      {nights.length === 0 && !error && <p>No sleep entries synced yet.</p>}
    </section>
  );
}
