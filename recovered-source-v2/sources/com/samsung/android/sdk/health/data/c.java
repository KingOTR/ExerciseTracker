package com.samsung.android.sdk.health.data;

import android.os.Looper;
import com.samsung.android.sdk.health.data.error.ErrorCode;
import com.samsung.android.sdk.health.data.error.HealthDataException;
import com.samsung.android.sdk.health.data.error.PlatformInternalException;
import com.samsung.android.sdk.health.data.response.AsyncSingleFuture;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
public final class c extends FutureTask implements AsyncSingleFuture {
    public Consumer a;
    public Consumer b;
    public Executor c;
    public boolean d;
    public final String e;

    public c(String str) {
        super(new Callable() { // from class: com.samsung.android.sdk.health.data.c$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c.a();
            }
        });
        this.e = str;
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future, com.samsung.android.sdk.health.data.response.AsyncSingleFuture
    public final Object get() {
        try {
            return super.get();
        } catch (InterruptedException e) {
            if (!this.d) {
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
        Consumer consumer = this.a;
        if (consumer == null || (executor = this.c) == null) {
            return;
        }
        a(executor, consumer, this.b);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.d = true;
        return super.cancel(z);
    }

    @Override // com.samsung.android.sdk.health.data.response.AsyncSingleFuture
    public final void setCallback(Looper looper, Consumer consumer, Consumer consumer2) {
        setCallback(a2.a(looper), consumer, consumer2);
    }

    public final void a(Throwable th) {
        setException(th);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future, com.samsung.android.sdk.health.data.response.AsyncSingleFuture
    public final Object get(long j, TimeUnit timeUnit) {
        try {
            return super.get(j, timeUnit);
        } catch (InterruptedException e) {
            if (!this.d) {
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

    @Override // com.samsung.android.sdk.health.data.response.AsyncSingleFuture
    public final void setCallback(Executor executor, Consumer consumer, Consumer consumer2) {
        if (isDone()) {
            a(executor, consumer, consumer2);
            return;
        }
        this.c = executor;
        this.a = consumer;
        this.b = consumer2;
    }

    public final /* synthetic */ void a(Consumer consumer, Consumer consumer2) {
        try {
            consumer2.accept(super.get());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            if (this.d) {
                consumer.accept(new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERRUPTED), (String) Objects.requireNonNull(e.getMessage())));
            }
            consumer.accept(new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERRUPTED), (String) Objects.requireNonNull(e.getMessage()), e));
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

    public final void a(Executor executor, final Consumer consumer, final Consumer consumer2) {
        executor.execute(new Runnable() { // from class: com.samsung.android.sdk.health.data.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                c.this.a(consumer2, consumer);
            }
        });
    }

    public final void a(Object obj) {
        set(obj);
    }

    public static /* synthetic */ Object a() {
        throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), "This callable should not be invoked");
    }
}
