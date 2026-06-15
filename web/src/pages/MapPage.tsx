import { useEffect, useMemo, useState } from 'react';
import { MapContainer, Marker, Polyline, TileLayer } from 'react-leaflet';
import { listRuns } from '../lib/firestoreData';
import 'leaflet/dist/leaflet.css';

type RunRow = Record<string, unknown>;

export function MapPage() {
  const [runs, setRuns] = useState<RunRow[]>([]);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    void (async () => {
      try {
        setRuns(await listRuns(20));
      } catch (e) {
        setError(e instanceof Error ? e.message : 'Failed to load map data');
      }
    })();
  }, []);

  const center = useMemo(() => {
    for (const run of runs) {
      const pts = run.points as Array<{ lat?: number; lon?: number }> | undefined;
      const first = pts?.[0];
      if (first?.lat != null && first?.lon != null) return [first.lat, first.lon] as [number, number];
    }
    return [-33.8688, 151.2093] as [number, number];
  }, [runs]);

  return (
    <section className="section-card">
      <h2>Map</h2>
      <p>Leaflet view of recent run routes from Firestore (offline maps on Android).</p>
      {error && <p className="error-note">{error}</p>}
      <div style={{ height: 420, borderRadius: 12, overflow: 'hidden' }}>
        <MapContainer center={center} zoom={12} style={{ height: '100%', width: '100%' }}>
          <TileLayer url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png" attribution="© OpenStreetMap" />
          {runs.map((run) => {
            const pts = (run.points as Array<{ lat?: number; lon?: number }> | undefined) ?? [];
            const latLngs = pts
              .filter((p) => p.lat != null && p.lon != null)
              .map((p) => [p.lat as number, p.lon as number] as [number, number]);
            if (latLngs.length < 2) return null;
            return (
              <Polyline key={String(run.id)} positions={latLngs} pathOptions={{ color: '#1565c0', weight: 4 }} />
            );
          })}
          <Marker position={center} />
        </MapContainer>
      </div>
      <p style={{ marginTop: '0.75rem' }}>{runs.length} recent runs loaded.</p>
    </section>
  );
}
