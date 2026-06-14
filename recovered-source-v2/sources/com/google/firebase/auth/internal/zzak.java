package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.MultiFactorSession;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzak implements Continuation<GetTokenResult, Task<MultiFactorSession>> {
    private final /* synthetic */ zzah zza;

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<MultiFactorSession> then(Task<GetTokenResult> task) throws Exception {
        zzad zzadVar;
        if (!task.isSuccessful()) {
            return Tasks.forException(task.getException());
        }
        String token = task.getResult().getToken();
        zzadVar = this.zza.zza;
        return Tasks.forResult(zzao.zza(token, zzadVar));
    }

    zzak(zzah zzahVar) {
        this.zza = zzahVar;
    }
}
