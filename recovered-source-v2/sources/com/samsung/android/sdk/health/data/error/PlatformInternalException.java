package com.samsung.android.sdk.health.data.error;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/samsung/android/sdk/health/data/error/PlatformInternalException;", "Lcom/samsung/android/sdk/health/data/error/HealthDataException;", "errorCode", "", "errorMessage", "", "cause", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;)V", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlatformInternalException extends HealthDataException {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlatformInternalException(Integer num, String errorMessage) {
        this(num, errorMessage, null, 4, null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }

    public /* synthetic */ PlatformInternalException(Integer num, String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, (i & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformInternalException(Integer num, String errorMessage, Throwable th) {
        super(num, errorMessage, th);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
