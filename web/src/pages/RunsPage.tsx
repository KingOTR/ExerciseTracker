import { useEffect, useState } from 'react';
import { listRuns, listStravaPbs } from '../lib/firestoreData';

export function RunsPage() {
  const [runs, setRuns] = useState<Array<Record<string, unknown>>>([]);
  const [pbs, setPbs] = useState<Array<Record<string, unknown>>>([]);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    void (async () => {
      try {
        const [runRows, pbRows] = await Promise.all([listRuns(), listStravaPbs()]);
        setRuns(runRows);
        setPbs(pbRows);
      } catch (e) {
        setError(e instanceof Error ? e.message : 'Failed to load runs');
      }
    })();
  }, []);

  return (
    <section className="section-card">
      <h2>Runs</h2>
      <p>GPS run history and Strava personal bests from Firestore.</p>
      {error && <p className="error-note">{error}</p>}
      <h3>Recent runs ({runs.length})</h3>
      <ul className="data-list">
        {runs.map((run) => (
          <li key={String(run.id)}>
            {String(run.activityType ?? 'RUN')} · {Math.round(Number(run.totalDistanceM ?? 0))} m ·{' '}
            {new Date(Number(run.startedAtMs ?? 0)).toLocaleString()}
          </li>
        ))}
      </ul>
      <h3>Strava PBs ({pbs.length})</h3>
      <ul className="data-list">
        {pbs.map((pb) => (
          <li key={String(pb.id)}>
            {String(pb.label)} · {String(pb.activityKind)} · {Number(pb.timeSec ?? 0)}s
          </li>
        ))}
      </ul>
    </section>
  );
}
