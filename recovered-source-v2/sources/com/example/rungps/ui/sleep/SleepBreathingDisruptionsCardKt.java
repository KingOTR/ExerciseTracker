package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepAnalyticsCompact;
import com.example.rungps.sleep.SleepBreathingDisruptionAnalyzer;
import com.example.rungps.sleep.SleepEventMarkersEncoder;
import com.example.rungps.sleep.SleepMinuteEvent;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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

/* compiled from: SleepBreathingDisruptionsCard.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"SleepBreathingDisruptionsCard", "", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "modifier", "Landroidx/compose/ui/Modifier;", "premiumLocked", "", "(Lcom/example/rungps/data/SleepEntryEntity;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "LegendDot", "color", "Landroidx/compose/ui/graphics/Color;", "label", "", "LegendDot-Iv8Zu3U", "(JLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "selectedMinute", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepBreathingDisruptionsCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegendDot_Iv8Zu3U$lambda$15(long j, String str, int i, Composer composer, int i2) {
        m7554LegendDotIv8Zu3U(j, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepBreathingDisruptionsCard$lambda$13(SleepEntryEntity sleepEntryEntity, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        SleepBreathingDisruptionsCard(sleepEntryEntity, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepBreathingDisruptionsCard$lambda$4(SleepEntryEntity sleepEntryEntity, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        SleepBreathingDisruptionsCard(sleepEntryEntity, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepBreathingDisruptionsCard(final SleepEntryEntity entry, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean changed;
        Object rememberedValue;
        List list;
        boolean changed2;
        Object rememberedValue2;
        boolean changed3;
        ArrayList rememberedValue3;
        boolean z2;
        int i4;
        int i5;
        Integer num;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Composer startRestartGroup = composer.startRestartGroup(-861192740);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (startRestartGroup.changedInstance(entry) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                boolean z4 = (i2 & 4) == 0 ? false : z;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-861192740, i3, -1, "com.example.rungps.ui.sleep.SleepBreathingDisruptionsCard (SleepBreathingDisruptionsCard.kt:59)");
                }
                long id = entry.getId();
                Object eventMarkersCompact = entry.getEventMarkersCompact();
                Object hypnogramCompact = entry.getHypnogramCompact();
                Object snoreEvents = entry.getSnoreEvents();
                startRestartGroup.startReplaceGroup(-1343013040);
                changed = startRestartGroup.changed(id) | startRestartGroup.changed(eventMarkersCompact) | startRestartGroup.changed(hypnogramCompact) | startRestartGroup.changed(snoreEvents);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SleepEventMarkersEncoder.INSTANCE.resolve(entry.getEventMarkersCompact(), entry.getHypnogramCompact(), entry.getSnoreEvents());
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                list = (List) rememberedValue;
                startRestartGroup.endReplaceGroup();
                Object sleepAnalyticsJson = entry.getSleepAnalyticsJson();
                startRestartGroup.startReplaceGroup(-1343004347);
                changed2 = startRestartGroup.changed(sleepAnalyticsJson);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    SleepAnalyticsCompact parse = SleepAnalyticsCompact.INSTANCE.parse(entry.getSleepAnalyticsJson());
                    rememberedValue2 = parse == null ? parse.getBreathing() : null;
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                SleepBreathingDisruptionAnalyzer.NightMetrics nightMetrics = (SleepBreathingDisruptionAnalyzer.NightMetrics) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1342999734);
                changed3 = startRestartGroup.changed(list);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        SleepMinuteEvent sleepMinuteEvent = (SleepMinuteEvent) obj;
                        if (sleepMinuteEvent.getSnore() || sleepMinuteEvent.getTalk() || sleepMinuteEvent.getBreathPause()) {
                            arrayList.add(obj);
                        }
                    }
                    rememberedValue3 = arrayList;
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                List list2 = (List) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                z2 = list2.isEmpty() || nightMetrics != null;
                startRestartGroup.startReplaceGroup(-1342994345);
                if (z2) {
                    TextKt.m2376Text4IGK_g("No breathing disruptions detected this night.", PaddingKt.m688paddingqDBjuR0$default(modifier4, 0.0f, Dp.m6303constructorimpl(2), 0.0f, 0.0f, 13, null), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 6, 0, 65528);
                    startRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final Modifier modifier5 = modifier4;
                        final boolean z5 = z4;
                        endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit SleepBreathingDisruptionsCard$lambda$4;
                                SleepBreathingDisruptionsCard$lambda$4 = SleepBreathingDisruptionsCardKt.SleepBreathingDisruptionsCard$lambda$4(SleepEntryEntity.this, modifier5, z5, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                return SleepBreathingDisruptionsCard$lambda$4;
                            }
                        });
                        return;
                    }
                    return;
                }
                startRestartGroup.endReplaceGroup();
                long startTimeMs = entry.getStartTimeMs();
                long endTimeMs = entry.getEndTimeMs();
                startRestartGroup.startReplaceGroup(-1342984327);
                boolean changed4 = startRestartGroup.changed(startTimeMs) | startRestartGroup.changed(endTimeMs);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = Integer.valueOf(RangesKt.coerceIn((int) ((entry.getEndTimeMs() - entry.getStartTimeMs()) / 60000), 1, 900));
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                int intValue = ((Number) rememberedValue4).intValue();
                startRestartGroup.endReplaceGroup();
                List list3 = list2;
                boolean z6 = list3 instanceof Collection;
                if (z6 && list3.isEmpty()) {
                    i4 = 0;
                } else {
                    Iterator it = list3.iterator();
                    int i7 = 0;
                    while (it.hasNext()) {
                        if (((SleepMinuteEvent) it.next()).getSnore() && (i7 = i7 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                    i4 = i7;
                }
                if (z6 && list3.isEmpty()) {
                    i5 = 0;
                } else {
                    Iterator it2 = list3.iterator();
                    int i8 = 0;
                    while (it2.hasNext()) {
                        if (((SleepMinuteEvent) it2.next()).getTalk() && (i8 = i8 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                    i5 = i8;
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                ZoneId systemDefault = ZoneId.systemDefault();
                DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("h:mm a");
                ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                long m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(colorScheme.getError(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null);
                long m3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(colorScheme.getPrimary(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
                long id2 = entry.getId();
                startRestartGroup.startReplaceGroup(-1342966549);
                boolean changed5 = startRestartGroup.changed(id2) | startRestartGroup.changed(intValue);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                MutableIntState mutableIntState = (MutableIntState) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                Integer valueOf = Integer.valueOf(intValue);
                startRestartGroup.startReplaceGroup(-1342962853);
                boolean changedInstance = startRestartGroup.changedInstance(list2) | startRestartGroup.changedInstance(list) | startRestartGroup.changed(mutableIntState) | startRestartGroup.changed(intValue);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    num = valueOf;
                    rememberedValue6 = (Function2) new SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$2$1(list2, list, intValue, mutableIntState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                } else {
                    num = valueOf;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(list2, num, (Function2) rememberedValue6, startRestartGroup, 0);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
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
                Modifier modifier6 = modifier4;
                composer2 = startRestartGroup;
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(12)), CardDefaults.INSTANCE.m1511cardColorsro_MJ88(colorScheme.getSurfaceContainerHigh(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1869154572, true, new SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1(nightMetrics, colorScheme, intValue, list2, mutableIntState, m3842copywmQWz5c$default, m3842copywmQWz5c$default2, list, entry, systemDefault, ofPattern, i4, i5, context), composer2, 54), composer2, 196614, 24);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
                z3 = z4;
            } else {
                startRestartGroup.skipToGroupEnd();
                z3 = z;
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
            if (endRestartGroup2 != null) {
                endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit SleepBreathingDisruptionsCard$lambda$13;
                        SleepBreathingDisruptionsCard$lambda$13 = SleepBreathingDisruptionsCardKt.SleepBreathingDisruptionsCard$lambda$13(SleepEntryEntity.this, modifier3, z3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return SleepBreathingDisruptionsCard$lambda$13;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        long id3 = entry.getId();
        Object eventMarkersCompact2 = entry.getEventMarkersCompact();
        Object hypnogramCompact2 = entry.getHypnogramCompact();
        Object snoreEvents2 = entry.getSnoreEvents();
        startRestartGroup.startReplaceGroup(-1343013040);
        changed = startRestartGroup.changed(id3) | startRestartGroup.changed(eventMarkersCompact2) | startRestartGroup.changed(hypnogramCompact2) | startRestartGroup.changed(snoreEvents2);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = SleepEventMarkersEncoder.INSTANCE.resolve(entry.getEventMarkersCompact(), entry.getHypnogramCompact(), entry.getSnoreEvents());
        startRestartGroup.updateRememberedValue(rememberedValue);
        list = (List) rememberedValue;
        startRestartGroup.endReplaceGroup();
        Object sleepAnalyticsJson2 = entry.getSleepAnalyticsJson();
        startRestartGroup.startReplaceGroup(-1343004347);
        changed2 = startRestartGroup.changed(sleepAnalyticsJson2);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        SleepAnalyticsCompact parse2 = SleepAnalyticsCompact.INSTANCE.parse(entry.getSleepAnalyticsJson());
        if (parse2 == null) {
        }
        startRestartGroup.updateRememberedValue(rememberedValue2);
        SleepBreathingDisruptionAnalyzer.NightMetrics nightMetrics2 = (SleepBreathingDisruptionAnalyzer.NightMetrics) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1342999734);
        changed3 = startRestartGroup.changed(list);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r1.hasNext()) {
        }
        rememberedValue3 = arrayList2;
        startRestartGroup.updateRememberedValue(rememberedValue3);
        List list22 = (List) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        if (list22.isEmpty()) {
        }
        startRestartGroup.startReplaceGroup(-1342994345);
        if (z2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SleepBreathingDisruptionsCard$lambda$9(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LegendDot-Iv8Zu3U, reason: not valid java name */
    public static final void m7554LegendDotIv8Zu3U(final long j, String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final String str2;
        Composer startRestartGroup = composer.startRestartGroup(1109826488);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1109826488, i3, -1, "com.example.rungps.ui.sleep.LegendDot (SleepBreathingDisruptionsCard.kt:298)");
            }
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, centerVertically, startRestartGroup, 54);
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
            SurfaceKt.m2226SurfaceT9BRK9s(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(10)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(999)), j, 0L, 0.0f, 0.0f, null, ComposableSingletons$SleepBreathingDisruptionsCardKt.INSTANCE.m7487getLambda1$app_sideload(), startRestartGroup, ((i3 << 6) & 896) | 12582918, MenuKt.InTransitionDuration);
            composer2 = startRestartGroup;
            str2 = str;
            TextKt.m2376Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, (i3 >> 3) & 14, 0, 65534);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
            str2 = str;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LegendDot_Iv8Zu3U$lambda$15;
                    LegendDot_Iv8Zu3U$lambda$15 = SleepBreathingDisruptionsCardKt.LegendDot_Iv8Zu3U$lambda$15(j, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return LegendDot_Iv8Zu3U$lambda$15;
                }
            });
        }
    }
}
