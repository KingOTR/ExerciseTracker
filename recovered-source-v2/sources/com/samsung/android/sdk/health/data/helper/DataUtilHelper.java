package com.samsung.android.sdk.health.data.helper;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/samsung/android/sdk/health/data/helper/DataUtilHelper;", "", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Ljava/time/LocalDateTime;", "instantToLocal", "(Ljava/time/Instant;Ljava/time/ZoneOffset;)Ljava/time/LocalDateTime;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class DataUtilHelper {
    public static final DataUtilHelper INSTANCE = new DataUtilHelper();

    private DataUtilHelper() {
    }

    public static /* synthetic */ LocalDateTime instantToLocal$default(DataUtilHelper dataUtilHelper, Instant instant, ZoneOffset zoneOffset, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneOffset = ZoneOffset.systemDefault().getRules().getOffset(instant);
            Intrinsics.checkNotNullExpressionValue(zoneOffset, "systemDefault().rules.getOffset(time)");
        }
        return dataUtilHelper.instantToLocal(instant, zoneOffset);
    }

    public final LocalDateTime instantToLocal(Instant time, ZoneOffset zoneOffset) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(zoneOffset, "zoneOffset");
        LocalDateTime ofInstant = LocalDateTime.ofInstant(time, zoneOffset);
        Intrinsics.checkNotNullExpressionValue(ofInstant, "ofInstant(time, zoneOffset)");
        return ofInstant;
    }
}
