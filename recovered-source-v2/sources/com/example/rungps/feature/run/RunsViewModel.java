package com.example.rungps.feature.run;

import androidx.autofill.HintConstants;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms__PagingDataTransformsKt;
import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.data.RouteEntity;
import com.example.rungps.data.RunEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RunsViewModel.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u001b\u001a\u00020\u0010*\u00020\u001cH\u0002JK\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\n2\b\u0010\"\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010$\u001a\u0004\u0018\u00010 2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0&¢\u0006\u0002\u0010'J\u000e\u0010(\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010)\u001a\u00020\u001eJ0\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\u0018\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0/0\u000fJ\u000e\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020 J\u001e\u00102\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020 J\u001e\u00105\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u00066"}, d2 = {"Lcom/example/rungps/feature/run/RunsViewModel;", "", "useCases", "Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;Lkotlinx/coroutines/CoroutineScope;)V", "uiEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getUiEvents", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "runs", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/example/rungps/feature/run/RunRow;", "getRuns", "()Lkotlinx/coroutines/flow/StateFlow;", "runsPaged", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "getRunsPaged", "()Lkotlinx/coroutines/flow/Flow;", "routes", "Lcom/example/rungps/data/RouteEntity;", "getRoutes", "toRow", "Lcom/example/rungps/data/RunEntity;", "updateRunMetadata", "", "runId", "", "title", "description", "privateNotes", "gearId", "onDone", "Lkotlin/Function0;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "deleteRun", "deleteAllRuns", "saveRoute", HintConstants.AUTOFILL_HINT_NAME, "distanceM", "", "latLon", "Lkotlin/Pair;", "deleteRoute", "routeId", "trimRun", "startTimeMs", "endTimeMs", "reclassifyWatchRunToSoccer", "run_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunsViewModel {
    private final StateFlow<List<RouteEntity>> routes;
    private final StateFlow<List<RunRow>> runs;
    private final Flow<PagingData<RunRow>> runsPaged;
    private final CoroutineScope scope;
    private final MutableSharedFlow<String> uiEvents;
    private final ExerciseTrackerUseCases useCases;

    public RunsViewModel(ExerciseTrackerUseCases useCases, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.useCases = useCases;
        this.scope = scope;
        this.uiEvents = SharedFlowKt.MutableSharedFlow$default(0, 8, null, 5, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new AnonymousClass1(null), 3, null);
        final Flow<List<RunEntity>> invoke = useCases.getObserveRuns().invoke();
        this.runs = FlowKt.stateIn(new Flow<List<? extends RunRow>>() { // from class: com.example.rungps.feature.run.RunsViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.example.rungps.feature.run.RunsViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ RunsViewModel this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.example.rungps.feature.run.RunsViewModel$special$$inlined$map$1$2", f = "RunsViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.example.rungps.feature.run.RunsViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, RunsViewModel runsViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = runsViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    RunRow row;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    row = this.this$0.toRow((RunEntity) it.next());
                                    arrayList.add(row);
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends RunRow>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        final Flow<PagingData<RunEntity>> invoke2 = useCases.getObserveRunsPaged().invoke();
        this.runsPaged = new Flow<PagingData<RunRow>>() { // from class: com.example.rungps.feature.run.RunsViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.example.rungps.feature.run.RunsViewModel$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ RunsViewModel this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.example.rungps.feature.run.RunsViewModel$special$$inlined$map$2$2", f = "RunsViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.example.rungps.feature.run.RunsViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, RunsViewModel runsViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = runsViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    PagingData map;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                map = PagingDataTransforms__PagingDataTransformsKt.map((PagingData) obj, new RunsViewModel$runsPaged$1$1(this.this$0, null));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(map, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super PagingData<RunRow>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
        this.routes = FlowKt.stateIn(useCases.getObserveRoutes().invoke(), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
    }

    public final MutableSharedFlow<String> getUiEvents() {
        return this.uiEvents;
    }

    /* compiled from: RunsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.feature.run.RunsViewModel$1", f = "RunsViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.feature.run.RunsViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RunsViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = RunsViewModel.this.useCases.getDedupeSavedRoutes().invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            int intValue = ((Number) obj).intValue();
            if (intValue > 0) {
                RunsViewModel.this.getUiEvents().tryEmit("Removed " + intValue + " duplicate saved route(s)");
            }
            return Unit.INSTANCE;
        }
    }

    public final StateFlow<List<RunRow>> getRuns() {
        return this.runs;
    }

    public final Flow<PagingData<RunRow>> getRunsPaged() {
        return this.runsPaged;
    }

    public final StateFlow<List<RouteEntity>> getRoutes() {
        return this.routes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RunRow toRow(RunEntity runEntity) {
        return new RunRow(runEntity.getId(), runEntity.getStartedAtMs(), runEntity.getEndedAtMs(), runEntity.getTotalDistanceM() / 1000.0d, runEntity.getTotalDurationMs(), runEntity.getTotalSteps(), runEntity.getPlanType(), runEntity.getTimeSession(), runEntity.getActivityType(), runEntity.getTitle(), runEntity.getGearId());
    }

    public final void updateRunMetadata(long runId, String title, String description, String privateNotes, Long gearId, Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new RunsViewModel$updateRunMetadata$2(this, runId, title, description, privateNotes, gearId, onDone, null), 3, null);
    }

    public final void deleteRun(long runId) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new RunsViewModel$deleteRun$1(this, runId, null), 3, null);
    }

    public final void deleteAllRuns() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new RunsViewModel$deleteAllRuns$1(this, null), 3, null);
    }

    public final void saveRoute(String name, double distanceM, List<Pair<Double, Double>> latLon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(latLon, "latLon");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new RunsViewModel$saveRoute$1(this, name, distanceM, latLon, null), 3, null);
    }

    public final void deleteRoute(long routeId) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new RunsViewModel$deleteRoute$1(this, routeId, null), 3, null);
    }

    public final void trimRun(long runId, long startTimeMs, long endTimeMs) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new RunsViewModel$trimRun$1(this, runId, startTimeMs, endTimeMs, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reclassifyWatchRunToSoccer$default(RunsViewModel runsViewModel, long j, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.example.rungps.feature.run.RunsViewModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        runsViewModel.reclassifyWatchRunToSoccer(j, function0);
    }

    public final void reclassifyWatchRunToSoccer(long runId, Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new RunsViewModel$reclassifyWatchRunToSoccer$2(this, runId, onDone, null), 3, null);
    }
}
