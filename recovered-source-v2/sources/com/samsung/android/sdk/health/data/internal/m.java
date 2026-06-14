package com.samsung.android.sdk.health.data.internal;

import com.samsung.android.sdk.health.data.error.ErrorCode;
import com.samsung.android.sdk.health.data.error.PlatformInternalException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: classes5.dex */
public final class m {
    public static final m d = new m();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public long b = 0;
    public final k c = new k(this);

    public static void a() {
        Iterator it = d.a.entrySet().iterator();
        PlatformInternalException platformInternalException = new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_PLATFORM_DISCONNECTED), "Service is down, please try again after a while");
        while (it.hasNext()) {
            ((l) ((Map.Entry) it.next()).getValue()).a.a((Throwable) platformInternalException);
            it.remove();
        }
    }

    public static synchronized SingleCallback a(com.samsung.android.sdk.health.data.c cVar, Function function) {
        SingleCallback singleCallback;
        synchronized (m.class) {
            m mVar = d;
            mVar.a.put(Long.valueOf(mVar.b), new l(cVar, function));
            long j = mVar.b;
            mVar.b = 1 + j;
            singleCallback = new SingleCallback(j, mVar.c);
        }
        return singleCallback;
    }
}
