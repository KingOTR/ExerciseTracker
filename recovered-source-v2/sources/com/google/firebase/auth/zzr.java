package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzr implements com.google.firebase.auth.internal.zzat {
    private final /* synthetic */ FirebaseUser zza;
    private final /* synthetic */ FirebaseAuth zzb;

    zzr(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.zza = firebaseUser;
        this.zzb = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzat
    public final void zza() {
        FirebaseUser firebaseUser;
        FirebaseUser firebaseUser2;
        firebaseUser = this.zzb.zzf;
        if (firebaseUser != null) {
            firebaseUser2 = this.zzb.zzf;
            if (firebaseUser2.getUid().equalsIgnoreCase(this.zza.getUid())) {
                this.zzb.zzh();
            }
        }
    }

    @Override // com.google.firebase.auth.internal.zzaw
    public final void zza(Status status) {
        if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005) {
            this.zzb.signOut();
        }
    }
}
