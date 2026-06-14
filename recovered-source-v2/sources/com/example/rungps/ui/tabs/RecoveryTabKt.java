package com.example.rungps.ui.tabs;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.rungps.data.DailyStepsEntity;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.health.SleepScoring;
import com.example.rungps.recovery.DeloadAdvice;
import com.example.rungps.recovery.DeloadPlanner;
import com.example.rungps.recovery.GymAcwrResult;
import com.example.rungps.recovery.ReadyToTrain;
import com.example.rungps.recovery.ReadyToTrainAssessment;
import com.example.rungps.recovery.RecoveryEventLabels;
import com.example.rungps.recovery.RecoveryModel;
import com.example.rungps.ui.components.EmptyStateKt;
import com.example.rungps.ui.components.MuscleHeatmapMode;
import com.example.rungps.ui.components.MuscleHeatmapViewKt;
import com.example.rungps.ui.components.ReadyToTrainBadgeKt;
import com.example.rungps.ui.components.RecoveryTimelineKt;
import com.example.rungps.ui.components.RecoveryTimelineSegment;
import com.example.rungps.ui.components.TabUiKt;
import com.example.rungps.ui.recovery.GymAcwrCardKt;
import com.example.rungps.ui.sleep.SleepFormattersKt;
import com.example.rungps.ui.sport.SportTrackingPrefs;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u0000a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002*\u0001\u0011\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007X\u008a\u008e\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u008a\u008e\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002²\u0006\u0016\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001bX\u008a\u008e\u0002²\u0006\u0016\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001bX\u008a\u008e\u0002²\u0006\u0010\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007X\u008a\u0084\u0002"}, d2 = {"RecoveryTab", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "events", "", "Lcom/example/rungps/data/RecoveryEventEntity;", "gymSessions", "Lcom/example/rungps/data/GymSessionEntity;", "visibleEvents", "todaySteps", "Lcom/example/rungps/data/DailyStepsEntity;", "sleepRecent", "Lcom/example/rungps/data/SleepEntryEntity;", "eventDetails", "com/example/rungps/ui/tabs/RecoveryTabKt$RecoveryTab$RecoveryEventDetail", "expandedGymEventId", "", "expandedGymWhy", "", "recoveryTick", "", "gymAcwr", "Lcom/example/rungps/recovery/GymAcwrResult;", "muscleHeat", "", "", "muscleKgByGroup", "", "openSets", "Lcom/example/rungps/data/GymSetEntity;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecoveryTabKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecoveryTab$lambda$56(Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecoveryTab(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static final void RecoveryTab(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Unit unit;
        Long valueOf;
        State state;
        State state2;
        Object obj;
        MutableState mutableState;
        Object obj2;
        State state3;
        long j;
        MutableState mutableState2;
        MutableState mutableState3;
        ArrayList arrayList;
        Pair pair;
        MutableState mutableState4;
        long j2;
        DeloadAdvice deloadAdvice;
        State state4;
        Repository repository;
        Object obj3;
        Iterator it;
        MutableState mutableState5;
        DeloadAdvice deloadAdvice2;
        String timelineLabel$default;
        String title;
        State state5;
        Object obj4;
        long j3;
        int i4;
        Object obj5;
        int i5;
        int i6;
        ?? r15;
        String str;
        String str2;
        Composer startRestartGroup = composer.startRestartGroup(-860157565);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-860157565, i3, -1, "com.example.rungps.ui.tabs.RecoveryTab (RecoveryTab.kt:56)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            String displayName = SportTrackingPrefs.INSTANCE.displayName(context);
            startRestartGroup.startReplaceGroup(799546161);
            boolean changed = startRestartGroup.changed(context);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = Repository.INSTANCE.get(context);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Repository repository2 = (Repository) rememberedValue;
            startRestartGroup.endReplaceGroup();
            State collectAsState = SnapshotStateKt.collectAsState(repository2.recoveryRecentFlow(60), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState2 = SnapshotStateKt.collectAsState(repository2.gymSessionsFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            startRestartGroup.startReplaceGroup(799553607);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState6 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            Object RecoveryTab$lambda$2 = RecoveryTab$lambda$2(collectAsState2);
            Object RecoveryTab$lambda$4 = RecoveryTab$lambda$4(mutableState6);
            startRestartGroup.startReplaceGroup(799557325);
            boolean changed2 = startRestartGroup.changed(RecoveryTab$lambda$2) | startRestartGroup.changed(RecoveryTab$lambda$4);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = DeloadPlanner.advise$default(DeloadPlanner.INSTANCE, RecoveryTab$lambda$2(collectAsState2), RecoveryTab$lambda$4(mutableState6), 0L, 4, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            DeloadAdvice deloadAdvice3 = (DeloadAdvice) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            State collectAsState3 = SnapshotStateKt.collectAsState(repository2.dailyStepsFlow(LocalDate.now(ZoneId.systemDefault()).toEpochDay()), null, null, startRestartGroup, 48, 2);
            State collectAsState4 = SnapshotStateKt.collectAsState(repository2.sleepRecentFlow(7), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            startRestartGroup.startReplaceGroup(799569834);
            boolean changed3 = startRestartGroup.changed(context);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                rememberedValue4 = new HealthConnectManager(applicationContext);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            HealthConnectManager healthConnectManager = (HealthConnectManager) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(799576054);
            boolean changed4 = startRestartGroup.changed(context);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = Boolean.valueOf(repository2.isStravaConnected());
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            boolean booleanValue = ((Boolean) rememberedValue5).booleanValue();
            startRestartGroup.endReplaceGroup();
            Unit unit2 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(799580163);
            boolean changedInstance = startRestartGroup.changedInstance(repository2) | startRestartGroup.changed(booleanValue) | startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(healthConnectManager);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                unit = unit2;
                rememberedValue6 = (Function2) new RecoveryTabKt$RecoveryTab$1$1(booleanValue, repository2, healthConnectManager, context, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                unit = unit2;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 6);
            long currentTimeMillis = System.currentTimeMillis();
            List<RecoveryEventEntity> RecoveryTab$lambda$42 = RecoveryTab$lambda$4(mutableState6);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj6 : RecoveryTab$lambda$42) {
                if (((RecoveryEventEntity) obj6).getEndsAtMs() > currentTimeMillis) {
                    arrayList2.add(obj6);
                }
            }
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = arrayList3;
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                valueOf = Long.valueOf(((RecoveryEventEntity) it2.next()).getEndsAtMs());
                while (it2.hasNext()) {
                    Long valueOf2 = Long.valueOf(((RecoveryEventEntity) it2.next()).getEndsAtMs());
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
            } else {
                valueOf = null;
            }
            Long l = valueOf;
            long longValue = (l != null ? l.longValue() : currentTimeMillis) - currentTimeMillis;
            startRestartGroup.startReplaceGroup(799654063);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            MutableState mutableState7 = (MutableState) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(799657172);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            MutableState mutableState8 = (MutableState) rememberedValue8;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(799659318);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            MutableState mutableState9 = (MutableState) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            Long RecoveryTab$lambda$18 = RecoveryTab$lambda$18(mutableState8);
            startRestartGroup.startReplaceGroup(799662511);
            boolean changedInstance2 = startRestartGroup.changedInstance(repository2);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                state = collectAsState2;
                state2 = collectAsState;
                obj = (Function2) new RecoveryTabKt$RecoveryTab$2$1(mutableState8, repository2, mutableState6, mutableState9, null);
                startRestartGroup.updateRememberedValue(obj);
            } else {
                obj = rememberedValue10;
                state = collectAsState2;
                state2 = collectAsState;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(RecoveryTab$lambda$18, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj, startRestartGroup, 0);
            List<RecoveryEventEntity> RecoveryTab$lambda$1 = RecoveryTab$lambda$1(state2);
            startRestartGroup.startReplaceGroup(799682833);
            State state6 = state2;
            boolean changed5 = startRestartGroup.changed(state6) | startRestartGroup.changedInstance(repository2);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (changed5 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState6;
                obj2 = (Function2) new RecoveryTabKt$RecoveryTab$3$1(state6, repository2, mutableState, null);
                startRestartGroup.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue11;
                mutableState = mutableState6;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(RecoveryTab$lambda$1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj2, startRestartGroup, 0);
            List<RecoveryEventEntity> RecoveryTab$lambda$43 = RecoveryTab$lambda$4(mutableState);
            startRestartGroup.startReplaceGroup(799703709);
            boolean changedInstance3 = startRestartGroup.changedInstance(repository2) | startRestartGroup.changed(displayName);
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                state3 = state6;
                j = longValue;
                mutableState2 = mutableState9;
                mutableState3 = mutableState8;
                arrayList = arrayList4;
                rememberedValue12 = (Function2) new RecoveryTabKt$RecoveryTab$4$1(mutableState, repository2, displayName, mutableState7, null);
                startRestartGroup.updateRememberedValue(rememberedValue12);
            } else {
                mutableState3 = mutableState8;
                mutableState2 = mutableState9;
                arrayList = arrayList4;
                state3 = state6;
                j = longValue;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(RecoveryTab$lambda$43, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 0);
            SleepEntryEntity sleepEntryEntity = (SleepEntryEntity) CollectionsKt.firstOrNull((List) RecoveryTab$lambda$8(collectAsState4));
            if (sleepEntryEntity != null) {
                int coerceAtLeast = RangesKt.coerceAtLeast((int) ((sleepEntryEntity.getEndTimeMs() - sleepEntryEntity.getStartTimeMs()) / 60000), 1);
                Integer resolveEfficiency = SleepScoring.INSTANCE.resolveEfficiency(sleepEntryEntity.getSleepEfficiency(), sleepEntryEntity.getTotalSleepMin(), coerceAtLeast, sleepEntryEntity.getDeepSleepMin(), sleepEntryEntity.getLightSleepMin());
                Integer sleepQuality = sleepEntryEntity.getSleepQuality();
                pair = TuplesKt.to(SleepFormattersKt.formatDurationMinutes(sleepEntryEntity.getTotalSleepMin()), (sleepQuality != null ? sleepQuality.intValue() : SleepScoring.INSTANCE.resolveQuality(sleepEntryEntity.getSource(), sleepEntryEntity.getTotalSleepMin(), (r18 & 4) != 0 ? null : sleepEntryEntity.getDeepSleepMin(), (r18 & 8) != 0 ? null : sleepEntryEntity.getLightSleepMin(), (r18 & 16) != 0 ? null : resolveEfficiency, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : null)) + "/100");
            } else {
                pair = null;
            }
            SleepEntryEntity sleepEntryEntity2 = (SleepEntryEntity) CollectionsKt.firstOrNull((List) RecoveryTab$lambda$8(collectAsState4));
            Integer sleepQuality2 = sleepEntryEntity2 != null ? sleepEntryEntity2.getSleepQuality() : null;
            int size = arrayList3.size();
            Object valueOf3 = sleepEntryEntity != null ? Integer.valueOf(sleepEntryEntity.getTotalSleepMin()) : null;
            DailyStepsEntity RecoveryTab$lambda$7 = RecoveryTab$lambda$7(collectAsState3);
            Object valueOf4 = RecoveryTab$lambda$7 != null ? Long.valueOf(RecoveryTab$lambda$7.getSteps()) : null;
            startRestartGroup.startReplaceGroup(799913967);
            DeloadAdvice deloadAdvice4 = deloadAdvice3;
            boolean changed6 = startRestartGroup.changed(size) | startRestartGroup.changed(j) | startRestartGroup.changed(deloadAdvice4) | startRestartGroup.changed(sleepQuality2) | startRestartGroup.changed(valueOf3) | startRestartGroup.changed(valueOf4);
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (changed6 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                ReadyToTrain readyToTrain = ReadyToTrain.INSTANCE;
                int size2 = arrayList3.size();
                Integer valueOf5 = sleepEntryEntity != null ? Integer.valueOf(sleepEntryEntity.getTotalSleepMin()) : null;
                DailyStepsEntity RecoveryTab$lambda$72 = RecoveryTab$lambda$7(collectAsState3);
                rememberedValue13 = readyToTrain.assess(j, size2, (r19 & 4) != 0 ? 0 : 0, deloadAdvice4, sleepQuality2, valueOf5, RecoveryTab$lambda$72 != null ? Long.valueOf(RecoveryTab$lambda$72.getSteps()) : null);
                startRestartGroup.updateRememberedValue(rememberedValue13);
            }
            ReadyToTrainAssessment readyToTrainAssessment = (ReadyToTrainAssessment) rememberedValue13;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(799931789);
            Object rememberedValue14 = startRestartGroup.rememberedValue();
            if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue14);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue14;
            startRestartGroup.endReplaceGroup();
            Integer valueOf6 = Integer.valueOf(arrayList3.size());
            startRestartGroup.startReplaceGroup(799934011);
            boolean changedInstance4 = startRestartGroup.changedInstance(arrayList3);
            Object rememberedValue15 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                rememberedValue15 = (Function2) new RecoveryTabKt$RecoveryTab$5$1(arrayList3, mutableIntState, null);
                startRestartGroup.updateRememberedValue(rememberedValue15);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue15, startRestartGroup, 0);
            int RecoveryTab$lambda$29 = RecoveryTab$lambda$29(mutableIntState);
            startRestartGroup.startReplaceGroup(799939233);
            boolean changed7 = startRestartGroup.changed(RecoveryTab$lambda$29);
            Object rememberedValue16 = startRestartGroup.rememberedValue();
            if (changed7 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                rememberedValue16 = Long.valueOf(System.currentTimeMillis());
                startRestartGroup.updateRememberedValue(rememberedValue16);
            }
            long longValue2 = ((Number) rememberedValue16).longValue();
            startRestartGroup.endReplaceGroup();
            ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
            Object RecoveryTab$lambda$15 = RecoveryTab$lambda$15(mutableState7);
            startRestartGroup.startReplaceGroup(799944310);
            boolean changed8 = startRestartGroup.changed(RecoveryTab$lambda$15) | startRestartGroup.changed(arrayList3) | startRestartGroup.changed(longValue2);
            ArrayList rememberedValue17 = startRestartGroup.rememberedValue();
            if (changed8 || rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    RecoveryEventEntity recoveryEventEntity = (RecoveryEventEntity) it3.next();
                    Iterator<T> it4 = RecoveryTab$lambda$15(mutableState7).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj3 = it4.next();
                            if (((RecoveryTabKt$RecoveryTab$RecoveryEventDetail) obj3).getEvent().getId() == recoveryEventEntity.getId()) {
                                break;
                            }
                        } else {
                            obj3 = null;
                            break;
                        }
                    }
                    RecoveryTabKt$RecoveryTab$RecoveryEventDetail recoveryTabKt$RecoveryTab$RecoveryEventDetail = (RecoveryTabKt$RecoveryTab$RecoveryEventDetail) obj3;
                    if (recoveryTabKt$RecoveryTab$RecoveryEventDetail == null || (title = recoveryTabKt$RecoveryTab$RecoveryEventDetail.getTitle()) == null) {
                        it = it3;
                        mutableState5 = mutableState7;
                        deloadAdvice2 = deloadAdvice4;
                        timelineLabel$default = RecoveryEventLabels.timelineLabel$default(RecoveryEventLabels.INSTANCE, recoveryEventEntity, null, 2, null);
                    } else {
                        mutableState5 = mutableState7;
                        deloadAdvice2 = deloadAdvice4;
                        timelineLabel$default = title;
                        it = it3;
                    }
                    State state7 = state;
                    Repository repository3 = repository2;
                    long j4 = longValue2;
                    long coerceAtLeast2 = RangesKt.coerceAtLeast(recoveryEventEntity.getEndsAtMs() - longValue2, 0L);
                    String kind = recoveryEventEntity.getKind();
                    long startedAtMs = recoveryEventEntity.getStartedAtMs();
                    long endsAtMs = recoveryEventEntity.getEndsAtMs();
                    String kind2 = recoveryEventEntity.getKind();
                    arrayList5.add(new RecoveryTimelineSegment(timelineLabel$default, kind, startedAtMs, endsAtMs, Intrinsics.areEqual(kind2, "GYM") ? colorScheme.getSecondary() : Intrinsics.areEqual(kind2, "SOCCER") ? colorScheme.getTertiary() : colorScheme.getPrimary(), RecoveryEventLabels.INSTANCE.timelineSubtitle(coerceAtLeast2, recoveryEventEntity.getEndsAtMs()), null));
                    repository2 = repository3;
                    it3 = it;
                    mutableState7 = mutableState5;
                    longValue2 = j4;
                    state = state7;
                    deloadAdvice4 = deloadAdvice2;
                }
                mutableState4 = mutableState7;
                j2 = longValue2;
                deloadAdvice = deloadAdvice4;
                state4 = state;
                repository = repository2;
                rememberedValue17 = arrayList5;
                startRestartGroup.updateRememberedValue(rememberedValue17);
            } else {
                mutableState4 = mutableState7;
                j2 = longValue2;
                deloadAdvice = deloadAdvice4;
                state4 = state;
                repository = repository2;
            }
            final List list = (List) rememberedValue17;
            startRestartGroup.endReplaceGroup();
            Modifier padding = PaddingKt.padding(modifier3, PaddingKt.m677PaddingValues0680j_4(Dp.m6303constructorimpl(0)));
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
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
            MutableState mutableState10 = mutableState4;
            final long j5 = j2;
            final DeloadAdvice deloadAdvice5 = deloadAdvice;
            TabUiKt.TabHeroHeader("Recovery", arrayList3.isEmpty() ? "Fully recovered — good to train hard" : "Time until all loads clear: " + RecoveryModel.INSTANCE.formatRemaining(j), null, null, startRestartGroup, 6, 12);
            ReadyToTrainBadgeKt.ReadyToTrainBadge(readyToTrainAssessment, null, startRestartGroup, 0, 2);
            startRestartGroup.startReplaceGroup(-69502952);
            Object rememberedValue18 = startRestartGroup.rememberedValue();
            if (rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                rememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue18);
            }
            MutableState mutableState11 = (MutableState) rememberedValue18;
            startRestartGroup.endReplaceGroup();
            List<GymSessionEntity> RecoveryTab$lambda$22 = RecoveryTab$lambda$2(state4);
            startRestartGroup.startReplaceGroup(-69498822);
            State state8 = state4;
            boolean changed9 = startRestartGroup.changed(state8) | startRestartGroup.changedInstance(repository);
            Object rememberedValue19 = startRestartGroup.rememberedValue();
            if (changed9 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                rememberedValue19 = (Function2) new RecoveryTabKt$RecoveryTab$6$1$1(state8, repository, mutableState11, null);
                startRestartGroup.updateRememberedValue(rememberedValue19);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(RecoveryTab$lambda$22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue19, startRestartGroup, 0);
            final GymAcwrResult RecoveryTab$lambda$55$lambda$37 = RecoveryTab$lambda$55$lambda$37(mutableState11);
            startRestartGroup.startReplaceGroup(-69480202);
            if (RecoveryTab$lambda$55$lambda$37 != null) {
                TabUiKt.TabSectionCard("Gym load ratio", null, ComposableLambdaKt.rememberComposableLambda(-565296685, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope TabSectionCard, Composer composer2, int i8) {
                        Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                        if ((i8 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-565296685, i8, -1, "com.example.rungps.ui.tabs.RecoveryTab.<anonymous>.<anonymous> (RecoveryTab.kt:358)");
                        }
                        GymAcwrCardKt.GymAcwrCard(GymAcwrResult.this, null, composer2, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 390, 2);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-69475385);
            if (RecoveryTab$lambda$1(state3).isEmpty()) {
                state5 = state8;
                EmptyStateKt.EmptyState("No recovery events yet — log a run, gym session, or connect Strava.", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, startRestartGroup, 54, 12);
            } else {
                state5 = state8;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-69467666);
            if (arrayList3.isEmpty() && !RecoveryTab$lambda$1(state3).isEmpty()) {
                TabUiKt.TabSectionCard("How recovery works", null, ComposableSingletons$RecoveryTabKt.INSTANCE.m7626getLambda1$app_sideload(), startRestartGroup, 390, 2);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-69447802);
            Object rememberedValue20 = startRestartGroup.rememberedValue();
            if (rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                rememberedValue20 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue20);
            }
            final MutableState mutableState12 = (MutableState) rememberedValue20;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-69444889);
            Object rememberedValue21 = startRestartGroup.rememberedValue();
            if (rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                rememberedValue21 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue21);
            }
            final MutableState mutableState13 = (MutableState) rememberedValue21;
            startRestartGroup.endReplaceGroup();
            Unit unit3 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(-69441968);
            boolean changedInstance5 = startRestartGroup.changedInstance(repository);
            Object rememberedValue22 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                rememberedValue22 = (Function2) new RecoveryTabKt$RecoveryTab$6$3$1(repository, mutableState13, null);
                startRestartGroup.updateRememberedValue(rememberedValue22);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue22, startRestartGroup, 6);
            List<GymSessionEntity> RecoveryTab$lambda$23 = RecoveryTab$lambda$2(state5);
            startRestartGroup.startReplaceGroup(-69436949);
            boolean changedInstance6 = startRestartGroup.changedInstance(arrayList3) | startRestartGroup.changedInstance(repository);
            Object rememberedValue23 = startRestartGroup.rememberedValue();
            if (changedInstance6 || rememberedValue23 == Composer.INSTANCE.getEmpty()) {
                rememberedValue23 = (Function2) new RecoveryTabKt$RecoveryTab$6$4$1(arrayList3, repository, mutableState12, null);
                startRestartGroup.updateRememberedValue(rememberedValue23);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(RecoveryTab$lambda$23, arrayList3, (Function2) rememberedValue23, startRestartGroup, 0);
            Object RecoveryTab$lambda$24 = RecoveryTab$lambda$2(state5);
            startRestartGroup.startReplaceGroup(-69415655);
            boolean changed10 = startRestartGroup.changed(RecoveryTab$lambda$24);
            Object rememberedValue24 = startRestartGroup.rememberedValue();
            if (changed10 || rememberedValue24 == Composer.INSTANCE.getEmpty()) {
                Iterator<T> it5 = RecoveryTab$lambda$2(state5).iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj4 = it5.next();
                        if (((GymSessionEntity) obj4).getEndedAtMs() == null) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                GymSessionEntity gymSessionEntity = (GymSessionEntity) obj4;
                Object valueOf7 = gymSessionEntity != null ? Long.valueOf(gymSessionEntity.getId()) : null;
                startRestartGroup.updateRememberedValue(valueOf7);
                rememberedValue24 = valueOf7;
            }
            Long l2 = (Long) rememberedValue24;
            startRestartGroup.endReplaceGroup();
            List emptyList = CollectionsKt.emptyList();
            startRestartGroup.startReplaceGroup(-69407941);
            boolean changed11 = startRestartGroup.changed(l2) | startRestartGroup.changedInstance(repository);
            Object rememberedValue25 = startRestartGroup.rememberedValue();
            if (changed11 || rememberedValue25 == Composer.INSTANCE.getEmpty()) {
                rememberedValue25 = (Function2) new RecoveryTabKt$RecoveryTab$6$openSets$2$1(l2, repository, null);
                startRestartGroup.updateRememberedValue(rememberedValue25);
            }
            startRestartGroup.endReplaceGroup();
            State produceState = SnapshotStateKt.produceState(emptyList, l2, (Function2<? super ProduceStateScope<List>, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue25, startRestartGroup, 6);
            List<GymSetEntity> RecoveryTab$lambda$55$lambda$51 = RecoveryTab$lambda$55$lambda$51(produceState);
            Map<String, Float> RecoveryTab$lambda$55$lambda$41 = RecoveryTab$lambda$55$lambda$41(mutableState12);
            startRestartGroup.startReplaceGroup(-69400520);
            boolean changed12 = startRestartGroup.changed(l2) | startRestartGroup.changed(state5) | startRestartGroup.changedInstance(repository) | startRestartGroup.changed(produceState);
            Object rememberedValue26 = startRestartGroup.rememberedValue();
            if (changed12 || rememberedValue26 == Composer.INSTANCE.getEmpty()) {
                j3 = j;
                i4 = 0;
                obj5 = (Function2) new RecoveryTabKt$RecoveryTab$6$5$1(l2, state5, repository, produceState, mutableState12, null);
                startRestartGroup.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue26;
                j3 = j;
                i4 = 0;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(l2, RecoveryTab$lambda$55$lambda$51, RecoveryTab$lambda$55$lambda$41, (Function2) obj5, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-69366635);
            Collection<Float> values = RecoveryTab$lambda$55$lambda$41(mutableState12).values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator<T> it6 = values.iterator();
                while (it6.hasNext()) {
                    if (((Number) it6.next()).floatValue() > 0.01f) {
                        i5 = 54;
                        TabUiKt.TabSectionCard("Recovery load", null, ComposableLambdaKt.rememberComposableLambda(1321815162, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$7
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                invoke(columnScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(ColumnScope TabSectionCard, Composer composer2, int i8) {
                                Map RecoveryTab$lambda$55$lambda$412;
                                Map RecoveryTab$lambda$55$lambda$44;
                                Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                                if ((i8 & 17) != 16 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1321815162, i8, -1, "com.example.rungps.ui.tabs.RecoveryTab.<anonymous>.<anonymous> (RecoveryTab.kt:431)");
                                    }
                                    RecoveryTab$lambda$55$lambda$412 = RecoveryTabKt.RecoveryTab$lambda$55$lambda$41(mutableState12);
                                    MuscleHeatmapMode muscleHeatmapMode = MuscleHeatmapMode.Recovery;
                                    RecoveryTab$lambda$55$lambda$44 = RecoveryTabKt.RecoveryTab$lambda$55$lambda$44(mutableState13);
                                    MuscleHeatmapViewKt.MuscleHeatmapView(RecoveryTab$lambda$55$lambda$412, null, muscleHeatmapMode, null, RecoveryTab$lambda$55$lambda$44, 0, composer2, 384, 42);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), startRestartGroup, 390, 2);
                        break;
                    }
                }
            }
            i5 = 54;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-69355863);
            ArrayList arrayList6 = arrayList3;
            if (!arrayList6.isEmpty() && !list.isEmpty()) {
                TabUiKt.TabSectionCard(null, null, ComposableLambdaKt.rememberComposableLambda(-1634388711, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$8
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope TabSectionCard, Composer composer2, int i8) {
                        Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                        if ((i8 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1634388711, i8, -1, "com.example.rungps.ui.tabs.RecoveryTab.<anonymous>.<anonymous> (RecoveryTab.kt:440)");
                            }
                            RecoveryTimelineKt.RecoveryTimeline(list, j5, null, composer2, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, i5), startRestartGroup, 384, 3);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-69344735);
            if (arrayList6.isEmpty()) {
                i6 = i4;
                r15 = 1;
            } else {
                r15 = 1;
                i6 = i4;
                TabUiKt.m6984MetricTileyrwZFoE("Recovery time left", RecoveryModel.INSTANCE.formatRemaining(j3), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "Until your latest session is fully recovered", 0L, startRestartGroup, 3462, 16);
                TabUiKt.TabSectionCard("Why you need recovery", null, ComposableLambdaKt.rememberComposableLambda(-295625288, true, new RecoveryTabKt$RecoveryTab$6$9(mutableState10, mutableState3, mutableState2), startRestartGroup, i5), startRestartGroup, 390, 2);
            }
            startRestartGroup.endReplaceGroup();
            List createListBuilder = CollectionsKt.createListBuilder();
            DailyStepsEntity RecoveryTab$lambda$73 = RecoveryTab$lambda$7(collectAsState3);
            String str3 = "—";
            if (RecoveryTab$lambda$73 == null || (str = Long.valueOf(RecoveryTab$lambda$73.getSteps()).toString()) == null) {
                str = "—";
            }
            DailyStepsEntity RecoveryTab$lambda$74 = RecoveryTab$lambda$7(collectAsState3);
            createListBuilder.add(new Triple("Steps today", str, RecoveryTab$lambda$74 != null ? RecoveryTab$lambda$74.getSource() : null));
            if (pair != null && (str2 = (String) pair.getFirst()) != null) {
                str3 = str2;
            }
            createListBuilder.add(new Triple("Last sleep", str3, pair != null ? (String) pair.getSecond() : null));
            TabUiKt.MetricRow(null, CollectionsKt.build(createListBuilder), startRestartGroup, i6, r15);
            TabUiKt.TabSectionCard(deloadAdvice5.getHeadline(), null, ComposableLambdaKt.rememberComposableLambda(-876400434, r15, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$11
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope TabSectionCard, Composer composer2, int i8) {
                    Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                    if ((i8 & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-876400434, i8, -1, "com.example.rungps.ui.tabs.RecoveryTab.<anonymous>.<anonymous> (RecoveryTab.kt:513)");
                        }
                        TextKt.m2376Text4IGK_g(DeloadAdvice.this.getDetail(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131066);
                        if (DeloadAdvice.this.getRecommended()) {
                            long primaryContainer = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimaryContainer();
                            final DeloadAdvice deloadAdvice6 = DeloadAdvice.this;
                            SurfaceKt.m2226SurfaceT9BRK9s(null, null, primaryContainer, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-4790824, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$11.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i9) {
                                    if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-4790824, i9, -1, "com.example.rungps.ui.tabs.RecoveryTab.<anonymous>.<anonymous>.<anonymous> (RecoveryTab.kt:518)");
                                        }
                                        TextKt.m2376Text4IGK_g("Suggested: reduce volume ~" + DeloadAdvice.this.getSuggestedReductionPct() + "% this week", PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(12)), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnPrimaryContainer(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 196656, 0, 65496);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composer2, 54), composer2, 12582912, 123);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, i5), startRestartGroup, 384, 2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.tabs.RecoveryTabKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    Unit RecoveryTab$lambda$56;
                    RecoveryTab$lambda$56 = RecoveryTabKt.RecoveryTab$lambda$56(Modifier.this, i, i2, (Composer) obj7, ((Integer) obj8).intValue());
                    return RecoveryTab$lambda$56;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RecoveryEventEntity> RecoveryTab$lambda$4(MutableState<List<RecoveryEventEntity>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RecoveryTabKt$RecoveryTab$RecoveryEventDetail> RecoveryTab$lambda$15(MutableState<List<RecoveryTabKt$RecoveryTab$RecoveryEventDetail>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long RecoveryTab$lambda$18(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RecoveryTab$lambda$21(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RecoveryTab$lambda$29(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final GymAcwrResult RecoveryTab$lambda$55$lambda$37(MutableState<GymAcwrResult> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Float> RecoveryTab$lambda$55$lambda$41(MutableState<Map<String, Float>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Double> RecoveryTab$lambda$55$lambda$44(MutableState<Map<String, Double>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RecoveryEventEntity> RecoveryTab$lambda$1(State<? extends List<RecoveryEventEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GymSessionEntity> RecoveryTab$lambda$2(State<? extends List<GymSessionEntity>> state) {
        return state.getValue();
    }

    private static final DailyStepsEntity RecoveryTab$lambda$7(State<DailyStepsEntity> state) {
        return state.getValue();
    }

    private static final List<SleepEntryEntity> RecoveryTab$lambda$8(State<? extends List<SleepEntryEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GymSetEntity> RecoveryTab$lambda$55$lambda$51(State<? extends List<GymSetEntity>> state) {
        return state.getValue();
    }
}
