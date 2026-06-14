package com.samsung.android.sdk.health.data.device;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.caverock.androidsvg.SVGParser;
import com.samsung.android.sdk.health.data.d0;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002.-J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010!\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u0010R\u0019\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u0010R\u001d\u0010,\u001a\u00020%8\u0006¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/samsung/android/sdk/health/data/device/Device;", "Landroid/os/Parcelable;", "Lcom/samsung/android/sdk/health/data/device/AccessoryType;", SVGParser.XML_STYLESHEET_ATTR_TYPE, "", "isOf", "(Lcom/samsung/android/sdk/health/data/device/AccessoryType;)Z", "", Vo2MaxRecord.MeasurementMethod.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "id", "d", "getManufacturer", "manufacturer", "e", "getModel", "model", "f", "getName", HintConstants.AUTOFILL_HINT_NAME, "Lcom/samsung/android/sdk/health/data/device/DeviceType;", "g", "Lcom/samsung/android/sdk/health/data/device/DeviceType;", "getDeviceType", "()Lcom/samsung/android/sdk/health/data/device/DeviceType;", "getDeviceType$annotations", "()V", "deviceType", "Companion", "AccessoryBuilder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class Device implements Parcelable {

    /* renamed from: a, reason: from kotlin metadata */
    private final String id;
    private final int b;
    private final List c;

    /* renamed from: d, reason: from kotlin metadata */
    private final String manufacturer;

    /* renamed from: e, reason: from kotlin metadata */
    private final String model;

    /* renamed from: f, reason: from kotlin metadata */
    private final String name;
    private final Enum g;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Device> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/samsung/android/sdk/health/data/device/Device$AccessoryBuilder;", "", "Lcom/samsung/android/sdk/health/data/device/AccessoryType;", "accessory", "addType", "(Lcom/samsung/android/sdk/health/data/device/AccessoryType;)Lcom/samsung/android/sdk/health/data/device/Device$AccessoryBuilder;", "", "manufacturer", "setManufacturer", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/device/Device$AccessoryBuilder;", "model", "setModel", HintConstants.AUTOFILL_HINT_NAME, "setName", "Lcom/samsung/android/sdk/health/data/device/Device;", "build", "()Lcom/samsung/android/sdk/health/data/device/Device;", "<init>", "()V", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class AccessoryBuilder {
        private String a;
        private final LinkedHashSet b = new LinkedHashSet();
        private String c;
        private String d;
        private String e;

        public final AccessoryBuilder addType(AccessoryType accessory) {
            Intrinsics.checkNotNullParameter(accessory, "accessory");
            if (!this.b.isEmpty()) {
                int ordinal = accessory.ordinal();
                AccessoryType accessoryType = AccessoryType.UNKNOWN;
                if (ordinal == accessoryType.ordinal() || this.b.contains(Integer.valueOf(accessoryType.ordinal()))) {
                    throw new InvalidRequestException(1001, "Accessory type UNKNOWN should not be combined with any other accessory type.");
                }
            }
            this.b.add(Integer.valueOf(accessory.ordinal()));
            return this;
        }

        public final Device build() {
            this.a = new String();
            if (this.b.isEmpty()) {
                throw new InvalidRequestException(1001, "At least one Accessory type must be set");
            }
            String str = this.a;
            Intrinsics.checkNotNull(str);
            return new Device(str, DeviceGroup.ACCESSORY.ordinal(), CollectionsKt.toList(this.b), this.c, this.d, this.e, null);
        }

        public final AccessoryBuilder setManufacturer(String manufacturer) {
            Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
            this.c = manufacturer;
            return this;
        }

        public final AccessoryBuilder setModel(String model) {
            Intrinsics.checkNotNullParameter(model, "model");
            this.d = model;
            return this;
        }

        public final AccessoryBuilder setName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.e = name;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/samsung/android/sdk/health/data/device/Device$Companion;", "", "Lcom/samsung/android/sdk/health/data/device/Device$AccessoryBuilder;", "accessoryBuilder", "()Lcom/samsung/android/sdk/health/data/device/Device$AccessoryBuilder;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccessoryBuilder accessoryBuilder() {
            return new AccessoryBuilder();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Device> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Device createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new Device(readString, readInt, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Device[] newArray(int i) {
            return new Device[i];
        }
    }

    public /* synthetic */ Device(String str, int i, List list, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, list, str2, str3, str4);
    }

    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        return (other instanceof Device) && Intrinsics.areEqual(this.id, ((Device) other).id);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.samsung.android.sdk.health.data.device.DeviceType, java.lang.Enum] */
    public final DeviceType getDeviceType() {
        return this.g;
    }

    public final String getId() {
        return this.id;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final boolean isOf(AccessoryType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (type != AccessoryType.UNKNOWN) {
            return this.c.contains(Integer.valueOf(type.ordinal()));
        }
        List list = this.c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue == 0 || intValue >= AccessoryType.values().length) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return "[" + this.g + "," + this.id + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeInt(this.b);
        List list = this.c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(((Number) it.next()).intValue());
        }
        parcel.writeString(this.manufacturer);
        parcel.writeString(this.model);
        parcel.writeString(this.name);
    }

    private Device(String str, int i, List list, String str2, String str3, String str4) {
        Object a;
        this.id = str;
        this.b = i;
        this.c = list;
        this.manufacturer = str2;
        this.model = str3;
        this.name = str4;
        a = d0.a(i, -1);
        this.g = (Enum) a;
    }
}
