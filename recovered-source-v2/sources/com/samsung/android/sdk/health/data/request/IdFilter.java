package com.samsung.android.sdk.health.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/IdFilter;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "", "dataUidList", "Ljava/util/List;", "getDataUidList", "()Ljava/util/List;", "clientDataIdList", "getClientDataIdList", "Companion", "Builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class IdFilter implements Parcelable {
    private final List<String> clientDataIdList;
    private final List<String> dataUidList;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<IdFilter> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/IdFilter$Builder;", "", "", "dataUid", "addDataUid", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/IdFilter$Builder;", "clientDataId", "addClientDataId", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "build", "()Lcom/samsung/android/sdk/health/data/request/IdFilter;", "", "dataUidList", "Ljava/util/List;", "clientDataIdList", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> clientDataIdList;
        private final List<String> dataUidList;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/IdFilter$Builder$Companion;", "", "Lcom/samsung/android/sdk/health/data/request/IdFilter$Builder;", "builder$SDK_clientRelease", "()Lcom/samsung/android/sdk/health/data/request/IdFilter$Builder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Builder builder$SDK_clientRelease() {
                return new Builder(null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Builder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder addClientDataId(String clientDataId) {
            Intrinsics.checkNotNullParameter(clientDataId, "clientDataId");
            this.clientDataIdList.add(clientDataId);
            return this;
        }

        public final Builder addDataUid(String dataUid) {
            Intrinsics.checkNotNullParameter(dataUid, "dataUid");
            this.dataUidList.add(dataUid);
            return this;
        }

        public final IdFilter build() {
            return new IdFilter(this.dataUidList, this.clientDataIdList, null);
        }

        private Builder() {
            this.dataUidList = new ArrayList();
            this.clientDataIdList = new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/IdFilter$Companion;", "", "Lcom/samsung/android/sdk/health/data/request/IdFilter$Builder;", "builder", "()Lcom/samsung/android/sdk/health/data/request/IdFilter$Builder;", "", "dataUid", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "fromDataUid", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/IdFilter;", "clientDataId", "fromClientDataId", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Builder builder() {
            return Builder.INSTANCE.builder$SDK_clientRelease();
        }

        @JvmStatic
        public final IdFilter fromClientDataId(String clientDataId) {
            Intrinsics.checkNotNullParameter(clientDataId, "clientDataId");
            return builder().addClientDataId(clientDataId).build();
        }

        @JvmStatic
        public final IdFilter fromDataUid(String dataUid) {
            Intrinsics.checkNotNullParameter(dataUid, "dataUid");
            return builder().addDataUid(dataUid).build();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IdFilter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IdFilter(parcel.createStringArrayList(), parcel.createStringArrayList(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdFilter[] newArray(int i) {
            return new IdFilter[i];
        }
    }

    public /* synthetic */ IdFilter(List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2);
    }

    @JvmStatic
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    @JvmStatic
    public static final IdFilter fromClientDataId(String str) {
        return INSTANCE.fromClientDataId(str);
    }

    @JvmStatic
    public static final IdFilter fromDataUid(String str) {
        return INSTANCE.fromDataUid(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<String> getClientDataIdList() {
        return this.clientDataIdList;
    }

    public final List<String> getDataUidList() {
        return this.dataUidList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeStringList(this.dataUidList);
        parcel.writeStringList(this.clientDataIdList);
    }

    private IdFilter(List list, List list2) {
        this.dataUidList = list;
        this.clientDataIdList = list2;
    }
}
