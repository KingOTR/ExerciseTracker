package org.mapsforge.map.layer.hills;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class LatchedLazyFuture<X> implements Future<X> {
    private volatile X result;
    private volatile Thread thread;
    private static final ExecutionException STARTED = new DummyExecutionException("started");
    private static final ExecutionException CANCELLED = new DummyExecutionException("cancelled");
    private static final ExecutionException DONE = new DummyExecutionException("done");
    private final AtomicReference<ExecutionException> state = new AtomicReference<>(null);
    private final CountDownLatch latch = new CountDownLatch(1);

    protected abstract X calculate() throws ExecutionException, InterruptedException;

    private static class DummyExecutionException extends ExecutionException {
        DummyExecutionException(String str) {
            super(str, null);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return null;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "[state marker " + getMessage() + "]";
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Thread thread;
        ExecutionException executionException = this.state.get();
        ExecutionException executionException2 = CANCELLED;
        if (executionException == executionException2) {
            return true;
        }
        if (this.state.get() == DONE) {
            return false;
        }
        if (z && (thread = this.thread) != null && MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.state, STARTED, executionException2)) {
            thread.interrupt();
            return true;
        }
        return MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.state, null, executionException2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.state.get() == CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        ExecutionException executionException = this.state.get();
        return (executionException == null || executionException == STARTED) ? false : true;
    }

    @Override // java.util.concurrent.Future
    public X get() throws InterruptedException, ExecutionException {
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.state, null, STARTED)) {
            internalCalc();
        } else {
            this.latch.await();
        }
        throwIfException();
        return this.result;
    }

    private void throwIfException() throws ExecutionException {
        ExecutionException executionException = this.state.get();
        if (executionException != null && !(executionException instanceof DummyExecutionException)) {
            throw executionException;
        }
    }

    @Override // java.util.concurrent.Future
    public X get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.state, null, STARTED)) {
            internalCalc();
        } else {
            this.latch.await(j, timeUnit);
        }
        throwIfException();
        return this.result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.mapsforge.map.layer.hills.LatchedLazyFuture, org.mapsforge.map.layer.hills.LatchedLazyFuture<X>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [org.mapsforge.map.layer.hills.LatchedLazyFuture] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.concurrent.CountDownLatch] */
    public void internalCalc() throws ExecutionException, InterruptedException {
        this.thread = Thread.currentThread();
        try {
            try {
                this.result = (X) calculate();
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.state, STARTED, DONE);
            } catch (RuntimeException e) {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.state, STARTED, new ExecutionException(e));
            } catch (ExecutionException e2) {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.state, STARTED, e2);
            }
        } finally {
            this.thread = null;
            this.latch.countDown();
        }
    }

    public LatchedLazyFuture<X> withRunningThread() {
        if (this.state.get() != DONE && MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.state, null, STARTED)) {
            new Thread(getClass().getName() + ".withRunningThread") { // from class: org.mapsforge.map.layer.hills.LatchedLazyFuture.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        LatchedLazyFuture.this.internalCalc();
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
        return this;
    }
}
