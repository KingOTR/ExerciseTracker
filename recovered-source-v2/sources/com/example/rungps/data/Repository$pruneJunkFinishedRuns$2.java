package com.example.rungps.data;

import com.example.rungps.data.repo.RunRepository;
import com.example.rungps.tracking.ActivityTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$pruneJunkFinishedRuns$2", f = "Repository.kt", i = {1}, l = {344, 352}, m = "invokeSuspend", n = {"junk"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class Repository$pruneJunkFinishedRuns$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$pruneJunkFinishedRuns$2(Repository repository, Continuation<? super Repository$pruneJunkFinishedRuns$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$pruneJunkFinishedRuns$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((Repository$pruneJunkFinishedRuns$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00bc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RunDao runDao;
        Object allRuns;
        Iterator it;
        List list;
        Repository repository;
        RunRepository runRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            runDao = this.this$0.dao;
            this.label = 1;
            allRuns = runDao.allRuns(this);
            if (allRuns == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                repository = (Repository) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    RunEntity runEntity = (RunEntity) it.next();
                    runRepository = repository.runRepo;
                    long id = runEntity.getId();
                    this.L$0 = list;
                    this.L$1 = repository;
                    this.L$2 = it;
                    this.label = 2;
                    if (runRepository.deleteRun(id, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Boxing.boxInt(list.size());
            }
            ResultKt.throwOnFailure(obj);
            allRuns = obj;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) allRuns) {
            RunEntity runEntity2 = (RunEntity) obj2;
            Long endedAtMs = runEntity2.getEndedAtMs();
            if (endedAtMs != null) {
                long coerceAtLeast = RangesKt.coerceAtLeast(endedAtMs.longValue() - runEntity2.getStartedAtMs(), 0L);
                boolean isBike = ActivityTypes.INSTANCE.isBike(runEntity2.getActivityType());
                double d = isBike ? 30.0d : 15.0d;
                long j = isBike ? 45000L : 30000L;
                if (runEntity2.getTotalDistanceM() < 10.0d || (runEntity2.getTotalDistanceM() < d && coerceAtLeast < j)) {
                    arrayList.add(obj2);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        Repository repository2 = this.this$0;
        it = arrayList2.iterator();
        list = arrayList2;
        repository = repository2;
        while (it.hasNext()) {
        }
        return Boxing.boxInt(list.size());
    }
}
