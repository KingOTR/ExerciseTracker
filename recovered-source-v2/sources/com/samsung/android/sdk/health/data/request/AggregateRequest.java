package com.samsung.android.sdk.health.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.samsung.android.sdk.health.data.data.AggregateOperation;
import com.samsung.android.sdk.health.data.e2;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.internal.annotation.ApiVersion;
import com.samsung.android.sdk.health.data.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0005ABCDEJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u00109\u001a\u0004\u0018\u0001088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010@\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030=8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006F"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AggregateRequest;", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "requiredVersion", "I", "getRequiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "getDataType", "()Lcom/samsung/android/sdk/health/data/request/DataType;", "pageSize", "Ljava/lang/Integer;", "getPageSize", "()Ljava/lang/Integer;", "", "pageToken", "Ljava/lang/String;", "getPageToken", "()Ljava/lang/String;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "ordering", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "getOrdering", "()Lcom/samsung/android/sdk/health/data/request/Ordering;", "operation", "Lcom/samsung/android/sdk/health/data/request/AggregateSourceFilter;", "sourceFilter", "Lcom/samsung/android/sdk/health/data/request/AggregateSourceFilter;", "getSourceFilter", "()Lcom/samsung/android/sdk/health/data/request/AggregateSourceFilter;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "instantTimeFilter", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "getInstantTimeFilter", "()Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeGroup;", "instantTimeGroup", "Lcom/samsung/android/sdk/health/data/request/InstantTimeGroup;", "getInstantTimeGroup", "()Lcom/samsung/android/sdk/health/data/request/InstantTimeGroup;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "localTimeFilter", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "getLocalTimeFilter", "()Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "localTimeGroup", "Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "getLocalTimeGroup", "()Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "Lcom/samsung/android/sdk/health/data/data/AggregateOperation;", "getTargetOperation", "()Lcom/samsung/android/sdk/health/data/data/AggregateOperation;", "targetOperation", "AllSourceLocalDateBuilder", "Builder", "DualTimeBuilder", "LocalDateBuilder", "LocalTimeBuilder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class AggregateRequest<T> implements Parcelable {
    public static final Parcelable.Creator<AggregateRequest<?>> CREATOR = new Creator();
    private final DataType dataType;
    private final InstantTimeFilter instantTimeFilter;
    private final InstantTimeGroup instantTimeGroup;
    private final LocalTimeFilter localTimeFilter;
    private final LocalTimeGroup localTimeGroup;
    private final String operation;
    private final Ordering ordering;
    private final Integer pageSize;
    private final String pageToken;
    private final int requiredVersion;
    private final AggregateSourceFilter sourceFilter;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001(J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AggregateRequest$AllSourceLocalDateBuilder;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/request/AggregateRequest$Builder;", "", "pageSize", "setPageSize", "(I)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$AllSourceLocalDateBuilder;", "", "pageToken", "setPageToken", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$AllSourceLocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "ordering", "setOrdering", "(Lcom/samsung/android/sdk/health/data/request/Ordering;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$AllSourceLocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;", "localDateFilter", "setLocalDateFilter", "(Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$AllSourceLocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/LocalDateGroup;", "localDateGroup", "setLocalDateFilterWithGroup", "(Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;Lcom/samsung/android/sdk/health/data/request/LocalDateGroup;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$AllSourceLocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/AggregateRequest;", "build", "()Lcom/samsung/android/sdk/health/data/request/AggregateRequest;", "requiredVersion", "I", "dataTypeName", "Ljava/lang/String;", "targetField", "Ljava/lang/Integer;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "localTimeFilter", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "localTimeGroup", "Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class AllSourceLocalDateBuilder<T> implements Builder<T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String dataTypeName;
        private LocalTimeFilter localTimeFilter;
        private LocalTimeGroup localTimeGroup;
        private Ordering ordering;
        private Integer pageSize;
        private String pageToken;
        private int requiredVersion;
        private final String targetField;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AggregateRequest$AllSourceLocalDateBuilder$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "requiredVersion", "", "dataTypeName", "targetField", "Lcom/samsung/android/sdk/health/data/request/AggregateRequest$AllSourceLocalDateBuilder;", "builder$SDK_clientRelease", "(ILjava/lang/String;Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$AllSourceLocalDateBuilder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AllSourceLocalDateBuilder builder$SDK_clientRelease(int requiredVersion, String dataTypeName, String targetField) {
                Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
                Intrinsics.checkNotNullParameter(targetField, "targetField");
                return new AllSourceLocalDateBuilder(requiredVersion, dataTypeName, targetField, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ AllSourceLocalDateBuilder(int i, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2);
        }

        @Override // com.samsung.android.sdk.health.data.request.AggregateRequest.Builder
        public AggregateRequest<T> build() {
            DataType dataType = t.b(this.dataTypeName);
            int i = this.requiredVersion;
            Intrinsics.checkNotNullExpressionValue(dataType, "dataType");
            return new AggregateRequest<>(i, dataType, this.pageSize, this.pageToken, this.ordering, this.targetField, null, null, null, this.localTimeFilter, this.localTimeGroup, null);
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final AllSourceLocalDateBuilder<T> setLocalDateFilter(LocalDateFilter localDateFilter) {
            Intrinsics.checkNotNullParameter(localDateFilter, "localDateFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.localTimeFilter = localDateFilter.toLocalTimeFilter();
            this.localTimeGroup = null;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final AllSourceLocalDateBuilder<T> setLocalDateFilterWithGroup(LocalDateFilter localDateFilter, LocalDateGroup localDateGroup) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.localTimeFilter = localDateFilter != null ? localDateFilter.toLocalTimeFilter() : null;
            this.localTimeGroup = localDateGroup != null ? localDateGroup.toLocalTimeGroup() : null;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final AllSourceLocalDateBuilder<T> setOrdering(Ordering ordering) {
            Intrinsics.checkNotNullParameter(ordering, "ordering");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.ordering = ordering;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final AllSourceLocalDateBuilder<T> setPageSize(int pageSize) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            if (pageSize < 1) {
                throw new InvalidRequestException(1001, "Page size should be greater than zero");
            }
            this.pageSize = Integer.valueOf(pageSize);
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final AllSourceLocalDateBuilder<T> setPageToken(String pageToken) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.pageToken = pageToken;
            return this;
        }

        private AllSourceLocalDateBuilder(int i, String str, String str2) {
            this.requiredVersion = i;
            this.dataTypeName = str;
            this.targetField = str2;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AggregateRequest$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "", "build", "Lcom/samsung/android/sdk/health/data/request/AggregateRequest;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Builder<T> {
        AggregateRequest<T> build();
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AggregateRequest<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AggregateRequest<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AggregateRequest<>(parcel.readInt(), (DataType) parcel.readParcelable(AggregateRequest.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Ordering.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : AggregateSourceFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InstantTimeFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InstantTimeGroup.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LocalTimeFilter.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LocalTimeGroup.CREATOR.createFromParcel(parcel) : null, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AggregateRequest<?>[] newArray(int i) {
            return new AggregateRequest[i];
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 3*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u00013J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010$H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010-R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010/R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00102¨\u00064"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AggregateRequest$DualTimeBuilder;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/request/AggregateRequest$Builder;", "", "pageSize", "setPageSize", "(I)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$DualTimeBuilder;", "", "pageToken", "setPageToken", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "ordering", "setOrdering", "(Lcom/samsung/android/sdk/health/data/request/Ordering;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/AggregateSourceFilter;", "sourceFilter", "setSourceFilter", "(Lcom/samsung/android/sdk/health/data/request/AggregateSourceFilter;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "instantTimeFilter", "setInstantTimeFilter", "(Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeGroup;", "instantTimeGroup", "setInstantTimeFilterWithGroup", "(Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;Lcom/samsung/android/sdk/health/data/request/InstantTimeGroup;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "localTimeFilter", "setLocalTimeFilter", "(Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "localTimeGroup", "setLocalTimeFilterWithGroup", "(Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/AggregateRequest;", "build", "()Lcom/samsung/android/sdk/health/data/request/AggregateRequest;", "requiredVersion", "I", "dataTypeName", "Ljava/lang/String;", "targetField", "Ljava/lang/Integer;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "Lcom/samsung/android/sdk/health/data/request/AggregateSourceFilter;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeGroup;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class DualTimeBuilder<T> implements Builder<T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String dataTypeName;
        private InstantTimeFilter instantTimeFilter;
        private InstantTimeGroup instantTimeGroup;
        private LocalTimeFilter localTimeFilter;
        private LocalTimeGroup localTimeGroup;
        private Ordering ordering;
        private Integer pageSize;
        private String pageToken;
        private int requiredVersion;
        private AggregateSourceFilter sourceFilter;
        private final String targetField;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AggregateRequest$DualTimeBuilder$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "requiredVersion", "", "dataTypeName", "targetField", "Lcom/samsung/android/sdk/health/data/request/AggregateRequest$DualTimeBuilder;", "builder$SDK_clientRelease", "(ILjava/lang/String;Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$DualTimeBuilder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DualTimeBuilder builder$SDK_clientRelease(int requiredVersion, String dataTypeName, String targetField) {
                Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
                Intrinsics.checkNotNullParameter(targetField, "targetField");
                return new DualTimeBuilder(requiredVersion, dataTypeName, targetField, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ DualTimeBuilder(int i, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2);
        }

        @Override // com.samsung.android.sdk.health.data.request.AggregateRequest.Builder
        public AggregateRequest<T> build() {
            DataType dataType = t.b(this.dataTypeName);
            int i = this.requiredVersion;
            Intrinsics.checkNotNullExpressionValue(dataType, "dataType");
            return new AggregateRequest<>(i, dataType, this.pageSize, this.pageToken, this.ordering, this.targetField, this.sourceFilter, this.instantTimeFilter, this.instantTimeGroup, this.localTimeFilter, this.localTimeGroup, null);
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setInstantTimeFilter(InstantTimeFilter instantTimeFilter) {
            Intrinsics.checkNotNullParameter(instantTimeFilter, "instantTimeFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.instantTimeFilter = instantTimeFilter;
            this.instantTimeGroup = null;
            this.localTimeFilter = null;
            this.localTimeGroup = null;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setInstantTimeFilterWithGroup(InstantTimeFilter instantTimeFilter, InstantTimeGroup instantTimeGroup) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.instantTimeFilter = instantTimeFilter;
            this.instantTimeGroup = instantTimeGroup;
            this.localTimeFilter = null;
            this.localTimeGroup = null;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setLocalTimeFilter(LocalTimeFilter localTimeFilter) {
            Intrinsics.checkNotNullParameter(localTimeFilter, "localTimeFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.instantTimeFilter = null;
            this.instantTimeGroup = null;
            this.localTimeFilter = localTimeFilter;
            this.localTimeGroup = null;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setLocalTimeFilterWithGroup(LocalTimeFilter localTimeFilter, LocalTimeGroup localTimeGroup) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.instantTimeFilter = null;
            this.instantTimeGroup = null;
            this.localTimeFilter = localTimeFilter;
            this.localTimeGroup = localTimeGroup;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setOrdering(Ordering ordering) {
            Intrinsics.checkNotNullParameter(ordering, "ordering");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.ordering = ordering;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setPageSize(int pageSize) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            if (pageSize < 1) {
                throw new InvalidRequestException(1001, "Page size should be greater than zero");
            }
            this.pageSize = Integer.valueOf(pageSize);
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setPageToken(String pageToken) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.pageToken = pageToken;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setSourceFilter(AggregateSourceFilter sourceFilter) {
            Intrinsics.checkNotNullParameter(sourceFilter, "sourceFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.sourceFilter = sourceFilter;
            return this;
        }

        private DualTimeBuilder(int i, String str, String str2) {
            this.requiredVersion = i;
            this.dataTypeName = str;
            this.targetField = str2;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001-J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalDateBuilder;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/request/AggregateRequest$Builder;", "", "pageSize", "setPageSize", "(I)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalDateBuilder;", "", "pageToken", "setPageToken", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "ordering", "setOrdering", "(Lcom/samsung/android/sdk/health/data/request/Ordering;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/AggregateSourceFilter;", "sourceFilter", "setSourceFilter", "(Lcom/samsung/android/sdk/health/data/request/AggregateSourceFilter;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;", "localDateFilter", "setLocalDateFilter", "(Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/LocalDateGroup;", "localDateGroup", "setLocalDateFilterWithGroup", "(Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;Lcom/samsung/android/sdk/health/data/request/LocalDateGroup;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/AggregateRequest;", "build", "()Lcom/samsung/android/sdk/health/data/request/AggregateRequest;", "requiredVersion", "I", "dataTypeName", "Ljava/lang/String;", "targetField", "Ljava/lang/Integer;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "Lcom/samsung/android/sdk/health/data/request/AggregateSourceFilter;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "localTimeFilter", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "localTimeGroup", "Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class LocalDateBuilder<T> implements Builder<T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String dataTypeName;
        private LocalTimeFilter localTimeFilter;
        private LocalTimeGroup localTimeGroup;
        private Ordering ordering;
        private Integer pageSize;
        private String pageToken;
        private int requiredVersion;
        private AggregateSourceFilter sourceFilter;
        private final String targetField;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalDateBuilder$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "requiredVersion", "", "dataTypeName", "targetField", "Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalDateBuilder;", "builder$SDK_clientRelease", "(ILjava/lang/String;Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalDateBuilder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LocalDateBuilder builder$SDK_clientRelease(int requiredVersion, String dataTypeName, String targetField) {
                Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
                Intrinsics.checkNotNullParameter(targetField, "targetField");
                return new LocalDateBuilder(requiredVersion, dataTypeName, targetField, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ LocalDateBuilder(int i, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2);
        }

        @Override // com.samsung.android.sdk.health.data.request.AggregateRequest.Builder
        public AggregateRequest<T> build() {
            DataType dataType = t.b(this.dataTypeName);
            int i = this.requiredVersion;
            Intrinsics.checkNotNullExpressionValue(dataType, "dataType");
            return new AggregateRequest<>(i, dataType, this.pageSize, this.pageToken, this.ordering, this.targetField, this.sourceFilter, null, null, this.localTimeFilter, this.localTimeGroup, null);
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setLocalDateFilter(LocalDateFilter localDateFilter) {
            Intrinsics.checkNotNullParameter(localDateFilter, "localDateFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.localTimeFilter = localDateFilter.toLocalTimeFilter();
            this.localTimeGroup = null;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setLocalDateFilterWithGroup(LocalDateFilter localDateFilter, LocalDateGroup localDateGroup) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.localTimeFilter = localDateFilter != null ? localDateFilter.toLocalTimeFilter() : null;
            this.localTimeGroup = localDateGroup != null ? localDateGroup.toLocalTimeGroup() : null;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setOrdering(Ordering ordering) {
            Intrinsics.checkNotNullParameter(ordering, "ordering");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.ordering = ordering;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setPageSize(int pageSize) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            if (pageSize < 1) {
                throw new InvalidRequestException(1001, "Page size should be greater than zero");
            }
            this.pageSize = Integer.valueOf(pageSize);
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setPageToken(String pageToken) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.pageToken = pageToken;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setSourceFilter(AggregateSourceFilter sourceFilter) {
            Intrinsics.checkNotNullParameter(sourceFilter, "sourceFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.sourceFilter = sourceFilter;
            return this;
        }

        private LocalDateBuilder(int i, String str, String str2) {
            this.requiredVersion = i;
            this.dataTypeName = str;
            this.targetField = str2;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 )*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001)J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010(¨\u0006*"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalTimeBuilder;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/request/AggregateRequest$Builder;", "", "pageSize", "setPageSize", "(I)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalTimeBuilder;", "", "pageToken", "setPageToken", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "ordering", "setOrdering", "(Lcom/samsung/android/sdk/health/data/request/Ordering;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/AggregateSourceFilter;", "sourceFilter", "setSourceFilter", "(Lcom/samsung/android/sdk/health/data/request/AggregateSourceFilter;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "localTimeFilter", "setLocalTimeFilter", "(Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "localTimeGroup", "setLocalTimeFilterWithGroup", "(Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/AggregateRequest;", "build", "()Lcom/samsung/android/sdk/health/data/request/AggregateRequest;", "requiredVersion", "I", "dataTypeName", "Ljava/lang/String;", "targetField", "Ljava/lang/Integer;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "Lcom/samsung/android/sdk/health/data/request/AggregateSourceFilter;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class LocalTimeBuilder<T> implements Builder<T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String dataTypeName;
        private LocalTimeFilter localTimeFilter;
        private LocalTimeGroup localTimeGroup;
        private Ordering ordering;
        private Integer pageSize;
        private String pageToken;
        private int requiredVersion;
        private AggregateSourceFilter sourceFilter;
        private final String targetField;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalTimeBuilder$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "requiredVersion", "", "dataTypeName", "targetField", "Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalTimeBuilder;", "builder$SDK_clientRelease", "(ILjava/lang/String;Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/AggregateRequest$LocalTimeBuilder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LocalTimeBuilder builder$SDK_clientRelease(int requiredVersion, String dataTypeName, String targetField) {
                Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
                Intrinsics.checkNotNullParameter(targetField, "targetField");
                return new LocalTimeBuilder(requiredVersion, dataTypeName, targetField, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ LocalTimeBuilder(int i, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2);
        }

        @Override // com.samsung.android.sdk.health.data.request.AggregateRequest.Builder
        public AggregateRequest<T> build() {
            DataType dataType = t.b(this.dataTypeName);
            int i = this.requiredVersion;
            Intrinsics.checkNotNullExpressionValue(dataType, "dataType");
            return new AggregateRequest<>(i, dataType, this.pageSize, this.pageToken, this.ordering, this.targetField, this.sourceFilter, null, null, this.localTimeFilter, this.localTimeGroup, null);
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalTimeBuilder<T> setLocalTimeFilter(LocalTimeFilter localTimeFilter) {
            Intrinsics.checkNotNullParameter(localTimeFilter, "localTimeFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.localTimeFilter = localTimeFilter;
            this.localTimeGroup = null;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalTimeBuilder<T> setLocalTimeFilterWithGroup(LocalTimeFilter localTimeFilter, LocalTimeGroup localTimeGroup) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.localTimeFilter = localTimeFilter;
            this.localTimeGroup = localTimeGroup;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalTimeBuilder<T> setOrdering(Ordering ordering) {
            Intrinsics.checkNotNullParameter(ordering, "ordering");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.ordering = ordering;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalTimeBuilder<T> setPageSize(int pageSize) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            if (pageSize < 1) {
                throw new InvalidRequestException(1001, "Page size should be greater than zero");
            }
            this.pageSize = Integer.valueOf(pageSize);
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalTimeBuilder<T> setPageToken(String pageToken) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.pageToken = pageToken;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalTimeBuilder<T> setSourceFilter(AggregateSourceFilter sourceFilter) {
            Intrinsics.checkNotNullParameter(sourceFilter, "sourceFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.sourceFilter = sourceFilter;
            return this;
        }

        private LocalTimeBuilder(int i, String str, String str2) {
            this.requiredVersion = i;
            this.dataTypeName = str;
            this.targetField = str2;
        }
    }

    public /* synthetic */ AggregateRequest(int i, DataType dataType, Integer num, String str, Ordering ordering, String str2, AggregateSourceFilter aggregateSourceFilter, InstantTimeFilter instantTimeFilter, InstantTimeGroup instantTimeGroup, LocalTimeFilter localTimeFilter, LocalTimeGroup localTimeGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, dataType, num, str, ordering, str2, aggregateSourceFilter, instantTimeFilter, instantTimeGroup, localTimeFilter, localTimeGroup);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final DataType getDataType() {
        return this.dataType;
    }

    public final InstantTimeFilter getInstantTimeFilter() {
        return this.instantTimeFilter;
    }

    public final InstantTimeGroup getInstantTimeGroup() {
        return this.instantTimeGroup;
    }

    public final LocalTimeFilter getLocalTimeFilter() {
        return this.localTimeFilter;
    }

    public final LocalTimeGroup getLocalTimeGroup() {
        return this.localTimeGroup;
    }

    public final Ordering getOrdering() {
        return this.ordering;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final int getRequiredVersion() {
        return this.requiredVersion;
    }

    public final AggregateSourceFilter getSourceFilter() {
        return this.sourceFilter;
    }

    public final AggregateOperation<?, ?> getTargetOperation() {
        AggregateOperation<?, ?> a = t.a(this.dataType.getName() + "." + this.operation);
        Intrinsics.checkNotNullExpressionValue(a, "getAggregateOperationByN…e.name + \".\" + operation)");
        return a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.requiredVersion);
        parcel.writeParcelable(this.dataType, flags);
        Integer num = this.pageSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.pageToken);
        Ordering ordering = this.ordering;
        if (ordering == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ordering.name());
        }
        parcel.writeString(this.operation);
        AggregateSourceFilter aggregateSourceFilter = this.sourceFilter;
        if (aggregateSourceFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aggregateSourceFilter.writeToParcel(parcel, flags);
        }
        InstantTimeFilter instantTimeFilter = this.instantTimeFilter;
        if (instantTimeFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            instantTimeFilter.writeToParcel(parcel, flags);
        }
        InstantTimeGroup instantTimeGroup = this.instantTimeGroup;
        if (instantTimeGroup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            instantTimeGroup.writeToParcel(parcel, flags);
        }
        LocalTimeFilter localTimeFilter = this.localTimeFilter;
        if (localTimeFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localTimeFilter.writeToParcel(parcel, flags);
        }
        LocalTimeGroup localTimeGroup = this.localTimeGroup;
        if (localTimeGroup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localTimeGroup.writeToParcel(parcel, flags);
        }
    }

    private AggregateRequest(int i, DataType dataType, Integer num, String str, Ordering ordering, String str2, AggregateSourceFilter aggregateSourceFilter, InstantTimeFilter instantTimeFilter, InstantTimeGroup instantTimeGroup, LocalTimeFilter localTimeFilter, LocalTimeGroup localTimeGroup) {
        this.requiredVersion = i;
        this.dataType = dataType;
        this.pageSize = num;
        this.pageToken = str;
        this.ordering = ordering;
        this.operation = str2;
        this.sourceFilter = aggregateSourceFilter;
        this.instantTimeFilter = instantTimeFilter;
        this.instantTimeGroup = instantTimeGroup;
        this.localTimeFilter = localTimeFilter;
        this.localTimeGroup = localTimeGroup;
    }
}
