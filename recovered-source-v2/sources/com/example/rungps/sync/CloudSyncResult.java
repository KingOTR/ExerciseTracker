package com.example.rungps.sync;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CloudSyncManager.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010$\u001a\u00020\u000fJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011HÆ\u0003J}\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011HÆ\u0001J\u0013\u00101\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lcom/example/rungps/sync/CloudSyncResult;", "", "gymPushed", "", "runsPushed", "soccerPushed", "sleepPushed", "recoveryPushed", "gymMergedFromCloud", "lastSyncMs", "", "splitPulledFromCloud", "", "runsPulledFromCloud", "uid", "", "errors", "", "<init>", "(IIIIIIJZILjava/lang/String;Ljava/util/List;)V", "getGymPushed", "()I", "getRunsPushed", "getSoccerPushed", "getSleepPushed", "getRecoveryPushed", "getGymMergedFromCloud", "getLastSyncMs", "()J", "getSplitPulledFromCloud", "()Z", "getRunsPulledFromCloud", "getUid", "()Ljava/lang/String;", "getErrors", "()Ljava/util/List;", "summary", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CloudSyncResult {
    public static final int $stable = 8;
    private final List<String> errors;
    private final int gymMergedFromCloud;
    private final int gymPushed;
    private final long lastSyncMs;
    private final int recoveryPushed;
    private final int runsPulledFromCloud;
    private final int runsPushed;
    private final int sleepPushed;
    private final int soccerPushed;
    private final boolean splitPulledFromCloud;
    private final String uid;

    /* renamed from: component1, reason: from getter */
    public final int getGymPushed() {
        return this.gymPushed;
    }

    /* renamed from: component10, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    public final List<String> component11() {
        return this.errors;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRunsPushed() {
        return this.runsPushed;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSoccerPushed() {
        return this.soccerPushed;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSleepPushed() {
        return this.sleepPushed;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRecoveryPushed() {
        return this.recoveryPushed;
    }

    /* renamed from: component6, reason: from getter */
    public final int getGymMergedFromCloud() {
        return this.gymMergedFromCloud;
    }

    /* renamed from: component7, reason: from getter */
    public final long getLastSyncMs() {
        return this.lastSyncMs;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSplitPulledFromCloud() {
        return this.splitPulledFromCloud;
    }

    /* renamed from: component9, reason: from getter */
    public final int getRunsPulledFromCloud() {
        return this.runsPulledFromCloud;
    }

    public final CloudSyncResult copy(int gymPushed, int runsPushed, int soccerPushed, int sleepPushed, int recoveryPushed, int gymMergedFromCloud, long lastSyncMs, boolean splitPulledFromCloud, int runsPulledFromCloud, String uid, List<String> errors) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(errors, "errors");
        return new CloudSyncResult(gymPushed, runsPushed, soccerPushed, sleepPushed, recoveryPushed, gymMergedFromCloud, lastSyncMs, splitPulledFromCloud, runsPulledFromCloud, uid, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudSyncResult)) {
            return false;
        }
        CloudSyncResult cloudSyncResult = (CloudSyncResult) other;
        return this.gymPushed == cloudSyncResult.gymPushed && this.runsPushed == cloudSyncResult.runsPushed && this.soccerPushed == cloudSyncResult.soccerPushed && this.sleepPushed == cloudSyncResult.sleepPushed && this.recoveryPushed == cloudSyncResult.recoveryPushed && this.gymMergedFromCloud == cloudSyncResult.gymMergedFromCloud && this.lastSyncMs == cloudSyncResult.lastSyncMs && this.splitPulledFromCloud == cloudSyncResult.splitPulledFromCloud && this.runsPulledFromCloud == cloudSyncResult.runsPulledFromCloud && Intrinsics.areEqual(this.uid, cloudSyncResult.uid) && Intrinsics.areEqual(this.errors, cloudSyncResult.errors);
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.gymPushed) * 31) + Integer.hashCode(this.runsPushed)) * 31) + Integer.hashCode(this.soccerPushed)) * 31) + Integer.hashCode(this.sleepPushed)) * 31) + Integer.hashCode(this.recoveryPushed)) * 31) + Integer.hashCode(this.gymMergedFromCloud)) * 31) + Long.hashCode(this.lastSyncMs)) * 31) + Boolean.hashCode(this.splitPulledFromCloud)) * 31) + Integer.hashCode(this.runsPulledFromCloud)) * 31) + this.uid.hashCode()) * 31) + this.errors.hashCode();
    }

    public String toString() {
        return "CloudSyncResult(gymPushed=" + this.gymPushed + ", runsPushed=" + this.runsPushed + ", soccerPushed=" + this.soccerPushed + ", sleepPushed=" + this.sleepPushed + ", recoveryPushed=" + this.recoveryPushed + ", gymMergedFromCloud=" + this.gymMergedFromCloud + ", lastSyncMs=" + this.lastSyncMs + ", splitPulledFromCloud=" + this.splitPulledFromCloud + ", runsPulledFromCloud=" + this.runsPulledFromCloud + ", uid=" + this.uid + ", errors=" + this.errors + ")";
    }

    public CloudSyncResult(int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z, int i7, String uid, List<String> errors) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.gymPushed = i;
        this.runsPushed = i2;
        this.soccerPushed = i3;
        this.sleepPushed = i4;
        this.recoveryPushed = i5;
        this.gymMergedFromCloud = i6;
        this.lastSyncMs = j;
        this.splitPulledFromCloud = z;
        this.runsPulledFromCloud = i7;
        this.uid = uid;
        this.errors = errors;
    }

    public final int getGymPushed() {
        return this.gymPushed;
    }

    public final int getRunsPushed() {
        return this.runsPushed;
    }

    public final int getSoccerPushed() {
        return this.soccerPushed;
    }

    public final int getSleepPushed() {
        return this.sleepPushed;
    }

    public final int getRecoveryPushed() {
        return this.recoveryPushed;
    }

    public final int getGymMergedFromCloud() {
        return this.gymMergedFromCloud;
    }

    public final long getLastSyncMs() {
        return this.lastSyncMs;
    }

    public final boolean getSplitPulledFromCloud() {
        return this.splitPulledFromCloud;
    }

    public final int getRunsPulledFromCloud() {
        return this.runsPulledFromCloud;
    }

    public /* synthetic */ CloudSyncResult(int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z, int i7, String str, List list, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, i6, j, (i8 & 128) != 0 ? false : z, (i8 & 256) != 0 ? 0 : i7, (i8 & 512) != 0 ? "" : str, (i8 & 1024) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getUid() {
        return this.uid;
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public final String summary() {
        String str = this.splitPulledFromCloud ? " · split pulled from web" : "";
        int i = this.runsPulledFromCloud;
        String str2 = i > 0 ? " · " + i + " runs pulled" : "";
        String str3 = "gym " + this.gymPushed + " · runs " + this.runsPushed + " · soccer " + this.soccerPushed + " · sleep " + this.sleepPushed + " · merged " + this.gymMergedFromCloud + str + str2;
        if (this.errors.isEmpty()) {
            return str3;
        }
        return str3 + " · " + CollectionsKt.first((List) this.errors);
    }
}
