package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
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
import com.example.rungps.sleep.BedtimeReminderPrefs;
import com.example.rungps.sleep.BedtimeReminderScheduler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$23$9 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableIntState $bedHour$delegate;
    final /* synthetic */ MutableIntState $bedMinute$delegate;
    final /* synthetic */ MutableState<Boolean> $bedtimeReminder$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $windDim$delegate;
    final /* synthetic */ MutableState<Boolean> $windDnd$delegate;
    final /* synthetic */ MutableState<Boolean> $windPause$delegate;

    SleepTabScreenBodyKt$SleepTabScreenBody$23$9(Context context, MutableState<Boolean> mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4) {
        this.$ctx = context;
        this.$bedtimeReminder$delegate = mutableState;
        this.$bedHour$delegate = mutableIntState;
        this.$bedMinute$delegate = mutableIntState2;
        this.$windPause$delegate = mutableState2;
        this.$windDnd$delegate = mutableState3;
        this.$windDim$delegate = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope Card, Composer composer, int i) {
        boolean SleepTabScreenBody$lambda$235$lambda$206;
        final MutableState<Boolean> mutableState;
        int SleepTabScreenBody$lambda$235$lambda$209;
        final MutableIntState mutableIntState;
        final MutableIntState mutableIntState2;
        int SleepTabScreenBody$lambda$235$lambda$212;
        boolean SleepTabScreenBody$lambda$235$lambda$221;
        boolean SleepTabScreenBody$lambda$235$lambda$218;
        boolean SleepTabScreenBody$lambda$235$lambda$215;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2055705782, i, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous>.<anonymous> (SleepTabScreenBody.kt:1366)");
        }
        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16));
        float f = 8;
        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
        final Context context = this.$ctx;
        MutableState<Boolean> mutableState2 = this.$bedtimeReminder$delegate;
        MutableIntState mutableIntState3 = this.$bedHour$delegate;
        MutableIntState mutableIntState4 = this.$bedMinute$delegate;
        final MutableState<Boolean> mutableState3 = this.$windPause$delegate;
        final MutableState<Boolean> mutableState4 = this.$windDnd$delegate;
        final MutableState<Boolean> mutableState5 = this.$windDim$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m684padding3ABfNKs);
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
        TextKt.m2376Text4IGK_g("Wind-down reminder", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196614, 0, 65502);
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
        TextKt.m2376Text4IGK_g("Remind me to wind down", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65534);
        SleepTabScreenBody$lambda$235$lambda$206 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$206(mutableState2);
        composer.startReplaceGroup(-1304476837);
        boolean changedInstance = composer.changedInstance(context);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            mutableState = mutableState2;
            rememberedValue = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$23$9$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$19$lambda$2$lambda$1$lambda$0;
                    invoke$lambda$19$lambda$2$lambda$1$lambda$0 = SleepTabScreenBodyKt$SleepTabScreenBody$23$9.invoke$lambda$19$lambda$2$lambda$1$lambda$0(context, mutableState, ((Boolean) obj).booleanValue());
                    return invoke$lambda$19$lambda$2$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        } else {
            mutableState = mutableState2;
        }
        composer.endReplaceGroup();
        SwitchKt.Switch(SleepTabScreenBody$lambda$235$lambda$206, (Function1) rememberedValue, null, null, false, null, null, composer, 0, 124);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer);
        Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        SleepTabScreenBody$lambda$235$lambda$209 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$209(mutableIntState3);
        String valueOf = String.valueOf(SleepTabScreenBody$lambda$235$lambda$209);
        Modifier weight$default = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
        composer.startReplaceGroup(-1304459117);
        boolean changedInstance2 = composer.changedInstance(context);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            mutableIntState = mutableIntState4;
            mutableIntState2 = mutableIntState3;
            rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$23$9$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$19$lambda$9$lambda$5$lambda$4;
                    invoke$lambda$19$lambda$9$lambda$5$lambda$4 = SleepTabScreenBodyKt$SleepTabScreenBody$23$9.invoke$lambda$19$lambda$9$lambda$5$lambda$4(context, mutableIntState2, mutableIntState, mutableState, (String) obj);
                    return invoke$lambda$19$lambda$9$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        } else {
            mutableIntState = mutableIntState4;
            mutableIntState2 = mutableIntState3;
        }
        composer.endReplaceGroup();
        final MutableIntState mutableIntState5 = mutableIntState;
        final MutableIntState mutableIntState6 = mutableIntState2;
        final MutableState<Boolean> mutableState6 = mutableState;
        TextFieldKt.TextField(valueOf, (Function1<? super String, Unit>) rememberedValue2, weight$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7526getLambda31$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572864, 12582912, 0, 8257464);
        SleepTabScreenBody$lambda$235$lambda$212 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$212(mutableIntState5);
        String padStart = StringsKt.padStart(String.valueOf(SleepTabScreenBody$lambda$235$lambda$212), 2, '0');
        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
        composer.startReplaceGroup(-1304435917);
        boolean changedInstance3 = composer.changedInstance(context);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$23$9$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$19$lambda$9$lambda$8$lambda$7;
                    invoke$lambda$19$lambda$9$lambda$8$lambda$7 = SleepTabScreenBodyKt$SleepTabScreenBody$23$9.invoke$lambda$19$lambda$9$lambda$8$lambda$7(context, mutableIntState5, mutableIntState6, mutableState6, (String) obj);
                    return invoke$lambda$19$lambda$9$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        TextFieldKt.TextField(padStart, (Function1<? super String, Unit>) rememberedValue3, weight$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7527getLambda32$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572864, 12582912, 0, 8257464);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composer, 54);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default2);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor4);
        } else {
            composer.useNode();
        }
        Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer);
        Updater.m3343setimpl(m3336constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
        TextKt.m2376Text4IGK_g("Pause media", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65534);
        SleepTabScreenBody$lambda$235$lambda$221 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$221(mutableState3);
        composer.startReplaceGroup(-1304404175);
        boolean changedInstance4 = composer.changedInstance(context);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$23$9$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$19$lambda$12$lambda$11$lambda$10;
                    invoke$lambda$19$lambda$12$lambda$11$lambda$10 = SleepTabScreenBodyKt$SleepTabScreenBody$23$9.invoke$lambda$19$lambda$12$lambda$11$lambda$10(context, mutableState3, ((Boolean) obj).booleanValue());
                    return invoke$lambda$19$lambda$12$lambda$11$lambda$10;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        SwitchKt.Switch(SleepTabScreenBody$lambda$235$lambda$221, (Function1) rememberedValue4, null, null, false, null, null, composer, 0, 124);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween3 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween3, centerVertically3, composer, 54);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default3);
        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor5);
        } else {
            composer.useNode();
        }
        Composer m3336constructorimpl5 = Updater.m3336constructorimpl(composer);
        Updater.m3343setimpl(m3336constructorimpl5, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m3336constructorimpl5.getInserting() || !Intrinsics.areEqual(m3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            m3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        Updater.m3343setimpl(m3336constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
        TextKt.m2376Text4IGK_g("Priority DND", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65534);
        SleepTabScreenBody$lambda$235$lambda$218 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$218(mutableState4);
        composer.startReplaceGroup(-1304385432);
        boolean changedInstance5 = composer.changedInstance(context);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$23$9$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$19$lambda$15$lambda$14$lambda$13;
                    invoke$lambda$19$lambda$15$lambda$14$lambda$13 = SleepTabScreenBodyKt$SleepTabScreenBody$23$9.invoke$lambda$19$lambda$15$lambda$14$lambda$13(context, mutableState4, ((Boolean) obj).booleanValue());
                    return invoke$lambda$19$lambda$15$lambda$14$lambda$13;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        SwitchKt.Switch(SleepTabScreenBody$lambda$235$lambda$218, (Function1) rememberedValue5, null, null, false, null, null, composer, 0, 124);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween4 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy5 = RowKt.rowMeasurePolicy(spaceBetween4, centerVertically4, composer, 54);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default4);
        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor6);
        } else {
            composer.useNode();
        }
        Composer m3336constructorimpl6 = Updater.m3336constructorimpl(composer);
        Updater.m3343setimpl(m3336constructorimpl6, rowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m3336constructorimpl6.getInserting() || !Intrinsics.areEqual(m3336constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            m3336constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            m3336constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        Updater.m3343setimpl(m3336constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
        TextKt.m2376Text4IGK_g("Dim screen", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65534);
        SleepTabScreenBody$lambda$235$lambda$215 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$215(mutableState5);
        composer.startReplaceGroup(-1304367032);
        boolean changedInstance6 = composer.changedInstance(context);
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$23$9$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$19$lambda$18$lambda$17$lambda$16;
                    invoke$lambda$19$lambda$18$lambda$17$lambda$16 = SleepTabScreenBodyKt$SleepTabScreenBody$23$9.invoke$lambda$19$lambda$18$lambda$17$lambda$16(context, mutableState5, ((Boolean) obj).booleanValue());
                    return invoke$lambda$19$lambda$18$lambda$17$lambda$16;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceGroup();
        SwitchKt.Switch(SleepTabScreenBody$lambda$235$lambda$215, (Function1) rememberedValue6, null, null, false, null, null, composer, 0, 124);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$2$lambda$1$lambda$0(Context context, MutableState mutableState, boolean z) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$207(mutableState, z);
        BedtimeReminderPrefs.INSTANCE.setEnabled(context, z);
        BedtimeReminderScheduler bedtimeReminderScheduler = BedtimeReminderScheduler.INSTANCE;
        if (z) {
            bedtimeReminderScheduler.scheduleNext(context);
        } else {
            bedtimeReminderScheduler.cancel(context);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$9$lambda$5$lambda$4(Context context, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableState mutableState, String v) {
        int SleepTabScreenBody$lambda$235$lambda$212;
        boolean SleepTabScreenBody$lambda$235$lambda$206;
        Intrinsics.checkNotNullParameter(v, "v");
        Integer intOrNull = StringsKt.toIntOrNull(v);
        if (intOrNull != null) {
            int coerceIn = RangesKt.coerceIn(intOrNull.intValue(), 0, 23);
            mutableIntState.setIntValue(coerceIn);
            BedtimeReminderPrefs bedtimeReminderPrefs = BedtimeReminderPrefs.INSTANCE;
            SleepTabScreenBody$lambda$235$lambda$212 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$212(mutableIntState2);
            bedtimeReminderPrefs.setTime(context, coerceIn, SleepTabScreenBody$lambda$235$lambda$212);
            SleepTabScreenBody$lambda$235$lambda$206 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$206(mutableState);
            if (SleepTabScreenBody$lambda$235$lambda$206) {
                BedtimeReminderScheduler.INSTANCE.scheduleNext(context);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$9$lambda$8$lambda$7(Context context, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableState mutableState, String v) {
        int SleepTabScreenBody$lambda$235$lambda$209;
        boolean SleepTabScreenBody$lambda$235$lambda$206;
        Intrinsics.checkNotNullParameter(v, "v");
        Integer intOrNull = StringsKt.toIntOrNull(v);
        if (intOrNull != null) {
            int coerceIn = RangesKt.coerceIn(intOrNull.intValue(), 0, 59);
            mutableIntState.setIntValue(coerceIn);
            BedtimeReminderPrefs bedtimeReminderPrefs = BedtimeReminderPrefs.INSTANCE;
            SleepTabScreenBody$lambda$235$lambda$209 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$209(mutableIntState2);
            bedtimeReminderPrefs.setTime(context, SleepTabScreenBody$lambda$235$lambda$209, coerceIn);
            SleepTabScreenBody$lambda$235$lambda$206 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$206(mutableState);
            if (SleepTabScreenBody$lambda$235$lambda$206) {
                BedtimeReminderScheduler.INSTANCE.scheduleNext(context);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$12$lambda$11$lambda$10(Context context, MutableState mutableState, boolean z) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$222(mutableState, z);
        BedtimeReminderPrefs.INSTANCE.setWindDownPauseMedia(context, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$15$lambda$14$lambda$13(Context context, MutableState mutableState, boolean z) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$219(mutableState, z);
        BedtimeReminderPrefs.INSTANCE.setWindDownDnd(context, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$16(Context context, MutableState mutableState, boolean z) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$216(mutableState, z);
        BedtimeReminderPrefs.INSTANCE.setWindDownDim(context, z);
        return Unit.INSTANCE;
    }
}
