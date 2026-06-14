package com.samsung.android.sdk.health.data.error;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B'\b\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/samsung/android/sdk/health/data/error/HealthDataException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "a", "Ljava/lang/Integer;", "getErrorCode", "()Ljava/lang/Integer;", "errorCode", "", "b", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "", "cause", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;)V", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public class HealthDataException extends RuntimeException {

    /* renamed from: a, reason: from kotlin metadata */
    private final Integer errorCode;

    /* renamed from: b, reason: from kotlin metadata */
    private final String errorMessage;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthDataException(Integer num, String errorMessage) {
        this(num, errorMessage, null, 4, null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ HealthDataException(Integer num, String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, (i & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthDataException(Integer num, String errorMessage, Throwable th) {
        super(num + ": " + errorMessage, th);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.errorCode = num;
        this.errorMessage = errorMessage;
    }
}
