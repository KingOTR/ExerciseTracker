package com.example.rungps.ui.main;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SoccerTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SoccerTabContentKt$SoccerTabContent$5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $dateText$delegate;
    final /* synthetic */ MutableState<Integer> $intensity$delegate;
    final /* synthetic */ MutableState<String> $kind$delegate;
    final /* synthetic */ MutableState<String> $notesText$delegate;
    final /* synthetic */ MutableState<String> $playText$delegate;
    final /* synthetic */ MutableState<String> $trainingMinText$delegate;
    final /* synthetic */ MutableState<String> $warmupText$delegate;

    SoccerTabContentKt$SoccerTabContent$5(MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<Integer> mutableState5, MutableState<String> mutableState6, MutableState<String> mutableState7) {
        this.$dateText$delegate = mutableState;
        this.$trainingMinText$delegate = mutableState2;
        this.$warmupText$delegate = mutableState3;
        this.$playText$delegate = mutableState4;
        this.$intensity$delegate = mutableState5;
        this.$notesText$delegate = mutableState6;
        this.$kind$delegate = mutableState7;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String SoccerTabContent$lambda$8;
        String SoccerTabContent$lambda$82;
        String SoccerTabContent$lambda$12;
        String SoccerTabContent$lambda$83;
        String SoccerTabContent$lambda$16;
        String SoccerTabContent$lambda$20;
        int SoccerTabContent$lambda$28;
        int SoccerTabContent$lambda$282;
        String SoccerTabContent$lambda$32;
        String SoccerTabContent$lambda$24;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(820356760, i, -1, "com.example.rungps.ui.main.SoccerTabContent.<anonymous> (SoccerTabContent.kt:79)");
            }
            float f = 8;
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
            final MutableState<String> mutableState = this.$dateText$delegate;
            final MutableState<String> mutableState2 = this.$trainingMinText$delegate;
            final MutableState<String> mutableState3 = this.$warmupText$delegate;
            final MutableState<String> mutableState4 = this.$playText$delegate;
            final MutableState<Integer> mutableState5 = this.$intensity$delegate;
            final MutableState<String> mutableState6 = this.$notesText$delegate;
            final MutableState<String> mutableState7 = this.$kind$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            SoccerTabContent$lambda$8 = SoccerTabContentKt.SoccerTabContent$lambda$8(mutableState7);
            boolean areEqual = Intrinsics.areEqual(SoccerTabContent$lambda$8, "MATCH");
            composer.startReplaceGroup(-259946571);
            boolean changed = composer.changed(mutableState7);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$20$lambda$4$lambda$1$lambda$0;
                        invoke$lambda$20$lambda$4$lambda$1$lambda$0 = SoccerTabContentKt$SoccerTabContent$5.invoke$lambda$20$lambda$4$lambda$1$lambda$0(MutableState.this);
                        return invoke$lambda$20$lambda$4$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ChipKt.FilterChip(areEqual, (Function0) rememberedValue, ComposableSingletons$SoccerTabContentKt.INSTANCE.m7276getLambda3$app_sideload(), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
            SoccerTabContent$lambda$82 = SoccerTabContentKt.SoccerTabContent$lambda$8(mutableState7);
            boolean areEqual2 = Intrinsics.areEqual(SoccerTabContent$lambda$82, "TRAINING");
            composer.startReplaceGroup(-259939080);
            boolean changed2 = composer.changed(mutableState7);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$5$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$20$lambda$4$lambda$3$lambda$2;
                        invoke$lambda$20$lambda$4$lambda$3$lambda$2 = SoccerTabContentKt$SoccerTabContent$5.invoke$lambda$20$lambda$4$lambda$3$lambda$2(MutableState.this);
                        return invoke$lambda$20$lambda$4$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            ChipKt.FilterChip(areEqual2, (Function0) rememberedValue2, ComposableSingletons$SoccerTabContentKt.INSTANCE.m7277getLambda4$app_sideload(), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SoccerTabContent$lambda$12 = SoccerTabContentKt.SoccerTabContent$lambda$12(mutableState);
            composer.startReplaceGroup(273520446);
            boolean changed3 = composer.changed(mutableState);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$5$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$20$lambda$6$lambda$5;
                        invoke$lambda$20$lambda$6$lambda$5 = SoccerTabContentKt$SoccerTabContent$5.invoke$lambda$20$lambda$6$lambda$5(MutableState.this, (String) obj);
                        return invoke$lambda$20$lambda$6$lambda$5;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceGroup();
            TextFieldKt.TextField(SoccerTabContent$lambda$12, (Function1<? super String, Unit>) rememberedValue3, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SoccerTabContentKt.INSTANCE.m7278getLambda5$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572864, 12582912, 0, 8257468);
            SoccerTabContent$lambda$83 = SoccerTabContentKt.SoccerTabContent$lambda$8(mutableState7);
            if (Intrinsics.areEqual(SoccerTabContent$lambda$83, "TRAINING")) {
                composer.startReplaceGroup(-110591824);
                SoccerTabContent$lambda$24 = SoccerTabContentKt.SoccerTabContent$lambda$24(mutableState2);
                composer.startReplaceGroup(273531170);
                boolean changed4 = composer.changed(mutableState2);
                Object rememberedValue4 = composer.rememberedValue();
                if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$5$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$20$lambda$9$lambda$8;
                            invoke$lambda$20$lambda$9$lambda$8 = SoccerTabContentKt$SoccerTabContent$5.invoke$lambda$20$lambda$9$lambda$8(MutableState.this, (String) obj);
                            return invoke$lambda$20$lambda$9$lambda$8;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                composer.endReplaceGroup();
                TextFieldKt.TextField(SoccerTabContent$lambda$24, (Function1<? super String, Unit>) rememberedValue4, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SoccerTabContentKt.INSTANCE.m7279getLambda6$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572864, 12582912, 0, 8257468);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-110213562);
                SoccerTabContent$lambda$16 = SoccerTabContentKt.SoccerTabContent$lambda$16(mutableState3);
                composer.startReplaceGroup(273542909);
                boolean changed5 = composer.changed(mutableState3);
                Object rememberedValue5 = composer.rememberedValue();
                if (changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$5$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$20$lambda$12$lambda$11;
                            invoke$lambda$20$lambda$12$lambda$11 = SoccerTabContentKt$SoccerTabContent$5.invoke$lambda$20$lambda$12$lambda$11(MutableState.this, (String) obj);
                            return invoke$lambda$20$lambda$12$lambda$11;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue5);
                }
                composer.endReplaceGroup();
                TextFieldKt.TextField(SoccerTabContent$lambda$16, (Function1<? super String, Unit>) rememberedValue5, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SoccerTabContentKt.INSTANCE.m7280getLambda7$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572864, 12582912, 0, 8257468);
                SoccerTabContent$lambda$20 = SoccerTabContentKt.SoccerTabContent$lambda$20(mutableState4);
                composer.startReplaceGroup(273553115);
                boolean changed6 = composer.changed(mutableState4);
                Object rememberedValue6 = composer.rememberedValue();
                if (changed6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function1() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$5$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$20$lambda$15$lambda$14;
                            invoke$lambda$20$lambda$15$lambda$14 = SoccerTabContentKt$SoccerTabContent$5.invoke$lambda$20$lambda$15$lambda$14(MutableState.this, (String) obj);
                            return invoke$lambda$20$lambda$15$lambda$14;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue6);
                }
                composer.endReplaceGroup();
                TextFieldKt.TextField(SoccerTabContent$lambda$20, (Function1<? super String, Unit>) rememberedValue6, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SoccerTabContentKt.INSTANCE.m7281getLambda8$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572864, 12582912, 0, 8257468);
                composer.endReplaceGroup();
            }
            SoccerTabContent$lambda$28 = SoccerTabContentKt.SoccerTabContent$lambda$28(mutableState5);
            TextKt.m2376Text4IGK_g("Intensity: " + SoccerTabContent$lambda$28 + "/10", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
            SoccerTabContent$lambda$282 = SoccerTabContentKt.SoccerTabContent$lambda$28(mutableState5);
            float f2 = SoccerTabContent$lambda$282;
            composer.startReplaceGroup(273567287);
            boolean changed7 = composer.changed(mutableState5);
            Object rememberedValue7 = composer.rememberedValue();
            if (changed7 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function1() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$5$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$20$lambda$17$lambda$16;
                        invoke$lambda$20$lambda$17$lambda$16 = SoccerTabContentKt$SoccerTabContent$5.invoke$lambda$20$lambda$17$lambda$16(MutableState.this, ((Float) obj).floatValue());
                        return invoke$lambda$20$lambda$17$lambda$16;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            composer.endReplaceGroup();
            SliderKt.Slider(f2, (Function1) rememberedValue7, null, false, RangesKt.rangeTo(1.0f, 10.0f), 8, null, null, null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 460);
            SoccerTabContent$lambda$32 = SoccerTabContentKt.SoccerTabContent$lambda$32(mutableState6);
            composer.startReplaceGroup(273575904);
            boolean changed8 = composer.changed(mutableState6);
            Object rememberedValue8 = composer.rememberedValue();
            if (changed8 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function1() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$5$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$20$lambda$19$lambda$18;
                        invoke$lambda$20$lambda$19$lambda$18 = SoccerTabContentKt$SoccerTabContent$5.invoke$lambda$20$lambda$19$lambda$18(MutableState.this, (String) obj);
                        return invoke$lambda$20$lambda$19$lambda$18;
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            composer.endReplaceGroup();
            TextFieldKt.TextField(SoccerTabContent$lambda$32, (Function1<? super String, Unit>) rememberedValue8, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SoccerTabContentKt.INSTANCE.m7282getLambda9$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572864, 12582912, 0, 8257468);
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
    public static final Unit invoke$lambda$20$lambda$4$lambda$1$lambda$0(MutableState mutableState) {
        mutableState.setValue("MATCH");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$20$lambda$4$lambda$3$lambda$2(MutableState mutableState) {
        mutableState.setValue("TRAINING");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$20$lambda$6$lambda$5(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(StringsKt.take(it, 10));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$20$lambda$17$lambda$16(MutableState mutableState, float f) {
        SoccerTabContentKt.SoccerTabContent$lambda$29(mutableState, RangesKt.coerceIn(MathKt.roundToInt(f), 1, 10));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$20$lambda$19$lambda$18(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(StringsKt.take(it, MenuKt.InTransitionDuration));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$20$lambda$9$lambda$8(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mutableState.setValue(StringsKt.take(sb2, 3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$20$lambda$12$lambda$11(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mutableState.setValue(StringsKt.take(sb2, 3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$20$lambda$15$lambda$14(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mutableState.setValue(StringsKt.take(sb2, 3));
        return Unit.INSTANCE;
    }
}
