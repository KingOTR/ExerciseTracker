import { useEffect, useState } from 'react';
import { listGymSessions, listRecoveryEvents, listRuns, listSleepEntries } from '../lib/firestoreData';

export function DashboardPage() {
  const [summary, setSummary] = useState({
    runs: 0,
    gym: 0,
    sleep: 0,
    recovery: 0,
  });

  useEffect(() => {
    void (async () => {
      const [runs, gym, sleep, recovery] = await Promise.all([
        listRuns(10),
        listGymSessions(10),
        listSleepEntries(7),
        listRecoveryEvents(10),
      ]);
      setSummary({ runs: runs.length, gym: gym.length, sleep: sleep.length, recovery: recovery.length });
    })();
  }, []);

  return (
    <section className="section-card">
      <h2>Dashboard</h2>
      <p>Live Firestore snapshot for the signed-in user.</p>
      <div className="stat-grid">
        <div className="stat-card"><strong>{summary.runs}</strong><span>Recent runs</span></div>
        <div className="stat-card"><strong>{summary.gym}</strong><span>Gym sessions</span></div>
        <div className="stat-card"><strong>{summary.sleep}</strong><span>Sleep nights</span></div>
        <div className="stat-card"><strong>{summary.recovery}</strong><span>Recovery events</span></div>
      </div>
    </section>
  );
}
