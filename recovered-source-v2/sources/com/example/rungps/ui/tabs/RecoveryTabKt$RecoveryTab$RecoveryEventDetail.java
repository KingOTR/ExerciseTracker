package com.example.rungps.ui.tabs;

import androidx.core.app.NotificationCompat;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.RecoveryEventEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.style.layers.Property;

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J@\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"com/example/rungps/ui/tabs/RecoveryTabKt$RecoveryTab$RecoveryEventDetail", "", NotificationCompat.CATEGORY_EVENT, "Lcom/example/rungps/data/RecoveryEventEntity;", "title", "", Property.SYMBOL_Z_ORDER_SOURCE, "why", "remainingMs", "", "<init>", "(Lcom/example/rungps/data/RecoveryEventEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getEvent", "()Lcom/example/rungps/data/RecoveryEventEntity;", "getTitle", "()Ljava/lang/String;", "getSource", "getWhy", "getRemainingMs", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/example/rungps/data/RecoveryEventEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/example/rungps/ui/tabs/RecoveryTabKt$RecoveryTab$RecoveryEventDetail;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecoveryTabKt$RecoveryTab$RecoveryEventDetail {
    private final RecoveryEventEntity event;
    private final long remainingMs;
    private final String source;
    private final String title;
    private final String why;

    public static /* synthetic */ RecoveryTabKt$RecoveryTab$RecoveryEventDetail copy$default(RecoveryTabKt$RecoveryTab$RecoveryEventDetail recoveryTabKt$RecoveryTab$RecoveryEventDetail, RecoveryEventEntity recoveryEventEntity, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            recoveryEventEntity = recoveryTabKt$RecoveryTab$RecoveryEventDetail.event;
        }
        if ((i & 2) != 0) {
            str = recoveryTabKt$RecoveryTab$RecoveryEventDetail.title;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = recoveryTabKt$RecoveryTab$RecoveryEventDetail.source;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = recoveryTabKt$RecoveryTab$RecoveryEventDetail.why;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            j = recoveryTabKt$RecoveryTab$RecoveryEventDetail.remainingMs;
        }
        return recoveryTabKt$RecoveryTab$RecoveryEventDetail.copy(recoveryEventEntity, str4, str5, str6, j);
    }

    /* renamed from: component1, reason: from getter */
    public final RecoveryEventEntity getEvent() {
        return this.event;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component4, reason: from getter */
    public final String getWhy() {
        return this.why;
    }

    /* renamed from: component5, reason: from getter */
    public final long getRemainingMs() {
        return this.remainingMs;
    }

    public final RecoveryTabKt$RecoveryTab$RecoveryEventDetail copy(RecoveryEventEntity event, String title, String source, String why, long remainingMs) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(why, "why");
        return new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(event, title, source, why, remainingMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecoveryTabKt$RecoveryTab$RecoveryEventDetail)) {
            return false;
        }
        RecoveryTabKt$RecoveryTab$RecoveryEventDetail recoveryTabKt$RecoveryTab$RecoveryEventDetail = (RecoveryTabKt$RecoveryTab$RecoveryEventDetail) other;
        return Intrinsics.areEqual(this.event, recoveryTabKt$RecoveryTab$RecoveryEventDetail.event) && Intrinsics.areEqual(this.title, recoveryTabKt$RecoveryTab$RecoveryEventDetail.title) && Intrinsics.areEqual(this.source, recoveryTabKt$RecoveryTab$RecoveryEventDetail.source) && Intrinsics.areEqual(this.why, recoveryTabKt$RecoveryTab$RecoveryEventDetail.why) && this.remainingMs == recoveryTabKt$RecoveryTab$RecoveryEventDetail.remainingMs;
    }

    public int hashCode() {
        return (((((((this.event.hashCode() * 31) + this.title.hashCode()) * 31) + this.source.hashCode()) * 31) + this.why.hashCode()) * 31) + Long.hashCode(this.remainingMs);
    }

    public String toString() {
        return "RecoveryEventDetail(event=" + this.event + ", title=" + this.title + ", source=" + this.source + ", why=" + this.why + ", remainingMs=" + this.remainingMs + ")";
    }

    public RecoveryTabKt$RecoveryTab$RecoveryEventDetail(RecoveryEventEntity event, String title, String source, String why, long j) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(why, "why");
        this.event = event;
        this.title = title;
        this.source = source;
        this.why = why;
        this.remainingMs = j;
    }

    public final RecoveryEventEntity getEvent() {
        return this.event;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getWhy() {
        return this.why;
    }

    public final long getRemainingMs() {
        return this.remainingMs;
    }
}
