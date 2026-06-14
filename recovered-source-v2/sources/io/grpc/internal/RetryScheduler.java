package io.grpc.internal;

/* loaded from: classes5.dex */
public interface RetryScheduler {
    void reset();

    void schedule(Runnable runnable);
}
