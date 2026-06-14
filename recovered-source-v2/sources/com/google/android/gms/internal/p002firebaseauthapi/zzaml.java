package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaml extends RuntimeException {
    public final zzakf zza() {
        return new zzakf(getMessage());
    }

    public zzaml(zzalc zzalcVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
