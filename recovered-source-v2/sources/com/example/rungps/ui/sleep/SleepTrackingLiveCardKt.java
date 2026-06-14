package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import com.example.rungps.sleep.SleepTrackSample;
import com.example.rungps.sleep.SleepTrackingLiveStats;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepTrackingLiveCard.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002"}, d2 = {"SleepTrackingLiveCard", "", "live", "Lcom/example/rungps/sleep/SleepTrackingLiveStats$Live;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/rungps/sleep/SleepTrackingLiveStats$Live;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "samples", "", "Lcom/example/rungps/sleep/SleepTrackSample;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepTrackingLiveCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTrackingLiveCard$lambda$13(SleepTrackingLiveStats.Live live, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepTrackingLiveCard(live, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0819  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepTrackingLiveCard(final SleepTrackingLiveStats.Live live, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean changedInstance;
        SleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1 rememberedValue;
        State produceState;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        boolean changed;
        Object rememberedValue2;
        List<SleepTrackSample> SleepTrackingLiveCard$lambda$1;
        Iterator<T> it;
        int i5;
        boolean booleanValue;
        Composer composer2;
        Composer composer3;
        Composer composer4;
        Composer composer5;
        int currentCompositeKeyHash2;
        Composer m3336constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m3336constructorimpl3;
        boolean z;
        Object rememberedValue3;
        int currentCompositeKeyHash4;
        Composer m3336constructorimpl4;
        boolean z2;
        Object rememberedValue4;
        Composer composer6;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(live, "live");
        Composer startRestartGroup = composer.startRestartGroup(-777198404);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(live) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i3;
            if ((i4 & 19) == 18 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-777198404, i4, -1, "com.example.rungps.ui.sleep.SleepTrackingLiveCard (SleepTrackingLiveCard.kt:26)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                List emptyList = CollectionsKt.emptyList();
                Integer valueOf = Integer.valueOf(live.getTrackedMin());
                startRestartGroup.startReplaceGroup(510948274);
                changedInstance = startRestartGroup.changedInstance(context);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new SleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1(context, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                produceState = SnapshotStateKt.produceState(emptyList, valueOf, (Function2<? super ProduceStateScope<List>, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifier4 = modifier3;
                TextKt.m2376Text4IGK_g("Live tracking", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, 196614, 0, 65502);
                TextKt.m2376Text4IGK_g(live.getStageHint(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodyMedium(), startRestartGroup, 0, 0, 65530);
                StringBuilder sb = new StringBuilder();
                sb.append(live.getTrackedMin() + " min tracked");
                sb.append(" · mic " + live.getMicCoveragePercent() + "%");
                if (live.getAsleepPercent() > 0) {
                    sb.append(" · asleep ~" + live.getAsleepPercent() + "%");
                }
                if (live.getConfidencePercent() > 0) {
                    sb.append(" · conf " + live.getConfidencePercent() + "%");
                }
                sb.append(" · quiet " + live.getQuietPercent() + "%");
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                TextKt.m2376Text4IGK_g(sb2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 0, 0, 65530);
                List<SleepTrackSample> SleepTrackingLiveCard$lambda$12 = SleepTrackingLiveCard$lambda$1(produceState);
                startRestartGroup.startReplaceGroup(-793896223);
                changed = startRestartGroup.changed(SleepTrackingLiveCard$lambda$12);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    SleepTrackingLiveCard$lambda$1 = SleepTrackingLiveCard$lambda$1(produceState);
                    if ((SleepTrackingLiveCard$lambda$1 instanceof Collection) || !SleepTrackingLiveCard$lambda$1.isEmpty()) {
                        it = SleepTrackingLiveCard$lambda$1.iterator();
                        i5 = 0;
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual((Object) ((SleepTrackSample) it.next()).getAudioQualityOk(), (Object) true) && (i5 = i5 + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    } else {
                        i5 = 0;
                    }
                    rememberedValue2 = Boolean.valueOf(!SleepTrackingLiveCard$lambda$1(produceState).isEmpty() || ((float) i5) / ((float) SleepTrackingLiveCard$lambda$1(produceState).size()) >= 0.7f);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                booleanValue = ((Boolean) rememberedValue2).booleanValue();
                startRestartGroup.endReplaceGroup();
                if (live.getBreathBpm() <= 0 && booleanValue) {
                    startRestartGroup.startReplaceGroup(1159243755);
                    composer2 = startRestartGroup;
                    TextKt.m2376Text4IGK_g("Breath ~" + live.getBreathBpm() + " bpm · restlessness " + live.getRestlessness(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    if (booleanValue && !SleepTrackingLiveCard$lambda$1(produceState).isEmpty()) {
                        composer2.startReplaceGroup(1159548454);
                        TextKt.m2376Text4IGK_g("Respiratory rate unreliable — reposition phone", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getTertiary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, 6, 0, 65530);
                        composer2.endReplaceGroup();
                    } else {
                        composer3 = composer2;
                        composer3.startReplaceGroup(1159769484);
                        composer3.endReplaceGroup();
                        if (live.getMicActive()) {
                            composer3.startReplaceGroup(1159805661);
                            composer4 = composer3;
                            TextKt.m2376Text4IGK_g("Snore/noise likelihood " + live.getSnoreLikelihood() + "%", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer4, 0, 0, 65530);
                            composer4.endReplaceGroup();
                        } else {
                            composer4 = composer3;
                            composer3.startReplaceGroup(1160047895);
                            TextKt.m2376Text4IGK_g("Mic off — using movement only", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getTertiary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer4, 6, 0, 65530);
                            composer4.endReplaceGroup();
                        }
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
                        composer5 = composer4;
                        ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer5, 6);
                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor2);
                        } else {
                            composer5.useNode();
                        }
                        m3336constructorimpl2 = Updater.m3336constructorimpl(composer5);
                        Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer5, weight$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor3);
                        } else {
                            composer5.useNode();
                        }
                        m3336constructorimpl3 = Updater.m3336constructorimpl(composer5);
                        Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer5, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        TextKt.m2376Text4IGK_g("Stillness", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getLabelSmall(), composer5, 6, 0, 65534);
                        composer5.startReplaceGroup(89134825);
                        int i7 = i4 & 14;
                        z = i7 == 4;
                        rememberedValue3 = composer5.rememberedValue();
                        if (!z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTrackingLiveCardKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    float SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5;
                                    SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5 = SleepTrackingLiveCardKt.SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5(SleepTrackingLiveStats.Live.this);
                                    return Float.valueOf(SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5);
                                }
                            };
                            composer5.updateRememberedValue(rememberedValue3);
                        }
                        composer5.endReplaceGroup();
                        ProgressIndicatorKt.m2054LinearProgressIndicatorGJbTh5U((Function0) rememberedValue3, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, 0, 0.0f, null, composer5, 48, 124);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer5, weight$default2);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor4);
                        } else {
                            composer5.useNode();
                        }
                        m3336constructorimpl4 = Updater.m3336constructorimpl(composer5);
                        Updater.m3343setimpl(m3336constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer5, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        TextKt.m2376Text4IGK_g("Quiet", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getLabelSmall(), composer5, 6, 0, 65534);
                        composer5.startReplaceGroup(89145424);
                        z2 = i7 == 4;
                        rememberedValue4 = composer5.rememberedValue();
                        if (!z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTrackingLiveCardKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    float SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8;
                                    SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8 = SleepTrackingLiveCardKt.SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8(SleepTrackingLiveStats.Live.this);
                                    return Float.valueOf(SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8);
                                }
                            };
                            composer5.updateRememberedValue(rememberedValue4);
                        }
                        composer5.endReplaceGroup();
                        ProgressIndicatorKt.m2054LinearProgressIndicatorGJbTh5U((Function0) rememberedValue4, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, 0, 0.0f, null, composer5, 48, 124);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer6 = composer5;
                        SleepOvernightLiveChartKt.SleepOvernightLiveChart(SleepTrackingLiveCard$lambda$1(produceState), null, composer6, 0, 2);
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        composer6.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    }
                }
                composer3 = composer2;
                if (live.getMicActive()) {
                }
                Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_422 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
                composer5 = composer4;
                ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_422, Alignment.INSTANCE.getTop(), composer5, 6);
                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composer5.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default22);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer5.getApplier() instanceof Applier)) {
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                }
                m3336constructorimpl2 = Updater.m3336constructorimpl(composer5);
                Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl2.getInserting()) {
                }
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                Modifier weight$default3 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap32 = composer5.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer5, weight$default3);
                Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer5.getApplier() instanceof Applier)) {
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                }
                m3336constructorimpl3 = Updater.m3336constructorimpl(composer5);
                Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl3.getInserting()) {
                }
                m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                Updater.m3343setimpl(m3336constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer5, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                TextKt.m2376Text4IGK_g("Stillness", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getLabelSmall(), composer5, 6, 0, 65534);
                composer5.startReplaceGroup(89134825);
                int i72 = i4 & 14;
                if (i72 == 4) {
                }
                rememberedValue3 = composer5.rememberedValue();
                if (!z) {
                }
                rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTrackingLiveCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5;
                        SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5 = SleepTrackingLiveCardKt.SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5(SleepTrackingLiveStats.Live.this);
                        return Float.valueOf(SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5);
                    }
                };
                composer5.updateRememberedValue(rememberedValue3);
                composer5.endReplaceGroup();
                ProgressIndicatorKt.m2054LinearProgressIndicatorGJbTh5U((Function0) rememberedValue3, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, 0, 0.0f, null, composer5, 48, 124);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                Modifier weight$default22 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap42 = composer5.getCurrentCompositionLocalMap();
                Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer5, weight$default22);
                Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer5.getApplier() instanceof Applier)) {
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                }
                m3336constructorimpl4 = Updater.m3336constructorimpl(composer5);
                Updater.m3343setimpl(m3336constructorimpl4, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl4.getInserting()) {
                }
                m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
                Updater.m3343setimpl(m3336constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer5, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
                TextKt.m2376Text4IGK_g("Quiet", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getLabelSmall(), composer5, 6, 0, 65534);
                composer5.startReplaceGroup(89145424);
                if (i72 == 4) {
                }
                rememberedValue4 = composer5.rememberedValue();
                if (!z2) {
                }
                rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTrackingLiveCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8;
                        SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8 = SleepTrackingLiveCardKt.SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8(SleepTrackingLiveStats.Live.this);
                        return Float.valueOf(SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8);
                    }
                };
                composer5.updateRememberedValue(rememberedValue4);
                composer5.endReplaceGroup();
                ProgressIndicatorKt.m2054LinearProgressIndicatorGJbTh5U((Function0) rememberedValue4, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, 0, 0.0f, null, composer5, 48, 124);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer6 = composer5;
                SleepOvernightLiveChartKt.SleepOvernightLiveChart(SleepTrackingLiveCard$lambda$1(produceState), null, composer6, 0, 2);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                composer6.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer6 = startRestartGroup;
            }
            endRestartGroup = composer6.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTrackingLiveCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SleepTrackingLiveCard$lambda$13;
                        SleepTrackingLiveCard$lambda$13 = SleepTrackingLiveCardKt.SleepTrackingLiveCard$lambda$13(SleepTrackingLiveStats.Live.this, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SleepTrackingLiveCard$lambda$13;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context2 = (Context) consume2;
        List emptyList2 = CollectionsKt.emptyList();
        Integer valueOf2 = Integer.valueOf(live.getTrackedMin());
        startRestartGroup.startReplaceGroup(510948274);
        changedInstance = startRestartGroup.changedInstance(context2);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new SleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1(context2, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        produceState = SnapshotStateKt.produceState(emptyList2, valueOf2, (Function2<? super ProduceStateScope<List>, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default3);
        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
        Modifier modifier42 = modifier3;
        TextKt.m2376Text4IGK_g("Live tracking", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, 196614, 0, 65502);
        TextKt.m2376Text4IGK_g(live.getStageHint(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodyMedium(), startRestartGroup, 0, 0, 65530);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(live.getTrackedMin() + " min tracked");
        sb3.append(" · mic " + live.getMicCoveragePercent() + "%");
        if (live.getAsleepPercent() > 0) {
        }
        if (live.getConfidencePercent() > 0) {
        }
        sb3.append(" · quiet " + live.getQuietPercent() + "%");
        String sb22 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "toString(...)");
        TextKt.m2376Text4IGK_g(sb22, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 0, 0, 65530);
        List<SleepTrackSample> SleepTrackingLiveCard$lambda$122 = SleepTrackingLiveCard$lambda$1(produceState);
        startRestartGroup.startReplaceGroup(-793896223);
        changed = startRestartGroup.changed(SleepTrackingLiveCard$lambda$122);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        SleepTrackingLiveCard$lambda$1 = SleepTrackingLiveCard$lambda$1(produceState);
        if (SleepTrackingLiveCard$lambda$1 instanceof Collection) {
        }
        it = SleepTrackingLiveCard$lambda$1.iterator();
        i5 = 0;
        while (it.hasNext()) {
        }
        rememberedValue2 = Boolean.valueOf(!SleepTrackingLiveCard$lambda$1(produceState).isEmpty() || ((float) i5) / ((float) SleepTrackingLiveCard$lambda$1(produceState).size()) >= 0.7f);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        booleanValue = ((Boolean) rememberedValue2).booleanValue();
        startRestartGroup.endReplaceGroup();
        if (live.getBreathBpm() <= 0) {
        }
        composer2 = startRestartGroup;
        if (booleanValue) {
        }
        composer3 = composer2;
        composer3.startReplaceGroup(1159769484);
        composer3.endReplaceGroup();
        if (live.getMicActive()) {
        }
        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_4222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
        composer5 = composer4;
        ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m564spacedBy0680j_4222, Alignment.INSTANCE.getTop(), composer5, 6);
        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
        CompositionLocalMap currentCompositionLocalMap222 = composer5.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer5.getApplier() instanceof Applier)) {
        }
        composer5.startReusableNode();
        if (composer5.getInserting()) {
        }
        m3336constructorimpl2 = Updater.m3336constructorimpl(composer5);
        Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl2.getInserting()) {
        }
        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        Modifier weight$default32 = RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
        CompositionLocalMap currentCompositionLocalMap322 = composer5.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(composer5, weight$default32);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer5.getApplier() instanceof Applier)) {
        }
        composer5.startReusableNode();
        if (composer5.getInserting()) {
        }
        m3336constructorimpl3 = Updater.m3336constructorimpl(composer5);
        Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl3.getInserting()) {
        }
        m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
        Updater.m3343setimpl(m3336constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer5, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        TextKt.m2376Text4IGK_g("Stillness", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getLabelSmall(), composer5, 6, 0, 65534);
        composer5.startReplaceGroup(89134825);
        int i722 = i4 & 14;
        if (i722 == 4) {
        }
        rememberedValue3 = composer5.rememberedValue();
        if (!z) {
        }
        rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTrackingLiveCardKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5;
                SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5 = SleepTrackingLiveCardKt.SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5(SleepTrackingLiveStats.Live.this);
                return Float.valueOf(SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5);
            }
        };
        composer5.updateRememberedValue(rememberedValue3);
        composer5.endReplaceGroup();
        ProgressIndicatorKt.m2054LinearProgressIndicatorGJbTh5U((Function0) rememberedValue3, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, 0, 0.0f, null, composer5, 48, 124);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        composer5.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer5);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        Modifier weight$default222 = RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
        CompositionLocalMap currentCompositionLocalMap422 = composer5.getCurrentCompositionLocalMap();
        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(composer5, weight$default222);
        Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer5.getApplier() instanceof Applier)) {
        }
        composer5.startReusableNode();
        if (composer5.getInserting()) {
        }
        m3336constructorimpl4 = Updater.m3336constructorimpl(composer5);
        Updater.m3343setimpl(m3336constructorimpl4, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl4.getInserting()) {
        }
        m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
        Updater.m3343setimpl(m3336constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer5, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
        TextKt.m2376Text4IGK_g("Quiet", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getLabelSmall(), composer5, 6, 0, 65534);
        composer5.startReplaceGroup(89145424);
        if (i722 == 4) {
        }
        rememberedValue4 = composer5.rememberedValue();
        if (!z2) {
        }
        rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTrackingLiveCardKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8;
                SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8 = SleepTrackingLiveCardKt.SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8(SleepTrackingLiveStats.Live.this);
                return Float.valueOf(SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8);
            }
        };
        composer5.updateRememberedValue(rememberedValue4);
        composer5.endReplaceGroup();
        ProgressIndicatorKt.m2054LinearProgressIndicatorGJbTh5U((Function0) rememberedValue4, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, 0, 0.0f, null, composer5, 48, 124);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        composer5.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer5);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        composer5.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer5);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        ComposerKt.sourceInformationMarkerEnd(composer5);
        composer6 = composer5;
        SleepOvernightLiveChartKt.SleepOvernightLiveChart(SleepTrackingLiveCard$lambda$1(produceState), null, composer6, 0, 2);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        composer6.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier42;
        endRestartGroup = composer6.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SleepTrackingLiveCard$lambda$12$lambda$11$lambda$7$lambda$6$lambda$5(SleepTrackingLiveStats.Live live) {
        return RangesKt.coerceIn(100 - live.getRestlessness(), 0, 100) / 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SleepTrackingLiveCard$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8(SleepTrackingLiveStats.Live live) {
        return live.getQuietPercent() / 100.0f;
    }

    private static final List<SleepTrackSample> SleepTrackingLiveCard$lambda$1(State<? extends List<SleepTrackSample>> state) {
        return state.getValue();
    }
}
