import { useEffect } from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { DashboardLayout } from './components/DashboardLayout';
import { ensureAuth } from './lib/firebase';
import { DashboardPage } from './pages/DashboardPage';
import { GymPage } from './pages/GymPage';
import { MapPage } from './pages/MapPage';
import { RecoveryPage } from './pages/RecoveryPage';
import { RunsPage } from './pages/RunsPage';
import { SleepPage } from './pages/SleepPage';
import { SoccerPage } from './pages/SoccerPage';
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
          <Route path="recovery" element={<RecoveryPage />} />
          <Route path="sleep" element={<SleepPage />} />
          <Route path="soccer" element={<SoccerPage />} />
          <Route path="map" element={<MapPage />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}
