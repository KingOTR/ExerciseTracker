package com.example.rungps.strava;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StravaHistorySyncResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006&"}, d2 = {"Lcom/example/rungps/strava/StravaHistorySyncResult;", "", "runsImported", "", "ridesImported", "apiTrainingCount", "linkedSkipped", "duplicateSkipped", "alreadyStored", "rejected", "<init>", "(IIIIIII)V", "getRunsImported", "()I", "getRidesImported", "getApiTrainingCount", "getLinkedSkipped", "getDuplicateSkipped", "getAlreadyStored", "getRejected", "totalImported", "getTotalImported", "userMessage", "", "summarySuffix", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StravaHistorySyncResult {
    public static final int $stable = 0;
    private final int alreadyStored;
    private final int apiTrainingCount;
    private final int duplicateSkipped;
    private final int linkedSkipped;
    private final int rejected;
    private final int ridesImported;
    private final int runsImported;

    public static /* synthetic */ StravaHistorySyncResult copy$default(StravaHistorySyncResult stravaHistorySyncResult, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = stravaHistorySyncResult.runsImported;
        }
        if ((i8 & 2) != 0) {
            i2 = stravaHistorySyncResult.ridesImported;
        }
        int i9 = i2;
        if ((i8 & 4) != 0) {
            i3 = stravaHistorySyncResult.apiTrainingCount;
        }
        int i10 = i3;
        if ((i8 & 8) != 0) {
            i4 = stravaHistorySyncResult.linkedSkipped;
        }
        int i11 = i4;
        if ((i8 & 16) != 0) {
            i5 = stravaHistorySyncResult.duplicateSkipped;
        }
        int i12 = i5;
        if ((i8 & 32) != 0) {
            i6 = stravaHistorySyncResult.alreadyStored;
        }
        int i13 = i6;
        if ((i8 & 64) != 0) {
            i7 = stravaHistorySyncResult.rejected;
        }
        return stravaHistorySyncResult.copy(i, i9, i10, i11, i12, i13, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRunsImported() {
        return this.runsImported;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRidesImported() {
        return this.ridesImported;
    }

    /* renamed from: component3, reason: from getter */
    public final int getApiTrainingCount() {
        return this.apiTrainingCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLinkedSkipped() {
        return this.linkedSkipped;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDuplicateSkipped() {
        return this.duplicateSkipped;
    }

    /* renamed from: component6, reason: from getter */
    public final int getAlreadyStored() {
        return this.alreadyStored;
    }

    /* renamed from: component7, reason: from getter */
    public final int getRejected() {
        return this.rejected;
    }

    public final StravaHistorySyncResult copy(int runsImported, int ridesImported, int apiTrainingCount, int linkedSkipped, int duplicateSkipped, int alreadyStored, int rejected) {
        return new StravaHistorySyncResult(runsImported, ridesImported, apiTrainingCount, linkedSkipped, duplicateSkipped, alreadyStored, rejected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StravaHistorySyncResult)) {
            return false;
        }
        StravaHistorySyncResult stravaHistorySyncResult = (StravaHistorySyncResult) other;
        return this.runsImported == stravaHistorySyncResult.runsImported && this.ridesImported == stravaHistorySyncResult.ridesImported && this.apiTrainingCount == stravaHistorySyncResult.apiTrainingCount && this.linkedSkipped == stravaHistorySyncResult.linkedSkipped && this.duplicateSkipped == stravaHistorySyncResult.duplicateSkipped && this.alreadyStored == stravaHistorySyncResult.alreadyStored && this.rejected == stravaHistorySyncResult.rejected;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.runsImported) * 31) + Integer.hashCode(this.ridesImported)) * 31) + Integer.hashCode(this.apiTrainingCount)) * 31) + Integer.hashCode(this.linkedSkipped)) * 31) + Integer.hashCode(this.duplicateSkipped)) * 31) + Integer.hashCode(this.alreadyStored)) * 31) + Integer.hashCode(this.rejected);
    }

    public String toString() {
        return "StravaHistorySyncResult(runsImported=" + this.runsImported + ", ridesImported=" + this.ridesImported + ", apiTrainingCount=" + this.apiTrainingCount + ", linkedSkipped=" + this.linkedSkipped + ", duplicateSkipped=" + this.duplicateSkipped + ", alreadyStored=" + this.alreadyStored + ", rejected=" + this.rejected + ")";
    }

    public StravaHistorySyncResult(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.runsImported = i;
        this.ridesImported = i2;
        this.apiTrainingCount = i3;
        this.linkedSkipped = i4;
        this.duplicateSkipped = i5;
        this.alreadyStored = i6;
        this.rejected = i7;
    }

    public final int getRunsImported() {
        return this.runsImported;
    }

    public final int getRidesImported() {
        return this.ridesImported;
    }

    public final int getApiTrainingCount() {
        return this.apiTrainingCount;
    }

    public final int getLinkedSkipped() {
        return this.linkedSkipped;
    }

    public final int getDuplicateSkipped() {
        return this.duplicateSkipped;
    }

    public final int getAlreadyStored() {
        return this.alreadyStored;
    }

    public final int getRejected() {
        return this.rejected;
    }

    public final int getTotalImported() {
        return this.runsImported + this.ridesImported;
    }

    public final String userMessage() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = this.runsImported;
        if (i2 <= 0 || (i = this.ridesImported) <= 0) {
            if (i2 > 0) {
                sb.append("Imported " + i2 + " run" + (i2 != 1 ? "s" : "") + " to History");
            } else {
                int i3 = this.ridesImported;
                if (i3 > 0) {
                    sb.append("Imported " + i3 + " ride" + (i3 != 1 ? "s" : "") + " to History");
                } else {
                    sb.append("Imported 0 runs/rides to History");
                }
            }
        } else {
            sb.append("Imported " + i2 + " runs and " + i + " rides to History");
        }
        if (getTotalImported() == 0) {
            ArrayList arrayList = new ArrayList();
            int i4 = this.apiTrainingCount;
            if (i4 == 0) {
                arrayList.add("no run/ride activities from Strava");
            } else {
                arrayList.add(i4 + " from API");
            }
            int i5 = this.linkedSkipped;
            if (i5 > 0) {
                arrayList.add(i5 + " uploaded-from-app skipped");
            }
            int i6 = this.alreadyStored;
            if (i6 > 0) {
                arrayList.add(i6 + " already in History");
            }
            int i7 = this.duplicateSkipped;
            if (i7 > 0) {
                arrayList.add(i7 + " local duplicates skipped");
            }
            int i8 = this.rejected;
            if (i8 > 0) {
                arrayList.add(i8 + " too short");
            }
            if (!arrayList.isEmpty()) {
                sb.append(" (" + CollectionsKt.joinToString$default(arrayList, " · ", null, null, 0, null, null, 62, null) + ")");
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final String summarySuffix() {
        if (getTotalImported() > 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        int i = this.apiTrainingCount;
        if (i == 0) {
            arrayList.add("no run/ride activities returned from Strava");
        } else {
            arrayList.add(i + " run/ride(s) from API");
        }
        int i2 = this.linkedSkipped;
        if (i2 > 0) {
            arrayList.add(i2 + " uploaded-from-app skipped");
        }
        int i3 = this.alreadyStored;
        if (i3 > 0) {
            arrayList.add(i3 + " already in History");
        }
        int i4 = this.duplicateSkipped;
        if (i4 > 0) {
            arrayList.add(i4 + " local duplicate(s) skipped");
        }
        int i5 = this.rejected;
        if (i5 > 0) {
            arrayList.add(i5 + " too short to import");
        }
        return CollectionsKt.joinToString$default(arrayList, " · ", null, null, 0, null, null, 62, null);
    }
}
