package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
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
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.DailyStepsEntity;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.SoccerSessionEntity;
import com.example.rungps.recovery.DeloadAdvice;
import com.example.rungps.recovery.DeloadPlanner;
import com.example.rungps.recovery.ReadinessInputs;
import com.example.rungps.recovery.ReadyToTrain;
import com.example.rungps.recovery.ReadyToTrainAssessment;
import com.example.rungps.recovery.RecoveryModel;
import com.example.rungps.ui.components.EmptyStateKt;
import com.example.rungps.ui.components.RecoveryTimelineKt;
import com.example.rungps.ui.components.RecoveryTimelineSegment;
import com.example.rungps.ui.components.TabUiKt;
import com.example.rungps.ui.navigation.MainTab;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HomeRecoveryHub.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u008a\u008e\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u0084\u0002²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006X\u008a\u008e\u0002"}, d2 = {"HomeRecoveryHub", "", "goTab", "Lkotlin/Function1;", "", "gymSessions", "", "Lcom/example/rungps/data/GymSessionEntity;", "recoveryEvents", "Lcom/example/rungps/data/RecoveryEventEntity;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "soccerSessions", "Lcom/example/rungps/data/SoccerSessionEntity;", "visibleEvents", "todaySteps", "Lcom/example/rungps/data/DailyStepsEntity;", "sleepRecent", "Lcom/example/rungps/data/SleepEntryEntity;", "recoveryTick", "", "timelineSegments", "Lcom/example/rungps/ui/components/RecoveryTimelineSegment;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeRecoveryHubKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeRecoveryHub$lambda$26(Function1 function1, List list, List list2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeRecoveryHub(function1, list, list2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x040a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeRecoveryHub(final Function1<? super String, Unit> goTab, final List<GymSessionEntity> gymSessions, final List<RecoveryEventEntity> recoveryEvents, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean changed;
        Object rememberedValue;
        Repository repository;
        boolean changed2;
        Object rememberedValue2;
        MutableState mutableState;
        List<SoccerSessionEntity> HomeRecoveryHub$lambda$1;
        boolean changedInstance;
        Object rememberedValue3;
        Repository repository2;
        List<SoccerSessionEntity> list;
        MutableState mutableState2;
        boolean changed3;
        Object rememberedValue4;
        int i5;
        boolean changed4;
        Object rememberedValue5;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        Long l;
        final long longValue;
        Iterator it2;
        int i6;
        boolean changed5;
        Object rememberedValue6;
        Object rememberedValue7;
        boolean changedInstance2;
        Object rememberedValue8;
        boolean changed6;
        Object rememberedValue9;
        final long longValue2;
        Object rememberedValue10;
        int i7;
        final MutableState mutableState3;
        boolean changedInstance3;
        Object rememberedValue11;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(goTab, "goTab");
        Intrinsics.checkNotNullParameter(gymSessions, "gymSessions");
        Intrinsics.checkNotNullParameter(recoveryEvents, "recoveryEvents");
        Composer startRestartGroup = composer.startRestartGroup(-1074475057);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(goTab) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(gymSessions) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(recoveryEvents) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if ((i4 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1074475057, i4, -1, "com.example.rungps.ui.main.HomeRecoveryHub (HomeRecoveryHub.kt:49)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                startRestartGroup.startReplaceGroup(-328811411);
                changed = startRestartGroup.changed(context);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = Repository.INSTANCE.get(context);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                repository = (Repository) rememberedValue;
                startRestartGroup.endReplaceGroup();
                Modifier modifier6 = modifier5;
                State collectAsState = SnapshotStateKt.collectAsState(repository.soccerSessionsFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                startRestartGroup.startReplaceGroup(-328806421);
                changed2 = startRestartGroup.changed(recoveryEvents);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ReadinessInputs.INSTANCE.filterSoccerRecoveryDedupe(recoveryEvents, HomeRecoveryHub$lambda$1(collectAsState)), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                HomeRecoveryHub$lambda$1 = HomeRecoveryHub$lambda$1(collectAsState);
                startRestartGroup.startReplaceGroup(-328800532);
                changedInstance = startRestartGroup.changedInstance(repository) | startRestartGroup.changedInstance(recoveryEvents) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(collectAsState);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    repository2 = repository;
                    list = HomeRecoveryHub$lambda$1;
                    mutableState2 = mutableState;
                    rememberedValue3 = (Function2) new HomeRecoveryHubKt$HomeRecoveryHub$1$1(repository, recoveryEvents, collectAsState, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                } else {
                    repository2 = repository;
                    list = HomeRecoveryHub$lambda$1;
                    mutableState2 = mutableState;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(recoveryEvents, list, (Function2) rememberedValue3, startRestartGroup, (i4 >> 6) & 14);
                Object HomeRecoveryHub$lambda$3 = HomeRecoveryHub$lambda$3(mutableState2);
                startRestartGroup.startReplaceGroup(-328794579);
                changed3 = startRestartGroup.changed(HomeRecoveryHub$lambda$3) | startRestartGroup.changed(gymSessions);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    i5 = 14;
                    rememberedValue4 = DeloadPlanner.advise$default(DeloadPlanner.INSTANCE, gymSessions, HomeRecoveryHub$lambda$3(mutableState2), 0L, 4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    i5 = 14;
                }
                DeloadAdvice deloadAdvice = (DeloadAdvice) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                State collectAsState2 = SnapshotStateKt.collectAsState(repository2.dailyStepsFlow(LocalDate.now(ZoneId.systemDefault()).toEpochDay()), null, null, startRestartGroup, 48, 2);
                State collectAsState3 = SnapshotStateKt.collectAsState(repository2.sleepRecentFlow(i5), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                Object HomeRecoveryHub$lambda$8 = HomeRecoveryHub$lambda$8(collectAsState3);
                startRestartGroup.startReplaceGroup(-328782931);
                changed4 = startRestartGroup.changed(HomeRecoveryHub$lambda$8);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = ReadinessInputs.lastNightSleep$default(ReadinessInputs.INSTANCE, HomeRecoveryHub$lambda$8(collectAsState3), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                ReadinessInputs.LastNight lastNight = (ReadinessInputs.LastNight) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                long currentTimeMillis = System.currentTimeMillis();
                List<RecoveryEventEntity> HomeRecoveryHub$lambda$32 = HomeRecoveryHub$lambda$3(mutableState2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : HomeRecoveryHub$lambda$32) {
                    if (((RecoveryEventEntity) obj).getEndsAtMs() > currentTimeMillis) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = arrayList3;
                arrayList2 = arrayList;
                it = arrayList2.iterator();
                if (it.hasNext()) {
                    l = null;
                } else {
                    Long valueOf = Long.valueOf(((RecoveryEventEntity) it.next()).getEndsAtMs());
                    while (it.hasNext()) {
                        Iterator it3 = it;
                        Long valueOf2 = Long.valueOf(((RecoveryEventEntity) it.next()).getEndsAtMs());
                        if (valueOf.compareTo(valueOf2) < 0) {
                            valueOf = valueOf2;
                        }
                        it = it3;
                    }
                    l = valueOf;
                }
                Long l2 = l;
                longValue = (l2 == null ? l2.longValue() : currentTimeMillis) - currentTimeMillis;
                if ((arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                    it2 = arrayList2.iterator();
                    i6 = 0;
                    while (it2.hasNext()) {
                        Iterator it4 = it2;
                        if (Intrinsics.areEqual(((RecoveryEventEntity) it2.next()).getKind(), "SOCCER") && (i6 = i6 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                        it2 = it4;
                    }
                } else {
                    i6 = 0;
                }
                int size = arrayList.size();
                Object quality = lastNight.getQuality();
                Object totalSleepMin = lastNight.getTotalSleepMin();
                DailyStepsEntity HomeRecoveryHub$lambda$7 = HomeRecoveryHub$lambda$7(collectAsState2);
                Object valueOf3 = HomeRecoveryHub$lambda$7 == null ? Long.valueOf(HomeRecoveryHub$lambda$7.getSteps()) : null;
                startRestartGroup.startReplaceGroup(-328771594);
                changed5 = startRestartGroup.changed(size) | startRestartGroup.changed(longValue) | startRestartGroup.changed(i6) | startRestartGroup.changed(deloadAdvice) | startRestartGroup.changed(quality) | startRestartGroup.changed(totalSleepMin) | startRestartGroup.changed(valueOf3);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    ReadyToTrain readyToTrain = ReadyToTrain.INSTANCE;
                    int size2 = arrayList.size();
                    Integer quality2 = lastNight.getQuality();
                    Integer totalSleepMin2 = lastNight.getTotalSleepMin();
                    DailyStepsEntity HomeRecoveryHub$lambda$72 = HomeRecoveryHub$lambda$7(collectAsState2);
                    rememberedValue6 = readyToTrain.assess(longValue, size2, i6, deloadAdvice, quality2, totalSleepMin2, HomeRecoveryHub$lambda$72 == null ? Long.valueOf(HomeRecoveryHub$lambda$72.getSteps()) : null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                ReadyToTrainAssessment readyToTrainAssessment = (ReadyToTrainAssessment) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-328756439);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                MutableIntState mutableIntState = (MutableIntState) rememberedValue7;
                startRestartGroup.endReplaceGroup();
                Integer valueOf4 = Integer.valueOf(arrayList.size());
                startRestartGroup.startReplaceGroup(-328754216);
                changedInstance2 = startRestartGroup.changedInstance(arrayList);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = (Function2) new HomeRecoveryHubKt$HomeRecoveryHub$2$1(arrayList, mutableIntState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, startRestartGroup, 0);
                int HomeRecoveryHub$lambda$15 = HomeRecoveryHub$lambda$15(mutableIntState);
                startRestartGroup.startReplaceGroup(-328748963);
                changed6 = startRestartGroup.changed(HomeRecoveryHub$lambda$15);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!changed6 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = Long.valueOf(System.currentTimeMillis());
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                longValue2 = ((Number) rememberedValue9).longValue();
                startRestartGroup.endReplaceGroup();
                ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                startRestartGroup.startReplaceGroup(-328744945);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 != Composer.INSTANCE.getEmpty()) {
                    i7 = i4;
                    rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                } else {
                    i7 = i4;
                }
                mutableState3 = (MutableState) rememberedValue10;
                startRestartGroup.endReplaceGroup();
                Long valueOf5 = Long.valueOf(longValue2);
                startRestartGroup.startReplaceGroup(-328740442);
                changedInstance3 = startRestartGroup.changedInstance(arrayList) | startRestartGroup.changedInstance(repository2) | startRestartGroup.changed(longValue2) | startRestartGroup.changed(colorScheme);
                rememberedValue11 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = (Function2) new HomeRecoveryHubKt$HomeRecoveryHub$3$1(arrayList, repository2, longValue2, colorScheme, mutableState3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(arrayList, valueOf5, (Function2) rememberedValue11, startRestartGroup, 0);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(16));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier6);
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
                TabUiKt.TabSectionCard("Recovery", null, ComposableLambdaKt.rememberComposableLambda(-1456183142, true, new HomeRecoveryHubKt$HomeRecoveryHub$4$1(readyToTrainAssessment, deloadAdvice, goTab, lastNight, collectAsState3, collectAsState2), startRestartGroup, 54), startRestartGroup, 390, 2);
                if (arrayList.isEmpty()) {
                    startRestartGroup.startReplaceGroup(735830068);
                    TabUiKt.TabSectionCard("Clearing", null, ComposableLambdaKt.rememberComposableLambda(-369397729, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.HomeRecoveryHubKt$HomeRecoveryHub$4$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope TabSectionCard, Composer composer3, int i9) {
                            List HomeRecoveryHub$lambda$20;
                            Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                            if ((i9 & 17) != 16 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-369397729, i9, -1, "com.example.rungps.ui.main.HomeRecoveryHub.<anonymous>.<anonymous> (HomeRecoveryHub.kt:166)");
                                }
                                TextKt.m2376Text4IGK_g(RecoveryModel.INSTANCE.formatRemaining(longValue), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getHeadlineSmall(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                                HomeRecoveryHub$lambda$20 = HomeRecoveryHubKt.HomeRecoveryHub$lambda$20(mutableState3);
                                RecoveryTimelineKt.RecoveryTimeline(HomeRecoveryHub$lambda$20, longValue2, null, composer3, 0, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), startRestartGroup, 390, 2);
                    startRestartGroup.endReplaceGroup();
                    modifier3 = modifier6;
                    composer2 = startRestartGroup;
                } else if (HomeRecoveryHub$lambda$3(mutableState2).isEmpty()) {
                    startRestartGroup.startReplaceGroup(736249591);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(300850371);
                    boolean z = (i7 & 14) == 4;
                    Object rememberedValue12 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue12 = new Function0() { // from class: com.example.rungps.ui.main.HomeRecoveryHubKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit HomeRecoveryHub$lambda$25$lambda$24$lambda$23;
                                HomeRecoveryHub$lambda$25$lambda$24$lambda$23 = HomeRecoveryHubKt.HomeRecoveryHub$lambda$25$lambda$24$lambda$23(Function1.this);
                                return HomeRecoveryHub$lambda$25$lambda$24$lambda$23;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue12);
                    }
                    Function0 function0 = (Function0) rememberedValue12;
                    startRestartGroup.endReplaceGroup();
                    modifier3 = modifier6;
                    composer2 = startRestartGroup;
                    EmptyStateKt.EmptyState("Log training to see recovery timelines and readiness scores.", fillMaxWidth$default, "Record run", function0, startRestartGroup, 438, 0);
                    composer2.endReplaceGroup();
                } else {
                    modifier3 = modifier6;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(736530203);
                    composer2.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.HomeRecoveryHubKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit HomeRecoveryHub$lambda$26;
                        HomeRecoveryHub$lambda$26 = HomeRecoveryHubKt.HomeRecoveryHub$lambda$26(Function1.this, gymSessions, recoveryEvents, modifier4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return HomeRecoveryHub$lambda$26;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context2 = (Context) consume2;
        startRestartGroup.startReplaceGroup(-328811411);
        changed = startRestartGroup.changed(context2);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = Repository.INSTANCE.get(context2);
        startRestartGroup.updateRememberedValue(rememberedValue);
        repository = (Repository) rememberedValue;
        startRestartGroup.endReplaceGroup();
        Modifier modifier62 = modifier5;
        State collectAsState4 = SnapshotStateKt.collectAsState(repository.soccerSessionsFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
        startRestartGroup.startReplaceGroup(-328806421);
        changed2 = startRestartGroup.changed(recoveryEvents);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ReadinessInputs.INSTANCE.filterSoccerRecoveryDedupe(recoveryEvents, HomeRecoveryHub$lambda$1(collectAsState4)), null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        HomeRecoveryHub$lambda$1 = HomeRecoveryHub$lambda$1(collectAsState4);
        startRestartGroup.startReplaceGroup(-328800532);
        changedInstance = startRestartGroup.changedInstance(repository) | startRestartGroup.changedInstance(recoveryEvents) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(collectAsState4);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        repository2 = repository;
        list = HomeRecoveryHub$lambda$1;
        mutableState2 = mutableState;
        rememberedValue3 = (Function2) new HomeRecoveryHubKt$HomeRecoveryHub$1$1(repository, recoveryEvents, collectAsState4, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(recoveryEvents, list, (Function2) rememberedValue3, startRestartGroup, (i4 >> 6) & 14);
        Object HomeRecoveryHub$lambda$33 = HomeRecoveryHub$lambda$3(mutableState2);
        startRestartGroup.startReplaceGroup(-328794579);
        changed3 = startRestartGroup.changed(HomeRecoveryHub$lambda$33) | startRestartGroup.changed(gymSessions);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (changed3) {
        }
        i5 = 14;
        rememberedValue4 = DeloadPlanner.advise$default(DeloadPlanner.INSTANCE, gymSessions, HomeRecoveryHub$lambda$3(mutableState2), 0L, 4, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        DeloadAdvice deloadAdvice2 = (DeloadAdvice) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        State collectAsState22 = SnapshotStateKt.collectAsState(repository2.dailyStepsFlow(LocalDate.now(ZoneId.systemDefault()).toEpochDay()), null, null, startRestartGroup, 48, 2);
        State collectAsState32 = SnapshotStateKt.collectAsState(repository2.sleepRecentFlow(i5), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
        Object HomeRecoveryHub$lambda$82 = HomeRecoveryHub$lambda$8(collectAsState32);
        startRestartGroup.startReplaceGroup(-328782931);
        changed4 = startRestartGroup.changed(HomeRecoveryHub$lambda$82);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue5 = ReadinessInputs.lastNightSleep$default(ReadinessInputs.INSTANCE, HomeRecoveryHub$lambda$8(collectAsState32), null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        ReadinessInputs.LastNight lastNight2 = (ReadinessInputs.LastNight) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        long currentTimeMillis2 = System.currentTimeMillis();
        List<RecoveryEventEntity> HomeRecoveryHub$lambda$322 = HomeRecoveryHub$lambda$3(mutableState2);
        ArrayList arrayList32 = new ArrayList();
        while (r3.hasNext()) {
        }
        arrayList = arrayList32;
        arrayList2 = arrayList;
        it = arrayList2.iterator();
        if (it.hasNext()) {
        }
        Long l22 = l;
        longValue = (l22 == null ? l22.longValue() : currentTimeMillis2) - currentTimeMillis2;
        if (arrayList2 instanceof Collection) {
        }
        it2 = arrayList2.iterator();
        i6 = 0;
        while (it2.hasNext()) {
        }
        int size3 = arrayList.size();
        Object quality3 = lastNight2.getQuality();
        Object totalSleepMin3 = lastNight2.getTotalSleepMin();
        DailyStepsEntity HomeRecoveryHub$lambda$73 = HomeRecoveryHub$lambda$7(collectAsState22);
        if (HomeRecoveryHub$lambda$73 == null) {
        }
        startRestartGroup.startReplaceGroup(-328771594);
        changed5 = startRestartGroup.changed(size3) | startRestartGroup.changed(longValue) | startRestartGroup.changed(i6) | startRestartGroup.changed(deloadAdvice2) | startRestartGroup.changed(quality3) | startRestartGroup.changed(totalSleepMin3) | startRestartGroup.changed(valueOf3);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed5) {
        }
        ReadyToTrain readyToTrain2 = ReadyToTrain.INSTANCE;
        int size22 = arrayList.size();
        Integer quality22 = lastNight2.getQuality();
        Integer totalSleepMin22 = lastNight2.getTotalSleepMin();
        DailyStepsEntity HomeRecoveryHub$lambda$722 = HomeRecoveryHub$lambda$7(collectAsState22);
        rememberedValue6 = readyToTrain2.assess(longValue, size22, i6, deloadAdvice2, quality22, totalSleepMin22, HomeRecoveryHub$lambda$722 == null ? Long.valueOf(HomeRecoveryHub$lambda$722.getSteps()) : null);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        ReadyToTrainAssessment readyToTrainAssessment2 = (ReadyToTrainAssessment) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-328756439);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
        }
        MutableIntState mutableIntState2 = (MutableIntState) rememberedValue7;
        startRestartGroup.endReplaceGroup();
        Integer valueOf42 = Integer.valueOf(arrayList.size());
        startRestartGroup.startReplaceGroup(-328754216);
        changedInstance2 = startRestartGroup.changedInstance(arrayList);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue8 = (Function2) new HomeRecoveryHubKt$HomeRecoveryHub$2$1(arrayList, mutableIntState2, null);
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf42, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, startRestartGroup, 0);
        int HomeRecoveryHub$lambda$152 = HomeRecoveryHub$lambda$15(mutableIntState2);
        startRestartGroup.startReplaceGroup(-328748963);
        changed6 = startRestartGroup.changed(HomeRecoveryHub$lambda$152);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!changed6) {
        }
        rememberedValue9 = Long.valueOf(System.currentTimeMillis());
        startRestartGroup.updateRememberedValue(rememberedValue9);
        longValue2 = ((Number) rememberedValue9).longValue();
        startRestartGroup.endReplaceGroup();
        ColorScheme colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
        startRestartGroup.startReplaceGroup(-328744945);
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (rememberedValue10 != Composer.INSTANCE.getEmpty()) {
        }
        mutableState3 = (MutableState) rememberedValue10;
        startRestartGroup.endReplaceGroup();
        Long valueOf52 = Long.valueOf(longValue2);
        startRestartGroup.startReplaceGroup(-328740442);
        changedInstance3 = startRestartGroup.changedInstance(arrayList) | startRestartGroup.changedInstance(repository2) | startRestartGroup.changed(longValue2) | startRestartGroup.changed(colorScheme2);
        rememberedValue11 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue11 = (Function2) new HomeRecoveryHubKt$HomeRecoveryHub$3$1(arrayList, repository2, longValue2, colorScheme2, mutableState3, null);
        startRestartGroup.updateRememberedValue(rememberedValue11);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(arrayList, valueOf52, (Function2) rememberedValue11, startRestartGroup, 0);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(16));
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, centerHorizontally2, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier62);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        TabUiKt.TabSectionCard("Recovery", null, ComposableLambdaKt.rememberComposableLambda(-1456183142, true, new HomeRecoveryHubKt$HomeRecoveryHub$4$1(readyToTrainAssessment2, deloadAdvice2, goTab, lastNight2, collectAsState32, collectAsState22), startRestartGroup, 54), startRestartGroup, 390, 2);
        if (arrayList.isEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final List<RecoveryEventEntity> HomeRecoveryHub$lambda$3(MutableState<List<RecoveryEventEntity>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int HomeRecoveryHub$lambda$15(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RecoveryTimelineSegment> HomeRecoveryHub$lambda$20(MutableState<List<RecoveryTimelineSegment>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeRecoveryHub$lambda$25$lambda$24$lambda$23(Function1 function1) {
        function1.invoke(MainTab.Run.getRoute());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SoccerSessionEntity> HomeRecoveryHub$lambda$1(State<? extends List<SoccerSessionEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DailyStepsEntity HomeRecoveryHub$lambda$7(State<DailyStepsEntity> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SleepEntryEntity> HomeRecoveryHub$lambda$8(State<? extends List<SleepEntryEntity>> state) {
        return state.getValue();
    }
}
