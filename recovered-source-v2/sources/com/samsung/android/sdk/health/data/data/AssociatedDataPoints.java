package com.samsung.android.sdk.health.data.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.health.data.request.DataType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/AssociatedDataPoints;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "getDataPointOf", "(Lcom/samsung/android/sdk/health/data/request/DataType;)Ljava/util/List;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "a", "Ljava/lang/String;", "getUid", "()Ljava/lang/String;", "uid", "b", "getClientDataId$SDK_clientRelease", "clientDataId", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class AssociatedDataPoints implements DataPoint {
    public static final Parcelable.Creator<AssociatedDataPoints> CREATOR = new Creator();

    /* renamed from: a, reason: from kotlin metadata */
    private final String uid;

    /* renamed from: b, reason: from kotlin metadata */
    private final /* synthetic */ String clientDataId;
    private final Map c;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AssociatedDataPoints> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssociatedDataPoints createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                Parcelable readParcelable = parcel.readParcelable(AssociatedDataPoints.class.getClassLoader());
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList.add(HealthDataPoint.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap.put(readParcelable, arrayList);
            }
            return new AssociatedDataPoints(readString, readString2, linkedHashMap, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssociatedDataPoints[] newArray(int i) {
            return new AssociatedDataPoints[i];
        }
    }

    public /* synthetic */ AssociatedDataPoints(String str, String str2, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: getClientDataId$SDK_clientRelease, reason: from getter */
    public final String getClientDataId() {
        return this.clientDataId;
    }

    public final List<HealthDataPoint> getDataPointOf(DataType dataType) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return (List) this.c.get(dataType);
    }

    public final String getUid() {
        return this.uid;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.uid);
        parcel.writeString(this.clientDataId);
        Map map = this.c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeParcelable((Parcelable) entry.getKey(), flags);
            List list = (List) entry.getValue();
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((HealthDataPoint) it.next()).writeToParcel(parcel, flags);
            }
        }
    }

    private AssociatedDataPoints(String str, String str2, Map map) {
        this.uid = str;
        this.clientDataId = str2;
        this.c = map;
    }
}
