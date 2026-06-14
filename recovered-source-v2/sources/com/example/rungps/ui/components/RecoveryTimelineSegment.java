package com.example.rungps.ui.components;

import androidx.compose.ui.graphics.Color;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecoveryTimeline.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JN\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006&"}, d2 = {"Lcom/example/rungps/ui/components/RecoveryTimelineSegment;", "", "label", "", "kind", "recoveryStartMs", "", "endMs", "color", "Landroidx/compose/ui/graphics/Color;", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLabel", "()Ljava/lang/String;", "getKind", "getRecoveryStartMs", "()J", "getEndMs", "getColor-0d7_KjU", "J", "getSubtitle", "component1", "component2", "component3", "component4", "component5", "component5-0d7_KjU", "component6", "copy", "copy-jzV_Hc0", "(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;)Lcom/example/rungps/ui/components/RecoveryTimelineSegment;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecoveryTimelineSegment {
    public static final int $stable = 0;
    private final long color;
    private final long endMs;
    private final String kind;
    private final String label;
    private final long recoveryStartMs;
    private final String subtitle;

    public /* synthetic */ RecoveryTimelineSegment(String str, String str2, long j, long j2, long j3, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, j3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component3, reason: from getter */
    public final long getRecoveryStartMs() {
        return this.recoveryStartMs;
    }

    /* renamed from: component4, reason: from getter */
    public final long getEndMs() {
        return this.endMs;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: copy-jzV_Hc0, reason: not valid java name */
    public final RecoveryTimelineSegment m6977copyjzV_Hc0(String label, String kind, long recoveryStartMs, long endMs, long color, String subtitle) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new RecoveryTimelineSegment(label, kind, recoveryStartMs, endMs, color, subtitle, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecoveryTimelineSegment)) {
            return false;
        }
        RecoveryTimelineSegment recoveryTimelineSegment = (RecoveryTimelineSegment) other;
        return Intrinsics.areEqual(this.label, recoveryTimelineSegment.label) && Intrinsics.areEqual(this.kind, recoveryTimelineSegment.kind) && this.recoveryStartMs == recoveryTimelineSegment.recoveryStartMs && this.endMs == recoveryTimelineSegment.endMs && Color.m3844equalsimpl0(this.color, recoveryTimelineSegment.color) && Intrinsics.areEqual(this.subtitle, recoveryTimelineSegment.subtitle);
    }

    public int hashCode() {
        int hashCode = ((((((((this.label.hashCode() * 31) + this.kind.hashCode()) * 31) + Long.hashCode(this.recoveryStartMs)) * 31) + Long.hashCode(this.endMs)) * 31) + Color.m3850hashCodeimpl(this.color)) * 31;
        String str = this.subtitle;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RecoveryTimelineSegment(label=" + this.label + ", kind=" + this.kind + ", recoveryStartMs=" + this.recoveryStartMs + ", endMs=" + this.endMs + ", color=" + Color.m3851toStringimpl(this.color) + ", subtitle=" + this.subtitle + ")";
    }

    private RecoveryTimelineSegment(String label, String kind, long j, long j2, long j3, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.label = label;
        this.kind = kind;
        this.recoveryStartMs = j;
        this.endMs = j2;
        this.color = j3;
        this.subtitle = str;
    }

    public /* synthetic */ RecoveryTimelineSegment(String str, String str2, long j, long j2, long j3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, j3, (i & 32) != 0 ? null : str3, null);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getKind() {
        return this.kind;
    }

    public final long getRecoveryStartMs() {
        return this.recoveryStartMs;
    }

    public final long getEndMs() {
        return this.endMs;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m6978getColor0d7_KjU() {
        return this.color;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }
}
