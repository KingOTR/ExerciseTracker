import { useEffect } from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { DashboardLayout } from './components/DashboardLayout';
import { ensureAuth } from './lib/firebase';
import { DashboardPage } from './pages/DashboardPage';
import { GymPage } from './pages/GymPage';
import { RunsPage } from './pages/RunsPage';
import { SectionPage } from './pages/SectionPage';
import './App.css';

export default function App() {
  useEffect(() => {
    void ensureAuth();
  }, []);

  return (
    <BrowserRouter>
      <Routes>
        <Route element={<DashboardLayout />}>
          <Route index element={<DashboardPage />} />
          <Route path="runs" element={<RunsPage />} />
          <Route path="gym" element={<GymPage />} />
          <Route path="recovery" element={<SectionPage title="Recovery" description="Composite load from runs, gym, soccer, and daily steps." />} />
          <Route path="sleep" element={<SectionPage title="Sleep" description="Sleep duration, efficiency, and quality scores." />} />
          <Route path="soccer" element={<SectionPage title="Soccer" description="Matches and training sessions with intensity tracking." />} />
          <Route path="map" element={<SectionPage title="Map" description="Leaflet map view for routes and regions (offline on Android)." />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}
