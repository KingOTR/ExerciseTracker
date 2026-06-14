package com.example.rungps.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: LabeledBarChart.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\u001aW\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\r\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH\u0002\u001a\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\bH\u0002¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\fX\u008a\u008e\u0002"}, d2 = {"LabeledVerticalBarChart", "", "bars", "", "Lcom/example/rungps/ui/components/BarChartValue;", "modifier", "Landroidx/compose/ui/Modifier;", "valueSuffix", "", "emptyHint", "onBarSelected", "Lkotlin/Function2;", "", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "niceCeil", "", "max", "yAxisTicks", "segments", "formatAxisValue", "v", "suffix", "app_sideload", "selectedIdx"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LabeledBarChartKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LabeledVerticalBarChart$lambda$0(List list, Modifier modifier, String str, String str2, Function2 function2, int i, int i2, Composer composer, int i3) {
        LabeledVerticalBarChart(list, modifier, str, str2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LabeledVerticalBarChart$lambda$17(List list, Modifier modifier, String str, String str2, Function2 function2, int i, int i2, Composer composer, int i3) {
        LabeledVerticalBarChart(list, modifier, str, str2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LabeledVerticalBarChart(final List<BarChartValue> bars, Modifier modifier, String str, String str2, Function2<? super Integer, ? super BarChartValue, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str3;
        int i5;
        String str4;
        int i6;
        Function2<? super Integer, ? super BarChartValue, Unit> function22;
        Function2<? super Integer, ? super BarChartValue, Unit> function23;
        float f;
        BoxScopeInstance boxScopeInstance;
        float f2;
        String str5;
        final MutableIntState mutableIntState;
        String str6;
        String str7;
        Modifier modifier3;
        Function2<? super Integer, ? super BarChartValue, Unit> function24;
        Modifier modifier4;
        Composer composer2;
        String str8;
        final String str9;
        final Modifier modifier5;
        final Function2<? super Integer, ? super BarChartValue, Unit> function25;
        final String str10;
        Intrinsics.checkNotNullParameter(bars, "bars");
        Composer startRestartGroup = composer.startRestartGroup(-818422623);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bars) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str3 = str;
                i3 |= startRestartGroup.changed(str3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str4 = str2;
                    i3 |= startRestartGroup.changed(str4) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function22 = function2;
                        i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                        if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                            Modifier modifier6 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            String str11 = i4 != 0 ? "kg" : str3;
                            String str12 = i5 != 0 ? "No data yet." : str4;
                            if (i6 != 0) {
                                function22 = null;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-818422623, i3, -1, "com.example.rungps.ui.components.LabeledVerticalBarChart (LabeledBarChart.kt:51)");
                            }
                            startRestartGroup.startReplaceGroup(763014170);
                            if (bars.isEmpty()) {
                                TextKt.m2376Text4IGK_g(str12, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, (i3 >> 9) & 14, 0, 65530);
                                startRestartGroup.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final Modifier modifier7 = modifier6;
                                    final String str13 = str11;
                                    final String str14 = str12;
                                    final Function2<? super Integer, ? super BarChartValue, Unit> function26 = function22;
                                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.LabeledBarChartKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit LabeledVerticalBarChart$lambda$0;
                                            LabeledVerticalBarChart$lambda$0 = LabeledBarChartKt.LabeledVerticalBarChart$lambda$0(bars, modifier7, str13, str14, function26, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return LabeledVerticalBarChart$lambda$0;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            startRestartGroup.endReplaceGroup();
                            List<BarChartValue> list = bars;
                            Iterator<T> it = list.iterator();
                            if (!it.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            double value = ((BarChartValue) it.next()).getValue();
                            while (it.hasNext()) {
                                value = Math.max(value, ((BarChartValue) it.next()).getValue());
                            }
                            final double niceCeil = niceCeil(RangesKt.coerceAtLeast(value, 1.0d));
                            final List<Double> yAxisTicks = yAxisTicks(niceCeil, 4);
                            startRestartGroup.startReplaceGroup(763024128);
                            boolean changed = startRestartGroup.changed(bars);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = SnapshotIntStateKt.mutableIntStateOf(-1);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            MutableIntState mutableIntState2 = (MutableIntState) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            final long primary = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary();
                            final long m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                            final long m3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOutline(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                            long surfaceContainerHigh = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh();
                            final long onSurface = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurface();
                            float m6303constructorimpl = Dp.m6303constructorimpl(40);
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier6, 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(4));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            Modifier modifier8 = modifier6;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function2<? super Integer, ? super BarChartValue, Unit> function27 = function22;
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
                            float f3 = 8;
                            Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(BackgroundKt.m238backgroundbw27NRU(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(168)), surfaceContainerHigh, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(f3))), Dp.m6303constructorimpl(f3));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m684padding3ABfNKs);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor2);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                            Updater.m3343setimpl(m3336constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Modifier m715height3ABfNKs = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(132));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m715height3ABfNKs);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor3);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m3336constructorimpl3 = Updater.m3336constructorimpl(startRestartGroup);
                            Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, m6303constructorimpl), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxHeight$default);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor4);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m3336constructorimpl4 = Updater.m3336constructorimpl(startRestartGroup);
                            Updater.m3343setimpl(m3336constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(-654039032);
                            for (Iterator it2 = CollectionsKt.reversed(yAxisTicks).iterator(); it2.hasNext(); it2 = it2) {
                                String formatAxisValue = formatAxisValue(((Number) it2.next()).doubleValue(), str11);
                                TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall();
                                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant();
                                long m5819getFontSizeXSAIIZE = MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall().m5819getFontSizeXSAIIZE();
                                TextUnitKt.m6509checkArithmeticR2X_6o(m5819getFontSizeXSAIIZE);
                                TextKt.m2376Text4IGK_g(formatAxisValue, (Modifier) null, onSurfaceVariant, TextUnitKt.pack(TextUnit.m6494getRawTypeimpl(m5819getFontSizeXSAIIZE), TextUnit.m6496getValueimpl(m5819getFontSizeXSAIIZE) * 0.9f), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelSmall, startRestartGroup, 0, 0, 65522);
                            }
                            startRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier fillMaxHeight$default2 = SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                            startRestartGroup.startReplaceGroup(-798570043);
                            boolean changedInstance = ((i3 & 57344) == 16384) | startRestartGroup.changedInstance(bars) | startRestartGroup.changed(mutableIntState2);
                            LabeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                function23 = function27;
                                rememberedValue2 = new LabeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1(bars, function23, mutableIntState2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            } else {
                                function23 = function27;
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(fillMaxHeight$default2, bars, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2);
                            startRestartGroup.startReplaceGroup(-798553031);
                            String str15 = str11;
                            boolean changedInstance2 = startRestartGroup.changedInstance(bars) | startRestartGroup.changedInstance(yAxisTicks) | startRestartGroup.changed(niceCeil) | startRestartGroup.changed(onSurface) | startRestartGroup.changed(mutableIntState2) | startRestartGroup.changed(m3842copywmQWz5c$default2) | startRestartGroup.changed(primary) | startRestartGroup.changed(m3842copywmQWz5c$default);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                f = m6303constructorimpl;
                                boxScopeInstance = boxScopeInstance2;
                                f2 = f3;
                                str5 = str15;
                                mutableIntState = mutableIntState2;
                                str6 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                                str7 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                modifier3 = modifier8;
                                function24 = function23;
                                modifier4 = pointerInput;
                                composer2 = startRestartGroup;
                                Function1 function1 = new Function1() { // from class: com.example.rungps.ui.components.LabeledBarChartKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit LabeledVerticalBarChart$lambda$16$lambda$13$lambda$12$lambda$11$lambda$10;
                                        LabeledVerticalBarChart$lambda$16$lambda$13$lambda$12$lambda$11$lambda$10 = LabeledBarChartKt.LabeledVerticalBarChart$lambda$16$lambda$13$lambda$12$lambda$11$lambda$10(bars, yAxisTicks, onSurface, niceCeil, m3842copywmQWz5c$default2, primary, m3842copywmQWz5c$default, mutableIntState, (DrawScope) obj);
                                        return LabeledVerticalBarChart$lambda$16$lambda$13$lambda$12$lambda$11$lambda$10;
                                    }
                                };
                                composer2.updateRememberedValue(function1);
                                rememberedValue3 = function1;
                            } else {
                                boxScopeInstance = boxScopeInstance2;
                                f = m6303constructorimpl;
                                composer2 = startRestartGroup;
                                function24 = function23;
                                str5 = str15;
                                mutableIntState = mutableIntState2;
                                str6 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                                str7 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                modifier3 = modifier8;
                                f2 = f3;
                                modifier4 = pointerInput;
                            }
                            composer2.endReplaceGroup();
                            CanvasKt.Canvas(modifier4, (Function1) rememberedValue3, composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.startReplaceGroup(713413217);
                            List<BarChartValue> list2 = bars;
                            int size = list2.size();
                            int LabeledVerticalBarChart$lambda$3 = LabeledVerticalBarChart$lambda$3(mutableIntState);
                            if (LabeledVerticalBarChart$lambda$3 < 0 || LabeledVerticalBarChart$lambda$3 >= size) {
                                str8 = str5;
                            } else {
                                final BarChartValue barChartValue = bars.get(LabeledVerticalBarChart$lambda$3(mutableIntState));
                                final String str16 = str5;
                                str8 = str16;
                                SurfaceKt.m2226SurfaceT9BRK9s(PaddingKt.m688paddingqDBjuR0$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0.0f, Dp.m6303constructorimpl(2), 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(f2)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getInverseSurface(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-2061895085, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.components.LabeledBarChartKt$LabeledVerticalBarChart$2$1$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i8) {
                                        String formatAxisValue2;
                                        if ((i8 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2061895085, i8, -1, "com.example.rungps.ui.components.LabeledVerticalBarChart.<anonymous>.<anonymous>.<anonymous> (LabeledBarChart.kt:155)");
                                            }
                                            String label = BarChartValue.this.getLabel();
                                            formatAxisValue2 = LabeledBarChartKt.formatAxisValue(BarChartValue.this.getValue(), str16);
                                            TextKt.m2376Text4IGK_g(label + ": " + formatAxisValue2, PaddingKt.m685paddingVpY3zN4(Modifier.INSTANCE, Dp.m6303constructorimpl(10), Dp.m6303constructorimpl(5)), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getInverseOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelMedium(), composer3, 48, 0, 65528);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composer2, 54), composer2, 12582912, MenuKt.InTransitionDuration);
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Modifier m688paddingqDBjuR0$default = PaddingKt.m688paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(f + Dp.m6303constructorimpl(f2)), 0.0f, 0.0f, 0.0f, 14, null);
                            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), composer2, 6);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str6);
                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, m688paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str7);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor5);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3336constructorimpl5 = Updater.m3336constructorimpl(composer2);
                            Updater.m3343setimpl(m3336constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl5.getInserting() || !Intrinsics.areEqual(m3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                m3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                m3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            Updater.m3343setimpl(m3336constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            composer2.startReplaceGroup(713445314);
                            Iterator<T> it3 = list.iterator();
                            while (it3.hasNext()) {
                                TextKt.m2376Text4IGK_g(((BarChartValue) it3.next()).getLabel(), RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6185boximpl(TextAlign.INSTANCE.m6192getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m6242getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, 0, 3120, 54776);
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            int size2 = list2.size();
                            int LabeledVerticalBarChart$lambda$32 = LabeledVerticalBarChart$lambda$3(mutableIntState);
                            TextKt.m2376Text4IGK_g((LabeledVerticalBarChart$lambda$32 < 0 || LabeledVerticalBarChart$lambda$32 >= size2) ? "Tap a bar for details" : "Tap another bar to dismiss", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str9 = str12;
                            modifier5 = modifier3;
                            function25 = function24;
                            str10 = str8;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier5 = modifier2;
                            str10 = str3;
                            str9 = str4;
                            function25 = function22;
                            composer2 = startRestartGroup;
                        }
                        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
                        if (endRestartGroup2 != null) {
                            endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.components.LabeledBarChartKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit LabeledVerticalBarChart$lambda$17;
                                    LabeledVerticalBarChart$lambda$17 = LabeledBarChartKt.LabeledVerticalBarChart$lambda$17(bars, modifier5, str10, str9, function25, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return LabeledVerticalBarChart$lambda$17;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function22 = function2;
                    if ((i3 & 9363) == 9362) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(763014170);
                    if (bars.isEmpty()) {
                    }
                }
                str4 = str2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function22 = function2;
                if ((i3 & 9363) == 9362) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(763014170);
                if (bars.isEmpty()) {
                }
            }
            str3 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str4 = str2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function22 = function2;
            if ((i3 & 9363) == 9362) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(763014170);
            if (bars.isEmpty()) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str3 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str4 = str2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function22 = function2;
        if ((i3 & 9363) == 9362) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(763014170);
        if (bars.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LabeledVerticalBarChart$lambda$3(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LabeledVerticalBarChart$lambda$16$lambda$13$lambda$12$lambda$11$lambda$10(List list, List list2, long j, double d, long j2, long j3, long j4, MutableIntState mutableIntState, DrawScope Canvas) {
        float f;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float m3668getHeightimpl = Size.m3668getHeightimpl(Canvas.mo4399getSizeNHjbRc()) * 0.92f;
        float m3668getHeightimpl2 = Size.m3668getHeightimpl(Canvas.mo4399getSizeNHjbRc()) - 2.0f;
        float m3671getWidthimpl = Size.m3671getWidthimpl(Canvas.mo4399getSizeNHjbRc()) / list.size();
        float f2 = m3671getWidthimpl * 0.52f;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            float doubleValue = m3668getHeightimpl2 - ((float) ((((Number) it.next()).doubleValue() / d) * m3668getHeightimpl));
            DrawScope.m4385drawLineNGM6Ib0$default(Canvas, Color.m3842copywmQWz5c$default(j, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset(0.0f, doubleValue), OffsetKt.Offset(Size.m3671getWidthimpl(Canvas.mo4399getSizeNHjbRc()), doubleValue), 1.0f, 0, null, 0.0f, null, 0, 496, null);
            f2 = f2;
            m3668getHeightimpl2 = m3668getHeightimpl2;
        }
        float f3 = f2;
        float f4 = m3668getHeightimpl2;
        DrawScope.m4385drawLineNGM6Ib0$default(Canvas, Color.m3842copywmQWz5c$default(j, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset(0.0f, f4), OffsetKt.Offset(Size.m3671getWidthimpl(Canvas.mo4399getSizeNHjbRc()), f4), 1.5f, 0, null, 0.0f, null, 0, 496, null);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BarChartValue barChartValue = (BarChartValue) obj;
            float f5 = f3;
            float f6 = (i * m3671getWidthimpl) + ((m3671getWidthimpl - f5) / 2.0f);
            boolean z = i == LabeledVerticalBarChart$lambda$3(mutableIntState);
            if (barChartValue.getValue() <= 0.0d) {
                DrawScope.m4395drawRoundRectuAw5IA$default(Canvas, j2, OffsetKt.Offset(f6, f4 - 4.0f), androidx.compose.ui.geometry.SizeKt.Size(f5, 4.0f), CornerRadiusKt.CornerRadius(2.0f, 2.0f), null, 0.0f, null, 0, 240, null);
                f = f5;
            } else {
                float coerceAtLeast = RangesKt.coerceAtLeast((float) ((barChartValue.getValue() / d) * m3668getHeightimpl), 8.0f);
                f = f5;
                DrawScope.m4395drawRoundRectuAw5IA$default(Canvas, z ? j3 : j4, OffsetKt.Offset(f6, f4 - coerceAtLeast), androidx.compose.ui.geometry.SizeKt.Size(f5, coerceAtLeast), CornerRadiusKt.CornerRadius(6.0f, 6.0f), null, 0.0f, null, 0, 240, null);
            }
            i = i2;
            f3 = f;
        }
        return Unit.INSTANCE;
    }

    private static final double niceCeil(double d) {
        if (d <= 10.0d) {
            return 10.0d;
        }
        double coerceAtLeast = RangesKt.coerceAtLeast(Math.pow(10.0d, Math.floor(Math.log10(d))), 1.0d);
        return Math.ceil(d / coerceAtLeast) * coerceAtLeast;
    }

    private static final List<Double> yAxisTicks(double d, int i) {
        double d2 = d / i;
        IntRange intRange = new IntRange(0, i);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((IntIterator) it).nextInt() * d2));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatAxisValue(double d, String str) {
        if (d >= 1000.0d) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%.0fk", Arrays.copyOf(new Object[]{Double.valueOf(d / 1000.0d)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        if (Intrinsics.areEqual(str, "kg")) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            return format2;
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String format3 = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
        return format3;
    }
}
