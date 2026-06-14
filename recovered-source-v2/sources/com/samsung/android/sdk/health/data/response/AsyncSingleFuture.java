package com.samsung.android.sdk.health.data.response;

import android.os.Looper;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\r\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦\u0002¢\u0006\u0002\u0010\tJ0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00110\u000fH&J0\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00110\u000fH&¨\u0006\u0014"}, d2 = {"Lcom/samsung/android/sdk/health/data/response/AsyncSingleFuture;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/Future;", "get", "()Ljava/lang/Object;", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "setCallback", "", "looper", "Landroid/os/Looper;", "onSuccess", "Ljava/util/function/Consumer;", "onError", "", "executor", "Ljava/util/concurrent/Executor;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AsyncSingleFuture<T> extends Future<T> {
    @Override // java.util.concurrent.Future, com.samsung.android.sdk.health.data.response.AsyncSingleFuture
    T get() throws InterruptedException;

    @Override // java.util.concurrent.Future, com.samsung.android.sdk.health.data.response.AsyncSingleFuture
    T get(long timeout, TimeUnit unit) throws InterruptedException, TimeoutException;

    void setCallback(Looper looper, Consumer<? super T> onSuccess, Consumer<? super Throwable> onError);

    void setCallback(Executor executor, Consumer<? super T> onSuccess, Consumer<? super Throwable> onError);
}
