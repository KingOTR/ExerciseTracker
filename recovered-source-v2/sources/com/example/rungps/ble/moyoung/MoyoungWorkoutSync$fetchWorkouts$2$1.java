package com.example.rungps.ble.moyoung;

import android.util.Log;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MoyoungWorkoutSync.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/ble/moyoung/MoyoungWorkout;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.moyoung.MoyoungWorkoutSync$fetchWorkouts$2$1", f = "MoyoungWorkoutSync.kt", i = {0, 1, 2, 2, 3}, l = {52, 53, 55, 57}, m = "invokeSuspend", n = {"$this$withTimeout", "$this$withTimeout", "$this$withTimeout", "merged", "merged"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
final class MoyoungWorkoutSync$fetchWorkouts$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends MoyoungWorkout>>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MoyoungWorkoutSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoyoungWorkoutSync$fetchWorkouts$2$1(MoyoungWorkoutSync moyoungWorkoutSync, Continuation<? super MoyoungWorkoutSync$fetchWorkouts$2$1> continuation) {
        super(2, continuation);
        this.this$0 = moyoungWorkoutSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MoyoungWorkoutSync$fetchWorkouts$2$1 moyoungWorkoutSync$fetchWorkouts$2$1 = new MoyoungWorkoutSync$fetchWorkouts$2$1(this.this$0, continuation);
        moyoungWorkoutSync$fetchWorkouts$2$1.L$0 = obj;
        return moyoungWorkoutSync$fetchWorkouts$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends MoyoungWorkout>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<MoyoungWorkout>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<MoyoungWorkout>> continuation) {
        return ((MoyoungWorkoutSync$fetchWorkouts$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:(1:(1:(1:(11:7|8|9|10|11|(1:13)|14|(2:17|15)|18|19|20)(2:25|26))(13:27|28|29|30|31|(1:33)|34|(2:37|35)|38|39|40|41|(1:43)(9:44|10|11|(0)|14|(1:15)|18|19|20)))(5:51|52|53|54|(1:56)(11:57|30|31|(0)|34|(1:35)|38|39|40|41|(0)(0))))(1:61))(2:65|(1:67)(1:68))|62|(1:64)|52|53|54|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008f, code lost:
    
        r1 = r9;
        r9 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0105 A[LOOP:0: B:15:0x00ff->B:17:0x0105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3 A[LOOP:1: B:35:0x00ad->B:37:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object prepareNotify;
        CoroutineScope coroutineScope;
        Object warmUpWatch;
        LinkedHashMap linkedHashMap;
        Object fetchWorkoutsV2AllPages;
        Object m7905constructorimpl;
        LinkedHashMap linkedHashMap2;
        Object m7905constructorimpl2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope2;
            this.label = 1;
            prepareNotify = this.this$0.prepareNotify(this);
            if (prepareNotify == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    linkedHashMap2 = (LinkedHashMap) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        m7905constructorimpl2 = Result.m7905constructorimpl((List) obj);
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion = Result.INSTANCE;
                        m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl2) != null) {
                        }
                        while (r9.hasNext()) {
                        }
                        Collection values = linkedHashMap2.values();
                        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                        List sortedWith = CollectionsKt.sortedWith(values, new Comparator() { // from class: com.example.rungps.ble.moyoung.MoyoungWorkoutSync$fetchWorkouts$2$1$invokeSuspend$$inlined$sortedByDescending$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt.compareValues(Long.valueOf(((MoyoungWorkout) t2).getStartTimeMs()), Long.valueOf(((MoyoungWorkout) t).getStartTimeMs()));
                            }
                        });
                        Log.i("MoyoungWorkoutSync", "fetchWorkouts done: " + sortedWith.size() + " parsed");
                        return sortedWith;
                    }
                    if (Result.m7908exceptionOrNullimpl(m7905constructorimpl2) != null) {
                        m7905constructorimpl2 = CollectionsKt.emptyList();
                    }
                    for (MoyoungWorkout moyoungWorkout : (Iterable) m7905constructorimpl2) {
                        linkedHashMap2.put(Boxing.boxLong(moyoungWorkout.getDedupeId()), moyoungWorkout);
                    }
                    Collection values2 = linkedHashMap2.values();
                    Intrinsics.checkNotNullExpressionValue(values2, "<get-values>(...)");
                    List sortedWith2 = CollectionsKt.sortedWith(values2, new Comparator() { // from class: com.example.rungps.ble.moyoung.MoyoungWorkoutSync$fetchWorkouts$2$1$invokeSuspend$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(Long.valueOf(((MoyoungWorkout) t2).getStartTimeMs()), Long.valueOf(((MoyoungWorkout) t).getStartTimeMs()));
                        }
                    });
                    Log.i("MoyoungWorkoutSync", "fetchWorkouts done: " + sortedWith2.size() + " parsed");
                    return sortedWith2;
                }
                linkedHashMap = (LinkedHashMap) this.L$1;
                try {
                    try {
                        ResultKt.throwOnFailure(obj);
                        m7905constructorimpl = Result.m7905constructorimpl((List) obj);
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        Result.Companion companion2 = Result.INSTANCE;
                        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th3));
                        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                        }
                        while (r9.hasNext()) {
                        }
                        MoyoungWorkoutSync moyoungWorkoutSync = this.this$0;
                        Result.Companion companion3 = Result.INSTANCE;
                        this.L$0 = linkedHashMap;
                        this.L$1 = null;
                        this.label = 4;
                        obj = moyoungWorkoutSync.fetchWorkoutsLegacy(this);
                        if (obj != coroutine_suspended) {
                        }
                    }
                    Result.Companion companion32 = Result.INSTANCE;
                    this.L$0 = linkedHashMap;
                    this.L$1 = null;
                    this.label = 4;
                    obj = moyoungWorkoutSync.fetchWorkoutsLegacy(this);
                } catch (Throwable th4) {
                    th = th4;
                    linkedHashMap2 = linkedHashMap;
                    Result.Companion companion4 = Result.INSTANCE;
                    m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    if (Result.m7908exceptionOrNullimpl(m7905constructorimpl2) != null) {
                    }
                    while (r9.hasNext()) {
                    }
                    Collection values22 = linkedHashMap2.values();
                    Intrinsics.checkNotNullExpressionValue(values22, "<get-values>(...)");
                    List sortedWith22 = CollectionsKt.sortedWith(values22, new Comparator() { // from class: com.example.rungps.ble.moyoung.MoyoungWorkoutSync$fetchWorkouts$2$1$invokeSuspend$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(Long.valueOf(((MoyoungWorkout) t2).getStartTimeMs()), Long.valueOf(((MoyoungWorkout) t).getStartTimeMs()));
                        }
                    });
                    Log.i("MoyoungWorkoutSync", "fetchWorkouts done: " + sortedWith22.size() + " parsed");
                    return sortedWith22;
                }
                if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                    m7905constructorimpl = CollectionsKt.emptyList();
                }
                for (MoyoungWorkout moyoungWorkout2 : (Iterable) m7905constructorimpl) {
                    linkedHashMap.put(Boxing.boxLong(moyoungWorkout2.getDedupeId()), moyoungWorkout2);
                }
                MoyoungWorkoutSync moyoungWorkoutSync2 = this.this$0;
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                linkedHashMap2 = linkedHashMap;
                m7905constructorimpl2 = Result.m7905constructorimpl((List) obj);
                if (Result.m7908exceptionOrNullimpl(m7905constructorimpl2) != null) {
                }
                while (r9.hasNext()) {
                }
                Collection values222 = linkedHashMap2.values();
                Intrinsics.checkNotNullExpressionValue(values222, "<get-values>(...)");
                List sortedWith222 = CollectionsKt.sortedWith(values222, new Comparator() { // from class: com.example.rungps.ble.moyoung.MoyoungWorkoutSync$fetchWorkouts$2$1$invokeSuspend$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Long.valueOf(((MoyoungWorkout) t2).getStartTimeMs()), Long.valueOf(((MoyoungWorkout) t).getStartTimeMs()));
                    }
                });
                Log.i("MoyoungWorkoutSync", "fetchWorkouts done: " + sortedWith222.size() + " parsed");
                return sortedWith222;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            MoyoungWorkoutSync moyoungWorkoutSync3 = this.this$0;
            Result.Companion companion5 = Result.INSTANCE;
            this.L$0 = coroutineScope;
            this.L$1 = linkedHashMap3;
            this.label = 3;
            fetchWorkoutsV2AllPages = moyoungWorkoutSync3.fetchWorkoutsV2AllPages(this);
            if (fetchWorkoutsV2AllPages != coroutine_suspended) {
                return coroutine_suspended;
            }
            linkedHashMap = linkedHashMap3;
            obj = fetchWorkoutsV2AllPages;
            m7905constructorimpl = Result.m7905constructorimpl((List) obj);
            if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
            }
            while (r9.hasNext()) {
            }
            MoyoungWorkoutSync moyoungWorkoutSync22 = this.this$0;
            Result.Companion companion322 = Result.INSTANCE;
            this.L$0 = linkedHashMap;
            this.L$1 = null;
            this.label = 4;
            obj = moyoungWorkoutSync22.fetchWorkoutsLegacy(this);
            if (obj != coroutine_suspended) {
            }
        }
        this.L$0 = coroutineScope;
        this.label = 2;
        warmUpWatch = this.this$0.warmUpWatch(this);
        if (warmUpWatch == coroutine_suspended) {
            return coroutine_suspended;
        }
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        MoyoungWorkoutSync moyoungWorkoutSync32 = this.this$0;
        Result.Companion companion52 = Result.INSTANCE;
        this.L$0 = coroutineScope;
        this.L$1 = linkedHashMap32;
        this.label = 3;
        fetchWorkoutsV2AllPages = moyoungWorkoutSync32.fetchWorkoutsV2AllPages(this);
        if (fetchWorkoutsV2AllPages != coroutine_suspended) {
        }
    }
}
