package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.data.Field;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.request.DataType;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements j0 {
    public static final k0 a = new k0();
    public static final Set b = SetsKt.setOf(DataType.SleepType.SLEEP_SCORE);

    @Override // com.samsung.android.sdk.health.data.j0
    public final Object a(Field field, Object obj, int i) {
        Intrinsics.checkNotNullParameter(field, "field");
        if (i != 0) {
            return obj;
        }
        throw new InvalidRequestException(1001, field.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_NAME java.lang.String() + " does not support write operations");
    }

    @Override // com.samsung.android.sdk.health.data.j0
    public final Object a(Field field, Object obj) {
        Intrinsics.checkNotNullParameter(field, "field");
        return obj;
    }

    @Override // com.samsung.android.sdk.health.data.j0
    public final Set a() {
        return b;
    }
}
