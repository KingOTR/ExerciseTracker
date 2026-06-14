package org.mapsforge.map.layer.hills;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public abstract class SyncLazyFuture<X> implements Future<X> {
    private volatile X result;
    private volatile ExecutionException state = null;
    private volatile Thread thread;
    private static final ExecutionException STARTED = new DummyExecutionException("started");
    private static final ExecutionException CANCELLED = new DummyExecutionException("cancelled");
    private static final ExecutionException DONE = new DummyExecutionException("done");

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
        ExecutionException executionException = this.state;
        ExecutionException executionException2 = CANCELLED;
        if (executionException == executionException2) {
            return true;
        }
        if (this.state == DONE) {
            return false;
        }
        if (z && (thread = this.thread) != null && this.state == STARTED) {
            this.state = executionException2;
            thread.interrupt();
            return true;
        }
        boolean z2 = this.state == null;
        this.state = executionException2;
        return z2;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.state == CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.state == null || this.state == STARTED) ? false : true;
    }

    @Override // java.util.concurrent.Future
    public X get() throws InterruptedException, ExecutionException {
        synchronized (this) {
            if (this.state == null) {
                this.state = STARTED;
                internalCalc();
            }
        }
        throwIfException();
        return this.result;
    }

    private void throwIfException() throws ExecutionException {
        ExecutionException executionException = this.state;
        if (executionException != null && !(executionException instanceof DummyExecutionException)) {
            throw executionException;
        }
    }

    @Override // java.util.concurrent.Future
    public X get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        wait();
        return get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalCalc() throws ExecutionException, InterruptedException {
        this.state = STARTED;
        try {
            try {
                this.thread = Thread.currentThread();
                this.result = calculate();
                this.state = DONE;
            } catch (RuntimeException e) {
                this.state = new ExecutionException(e);
            } catch (ExecutionException e2) {
                this.state = e2;
            }
        } finally {
            this.thread = null;
        }
    }

    public SyncLazyFuture<X> withRunningThread() {
        if (this.state != null) {
            return this;
        }
        new Thread(getClass().getName() + ".withRunningThread") { // from class: org.mapsforge.map.layer.hills.SyncLazyFuture.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    SyncLazyFuture.this.internalCalc();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        return this;
    }
}
