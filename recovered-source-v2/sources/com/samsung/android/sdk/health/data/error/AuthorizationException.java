package com.samsung.android.sdk.health.data.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/samsung/android/sdk/health/data/error/AuthorizationException;", "Lcom/samsung/android/sdk/health/data/error/HealthDataException;", "errorCode", "", "errorMessage", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuthorizationException extends HealthDataException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizationException(Integer num, String errorMessage) {
        super(num, errorMessage, null, 4, null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
