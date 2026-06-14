package com.example.rungps.nfc;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymCardStore.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/nfc/RegisteredGymCard;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "uid", "locationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getUid", "getLocationId", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegisteredGymCard {
    public static final int $stable = 0;
    private final String id;
    private final String locationId;
    private final String name;
    private final String uid;

    public static /* synthetic */ RegisteredGymCard copy$default(RegisteredGymCard registeredGymCard, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registeredGymCard.id;
        }
        if ((i & 2) != 0) {
            str2 = registeredGymCard.name;
        }
        if ((i & 4) != 0) {
            str3 = registeredGymCard.uid;
        }
        if ((i & 8) != 0) {
            str4 = registeredGymCard.locationId;
        }
        return registeredGymCard.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLocationId() {
        return this.locationId;
    }

    public final RegisteredGymCard copy(String id, String name, String uid, String locationId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(uid, "uid");
        return new RegisteredGymCard(id, name, uid, locationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisteredGymCard)) {
            return false;
        }
        RegisteredGymCard registeredGymCard = (RegisteredGymCard) other;
        return Intrinsics.areEqual(this.id, registeredGymCard.id) && Intrinsics.areEqual(this.name, registeredGymCard.name) && Intrinsics.areEqual(this.uid, registeredGymCard.uid) && Intrinsics.areEqual(this.locationId, registeredGymCard.locationId);
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.uid.hashCode()) * 31;
        String str = this.locationId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RegisteredGymCard(id=" + this.id + ", name=" + this.name + ", uid=" + this.uid + ", locationId=" + this.locationId + ")";
    }

    public RegisteredGymCard(String id, String name, String uid, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.id = id;
        this.name = name;
        this.uid = uid;
        this.locationId = str;
    }

    public /* synthetic */ RegisteredGymCard(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getLocationId() {
        return this.locationId;
    }
}
