export interface MuscleLoad {
  muscleId: string;
  percent: number;
}

export interface MuscleDefinition {
  id: string;
  label: string;
  groupId: string;
  regionId: 'upper' | 'lower' | 'core';
  atlasIds?: string[];
}

export interface ExerciseMapping {
  name: string;
  aliases?: string[];
  loads: MuscleLoad[];
  sources?: string[];
}

export interface CardioActivityMapping {
  id: string;
  label: string;
  aliases?: string[];
  unit: 'per_km' | 'per_minute' | 'per_1000_steps';
  baseLoadPerUnit: number;
  intensityScale?: boolean;
  loads: MuscleLoad[];
  sources?: string[];
}

export interface MuscleVolumeEntry {
  muscleId: string;
  label: string;
  groupId: string;
  regionId: string;
  volume: number;
}

/** Gym: weightKg × reps × (percent / 100) per muscle */
export function distributeSetVolume(
  weightKg: number,
  reps: number,
  loads: MuscleLoad[],
): MuscleVolumeEntry[] {
  const total = weightKg * reps;
  return loads.map((load) => ({
    muscleId: load.muscleId,
    label: load.muscleId,
    groupId: '',
    regionId: 'upper',
    volume: total * (load.percent / 100),
  }));
}

/** Running example: 5 km at baseLoad 1.0 */
export function cardioMuscleLoad(
  units: number,
  baseLoadPerUnit: number,
  loads: MuscleLoad[],
): Record<string, number> {
  const base = units * baseLoadPerUnit;
  return Object.fromEntries(
    loads.map((load) => [load.muscleId, base * (load.percent / 100)]),
  );
}
