package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.BuildConfig;
import com.example.rungps.analytics.BikeRideStats;
import com.example.rungps.analytics.BikeStats;
import com.example.rungps.data.GearEntity;
import com.example.rungps.data.PointEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.RunHrSampleEntity;
import com.example.rungps.data.RunSplitEntity;
import com.example.rungps.data.SpotifyTimelineEntity;
import com.example.rungps.gear.ActivityTitleGenerator;
import com.example.rungps.tracking.ActivityTypes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RunDetailsPanel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.RunDetailsPanelKt$RunDetailsPanel$1$1", f = "RunDetailsPanel.kt", i = {0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6}, l = {103, 104, 105, 106, BuildConfig.VERSION_CODE, MenuKt.InTransitionDuration, 121}, m = "invokeSuspend", n = {"repo", "repo", "run", "repo", "run", "pts", "repo", "run", "pts", "hr", "repo", "run", "pts", "hr", "sp", "repo", "run", "pts", "repo", "run", "pts", "destination$iv$iv"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
final class RunDetailsPanelKt$RunDetailsPanel$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $editDescription$delegate;
    final /* synthetic */ MutableState<String> $editPrivateNotes$delegate;
    final /* synthetic */ MutableState<String> $editTitle$delegate;
    final /* synthetic */ MutableState<Integer> $endIdx$delegate;
    final /* synthetic */ MutableState<String> $endOffsetText$delegate;
    final /* synthetic */ MutableState<List<GearEntity>> $gearOptions$delegate;
    final /* synthetic */ MutableState<String> $header$delegate;
    final /* synthetic */ MutableState<List<RunHrSampleEntity>> $hrSamples$delegate;
    final /* synthetic */ MutableState<Boolean> $isBike$delegate;
    final /* synthetic */ MutableState<Map<Long, Double>> $kmByGearId$delegate;
    final /* synthetic */ MutableState<List<PointEntity>> $points$delegate;
    final /* synthetic */ long $runId;
    final /* synthetic */ MutableState<Long> $selectedGearId$delegate;
    final /* synthetic */ MutableState<List<RunSplitEntity>> $splits$delegate;
    final /* synthetic */ MutableState<List<SpotifyTimelineEntity>> $spotify$delegate;
    final /* synthetic */ MutableState<Integer> $startIdx$delegate;
    final /* synthetic */ MutableState<String> $startOffsetText$delegate;
    final /* synthetic */ MutableState<Long> $startedAtMs$delegate;
    final /* synthetic */ MutableState<String> $sub$delegate;
    final /* synthetic */ MutableState<Double> $totalDistanceM$delegate;
    final /* synthetic */ MutableState<Long> $totalDurationMs$delegate;
    final /* synthetic */ MutableState<Long> $watchImportId$delegate;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunDetailsPanelKt$RunDetailsPanel$1$1(Context context, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<List<PointEntity>> mutableState3, MutableState<List<RunSplitEntity>> mutableState4, MutableState<Long> mutableState5, MutableState<Boolean> mutableState6, long j, MutableState<List<RunHrSampleEntity>> mutableState7, MutableState<List<SpotifyTimelineEntity>> mutableState8, MutableState<Long> mutableState9, MutableState<String> mutableState10, MutableState<String> mutableState11, MutableState<String> mutableState12, MutableState<Long> mutableState13, MutableState<List<GearEntity>> mutableState14, MutableState<Map<Long, Double>> mutableState15, MutableState<Double> mutableState16, MutableState<Long> mutableState17, MutableState<Integer> mutableState18, MutableState<Integer> mutableState19, MutableState<String> mutableState20, MutableState<String> mutableState21, Continuation<? super RunDetailsPanelKt$RunDetailsPanel$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$header$delegate = mutableState;
        this.$sub$delegate = mutableState2;
        this.$points$delegate = mutableState3;
        this.$splits$delegate = mutableState4;
        this.$watchImportId$delegate = mutableState5;
        this.$isBike$delegate = mutableState6;
        this.$runId = j;
        this.$hrSamples$delegate = mutableState7;
        this.$spotify$delegate = mutableState8;
        this.$startedAtMs$delegate = mutableState9;
        this.$editTitle$delegate = mutableState10;
        this.$editDescription$delegate = mutableState11;
        this.$editPrivateNotes$delegate = mutableState12;
        this.$selectedGearId$delegate = mutableState13;
        this.$gearOptions$delegate = mutableState14;
        this.$kmByGearId$delegate = mutableState15;
        this.$totalDistanceM$delegate = mutableState16;
        this.$totalDurationMs$delegate = mutableState17;
        this.$startIdx$delegate = mutableState18;
        this.$endIdx$delegate = mutableState19;
        this.$startOffsetText$delegate = mutableState20;
        this.$endOffsetText$delegate = mutableState21;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunDetailsPanelKt$RunDetailsPanel$1$1(this.$ctx, this.$header$delegate, this.$sub$delegate, this.$points$delegate, this.$splits$delegate, this.$watchImportId$delegate, this.$isBike$delegate, this.$runId, this.$hrSamples$delegate, this.$spotify$delegate, this.$startedAtMs$delegate, this.$editTitle$delegate, this.$editDescription$delegate, this.$editPrivateNotes$delegate, this.$selectedGearId$delegate, this.$gearOptions$delegate, this.$kmByGearId$delegate, this.$totalDistanceM$delegate, this.$totalDurationMs$delegate, this.$startIdx$delegate, this.$endIdx$delegate, this.$startOffsetText$delegate, this.$endOffsetText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunDetailsPanelKt$RunDetailsPanel$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0133  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x02a4 -> B:7:0x02a5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Repository repository;
        Object withContext;
        Object withContext2;
        Repository repository2;
        RunEntity runEntity;
        Object withContext3;
        RunEntity runEntity2;
        Repository repository3;
        List<PointEntity> list;
        Object withContext4;
        Repository repository4;
        List list2;
        String str;
        Object withContext5;
        List<PointEntity> list3;
        List list4;
        List list5;
        MutableState<List<GearEntity>> mutableState;
        Object activeGearForActivity;
        RunEntity runEntity3;
        Repository repository5;
        MutableState<Map<Long, Double>> mutableState2;
        List RunDetailsPanel$lambda$61;
        RunEntity runEntity4;
        Repository repository6;
        Map linkedHashMap;
        Iterator it;
        List<PointEntity> list6;
        String str2;
        Long boxLong;
        Object gearTotalKm;
        Map map;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.$header$delegate.setValue("Loading…");
                this.$sub$delegate.setValue("");
                this.$points$delegate.setValue(CollectionsKt.emptyList());
                this.$splits$delegate.setValue(CollectionsKt.emptyList());
                this.$watchImportId$delegate.setValue(null);
                RunDetailsPanelKt.RunDetailsPanel$lambda$44(this.$isBike$delegate, false);
                repository = Repository.INSTANCE.get(this.$ctx);
                this.L$0 = repository;
                this.label = 1;
                withContext = BuildersKt.withContext(Dispatchers.getIO(), new RunDetailsPanelKt$RunDetailsPanel$1$1$run$1(repository, this.$runId, null), this);
                if (withContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                RunEntity runEntity5 = (RunEntity) withContext;
                this.L$0 = repository;
                this.L$1 = runEntity5;
                this.label = 2;
                withContext2 = BuildersKt.withContext(Dispatchers.getIO(), new RunDetailsPanelKt$RunDetailsPanel$1$1$pts$1(repository, this.$runId, null), this);
                if (withContext2 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                repository2 = repository;
                runEntity = runEntity5;
                List<PointEntity> list7 = (List) withContext2;
                this.L$0 = repository2;
                this.L$1 = runEntity;
                this.L$2 = list7;
                this.label = 3;
                withContext3 = BuildersKt.withContext(Dispatchers.getIO(), new RunDetailsPanelKt$RunDetailsPanel$1$1$hr$1(repository2, this.$runId, null), this);
                if (withContext3 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                runEntity2 = runEntity;
                repository3 = repository2;
                list = list7;
                List list8 = (List) withContext3;
                this.L$0 = repository3;
                this.L$1 = runEntity2;
                this.L$2 = list;
                this.L$3 = list8;
                this.label = 4;
                withContext4 = BuildersKt.withContext(Dispatchers.getIO(), new RunDetailsPanelKt$RunDetailsPanel$1$1$sp$1(repository3, this.$runId, null), this);
                if (withContext4 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                repository4 = repository3;
                list2 = list8;
                List list9 = (List) withContext4;
                str = "";
                this.L$0 = repository4;
                this.L$1 = runEntity2;
                this.L$2 = list;
                this.L$3 = list2;
                this.L$4 = list9;
                this.label = 5;
                withContext5 = BuildersKt.withContext(Dispatchers.getIO(), new RunDetailsPanelKt$RunDetailsPanel$1$1$st$1(repository4, this.$runId, null), this);
                if (withContext5 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                list3 = list;
                list4 = list2;
                list5 = list9;
                this.$points$delegate.setValue(list3);
                this.$hrSamples$delegate.setValue(list4);
                this.$splits$delegate.setValue(list5);
                this.$spotify$delegate.setValue((List) withContext5);
                if (runEntity2 != null) {
                    this.$header$delegate.setValue("Run not found");
                    return Unit.INSTANCE;
                }
                this.$startedAtMs$delegate.setValue(Boxing.boxLong(runEntity2.getStartedAtMs()));
                this.$watchImportId$delegate.setValue(runEntity2.getWatchImportId());
                RunDetailsPanelKt.RunDetailsPanel$lambda$44(this.$isBike$delegate, ActivityTypes.INSTANCE.isBike(runEntity2.getActivityType()));
                this.$editTitle$delegate.setValue(ActivityTitleGenerator.displayTitle$default(ActivityTitleGenerator.INSTANCE, runEntity2, null, 2, null));
                MutableState<String> mutableState3 = this.$editDescription$delegate;
                String description = runEntity2.getDescription();
                if (description == null) {
                    description = str;
                }
                mutableState3.setValue(description);
                MutableState<String> mutableState4 = this.$editPrivateNotes$delegate;
                String privateNotes = runEntity2.getPrivateNotes();
                if (privateNotes == null) {
                    privateNotes = str;
                }
                mutableState4.setValue(privateNotes);
                this.$selectedGearId$delegate.setValue(runEntity2.getGearId());
                mutableState = this.$gearOptions$delegate;
                this.L$0 = repository4;
                this.L$1 = runEntity2;
                this.L$2 = list3;
                this.L$3 = mutableState;
                this.L$4 = null;
                this.label = 6;
                activeGearForActivity = repository4.activeGearForActivity(runEntity2.getActivityType(), this);
                if (activeGearForActivity == coroutine_suspended) {
                    return coroutine_suspended;
                }
                runEntity3 = runEntity2;
                repository5 = repository4;
                mutableState.setValue((List) activeGearForActivity);
                mutableState2 = this.$kmByGearId$delegate;
                RunDetailsPanel$lambda$61 = RunDetailsPanelKt.RunDetailsPanel$lambda$61(this.$gearOptions$delegate);
                List list10 = RunDetailsPanel$lambda$61;
                runEntity4 = runEntity3;
                repository6 = repository5;
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list10, 10)), 16));
                it = list10.iterator();
                list6 = list3;
                if (!it.hasNext()) {
                    GearEntity gearEntity = (GearEntity) it.next();
                    boxLong = Boxing.boxLong(gearEntity.getId());
                    long id = gearEntity.getId();
                    this.L$0 = repository6;
                    this.L$1 = runEntity4;
                    this.L$2 = list6;
                    this.L$3 = linkedHashMap;
                    this.L$4 = it;
                    this.L$5 = linkedHashMap;
                    this.L$6 = boxLong;
                    this.L$7 = mutableState2;
                    this.label = 7;
                    gearTotalKm = repository6.gearTotalKm(id, this);
                    if (gearTotalKm == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map = linkedHashMap;
                    Pair pair = TuplesKt.to(boxLong, gearTotalKm);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    linkedHashMap = map;
                    if (!it.hasNext()) {
                        mutableState2.setValue(linkedHashMap);
                        RunDetailsPanelKt.RunDetailsPanel$lambda$71(this.$totalDistanceM$delegate, runEntity4.getTotalDistanceM());
                        RunDetailsPanelKt.RunDetailsPanel$lambda$74(this.$totalDurationMs$delegate, runEntity4.getTotalDurationMs());
                        double totalDistanceM = runEntity4.getTotalDistanceM() / 1000.0d;
                        String formatPace = totalDistanceM >= 0.01d ? MainActivityFormattersKt.formatPace((runEntity4.getTotalDurationMs() / 1000.0d) / totalDistanceM) : "—";
                        String displayTitle$default = ActivityTitleGenerator.displayTitle$default(ActivityTitleGenerator.INSTANCE, runEntity4, null, 2, null);
                        MutableState<String> mutableState5 = this.$header$delegate;
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format(Locale.US, "%s · %.2f km · %s", Arrays.copyOf(new Object[]{displayTitle$default, Boxing.boxDouble(totalDistanceM), MainActivityFormattersKt.formatElapsed(runEntity4.getTotalDurationMs())}, 3));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        mutableState5.setValue(format);
                        MutableState<String> mutableState6 = this.$sub$delegate;
                        if (ActivityTypes.INSTANCE.isBike(runEntity4.getActivityType())) {
                            BikeRideStats compute = BikeStats.INSTANCE.compute(runEntity4, list6);
                            StringBuilder sb = new StringBuilder();
                            sb.append("Avg pace: " + formatPace);
                            if (compute != null) {
                                sb.append(" · " + BikeStats.INSTANCE.summaryLine(compute));
                            }
                            str2 = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
                        } else {
                            str2 = "Pace: " + formatPace;
                        }
                        mutableState6.setValue(str2);
                        RunDetailsPanelKt.RunDetailsPanel$lambda$22(this.$startIdx$delegate, 0);
                        RunDetailsPanelKt.RunDetailsPanel$lambda$26(this.$endIdx$delegate, RangesKt.coerceAtLeast(list6.size() - 1, 0));
                        this.$startOffsetText$delegate.setValue("0:00");
                        MutableState<String> mutableState7 = this.$endOffsetText$delegate;
                        PointEntity pointEntity = (PointEntity) CollectionsKt.lastOrNull((List) list6);
                        long timeMs = pointEntity != null ? pointEntity.getTimeMs() : runEntity4.getStartedAtMs();
                        PointEntity pointEntity2 = (PointEntity) CollectionsKt.firstOrNull((List) list6);
                        mutableState7.setValue(MainActivityFormattersKt.formatElapsed(timeMs - (pointEntity2 != null ? pointEntity2.getTimeMs() : runEntity4.getStartedAtMs())));
                        return Unit.INSTANCE;
                    }
                }
            case 1:
                repository = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                withContext = obj;
                RunEntity runEntity52 = (RunEntity) withContext;
                this.L$0 = repository;
                this.L$1 = runEntity52;
                this.label = 2;
                withContext2 = BuildersKt.withContext(Dispatchers.getIO(), new RunDetailsPanelKt$RunDetailsPanel$1$1$pts$1(repository, this.$runId, null), this);
                if (withContext2 != coroutine_suspended) {
                }
                break;
            case 2:
                runEntity = (RunEntity) this.L$1;
                repository2 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                withContext2 = obj;
                List<PointEntity> list72 = (List) withContext2;
                this.L$0 = repository2;
                this.L$1 = runEntity;
                this.L$2 = list72;
                this.label = 3;
                withContext3 = BuildersKt.withContext(Dispatchers.getIO(), new RunDetailsPanelKt$RunDetailsPanel$1$1$hr$1(repository2, this.$runId, null), this);
                if (withContext3 != coroutine_suspended) {
                }
                break;
            case 3:
                List<PointEntity> list11 = (List) this.L$2;
                RunEntity runEntity6 = (RunEntity) this.L$1;
                Repository repository7 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                withContext3 = obj;
                list = list11;
                repository3 = repository7;
                runEntity2 = runEntity6;
                List list82 = (List) withContext3;
                this.L$0 = repository3;
                this.L$1 = runEntity2;
                this.L$2 = list;
                this.L$3 = list82;
                this.label = 4;
                withContext4 = BuildersKt.withContext(Dispatchers.getIO(), new RunDetailsPanelKt$RunDetailsPanel$1$1$sp$1(repository3, this.$runId, null), this);
                if (withContext4 != coroutine_suspended) {
                }
                break;
            case 4:
                list2 = (List) this.L$3;
                list = (List) this.L$2;
                runEntity2 = (RunEntity) this.L$1;
                repository4 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                withContext4 = obj;
                List list92 = (List) withContext4;
                str = "";
                this.L$0 = repository4;
                this.L$1 = runEntity2;
                this.L$2 = list;
                this.L$3 = list2;
                this.L$4 = list92;
                this.label = 5;
                withContext5 = BuildersKt.withContext(Dispatchers.getIO(), new RunDetailsPanelKt$RunDetailsPanel$1$1$st$1(repository4, this.$runId, null), this);
                if (withContext5 != coroutine_suspended) {
                }
                break;
            case 5:
                list5 = (List) this.L$4;
                list4 = (List) this.L$3;
                List<PointEntity> list12 = (List) this.L$2;
                RunEntity runEntity7 = (RunEntity) this.L$1;
                Repository repository8 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                withContext5 = obj;
                str = "";
                list3 = list12;
                runEntity2 = runEntity7;
                repository4 = repository8;
                this.$points$delegate.setValue(list3);
                this.$hrSamples$delegate.setValue(list4);
                this.$splits$delegate.setValue(list5);
                this.$spotify$delegate.setValue((List) withContext5);
                if (runEntity2 != null) {
                }
                break;
            case 6:
                mutableState = (MutableState) this.L$3;
                list3 = (List) this.L$2;
                runEntity3 = (RunEntity) this.L$1;
                repository5 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                activeGearForActivity = obj;
                mutableState.setValue((List) activeGearForActivity);
                mutableState2 = this.$kmByGearId$delegate;
                RunDetailsPanel$lambda$61 = RunDetailsPanelKt.RunDetailsPanel$lambda$61(this.$gearOptions$delegate);
                List list102 = RunDetailsPanel$lambda$61;
                runEntity4 = runEntity3;
                repository6 = repository5;
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list102, 10)), 16));
                it = list102.iterator();
                list6 = list3;
                if (!it.hasNext()) {
                }
                break;
            case 7:
                mutableState2 = (MutableState) this.L$7;
                boxLong = (Long) this.L$6;
                linkedHashMap = (Map) this.L$5;
                it = (Iterator) this.L$4;
                Map map2 = (Map) this.L$3;
                list6 = (List) this.L$2;
                runEntity4 = (RunEntity) this.L$1;
                repository6 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                gearTotalKm = obj;
                map = map2;
                Pair pair2 = TuplesKt.to(boxLong, gearTotalKm);
                linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
                linkedHashMap = map;
                if (!it.hasNext()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
