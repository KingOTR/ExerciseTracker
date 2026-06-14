package com.example.rungps.ui.components;

import androidx.compose.ui.graphics.Color;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: VisualGauge.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/ui/components/GaugeSegment;", "", "fraction", "", "color", "Landroidx/compose/ui/graphics/Color;", "<init>", "(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFraction", "()F", "getColor-0d7_KjU", "()J", "J", "component1", "component2", "component2-0d7_KjU", "copy", "copy-4WTKRHQ", "(FJ)Lcom/example/rungps/ui/components/GaugeSegment;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GaugeSegment {
    public static final int $stable = 0;
    private final long color;
    private final float fraction;

    public /* synthetic */ GaugeSegment(float f, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j);
    }

    /* renamed from: copy-4WTKRHQ$default, reason: not valid java name */
    public static /* synthetic */ GaugeSegment m6960copy4WTKRHQ$default(GaugeSegment gaugeSegment, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            f = gaugeSegment.fraction;
        }
        if ((i & 2) != 0) {
            j = gaugeSegment.color;
        }
        return gaugeSegment.m6962copy4WTKRHQ(f, j);
    }

    /* renamed from: component1, reason: from getter */
    public final float getFraction() {
        return this.fraction;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: copy-4WTKRHQ, reason: not valid java name */
    public final GaugeSegment m6962copy4WTKRHQ(float fraction, long color) {
        return new GaugeSegment(fraction, color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GaugeSegment)) {
            return false;
        }
        GaugeSegment gaugeSegment = (GaugeSegment) other;
        return Float.compare(this.fraction, gaugeSegment.fraction) == 0 && Color.m3844equalsimpl0(this.color, gaugeSegment.color);
    }

    public int hashCode() {
        return (Float.hashCode(this.fraction) * 31) + Color.m3850hashCodeimpl(this.color);
    }

    public String toString() {
        return "GaugeSegment(fraction=" + this.fraction + ", color=" + Color.m3851toStringimpl(this.color) + ")";
    }

    private GaugeSegment(float f, long j) {
        this.fraction = f;
        this.color = j;
    }

    public final float getFraction() {
        return this.fraction;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m6963getColor0d7_KjU() {
        return this.color;
    }
}
