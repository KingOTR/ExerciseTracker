package com.example.rungps.importing;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymTrackingXlsxImporter.kt */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J,\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"com/example/rungps/importing/GymTrackingXlsxImporter$parseSheetSessions$ColMeta", "", "col", "", "date", "Ljava/time/LocalDate;", "cycle", "<init>", "(ILjava/time/LocalDate;I)V", "getCol", "()I", "getDate", "()Ljava/time/LocalDate;", "getCycle", "component1", "component2", "component3", "copy", "(ILjava/time/LocalDate;I)Lcom/example/rungps/importing/GymTrackingXlsxImporter$parseSheetSessions$ColMeta;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymTrackingXlsxImporter$parseSheetSessions$ColMeta {
    private final int col;
    private final int cycle;
    private final LocalDate date;

    public static /* synthetic */ GymTrackingXlsxImporter$parseSheetSessions$ColMeta copy$default(GymTrackingXlsxImporter$parseSheetSessions$ColMeta gymTrackingXlsxImporter$parseSheetSessions$ColMeta, int i, LocalDate localDate, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = gymTrackingXlsxImporter$parseSheetSessions$ColMeta.col;
        }
        if ((i3 & 2) != 0) {
            localDate = gymTrackingXlsxImporter$parseSheetSessions$ColMeta.date;
        }
        if ((i3 & 4) != 0) {
            i2 = gymTrackingXlsxImporter$parseSheetSessions$ColMeta.cycle;
        }
        return gymTrackingXlsxImporter$parseSheetSessions$ColMeta.copy(i, localDate, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCol() {
        return this.col;
    }

    /* renamed from: component2, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCycle() {
        return this.cycle;
    }

    public final GymTrackingXlsxImporter$parseSheetSessions$ColMeta copy(int col, LocalDate date, int cycle) {
        Intrinsics.checkNotNullParameter(date, "date");
        return new GymTrackingXlsxImporter$parseSheetSessions$ColMeta(col, date, cycle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymTrackingXlsxImporter$parseSheetSessions$ColMeta)) {
            return false;
        }
        GymTrackingXlsxImporter$parseSheetSessions$ColMeta gymTrackingXlsxImporter$parseSheetSessions$ColMeta = (GymTrackingXlsxImporter$parseSheetSessions$ColMeta) other;
        return this.col == gymTrackingXlsxImporter$parseSheetSessions$ColMeta.col && Intrinsics.areEqual(this.date, gymTrackingXlsxImporter$parseSheetSessions$ColMeta.date) && this.cycle == gymTrackingXlsxImporter$parseSheetSessions$ColMeta.cycle;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.col) * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.cycle);
    }

    public String toString() {
        return "ColMeta(col=" + this.col + ", date=" + this.date + ", cycle=" + this.cycle + ")";
    }

    public GymTrackingXlsxImporter$parseSheetSessions$ColMeta(int i, LocalDate date, int i2) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.col = i;
        this.date = date;
        this.cycle = i2;
    }

    public final int getCol() {
        return this.col;
    }

    public final int getCycle() {
        return this.cycle;
    }

    public final LocalDate getDate() {
        return this.date;
    }
}
