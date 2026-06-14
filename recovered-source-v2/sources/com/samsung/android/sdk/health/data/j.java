package com.samsung.android.sdk.health.data;

import android.database.AbstractWindowedCursor;
import android.database.CursorWindow;
import android.database.StaleDataException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes5.dex */
public final class j extends AbstractWindowedCursor {
    public final t0 a;
    public final String[] b;
    public final boolean c;
    public int d;

    public j(g gVar) {
        this.a = gVar.a;
        this.b = gVar.b;
        this.c = gVar.c;
        this.d = gVar.d;
        CursorWindow cursorWindow = gVar.e;
        if (cursorWindow != null) {
            setWindow(cursorWindow);
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getCount() {
        a();
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onMove(int i, int i2) {
        a();
        try {
            CursorWindow cursorWindow = ((AbstractWindowedCursor) this).mWindow;
            if (cursorWindow != null && i2 >= cursorWindow.getStartPosition() && i2 < ((AbstractWindowedCursor) this).mWindow.getStartPosition() + ((AbstractWindowedCursor) this).mWindow.getNumRows()) {
                if (this.c) {
                    this.a.b(i2);
                }
                return ((AbstractWindowedCursor) this).mWindow == null;
            }
            setWindow(this.a.a(i2));
            if (((AbstractWindowedCursor) this).mWindow == null) {
            }
        } catch (RemoteException unused) {
            Log.e("[SHD]BulkCursor", "Unable to get window because the remote process is dead");
            return false;
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final void deactivate() {
        super.deactivate();
        t0 t0Var = this.a;
        if (t0Var != null) {
            try {
                t0Var.deactivate();
            } catch (RemoteException unused) {
                Log.w("[SHD]BulkCursor", "Remote process exception when deactivating");
            }
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        t0 t0Var = this.a;
        if (t0Var != null) {
            try {
                t0Var.close();
            } catch (RemoteException unused) {
                Log.w("[SHD]BulkCursor", "Remote process exception when closing");
            }
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final boolean requery() {
        a();
        try {
            int requery = this.a.requery();
            this.d = requery;
            if (requery != -1) {
                ((AbstractWindowedCursor) this).mPos = -1;
                CursorWindow cursorWindow = ((AbstractWindowedCursor) this).mWindow;
                if (cursorWindow != null) {
                    cursorWindow.close();
                    ((AbstractWindowedCursor) this).mWindow = null;
                }
                super.requery();
                return true;
            }
            deactivate();
            return false;
        } catch (Exception e) {
            Log.e("[SHD]BulkCursor", "Unable to requery because the remote process exception " + e.getMessage());
            deactivate();
            return false;
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final String[] getColumnNames() {
        a();
        return this.b;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final Bundle getExtras() {
        a();
        try {
            return this.a.getExtras();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        a();
        try {
            return this.a.respond(bundle);
        } catch (RemoteException e) {
            Log.w("[SHD]BulkCursor", "respond() threw RemoteException, returning an empty bundle.", e);
            return Bundle.EMPTY;
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getColumnIndex(String str) {
        int i = 0;
        for (String str2 : this.b) {
            if (str2.equalsIgnoreCase(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void a() {
        if (this.a == null) {
            throw new StaleDataException("Attempted to access a cursor after it has been closed.");
        }
    }
}
