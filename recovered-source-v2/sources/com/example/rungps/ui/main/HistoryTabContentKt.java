package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.health.platform.client.SdkConfig;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.example.rungps.analytics.LocalPbWithRun;
import com.example.rungps.data.GymLoadStats;
import com.example.rungps.data.Repository;
import com.example.rungps.data.StravaPbEntity;
import com.example.rungps.data.StravaPbKind;
import com.example.rungps.feature.run.RunRow;
import com.example.rungps.feature.run.RunsViewModel;
import com.example.rungps.ui.components.AppSnackbarKt;
import com.example.rungps.ui.components.TabUiKt;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: HistoryTabContent.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\u001aT\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00012\u0006\u0010\f\u001a\u00020\u0004H\u0002\u001a/\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0011H\u0003¢\u0006\u0002\u0010\u0013\u001aÍ\u0001\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e0\u00112\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u0011H\u0007¢\u0006\u0002\u0010#¨\u0006$²\u0006\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u008a\u0084\u0002²\u0006\u0016\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\bX\u008a\u008e\u0002²\u0006\u0016\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bX\u008a\u008e\u0002²\u0006\u0016\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bX\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\f\u00100\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002"}, d2 = {"mergeHistoryPbs", "", "Lcom/example/rungps/ui/main/HistoryMergedPb;", "order", "", "stravaPbs", "Lcom/example/rungps/data/StravaPbEntity;", "localPbRuns", "", "Lcom/example/rungps/analytics/LocalPbWithRun;", "runs", "Lcom/example/rungps/feature/run/RunRow;", "activityLabel", "HistoryPbTileGrid", "", "pbs", "onSelectRun", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "HistoryTabContent", "vm", "Lcom/example/rungps/feature/run/RunsViewModel;", "gymLoad", "Lcom/example/rungps/data/GymLoadStats;", "selectedRunId", "onCloseRun", "Lkotlin/Function0;", "onExport", "onShareOnPhoto", "onShowDeleteAll", "", "onDeleteOneId", "onExportAll", "goTab", "(Lcom/example/rungps/feature/run/RunsViewModel;Ljava/util/List;Lcom/example/rungps/data/GymLoadStats;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "localPbs", "localRidePbs", "stravaClientId", "stravaClientSecret", "stravaSecretSaved", "stravaConnected", "showStravaSetup", "spotifyClientId", "spotifyConnected", "showSpotifySetup", "refreshingPbs", "stravaUploadStatus"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HistoryTabContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryPbTileGrid$lambda$10(List list, Function1 function1, int i, Composer composer, int i2) {
        HistoryPbTileGrid(list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryTabContent$lambda$13(RunsViewModel runsViewModel, List list, GymLoadStats gymLoadStats, Long l, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function0 function02, Function1 function16, int i, int i2, Composer composer, int i3) {
        HistoryTabContent(runsViewModel, list, gymLoadStats, l, function0, function1, function12, function13, function14, function15, function02, function16, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryTabContent$lambda$79(RunsViewModel runsViewModel, List list, GymLoadStats gymLoadStats, Long l, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function0 function02, Function1 function16, int i, int i2, Composer composer, int i3) {
        HistoryTabContent(runsViewModel, list, gymLoadStats, l, function0, function1, function12, function13, function14, function15, function02, function16, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0189, code lost:
    
        if (r5 != null) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List<HistoryMergedPb> mergeHistoryPbs(List<String> list, List<StravaPbEntity> list2, Map<String, LocalPbWithRun> map, List<RunRow> list3, String str) {
        Map<String, LocalPbWithRun> map2;
        Long l;
        Long l2;
        Long l3;
        HistoryMergedPb historyMergedPb;
        String str2;
        Object obj;
        String activityName;
        List<StravaPbEntity> list4 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list4, 10)), 16));
        for (Object obj2 : list4) {
            linkedHashMap.put(((StravaPbEntity) obj2).getDistanceKey(), obj2);
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            StravaPbEntity stravaPbEntity = (StravaPbEntity) linkedHashMap.get(str3);
            if (stravaPbEntity != null) {
                l = Long.valueOf(stravaPbEntity.getBestMovingTimeSec());
                map2 = map;
            } else {
                map2 = map;
                l = null;
            }
            LocalPbWithRun localPbWithRun = map2.get(str3);
            Long valueOf = localPbWithRun != null ? Long.valueOf(localPbWithRun.getDurationMs()) : null;
            if (l == null || valueOf == null) {
                l2 = l;
                if (l2 != null) {
                    l3 = Long.valueOf(l2.longValue() * 1000);
                } else {
                    l3 = valueOf == null ? null : valueOf;
                }
            } else {
                l2 = l;
                l3 = Long.valueOf(Math.min(l.longValue() * 1000, valueOf.longValue()));
            }
            if (l3 != null) {
                boolean z = (l2 == null || valueOf == null || valueOf.longValue() >= l2.longValue() * 1000) ? false : true;
                Long valueOf2 = ((z || l2 == null) && localPbWithRun != null) ? Long.valueOf(localPbWithRun.getRunId()) : null;
                if (z || l2 == null) {
                    if (valueOf2 != null) {
                        long longValue = valueOf2.longValue();
                        Iterator<T> it = list3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((RunRow) obj).getId() == longValue) {
                                break;
                            }
                        }
                        RunRow runRow = (RunRow) obj;
                        if (runRow != null) {
                            String str4 = str + " · " + Instant.ofEpochMilli(runRow.getStartedAtMs()).atZone(ZoneId.systemDefault()).toLocalDate() + " · tap";
                            if (str4 != null) {
                                str2 = str4;
                            }
                        }
                        str2 = str + " #" + longValue + " · tap";
                    }
                    str2 = "This app";
                } else {
                    String obj3 = (stravaPbEntity == null || (activityName = stravaPbEntity.getActivityName()) == null) ? null : StringsKt.trim((CharSequence) activityName).toString();
                    if (obj3 == null) {
                        obj3 = "";
                    }
                    str2 = obj3.length() > 0 ? obj3 + " · Strava" : "Strava";
                }
                historyMergedPb = new HistoryMergedPb(str3, MainActivityFormattersKt.formatElapsed(l3.longValue()), valueOf2, str2);
            } else {
                historyMergedPb = null;
            }
            if (historyMergedPb != null) {
                arrayList.add(historyMergedPb);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0191, code lost:
    
        if (r7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistoryPbTileGrid(final List<HistoryMergedPb> list, final Function1<? super Long, Unit> function1, Composer composer, final int i) {
        Modifier.Companion companion;
        Object obj;
        Composer startRestartGroup = composer.startRestartGroup(687292128);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(687292128, i4, -1, "com.example.rungps.ui.main.HistoryPbTileGrid (HistoryTabContent.kt:99)");
            }
            for (List<HistoryMergedPb> list2 : CollectionsKt.chunked(list, 2)) {
                int i5 = 1;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int i6 = 0;
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
                startRestartGroup.startReplaceGroup(473591975);
                for (final HistoryMergedPb historyMergedPb : list2) {
                    String distance = historyMergedPb.getDistance();
                    String timeStr = historyMergedPb.getTimeStr();
                    String subtitle = historyMergedPb.getSubtitle();
                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    startRestartGroup.startReplaceGroup(473601339);
                    if (historyMergedPb.getSourceRunId() != null) {
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        startRestartGroup.startReplaceGroup(-527590883);
                        int i7 = ((i4 & SdkConfig.SDK_VERSION) == i3 ? i5 : i6) | (startRestartGroup.changed(historyMergedPb) ? 1 : 0);
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (i7 == 0) {
                            obj = rememberedValue;
                        }
                        Function0 function0 = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit HistoryPbTileGrid$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5;
                                HistoryPbTileGrid$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5 = HistoryTabContentKt.HistoryPbTileGrid$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(Function1.this, historyMergedPb);
                                return HistoryPbTileGrid$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5;
                            }
                        };
                        startRestartGroup.updateRememberedValue(function0);
                        obj = function0;
                        startRestartGroup.endReplaceGroup();
                        companion = ClickableKt.m272clickableXHw0xAI$default(companion2, false, null, null, (Function0) obj, 7, null);
                    } else {
                        companion = Modifier.INSTANCE;
                    }
                    startRestartGroup.endReplaceGroup();
                    TabUiKt.m6984MetricTileyrwZFoE(distance, timeStr, weight$default.then(companion), subtitle, 0L, startRestartGroup, 0, 16);
                    i5 = i5;
                    i6 = 0;
                    i3 = 32;
                }
                int i8 = i5;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(473610541);
                if (list2.size() == i8) {
                    SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                i3 = 32;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit HistoryPbTileGrid$lambda$10;
                    HistoryPbTileGrid$lambda$10 = HistoryTabContentKt.HistoryPbTileGrid$lambda$10(list, function1, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return HistoryPbTileGrid$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryPbTileGrid$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(Function1 function1, HistoryMergedPb historyMergedPb) {
        function1.invoke(historyMergedPb.getSourceRunId());
        return Unit.INSTANCE;
    }

    public static final void HistoryTabContent(final RunsViewModel vm, final List<RunRow> runs, final GymLoadStats gymLoadStats, final Long l, final Function0<Unit> onCloseRun, final Function1<? super Long, Unit> onSelectRun, final Function1<? super Long, Unit> onExport, final Function1<? super Long, Unit> onShareOnPhoto, final Function1<? super Boolean, Unit> onShowDeleteAll, final Function1<? super Long, Unit> onDeleteOneId, final Function0<Unit> onExportAll, final Function1<? super String, Unit> goTab, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        SnapshotMutationPolicy snapshotMutationPolicy2;
        Long valueOf;
        MutableState mutableState;
        final MutableState mutableState2;
        Repository repository;
        MutableState mutableState3;
        MutableState mutableState4;
        Intrinsics.checkNotNullParameter(vm, "vm");
        Intrinsics.checkNotNullParameter(runs, "runs");
        Intrinsics.checkNotNullParameter(onCloseRun, "onCloseRun");
        Intrinsics.checkNotNullParameter(onSelectRun, "onSelectRun");
        Intrinsics.checkNotNullParameter(onExport, "onExport");
        Intrinsics.checkNotNullParameter(onShareOnPhoto, "onShareOnPhoto");
        Intrinsics.checkNotNullParameter(onShowDeleteAll, "onShowDeleteAll");
        Intrinsics.checkNotNullParameter(onDeleteOneId, "onDeleteOneId");
        Intrinsics.checkNotNullParameter(onExportAll, "onExportAll");
        Intrinsics.checkNotNullParameter(goTab, "goTab");
        Composer startRestartGroup = composer.startRestartGroup(-304493751);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(vm) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(runs) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(gymLoadStats) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(onCloseRun) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(onSelectRun) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(onExport) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(onShareOnPhoto) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(onShowDeleteAll) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(onDeleteOneId) ? 536870912 : 268435456;
        }
        int i5 = (i2 & 6) == 0 ? i2 | (startRestartGroup.changedInstance(onExportAll) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(goTab) ? 32 : 16;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-304493751, i4, i5, "com.example.rungps.ui.main.HistoryTabContent (HistoryTabContent.kt:140)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            ProvidableCompositionLocal<SnackbarHostState> localAppSnackbar = AppSnackbarKt.getLocalAppSnackbar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localAppSnackbar);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SnackbarHostState snackbarHostState = (SnackbarHostState) consume2;
            startRestartGroup.startReplaceGroup(-1119104787);
            if (l != null) {
                long longValue = l.longValue();
                startRestartGroup.startReplaceGroup(-1119099136);
                boolean z = ((29360128 & i4) == 8388608) | ((i4 & 7168) == 2048);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit HistoryTabContent$lambda$12$lambda$11;
                            HistoryTabContent$lambda$12$lambda$11 = HistoryTabContentKt.HistoryTabContent$lambda$12$lambda$11(Function1.this, l);
                            return HistoryTabContent$lambda$12$lambda$11;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                HomeRunControlsKt.RunDetailsCard(longValue, onCloseRun, onExport, (Function0) rememberedValue, vm, startRestartGroup, ((i4 >> 9) & WebSocketProtocol.PAYLOAD_SHORT) | ((i4 >> 12) & 896) | ((i4 << 12) & 57344));
                startRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit HistoryTabContent$lambda$13;
                            HistoryTabContent$lambda$13 = HistoryTabContentKt.HistoryTabContent$lambda$13(RunsViewModel.this, runs, gymLoadStats, l, onCloseRun, onSelectRun, onExport, onShareOnPhoto, onShowDeleteAll, onDeleteOneId, onExportAll, goTab, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return HistoryTabContent$lambda$13;
                        }
                    });
                    return;
                }
                return;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1119095628);
            boolean changed = startRestartGroup.changed(context);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = Repository.INSTANCE.get(context).stravaPbsFlow();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            State collectAsState = SnapshotStateKt.collectAsState((Flow) rememberedValue2, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            startRestartGroup.startReplaceGroup(-1119092348);
            boolean changed2 = startRestartGroup.changed(context);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = Repository.INSTANCE.get(context);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Repository repository2 = (Repository) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1119090599);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState5 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1119088093);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState6 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1119085245);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                i3 = 2;
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                i3 = 2;
            }
            MutableState mutableState7 = (MutableState) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            Object[] objArr = new Object[0];
            startRestartGroup.startReplaceGroup(-1119081835);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState HistoryTabContent$lambda$27$lambda$26;
                        HistoryTabContent$lambda$27$lambda$26 = HistoryTabContentKt.HistoryTabContent$lambda$27$lambda$26();
                        return HistoryTabContent$lambda$27$lambda$26;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            startRestartGroup.endReplaceGroup();
            int i6 = i3;
            composer2 = startRestartGroup;
            MutableState mutableState8 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue7, startRestartGroup, 3072, 6);
            composer2.startReplaceGroup(-1119080258);
            Object rememberedValue8 = composer2.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                snapshotMutationPolicy = null;
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, i6, null);
                composer2.updateRememberedValue(rememberedValue8);
            } else {
                snapshotMutationPolicy = null;
            }
            MutableState mutableState9 = (MutableState) rememberedValue8;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1119078431);
            Object rememberedValue9 = composer2.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, snapshotMutationPolicy, i6, snapshotMutationPolicy);
                composer2.updateRememberedValue(rememberedValue9);
            }
            MutableState mutableState10 = (MutableState) rememberedValue9;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1119076575);
            Object rememberedValue10 = composer2.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, snapshotMutationPolicy, i6, snapshotMutationPolicy);
                composer2.updateRememberedValue(rememberedValue10);
            }
            MutableState mutableState11 = (MutableState) rememberedValue10;
            composer2.endReplaceGroup();
            Object[] objArr2 = new Object[0];
            composer2.startReplaceGroup(-1119074184);
            Object rememberedValue11 = composer2.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState HistoryTabContent$lambda$40$lambda$39;
                        HistoryTabContent$lambda$40$lambda$39 = HistoryTabContentKt.HistoryTabContent$lambda$40$lambda$39();
                        return HistoryTabContent$lambda$40$lambda$39;
                    }
                };
                composer2.updateRememberedValue(rememberedValue11);
            }
            composer2.endReplaceGroup();
            MutableState mutableState12 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue11, composer2, 3072, 6);
            Object[] objArr3 = new Object[0];
            composer2.startReplaceGroup(-1119072075);
            Object rememberedValue12 = composer2.rememberedValue();
            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState HistoryTabContent$lambda$44$lambda$43;
                        HistoryTabContent$lambda$44$lambda$43 = HistoryTabContentKt.HistoryTabContent$lambda$44$lambda$43();
                        return HistoryTabContent$lambda$44$lambda$43;
                    }
                };
                composer2.updateRememberedValue(rememberedValue12);
            }
            composer2.endReplaceGroup();
            MutableState mutableState13 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) rememberedValue12, composer2, 3072, 6);
            composer2.startReplaceGroup(-1119070559);
            Object rememberedValue13 = composer2.rememberedValue();
            if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composer2.updateRememberedValue(rememberedValue13);
            }
            MutableState mutableState14 = (MutableState) rememberedValue13;
            composer2.endReplaceGroup();
            Object[] objArr4 = new Object[0];
            composer2.startReplaceGroup(-1119068136);
            Object rememberedValue14 = composer2.rememberedValue();
            if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState HistoryTabContent$lambda$51$lambda$50;
                        HistoryTabContent$lambda$51$lambda$50 = HistoryTabContentKt.HistoryTabContent$lambda$51$lambda$50();
                        return HistoryTabContent$lambda$51$lambda$50;
                    }
                };
                composer2.updateRememberedValue(rememberedValue14);
            }
            composer2.endReplaceGroup();
            MutableState mutableState15 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) rememberedValue14, composer2, 3072, 6);
            composer2.startReplaceGroup(-1119066623);
            Object rememberedValue15 = composer2.rememberedValue();
            if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                snapshotMutationPolicy2 = null;
                rememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composer2.updateRememberedValue(rememberedValue15);
            } else {
                snapshotMutationPolicy2 = null;
            }
            MutableState mutableState16 = (MutableState) rememberedValue15;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1119064663);
            Object rememberedValue16 = composer2.rememberedValue();
            if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                rememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, 2, snapshotMutationPolicy2);
                composer2.updateRememberedValue(rememberedValue16);
            }
            final MutableState mutableState17 = (MutableState) rememberedValue16;
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composer2, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue17 = composer2.rememberedValue();
            if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue17 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue17).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = composer2.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) consume3;
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceGroup(-1119045778);
            final Repository repository3 = repository2;
            MutableState mutableState18 = mutableState13;
            boolean changedInstance = composer2.changedInstance(context) | composer2.changed(mutableState8) | composer2.changedInstance(repository3) | composer2.changed(mutableState18);
            HistoryTabContentKt$HistoryTabContent$3$1 rememberedValue18 = composer2.rememberedValue();
            if (changedInstance || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                rememberedValue18 = new HistoryTabContentKt$HistoryTabContent$3$1(context, mutableState8, mutableState10, repository3, mutableState11, mutableState17, mutableState18, mutableState14, mutableState6, mutableState7, mutableState5, null);
                composer2.updateRememberedValue(rememberedValue18);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue18, composer2, 6);
            Integer valueOf2 = Integer.valueOf(runs.size());
            List<RunRow> list = runs;
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                Long endedAtMs = ((RunRow) it.next()).getEndedAtMs();
                valueOf = Long.valueOf(endedAtMs != null ? endedAtMs.longValue() : 0L);
                while (it.hasNext()) {
                    Long endedAtMs2 = ((RunRow) it.next()).getEndedAtMs();
                    MutableState mutableState19 = mutableState18;
                    Long valueOf3 = Long.valueOf(endedAtMs2 != null ? endedAtMs2.longValue() : 0L);
                    if (valueOf.compareTo(valueOf3) < 0) {
                        valueOf = valueOf3;
                    }
                    mutableState18 = mutableState19;
                }
                mutableState = mutableState18;
            } else {
                mutableState = mutableState18;
                valueOf = null;
            }
            composer2.startReplaceGroup(-1119027105);
            boolean changedInstance2 = composer2.changedInstance(repository3);
            HistoryTabContentKt$HistoryTabContent$5$1 rememberedValue19 = composer2.rememberedValue();
            if (changedInstance2 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                rememberedValue19 = new HistoryTabContentKt$HistoryTabContent$5$1(repository3, mutableState6, mutableState7, mutableState5, null);
                composer2.updateRememberedValue(rememberedValue19);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf2, valueOf, (Function2) rememberedValue19, composer2, 0);
            composer2.startReplaceGroup(-1119024714);
            boolean changedInstance3 = composer2.changedInstance(repository3) | composer2.changedInstance(lifecycleOwner);
            Object rememberedValue20 = composer2.rememberedValue();
            if (changedInstance3 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState11;
                rememberedValue20 = new Function1() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DisposableEffectResult HistoryTabContent$lambda$67$lambda$66;
                        HistoryTabContent$lambda$67$lambda$66 = HistoryTabContentKt.HistoryTabContent$lambda$67$lambda$66(LifecycleOwner.this, repository3, mutableState2, mutableState17, (DisposableEffectScope) obj);
                        return HistoryTabContent$lambda$67$lambda$66;
                    }
                };
                composer2.updateRememberedValue(rememberedValue20);
            } else {
                mutableState2 = mutableState11;
            }
            composer2.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue20, composer2, 0);
            List listOf = CollectionsKt.listOf((Object[]) new String[]{"1 km", "3 km", "5 km", "10 km", "12 km", "Half marathon", "Marathon"});
            List listOf2 = CollectionsKt.listOf((Object[]) new String[]{"10 km", "20 km", "40 km", "50 km", "100 km"});
            List<StravaPbEntity> HistoryTabContent$lambda$15 = HistoryTabContent$lambda$15(collectAsState);
            composer2.startReplaceGroup(-1119008785);
            boolean changed3 = composer2.changed(HistoryTabContent$lambda$15);
            ArrayList rememberedValue21 = composer2.rememberedValue();
            if (changed3 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                List<StravaPbEntity> HistoryTabContent$lambda$152 = HistoryTabContent$lambda$15(collectAsState);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = HistoryTabContent$lambda$152.iterator();
                while (it2.hasNext()) {
                    Repository repository4 = repository3;
                    Object next = it2.next();
                    Iterator it3 = it2;
                    MutableState mutableState20 = mutableState2;
                    if (Intrinsics.areEqual(((StravaPbEntity) next).getActivityKind(), "RUN")) {
                        arrayList.add(next);
                    }
                    mutableState2 = mutableState20;
                    it2 = it3;
                    repository3 = repository4;
                }
                repository = repository3;
                mutableState3 = mutableState2;
                rememberedValue21 = arrayList;
                composer2.updateRememberedValue(rememberedValue21);
            } else {
                repository = repository3;
                mutableState3 = mutableState2;
            }
            List list2 = (List) rememberedValue21;
            composer2.endReplaceGroup();
            List<StravaPbEntity> HistoryTabContent$lambda$153 = HistoryTabContent$lambda$15(collectAsState);
            composer2.startReplaceGroup(-1119005424);
            boolean changed4 = composer2.changed(HistoryTabContent$lambda$153);
            ArrayList rememberedValue22 = composer2.rememberedValue();
            if (changed4 || rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                List<StravaPbEntity> HistoryTabContent$lambda$154 = HistoryTabContent$lambda$15(collectAsState);
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = HistoryTabContent$lambda$154.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    Iterator it5 = it4;
                    MutableState mutableState21 = mutableState17;
                    if (Intrinsics.areEqual(((StravaPbEntity) next2).getActivityKind(), StravaPbKind.RIDE)) {
                        arrayList2.add(next2);
                    }
                    mutableState17 = mutableState21;
                    it4 = it5;
                }
                mutableState4 = mutableState17;
                rememberedValue22 = arrayList2;
                composer2.updateRememberedValue(rememberedValue22);
            } else {
                mutableState4 = mutableState17;
            }
            List list3 = (List) rememberedValue22;
            composer2.endReplaceGroup();
            Map<String, LocalPbWithRun> HistoryTabContent$lambda$21 = HistoryTabContent$lambda$21(mutableState6);
            composer2.startReplaceGroup(-1119002022);
            boolean changed5 = composer2.changed(HistoryTabContent$lambda$21) | composer2.changed(list2) | composer2.changed(runs);
            Object rememberedValue23 = composer2.rememberedValue();
            if (changed5 || rememberedValue23 == Composer.INSTANCE.getEmpty()) {
                rememberedValue23 = mergeHistoryPbs(listOf, list2, HistoryTabContent$lambda$21(mutableState6), runs, "Run");
                composer2.updateRememberedValue(rememberedValue23);
            }
            List list4 = (List) rememberedValue23;
            composer2.endReplaceGroup();
            Map<String, LocalPbWithRun> HistoryTabContent$lambda$24 = HistoryTabContent$lambda$24(mutableState7);
            composer2.startReplaceGroup(-1118997280);
            boolean changed6 = composer2.changed(HistoryTabContent$lambda$24) | composer2.changed(list3) | composer2.changed(runs);
            Object rememberedValue24 = composer2.rememberedValue();
            if (changed6 || rememberedValue24 == Composer.INSTANCE.getEmpty()) {
                rememberedValue24 = mergeHistoryPbs(listOf2, list3, HistoryTabContent$lambda$24(mutableState7), runs, "Ride");
                composer2.updateRememberedValue(rememberedValue24);
            }
            List list5 = (List) rememberedValue24;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1118992187);
            boolean changed7 = composer2.changed(runs);
            Object rememberedValue25 = composer2.rememberedValue();
            if (changed7 || rememberedValue25 == Composer.INSTANCE.getEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list) {
                    if (((RunRow) obj).getEndedAtMs() != null) {
                        arrayList3.add(obj);
                    }
                }
                rememberedValue25 = CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$lambda$76$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        RunRow runRow = (RunRow) t2;
                        Long endedAtMs3 = runRow.getEndedAtMs();
                        Long valueOf4 = Long.valueOf(endedAtMs3 != null ? endedAtMs3.longValue() : runRow.getStartedAtMs());
                        RunRow runRow2 = (RunRow) t;
                        Long endedAtMs4 = runRow2.getEndedAtMs();
                        return ComparisonsKt.compareValues(valueOf4, Long.valueOf(endedAtMs4 != null ? endedAtMs4.longValue() : runRow2.getStartedAtMs()));
                    }
                });
                composer2.updateRememberedValue(rememberedValue25);
            }
            List list6 = (List) rememberedValue25;
            composer2.endReplaceGroup();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m3336constructorimpl = Updater.m3336constructorimpl(composer2);
            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append(list6.size() + " activities");
            if (!list4.isEmpty()) {
                sb.append(" · " + list4.size() + " run PBs");
            }
            if (!list5.isEmpty()) {
                sb.append(" · " + list5.size() + " ride PBs");
            }
            sb.append(" · tap for detail");
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            Repository repository5 = repository;
            TabUiKt.TabHeroHeader("History", sb2, null, null, composer2, 6, 12);
            TabUiKt.TabSectionCard("Personal bests", null, ComposableLambdaKt.rememberComposableLambda(-127418988, true, new HistoryTabContentKt$HistoryTabContent$7$2(mutableState8, list4, list5, onSelectRun, mutableState3, coroutineScope, repository5, context, mutableState12, mutableState16, mutableState6, mutableState7, mutableState5, mutableState4, mutableState9, mutableState10, snackbarHostState), composer2, 54), composer2, 390, 2);
            TabUiKt.TabSectionCard("Spotify", null, ComposableLambdaKt.rememberComposableLambda(-766948035, true, new HistoryTabContentKt$HistoryTabContent$7$3(mutableState, mutableState14, mutableState15, coroutineScope, repository5, context), composer2, 54), composer2, 390, 2);
            TabUiKt.TabSectionCard("Runs & rides", null, ComposableLambdaKt.rememberComposableLambda(1654805724, true, new HistoryTabContentKt$HistoryTabContent$7$4(list6, goTab, onExportAll, onShowDeleteAll, gymLoadStats, onSelectRun, onShareOnPhoto, onExport, onDeleteOneId), composer2, 54), composer2, 390, 2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit HistoryTabContent$lambda$79;
                    HistoryTabContent$lambda$79 = HistoryTabContentKt.HistoryTabContent$lambda$79(RunsViewModel.this, runs, gymLoadStats, l, onCloseRun, onSelectRun, onExport, onShareOnPhoto, onShowDeleteAll, onDeleteOneId, onExportAll, goTab, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    return HistoryTabContent$lambda$79;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryTabContent$lambda$12$lambda$11(Function1 function1, Long l) {
        function1.invoke(l);
        return Unit.INSTANCE;
    }

    private static final Map<String, LocalPbWithRun> HistoryTabContent$lambda$21(MutableState<Map<String, LocalPbWithRun>> mutableState) {
        return mutableState.getValue();
    }

    private static final Map<String, LocalPbWithRun> HistoryTabContent$lambda$24(MutableState<Map<String, LocalPbWithRun>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState HistoryTabContent$lambda$27$lambda$26() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HistoryTabContent$lambda$28(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HistoryTabContent$lambda$31(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HistoryTabContent$lambda$34(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HistoryTabContent$lambda$35(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HistoryTabContent$lambda$37(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void HistoryTabContent$lambda$38(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState HistoryTabContent$lambda$40$lambda$39() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HistoryTabContent$lambda$41(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HistoryTabContent$lambda$42(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState HistoryTabContent$lambda$44$lambda$43() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HistoryTabContent$lambda$45(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HistoryTabContent$lambda$48(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HistoryTabContent$lambda$49(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState HistoryTabContent$lambda$51$lambda$50() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HistoryTabContent$lambda$52(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HistoryTabContent$lambda$53(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HistoryTabContent$lambda$55(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HistoryTabContent$lambda$56(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HistoryTabContent$lambda$58(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HistoryTabContent$refreshStravaUiState(Repository repository, MutableState<Boolean> mutableState, MutableState<String> mutableState2) {
        HistoryTabContent$lambda$38(mutableState, repository.isStravaConnected());
        mutableState2.setValue(repository.stravaLastUploadLabel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00db A[LOOP:0: B:12:0x00d5->B:14:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object HistoryTabContent$reloadLocalPbs(Repository repository, MutableState<Map<String, LocalPbWithRun>> mutableState, MutableState<Map<String, LocalPbWithRun>> mutableState2, MutableState<Map<String, Long>> mutableState3, Continuation<? super Unit> continuation) {
        HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$1 historyTabContentKt$HistoryTabContent$reloadLocalPbs$1;
        Object coroutine_suspended;
        int i;
        Object obj;
        MutableState<Map<String, Long>> mutableState4;
        MutableState<Map<String, LocalPbWithRun>> mutableState5;
        MutableState<Map<String, LocalPbWithRun>> mutableState6;
        Object withContext;
        MutableState<Map<String, Long>> mutableState7;
        MutableState<Map<String, LocalPbWithRun>> mutableState8;
        Iterator<T> it;
        if (continuation instanceof HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$1) {
            historyTabContentKt$HistoryTabContent$reloadLocalPbs$1 = (HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$1) continuation;
            if ((historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.label & Integer.MIN_VALUE) != 0) {
                historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.label -= Integer.MIN_VALUE;
                Object obj2 = historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$2 historyTabContentKt$HistoryTabContent$reloadLocalPbs$2 = new HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$2(repository, null);
                    historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$0 = repository;
                    historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$1 = mutableState;
                    historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$2 = mutableState2;
                    historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$3 = mutableState3;
                    historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$4 = mutableState;
                    historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.label = 1;
                    Object withContext2 = BuildersKt.withContext(io2, historyTabContentKt$HistoryTabContent$reloadLocalPbs$2, historyTabContentKt$HistoryTabContent$reloadLocalPbs$1);
                    if (withContext2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = withContext2;
                    mutableState4 = mutableState3;
                    mutableState5 = mutableState2;
                    mutableState6 = mutableState;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutableState8 = (MutableState) historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$2;
                        mutableState7 = (MutableState) historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$1;
                        mutableState6 = (MutableState) historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        mutableState8.setValue((Map) obj2);
                        Map<String, LocalPbWithRun> HistoryTabContent$lambda$21 = HistoryTabContent$lambda$21(mutableState6);
                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(HistoryTabContent$lambda$21.size()));
                        it = HistoryTabContent$lambda$21.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            linkedHashMap.put(entry.getKey(), Boxing.boxLong(((LocalPbWithRun) entry.getValue()).getDurationMs()));
                        }
                        mutableState7.setValue(linkedHashMap);
                        return Unit.INSTANCE;
                    }
                    mutableState = (MutableState) historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$4;
                    MutableState<Map<String, Long>> mutableState9 = (MutableState) historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$3;
                    MutableState<Map<String, LocalPbWithRun>> mutableState10 = (MutableState) historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$2;
                    MutableState<Map<String, LocalPbWithRun>> mutableState11 = (MutableState) historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$1;
                    Repository repository2 = (Repository) historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    mutableState6 = mutableState11;
                    repository = repository2;
                    obj = obj2;
                    mutableState4 = mutableState9;
                    mutableState5 = mutableState10;
                }
                mutableState.setValue((Map) obj);
                CoroutineDispatcher io3 = Dispatchers.getIO();
                HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$3 historyTabContentKt$HistoryTabContent$reloadLocalPbs$3 = new HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$3(repository, null);
                historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$0 = mutableState6;
                historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$1 = mutableState4;
                historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$2 = mutableState5;
                historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$3 = null;
                historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$4 = null;
                historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.label = 2;
                withContext = BuildersKt.withContext(io3, historyTabContentKt$HistoryTabContent$reloadLocalPbs$3, historyTabContentKt$HistoryTabContent$reloadLocalPbs$1);
                if (withContext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState7 = mutableState4;
                obj2 = withContext;
                mutableState8 = mutableState5;
                mutableState8.setValue((Map) obj2);
                Map<String, LocalPbWithRun> HistoryTabContent$lambda$212 = HistoryTabContent$lambda$21(mutableState6);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(HistoryTabContent$lambda$212.size()));
                it = HistoryTabContent$lambda$212.entrySet().iterator();
                while (it.hasNext()) {
                }
                mutableState7.setValue(linkedHashMap2);
                return Unit.INSTANCE;
            }
        }
        historyTabContentKt$HistoryTabContent$reloadLocalPbs$1 = new HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$1(continuation);
        Object obj22 = historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.label;
        if (i != 0) {
        }
        mutableState.setValue((Map) obj);
        CoroutineDispatcher io32 = Dispatchers.getIO();
        HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$3 historyTabContentKt$HistoryTabContent$reloadLocalPbs$32 = new HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$3(repository, null);
        historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$0 = mutableState6;
        historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$1 = mutableState4;
        historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$2 = mutableState5;
        historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$3 = null;
        historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.L$4 = null;
        historyTabContentKt$HistoryTabContent$reloadLocalPbs$1.label = 2;
        withContext = BuildersKt.withContext(io32, historyTabContentKt$HistoryTabContent$reloadLocalPbs$32, historyTabContentKt$HistoryTabContent$reloadLocalPbs$1);
        if (withContext != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult HistoryTabContent$lambda$67$lambda$66(final LifecycleOwner lifecycleOwner, final Repository repository, final MutableState mutableState, final MutableState mutableState2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                HistoryTabContentKt.HistoryTabContent$lambda$67$lambda$66$lambda$64(Repository.this, mutableState, mutableState2, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$lambda$67$lambda$66$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HistoryTabContent$lambda$67$lambda$66$lambda$64(Repository repository, MutableState mutableState, MutableState mutableState2, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            HistoryTabContent$refreshStravaUiState(repository, mutableState, mutableState2);
        }
    }

    private static final List<StravaPbEntity> HistoryTabContent$lambda$15(State<? extends List<StravaPbEntity>> state) {
        return state.getValue();
    }
}
