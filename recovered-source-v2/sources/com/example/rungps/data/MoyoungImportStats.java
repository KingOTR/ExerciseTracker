package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoyoungImportStats.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/data/MoyoungImportStats;", "", "imported", "", "alreadySynced", "onPhoneAlready", "fetchedFromWatch", "<init>", "(IIII)V", "getImported", "()I", "getAlreadySynced", "getOnPhoneAlready", "getFetchedFromWatch", "message", "", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MoyoungImportStats {
    public static final int $stable = 0;
    private final int alreadySynced;
    private final int fetchedFromWatch;
    private final int imported;
    private final int onPhoneAlready;

    public MoyoungImportStats() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ MoyoungImportStats copy$default(MoyoungImportStats moyoungImportStats, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = moyoungImportStats.imported;
        }
        if ((i5 & 2) != 0) {
            i2 = moyoungImportStats.alreadySynced;
        }
        if ((i5 & 4) != 0) {
            i3 = moyoungImportStats.onPhoneAlready;
        }
        if ((i5 & 8) != 0) {
            i4 = moyoungImportStats.fetchedFromWatch;
        }
        return moyoungImportStats.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getImported() {
        return this.imported;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAlreadySynced() {
        return this.alreadySynced;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOnPhoneAlready() {
        return this.onPhoneAlready;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFetchedFromWatch() {
        return this.fetchedFromWatch;
    }

    public final MoyoungImportStats copy(int imported, int alreadySynced, int onPhoneAlready, int fetchedFromWatch) {
        return new MoyoungImportStats(imported, alreadySynced, onPhoneAlready, fetchedFromWatch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoyoungImportStats)) {
            return false;
        }
        MoyoungImportStats moyoungImportStats = (MoyoungImportStats) other;
        return this.imported == moyoungImportStats.imported && this.alreadySynced == moyoungImportStats.alreadySynced && this.onPhoneAlready == moyoungImportStats.onPhoneAlready && this.fetchedFromWatch == moyoungImportStats.fetchedFromWatch;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.imported) * 31) + Integer.hashCode(this.alreadySynced)) * 31) + Integer.hashCode(this.onPhoneAlready)) * 31) + Integer.hashCode(this.fetchedFromWatch);
    }

    public String toString() {
        return "MoyoungImportStats(imported=" + this.imported + ", alreadySynced=" + this.alreadySynced + ", onPhoneAlready=" + this.onPhoneAlready + ", fetchedFromWatch=" + this.fetchedFromWatch + ")";
    }

    public MoyoungImportStats(int i, int i2, int i3, int i4) {
        this.imported = i;
        this.alreadySynced = i2;
        this.onPhoneAlready = i3;
        this.fetchedFromWatch = i4;
    }

    public /* synthetic */ MoyoungImportStats(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public final int getImported() {
        return this.imported;
    }

    public final int getAlreadySynced() {
        return this.alreadySynced;
    }

    public final int getOnPhoneAlready() {
        return this.onPhoneAlready;
    }

    public final int getFetchedFromWatch() {
        return this.fetchedFromWatch;
    }

    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.fetchedFromWatch;
        if (i > 0) {
            sb.append("Found " + i + " on watch");
        }
        if (this.imported > 0) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append("imported " + this.imported);
        }
        if (this.alreadySynced > 0) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(this.alreadySynced + " already synced");
        }
        if (this.onPhoneAlready > 0) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(this.onPhoneAlready + " skipped (duplicate)");
        }
        if (this.fetchedFromWatch > 0 && this.imported == 0 && this.alreadySynced > 0) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append("delete the old Watch session in Soccer to re-import");
        }
        if (sb.length() == 0) {
            if (this.fetchedFromWatch == 0) {
                str = "No workouts on watch — close Da Fit, reconnect on Home, record Football on watch, then sync";
            } else {
                str = "Nothing new to import";
            }
            sb.append(str);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
