package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SleepEventMarkersEncoder.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006%"}, d2 = {"Lcom/example/rungps/sleep/SleepMinuteEvent;", "", "minuteIndex", "", "snore", "", "talk", "movement", "breathPause", "cough", "environment", "<init>", "(IZZZZZZ)V", "getMinuteIndex", "()I", "getSnore", "()Z", "getTalk", "getMovement", "getBreathPause", "getCough", "getEnvironment", "hasMarker", "getHasMarker", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SleepMinuteEvent {
    public static final int $stable = 0;
    private final boolean breathPause;
    private final boolean cough;
    private final boolean environment;
    private final int minuteIndex;
    private final boolean movement;
    private final boolean snore;
    private final boolean talk;

    public static /* synthetic */ SleepMinuteEvent copy$default(SleepMinuteEvent sleepMinuteEvent, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sleepMinuteEvent.minuteIndex;
        }
        if ((i2 & 2) != 0) {
            z = sleepMinuteEvent.snore;
        }
        boolean z7 = z;
        if ((i2 & 4) != 0) {
            z2 = sleepMinuteEvent.talk;
        }
        boolean z8 = z2;
        if ((i2 & 8) != 0) {
            z3 = sleepMinuteEvent.movement;
        }
        boolean z9 = z3;
        if ((i2 & 16) != 0) {
            z4 = sleepMinuteEvent.breathPause;
        }
        boolean z10 = z4;
        if ((i2 & 32) != 0) {
            z5 = sleepMinuteEvent.cough;
        }
        boolean z11 = z5;
        if ((i2 & 64) != 0) {
            z6 = sleepMinuteEvent.environment;
        }
        return sleepMinuteEvent.copy(i, z7, z8, z9, z10, z11, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMinuteIndex() {
        return this.minuteIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSnore() {
        return this.snore;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getTalk() {
        return this.talk;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getMovement() {
        return this.movement;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getBreathPause() {
        return this.breathPause;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCough() {
        return this.cough;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getEnvironment() {
        return this.environment;
    }

    public final SleepMinuteEvent copy(int minuteIndex, boolean snore, boolean talk, boolean movement, boolean breathPause, boolean cough, boolean environment) {
        return new SleepMinuteEvent(minuteIndex, snore, talk, movement, breathPause, cough, environment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepMinuteEvent)) {
            return false;
        }
        SleepMinuteEvent sleepMinuteEvent = (SleepMinuteEvent) other;
        return this.minuteIndex == sleepMinuteEvent.minuteIndex && this.snore == sleepMinuteEvent.snore && this.talk == sleepMinuteEvent.talk && this.movement == sleepMinuteEvent.movement && this.breathPause == sleepMinuteEvent.breathPause && this.cough == sleepMinuteEvent.cough && this.environment == sleepMinuteEvent.environment;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.minuteIndex) * 31) + Boolean.hashCode(this.snore)) * 31) + Boolean.hashCode(this.talk)) * 31) + Boolean.hashCode(this.movement)) * 31) + Boolean.hashCode(this.breathPause)) * 31) + Boolean.hashCode(this.cough)) * 31) + Boolean.hashCode(this.environment);
    }

    public String toString() {
        return "SleepMinuteEvent(minuteIndex=" + this.minuteIndex + ", snore=" + this.snore + ", talk=" + this.talk + ", movement=" + this.movement + ", breathPause=" + this.breathPause + ", cough=" + this.cough + ", environment=" + this.environment + ")";
    }

    public SleepMinuteEvent(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.minuteIndex = i;
        this.snore = z;
        this.talk = z2;
        this.movement = z3;
        this.breathPause = z4;
        this.cough = z5;
        this.environment = z6;
    }

    public /* synthetic */ SleepMinuteEvent(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, z2, z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? false : z5, (i2 & 64) != 0 ? false : z6);
    }

    public final int getMinuteIndex() {
        return this.minuteIndex;
    }

    public final boolean getSnore() {
        return this.snore;
    }

    public final boolean getTalk() {
        return this.talk;
    }

    public final boolean getMovement() {
        return this.movement;
    }

    public final boolean getBreathPause() {
        return this.breathPause;
    }

    public final boolean getCough() {
        return this.cough;
    }

    public final boolean getEnvironment() {
        return this.environment;
    }

    public final boolean getHasMarker() {
        return this.snore || this.talk || this.movement || this.breathPause || this.cough || this.environment;
    }
}
