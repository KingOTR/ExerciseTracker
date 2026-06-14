package com.example.rungps.ui.sleep;

import android.view.MotionEvent;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepEventMarkersEncoder;
import com.example.rungps.sleep.SleepMinuteEvent;
import com.example.rungps.sleep.SleepSoundKinds;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepDisturbanceTimeline.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"SleepDisturbanceTimeline", "", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/rungps/data/SleepEntryEntity;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LegendDot", "color", "Landroidx/compose/ui/graphics/Color;", "label", "", "LegendDot-Iv8Zu3U", "(JLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "selectedIndex", "", "scrubbing", "", "timelineWidthPx", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepDisturbanceTimelineKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegendDot_Iv8Zu3U$lambda$29(long j, String str, int i, Composer composer, int i2) {
        m7560LegendDotIv8Zu3U(j, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepDisturbanceTimeline$lambda$2(SleepEntryEntity sleepEntryEntity, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepDisturbanceTimeline(sleepEntryEntity, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepDisturbanceTimeline$lambda$25(SleepEntryEntity sleepEntryEntity, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepDisturbanceTimeline(sleepEntryEntity, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x054d, code lost:
    
        if (r12 != null) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepDisturbanceTimeline(final SleepEntryEntity sleepEntryEntity, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        boolean changed;
        Object rememberedValue;
        List list;
        Iterator it;
        final MutableState mutableState;
        final MutableState mutableState2;
        Object obj;
        Composer composer2;
        String label;
        ScopeUpdateScope endRestartGroup;
        SleepEntryEntity entry = sleepEntryEntity;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Composer startRestartGroup = composer.startRestartGroup(353744808);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(entry) ? 4 : 2) | i;
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
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(353744808, i3, -1, "com.example.rungps.ui.sleep.SleepDisturbanceTimeline (SleepDisturbanceTimeline.kt:42)");
                }
                long id = sleepEntryEntity.getId();
                String eventMarkersCompact = sleepEntryEntity.getEventMarkersCompact();
                String hypnogramCompact = sleepEntryEntity.getHypnogramCompact();
                startRestartGroup.startReplaceGroup(-1632863178);
                changed = startRestartGroup.changed(id) | startRestartGroup.changed(eventMarkersCompact) | startRestartGroup.changed(hypnogramCompact);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SleepEventMarkersEncoder.INSTANCE.resolve(sleepEntryEntity.getEventMarkersCompact(), sleepEntryEntity.getHypnogramCompact(), sleepEntryEntity.getSnoreEvents());
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final List list2 = (List) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1632855481);
                list = list2;
                if ((list instanceof Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (((SleepMinuteEvent) it.next()).getHasMarker()) {
                            startRestartGroup.endReplaceGroup();
                            ZoneId systemDefault = ZoneId.systemDefault();
                            DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("h:mm a");
                            long startTimeMs = sleepEntryEntity.getStartTimeMs();
                            long startTimeMs2 = sleepEntryEntity.getStartTimeMs();
                            long endTimeMs = sleepEntryEntity.getEndTimeMs();
                            startRestartGroup.startReplaceGroup(-1632842734);
                            boolean changed2 = startRestartGroup.changed(startTimeMs2) | startRestartGroup.changed(endTimeMs);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = Integer.valueOf(RangesKt.coerceIn((int) ((sleepEntryEntity.getEndTimeMs() - sleepEntryEntity.getStartTimeMs()) / 60000), 1, 900));
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final int intValue = ((Number) rememberedValue2).intValue();
                            startRestartGroup.endReplaceGroup();
                            final ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                            final long m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(colorScheme.getError(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
                            final long tertiary = colorScheme.getTertiary();
                            final long m3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(colorScheme.getPrimary(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                            startRestartGroup.startReplaceGroup(-1632831659);
                            boolean changed3 = startRestartGroup.changed(list2);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(-1);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            final MutableIntState mutableIntState = (MutableIntState) rememberedValue3;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-1632829619);
                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            MutableState mutableState3 = (MutableState) rememberedValue4;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-1632827638);
                            Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            MutableState mutableState4 = (MutableState) rememberedValue5;
                            startRestartGroup.endReplaceGroup();
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            Modifier modifier4 = modifier3;
                            float f = 6;
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
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
                            Composer composer3 = startRestartGroup;
                            TextKt.m2376Text4IGK_g("Disturbances", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelLarge(), composer3, 6, 0, 65534);
                            TextKt.m2376Text4IGK_g("Cough, environment, snore, movement — wellness timeline only", (Modifier) null, colorScheme.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer3, 6, 0, 65530);
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer3, 6);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            m7560LegendDotIv8Zu3U(m3842copywmQWz5c$default, "Snore", composer3, 48);
                            m7560LegendDotIv8Zu3U(tertiary, "Movement", composer3, 48);
                            m7560LegendDotIv8Zu3U(m3842copywmQWz5c$default2, "Voice", composer3, 48);
                            m7560LegendDotIv8Zu3U(colorScheme.getSecondary(), "Cough", composer3, 48);
                            m7560LegendDotIv8Zu3U(colorScheme.getOutline(), "Environment", composer3, 48);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Modifier m238backgroundbw27NRU = BackgroundKt.m238backgroundbw27NRU(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(48)), colorScheme.getSurfaceContainerHigh(), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(f)));
                            composer3.startReplaceGroup(-1656734172);
                            Object rememberedValue6 = composer3.rememberedValue();
                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                mutableState = mutableState4;
                                rememberedValue6 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepDisturbanceTimelineKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        Unit SleepDisturbanceTimeline$lambda$24$lambda$15$lambda$14;
                                        SleepDisturbanceTimeline$lambda$24$lambda$15$lambda$14 = SleepDisturbanceTimelineKt.SleepDisturbanceTimeline$lambda$24$lambda$15$lambda$14(MutableState.this, (IntSize) obj2);
                                        return SleepDisturbanceTimeline$lambda$24$lambda$15$lambda$14;
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue6);
                            } else {
                                mutableState = mutableState4;
                            }
                            composer3.endReplaceGroup();
                            Modifier sleepTimelineScrubGuard = SleepChartGesturesKt.sleepTimelineScrubGuard(OnRemeasuredModifierKt.onSizeChanged(m238backgroundbw27NRU, (Function1) rememberedValue6), composer3, 0);
                            composer3.startReplaceGroup(-1656728714);
                            boolean changed4 = composer3.changed(mutableIntState) | composer3.changed(intValue);
                            Object rememberedValue7 = composer3.rememberedValue();
                            if (changed4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                mutableState2 = mutableState3;
                                rememberedValue7 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepDisturbanceTimelineKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        boolean SleepDisturbanceTimeline$lambda$24$lambda$17$lambda$16;
                                        SleepDisturbanceTimeline$lambda$24$lambda$17$lambda$16 = SleepDisturbanceTimelineKt.SleepDisturbanceTimeline$lambda$24$lambda$17$lambda$16(MutableState.this, intValue, mutableState, mutableIntState, (MotionEvent) obj2);
                                        return Boolean.valueOf(SleepDisturbanceTimeline$lambda$24$lambda$17$lambda$16);
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue7);
                            } else {
                                mutableState2 = mutableState3;
                            }
                            composer3.endReplaceGroup();
                            Modifier pointerInteropFilter$default = PointerInteropFilter_androidKt.pointerInteropFilter$default(sleepTimelineScrubGuard, null, (Function1) rememberedValue7, 1, null);
                            composer3.startReplaceGroup(-1656694865);
                            MutableState mutableState5 = mutableState2;
                            boolean changed5 = composer3.changed(intValue) | composer3.changedInstance(list2) | composer3.changed(m3842copywmQWz5c$default) | composer3.changed(colorScheme) | composer3.changed(tertiary) | composer3.changed(m3842copywmQWz5c$default2) | composer3.changed(mutableIntState);
                            Object rememberedValue8 = composer3.rememberedValue();
                            if (changed5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepDisturbanceTimelineKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        Unit SleepDisturbanceTimeline$lambda$24$lambda$20$lambda$19;
                                        SleepDisturbanceTimeline$lambda$24$lambda$20$lambda$19 = SleepDisturbanceTimelineKt.SleepDisturbanceTimeline$lambda$24$lambda$20$lambda$19(intValue, list2, colorScheme, m3842copywmQWz5c$default, tertiary, m3842copywmQWz5c$default2, mutableIntState, (DrawScope) obj2);
                                        return SleepDisturbanceTimeline$lambda$24$lambda$20$lambda$19;
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue8);
                            }
                            composer3.endReplaceGroup();
                            CanvasKt.Canvas(pointerInteropFilter$default, (Function1) rememberedValue8, composer3, 0);
                            SleepMinuteEvent sleepMinuteEvent = (SleepMinuteEvent) CollectionsKt.getOrNull(list2, RangesKt.coerceIn(SleepDisturbanceTimeline$lambda$5(mutableIntState), 0, RangesKt.coerceAtLeast(CollectionsKt.getLastIndex(list2), 0)));
                            if (sleepMinuteEvent != null) {
                                if (!sleepMinuteEvent.getHasMarker()) {
                                    sleepMinuteEvent = null;
                                }
                            }
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                } else {
                                    obj = it2.next();
                                    if (((SleepMinuteEvent) obj).getHasMarker()) {
                                        break;
                                    }
                                }
                            }
                            sleepMinuteEvent = (SleepMinuteEvent) obj;
                            composer3.startReplaceGroup(-1656645567);
                            if (sleepMinuteEvent == null) {
                                composer2 = composer3;
                            } else {
                                composer3.startReplaceGroup(-1656644833);
                                if (sleepMinuteEvent.getHasMarker()) {
                                    long minuteIndex = startTimeMs + (sleepMinuteEvent.getMinuteIndex() * 60000);
                                    if (sleepMinuteEvent.getSnore()) {
                                        label = SleepSoundKinds.INSTANCE.label("snore");
                                    } else if (sleepMinuteEvent.getCough()) {
                                        label = SleepSoundKinds.INSTANCE.label("cough");
                                    } else if (sleepMinuteEvent.getEnvironment()) {
                                        label = "Environment";
                                    } else if (sleepMinuteEvent.getBreathPause()) {
                                        label = "Breath pause";
                                    } else if (sleepMinuteEvent.getMovement()) {
                                        label = "Movement";
                                    } else {
                                        label = sleepMinuteEvent.getTalk() ? SleepSoundKinds.INSTANCE.label("talk") : "Event";
                                    }
                                    composer2 = composer3;
                                    TextKt.m2376Text4IGK_g(label + " · " + Instant.ofEpochMilli(minuteIndex).atZone(systemDefault).format(ofPattern), (Modifier) null, SleepDisturbanceTimeline$lambda$8(mutableState5) ? colorScheme.getPrimary() : colorScheme.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer2, 0, 0, 65530);
                                } else {
                                    composer2 = composer3;
                                }
                                composer2.endReplaceGroup();
                                Unit unit = Unit.INSTANCE;
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier4;
                        } else {
                            startRestartGroup = startRestartGroup;
                            entry = entry;
                        }
                    }
                }
                final Modifier modifier5 = modifier3;
                Composer composer4 = startRestartGroup;
                TextKt.m2376Text4IGK_g("No disturbances detected this night.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer4, 6, 0, 65530);
                composer4.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                endRestartGroup = composer4.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepDisturbanceTimelineKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit SleepDisturbanceTimeline$lambda$2;
                            SleepDisturbanceTimeline$lambda$2 = SleepDisturbanceTimelineKt.SleepDisturbanceTimeline$lambda$2(SleepEntryEntity.this, modifier5, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            return SleepDisturbanceTimeline$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
            ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
            if (endRestartGroup2 != null) {
                endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepDisturbanceTimelineKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit SleepDisturbanceTimeline$lambda$25;
                        SleepDisturbanceTimeline$lambda$25 = SleepDisturbanceTimelineKt.SleepDisturbanceTimeline$lambda$25(SleepEntryEntity.this, modifier2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return SleepDisturbanceTimeline$lambda$25;
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
        long id2 = sleepEntryEntity.getId();
        String eventMarkersCompact2 = sleepEntryEntity.getEventMarkersCompact();
        String hypnogramCompact2 = sleepEntryEntity.getHypnogramCompact();
        startRestartGroup.startReplaceGroup(-1632863178);
        changed = startRestartGroup.changed(id2) | startRestartGroup.changed(eventMarkersCompact2) | startRestartGroup.changed(hypnogramCompact2);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = SleepEventMarkersEncoder.INSTANCE.resolve(sleepEntryEntity.getEventMarkersCompact(), sleepEntryEntity.getHypnogramCompact(), sleepEntryEntity.getSnoreEvents());
        startRestartGroup.updateRememberedValue(rememberedValue);
        final List list22 = (List) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1632855481);
        list = list22;
        if (list instanceof Collection) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        final Modifier modifier52 = modifier3;
        Composer composer42 = startRestartGroup;
        TextKt.m2376Text4IGK_g("No disturbances detected this night.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer42, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer42, MaterialTheme.$stable).getBodySmall(), composer42, 6, 0, 65530);
        composer42.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = composer42.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final int SleepDisturbanceTimeline$lambda$5(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final boolean SleepDisturbanceTimeline$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SleepDisturbanceTimeline$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final float SleepDisturbanceTimeline$lambda$11(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    private static final void SleepDisturbanceTimeline$lambda$12(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepDisturbanceTimeline$lambda$24$lambda$15$lambda$14(MutableState mutableState, IntSize intSize) {
        SleepDisturbanceTimeline$lambda$12(mutableState, RangesKt.coerceAtLeast(IntSize.m6473getWidthimpl(intSize.getPackedValue()), 1.0f));
        return Unit.INSTANCE;
    }

    private static final void SleepDisturbanceTimeline$lambda$24$lambda$17$lambda$16$selectAt(int i, MutableState<Float> mutableState, MutableIntState mutableIntState, float f) {
        int i2 = i - 1;
        mutableIntState.setIntValue(RangesKt.coerceIn((int) (RangesKt.coerceIn(f / SleepDisturbanceTimeline$lambda$11(mutableState), 0.0f, 1.0f) * i2), 0, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepDisturbanceTimeline$lambda$24$lambda$17$lambda$16(MutableState mutableState, int i, MutableState mutableState2, MutableIntState mutableIntState, MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            SleepDisturbanceTimeline$lambda$9(mutableState, true);
            SleepDisturbanceTimeline$lambda$24$lambda$17$lambda$16$selectAt(i, mutableState2, mutableIntState, ev.getX());
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                SleepDisturbanceTimeline$lambda$9(mutableState, true);
                SleepDisturbanceTimeline$lambda$24$lambda$17$lambda$16$selectAt(i, mutableState2, mutableIntState, ev.getX());
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        SleepDisturbanceTimeline$lambda$9(mutableState, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepDisturbanceTimeline$lambda$24$lambda$20$lambda$19(int i, List list, ColorScheme colorScheme, long j, long j2, long j3, MutableIntState mutableIntState, DrawScope Canvas) {
        int i2;
        boolean z;
        long outline;
        long j4;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float m3671getWidthimpl = Size.m3671getWidthimpl(Canvas.mo4399getSizeNHjbRc());
        float m3668getHeightimpl = Size.m3668getHeightimpl(Canvas.mo4399getSizeNHjbRc());
        boolean z2 = true;
        int coerceAtLeast = RangesKt.coerceAtLeast(i, 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SleepMinuteEvent sleepMinuteEvent = (SleepMinuteEvent) it.next();
            if (sleepMinuteEvent.getHasMarker()) {
                int coerceIn = RangesKt.coerceIn(sleepMinuteEvent.getMinuteIndex(), 0, coerceAtLeast - 1);
                float f = ((coerceIn + 0.5f) / coerceAtLeast) * m3671getWidthimpl;
                if (sleepMinuteEvent.getSnore()) {
                    j4 = j;
                } else {
                    if (sleepMinuteEvent.getCough()) {
                        outline = colorScheme.getSecondary();
                    } else if (sleepMinuteEvent.getEnvironment()) {
                        outline = colorScheme.getOutline();
                    } else if (sleepMinuteEvent.getBreathPause()) {
                        outline = colorScheme.getTertiary();
                    } else if (sleepMinuteEvent.getMovement()) {
                        j4 = j2;
                    } else if (sleepMinuteEvent.getTalk()) {
                        j4 = j3;
                    } else {
                        outline = colorScheme.getOutline();
                    }
                    j4 = outline;
                }
                boolean z3 = coerceIn == SleepDisturbanceTimeline$lambda$5(mutableIntState) ? z2 : false;
                i2 = coerceAtLeast;
                z = z2;
                DrawScope.m4393drawRectnJ9OG0$default(Canvas, j4, OffsetKt.Offset(f - (z3 ? 4.0f : 2.0f), 0.12f * m3668getHeightimpl), androidx.compose.ui.geometry.SizeKt.Size(z3 ? 8.0f : 4.0f, 0.76f * m3668getHeightimpl), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
            } else {
                i2 = coerceAtLeast;
                z = z2;
            }
            z2 = z;
            coerceAtLeast = i2;
        }
        int i3 = coerceAtLeast;
        int SleepDisturbanceTimeline$lambda$5 = SleepDisturbanceTimeline$lambda$5(mutableIntState);
        if (SleepDisturbanceTimeline$lambda$5 >= 0 && SleepDisturbanceTimeline$lambda$5 < i3) {
            float SleepDisturbanceTimeline$lambda$52 = ((SleepDisturbanceTimeline$lambda$5(mutableIntState) + 0.5f) / i3) * m3671getWidthimpl;
            DrawScope.m4385drawLineNGM6Ib0$default(Canvas, colorScheme.getOnSurface(), OffsetKt.Offset(SleepDisturbanceTimeline$lambda$52, 0.0f), OffsetKt.Offset(SleepDisturbanceTimeline$lambda$52, m3668getHeightimpl), 2.0f, 0, null, 0.0f, null, 0, 496, null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: LegendDot-Iv8Zu3U, reason: not valid java name */
    private static final void m7560LegendDotIv8Zu3U(final long j, final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1673559161);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1673559161, i2, -1, "com.example.rungps.ui.sleep.LegendDot (SleepDisturbanceTimeline.kt:180)");
            }
            float f = 4;
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier m688paddingqDBjuR0$default = PaddingKt.m688paddingqDBjuR0$default(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(12)), 0.0f, Dp.m6303constructorimpl(f), 0.0f, 0.0f, 13, null);
            startRestartGroup.startReplaceGroup(1697985311);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.example.rungps.ui.sleep.SleepDisturbanceTimelineKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit LegendDot_Iv8Zu3U$lambda$28$lambda$27$lambda$26;
                        LegendDot_Iv8Zu3U$lambda$28$lambda$27$lambda$26 = SleepDisturbanceTimelineKt.LegendDot_Iv8Zu3U$lambda$28$lambda$27$lambda$26(j, (DrawScope) obj);
                        return LegendDot_Iv8Zu3U$lambda$28$lambda$27$lambda$26;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(m688paddingqDBjuR0$default, (Function1) rememberedValue, startRestartGroup, 6);
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), composer2, (i2 >> 3) & 14, 0, 65534);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepDisturbanceTimelineKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LegendDot_Iv8Zu3U$lambda$29;
                    LegendDot_Iv8Zu3U$lambda$29 = SleepDisturbanceTimelineKt.LegendDot_Iv8Zu3U$lambda$29(j, str, i, (Composer) obj, ((Integer) obj2).intValue());
                    return LegendDot_Iv8Zu3U$lambda$29;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegendDot_Iv8Zu3U$lambda$28$lambda$27$lambda$26(long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m4380drawCircleVaOC9Bg$default(Canvas, j, 4.0f, OffsetKt.Offset(4.0f, 4.0f), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        return Unit.INSTANCE;
    }
}
