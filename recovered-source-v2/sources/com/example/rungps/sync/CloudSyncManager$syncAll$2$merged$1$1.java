package com.example.rungps.sync;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CloudSyncManager.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class CloudSyncManager$syncAll$2$merged$1$1 extends FunctionReferenceImpl implements Function2<Context, Long, Long> {
    CloudSyncManager$syncAll$2$merged$1$1(Object obj) {
        super(2, obj, CloudSyncManager.class, "localGymUpdatedMs", "localGymUpdatedMs(Landroid/content/Context;J)J", 0);
    }

    public final Long invoke(Context p0, long j) {
        long localGymUpdatedMs;
        Intrinsics.checkNotNullParameter(p0, "p0");
        localGymUpdatedMs = ((CloudSyncManager) this.receiver).localGymUpdatedMs(p0, j);
        return Long.valueOf(localGymUpdatedMs);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Long invoke(Context context, Long l) {
        return invoke(context, l.longValue());
    }
}
