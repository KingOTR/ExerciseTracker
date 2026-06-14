package com.example.rungps.nfc;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: OpenGymSessionCache.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/example/rungps/nfc/OpenGymSessionCache;", "", "<init>", "()V", "hasOpen", "Ljava/util/concurrent/atomic/AtomicBoolean;", "set", "", "hasOpenSession", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenGymSessionCache {
    public static final OpenGymSessionCache INSTANCE = new OpenGymSessionCache();
    private static final AtomicBoolean hasOpen = new AtomicBoolean(false);
    public static final int $stable = 8;

    private OpenGymSessionCache() {
    }

    public final void set(boolean hasOpenSession) {
        hasOpen.set(hasOpenSession);
    }

    public final boolean hasOpenSession() {
        return hasOpen.get();
    }
}
