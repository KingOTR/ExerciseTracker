package com.example.rungps.recovery;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StravaRecoverySyncResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006$"}, d2 = {"Lcom/example/rungps/recovery/StravaRecoverySyncResult;", "", "inserted", "", "apiTrainingCount", "inWindowCount", "linkedSkipped", "alreadyStored", "planRejected", "refreshed", "<init>", "(IIIIIII)V", "getInserted", "()I", "getApiTrainingCount", "getInWindowCount", "getLinkedSkipped", "getAlreadyStored", "getPlanRejected", "getRefreshed", "summarySuffix", "", "diagnosticMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StravaRecoverySyncResult {
    public static final int $stable = 0;
    private final int alreadyStored;
    private final int apiTrainingCount;
    private final int inWindowCount;
    private final int inserted;
    private final int linkedSkipped;
    private final int planRejected;
    private final int refreshed;

    public static /* synthetic */ StravaRecoverySyncResult copy$default(StravaRecoverySyncResult stravaRecoverySyncResult, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = stravaRecoverySyncResult.inserted;
        }
        if ((i8 & 2) != 0) {
            i2 = stravaRecoverySyncResult.apiTrainingCount;
        }
        int i9 = i2;
        if ((i8 & 4) != 0) {
            i3 = stravaRecoverySyncResult.inWindowCount;
        }
        int i10 = i3;
        if ((i8 & 8) != 0) {
            i4 = stravaRecoverySyncResult.linkedSkipped;
        }
        int i11 = i4;
        if ((i8 & 16) != 0) {
            i5 = stravaRecoverySyncResult.alreadyStored;
        }
        int i12 = i5;
        if ((i8 & 32) != 0) {
            i6 = stravaRecoverySyncResult.planRejected;
        }
        int i13 = i6;
        if ((i8 & 64) != 0) {
            i7 = stravaRecoverySyncResult.refreshed;
        }
        return stravaRecoverySyncResult.copy(i, i9, i10, i11, i12, i13, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getInserted() {
        return this.inserted;
    }

    /* renamed from: component2, reason: from getter */
    public final int getApiTrainingCount() {
        return this.apiTrainingCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getInWindowCount() {
        return this.inWindowCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLinkedSkipped() {
        return this.linkedSkipped;
    }

    /* renamed from: component5, reason: from getter */
    public final int getAlreadyStored() {
        return this.alreadyStored;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPlanRejected() {
        return this.planRejected;
    }

    /* renamed from: component7, reason: from getter */
    public final int getRefreshed() {
        return this.refreshed;
    }

    public final StravaRecoverySyncResult copy(int inserted, int apiTrainingCount, int inWindowCount, int linkedSkipped, int alreadyStored, int planRejected, int refreshed) {
        return new StravaRecoverySyncResult(inserted, apiTrainingCount, inWindowCount, linkedSkipped, alreadyStored, planRejected, refreshed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StravaRecoverySyncResult)) {
            return false;
        }
        StravaRecoverySyncResult stravaRecoverySyncResult = (StravaRecoverySyncResult) other;
        return this.inserted == stravaRecoverySyncResult.inserted && this.apiTrainingCount == stravaRecoverySyncResult.apiTrainingCount && this.inWindowCount == stravaRecoverySyncResult.inWindowCount && this.linkedSkipped == stravaRecoverySyncResult.linkedSkipped && this.alreadyStored == stravaRecoverySyncResult.alreadyStored && this.planRejected == stravaRecoverySyncResult.planRejected && this.refreshed == stravaRecoverySyncResult.refreshed;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.inserted) * 31) + Integer.hashCode(this.apiTrainingCount)) * 31) + Integer.hashCode(this.inWindowCount)) * 31) + Integer.hashCode(this.linkedSkipped)) * 31) + Integer.hashCode(this.alreadyStored)) * 31) + Integer.hashCode(this.planRejected)) * 31) + Integer.hashCode(this.refreshed);
    }

    public String toString() {
        return "StravaRecoverySyncResult(inserted=" + this.inserted + ", apiTrainingCount=" + this.apiTrainingCount + ", inWindowCount=" + this.inWindowCount + ", linkedSkipped=" + this.linkedSkipped + ", alreadyStored=" + this.alreadyStored + ", planRejected=" + this.planRejected + ", refreshed=" + this.refreshed + ")";
    }

    public StravaRecoverySyncResult(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.inserted = i;
        this.apiTrainingCount = i2;
        this.inWindowCount = i3;
        this.linkedSkipped = i4;
        this.alreadyStored = i5;
        this.planRejected = i6;
        this.refreshed = i7;
    }

    public /* synthetic */ StravaRecoverySyncResult(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, i6, (i8 & 64) != 0 ? 0 : i7);
    }

    public final int getInserted() {
        return this.inserted;
    }

    public final int getApiTrainingCount() {
        return this.apiTrainingCount;
    }

    public final int getInWindowCount() {
        return this.inWindowCount;
    }

    public final int getLinkedSkipped() {
        return this.linkedSkipped;
    }

    public final int getAlreadyStored() {
        return this.alreadyStored;
    }

    public final int getPlanRejected() {
        return this.planRejected;
    }

    public final int getRefreshed() {
        return this.refreshed;
    }

    public final String summarySuffix() {
        if (this.inserted > 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        int i = this.apiTrainingCount;
        if (i == 0) {
            arrayList.add("no run/ride activities returned from Strava");
        } else {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(i + " run/ride(s) from API");
            int i2 = this.inWindowCount;
            if (i2 != this.apiTrainingCount) {
                arrayList2.add(i2 + " in date window");
            }
            int i3 = this.linkedSkipped;
            if (i3 > 0) {
                arrayList2.add(i3 + " uploaded-from-app skipped");
            }
            int i4 = this.alreadyStored;
            if (i4 > 0) {
                arrayList2.add(i4 + " already active in Recovery");
            }
            int i5 = this.refreshed;
            if (i5 > 0) {
                arrayList2.add(i5 + " refreshed");
            }
            int i6 = this.planRejected;
            if (i6 > 0) {
                arrayList2.add(i6 + " too short to import");
            }
        }
        return CollectionsKt.joinToString$default(arrayList, " · ", null, null, 0, null, null, 62, null);
    }

    public final String diagnosticMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("API " + this.apiTrainingCount + " run/ride(s)");
        int i = this.inWindowCount;
        if (i != this.apiTrainingCount) {
            sb.append(", " + i + " in window");
        }
        int i2 = this.linkedSkipped;
        if (i2 > 0) {
            sb.append(", " + i2 + " linked skipped");
        }
        int i3 = this.alreadyStored;
        if (i3 > 0) {
            sb.append(", " + i3 + " already active");
        }
        int i4 = this.refreshed;
        if (i4 > 0) {
            sb.append(", " + i4 + " refreshed");
        }
        int i5 = this.planRejected;
        if (i5 > 0) {
            sb.append(", " + i5 + " rejected");
        }
        sb.append(" → imported " + this.inserted);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
