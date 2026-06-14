package com.samsung.android.sdk.health.data.response;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J(\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00100\u000fH&J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00100\u000fH&¨\u0006\u0013"}, d2 = {"Lcom/samsung/android/sdk/health/data/response/AsyncCompletableFuture;", "Ljava/util/concurrent/Future;", "Ljava/lang/Void;", "await", "", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "setCallback", "looper", "Landroid/os/Looper;", "onCompleted", "Ljava/lang/Runnable;", "onError", "Ljava/util/function/Consumer;", "", "executor", "Ljava/util/concurrent/Executor;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AsyncCompletableFuture extends Future<Void> {
    void await() throws InterruptedException;

    void await(long timeout, TimeUnit unit) throws InterruptedException, TimeoutException;

    void setCallback(Looper looper, Runnable onCompleted, Consumer<? super Throwable> onError);

    void setCallback(Executor executor, Runnable onCompleted, Consumer<? super Throwable> onError);
}
