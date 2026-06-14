import { NavLink, Outlet } from 'react-router-dom';
import { AuthPanel } from './AuthPanel';

const sections = [
  { to: '/', label: 'Dashboard', end: true },
  { to: '/runs', label: 'Runs' },
  { to: '/gym', label: 'Gym' },
  { to: '/recovery', label: 'Recovery' },
  { to: '/sleep', label: 'Sleep' },
  { to: '/soccer', label: 'Soccer' },
  { to: '/map', label: 'Map' },
];

export function DashboardLayout() {
  return (
    <div className="layout">
      <header className="header">
        <h1>Exercise Tracker</h1>
        <p className="subtitle">Web dashboard — exercise-tracker-2936d</p>
      </header>
      <nav className="nav">
        {sections.map((s) => (
          <NavLink key={s.to} to={s.to} end={s.end} className={({ isActive }) => (isActive ? 'nav-link active' : 'nav-link')}>
            {s.label}
          </NavLink>
        ))}
      </nav>
      <main className="main">
        <Outlet />
        <AuthPanel />
      </main>
    </div>
  );
}
