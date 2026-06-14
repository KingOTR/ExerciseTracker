package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzw implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ FirebaseAuth zzb;

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<GetTokenResult> task) throws Exception {
        zzabj zzabjVar;
        String str;
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) Preconditions.checkNotNull(task.getException()));
        }
        zzabjVar = this.zzb.zze;
        String str2 = this.zza;
        String str3 = (String) Preconditions.checkNotNull(task.getResult().getToken());
        str = this.zzb.zzk;
        return zzabjVar.zza(str2, str3, "apple.com", str);
    }

    zzw(FirebaseAuth firebaseAuth, String str) {
        this.zza = str;
        this.zzb = firebaseAuth;
    }
}
