package com.samsung.android.sdk.health.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.IInterface;

/* loaded from: classes5.dex */
public interface t0 extends IInterface {
    CursorWindow a(int i);

    void b(int i);

    void close();

    void deactivate();

    Bundle getExtras();

    int requery();

    Bundle respond(Bundle bundle);
}
