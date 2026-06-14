package com.example.rungps.data;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u00104\u001a\u00020\u0003HÆ\u0003J¦\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010#R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010#R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017¨\u0006<"}, d2 = {"Lcom/example/rungps/data/GearEntity;", "", "id", "", "gearType", "", HintConstants.AUTOFILL_HINT_NAME, "brand", "model", "purchaseDateMs", "startingOdometerKm", "", "notes", "isRetired", "", "isDefaultForRun", "isDefaultForRide", "photoUri", "parentGearId", "createdAtMs", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;DLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/Long;J)V", "getId", "()J", "getGearType", "()Ljava/lang/String;", "getName", "getBrand", "getModel", "getPurchaseDateMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStartingOdometerKm", "()D", "getNotes", "()Z", "getPhotoUri", "getParentGearId", "getCreatedAtMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;DLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/Long;J)Lcom/example/rungps/data/GearEntity;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GearEntity {
    private final String brand;
    private final long createdAtMs;
    private final String gearType;
    private final long id;
    private final boolean isDefaultForRide;
    private final boolean isDefaultForRun;
    private final boolean isRetired;
    private final String model;
    private final String name;
    private final String notes;
    private final Long parentGearId;
    private final String photoUri;
    private final Long purchaseDateMs;
    private final double startingOdometerKm;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsDefaultForRun() {
        return this.isDefaultForRun;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsDefaultForRide() {
        return this.isDefaultForRide;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPhotoUri() {
        return this.photoUri;
    }

    /* renamed from: component13, reason: from getter */
    public final Long getParentGearId() {
        return this.parentGearId;
    }

    /* renamed from: component14, reason: from getter */
    public final long getCreatedAtMs() {
        return this.createdAtMs;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGearType() {
        return this.gearType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* renamed from: component5, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getPurchaseDateMs() {
        return this.purchaseDateMs;
    }

    /* renamed from: component7, reason: from getter */
    public final double getStartingOdometerKm() {
        return this.startingOdometerKm;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsRetired() {
        return this.isRetired;
    }

    public final GearEntity copy(long id, String gearType, String name, String brand, String model, Long purchaseDateMs, double startingOdometerKm, String notes, boolean isRetired, boolean isDefaultForRun, boolean isDefaultForRide, String photoUri, Long parentGearId, long createdAtMs) {
        Intrinsics.checkNotNullParameter(gearType, "gearType");
        Intrinsics.checkNotNullParameter(name, "name");
        return new GearEntity(id, gearType, name, brand, model, purchaseDateMs, startingOdometerKm, notes, isRetired, isDefaultForRun, isDefaultForRide, photoUri, parentGearId, createdAtMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GearEntity)) {
            return false;
        }
        GearEntity gearEntity = (GearEntity) other;
        return this.id == gearEntity.id && Intrinsics.areEqual(this.gearType, gearEntity.gearType) && Intrinsics.areEqual(this.name, gearEntity.name) && Intrinsics.areEqual(this.brand, gearEntity.brand) && Intrinsics.areEqual(this.model, gearEntity.model) && Intrinsics.areEqual(this.purchaseDateMs, gearEntity.purchaseDateMs) && Double.compare(this.startingOdometerKm, gearEntity.startingOdometerKm) == 0 && Intrinsics.areEqual(this.notes, gearEntity.notes) && this.isRetired == gearEntity.isRetired && this.isDefaultForRun == gearEntity.isDefaultForRun && this.isDefaultForRide == gearEntity.isDefaultForRide && Intrinsics.areEqual(this.photoUri, gearEntity.photoUri) && Intrinsics.areEqual(this.parentGearId, gearEntity.parentGearId) && this.createdAtMs == gearEntity.createdAtMs;
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.id) * 31) + this.gearType.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.brand;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.model;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.purchaseDateMs;
        int hashCode4 = (((hashCode3 + (l == null ? 0 : l.hashCode())) * 31) + Double.hashCode(this.startingOdometerKm)) * 31;
        String str3 = this.notes;
        int hashCode5 = (((((((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isRetired)) * 31) + Boolean.hashCode(this.isDefaultForRun)) * 31) + Boolean.hashCode(this.isDefaultForRide)) * 31;
        String str4 = this.photoUri;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.parentGearId;
        return ((hashCode6 + (l2 != null ? l2.hashCode() : 0)) * 31) + Long.hashCode(this.createdAtMs);
    }

    public String toString() {
        return "GearEntity(id=" + this.id + ", gearType=" + this.gearType + ", name=" + this.name + ", brand=" + this.brand + ", model=" + this.model + ", purchaseDateMs=" + this.purchaseDateMs + ", startingOdometerKm=" + this.startingOdometerKm + ", notes=" + this.notes + ", isRetired=" + this.isRetired + ", isDefaultForRun=" + this.isDefaultForRun + ", isDefaultForRide=" + this.isDefaultForRide + ", photoUri=" + this.photoUri + ", parentGearId=" + this.parentGearId + ", createdAtMs=" + this.createdAtMs + ")";
    }

    public GearEntity(long j, String gearType, String name, String str, String str2, Long l, double d, String str3, boolean z, boolean z2, boolean z3, String str4, Long l2, long j2) {
        Intrinsics.checkNotNullParameter(gearType, "gearType");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j;
        this.gearType = gearType;
        this.name = name;
        this.brand = str;
        this.model = str2;
        this.purchaseDateMs = l;
        this.startingOdometerKm = d;
        this.notes = str3;
        this.isRetired = z;
        this.isDefaultForRun = z2;
        this.isDefaultForRide = z3;
        this.photoUri = str4;
        this.parentGearId = l2;
        this.createdAtMs = j2;
    }

    public final long getId() {
        return this.id;
    }

    public final String getGearType() {
        return this.gearType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getModel() {
        return this.model;
    }

    public final Long getPurchaseDateMs() {
        return this.purchaseDateMs;
    }

    public final double getStartingOdometerKm() {
        return this.startingOdometerKm;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final boolean isRetired() {
        return this.isRetired;
    }

    public final boolean isDefaultForRun() {
        return this.isDefaultForRun;
    }

    public final boolean isDefaultForRide() {
        return this.isDefaultForRide;
    }

    public final String getPhotoUri() {
        return this.photoUri;
    }

    public final Long getParentGearId() {
        return this.parentGearId;
    }

    public /* synthetic */ GearEntity(long j, String str, String str2, String str3, String str4, Long l, double d, String str5, boolean z, boolean z2, boolean z3, String str6, Long l2, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? 0.0d : d, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : l2, (i & 8192) != 0 ? System.currentTimeMillis() : j2);
    }

    public final long getCreatedAtMs() {
        return this.createdAtMs;
    }
}
