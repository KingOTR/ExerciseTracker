package com.samsung.android.sdk.health.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/InstantTimeGroup;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/samsung/android/sdk/health/data/request/InstantTimeGroupUnit;", "timeGroupUnit", "Lcom/samsung/android/sdk/health/data/request/InstantTimeGroupUnit;", "getTimeGroupUnit", "()Lcom/samsung/android/sdk/health/data/request/InstantTimeGroupUnit;", "multiplier", "I", "getMultiplier", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class InstantTimeGroup implements Parcelable {
    private final int multiplier;
    private final InstantTimeGroupUnit timeGroupUnit;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InstantTimeGroup> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/InstantTimeGroup$Companion;", "", "Lcom/samsung/android/sdk/health/data/request/InstantTimeGroupUnit;", "timeGroupUnit", "", "multiplier", "Lcom/samsung/android/sdk/health/data/request/InstantTimeGroup;", "of", "(Lcom/samsung/android/sdk/health/data/request/InstantTimeGroupUnit;I)Lcom/samsung/android/sdk/health/data/request/InstantTimeGroup;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final InstantTimeGroup of(InstantTimeGroupUnit timeGroupUnit, int multiplier) {
            Intrinsics.checkNotNullParameter(timeGroupUnit, "timeGroupUnit");
            return new InstantTimeGroup(timeGroupUnit, multiplier, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstantTimeGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstantTimeGroup createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InstantTimeGroup(InstantTimeGroupUnit.valueOf(parcel.readString()), parcel.readInt(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstantTimeGroup[] newArray(int i) {
            return new InstantTimeGroup[i];
        }
    }

    public /* synthetic */ InstantTimeGroup(InstantTimeGroupUnit instantTimeGroupUnit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(instantTimeGroupUnit, i);
    }

    @JvmStatic
    public static final InstantTimeGroup of(InstantTimeGroupUnit instantTimeGroupUnit, int i) {
        return INSTANCE.of(instantTimeGroupUnit, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getMultiplier() {
        return this.multiplier;
    }

    public final InstantTimeGroupUnit getTimeGroupUnit() {
        return this.timeGroupUnit;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.timeGroupUnit.name());
        parcel.writeInt(this.multiplier);
    }

    private InstantTimeGroup(InstantTimeGroupUnit instantTimeGroupUnit, int i) {
        this.timeGroupUnit = instantTimeGroupUnit;
        this.multiplier = i;
    }
}
