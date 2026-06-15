import { useEffect, useState } from 'react';
import { listSoccerSessions } from '../lib/firestoreData';

export function SoccerPage() {
  const [sessions, setSessions] = useState<Array<Record<string, unknown>>>([]);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    void (async () => {
      try {
        setSessions(await listSoccerSessions());
      } catch (e) {
        setError(e instanceof Error ? e.message : 'Failed to load soccer');
      }
    })();
  }, []);

  return (
    <section className="section-card">
      <h2>Soccer</h2>
      <p>Matches and training sessions with intensity tracking.</p>
      {error && <p className="error-note">{error}</p>}
      <ul className="data-list">
        {sessions.map((s) => (
          <li key={String(s.id)}>
            {String(s.kind ?? 'TRAINING')} · {Number(s.playMin ?? 0)} min · intensity {Number(s.intensity ?? 0)} ·{' '}
            {new Date(Number(s.startTimeMs ?? 0)).toLocaleString()}
          </li>
        ))}
      </ul>
      {sessions.length === 0 && !error && <p>No soccer sessions synced yet.</p>}
    </section>
  );
}
