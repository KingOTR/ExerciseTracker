package com.example.rungps.tracking;

import com.example.rungps.data.Repository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TrackingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.tracking.TrackingService$markHazard$1", f = "TrackingService.kt", i = {}, l = {1268}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TrackingService$markHazard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $elapsed;
    final /* synthetic */ Long $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TrackingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingService$markHazard$1(TrackingService trackingService, Long l, long j, Continuation<? super TrackingService$markHazard$1> continuation) {
        super(2, continuation);
        this.this$0 = trackingService;
        this.$id = l;
        this.$elapsed = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrackingService$markHazard$1 trackingService$markHazard$1 = new TrackingService$markHazard$1(this.this$0, this.$id, this.$elapsed, continuation);
        trackingService$markHazard$1.L$0 = obj;
        return trackingService$markHazard$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingService$markHazard$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Repository repo;
        int i;
        double d;
        Object insertRunSplit;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                TrackingService trackingService = this.this$0;
                Long l = this.$id;
                long j = this.$elapsed;
                Result.Companion companion = Result.INSTANCE;
                repo = trackingService.getRepo();
                long longValue = l.longValue();
                i = trackingService.hazardCount;
                d = trackingService.totalDistanceM;
                this.label = 1;
                insertRunSplit = repo.insertRunSplit(longValue, "HAZARD", i, j, j, d, this);
                if (insertRunSplit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                insertRunSplit = obj;
            }
            Result.m7905constructorimpl(Boxing.boxLong(((Number) insertRunSplit).longValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
