package com.example.rungps.ui.gym;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SwitchKt;
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
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExerciseMuscleEditorDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<List<String>> $ordered$delegate;
    final /* synthetic */ List<String> $regions;
    final /* synthetic */ MutableState<Boolean> $unilateral$delegate;

    ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$4(MutableState<List<String>> mutableState, MutableState<Boolean> mutableState2, List<String> list) {
        this.$ordered$delegate = mutableState;
        this.$unilateral$delegate = mutableState2;
        this.$regions = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        List ExerciseMuscleEditorDialog$lambda$3;
        float f;
        Object obj;
        int i2;
        boolean ExerciseMuscleEditorDialog$lambda$6;
        List ExerciseMuscleEditorDialog$lambda$32;
        List ExerciseMuscleEditorDialog$lambda$33;
        String ExerciseMuscleEditorDialog$regionLabel;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(506116475, i, -1, "com.example.rungps.ui.gym.ExerciseMuscleEditorDialog.<anonymous> (ExerciseMuscleEditorDialog.kt:66)");
            }
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
            MutableState<List<String>> mutableState = this.$ordered$delegate;
            final MutableState<Boolean> mutableState2 = this.$unilateral$delegate;
            List<String> list = this.$regions;
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
            final MutableState<List<String>> mutableState3 = mutableState;
            TextKt.m2376Text4IGK_g("Tap muscles in order: 1st = primary, 2nd = secondary…", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
            composer.startReplaceGroup(-1834635253);
            ExerciseMuscleEditorDialog$lambda$3 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$3(mutableState3);
            if (ExerciseMuscleEditorDialog$lambda$3.isEmpty()) {
                f = 0.0f;
                obj = null;
                i2 = 1;
            } else {
                ExerciseMuscleEditorDialog$lambda$33 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$3(mutableState3);
                List list2 = ExerciseMuscleEditorDialog$lambda$33;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                int i3 = 0;
                for (Object obj2 : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ExerciseMuscleEditorDialog$regionLabel = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$regionLabel((String) obj2);
                    arrayList.add(i4 + ". " + ExerciseMuscleEditorDialog$regionLabel);
                    i3 = i4;
                }
                TextKt.m2376Text4IGK_g(CollectionsKt.joinToString$default(arrayList, " · ", null, null, 0, null, null, 62, null), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 0, 0, 65530);
                composer.startReplaceGroup(-1834624092);
                boolean changed = composer.changed(mutableState3);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.gym.ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$11$lambda$2$lambda$1;
                            invoke$lambda$11$lambda$2$lambda$1 = ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$4.invoke$lambda$11$lambda$2$lambda$1(MutableState.this);
                            return invoke$lambda$11$lambda$2$lambda$1;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                obj = null;
                mutableState3 = mutableState3;
                i2 = 1;
                f = 0.0f;
                ButtonKt.OutlinedButton((Function0) rememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$ExerciseMuscleEditorDialogKt.INSTANCE.m7058getLambda3$app_sideload(), composer, 805306416, 508);
            }
            composer.endReplaceGroup();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i2, obj);
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
            MutableState<List<String>> mutableState4 = mutableState3;
            TextKt.m2376Text4IGK_g("Single arm / leg", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 6, 0, 65534);
            ExerciseMuscleEditorDialog$lambda$6 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$6(mutableState2);
            Composer composer2 = composer;
            composer2.startReplaceGroup(600876925);
            boolean changed2 = composer2.changed(mutableState2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.gym.ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit invoke$lambda$11$lambda$5$lambda$4$lambda$3;
                        invoke$lambda$11$lambda$5$lambda$4$lambda$3 = ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$4.invoke$lambda$11$lambda$5$lambda$4$lambda$3(MutableState.this, ((Boolean) obj3).booleanValue());
                        return invoke$lambda$11$lambda$5$lambda$4$lambda$3;
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            SwitchKt.Switch(ExerciseMuscleEditorDialog$lambda$6, (Function1) rememberedValue2, null, null, false, null, null, composer, 0, 124);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            boolean z = true;
            boolean z2 = false;
            Modifier horizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer2, 6);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, horizontalScroll$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor3);
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
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composer2.startReplaceGroup(600887870);
            for (final String str : list) {
                ExerciseMuscleEditorDialog$lambda$32 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$3(mutableState4);
                final int indexOf = ExerciseMuscleEditorDialog$lambda$32.indexOf(str);
                boolean z3 = indexOf >= 0 ? z : z2;
                composer2.startReplaceGroup(-1216992060);
                final MutableState<List<String>> mutableState5 = mutableState4;
                boolean changed3 = composer2.changed(mutableState5) | composer2.changed(indexOf) | composer2.changed(str);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.gym.ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$4$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7;
                            invoke$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7 = ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$4.invoke$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7(indexOf, str, mutableState5);
                            return invoke$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceGroup();
                ChipKt.FilterChip(z3, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(-1485026743, z, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$4$1$4$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        String ExerciseMuscleEditorDialog$regionLabel2;
                        if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1485026743, i5, -1, "com.example.rungps.ui.gym.ExerciseMuscleEditorDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExerciseMuscleEditorDialog.kt:110)");
                            }
                            ExerciseMuscleEditorDialog$regionLabel2 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$regionLabel(str);
                            int i6 = indexOf;
                            if (i6 >= 0) {
                                ExerciseMuscleEditorDialog$regionLabel2 = ExerciseMuscleEditorDialog$regionLabel2 + " (#" + (i6 + 1) + ")";
                            }
                            TextKt.m2376Text4IGK_g(ExerciseMuscleEditorDialog$regionLabel2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composer2, 54), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
                composer2 = composer;
                mutableState4 = mutableState5;
                z2 = z2;
                z = z;
            }
            composer.endReplaceGroup();
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
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$2$lambda$1(MutableState mutableState) {
        mutableState.setValue(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$5$lambda$4$lambda$3(MutableState mutableState, boolean z) {
        ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$7(mutableState, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7(int i, String str, MutableState mutableState) {
        List ExerciseMuscleEditorDialog$lambda$3;
        List ExerciseMuscleEditorDialog$lambda$32;
        ArrayList plus;
        List ExerciseMuscleEditorDialog$lambda$33;
        List ExerciseMuscleEditorDialog$lambda$34;
        if (i >= 0) {
            ExerciseMuscleEditorDialog$lambda$34 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$3(mutableState);
            ArrayList arrayList = new ArrayList();
            for (Object obj : ExerciseMuscleEditorDialog$lambda$34) {
                if (!Intrinsics.areEqual((String) obj, str)) {
                    arrayList.add(obj);
                }
            }
            plus = arrayList;
        } else {
            ExerciseMuscleEditorDialog$lambda$3 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$3(mutableState);
            if (ExerciseMuscleEditorDialog$lambda$3.size() >= 3) {
                ExerciseMuscleEditorDialog$lambda$33 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$3(mutableState);
                plus = CollectionsKt.plus((Collection<? extends String>) CollectionsKt.drop(ExerciseMuscleEditorDialog$lambda$33, 1), str);
            } else {
                ExerciseMuscleEditorDialog$lambda$32 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$3(mutableState);
                plus = CollectionsKt.plus((Collection<? extends String>) ExerciseMuscleEditorDialog$lambda$32, str);
            }
        }
        mutableState.setValue(plus);
        return Unit.INSTANCE;
    }
}
