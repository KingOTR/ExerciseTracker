package com.example.rungps.ui.gear;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import com.example.rungps.data.GearEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GearPicker.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GearPickerKt$GearPicker$5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Map<Long, Double> $kmById;
    final /* synthetic */ Function1<Long, Unit> $onSelect;
    final /* synthetic */ List<GearEntity> $options;
    final /* synthetic */ MutableState<Boolean> $showPicker$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    GearPickerKt$GearPicker$5(Function1<? super Long, Unit> function1, List<GearEntity> list, MutableState<Boolean> mutableState, Map<Long, Double> map) {
        this.$onSelect = function1;
        this.$options = list;
        this.$showPicker$delegate = mutableState;
        this.$kmById = map;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        final MutableState<Boolean> mutableState;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-33934370, i, -1, "com.example.rungps.ui.gear.GearPicker.<anonymous> (GearPicker.kt:59)");
            }
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            final Function1<Long, Unit> function1 = this.$onSelect;
            List<GearEntity> list = this.$options;
            final MutableState<Boolean> mutableState2 = this.$showPicker$delegate;
            final Map<Long, Double> map = this.$kmById;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
            composer.startReplaceGroup(750524327);
            boolean changed = composer.changed(function1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.gear.GearPickerKt$GearPicker$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$5$lambda$1$lambda$0;
                        invoke$lambda$5$lambda$1$lambda$0 = GearPickerKt$GearPicker$5.invoke$lambda$5$lambda$1$lambda$0(Function1.this, mutableState2);
                        return invoke$lambda$5$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            MutableState<Boolean> mutableState3 = mutableState2;
            ButtonKt.TextButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$GearPickerKt.INSTANCE.m7040getLambda3$app_sideload(), composer, 805306368, 510);
            composer.startReplaceGroup(750529394);
            for (final GearEntity gearEntity : list) {
                composer.startReplaceGroup(278714261);
                boolean changed2 = composer.changed(function1) | composer.changedInstance(gearEntity);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    mutableState = mutableState3;
                    rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.gear.GearPickerKt$GearPicker$5$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2;
                            invoke$lambda$5$lambda$4$lambda$3$lambda$2 = GearPickerKt$GearPicker$5.invoke$lambda$5$lambda$4$lambda$3$lambda$2(Function1.this, gearEntity, mutableState);
                            return invoke$lambda$5$lambda$4$lambda$3$lambda$2;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                } else {
                    mutableState = mutableState3;
                }
                composer.endReplaceGroup();
                ButtonKt.TextButton((Function0) rememberedValue2, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(162210100, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.GearPickerKt$GearPicker$5$1$2$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope TextButton, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                        if ((i2 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(162210100, i2, -1, "com.example.rungps.ui.gear.GearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GearPicker.kt:69)");
                        }
                        GearEntity gearEntity2 = GearEntity.this;
                        TextKt.m2376Text4IGK_g(GearPickerKt.gearDisplayLabel(gearEntity2, map.get(Long.valueOf(gearEntity2.getId()))), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 805306368, 510);
                mutableState3 = mutableState;
            }
            composer.endReplaceGroup();
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
    public static final Unit invoke$lambda$5$lambda$1$lambda$0(Function1 function1, MutableState mutableState) {
        function1.invoke(null);
        GearPickerKt.GearPicker$lambda$2(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(Function1 function1, GearEntity gearEntity, MutableState mutableState) {
        function1.invoke(Long.valueOf(gearEntity.getId()));
        GearPickerKt.GearPicker$lambda$2(mutableState, false);
        return Unit.INSTANCE;
    }
}
