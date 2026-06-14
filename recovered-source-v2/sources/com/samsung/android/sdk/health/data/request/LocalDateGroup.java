package com.samsung.android.sdk.health.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/LocalDateGroup;", "Landroid/os/Parcelable;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "toLocalTimeGroup", "()Lcom/samsung/android/sdk/health/data/request/LocalTimeGroup;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/samsung/android/sdk/health/data/request/LocalDateGroupUnit;", "timeGroupUnit", "Lcom/samsung/android/sdk/health/data/request/LocalDateGroupUnit;", "getTimeGroupUnit", "()Lcom/samsung/android/sdk/health/data/request/LocalDateGroupUnit;", "multiplier", "I", "getMultiplier", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class LocalDateGroup implements Parcelable {
    private final int multiplier;
    private final LocalDateGroupUnit timeGroupUnit;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LocalDateGroup> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/LocalDateGroup$Companion;", "", "Lcom/samsung/android/sdk/health/data/request/LocalDateGroupUnit;", "timeGroupUnit", "", "multiplier", "Lcom/samsung/android/sdk/health/data/request/LocalDateGroup;", "of", "(Lcom/samsung/android/sdk/health/data/request/LocalDateGroupUnit;I)Lcom/samsung/android/sdk/health/data/request/LocalDateGroup;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocalDateGroup of(LocalDateGroupUnit timeGroupUnit, int multiplier) {
            Intrinsics.checkNotNullParameter(timeGroupUnit, "timeGroupUnit");
            return new LocalDateGroup(timeGroupUnit, multiplier, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalDateGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalDateGroup createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocalDateGroup(LocalDateGroupUnit.valueOf(parcel.readString()), parcel.readInt(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalDateGroup[] newArray(int i) {
            return new LocalDateGroup[i];
        }
    }

    public /* synthetic */ LocalDateGroup(LocalDateGroupUnit localDateGroupUnit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(localDateGroupUnit, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getMultiplier() {
        return this.multiplier;
    }

    public final LocalDateGroupUnit getTimeGroupUnit() {
        return this.timeGroupUnit;
    }

    public final LocalTimeGroup toLocalTimeGroup() {
        return LocalTimeGroup.INSTANCE.of(LocalTimeGroupUnit.valueOf(this.timeGroupUnit.toString()), this.multiplier);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.timeGroupUnit.name());
        parcel.writeInt(this.multiplier);
    }

    private LocalDateGroup(LocalDateGroupUnit localDateGroupUnit, int i) {
        this.timeGroupUnit = localDateGroupUnit;
        this.multiplier = i;
    }
}
