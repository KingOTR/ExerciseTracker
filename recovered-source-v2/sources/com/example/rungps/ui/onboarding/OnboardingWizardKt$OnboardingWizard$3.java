package com.example.rungps.ui.onboarding;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.example.rungps.data.UserProfile;
import com.example.rungps.data.UserProfileStore;
import com.example.rungps.ui.profile.UserProfileFormKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingWizard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class OnboardingWizardKt$OnboardingWizard$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $ageText$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ OnboardingStep $current;
    final /* synthetic */ MutableState<String> $displayName$delegate;
    final /* synthetic */ MutableState<String> $dobText$delegate;
    final /* synthetic */ MutableState<String> $heightText$delegate;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ MutableState<String> $sex$delegate;
    final /* synthetic */ MutableIntState $step$delegate;
    final /* synthetic */ List<OnboardingStep> $steps;
    final /* synthetic */ MutableState<String> $weightText$delegate;

    OnboardingWizardKt$OnboardingWizard$3(OnboardingStep onboardingStep, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, Context context, List<OnboardingStep> list, Function0<Unit> function0, MutableIntState mutableIntState) {
        this.$current = onboardingStep;
        this.$displayName$delegate = mutableState;
        this.$ageText$delegate = mutableState2;
        this.$dobText$delegate = mutableState3;
        this.$heightText$delegate = mutableState4;
        this.$weightText$delegate = mutableState5;
        this.$sex$delegate = mutableState6;
        this.$ctx = context;
        this.$steps = list;
        this.$onDismiss = function0;
        this.$step$delegate = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-793188859, i, -1, "com.example.rungps.ui.onboarding.OnboardingWizard.<anonymous> (OnboardingWizard.kt:375)");
            }
            composer.startReplaceGroup(538070006);
            boolean changed = composer.changed(this.$current) | composer.changed(this.$displayName$delegate) | composer.changed(this.$ageText$delegate) | composer.changed(this.$dobText$delegate) | composer.changed(this.$heightText$delegate) | composer.changed(this.$weightText$delegate) | composer.changed(this.$sex$delegate) | composer.changedInstance(this.$ctx) | composer.changedInstance(this.$steps) | composer.changed(this.$onDismiss);
            final OnboardingStep onboardingStep = this.$current;
            final Context context = this.$ctx;
            final MutableState<String> mutableState = this.$displayName$delegate;
            final MutableState<String> mutableState2 = this.$ageText$delegate;
            final MutableState<String> mutableState3 = this.$dobText$delegate;
            final MutableState<String> mutableState4 = this.$heightText$delegate;
            final MutableState<String> mutableState5 = this.$weightText$delegate;
            final MutableState<String> mutableState6 = this.$sex$delegate;
            final List<OnboardingStep> list = this.$steps;
            final Function0<Unit> function0 = this.$onDismiss;
            final MutableIntState mutableIntState = this.$step$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$OnboardingWizard$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = OnboardingWizardKt$OnboardingWizard$3.invoke$lambda$1$lambda$0(OnboardingStep.this, context, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, list, function0, mutableIntState);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            final List<OnboardingStep> list2 = this.$steps;
            final MutableIntState mutableIntState2 = this.$step$delegate;
            ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(644389909, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$OnboardingWizard$3.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer2, int i2) {
                    int OnboardingWizard$lambda$1;
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(644389909, i2, -1, "com.example.rungps.ui.onboarding.OnboardingWizard.<anonymous>.<anonymous> (OnboardingWizard.kt:407)");
                    }
                    OnboardingWizard$lambda$1 = OnboardingWizardKt.OnboardingWizard$lambda$1(mutableIntState2);
                    TextKt.m2376Text4IGK_g(OnboardingWizard$lambda$1 < CollectionsKt.getLastIndex(list2) ? "Next" : "Get started", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(OnboardingStep onboardingStep, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, List list, Function0 function0, MutableIntState mutableIntState) {
        String OnboardingWizard$lambda$6;
        String OnboardingWizard$lambda$10;
        String OnboardingWizard$lambda$14;
        String OnboardingWizard$lambda$18;
        String OnboardingWizard$lambda$22;
        String OnboardingWizard$lambda$26;
        if (onboardingStep.getShowProfileForm()) {
            OnboardingWizard$lambda$6 = OnboardingWizardKt.OnboardingWizard$lambda$6(mutableState);
            OnboardingWizard$lambda$10 = OnboardingWizardKt.OnboardingWizard$lambda$10(mutableState2);
            OnboardingWizard$lambda$14 = OnboardingWizardKt.OnboardingWizard$lambda$14(mutableState3);
            OnboardingWizard$lambda$18 = OnboardingWizardKt.OnboardingWizard$lambda$18(mutableState4);
            OnboardingWizard$lambda$22 = OnboardingWizardKt.OnboardingWizard$lambda$22(mutableState5);
            OnboardingWizard$lambda$26 = OnboardingWizardKt.OnboardingWizard$lambda$26(mutableState6);
            UserProfile parseProfileForm = UserProfileFormKt.parseProfileForm(OnboardingWizard$lambda$6, OnboardingWizard$lambda$10, OnboardingWizard$lambda$14, OnboardingWizard$lambda$18, OnboardingWizard$lambda$22, OnboardingWizard$lambda$26);
            if (parseProfileForm == null) {
                Toast.makeText(context, "Enter age (10–120), height (100–250 cm), and weight (20–400 kg)", 1).show();
                return Unit.INSTANCE;
            }
            UserProfileStore.INSTANCE.save(context, parseProfileForm);
        }
        OnboardingWizardKt.OnboardingWizard$advanceStep(list, function0, mutableIntState);
        return Unit.INSTANCE;
    }
}
