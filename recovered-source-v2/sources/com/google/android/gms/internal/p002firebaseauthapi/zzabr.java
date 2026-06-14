package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzj;
import com.google.firebase.auth.internal.zzx;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzabr extends zzady<AuthResult, zzj> {
    private final MultiFactorAssertion zzu;
    private final String zzv;
    private final String zzw;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    public zzabr(MultiFactorAssertion multiFactorAssertion, String str, String str2) {
        super(2);
        this.zzu = (MultiFactorAssertion) Preconditions.checkNotNull(multiFactorAssertion);
        this.zzv = Preconditions.checkNotEmpty(str);
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzad zza = zzabj.zza(this.zzc, this.zzk);
        if (this.zzd == null || this.zzd.getUid().equalsIgnoreCase(zza.getUid())) {
            ((zzj) this.zze).zza(this.zzj, zza);
            zzb(new zzx(zza));
        } else {
            zza(new Status(FirebaseError.ERROR_USER_MISMATCH));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzv, this.zzu, this.zzw, this.zzb);
    }
}
