package com.samsung.android.sdk.health.data.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.firestore.model.Values;
import com.samsung.android.sdk.health.data.data.DataSource;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.internal.FieldDataMap;
import com.samsung.android.sdk.health.data.j0;
import com.samsung.android.sdk.health.data.l0;
import com.samsung.android.sdk.health.data.p;
import com.samsung.android.sdk.health.data.request.DataType;
import com.samsung.android.sdk.health.data.t;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002FEJ#\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0019\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010*\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u00100\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00103\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u0019\u00106\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0019\u0010<\u001a\u0004\u0018\u0001078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010D\u001a\u0004\u0018\u00010=8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010A¨\u0006G"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/data/Field;", "field", "getValue", "(Lcom/samsung/android/sdk/health/data/data/Field;)Ljava/lang/Object;", "defaultValue", "getValueOrDefault", "(Lcom/samsung/android/sdk/health/data/data/Field;Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/time/LocalDateTime;", "getStartLocalDateTime", "()Ljava/time/LocalDateTime;", "getEndLocalDateTime", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "b", "Ljava/lang/String;", "getUid", "()Ljava/lang/String;", "uid", "c", "getClientDataId", "clientDataId", "d", "Ljava/lang/Integer;", "getClientVersion", "()Ljava/lang/Integer;", "clientVersion", "Lcom/samsung/android/sdk/health/data/data/DataSource;", "e", "Lcom/samsung/android/sdk/health/data/data/DataSource;", "getDataSource", "()Lcom/samsung/android/sdk/health/data/data/DataSource;", "dataSource", "Ljava/time/Instant;", "f", "Ljava/time/Instant;", "getUpdateTime", "()Ljava/time/Instant;", "updateTime", "g", "getStartTime", "startTime", "h", "getEndTime", "endTime", "Ljava/time/ZoneOffset;", "i", "Ljava/time/ZoneOffset;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "zoneOffset", "Lcom/samsung/android/sdk/health/data/request/DataType;", "j", "Lcom/samsung/android/sdk/health/data/request/DataType;", "getDataType$SDK_clientRelease", "()Lcom/samsung/android/sdk/health/data/request/DataType;", "getDataType$SDK_clientRelease$annotations", "()V", "dataType", "Companion", "Builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class HealthDataPoint implements DataPoint {
    private final FieldDataMap a;

    /* renamed from: b, reason: from kotlin metadata */
    private final String uid;

    /* renamed from: c, reason: from kotlin metadata */
    private final String clientDataId;

    /* renamed from: d, reason: from kotlin metadata */
    private final Integer clientVersion;

    /* renamed from: e, reason: from kotlin metadata */
    private final DataSource dataSource;

    /* renamed from: f, reason: from kotlin metadata */
    private final Instant updateTime;

    /* renamed from: g, reason: from kotlin metadata */
    private final Instant startTime;

    /* renamed from: h, reason: from kotlin metadata */
    private final Instant endTime;

    /* renamed from: i, reason: from kotlin metadata */
    private final ZoneOffset zoneOffset;

    /* renamed from: j, reason: from kotlin metadata */
    private final /* synthetic */ DataType dataType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<HealthDataPoint> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0005J!\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00122\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0011J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00122\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0014J+\u0010\u001c\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\b\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/HealthDataPoint$Builder;", "", "", "clientDataId", "setClientDataId", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/data/HealthDataPoint$Builder;", "", "clientVersion", "setClientVersion", "(Ljava/lang/Integer;)Lcom/samsung/android/sdk/health/data/data/HealthDataPoint$Builder;", "deviceId", "setDeviceId", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "zoneOffset", "setStartTime", "(Ljava/time/Instant;Ljava/time/ZoneOffset;)Lcom/samsung/android/sdk/health/data/data/HealthDataPoint$Builder;", "Ljava/time/LocalDateTime;", "setLocalStartTime", "(Ljava/time/LocalDateTime;Ljava/time/ZoneOffset;)Lcom/samsung/android/sdk/health/data/data/HealthDataPoint$Builder;", "endTime", "setEndTime", "setLocalEndTime", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/data/Field;", "field", Values.VECTOR_MAP_VECTORS_KEY, "addFieldData", "(Lcom/samsung/android/sdk/health/data/data/Field;Ljava/lang/Object;)Lcom/samsung/android/sdk/health/data/data/HealthDataPoint$Builder;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "build", "()Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "<init>", "()V", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {
        private Instant b;
        private Instant c;
        private ZoneOffset d;
        private ZoneOffset e;
        private String f;
        private Integer g;
        private String h;
        private final FieldDataMap a = new FieldDataMap();
        private final LinkedHashSet i = new LinkedHashSet();

        public static /* synthetic */ Builder setEndTime$default(Builder builder, Instant instant, ZoneOffset zoneOffset, int i, Object obj) {
            if ((i & 2) != 0) {
                zoneOffset = null;
            }
            return builder.setEndTime(instant, zoneOffset);
        }

        public static /* synthetic */ Builder setLocalEndTime$default(Builder builder, LocalDateTime localDateTime, ZoneOffset zoneOffset, int i, Object obj) {
            if ((i & 2) != 0) {
                zoneOffset = null;
            }
            return builder.setLocalEndTime(localDateTime, zoneOffset);
        }

        public static /* synthetic */ Builder setLocalStartTime$default(Builder builder, LocalDateTime localDateTime, ZoneOffset zoneOffset, int i, Object obj) {
            if ((i & 2) != 0) {
                zoneOffset = null;
            }
            return builder.setLocalStartTime(localDateTime, zoneOffset);
        }

        public static /* synthetic */ Builder setStartTime$default(Builder builder, Instant instant, ZoneOffset zoneOffset, int i, Object obj) {
            if ((i & 2) != 0) {
                zoneOffset = null;
            }
            return builder.setStartTime(instant, zoneOffset);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> Builder addFieldData(Field<T> field, T value) {
            Unit unit;
            T t;
            Intrinsics.checkNotNullParameter(field, "field");
            this.i.add(field.getTypeName());
            Iterator<T> it = l0.a.iterator();
            while (true) {
                unit = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((j0) t).a().contains(field)) {
                    break;
                }
            }
            j0 j0Var = (j0) t;
            if (j0Var != null) {
                Intrinsics.checkNotNull(j0Var, "null cannot be cast to non-null type com.samsung.android.sdk.health.data.internal.HealthDataPointUtil.FieldType<kotlin.Any, kotlin.Any>");
                this.a.setValue(field.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_NAME java.lang.String(), j0Var.a(field, value, 0));
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                this.a.setValue(field.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_NAME java.lang.String(), value);
            }
            return this;
        }

        public final HealthDataPoint build() {
            DataSource dataSource;
            if (this.b == null) {
                throw new InvalidRequestException(1001, "Start time should not be null");
            }
            String str = this.h;
            ZoneOffset zoneOffset = null;
            if (str != null) {
                DataSource.Companion companion = DataSource.INSTANCE;
                Intrinsics.checkNotNull(str);
                dataSource = companion.of("", str);
            } else {
                dataSource = null;
            }
            int size = this.i.size();
            if (size == 0) {
                throw new InvalidRequestException(1001, "At least one data must be inserted");
            }
            if (size != 1) {
                throw new InvalidRequestException(1001, "All fields must be of same data type");
            }
            String str2 = (String) CollectionsKt.first(this.i);
            if (l0.b.contains(str2)) {
                if (this.c == null) {
                    throw new InvalidRequestException(1001, "End time must be set");
                }
                Instant instant = this.b;
                Intrinsics.checkNotNull(instant);
                if (instant.compareTo(this.c) > 0) {
                    throw new InvalidRequestException(1001, "End time can not be less than start time");
                }
                zoneOffset = this.d;
                if (zoneOffset == null && this.e == null) {
                    zoneOffset = ZoneOffset.systemDefault().getRules().getOffset(this.c);
                } else if (zoneOffset == null || this.e != null) {
                    zoneOffset = this.e;
                }
            } else if (l0.c.contains(str2)) {
                this.c = null;
                zoneOffset = this.d;
                if (zoneOffset == null) {
                    zoneOffset = ZoneOffset.systemDefault().getRules().getOffset(this.b);
                }
            }
            ZoneOffset zoneOffset2 = zoneOffset;
            FieldDataMap fieldDataMap = this.a;
            p pVar = t.a;
            UUID randomUUID = UUID.randomUUID();
            while (randomUUID.getMostSignificantBits() == 0 && randomUUID.getLeastSignificantBits() < 100) {
                randomUUID = UUID.randomUUID();
            }
            String uuid = randomUUID.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "getAcceptableRandomUuid()");
            String str3 = this.f;
            Integer num = this.g;
            Instant instant2 = this.b;
            Intrinsics.checkNotNull(instant2);
            return new HealthDataPoint(fieldDataMap, uuid, str3, num, dataSource, null, instant2, this.c, zoneOffset2, t.b((String) CollectionsKt.first(this.i)), null);
        }

        public final Builder setClientDataId(String clientDataId) {
            this.f = clientDataId;
            return this;
        }

        public final Builder setClientVersion(Integer clientVersion) {
            this.g = clientVersion;
            return this;
        }

        public final Builder setDeviceId(String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.h = deviceId;
            return this;
        }

        public final Builder setEndTime(Instant endTime, ZoneOffset zoneOffset) {
            Intrinsics.checkNotNullParameter(endTime, "endTime");
            this.c = endTime;
            this.e = zoneOffset;
            return this;
        }

        public final Builder setLocalEndTime(LocalDateTime endTime, ZoneOffset zoneOffset) {
            Intrinsics.checkNotNullParameter(endTime, "endTime");
            this.c = l0.a(endTime, zoneOffset);
            this.e = zoneOffset;
            return this;
        }

        public final Builder setLocalStartTime(LocalDateTime startTime, ZoneOffset zoneOffset) {
            Intrinsics.checkNotNullParameter(startTime, "startTime");
            this.b = l0.a(startTime, zoneOffset);
            this.d = zoneOffset;
            return this;
        }

        public final Builder setStartTime(Instant startTime, ZoneOffset zoneOffset) {
            Intrinsics.checkNotNullParameter(startTime, "startTime");
            this.b = startTime;
            this.d = zoneOffset;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/HealthDataPoint$Companion;", "", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint$Builder;", "builder", "()Lcom/samsung/android/sdk/health/data/data/HealthDataPoint$Builder;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HealthDataPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthDataPoint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HealthDataPoint((FieldDataMap) parcel.readParcelable(HealthDataPoint.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? DataSource.CREATOR.createFromParcel(parcel) : null, (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (ZoneOffset) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthDataPoint[] newArray(int i) {
            return new HealthDataPoint[i];
        }
    }

    public /* synthetic */ HealthDataPoint(FieldDataMap fieldDataMap, String str, String str2, Integer num, DataSource dataSource, Instant instant, Instant instant2, Instant instant3, ZoneOffset zoneOffset, DataType dataType, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldDataMap, str, str2, num, dataSource, instant, instant2, instant3, zoneOffset, dataType);
    }

    public static /* synthetic */ void getDataType$SDK_clientRelease$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getClientDataId() {
        return this.clientDataId;
    }

    public final Integer getClientVersion() {
        return this.clientVersion;
    }

    public final DataSource getDataSource() {
        return this.dataSource;
    }

    /* renamed from: getDataType$SDK_clientRelease, reason: from getter */
    public final DataType getDataType() {
        return this.dataType;
    }

    public final LocalDateTime getEndLocalDateTime() {
        Instant instant = this.endTime;
        if (instant == null) {
            return null;
        }
        ZoneOffset zoneOffset = this.zoneOffset;
        if (zoneOffset == null) {
            zoneOffset = OffsetDateTime.now().getOffset();
        }
        return LocalDateTime.ofInstant(instant, zoneOffset);
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final LocalDateTime getStartLocalDateTime() {
        Instant instant = this.startTime;
        ZoneOffset zoneOffset = this.zoneOffset;
        if (zoneOffset == null) {
            zoneOffset = OffsetDateTime.now().getOffset();
        }
        LocalDateTime ofInstant = LocalDateTime.ofInstant(instant, zoneOffset);
        Intrinsics.checkNotNullExpressionValue(ofInstant, "ofInstant(startTime, zon…setDateTime.now().offset)");
        return ofInstant;
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public final String getUid() {
        return this.uid;
    }

    public final Instant getUpdateTime() {
        return this.updateTime;
    }

    public final <T> T getValue(Field<T> field) {
        T t;
        T t2;
        Intrinsics.checkNotNullParameter(field, "field");
        Iterator<T> it = l0.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((j0) t).a().contains(field)) {
                break;
            }
        }
        j0 j0Var = (j0) t;
        return (j0Var == null || (t2 = (T) j0Var.a(field, this.a.getValue(field.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_NAME java.lang.String()))) == null) ? (T) this.a.getValue(field.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_NAME java.lang.String()) : t2;
    }

    public final <T> T getValueOrDefault(Field<T> field, T defaultValue) {
        Intrinsics.checkNotNullParameter(field, "field");
        T t = (T) getValue(field);
        return t == null ? defaultValue : t;
    }

    public final ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.a, flags);
        parcel.writeString(this.uid);
        parcel.writeString(this.clientDataId);
        Integer num = this.clientVersion;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        DataSource dataSource = this.dataSource;
        if (dataSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dataSource.writeToParcel(parcel, flags);
        }
        parcel.writeSerializable(this.updateTime);
        parcel.writeSerializable(this.startTime);
        parcel.writeSerializable(this.endTime);
        parcel.writeSerializable(this.zoneOffset);
    }

    private HealthDataPoint(FieldDataMap fieldDataMap, String str, String str2, Integer num, DataSource dataSource, Instant instant, Instant instant2, Instant instant3, ZoneOffset zoneOffset, DataType dataType) {
        this.a = fieldDataMap;
        this.uid = str;
        this.clientDataId = str2;
        this.clientVersion = num;
        this.dataSource = dataSource;
        this.updateTime = instant;
        this.startTime = instant2;
        this.endTime = instant3;
        this.zoneOffset = zoneOffset;
        this.dataType = dataType;
    }

    /* synthetic */ HealthDataPoint(FieldDataMap fieldDataMap, String str, String str2, Integer num, DataSource dataSource, Instant instant, Instant instant2, Instant instant3, ZoneOffset zoneOffset) {
        this(fieldDataMap, str, str2, num, dataSource, instant, instant2, instant3, zoneOffset, null);
    }
}
