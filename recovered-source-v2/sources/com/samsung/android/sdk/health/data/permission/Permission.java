package com.samsung.android.sdk.health.data.permission;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.samsung.android.sdk.health.data.request.DataType;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/samsung/android/sdk/health/data/permission/Permission;", "Landroid/os/Parcelable;", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/samsung/android/sdk/health/data/request/DataType;", "a", "Lcom/samsung/android/sdk/health/data/request/DataType;", "getDataType", "()Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/permission/AccessType;", "b", "Lcom/samsung/android/sdk/health/data/permission/AccessType;", "getAccessType", "()Lcom/samsung/android/sdk/health/data/permission/AccessType;", "accessType", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class Permission implements Parcelable {

    /* renamed from: a, reason: from kotlin metadata */
    private final DataType dataType;

    /* renamed from: b, reason: from kotlin metadata */
    private final AccessType accessType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Permission> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/samsung/android/sdk/health/data/permission/Permission$Companion;", "", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/permission/AccessType;", "accessType", "Lcom/samsung/android/sdk/health/data/permission/Permission;", "of", "(Lcom/samsung/android/sdk/health/data/request/DataType;Lcom/samsung/android/sdk/health/data/permission/AccessType;)Lcom/samsung/android/sdk/health/data/permission/Permission;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Permission of(DataType dataType, AccessType accessType) {
            Intrinsics.checkNotNullParameter(dataType, "dataType");
            Intrinsics.checkNotNullParameter(accessType, "accessType");
            return new Permission(dataType, accessType, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Permission> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Permission createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Permission((DataType) parcel.readParcelable(Permission.class.getClassLoader()), AccessType.valueOf(parcel.readString()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Permission[] newArray(int i) {
            return new Permission[i];
        }
    }

    public /* synthetic */ Permission(DataType dataType, AccessType accessType, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataType, accessType);
    }

    @JvmStatic
    public static final Permission of(DataType dataType, AccessType accessType) {
        return INSTANCE.of(dataType, accessType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(Permission.class, other.getClass())) {
            return false;
        }
        Permission permission = (Permission) other;
        return Intrinsics.areEqual(this.dataType.getName(), permission.dataType.getName()) && this.accessType == permission.accessType;
    }

    public final AccessType getAccessType() {
        return this.accessType;
    }

    public final DataType getDataType() {
        return this.dataType;
    }

    public int hashCode() {
        return Objects.hash(this.dataType.getName(), this.accessType);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.dataType, flags);
        parcel.writeString(this.accessType.name());
    }

    private Permission(DataType dataType, AccessType accessType) {
        this.dataType = dataType;
        this.accessType = accessType;
    }
}
