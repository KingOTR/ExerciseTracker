package com.example.rungps.ui.run;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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
import com.example.rungps.data.RunSplitEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* compiled from: RunKmSplitsTable.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006\u0016"}, d2 = {"RunKmSplitsTable", "", "splits", "", "Lcom/example/rungps/data/RunSplitEntity;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "headerStyle", "Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "rowStyle", "highlight", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "formatElapsed", "", "ms", "", "formatPace", "secondsPerKm", "", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunKmSplitsTableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RunKmSplitsTable$lambda$14(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RunKmSplitsTable(list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RunKmSplitsTable$lambda$3(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RunKmSplitsTable(list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RunKmSplitsTable(final List<RunSplitEntity> splits, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        boolean changed;
        Object rememberedValue;
        List list;
        Object next;
        String str;
        Composer composer2;
        SplitRow splitRow;
        Composer composer3;
        Composer composer4;
        Intrinsics.checkNotNullParameter(splits, "splits");
        Composer startRestartGroup = composer.startRestartGroup(-865782796);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(splits) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                final Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-865782796, i3, -1, "com.example.rungps.ui.run.RunKmSplitsTable (RunKmSplitsTable.kt:23)");
                }
                startRestartGroup.startReplaceGroup(-1512553955);
                changed = startRestartGroup.changed(splits);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : splits) {
                        if (Intrinsics.areEqual(((RunSplitEntity) obj).getKind(), "KM")) {
                            arrayList.add(obj);
                        }
                    }
                    rememberedValue = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.rungps.ui.run.RunKmSplitsTableKt$RunKmSplitsTable$lambda$2$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(Integer.valueOf(((RunSplitEntity) t).getIdx()), Integer.valueOf(((RunSplitEntity) t2).getIdx()));
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                list = (List) rememberedValue;
                startRestartGroup.endReplaceGroup();
                if (!list.isEmpty()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.run.RunKmSplitsTableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit RunKmSplitsTable$lambda$3;
                                RunKmSplitsTable$lambda$3 = RunKmSplitsTableKt.RunKmSplitsTable$lambda$3(splits, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                return RunKmSplitsTable$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                startRestartGroup.startReplaceGroup(-1512549355);
                boolean changed2 = startRestartGroup.changed(list);
                ArrayList rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    List<RunSplitEntity> list2 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (RunSplitEntity runSplitEntity : list2) {
                        arrayList2.add(new SplitRow(runSplitEntity.getIdx(), runSplitEntity.getDurationMs(), runSplitEntity.getDistanceM(), runSplitEntity.getDistanceM() >= 10.0d ? Double.valueOf((runSplitEntity.getDurationMs() / 1000.0d) / (runSplitEntity.getDistanceM() / 1000.0d)) : null));
                    }
                    rememberedValue2 = arrayList2;
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final List list3 = (List) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                Iterator it = list3.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        Double paceSec = ((SplitRow) next).getPaceSec();
                        double doubleValue = paceSec != null ? paceSec.doubleValue() : Double.MAX_VALUE;
                        do {
                            Object next2 = it.next();
                            Double paceSec2 = ((SplitRow) next2).getPaceSec();
                            double doubleValue2 = paceSec2 != null ? paceSec2.doubleValue() : Double.MAX_VALUE;
                            if (Double.compare(doubleValue, doubleValue2) > 0) {
                                next = next2;
                                doubleValue = doubleValue2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                SplitRow splitRow2 = (SplitRow) next;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifier4 = modifier3;
                TextKt.m2376Text4IGK_g("Kilometer splits", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleMedium(), startRestartGroup, 6, 0, 65534);
                SplitRow splitRow3 = (splitRow2 == null || splitRow2.getPaceSec() == null) ? null : splitRow2;
                startRestartGroup.startReplaceGroup(-1958770058);
                if (splitRow3 == null) {
                    str = " · ";
                    composer2 = startRestartGroup;
                    splitRow = splitRow2;
                } else {
                    int idx = splitRow3.getIdx();
                    Double paceSec3 = splitRow3.getPaceSec();
                    Intrinsics.checkNotNull(paceSec3);
                    str = " · ";
                    composer2 = startRestartGroup;
                    splitRow = splitRow2;
                    TextKt.m2376Text4IGK_g("Fastest: km " + idx + " · " + formatPace(paceSec3.doubleValue()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                Composer composer5 = composer2;
                final SplitRow splitRow4 = splitRow;
                SurfaceKt.m2226SurfaceT9BRK9s(null, MaterialTheme.INSTANCE.getShapes(composer5, MaterialTheme.$stable).getMedium(), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getSurfaceVariant(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(533916547, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.run.RunKmSplitsTableKt$RunKmSplitsTable$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                        invoke(composer6, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:54:0x044c, code lost:
                    
                        r0 = com.example.rungps.ui.run.RunKmSplitsTableKt.formatPace(r0.doubleValue());
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(Composer composer6, int i5) {
                        TextStyle headerStyle;
                        TextStyle headerStyle2;
                        TextStyle headerStyle3;
                        TextStyle rowStyle;
                        String formatElapsed;
                        TextStyle rowStyle2;
                        String str2;
                        TextStyle rowStyle3;
                        if ((i5 & 3) != 2 || !composer6.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(533916547, i5, -1, "com.example.rungps.ui.run.RunKmSplitsTable.<anonymous>.<anonymous> (RunKmSplitsTable.kt:52)");
                            }
                            Modifier m685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(Modifier.INSTANCE, Dp.m6303constructorimpl(12), Dp.m6303constructorimpl(8));
                            List<SplitRow> list4 = list3;
                            SplitRow splitRow5 = splitRow4;
                            ComposerKt.sourceInformationMarkerStart(composer6, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer6, m685paddingVpY3zN4);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer6.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer6.startReusableNode();
                            if (composer6.getInserting()) {
                                composer6.createNode(constructor2);
                            } else {
                                composer6.useNode();
                            }
                            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer6);
                            Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer6, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            ComposerKt.sourceInformationMarkerStart(composer6, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer6, 0);
                            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer6.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer6, fillMaxWidth$default2);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer6.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer6.startReusableNode();
                            if (composer6.getInserting()) {
                                composer6.createNode(constructor3);
                            } else {
                                composer6.useNode();
                            }
                            Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer6);
                            Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer6, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 0.2f, false, 2, null);
                            headerStyle = RunKmSplitsTableKt.headerStyle(composer6, 0);
                            String str3 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                            String str4 = "C101@5126L9:Row.kt#2w3rfo";
                            String str5 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                            String str6 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                            TextKt.m2376Text4IGK_g("Km", weight$default, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, headerStyle, composer6, 196614, 0, 65500);
                            Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 0.35f, false, 2, null);
                            headerStyle2 = RunKmSplitsTableKt.headerStyle(composer6, 0);
                            TextKt.m2376Text4IGK_g("Time", weight$default2, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, headerStyle2, composer6, 196614, 0, 65500);
                            Modifier weight$default3 = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 0.45f, false, 2, null);
                            headerStyle3 = RunKmSplitsTableKt.headerStyle(composer6, 0);
                            TextKt.m2376Text4IGK_g("Pace", weight$default3, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, headerStyle3, composer6, 196614, 0, 65500);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            composer6.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            Object obj2 = null;
                            int i6 = 1;
                            float f = 0.0f;
                            DividerKt.m1755HorizontalDivider9IZ8Weo(PaddingKt.m686paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(6), 1, null), 0.0f, 0L, composer6, 6, 6);
                            Composer composer7 = composer6;
                            composer7.startReplaceGroup(1828246236);
                            for (SplitRow splitRow6 : list4) {
                                boolean z = (splitRow5 == null || splitRow6.getIdx() != splitRow5.getIdx()) ? 0 : i6;
                                Modifier m686paddingVpY3zN4$default = PaddingKt.m686paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i6, obj2), f, Dp.m6303constructorimpl(4), i6, obj2);
                                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                String str7 = str3;
                                ComposerKt.sourceInformationMarkerStart(composer7, 693286680, str7);
                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer7, 6);
                                String str8 = str6;
                                ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, str8);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer7, m686paddingVpY3zN4$default);
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                String str9 = str5;
                                ComposerKt.sourceInformationMarkerStart(composer7, -692256719, str9);
                                if (!(composer6.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer6.startReusableNode();
                                if (composer6.getInserting()) {
                                    composer7.createNode(constructor4);
                                } else {
                                    composer6.useNode();
                                }
                                Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer6);
                                Updater.m3343setimpl(m3336constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                String str10 = str4;
                                ComposerKt.sourceInformationMarkerStart(composer7, -407840262, str10);
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                String valueOf = String.valueOf(splitRow6.getIdx());
                                Modifier weight$default4 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 0.2f, false, 2, null);
                                rowStyle = RunKmSplitsTableKt.rowStyle(z, composer7, 0);
                                FontWeight.Companion companion = FontWeight.INSTANCE;
                                int i7 = i6;
                                boolean z2 = z;
                                TextKt.m2376Text4IGK_g(valueOf, weight$default4, 0L, 0L, (FontStyle) null, z != 0 ? companion.getSemiBold() : companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, rowStyle, composer6, 0, 0, 65500);
                                formatElapsed = RunKmSplitsTableKt.formatElapsed(splitRow6.getDurationMs());
                                Modifier weight$default5 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 0.35f, false, 2, null);
                                rowStyle2 = RunKmSplitsTableKt.rowStyle(z2, composer6, 0);
                                TextKt.m2376Text4IGK_g(formatElapsed, weight$default5, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, rowStyle2, composer6, 0, 0, 65532);
                                Double paceSec4 = splitRow6.getPaceSec();
                                if (paceSec4 == null || str2 == null) {
                                    str2 = "—";
                                }
                                Modifier weight$default6 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 0.45f, false, 2, null);
                                rowStyle3 = RunKmSplitsTableKt.rowStyle(z2, composer6, 0);
                                TextKt.m2376Text4IGK_g(str2, weight$default6, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, rowStyle3, composer6, 0, 0, 65532);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                composer6.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                composer7 = composer6;
                                str4 = str10;
                                str5 = str9;
                                str6 = str8;
                                str3 = str7;
                                i6 = i7;
                                f = 0.0f;
                                obj2 = null;
                            }
                            composer6.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            composer6.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer6.skipToGroupEnd();
                    }
                }, composer5, 54), composer5, 12582912, 121);
                List<RunSplitEntity> list4 = splits;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list4) {
                    if (Intrinsics.areEqual(((RunSplitEntity) obj2).getKind(), "LAP")) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = arrayList3;
                composer5.startReplaceGroup(-1958699248);
                if (arrayList4.isEmpty()) {
                    composer3 = composer5;
                } else {
                    composer3 = composer5;
                    TextKt.m2376Text4IGK_g("Laps", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getLabelLarge(), composer3, 6, 0, 65534);
                    for (RunSplitEntity runSplitEntity2 : CollectionsKt.take(arrayList4, 12)) {
                        String str2 = str;
                        TextKt.m2376Text4IGK_g("Lap " + runSplitEntity2.getIdx() + str2 + formatElapsed(runSplitEntity2.getDurationMs()) + str2 + (runSplitEntity2.getDistanceM() >= 10.0d ? formatPace((runSplitEntity2.getDurationMs() / 1000.0d) / (runSplitEntity2.getDistanceM() / 1000.0d)) : "—"), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                        str = str2;
                    }
                }
                composer3.endReplaceGroup();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : list4) {
                    if (Intrinsics.areEqual(((RunSplitEntity) obj3).getKind(), "HAZARD")) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList<RunSplitEntity> arrayList6 = arrayList5;
                Composer composer6 = composer3;
                composer6.startReplaceGroup(-1958678472);
                if (arrayList6.isEmpty()) {
                    composer4 = composer6;
                } else {
                    Composer composer7 = composer6;
                    TextKt.m2376Text4IGK_g("Hazards", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getLabelLarge(), composer7, 6, 0, 65534);
                    for (RunSplitEntity runSplitEntity3 : arrayList6) {
                        int idx2 = runSplitEntity3.getIdx();
                        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(runSplitEntity3.getDistanceM() / 1000.0d)}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        Composer composer8 = composer7;
                        TextKt.m2376Text4IGK_g("#" + idx2 + " at " + format + " km", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getBodySmall(), composer8, 0, 0, 65530);
                        composer7 = composer8;
                    }
                    composer4 = composer7;
                }
                composer4.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer4 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup2 = composer4.endRestartGroup();
            if (endRestartGroup2 != null) {
                endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.run.RunKmSplitsTableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        Unit RunKmSplitsTable$lambda$14;
                        RunKmSplitsTable$lambda$14 = RunKmSplitsTableKt.RunKmSplitsTable$lambda$14(splits, modifier2, i, i2, (Composer) obj4, ((Integer) obj5).intValue());
                        return RunKmSplitsTable$lambda$14;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(-1512553955);
        changed = startRestartGroup.changed(splits);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        ArrayList arrayList7 = new ArrayList();
        while (r3.hasNext()) {
        }
        rememberedValue = CollectionsKt.sortedWith(arrayList7, new Comparator() { // from class: com.example.rungps.ui.run.RunKmSplitsTableKt$RunKmSplitsTable$lambda$2$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((RunSplitEntity) t).getIdx()), Integer.valueOf(((RunSplitEntity) t2).getIdx()));
            }
        });
        startRestartGroup.updateRememberedValue(rememberedValue);
        list = (List) rememberedValue;
        startRestartGroup.endReplaceGroup();
        if (!list.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle headerStyle(Composer composer, int i) {
        TextStyle m5814copyp1EtxEg;
        composer.startReplaceGroup(378738817);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(378738817, i, -1, "com.example.rungps.ui.run.headerStyle (RunKmSplitsTable.kt:118)");
        }
        m5814copyp1EtxEg = r2.m5814copyp1EtxEg((r48 & 1) != 0 ? r2.spanStyle.m5738getColor0d7_KjU() : MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), (r48 & 2) != 0 ? r2.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r2.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r2.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r2.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r2.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r2.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r2.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r2.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r2.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r2.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r2.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r2.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r2.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r2.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r2.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? r2.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r2.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r2.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r2.platformStyle : null, (r48 & 1048576) != 0 ? r2.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r2.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r2.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium().paragraphStyle.getTextMotion() : null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m5814copyp1EtxEg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle rowStyle(boolean z, Composer composer, int i) {
        long onSurface;
        TextStyle m5814copyp1EtxEg;
        composer.startReplaceGroup(877457294);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(877457294, i, -1, "com.example.rungps.ui.run.rowStyle (RunKmSplitsTable.kt:123)");
        }
        TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium();
        if (z) {
            composer.startReplaceGroup(533133533);
            onSurface = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary();
        } else {
            composer.startReplaceGroup(533134783);
            onSurface = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface();
        }
        composer.endReplaceGroup();
        m5814copyp1EtxEg = bodyMedium.m5814copyp1EtxEg((r48 & 1) != 0 ? bodyMedium.spanStyle.m5738getColor0d7_KjU() : onSurface, (r48 & 2) != 0 ? bodyMedium.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? bodyMedium.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? bodyMedium.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? bodyMedium.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? bodyMedium.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? bodyMedium.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? bodyMedium.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? bodyMedium.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? bodyMedium.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? bodyMedium.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? bodyMedium.platformStyle : null, (r48 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? bodyMedium.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? bodyMedium.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m5814copyp1EtxEg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatElapsed(long j) {
        long coerceAtLeast = RangesKt.coerceAtLeast(j / 1000, 0L);
        long j2 = 3600;
        long j3 = coerceAtLeast / j2;
        long j4 = 60;
        long j5 = (coerceAtLeast % j2) / j4;
        long j6 = coerceAtLeast % j4;
        if (j3 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j6)}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatPace(double d) {
        int coerceAtLeast = (int) RangesKt.coerceAtLeast(d, 0.0d);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%d:%02d /km", Arrays.copyOf(new Object[]{Integer.valueOf(coerceAtLeast / 60), Integer.valueOf(coerceAtLeast % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
