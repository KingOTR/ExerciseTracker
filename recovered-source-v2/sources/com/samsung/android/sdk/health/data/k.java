package com.samsung.android.sdk.health.data;

import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.database.MatrixCursor;
import android.database.StaleDataException;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes5.dex */
public final class k extends h {
    public final Object b = new Object();
    public final String c = "PHD";
    public CrossProcessCursor d;
    public CursorWindow e;
    public final int f;

    public k(MatrixCursor matrixCursor, int i) {
        this.d = matrixCursor;
        this.f = i;
    }

    public final void a() {
        CursorWindow window;
        CursorWindow cursorWindow = this.e;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.e = null;
        }
        CrossProcessCursor crossProcessCursor = this.d;
        if (crossProcessCursor == null || (window = crossProcessCursor.getWindow()) == null) {
            return;
        }
        window.close();
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final void b(int i) {
        synchronized (this.b) {
            b();
            CrossProcessCursor crossProcessCursor = this.d;
            crossProcessCursor.onMove(crossProcessCursor.getPosition(), i);
        }
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final void deactivate() {
        synchronized (this.b) {
            CrossProcessCursor crossProcessCursor = this.d;
            if (crossProcessCursor != null) {
                crossProcessCursor.deactivate();
            }
            a();
        }
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final void close() {
        synchronized (this.b) {
            a();
            CrossProcessCursor crossProcessCursor = this.d;
            if (crossProcessCursor != null) {
                crossProcessCursor.close();
                this.d = null;
            }
        }
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final int requery() {
        synchronized (this.b) {
            b();
            a();
            try {
                if (!this.d.requery()) {
                    return -1;
                }
                return this.d.getCount();
            } catch (IllegalStateException e) {
                throw new IllegalStateException(this.c + " Requery misuse db, mCursor isClosed:" + this.d.isClosed(), e);
            }
        }
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final CursorWindow a(int i) {
        synchronized (this.b) {
            b();
            if (!this.d.moveToPosition(i)) {
                a();
                return null;
            }
            CursorWindow window = this.d.getWindow();
            if (window == null) {
                long j = this.f;
                if (j < PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED) {
                    this.e = new CursorWindow(this.c, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED);
                } else if (j < 8388608) {
                    this.e = new CursorWindow(this.c, 8388608L);
                } else if (j < 16777216) {
                    this.e = new CursorWindow(this.c, 16777216L);
                } else {
                    this.e = new CursorWindow(this.c, 33554432L);
                }
                window = this.e;
            } else if (i < window.getStartPosition() || i >= window.getStartPosition() + window.getNumRows()) {
                window.clear();
            }
            this.d.fillWindow(i, window);
            window.acquireReference();
            return window;
        }
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final Bundle getExtras() {
        Bundle extras;
        synchronized (this.b) {
            b();
            extras = this.d.getExtras();
        }
        return extras;
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final Bundle respond(Bundle bundle) {
        Bundle respond;
        synchronized (this.b) {
            b();
            respond = this.d.respond(bundle);
        }
        return respond;
    }

    public final void b() {
        if (this.d == null) {
            throw new StaleDataException("Attempted to access a cursor after it has been closed.");
        }
    }
}
