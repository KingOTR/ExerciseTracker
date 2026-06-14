package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzas {
    public static final /* synthetic */ Deferred zza(Task task) {
        final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                CompletableDeferred$default.completeExceptionally(exception);
            } else if (task.isCanceled()) {
                Job.DefaultImpls.cancel$default((Job) CompletableDeferred$default, (CancellationException) null, 1, (Object) null);
            } else {
                CompletableDeferred$default.complete(task.getResult());
            }
        } else {
            task.addOnCompleteListener(zzo.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzaq
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    CompletableDeferred completableDeferred = CompletableDeferred.this;
                    Exception exception2 = task2.getException();
                    if (exception2 != null) {
                        completableDeferred.completeExceptionally(exception2);
                    } else if (task2.isCanceled()) {
                        Job.DefaultImpls.cancel$default((Job) completableDeferred, (CancellationException) null, 1, (Object) null);
                    } else {
                        completableDeferred.complete(task2.getResult());
                    }
                }
            });
        }
        return new zzar(CompletableDeferred$default);
    }
}
