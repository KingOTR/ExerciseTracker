import { initializeApp } from 'firebase/app';
import {
  createUserWithEmailAndPassword,
  getAuth,
  onAuthStateChanged,
  signInWithEmailAndPassword,
  signOut,
  type User,
} from 'firebase/auth';
import { getFirestore } from 'firebase/firestore';

/**
 * From google-services.json + strings.xml (Android v0.7.93).
 * Copy the Web app `appId` from Firebase Console → Project settings → Your apps → Web.
 * into web/.env as VITE_FIREBASE_APP_ID=
 */
const firebaseConfig = {
  apiKey: import.meta.env.VITE_FIREBASE_API_KEY ?? 'AIzaSyA5i_DnEJgUSN5MhUVr7PmM0lSXUJickew',
  authDomain: import.meta.env.VITE_FIREBASE_AUTH_DOMAIN ?? 'exercise-tracker-2936d.firebaseapp.com',
  projectId: import.meta.env.VITE_FIREBASE_PROJECT_ID ?? 'exercise-tracker-2936d',
  storageBucket: import.meta.env.VITE_FIREBASE_STORAGE_BUCKET ?? 'exercise-tracker-2936d.firebasestorage.app',
  messagingSenderId: import.meta.env.VITE_FIREBASE_MESSAGING_SENDER_ID ?? '40353237709',
  appId: import.meta.env.VITE_FIREBASE_APP_ID ?? '',
};

export const isFirebaseConfigured = Boolean(firebaseConfig.appId);

const app = initializeApp(
  isFirebaseConfigured ? firebaseConfig : { ...firebaseConfig, appId: '1:40353237709:web:unset' },
);
export const auth = getAuth(app);
export const db = getFirestore(app);

export function watchAuth(callback: (user: User | null) => void): () => void {
  return onAuthStateChanged(auth, callback);
}

export async function signIn(email: string, password: string): Promise<User> {
  const cred = await signInWithEmailAndPassword(auth, email, password);
  return cred.user;
}

export async function createAccount(email: string, password: string): Promise<User> {
  const cred = await createUserWithEmailAndPassword(auth, email, password);
  return cred.user;
}

export async function logOut(): Promise<void> {
  await signOut(auth);
}

export async function ensureAuth(): Promise<User | null> {
  return auth.currentUser;
}
