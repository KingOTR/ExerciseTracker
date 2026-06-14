package com.example.rungps.nfc;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymCheckInStore.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/nfc/GymCheckIn;", "", "atMs", "", "kind", "", "locationName", "cardName", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAtMs", "()J", "getKind", "()Ljava/lang/String;", "getLocationName", "getCardName", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymCheckIn {
    public static final int $stable = 0;
    private final long atMs;
    private final String cardName;
    private final String kind;
    private final String locationName;

    public static /* synthetic */ GymCheckIn copy$default(GymCheckIn gymCheckIn, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = gymCheckIn.atMs;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = gymCheckIn.kind;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = gymCheckIn.locationName;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = gymCheckIn.cardName;
        }
        return gymCheckIn.copy(j2, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAtMs() {
        return this.atMs;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLocationName() {
        return this.locationName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    public final GymCheckIn copy(long atMs, String kind, String locationName, String cardName) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new GymCheckIn(atMs, kind, locationName, cardName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymCheckIn)) {
            return false;
        }
        GymCheckIn gymCheckIn = (GymCheckIn) other;
        return this.atMs == gymCheckIn.atMs && Intrinsics.areEqual(this.kind, gymCheckIn.kind) && Intrinsics.areEqual(this.locationName, gymCheckIn.locationName) && Intrinsics.areEqual(this.cardName, gymCheckIn.cardName);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.atMs) * 31) + this.kind.hashCode()) * 31;
        String str = this.locationName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardName;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GymCheckIn(atMs=" + this.atMs + ", kind=" + this.kind + ", locationName=" + this.locationName + ", cardName=" + this.cardName + ")";
    }

    public GymCheckIn(long j, String kind, String str, String str2) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.atMs = j;
        this.kind = kind;
        this.locationName = str;
        this.cardName = str2;
    }

    public /* synthetic */ GymCheckIn(long j, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? null : str3);
    }

    public final long getAtMs() {
        return this.atMs;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLocationName() {
        return this.locationName;
    }

    public final String getCardName() {
        return this.cardName;
    }
}
