package com.example.rungps.ui.onboarding;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.rungps.ui.profile.UserProfileFormKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingWizard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class OnboardingWizardKt$OnboardingWizard$6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $ageText$delegate;
    final /* synthetic */ OnboardingStep $current;
    final /* synthetic */ MutableState<String> $displayName$delegate;
    final /* synthetic */ MutableState<String> $dobText$delegate;
    final /* synthetic */ String $hcLine;
    final /* synthetic */ MutableState<String> $heightText$delegate;
    final /* synthetic */ Function0<Unit> $onRequestHealthConnect;
    final /* synthetic */ Function0<Unit> $onRequestRuntimePermissions;
    final /* synthetic */ String $runtimeLine;
    final /* synthetic */ MutableState<String> $sex$delegate;
    final /* synthetic */ MutableIntState $step$delegate;
    final /* synthetic */ List<OnboardingStep> $steps;
    final /* synthetic */ MutableState<String> $weightText$delegate;

    OnboardingWizardKt$OnboardingWizard$6(OnboardingStep onboardingStep, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, String str, Function0<Unit> function0, String str2, Function0<Unit> function02, List<OnboardingStep> list, MutableIntState mutableIntState) {
        this.$current = onboardingStep;
        this.$displayName$delegate = mutableState;
        this.$ageText$delegate = mutableState2;
        this.$dobText$delegate = mutableState3;
        this.$heightText$delegate = mutableState4;
        this.$weightText$delegate = mutableState5;
        this.$sex$delegate = mutableState6;
        this.$runtimeLine = str;
        this.$onRequestRuntimePermissions = function0;
        this.$hcLine = str2;
        this.$onRequestHealthConnect = function02;
        this.$steps = list;
        this.$step$delegate = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        boolean z;
        int i2;
        int i3;
        int OnboardingWizard$lambda$1;
        String OnboardingWizard$lambda$6;
        String OnboardingWizard$lambda$10;
        String OnboardingWizard$lambda$14;
        String OnboardingWizard$lambda$18;
        String OnboardingWizard$lambda$22;
        String OnboardingWizard$lambda$26;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1536783712, i, -1, "com.example.rungps.ui.onboarding.OnboardingWizard.<anonymous> (OnboardingWizard.kt:273)");
            }
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            OnboardingStep onboardingStep = this.$current;
            final MutableState<String> mutableState = this.$displayName$delegate;
            final MutableState<String> mutableState2 = this.$ageText$delegate;
            final MutableState<String> mutableState3 = this.$dobText$delegate;
            final MutableState<String> mutableState4 = this.$heightText$delegate;
            final MutableState<String> mutableState5 = this.$weightText$delegate;
            final MutableState<String> mutableState6 = this.$sex$delegate;
            String str = this.$runtimeLine;
            Function0<Unit> function0 = this.$onRequestRuntimePermissions;
            String str2 = this.$hcLine;
            Function0<Unit> function02 = this.$onRequestHealthConnect;
            List<OnboardingStep> list = this.$steps;
            MutableIntState mutableIntState = this.$step$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m3336constructorimpl = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2376Text4IGK_g(onboardingStep.getBody(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            composer.startReplaceGroup(-1756884137);
            if (onboardingStep.getShowProfileForm()) {
                OnboardingWizard$lambda$6 = OnboardingWizardKt.OnboardingWizard$lambda$6(mutableState);
                composer.startReplaceGroup(-1756879505);
                boolean changed = composer.changed(mutableState);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$OnboardingWizard$6$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$12$lambda$1$lambda$0;
                            invoke$lambda$12$lambda$1$lambda$0 = OnboardingWizardKt$OnboardingWizard$6.invoke$lambda$12$lambda$1$lambda$0(MutableState.this, (String) obj);
                            return invoke$lambda$12$lambda$1$lambda$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function1 function1 = (Function1) rememberedValue;
                composer.endReplaceGroup();
                OnboardingWizard$lambda$10 = OnboardingWizardKt.OnboardingWizard$lambda$10(mutableState2);
                composer.startReplaceGroup(-1756876021);
                boolean changed2 = composer.changed(mutableState2);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$OnboardingWizard$6$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$12$lambda$3$lambda$2;
                            invoke$lambda$12$lambda$3$lambda$2 = OnboardingWizardKt$OnboardingWizard$6.invoke$lambda$12$lambda$3$lambda$2(MutableState.this, (String) obj);
                            return invoke$lambda$12$lambda$3$lambda$2;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                Function1 function12 = (Function1) rememberedValue2;
                composer.endReplaceGroup();
                OnboardingWizard$lambda$14 = OnboardingWizardKt.OnboardingWizard$lambda$14(mutableState3);
                composer.startReplaceGroup(-1756872661);
                boolean changed3 = composer.changed(mutableState3);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$OnboardingWizard$6$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$12$lambda$5$lambda$4;
                            invoke$lambda$12$lambda$5$lambda$4 = OnboardingWizardKt$OnboardingWizard$6.invoke$lambda$12$lambda$5$lambda$4(MutableState.this, (String) obj);
                            return invoke$lambda$12$lambda$5$lambda$4;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                Function1 function13 = (Function1) rememberedValue3;
                composer.endReplaceGroup();
                OnboardingWizard$lambda$18 = OnboardingWizardKt.OnboardingWizard$lambda$18(mutableState4);
                composer.startReplaceGroup(-1756869010);
                boolean changed4 = composer.changed(mutableState4);
                Object rememberedValue4 = composer.rememberedValue();
                if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$OnboardingWizard$6$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$12$lambda$7$lambda$6;
                            invoke$lambda$12$lambda$7$lambda$6 = OnboardingWizardKt$OnboardingWizard$6.invoke$lambda$12$lambda$7$lambda$6(MutableState.this, (String) obj);
                            return invoke$lambda$12$lambda$7$lambda$6;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                Function1 function14 = (Function1) rememberedValue4;
                composer.endReplaceGroup();
                OnboardingWizard$lambda$22 = OnboardingWizardKt.OnboardingWizard$lambda$22(mutableState5);
                composer.startReplaceGroup(-1756865266);
                boolean changed5 = composer.changed(mutableState5);
                Object rememberedValue5 = composer.rememberedValue();
                if (changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$OnboardingWizard$6$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$12$lambda$9$lambda$8;
                            invoke$lambda$12$lambda$9$lambda$8 = OnboardingWizardKt$OnboardingWizard$6.invoke$lambda$12$lambda$9$lambda$8(MutableState.this, (String) obj);
                            return invoke$lambda$12$lambda$9$lambda$8;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue5);
                }
                Function1 function15 = (Function1) rememberedValue5;
                composer.endReplaceGroup();
                OnboardingWizard$lambda$26 = OnboardingWizardKt.OnboardingWizard$lambda$26(mutableState6);
                composer.startReplaceGroup(-1756862201);
                boolean changed6 = composer.changed(mutableState6);
                Object rememberedValue6 = composer.rememberedValue();
                if (changed6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function1() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$OnboardingWizard$6$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$12$lambda$11$lambda$10;
                            invoke$lambda$12$lambda$11$lambda$10 = OnboardingWizardKt$OnboardingWizard$6.invoke$lambda$12$lambda$11$lambda$10(MutableState.this, (String) obj);
                            return invoke$lambda$12$lambda$11$lambda$10;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue6);
                }
                composer.endReplaceGroup();
                UserProfileFormKt.UserProfileForm(OnboardingWizard$lambda$6, function1, OnboardingWizard$lambda$10, function12, OnboardingWizard$lambda$14, function13, OnboardingWizard$lambda$18, function14, OnboardingWizard$lambda$22, function15, OnboardingWizard$lambda$26, (Function1) rememberedValue6, null, false, composer, 0, 0, 12288);
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1756859417);
            if (onboardingStep.getShowRuntimeGrant()) {
                TextKt.m2376Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                z = false;
                i2 = 1;
                ButtonKt.Button(function0, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$OnboardingWizardKt.INSTANCE.m7383getLambda4$app_sideload(), composer, 805306416, 508);
            } else {
                z = false;
                i2 = 1;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1756844128);
            if (onboardingStep.getShowHealthGrant()) {
                TextKt.m2376Text4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                i3 = 1;
                ButtonKt.Button(function02, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$OnboardingWizardKt.INSTANCE.m7384getLambda5$app_sideload(), composer, 805306416, 508);
            } else {
                i3 = i2;
            }
            composer.endReplaceGroup();
            OnboardingWizard$lambda$1 = OnboardingWizardKt.OnboardingWizard$lambda$1(mutableIntState);
            TextKt.m2376Text4IGK_g("Step " + (OnboardingWizard$lambda$1 + i3) + " of " + list.size(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$1$lambda$0(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$3$lambda$2(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$5$lambda$4(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$7$lambda$6(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$9$lambda$8(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }
}
