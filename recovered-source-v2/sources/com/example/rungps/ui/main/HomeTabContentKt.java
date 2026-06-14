package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.health.platform.client.SdkConfig;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.example.rungps.analytics.RacePredictor;
import com.example.rungps.core.domain.analytics.CombinedLoadSnapshot;
import com.example.rungps.core.domain.analytics.DailyReadinessSnapshot;
import com.example.rungps.core.domain.analytics.WeekVolumeBar;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.feature.home.HomeViewModel;
import com.example.rungps.training.DailyTrainingCoach;
import com.example.rungps.ui.components.HomeTrendCardsKt;
import com.example.rungps.ui.components.TabUiKt;
import com.example.rungps.ui.home.CapacityBudgetCardKt;
import com.example.rungps.ui.home.CombinedLoadCardKt;
import com.example.rungps.ui.home.DailyReadinessCardKt;
import com.example.rungps.ui.home.HomeMetricLoadingRowKt;
import com.example.rungps.ui.home.RacePredictorCardKt;
import com.example.rungps.ui.home.SleepDebtHomeCardKt;
import com.example.rungps.ui.home.SleepGymNudgeCardKt;
import com.example.rungps.ui.home.SleepRhythmHomeCardKt;
import com.example.rungps.ui.navigation.MoreDestination;
import com.example.rungps.ui.sport.SportTrackingPrefs;
import com.example.rungps.ui.viewmodel.MainViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HomeTabContent.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003X\u008a\u0084\u0002²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0003X\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u0084\u0002²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003X\u008a\u0084\u0002²\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003X\u008a\u0084\u0002²\u0006\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003X\u008a\u0084\u0002²\u0006\u0010\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003X\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\f\u0010 \u001a\u0004\u0018\u00010!X\u008a\u008e\u0002"}, d2 = {"HomeTabContent", "", "gymSessions", "", "Lcom/example/rungps/data/GymSessionEntity;", "goTab", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "runKmTrend", "", "rideKmTrend", "combinedLoad", "Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;", "dailyReadiness", "Lcom/example/rungps/core/domain/analytics/DailyReadinessSnapshot;", "weekBars", "Lcom/example/rungps/core/domain/analytics/WeekVolumeBar;", "runsEntities", "Lcom/example/rungps/data/RunEntity;", "recoveryHome", "Lcom/example/rungps/data/RecoveryEventEntity;", "sleepHome", "Lcom/example/rungps/data/SleepEntryEntity;", "homeCoachBrief", "Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;", "homeCoachFailed", "", "loadHeavyHome", "racePredictor", "Lcom/example/rungps/analytics/RacePredictor$Card;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeTabContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeTabContent$lambda$26(List list, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeTabContent(list, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeTabContent(final List<GymSessionEntity> gymSessions, final Function1<? super String, Unit> goTab, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        ViewModelStoreOwner current;
        CreationExtras.Empty empty;
        State state;
        State state2;
        MutableState mutableState;
        State state3;
        Object[] objArr;
        Repository repository;
        int i5;
        Object obj;
        State state4;
        Modifier modifier3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(gymSessions, "gymSessions");
        Intrinsics.checkNotNullParameter(goTab, "goTab");
        Composer startRestartGroup = composer.startRestartGroup(1416408569);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(gymSessions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(goTab) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if ((i4 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1416408569, i4, -1, "com.example.rungps.ui.main.HomeTabContent (HomeTabContent.kt:49)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                startRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(startRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
                if (current != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    empty = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    empty = CreationExtras.Empty.INSTANCE;
                }
                Modifier modifier5 = modifier4;
                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(MainViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, empty, startRestartGroup, 0, 0);
                startRestartGroup.endReplaceableGroup();
                MainViewModel mainViewModel = (MainViewModel) viewModel;
                HomeViewModel home = mainViewModel.getHome();
                Repository repository2 = mainViewModel.getRepository();
                final State collectAsState = SnapshotStateKt.collectAsState(home.getRunKmTrend4w(), null, startRestartGroup, 0, 1);
                final State collectAsState2 = SnapshotStateKt.collectAsState(home.getRideKmTrend4w(), null, startRestartGroup, 0, 1);
                final State collectAsState3 = SnapshotStateKt.collectAsState(home.getCombinedLoad(), null, startRestartGroup, 0, 1);
                final State collectAsState4 = SnapshotStateKt.collectAsState(home.getDailyReadiness(), null, startRestartGroup, 0, 1);
                final State collectAsState5 = SnapshotStateKt.collectAsState(home.getWeeklyVolume(), null, startRestartGroup, 0, 1);
                final String displayName = SportTrackingPrefs.INSTANCE.displayName(context);
                State collectAsState6 = SnapshotStateKt.collectAsState(repository2.runsFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                State collectAsState7 = SnapshotStateKt.collectAsState(repository2.recoveryRecentFlow(60), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                State collectAsState8 = SnapshotStateKt.collectAsState(repository2.sleepRecentFlow(14), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                startRestartGroup.startReplaceGroup(-833391350);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final MutableState mutableState2 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-833387010);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final MutableState mutableState3 = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-833385090);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState4 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(-833383168);
                HomeTabContentKt$HomeTabContent$1$1 rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new HomeTabContentKt$HomeTabContent$1$1(mutableState4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 6);
                Object[] objArr2 = {Boolean.valueOf(HomeTabContent$lambda$15(mutableState4)), HomeTabContent$lambda$5(collectAsState6), gymSessions, HomeTabContent$lambda$6(collectAsState7), HomeTabContent$lambda$7(collectAsState8)};
                startRestartGroup.startReplaceGroup(-833378922);
                boolean changedInstance = startRestartGroup.changedInstance(context) | startRestartGroup.changed(collectAsState6) | startRestartGroup.changedInstance(gymSessions) | startRestartGroup.changed(collectAsState7) | startRestartGroup.changed(collectAsState8);
                HomeTabContentKt$HomeTabContent$2$1 rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    state = collectAsState7;
                    state2 = collectAsState6;
                    mutableState = mutableState4;
                    state3 = collectAsState8;
                    objArr = objArr2;
                    repository = repository2;
                    i5 = i4;
                    rememberedValue5 = new HomeTabContentKt$HomeTabContent$2$1(mutableState4, context, gymSessions, state2, state, collectAsState8, mutableState2, mutableState3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                } else {
                    state = collectAsState7;
                    state2 = collectAsState6;
                    objArr = objArr2;
                    mutableState = mutableState4;
                    state3 = collectAsState8;
                    repository = repository2;
                    i5 = i4;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-833367269);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    obj = null;
                    rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                } else {
                    obj = null;
                }
                final MutableState mutableState5 = (MutableState) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                Boolean valueOf = Boolean.valueOf(HomeTabContent$lambda$15(mutableState));
                List<RunEntity> HomeTabContent$lambda$5 = HomeTabContent$lambda$5(state2);
                List<RecoveryEventEntity> HomeTabContent$lambda$6 = HomeTabContent$lambda$6(state);
                startRestartGroup.startReplaceGroup(-833362042);
                State state5 = state;
                boolean changedInstance2 = startRestartGroup.changedInstance(repository) | startRestartGroup.changed(state5);
                HomeTabContentKt$HomeTabContent$3$1 rememberedValue7 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    Repository repository3 = repository;
                    state4 = state5;
                    rememberedValue7 = new HomeTabContentKt$HomeTabContent$3$1(mutableState, repository3, state5, mutableState5, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                } else {
                    state4 = state5;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf, HomeTabContent$lambda$5, HomeTabContent$lambda$6, (Function2) rememberedValue7, startRestartGroup, 0);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, obj);
                float f = 12;
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                PaddingValues m681PaddingValuesa9UjIt4$default = PaddingKt.m681PaddingValuesa9UjIt4$default(Dp.m6303constructorimpl(f), 0.0f, Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(28), 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVertical = m564spacedBy0680j_4;
                startRestartGroup.startReplaceGroup(-833341395);
                boolean changed = startRestartGroup.changed(collectAsState4) | startRestartGroup.changed(collectAsState3) | startRestartGroup.changed(displayName);
                final State state6 = state3;
                boolean changed2 = changed | startRestartGroup.changed(state6) | ((i5 & SdkConfig.SDK_VERSION) == 32) | startRestartGroup.changedInstance(gymSessions) | startRestartGroup.changed(state4) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(collectAsState2) | startRestartGroup.changed(collectAsState5);
                Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    final State state7 = state4;
                    modifier3 = modifier5;
                    composer2 = startRestartGroup;
                    Function1 function1 = new Function1() { // from class: com.example.rungps.ui.main.HomeTabContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit HomeTabContent$lambda$25$lambda$24;
                            HomeTabContent$lambda$25$lambda$24 = HomeTabContentKt.HomeTabContent$lambda$25$lambda$24(displayName, collectAsState4, collectAsState3, state6, goTab, gymSessions, state7, mutableState2, mutableState3, collectAsState, collectAsState2, collectAsState5, mutableState5, (LazyListScope) obj2);
                            return HomeTabContent$lambda$25$lambda$24;
                        }
                    };
                    composer2.updateRememberedValue(function1);
                    rememberedValue8 = function1;
                } else {
                    modifier3 = modifier5;
                    composer2 = startRestartGroup;
                }
                composer2.endReplaceGroup();
                LazyDslKt.LazyColumn(fillMaxSize$default, null, m681PaddingValuesa9UjIt4$default, false, horizontalOrVertical, centerHorizontally, null, false, (Function1) rememberedValue8, composer2, 221568, 202);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.HomeTabContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit HomeTabContent$lambda$26;
                        HomeTabContent$lambda$26 = HomeTabContentKt.HomeTabContent$lambda$26(gymSessions, goTab, modifier2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return HomeTabContent$lambda$26;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
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
        startRestartGroup.startReplaceableGroup(1729797275);
        ComposerKt.sourceInformation(startRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DailyTrainingCoach.DailyCoachBrief HomeTabContent$lambda$9(MutableState<DailyTrainingCoach.DailyCoachBrief> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean HomeTabContent$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomeTabContent$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HomeTabContent$lambda$15(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomeTabContent$lambda$16(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final RacePredictor.Card HomeTabContent$lambda$20(MutableState<RacePredictor.Card> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeTabContent$lambda$25$lambda$24(final String str, final State state, final State state2, final State state3, final Function1 function1, final List list, final State state4, final MutableState mutableState, MutableState mutableState2, final State state5, final State state6, final State state7, MutableState mutableState3, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$HomeTabContentKt.INSTANCE.m7209getLambda1$app_sideload(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-739932220, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-739932220, i, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:103)");
                    }
                    final String str2 = str;
                    final State<DailyReadinessSnapshot> state8 = state;
                    final State<CombinedLoadSnapshot> state9 = state2;
                    TabUiKt.TabSectionCard("Today", null, ComposableLambdaKt.rememberComposableLambda(2063160419, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope TabSectionCard, Composer composer2, int i2) {
                            DailyReadinessSnapshot HomeTabContent$lambda$3;
                            CombinedLoadSnapshot HomeTabContent$lambda$2;
                            CombinedLoadSnapshot HomeTabContent$lambda$22;
                            CombinedLoadSnapshot HomeTabContent$lambda$23;
                            DailyReadinessSnapshot HomeTabContent$lambda$32;
                            Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                            if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2063160419, i2, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:104)");
                                }
                                HomeTabContent$lambda$3 = HomeTabContentKt.HomeTabContent$lambda$3(state8);
                                if (HomeTabContent$lambda$3 != null) {
                                    composer2.startReplaceGroup(-18974530);
                                    HomeTabContent$lambda$32 = HomeTabContentKt.HomeTabContent$lambda$3(state8);
                                    Intrinsics.checkNotNull(HomeTabContent$lambda$32);
                                    DailyReadinessCardKt.DailyReadinessCard(HomeTabContent$lambda$32, null, composer2, 0, 2);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(-18893031);
                                    HomeMetricLoadingRowKt.HomeMetricLoadingRow("Readiness", null, composer2, 6, 2);
                                    composer2.endReplaceGroup();
                                }
                                HomeTabContent$lambda$2 = HomeTabContentKt.HomeTabContent$lambda$2(state9);
                                if (HomeTabContent$lambda$2 != null) {
                                    composer2.startReplaceGroup(-18766830);
                                    HomeTabContent$lambda$22 = HomeTabContentKt.HomeTabContent$lambda$2(state9);
                                    Intrinsics.checkNotNull(HomeTabContent$lambda$22);
                                    CombinedLoadCardKt.CombinedLoadCard(HomeTabContent$lambda$22, str2, null, composer2, 0, 4);
                                    HomeTabContent$lambda$23 = HomeTabContentKt.HomeTabContent$lambda$2(state9);
                                    Intrinsics.checkNotNull(HomeTabContent$lambda$23);
                                    CapacityBudgetCardKt.CapacityBudgetCard(HomeTabContent$lambda$23, str2, null, composer2, 0, 4);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(-18581481);
                                    HomeMetricLoadingRowKt.HomeMetricLoadingRow("Weekly load", null, composer2, 6, 2);
                                    composer2.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composer, 54), composer, 390, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 3, null);
        if (!HomeTabContent$lambda$7(state3).isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(428270056, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) != 16 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(428270056, i, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:119)");
                        }
                        final State<List<SleepEntryEntity>> state8 = state3;
                        TabUiKt.TabSectionCard("Sleep", null, ComposableLambdaKt.rememberComposableLambda(-1668309113, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                invoke(columnScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(ColumnScope TabSectionCard, Composer composer2, int i2) {
                                List HomeTabContent$lambda$7;
                                List HomeTabContent$lambda$72;
                                List HomeTabContent$lambda$73;
                                Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                                if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1668309113, i2, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:120)");
                                    }
                                    HomeTabContent$lambda$7 = HomeTabContentKt.HomeTabContent$lambda$7(state8);
                                    SleepGymNudgeCardKt.SleepGymNudgeCard(HomeTabContent$lambda$7, null, composer2, 0, 2);
                                    HomeTabContent$lambda$72 = HomeTabContentKt.HomeTabContent$lambda$7(state8);
                                    SleepDebtHomeCardKt.SleepDebtHomeCard(HomeTabContent$lambda$72, null, composer2, 0, 2);
                                    HomeTabContent$lambda$73 = HomeTabContentKt.HomeTabContent$lambda$7(state8);
                                    SleepRhythmHomeCardKt.SleepRhythmHomeCard(HomeTabContent$lambda$73, null, composer2, 0, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, composer, 54), composer, 390, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), 3, null);
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-37997627, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                List HomeTabContent$lambda$6;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-37997627, i, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:127)");
                    }
                    Function1<String, Unit> function12 = function1;
                    List<GymSessionEntity> list2 = list;
                    HomeTabContent$lambda$6 = HomeTabContentKt.HomeTabContent$lambda$6(state4);
                    HomeRecoveryHubKt.HomeRecoveryHub(function12, list2, HomeTabContent$lambda$6, null, composer, 0, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(663936966, true, new HomeTabContentKt$HomeTabContent$4$1$4(function1)), 3, null);
        if (HomeTabContent$lambda$9(mutableState) != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1594787707, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$5

                /* compiled from: HomeTabContent.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$5$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<ColumnScope, Composer, Integer, Unit> {
                    final /* synthetic */ Function1<String, Unit> $goTab;
                    final /* synthetic */ MutableState<DailyTrainingCoach.DailyCoachBrief> $homeCoachBrief$delegate;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Function1<? super String, Unit> function1, MutableState<DailyTrainingCoach.DailyCoachBrief> mutableState) {
                        this.$goTab = function1;
                        this.$homeCoachBrief$delegate = mutableState;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                        invoke(columnScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
                        DailyTrainingCoach.DailyCoachBrief HomeTabContent$lambda$9;
                        Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                        if ((i & 17) != 16 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2067707292, i, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:139)");
                            }
                            HomeTabContent$lambda$9 = HomeTabContentKt.HomeTabContent$lambda$9(this.$homeCoachBrief$delegate);
                            Intrinsics.checkNotNull(HomeTabContent$lambda$9);
                            composer.startReplaceGroup(1800547229);
                            boolean changed = composer.changed(this.$goTab);
                            final Function1<String, Unit> function1 = this.$goTab;
                            Object rememberedValue = composer.rememberedValue();
                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004c: CONSTRUCTOR (r10v2 'rememberedValue' java.lang.Object) = (r7v1 'function1' kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> A[DONT_INLINE]) A[MD:(kotlin.jvm.functions.Function1):void (m)] (LINE:142) call: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$5$1$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR in method: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$5.1.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void, file: classes3.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$5$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 29 more
                                    */
                                /*
                                    this = this;
                                    java.lang.String r0 = "$this$TabSectionCard"
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                                    r8 = r10 & 17
                                    r0 = 16
                                    if (r8 != r0) goto L16
                                    boolean r8 = r9.getSkipping()
                                    if (r8 != 0) goto L12
                                    goto L16
                                L12:
                                    r9.skipToGroupEnd()
                                    goto L6a
                                L16:
                                    boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r8 == 0) goto L25
                                    r8 = -1
                                    java.lang.String r0 = "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:139)"
                                    r1 = -2067707292(0xffffffff84c14a64, float:-4.54424E-36)
                                    androidx.compose.runtime.ComposerKt.traceEventStart(r1, r10, r8, r0)
                                L25:
                                    androidx.compose.runtime.MutableState<com.example.rungps.training.DailyTrainingCoach$DailyCoachBrief> r8 = r7.$homeCoachBrief$delegate
                                    com.example.rungps.training.DailyTrainingCoach$DailyCoachBrief r0 = com.example.rungps.ui.main.HomeTabContentKt.access$HomeTabContent$lambda$9(r8)
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                                    r8 = 1800547229(0x6b522b9d, float:2.5408038E26)
                                    r9.startReplaceGroup(r8)
                                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r8 = r7.$goTab
                                    boolean r8 = r9.changed(r8)
                                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r7 = r7.$goTab
                                    java.lang.Object r10 = r9.rememberedValue()
                                    if (r8 != 0) goto L4a
                                    androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.INSTANCE
                                    java.lang.Object r8 = r8.getEmpty()
                                    if (r10 != r8) goto L52
                                L4a:
                                    com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$5$1$$ExternalSyntheticLambda0 r10 = new com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$5$1$$ExternalSyntheticLambda0
                                    r10.<init>(r7)
                                    r9.updateRememberedValue(r10)
                                L52:
                                    r2 = r10
                                    kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                                    r9.endReplaceGroup()
                                    r5 = 3072(0xc00, float:4.305E-42)
                                    r6 = 2
                                    r1 = 0
                                    r3 = 1
                                    r4 = r9
                                    com.example.rungps.ui.week.DailyCoachCardKt.DailyCoachCard(r0, r1, r2, r3, r4, r5, r6)
                                    boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r7 == 0) goto L6a
                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                L6a:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$5.AnonymousClass1.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Function1 function1) {
                                function1.invoke(MoreDestination.Week.getRoute());
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i & 17) != 16 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1594787707, i, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:138)");
                                }
                                TabUiKt.TabSectionCard("Coach", null, ComposableLambdaKt.rememberComposableLambda(-2067707292, true, new AnonymousClass1(function1, mutableState), composer, 54), composer, 390, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.skipToGroupEnd();
                        }
                    }), 3, null);
                } else if (HomeTabContent$lambda$12(mutableState2)) {
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2083474450, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$6

                        /* compiled from: HomeTabContent.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$6$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<ColumnScope, Composer, Integer, Unit> {
                            final /* synthetic */ Function1<String, Unit> $goTab;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(Function1<? super String, Unit> function1) {
                                this.$goTab = function1;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                                invoke(columnScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                                if ((i & 17) != 16 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1292662259, i, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:148)");
                                    }
                                    TextKt.m2376Text4IGK_g("Daily coach could not load. Open the Week tab for your training summary.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                                    composer.startReplaceGroup(1800565277);
                                    boolean changed = composer.changed(this.$goTab);
                                    final Function1<String, Unit> function1 = this.$goTab;
                                    Object rememberedValue = composer.rememberedValue();
                                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008b: CONSTRUCTOR (r2v7 'rememberedValue' java.lang.Object) = (r0v1 'function1' kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> A[DONT_INLINE]) A[MD:(kotlin.jvm.functions.Function1):void (m)] (LINE:154) call: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$6$1$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR in method: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$6.1.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void, file: classes3.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$6$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 29 more
                                            */
                                        /*
                                            this = this;
                                            r0 = r26
                                            r14 = r28
                                            r1 = r29
                                            java.lang.String r2 = "$this$TabSectionCard"
                                            r3 = r27
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                                            r2 = r1 & 17
                                            r3 = 16
                                            if (r2 != r3) goto L1f
                                            boolean r2 = r28.getSkipping()
                                            if (r2 != 0) goto L1a
                                            goto L1f
                                        L1a:
                                            r28.skipToGroupEnd()
                                            goto Lb7
                                        L1f:
                                            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                            if (r2 == 0) goto L2e
                                            r2 = -1
                                            java.lang.String r3 = "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:148)"
                                            r4 = -1292662259(0xffffffffb2f38a0d, float:-2.8351701E-8)
                                            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                                        L2e:
                                            androidx.compose.material3.MaterialTheme r1 = androidx.compose.material3.MaterialTheme.INSTANCE
                                            int r2 = androidx.compose.material3.MaterialTheme.$stable
                                            androidx.compose.material3.Typography r1 = r1.getTypography(r14, r2)
                                            androidx.compose.ui.text.TextStyle r21 = r1.getBodySmall()
                                            androidx.compose.material3.MaterialTheme r1 = androidx.compose.material3.MaterialTheme.INSTANCE
                                            int r2 = androidx.compose.material3.MaterialTheme.$stable
                                            androidx.compose.material3.ColorScheme r1 = r1.getColorScheme(r14, r2)
                                            long r3 = r1.getOnSurfaceVariant()
                                            r24 = 0
                                            r25 = 65530(0xfffa, float:9.1827E-41)
                                            java.lang.String r1 = "Daily coach could not load. Open the Week tab for your training summary."
                                            r2 = 0
                                            r5 = 0
                                            r7 = 0
                                            r8 = 0
                                            r9 = 0
                                            r10 = 0
                                            r12 = 0
                                            r13 = 0
                                            r15 = 0
                                            r14 = r15
                                            r16 = 0
                                            r17 = 0
                                            r18 = 0
                                            r19 = 0
                                            r20 = 0
                                            r23 = 6
                                            r22 = r28
                                            androidx.compose.material3.TextKt.m2376Text4IGK_g(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                                            r1 = 1800565277(0x6b52721d, float:2.544133E26)
                                            r10 = r28
                                            r10.startReplaceGroup(r1)
                                            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r0.$goTab
                                            boolean r1 = r10.changed(r1)
                                            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r0 = r0.$goTab
                                            java.lang.Object r2 = r28.rememberedValue()
                                            if (r1 != 0) goto L89
                                            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
                                            java.lang.Object r1 = r1.getEmpty()
                                            if (r2 != r1) goto L91
                                        L89:
                                            com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$6$1$$ExternalSyntheticLambda0 r2 = new com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$6$1$$ExternalSyntheticLambda0
                                            r2.<init>(r0)
                                            r10.updateRememberedValue(r2)
                                        L91:
                                            r0 = r2
                                            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                                            r28.endReplaceGroup()
                                            com.example.rungps.ui.main.ComposableSingletons$HomeTabContentKt r1 = com.example.rungps.ui.main.ComposableSingletons$HomeTabContentKt.INSTANCE
                                            kotlin.jvm.functions.Function3 r9 = r1.m7210getLambda2$app_sideload()
                                            r11 = 805306368(0x30000000, float:4.656613E-10)
                                            r12 = 510(0x1fe, float:7.15E-43)
                                            r1 = 0
                                            r2 = 0
                                            r3 = 0
                                            r4 = 0
                                            r5 = 0
                                            r6 = 0
                                            r7 = 0
                                            r8 = 0
                                            r10 = r28
                                            androidx.compose.material3.ButtonKt.TextButton(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                                            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                            if (r0 == 0) goto Lb7
                                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                                        Lb7:
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$6.AnonymousClass1.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(Function1 function1) {
                                        function1.invoke(MoreDestination.Week.getRoute());
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                    invoke(lazyItemScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope item, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                    if ((i & 17) != 16 || !composer.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2083474450, i, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:147)");
                                        }
                                        TabUiKt.TabSectionCard("Coach", null, ComposableLambdaKt.rememberComposableLambda(-1292662259, true, new AnonymousClass1(function1), composer, 54), composer, 390, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer.skipToGroupEnd();
                                }
                            }), 3, null);
                        }
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1365871559, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$7
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                invoke(lazyItemScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyItemScope item, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                if ((i & 17) != 16 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1365871559, i, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:160)");
                                    }
                                    final State<List<Double>> state8 = state5;
                                    final State<List<Double>> state9 = state6;
                                    final State<List<WeekVolumeBar>> state10 = state7;
                                    TabUiKt.TabSectionCard("Trends", null, ComposableLambdaKt.rememberComposableLambda(-126003098, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$7.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                            invoke(columnScope, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(ColumnScope TabSectionCard, Composer composer2, int i2) {
                                            List HomeTabContent$lambda$0;
                                            List HomeTabContent$lambda$1;
                                            List HomeTabContent$lambda$4;
                                            Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                                            if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-126003098, i2, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:161)");
                                                }
                                                HomeTabContent$lambda$0 = HomeTabContentKt.HomeTabContent$lambda$0(state8);
                                                HomeTabContent$lambda$1 = HomeTabContentKt.HomeTabContent$lambda$1(state9);
                                                HomeTabContent$lambda$4 = HomeTabContentKt.HomeTabContent$lambda$4(state10);
                                                List takeLast = CollectionsKt.takeLast(HomeTabContent$lambda$4, 4);
                                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(takeLast, 10));
                                                Iterator it = takeLast.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(Double.valueOf(((WeekVolumeBar) it.next()).getTonnage()));
                                                }
                                                HomeTrendCardsKt.HomeTrendCards(HomeTabContent$lambda$0, HomeTabContent$lambda$1, arrayList, null, composer2, 0, 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }, composer, 54), composer, 390, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer.skipToGroupEnd();
                            }
                        }), 3, null);
                        final RacePredictor.Card HomeTabContent$lambda$20 = HomeTabContent$lambda$20(mutableState3);
                        if (HomeTabContent$lambda$20 != null) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-534402013, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$8$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                    invoke(lazyItemScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope item, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                    if ((i & 17) != 16 || !composer.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-534402013, i, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:170)");
                                        }
                                        final RacePredictor.Card card = RacePredictor.Card.this;
                                        TabUiKt.TabSectionCard("Race predictor", null, ComposableLambdaKt.rememberComposableLambda(1656635684, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$8$1.1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                                invoke(columnScope, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(ColumnScope TabSectionCard, Composer composer2, int i2) {
                                                Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                                                if ((i2 & 17) == 16 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1656635684, i2, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:171)");
                                                }
                                                RacePredictorCardKt.RacePredictorCard(RacePredictor.Card.this, null, composer2, 0, 2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer, 54), composer, 390, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer.skipToGroupEnd();
                                }
                            }), 3, null);
                        }
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2067806152, true, new HomeTabContentKt$HomeTabContent$4$1$9(str, function1)), 3, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final List<Double> HomeTabContent$lambda$0(State<? extends List<Double>> state) {
                        return state.getValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final List<Double> HomeTabContent$lambda$1(State<? extends List<Double>> state) {
                        return state.getValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final CombinedLoadSnapshot HomeTabContent$lambda$2(State<CombinedLoadSnapshot> state) {
                        return state.getValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final DailyReadinessSnapshot HomeTabContent$lambda$3(State<DailyReadinessSnapshot> state) {
                        return state.getValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final List<WeekVolumeBar> HomeTabContent$lambda$4(State<? extends List<WeekVolumeBar>> state) {
                        return state.getValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final List<RunEntity> HomeTabContent$lambda$5(State<? extends List<RunEntity>> state) {
                        return state.getValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final List<RecoveryEventEntity> HomeTabContent$lambda$6(State<? extends List<RecoveryEventEntity>> state) {
                        return state.getValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final List<SleepEntryEntity> HomeTabContent$lambda$7(State<? extends List<SleepEntryEntity>> state) {
                        return state.getValue();
                    }
                }
