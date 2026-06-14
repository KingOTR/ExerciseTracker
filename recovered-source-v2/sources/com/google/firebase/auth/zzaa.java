package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzaa implements Continuation<RecaptchaTasksClient, Task<Void>> {
    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<RecaptchaTasksClient> task) throws Exception {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new FirebaseAuthException("INTERNAL_ERROR", com.google.android.gms.internal.p002firebaseauthapi.zzag.zzb(exception != null ? exception.getMessage() : "")));
    }

    zzaa(FirebaseAuth firebaseAuth) {
    }
}
