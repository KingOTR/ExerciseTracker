package com.samsung.android.sdk.health.data.internal;

import com.samsung.android.sdk.health.data.error.ErrorCode;
import com.samsung.android.sdk.health.data.error.PlatformInternalException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class c {
    public static final c d = new c();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public long b = 0;
    public final b c = new b(this);

    public static void a() {
        Iterator it = d.a.entrySet().iterator();
        PlatformInternalException platformInternalException = new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_PLATFORM_DISCONNECTED), "Service is down, please try again after a while");
        while (it.hasNext()) {
            ((com.samsung.android.sdk.health.data.b) ((Map.Entry) it.next()).getValue()).a(platformInternalException);
            it.remove();
        }
    }
}
