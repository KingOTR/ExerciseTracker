import { useEffect, useState } from 'react';
import { listRecoveryEvents } from '../lib/firestoreData';

export function RecoveryPage() {
  const [events, setEvents] = useState<Array<Record<string, unknown>>>([]);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    void (async () => {
      try {
        setEvents(await listRecoveryEvents());
      } catch (e) {
        setError(e instanceof Error ? e.message : 'Failed to load recovery');
      }
    })();
  }, []);

  return (
    <section className="section-card">
      <h2>Recovery</h2>
      <p>Composite muscle load events from runs, gym, soccer, and daily steps.</p>
      {error && <p className="error-note">{error}</p>}
      <ul className="data-list">
        {events.map((ev) => (
          <li key={String(ev.id)}>
            {String(ev.muscleId ?? ev.label ?? 'load')} · score {Number(ev.score ?? ev.load ?? 0).toFixed(1)} ·{' '}
            {new Date(Number(ev.atMs ?? 0)).toLocaleString()}
          </li>
        ))}
      </ul>
      {events.length === 0 && !error && <p>No recovery events synced yet.</p>}
    </section>
  );
}
