package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahh;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.internal.zzcb;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzt implements Continuation<zzahh, Task<TotpSecret>> {
    private final /* synthetic */ FirebaseAuth zza;

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<TotpSecret> then(Task<zzahh> task) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) Preconditions.checkNotNull(task.getException()));
        }
        zzahh result = task.getResult();
        if (result instanceof zzahn) {
            zzahn zzahnVar = (zzahn) result;
            return Tasks.forResult(new zzcb(Preconditions.checkNotEmpty(zzahnVar.zzf()), Preconditions.checkNotEmpty(zzahnVar.zze()), zzahnVar.zzc(), zzahnVar.zzb(), zzahnVar.zzd(), Preconditions.checkNotEmpty(zzahnVar.zza()), this.zza));
        }
        throw new IllegalArgumentException("Response should be an instance of StartTotpMfaEnrollmentResponse but was " + result.getClass().getName() + ".");
    }

    zzt(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }
}
