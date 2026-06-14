package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepCalendarHelper.kt */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"com/example/rungps/sleep/SleepCalendarHelper$mergeTomorrowCommitments$Ev", "", "title", "", "startMs", "", "loc", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getStartMs", "()J", "getLoc", "component1", "component2", "component3", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/example/rungps/sleep/SleepCalendarHelper$mergeTomorrowCommitments$Ev;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SleepCalendarHelper$mergeTomorrowCommitments$Ev {
    private final String loc;
    private final long startMs;
    private final String title;

    public static /* synthetic */ SleepCalendarHelper$mergeTomorrowCommitments$Ev copy$default(SleepCalendarHelper$mergeTomorrowCommitments$Ev sleepCalendarHelper$mergeTomorrowCommitments$Ev, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepCalendarHelper$mergeTomorrowCommitments$Ev.title;
        }
        if ((i & 2) != 0) {
            j = sleepCalendarHelper$mergeTomorrowCommitments$Ev.startMs;
        }
        if ((i & 4) != 0) {
            str2 = sleepCalendarHelper$mergeTomorrowCommitments$Ev.loc;
        }
        return sleepCalendarHelper$mergeTomorrowCommitments$Ev.copy(str, j, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartMs() {
        return this.startMs;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLoc() {
        return this.loc;
    }

    public final SleepCalendarHelper$mergeTomorrowCommitments$Ev copy(String title, long startMs, String loc) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new SleepCalendarHelper$mergeTomorrowCommitments$Ev(title, startMs, loc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepCalendarHelper$mergeTomorrowCommitments$Ev)) {
            return false;
        }
        SleepCalendarHelper$mergeTomorrowCommitments$Ev sleepCalendarHelper$mergeTomorrowCommitments$Ev = (SleepCalendarHelper$mergeTomorrowCommitments$Ev) other;
        return Intrinsics.areEqual(this.title, sleepCalendarHelper$mergeTomorrowCommitments$Ev.title) && this.startMs == sleepCalendarHelper$mergeTomorrowCommitments$Ev.startMs && Intrinsics.areEqual(this.loc, sleepCalendarHelper$mergeTomorrowCommitments$Ev.loc);
    }

    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + Long.hashCode(this.startMs)) * 31;
        String str = this.loc;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Ev(title=" + this.title + ", startMs=" + this.startMs + ", loc=" + this.loc + ")";
    }

    public SleepCalendarHelper$mergeTomorrowCommitments$Ev(String title, long j, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.startMs = j;
        this.loc = str;
    }

    public final String getLoc() {
        return this.loc;
    }

    public final long getStartMs() {
        return this.startMs;
    }

    public final String getTitle() {
        return this.title;
    }
}
