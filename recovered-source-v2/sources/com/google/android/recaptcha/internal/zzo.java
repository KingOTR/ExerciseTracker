package com.google.android.recaptcha.internal;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzo implements Executor {
    public static final zzo zza = new zzo();

    private zzo() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
