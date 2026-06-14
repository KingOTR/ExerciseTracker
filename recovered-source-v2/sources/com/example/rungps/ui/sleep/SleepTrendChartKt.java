package com.example.rungps.ui.sleep;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.graphics.Color;
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
import androidx.compose.ui.unit.Dp;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.ui.components.UiDimens;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepTrendChart.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"SleepTrendChart", "", "entries", "", "Lcom/example/rungps/data/SleepEntryEntity;", "modifier", "Landroidx/compose/ui/Modifier;", "nights", "", "(Ljava/util/List;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "app_sideload", "activeIdx"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepTrendChartKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTrendChart$lambda$14(List list, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        SleepTrendChart(list, modifier, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTrendChart$lambda$3(List list, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        SleepTrendChart(list, modifier, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepTrendChart(final List<SleepEntryEntity> entries, Modifier modifier, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        List list;
        Modifier modifier3;
        final int i8;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Composer startRestartGroup = composer.startRestartGroup(327102543);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(entries) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 256 : 128;
                if ((i4 & 147) == 146 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                    i7 = i5 != 0 ? 14 : i6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(327102543, i4, -1, "com.example.rungps.ui.sleep.SleepTrendChart (SleepTrendChart.kt:40)");
                    }
                    final ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                    ZoneId systemDefault = ZoneId.systemDefault();
                    startRestartGroup.startReplaceGroup(-743939071);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = DateTimeFormatter.ofPattern("MMM d", Locale.US);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-743936579);
                    changed = ((i4 & 896) == 256) | startRestartGroup.changed(entries);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = CollectionsKt.takeLast(CollectionsKt.sortedWith(entries, new Comparator() { // from class: com.example.rungps.ui.sleep.SleepTrendChartKt$SleepTrendChart$lambda$2$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt.compareValues(Long.valueOf(((SleepEntryEntity) t).getStartTimeMs()), Long.valueOf(((SleepEntryEntity) t2).getStartTimeMs()));
                            }
                        }), i7);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    list = (List) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    if (list.isEmpty()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier5 = modifier4;
                            final int i10 = i7;
                            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTrendChartKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SleepTrendChart$lambda$3;
                                    SleepTrendChart$lambda$3 = SleepTrendChartKt.SleepTrendChart$lambda$3(entries, modifier5, i10, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return SleepTrendChart$lambda$3;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    startRestartGroup.startReplaceGroup(-743931182);
                    boolean changed2 = startRestartGroup.changed(list);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int coerceAtLeast = RangesKt.coerceAtLeast(((SleepEntryEntity) it.next()).getTotalSleepMin(), 0);
                        while (it.hasNext()) {
                            int coerceAtLeast2 = RangesKt.coerceAtLeast(((SleepEntryEntity) it.next()).getTotalSleepMin(), 0);
                            if (coerceAtLeast < coerceAtLeast2) {
                                coerceAtLeast = coerceAtLeast2;
                            }
                        }
                        rememberedValue3 = Integer.valueOf(Math.max(1, coerceAtLeast));
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    int intValue = ((Number) rememberedValue3).intValue();
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-743928051);
                    boolean changed3 = startRestartGroup.changed(list);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(-1);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    MutableIntState mutableIntState = (MutableIntState) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    int size = list.size();
                    int SleepTrendChart$lambda$7 = SleepTrendChart$lambda$7(mutableIntState);
                    SleepEntryEntity sleepEntryEntity = (SleepTrendChart$lambda$7 < 0 || SleepTrendChart$lambda$7 >= size) ? null : (SleepEntryEntity) list.get(SleepTrendChart$lambda$7(mutableIntState));
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(UiDimens.INSTANCE.m6991getSpace10D9Ej5fM());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Modifier modifier6 = modifier4;
                    int i11 = i7;
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
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    final SleepEntryEntity sleepEntryEntity2 = sleepEntryEntity;
                    int i12 = intValue;
                    modifier3 = modifier6;
                    TextKt.m2376Text4IGK_g("Sleep trend", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, 196614, 0, 65502);
                    TextKt.m2376Text4IGK_g("Last " + list.size() + " nights", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, 0, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (sleepEntryEntity2 != null) {
                        startRestartGroup.startReplaceGroup(-207086643);
                        final String format = Instant.ofEpochMilli(sleepEntryEntity2.getStartTimeMs()).atZone(systemDefault).toLocalDate().format(dateTimeFormatter);
                        SurfaceKt.m2226SurfaceT9BRK9s(null, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(12)), colorScheme.getSurfaceContainerHigh(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(48573731, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTrendChartKt$SleepTrendChart$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i13) {
                                if ((i13 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(48573731, i13, -1, "com.example.rungps.ui.sleep.SleepTrendChart.<anonymous>.<anonymous> (SleepTrendChart.kt:68)");
                                    }
                                    Modifier m685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), UiDimens.INSTANCE.m6994getSpace16D9Ej5fM(), UiDimens.INSTANCE.m6992getSpace12D9Ej5fM());
                                    Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    String str = format;
                                    SleepEntryEntity sleepEntryEntity3 = sleepEntryEntity2;
                                    ColorScheme colorScheme2 = colorScheme;
                                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically, composer2, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m685paddingVpY3zN4);
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor3);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer2);
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
                                    Intrinsics.checkNotNull(str);
                                    TextKt.m2376Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                                    String formatDurationMinutes = SleepFormattersKt.formatDurationMinutes(sleepEntryEntity3.getTotalSleepMin());
                                    TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium();
                                    TextKt.m2376Text4IGK_g(formatDurationMinutes, (Modifier) null, colorScheme2.getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, titleMedium, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), startRestartGroup, 12582912, 121);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-206043214);
                        TextKt.m2376Text4IGK_g("Tap a bar for exact sleep time", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, 6, 0, 65530);
                        startRestartGroup.endReplaceGroup();
                    }
                    Modifier m685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(BackgroundKt.m238backgroundbw27NRU(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(SdkConfig.SDK_VERSION)), colorScheme.getSurfaceContainerHigh(), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(14))), UiDimens.INSTANCE.m6992getSpace12D9Ej5fM(), UiDimens.INSTANCE.m6992getSpace12D9Ej5fM());
                    startRestartGroup.startReplaceGroup(-699366455);
                    boolean changedInstance = startRestartGroup.changedInstance(list) | startRestartGroup.changed(mutableIntState);
                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = (Function2) new SleepTrendChartKt$SleepTrendChart$2$3$1(list, mutableIntState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(m685paddingVpY3zN4, list, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5);
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(UiDimens.INSTANCE.m7001getSpace8D9Ej5fM());
                    Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, bottom, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, pointerInput);
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
                    Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    long tertiary = colorScheme.getTertiary();
                    startRestartGroup.startReplaceGroup(246735494);
                    int i13 = 0;
                    for (Object obj : list) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        int i15 = i12;
                        float coerceIn = RangesKt.coerceIn(RangesKt.coerceAtLeast(((SleepEntryEntity) obj).getTotalSleepMin(), 0) / i15, 0.0f, 1.0f);
                        boolean z = i13 == SleepTrendChart$lambda$7(mutableIntState);
                        BoxKt.Box(BackgroundKt.m238backgroundbw27NRU(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), Dp.m6303constructorimpl(24 + (72 * coerceIn))), Color.m3842copywmQWz5c$default(z ? colorScheme.getPrimary() : tertiary, z ? 0.95f : 0.75f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(8))), startRestartGroup, 0);
                        i13 = i14;
                        i12 = i15;
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(2)), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i8 = i11;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    i8 = i6;
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 != null) {
                    final Modifier modifier7 = modifier3;
                    endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTrendChartKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit SleepTrendChart$lambda$14;
                            SleepTrendChart$lambda$14 = SleepTrendChartKt.SleepTrendChart$lambda$14(entries, modifier7, i8, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                            return SleepTrendChart$lambda$14;
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            if ((i4 & 147) == 146) {
            }
            if (i9 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final ColorScheme colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
            ZoneId systemDefault2 = ZoneId.systemDefault();
            startRestartGroup.startReplaceGroup(-743939071);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-743936579);
            changed = ((i4 & 896) == 256) | startRestartGroup.changed(entries);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = CollectionsKt.takeLast(CollectionsKt.sortedWith(entries, new Comparator() { // from class: com.example.rungps.ui.sleep.SleepTrendChartKt$SleepTrendChart$lambda$2$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((SleepEntryEntity) t).getStartTimeMs()), Long.valueOf(((SleepEntryEntity) t2).getStartTimeMs()));
                }
            }), i7);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            list = (List) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            if (list.isEmpty()) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i;
        if ((i4 & 147) == 146) {
        }
        if (i9 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        final ColorScheme colorScheme22 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
        ZoneId systemDefault22 = ZoneId.systemDefault();
        startRestartGroup.startReplaceGroup(-743939071);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        DateTimeFormatter dateTimeFormatter22 = (DateTimeFormatter) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-743936579);
        changed = ((i4 & 896) == 256) | startRestartGroup.changed(entries);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = CollectionsKt.takeLast(CollectionsKt.sortedWith(entries, new Comparator() { // from class: com.example.rungps.ui.sleep.SleepTrendChartKt$SleepTrendChart$lambda$2$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SleepEntryEntity) t).getStartTimeMs()), Long.valueOf(((SleepEntryEntity) t2).getStartTimeMs()));
            }
        }), i7);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        list = (List) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        if (list.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SleepTrendChart$lambda$7(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }
}
