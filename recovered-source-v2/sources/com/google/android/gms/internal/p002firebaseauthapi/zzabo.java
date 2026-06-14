package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.internal.zzj;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzabo extends zzady<Void, zzj> {
    private final MultiFactorAssertion zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    public zzabo(MultiFactorAssertion multiFactorAssertion, String str, String str2, String str3) {
        super(2);
        this.zzu = (MultiFactorAssertion) Preconditions.checkNotNull(multiFactorAssertion);
        this.zzv = Preconditions.checkNotEmpty(str);
        this.zzw = str2;
        this.zzx = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        ((zzj) this.zze).zza(this.zzj, zzabj.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
