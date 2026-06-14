/** Shared TypeScript types derived from export.json / JSON schemas */

export interface GymSet {
  exerciseName: string;
  setIndex: number;
  reps?: number | null;
  weightKg?: number | null;
  loggedAtMs?: number | null;
}

export interface GymSession {
  id: number;
  startedAtMs: number;
  endedAtMs?: number | null;
  freeDay?: boolean;
  sets: GymSet[];
}

export interface KmSplit {
  kind: 'KM' | 'MILE';
  idx: number;
  durationMs: number;
  distanceM: number;
}

export interface Run {
  id: number;
  startedAtMs: number;
  endedAtMs?: number | null;
  distanceM: number;
  durationMs: number;
  activityType: 'RUN' | 'BIKE' | 'WALK' | string;
  hrSamples?: unknown[];
  kmSplits: KmSplit[];
}

export interface SoccerSession {
  id: number;
  kind: 'MATCH' | 'TRAINING';
  startTimeMs: number;
  playMin: number;
  intensity: number;
  notes?: string | null;
  watchSessionId?: number | null;
}

export interface SleepRecord {
  startTimeMs: number;
  endTimeMs: number;
  totalSleepMin: number;
  sleepEfficiency?: number | null;
  sleepQuality?: number | null;
  source?: 'health_connect' | 'samsung_health' | 'rungps_overnight' | string | null;
}

export * from './muscles';

export interface ExerciseTrackerExport {
  exportedAtMs: number;
  version: number;
  gymSessions: GymSession[];
  runs: Run[];
  soccerSessions: SoccerSession[];
  sleep: SleepRecord[];
}
