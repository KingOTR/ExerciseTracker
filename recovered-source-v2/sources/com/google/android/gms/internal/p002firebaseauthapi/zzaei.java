package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public class zzaei {
    zzadh zza;
    Executor zzb;

    public final <ResultT> Task<ResultT> zza(final zzaek<ResultT> zzaekVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzaeh
            @Override // java.lang.Runnable
            public final void run() {
                zzaekVar.zza(taskCompletionSource, zzaei.this.zza);
            }
        });
        return taskCompletionSource.getTask();
    }
}
