import { FormEvent, useState } from 'react';
import { createAccount, isFirebaseConfigured, signIn, watchAuth } from '../lib/firebase';
import type { User } from 'firebase/auth';
import { useEffect } from 'react';

export function AuthPanel() {
  const [user, setUser] = useState<User | null>(null);
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState<string | null>(null);
  const [busy, setBusy] = useState(false);

  useEffect(() => watchAuth(setUser), []);

  async function onSubmit(e: FormEvent, mode: 'signin' | 'create') {
    e.preventDefault();
    if (!isFirebaseConfigured) {
      setError('Set VITE_FIREBASE_APP_ID in web/.env (Web app ID from Firebase Console).');
      return;
    }
    if (password.length < 6) {
      setError('Password must be at least 6 characters.');
      return;
    }
    setBusy(true);
    setError(null);
    try {
      if (mode === 'signin') await signIn(email, password);
      else await createAccount(email, password);
    } catch (err) {
      setError(err instanceof Error ? err.message : 'Auth failed');
    } finally {
      setBusy(false);
    }
  }

  if (user) {
    return (
      <section className="section-card auth-card">
        <h2>Signed in</h2>
        <p className="muted">{user.email}</p>
        <p className="muted">Same email as the Android app — cloud sync enabled.</p>
      </section>
    );
  }

  return (
    <section className="section-card auth-card">
      <h2>Your account</h2>
      <p className="muted">Same email as the Android app.</p>
      {!isFirebaseConfigured && (
        <p className="error">Web Firebase app ID missing — add VITE_FIREBASE_APP_ID to web/.env before deploy.</p>
      )}
      <form className="auth-form" onSubmit={(e) => onSubmit(e, 'signin')}>
        <label>
          Email
          <input type="email" value={email} onChange={(e) => setEmail(e.target.value)} required />
        </label>
        <label>
          Password (6+ chars)
          <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} required minLength={6} />
        </label>
        {error && <p className="error">{error}</p>}
        <div className="auth-actions">
          <button type="submit" disabled={busy}>
            Sign in
          </button>
          <button
            type="button"
            disabled={busy}
            onClick={async () => {
              const fake = { preventDefault: () => {} } as FormEvent;
              await onSubmit(fake, 'create');
            }}
          >
            Create account
          </button>
        </div>
      </form>
    </section>
  );
}
