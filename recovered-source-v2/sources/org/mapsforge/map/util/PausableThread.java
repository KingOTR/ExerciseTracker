package org.mapsforge.map.util;

/* loaded from: classes5.dex */
public abstract class PausableThread extends Thread {
    private boolean pausing;
    private boolean shouldPause;
    private boolean shouldStop;
    protected boolean waitForWork;

    protected void afterRun() {
    }

    protected abstract void doWork() throws InterruptedException;

    protected abstract ThreadPriority getThreadPriority();

    protected abstract boolean hasWork();

    /* JADX INFO: Access modifiers changed from: protected */
    public enum ThreadPriority {
        ABOVE_NORMAL(7),
        BELOW_NORMAL(3),
        HIGHEST(10),
        LOWEST(1),
        NORMAL(5);

        final int priority;

        ThreadPriority(int i) {
            if (i < 1 || i > 10) {
                throw new IllegalArgumentException("invalid priority: " + i);
            }
            this.priority = i;
        }
    }

    public final void awaitPausing() {
        synchronized (this) {
            while (!isInterrupted() && !isPausing()) {
                try {
                    wait(100L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final synchronized void finish() {
        this.shouldStop = true;
        interrupt();
    }

    @Override // java.lang.Thread
    public void interrupt() {
        synchronized (this) {
            super.interrupt();
        }
    }

    public final synchronized boolean isPausing() {
        return this.pausing;
    }

    public final synchronized void pause() {
        if (!this.shouldPause) {
            this.shouldPause = true;
            notify();
        }
    }

    public final synchronized void proceed() {
        if (this.shouldPause) {
            this.shouldPause = false;
            this.pausing = false;
            notify();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName(getClass().getSimpleName());
        setPriority(getThreadPriority().priority);
        while (true) {
            if ((this.shouldStop || isInterrupted()) && (!this.waitForWork || !hasWork())) {
                break;
            }
            synchronized (this) {
                while (!this.shouldStop && !isInterrupted() && (this.shouldPause || !hasWork())) {
                    try {
                        if (this.shouldPause) {
                            this.pausing = true;
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        interrupt();
                    }
                }
            }
            if ((this.shouldStop || isInterrupted()) && (!this.waitForWork || !hasWork())) {
                break;
            }
            try {
                doWork();
            } catch (InterruptedException unused2) {
                interrupt();
            }
        }
        afterRun();
    }
}
