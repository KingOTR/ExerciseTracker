package com.example.rungps.ui.onboarding;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingWizard.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/ui/onboarding/OnboardingStep;", "", "title", "", "body", "showProfileForm", "", "showRuntimeGrant", "showHealthGrant", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getTitle", "()Ljava/lang/String;", "getBody", "getShowProfileForm", "()Z", "getShowRuntimeGrant", "getShowHealthGrant", "component1", "component2", "component3", "component4", "component5", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class OnboardingStep {
    private final String body;
    private final boolean showHealthGrant;
    private final boolean showProfileForm;
    private final boolean showRuntimeGrant;
    private final String title;

    public static /* synthetic */ OnboardingStep copy$default(OnboardingStep onboardingStep, String str, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingStep.title;
        }
        if ((i & 2) != 0) {
            str2 = onboardingStep.body;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = onboardingStep.showProfileForm;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = onboardingStep.showRuntimeGrant;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = onboardingStep.showHealthGrant;
        }
        return onboardingStep.copy(str, str3, z4, z5, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowProfileForm() {
        return this.showProfileForm;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowRuntimeGrant() {
        return this.showRuntimeGrant;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowHealthGrant() {
        return this.showHealthGrant;
    }

    public final OnboardingStep copy(String title, String body, boolean showProfileForm, boolean showRuntimeGrant, boolean showHealthGrant) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new OnboardingStep(title, body, showProfileForm, showRuntimeGrant, showHealthGrant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingStep)) {
            return false;
        }
        OnboardingStep onboardingStep = (OnboardingStep) other;
        return Intrinsics.areEqual(this.title, onboardingStep.title) && Intrinsics.areEqual(this.body, onboardingStep.body) && this.showProfileForm == onboardingStep.showProfileForm && this.showRuntimeGrant == onboardingStep.showRuntimeGrant && this.showHealthGrant == onboardingStep.showHealthGrant;
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + Boolean.hashCode(this.showProfileForm)) * 31) + Boolean.hashCode(this.showRuntimeGrant)) * 31) + Boolean.hashCode(this.showHealthGrant);
    }

    public String toString() {
        return "OnboardingStep(title=" + this.title + ", body=" + this.body + ", showProfileForm=" + this.showProfileForm + ", showRuntimeGrant=" + this.showRuntimeGrant + ", showHealthGrant=" + this.showHealthGrant + ")";
    }

    public OnboardingStep(String title, String body, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.title = title;
        this.body = body;
        this.showProfileForm = z;
        this.showRuntimeGrant = z2;
        this.showHealthGrant = z3;
    }

    public /* synthetic */ OnboardingStep(String str, String str2, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final boolean getShowProfileForm() {
        return this.showProfileForm;
    }

    public final boolean getShowRuntimeGrant() {
        return this.showRuntimeGrant;
    }

    public final boolean getShowHealthGrant() {
        return this.showHealthGrant;
    }
}
