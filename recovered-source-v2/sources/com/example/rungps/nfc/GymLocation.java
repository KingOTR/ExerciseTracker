package com.example.rungps.nfc;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymLocationStore.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/example/rungps/nfc/GymLocation;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "lat", "", "lon", "radiusM", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDF)V", "getId", "()Ljava/lang/String;", "getName", "getLat", "()D", "getLon", "getRadiusM", "()F", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymLocation {
    public static final int $stable = 0;
    private final String id;
    private final double lat;
    private final double lon;
    private final String name;
    private final float radiusM;

    public static /* synthetic */ GymLocation copy$default(GymLocation gymLocation, String str, String str2, double d, double d2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gymLocation.id;
        }
        if ((i & 2) != 0) {
            str2 = gymLocation.name;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            d = gymLocation.lat;
        }
        double d3 = d;
        if ((i & 8) != 0) {
            d2 = gymLocation.lon;
        }
        double d4 = d2;
        if ((i & 16) != 0) {
            f = gymLocation.radiusM;
        }
        return gymLocation.copy(str, str3, d3, d4, f);
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
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: component4, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* renamed from: component5, reason: from getter */
    public final float getRadiusM() {
        return this.radiusM;
    }

    public final GymLocation copy(String id, String name, double lat, double lon, float radiusM) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new GymLocation(id, name, lat, lon, radiusM);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymLocation)) {
            return false;
        }
        GymLocation gymLocation = (GymLocation) other;
        return Intrinsics.areEqual(this.id, gymLocation.id) && Intrinsics.areEqual(this.name, gymLocation.name) && Double.compare(this.lat, gymLocation.lat) == 0 && Double.compare(this.lon, gymLocation.lon) == 0 && Float.compare(this.radiusM, gymLocation.radiusM) == 0;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.lat)) * 31) + Double.hashCode(this.lon)) * 31) + Float.hashCode(this.radiusM);
    }

    public String toString() {
        return "GymLocation(id=" + this.id + ", name=" + this.name + ", lat=" + this.lat + ", lon=" + this.lon + ", radiusM=" + this.radiusM + ")";
    }

    public GymLocation(String id, String name, double d, double d2, float f) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.name = name;
        this.lat = d;
        this.lon = d2;
        this.radiusM = f;
    }

    public /* synthetic */ GymLocation(String str, String str2, double d, double d2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, d2, (i & 16) != 0 ? 150.0f : f);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public final float getRadiusM() {
        return this.radiusM;
    }
}
