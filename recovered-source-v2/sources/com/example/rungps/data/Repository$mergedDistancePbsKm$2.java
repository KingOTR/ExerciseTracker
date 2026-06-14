package com.example.rungps.data;

import com.example.rungps.analytics.DistancePbLookup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$mergedDistancePbsKm$2", f = "Repository.kt", i = {1}, l = {2195, 2196}, m = "invokeSuspend", n = {"stravaRuns"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class Repository$mergedDistancePbsKm$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<Double, ? extends Long>>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$mergedDistancePbsKm$2(Repository repository, Continuation<? super Repository$mergedDistancePbsKm$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$mergedDistancePbsKm$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<Double, ? extends Long>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Map<Double, Long>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<Double, Long>> continuation) {
        return ((Repository$mergedDistancePbsKm$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DistancePbLookup distancePbLookup;
        List<StravaPbEntity> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.getStravaPbDao().allOnce(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                distancePbLookup = (DistancePbLookup) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                return distancePbLookup.normalizePbs((Map) obj, list);
            }
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (Intrinsics.areEqual(((StravaPbEntity) obj2).getActivityKind(), "RUN")) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = arrayList;
        DistancePbLookup distancePbLookup2 = DistancePbLookup.INSTANCE;
        this.L$0 = arrayList2;
        this.L$1 = distancePbLookup2;
        this.label = 2;
        Object localPbsFromSplits = this.this$0.localPbsFromSplits(this);
        if (localPbsFromSplits == coroutine_suspended) {
            return coroutine_suspended;
        }
        distancePbLookup = distancePbLookup2;
        obj = localPbsFromSplits;
        list = arrayList2;
        return distancePbLookup.normalizePbs((Map) obj, list);
    }
}
