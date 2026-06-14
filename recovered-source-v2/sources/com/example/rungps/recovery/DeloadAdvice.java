package com.example.rungps.recovery;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeloadPlanner.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/recovery/DeloadAdvice;", "", "recommended", "", "headline", "", "detail", "suggestedReductionPct", "", "<init>", "(ZLjava/lang/String;Ljava/lang/String;I)V", "getRecommended", "()Z", "getHeadline", "()Ljava/lang/String;", "getDetail", "getSuggestedReductionPct", "()I", "component1", "component2", "component3", "component4", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeloadAdvice {
    public static final int $stable = 0;
    private final String detail;
    private final String headline;
    private final boolean recommended;
    private final int suggestedReductionPct;

    public static /* synthetic */ DeloadAdvice copy$default(DeloadAdvice deloadAdvice, boolean z, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = deloadAdvice.recommended;
        }
        if ((i2 & 2) != 0) {
            str = deloadAdvice.headline;
        }
        if ((i2 & 4) != 0) {
            str2 = deloadAdvice.detail;
        }
        if ((i2 & 8) != 0) {
            i = deloadAdvice.suggestedReductionPct;
        }
        return deloadAdvice.copy(z, str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRecommended() {
        return this.recommended;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHeadline() {
        return this.headline;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSuggestedReductionPct() {
        return this.suggestedReductionPct;
    }

    public final DeloadAdvice copy(boolean recommended, String headline, String detail, int suggestedReductionPct) {
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new DeloadAdvice(recommended, headline, detail, suggestedReductionPct);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeloadAdvice)) {
            return false;
        }
        DeloadAdvice deloadAdvice = (DeloadAdvice) other;
        return this.recommended == deloadAdvice.recommended && Intrinsics.areEqual(this.headline, deloadAdvice.headline) && Intrinsics.areEqual(this.detail, deloadAdvice.detail) && this.suggestedReductionPct == deloadAdvice.suggestedReductionPct;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.recommended) * 31) + this.headline.hashCode()) * 31) + this.detail.hashCode()) * 31) + Integer.hashCode(this.suggestedReductionPct);
    }

    public String toString() {
        return "DeloadAdvice(recommended=" + this.recommended + ", headline=" + this.headline + ", detail=" + this.detail + ", suggestedReductionPct=" + this.suggestedReductionPct + ")";
    }

    public DeloadAdvice(boolean z, String headline, String detail, int i) {
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.recommended = z;
        this.headline = headline;
        this.detail = detail;
        this.suggestedReductionPct = i;
    }

    public final boolean getRecommended() {
        return this.recommended;
    }

    public final String getHeadline() {
        return this.headline;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final int getSuggestedReductionPct() {
        return this.suggestedReductionPct;
    }
}
