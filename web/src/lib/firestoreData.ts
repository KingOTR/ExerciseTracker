import {
  collection,
  doc,
  getDocs,
  limit,
  orderBy,
  query,
  type DocumentData,
} from 'firebase/firestore';
import { auth, db } from './firebase';

export function currentUid(): string | null {
  return auth.currentUser?.uid ?? null;
}

export async function listSoccerSessions(max = 20): Promise<DocumentData[]> {
  const uid = currentUid();
  if (!uid) return [];
  const snap = await getDocs(
    query(collection(db, 'users', uid, 'soccer_sessions'), orderBy('startTimeMs', 'desc'), limit(max)),
  );
  return snap.docs.map((d) => ({ id: d.id, ...d.data() }));
}

export async function listRuns(max = 50): Promise<DocumentData[]> {
  const uid = currentUid();
  if (!uid) return [];
  const snap = await getDocs(
    query(collection(db, 'users', uid, 'runs'), orderBy('startedAtMs', 'desc'), limit(max)),
  );
  return snap.docs.map((d) => ({ id: d.id, ...d.data() }));
}

export async function listGymSessions(max = 30): Promise<DocumentData[]> {
  const uid = currentUid();
  if (!uid) return [];
  const snap = await getDocs(
    query(collection(db, 'users', uid, 'gym_sessions'), orderBy('startedAtMs', 'desc'), limit(max)),
  );
  return snap.docs.map((d) => ({ id: d.id, ...d.data() }));
}

export async function listStravaPbs(): Promise<DocumentData[]> {
  const uid = currentUid();
  if (!uid) return [];
  const snap = await getDocs(collection(db, 'users', uid, 'strava_pbs'));
  return snap.docs.map((d) => ({ id: d.id, ...d.data() }));
}

export async function listSleepEntries(max = 14): Promise<DocumentData[]> {
  const uid = currentUid();
  if (!uid) return [];
  const snap = await getDocs(
    query(collection(db, 'users', uid, 'sleep_entries'), orderBy('nightStartMs', 'desc'), limit(max)),
  );
  return snap.docs.map((d) => ({ id: d.id, ...d.data() }));
}

export async function listRecoveryEvents(max = 20): Promise<DocumentData[]> {
  const uid = currentUid();
  if (!uid) return [];
  const snap = await getDocs(
    query(collection(db, 'users', uid, 'recovery_events'), orderBy('atMs', 'desc'), limit(max)),
  );
  return snap.docs.map((d) => ({ id: d.id, ...d.data() }));
}

export async function readStravaMeta(): Promise<DocumentData | null> {
  const uid = currentUid();
  if (!uid) return null;
  const snap = await getDocs(collection(db, 'users', uid, 'meta'));
  const strava = snap.docs.find((d) => d.id === 'strava');
  return strava ? strava.data() : null;
}

export async function readBodyProfile(): Promise<DocumentData | null> {
  const uid = currentUid();
  if (!uid) return null;
  const ref = doc(db, 'users', uid, 'prefs', 'body_profile');
  const snap = await getDocs(query(collection(db, 'users', uid, 'prefs'), limit(5)));
  const profile = snap.docs.find((d) => d.id === 'body_profile');
  return profile ? profile.data() : null;
}
