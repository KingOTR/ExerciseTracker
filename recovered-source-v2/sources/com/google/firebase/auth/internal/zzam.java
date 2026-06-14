package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzam implements Continuation<AuthResult, Task<AuthResult>> {
    private final /* synthetic */ zzaj zza;

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<AuthResult> then(Task<AuthResult> task) throws Exception {
        com.google.firebase.auth.zze zzeVar;
        com.google.firebase.auth.zze zzeVar2;
        com.google.firebase.auth.zze zzeVar3;
        zzeVar = this.zza.zzd;
        if (zzeVar == null) {
            return task;
        }
        if (task.isSuccessful()) {
            AuthResult result = task.getResult();
            zzad zzadVar = (zzad) result.getUser();
            zzv zzvVar = (zzv) result.getAdditionalUserInfo();
            zzeVar3 = this.zza.zzd;
            return Tasks.forResult(new zzx(zzadVar, zzvVar, zzeVar3));
        }
        Exception exception = task.getException();
        if (exception instanceof FirebaseAuthUserCollisionException) {
            zzeVar2 = this.zza.zzd;
            ((FirebaseAuthUserCollisionException) exception).zza(zzeVar2);
        }
        return Tasks.forException(exception);
    }

    zzam(zzaj zzajVar) {
        this.zza = zzajVar;
    }
}
