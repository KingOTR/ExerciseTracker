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
@DebugMetadata(c = "com.example.rungps.tracking.TrackingService$markLap$1", f = "TrackingService.kt", i = {}, l = {1245}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TrackingService$markLap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $elapsed;
    final /* synthetic */ Long $id;
    final /* synthetic */ double $lapDistance;
    final /* synthetic */ long $lapMs;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TrackingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingService$markLap$1(TrackingService trackingService, Long l, long j, long j2, double d, Continuation<? super TrackingService$markLap$1> continuation) {
        super(2, continuation);
        this.this$0 = trackingService;
        this.$id = l;
        this.$elapsed = j;
        this.$lapMs = j2;
        this.$lapDistance = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrackingService$markLap$1 trackingService$markLap$1 = new TrackingService$markLap$1(this.this$0, this.$id, this.$elapsed, this.$lapMs, this.$lapDistance, continuation);
        trackingService$markLap$1.L$0 = obj;
        return trackingService$markLap$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingService$markLap$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Repository repo;
        int i;
        Object insertRunSplit;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                TrackingService trackingService = this.this$0;
                Long l = this.$id;
                long j = this.$elapsed;
                long j2 = this.$lapMs;
                double d = this.$lapDistance;
                Result.Companion companion = Result.INSTANCE;
                repo = trackingService.getRepo();
                long longValue = l.longValue();
                i = trackingService.lapCount;
                this.label = 1;
                insertRunSplit = repo.insertRunSplit(longValue, "LAP", i, j, j2, d, this);
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
