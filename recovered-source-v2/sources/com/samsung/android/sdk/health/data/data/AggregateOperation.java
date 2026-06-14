package com.samsung.android.sdk.health.data.data;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.samsung.android.sdk.health.data.request.AggregateRequest;
import com.samsung.android.sdk.health.data.request.AggregateRequest.Builder;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u0019*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0010\b\u0001\u0010\u0004*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u00020\u0001:\u0001\u0019J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0018\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/AggregateOperation;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/request/AggregateRequest$Builder;", ExifInterface.LATITUDE_SOUTH, Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "getTypeName", "typeName", "c", "getOperationName", "operationName", "getRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/AggregateRequest$Builder;", "requestBuilder", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class AggregateOperation<T, S extends AggregateRequest.Builder<T>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Supplier a;

    /* renamed from: b, reason: from kotlin metadata */
    private final String typeName;

    /* renamed from: c, reason: from kotlin metadata */
    private final String operationName;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JU\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\"\b\b\u0002\u0010\u0002*\u00020\u0001\"\u0010\b\u0003\u0010\u0004*\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00030\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/AggregateOperation$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/request/AggregateRequest$Builder;", ExifInterface.LATITUDE_SOUTH, "", "typeName", "operationName", "Ljava/util/function/Supplier;", "builderSupplier", "Lcom/samsung/android/sdk/health/data/data/AggregateOperation;", "of", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;)Lcom/samsung/android/sdk/health/data/data/AggregateOperation;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final <T, S extends AggregateRequest.Builder<T>> AggregateOperation<T, S> of(String typeName, String operationName, Supplier<S> builderSupplier) {
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            Intrinsics.checkNotNullParameter(operationName, "operationName");
            Intrinsics.checkNotNullParameter(builderSupplier, "builderSupplier");
            return new AggregateOperation<>(builderSupplier, typeName, operationName, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AggregateOperation(Supplier supplier, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, supplier);
    }

    @JvmStatic
    public static final <T, S extends AggregateRequest.Builder<T>> AggregateOperation<T, S> of(String str, String str2, Supplier<S> supplier) {
        return INSTANCE.of(str, str2, supplier);
    }

    public boolean equals(Object other) {
        return (other instanceof AggregateOperation) && Intrinsics.areEqual(toString(), ((AggregateOperation) other).toString());
    }

    public final String getOperationName() {
        return this.operationName;
    }

    public final S getRequestBuilder() {
        return (S) this.a.get();
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return this.typeName + "." + this.operationName;
    }

    private AggregateOperation(String str, String str2, Supplier supplier) {
        this.a = supplier;
        this.typeName = str;
        this.operationName = str2;
    }
}
