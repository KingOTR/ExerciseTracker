package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.auth.internal.zzaw;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzx implements zzaw, com.google.firebase.auth.internal.zzj {
    private final /* synthetic */ FirebaseAuth zza;

    zzx(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final void zza(zzagl zzaglVar, FirebaseUser firebaseUser) {
        this.zza.zza(firebaseUser, zzaglVar, true, true);
    }

    @Override // com.google.firebase.auth.internal.zzaw
    public final void zza(Status status) {
        int statusCode = status.getStatusCode();
        if (statusCode == 17011 || statusCode == 17021 || statusCode == 17005) {
            this.zza.signOut();
        }
    }
}
