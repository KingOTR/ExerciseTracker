package com.example.rungps.ui.onboarding;

import android.content.Context;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import com.example.rungps.data.UserProfileStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: OnboardingWizard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class OnboardingWizardKt$OnboardingWizard$4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ OnboardingStep $current;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function0<Unit> $onOpenGym;
    final /* synthetic */ MutableIntState $step$delegate;
    final /* synthetic */ List<OnboardingStep> $steps;

    OnboardingWizardKt$OnboardingWizard$4(OnboardingStep onboardingStep, Context context, List<OnboardingStep> list, Function0<Unit> function0, Function0<Unit> function02, MutableIntState mutableIntState) {
        this.$current = onboardingStep;
        this.$ctx = context;
        this.$steps = list;
        this.$onDismiss = function0;
        this.$onOpenGym = function02;
        this.$step$delegate = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int OnboardingWizard$lambda$1;
        int OnboardingWizard$lambda$12;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1579186749, i, -1, "com.example.rungps.ui.onboarding.OnboardingWizard.<anonymous> (OnboardingWizard.kt:413)");
            }
            if (!this.$current.getShowProfileForm()) {
                OnboardingWizard$lambda$1 = OnboardingWizardKt.OnboardingWizard$lambda$1(this.$step$delegate);
                if (OnboardingWizard$lambda$1 != CollectionsKt.getLastIndex(this.$steps) - 1) {
                    OnboardingWizard$lambda$12 = OnboardingWizardKt.OnboardingWizard$lambda$1(this.$step$delegate);
                    if (OnboardingWizard$lambda$12 < CollectionsKt.getLastIndex(this.$steps) && !this.$current.getShowProfileForm()) {
                        composer.startReplaceGroup(-498393245);
                        ButtonKt.OutlinedButton(this.$onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$OnboardingWizardKt.INSTANCE.m7382getLambda3$app_sideload(), composer, 805306368, 510);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-498283226);
                        composer.endReplaceGroup();
                    }
                } else {
                    composer.startReplaceGroup(-498580175);
                    composer.startReplaceGroup(538107544);
                    boolean changed = composer.changed(this.$onOpenGym) | composer.changed(this.$onDismiss);
                    final Function0<Unit> function0 = this.$onOpenGym;
                    final Function0<Unit> function02 = this.$onDismiss;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$OnboardingWizard$4$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$3$lambda$2;
                                invoke$lambda$3$lambda$2 = OnboardingWizardKt$OnboardingWizard$4.invoke$lambda$3$lambda$2(Function0.this, function02);
                                return invoke$lambda$3$lambda$2;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    ButtonKt.OutlinedButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$OnboardingWizardKt.INSTANCE.m7381getLambda2$app_sideload(), composer, 805306368, 510);
                    composer.endReplaceGroup();
                }
            } else {
                composer.startReplaceGroup(-498839025);
                composer.startReplaceGroup(538099190);
                boolean changedInstance = composer.changedInstance(this.$ctx) | composer.changedInstance(this.$steps) | composer.changed(this.$onDismiss);
                final Context context = this.$ctx;
                final List<OnboardingStep> list = this.$steps;
                final Function0<Unit> function03 = this.$onDismiss;
                final MutableIntState mutableIntState = this.$step$delegate;
                Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$OnboardingWizard$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$1$lambda$0;
                            invoke$lambda$1$lambda$0 = OnboardingWizardKt$OnboardingWizard$4.invoke$lambda$1$lambda$0(context, list, function03, mutableIntState);
                            return invoke$lambda$1$lambda$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue2, null, false, null, null, null, null, null, null, ComposableSingletons$OnboardingWizardKt.INSTANCE.m7380getLambda1$app_sideload(), composer, 805306368, 510);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Context context, List list, Function0 function0, MutableIntState mutableIntState) {
        UserProfileStore.INSTANCE.markSkipped(context);
        OnboardingWizardKt.OnboardingWizard$advanceStep(list, function0, mutableIntState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }
}
