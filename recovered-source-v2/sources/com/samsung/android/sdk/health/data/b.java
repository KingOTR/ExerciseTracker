package com.samsung.android.sdk.health.data;

import android.os.Looper;
import com.samsung.android.sdk.health.data.error.ErrorCode;
import com.samsung.android.sdk.health.data.error.HealthDataException;
import com.samsung.android.sdk.health.data.error.PlatformInternalException;
import com.samsung.android.sdk.health.data.response.AsyncCompletableFuture;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
public final class b extends FutureTask implements AsyncCompletableFuture {
    public Runnable a;
    public Consumer b;
    public Executor c;
    public boolean d;
    public final String e;

    public static /* synthetic */ Void b() {
        throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), "This callable should not be invoked");
    }

    public b(String str) {
        super(new Callable() { // from class: com.samsung.android.sdk.health.data.b$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b.b();
            }
        });
        this.e = str;
    }

    @Override // com.samsung.android.sdk.health.data.response.AsyncCompletableFuture
    public final void await() {
        try {
            get();
        } catch (InterruptedException e) {
            if (this.d) {
                throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERRUPTED), (String) Objects.requireNonNull(e.getMessage()), e);
            }
            throw e;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof HealthDataException) {
                throw ((HealthDataException) cause);
            }
            throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), (String) Objects.requireNonNull(e2.getMessage()), e2);
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        Executor executor;
        Runnable runnable = this.a;
        if (runnable == null || (executor = this.c) == null) {
            return;
        }
        a(executor, runnable, this.b);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.d = true;
        return super.cancel(z);
    }

    @Override // com.samsung.android.sdk.health.data.response.AsyncCompletableFuture
    public final void setCallback(Looper looper, Runnable runnable, Consumer consumer) {
        setCallback(a2.a(looper), runnable, consumer);
    }

    public final void a() {
        set(null);
    }

    @Override // com.samsung.android.sdk.health.data.response.AsyncCompletableFuture
    public final void await(long j, TimeUnit timeUnit) {
        try {
            get(j, timeUnit);
        } catch (InterruptedException e) {
            if (this.d) {
                throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERRUPTED), (String) Objects.requireNonNull(e.getMessage()), e);
            }
            throw e;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof HealthDataException) {
                throw ((HealthDataException) cause);
            }
            throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), (String) Objects.requireNonNull(e2.getMessage()), e2);
        }
    }

    @Override // com.samsung.android.sdk.health.data.response.AsyncCompletableFuture
    public final void setCallback(Executor executor, Runnable runnable, Consumer consumer) {
        if (isDone()) {
            a(executor, runnable, consumer);
            return;
        }
        this.c = executor;
        this.a = runnable;
        this.b = consumer;
    }

    public final void a(Throwable th) {
        setException(th);
    }

    public final /* synthetic */ void a(Consumer consumer, Runnable runnable) {
        try {
            get();
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            if (this.d) {
                consumer.accept(new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERRUPTED), (String) Objects.requireNonNull(e.getMessage()), e));
            }
            consumer.accept(e);
        } catch (CancellationException unused) {
            consumer.accept(new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERRUPTED), "Operation is cancelled."));
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof HealthDataException) {
                consumer.accept(cause);
            } else {
                consumer.accept(new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), (String) Objects.requireNonNull(e2.getMessage()), e2));
            }
        }
    }

    public final void a(Executor executor, final Runnable runnable, final Consumer consumer) {
        executor.execute(new Runnable() { // from class: com.samsung.android.sdk.health.data.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(consumer, runnable);
            }
        });
    }
}
