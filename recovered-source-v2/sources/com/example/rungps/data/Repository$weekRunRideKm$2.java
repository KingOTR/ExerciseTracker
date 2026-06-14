package com.example.rungps.data;

import com.example.rungps.analytics.WeeklyActivityKm;
import java.time.ZoneId;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$weekRunRideKm$2", f = "Repository.kt", i = {1}, l = {1242, 1243}, m = "invokeSuspend", n = {"strava"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class Repository$weekRunRideKm$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Double, ? extends Double>>, Object> {
    final /* synthetic */ List<RunEntity> $localRuns;
    final /* synthetic */ List<WeeklyActivityKm.StravaSession> $stravaSessions;
    final /* synthetic */ long $weekEndMs;
    final /* synthetic */ long $weekStartMs;
    Object L$0;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$weekRunRideKm$2(List<WeeklyActivityKm.StravaSession> list, Repository repository, List<RunEntity> list2, long j, long j2, Continuation<? super Repository$weekRunRideKm$2> continuation) {
        super(2, continuation);
        this.$stravaSessions = list;
        this.this$0 = repository;
        this.$localRuns = list2;
        this.$weekStartMs = j;
        this.$weekEndMs = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$weekRunRideKm$2(this.$stravaSessions, this.this$0, this.$localRuns, this.$weekStartMs, this.$weekEndMs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Double, ? extends Double>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<Double, Double>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<Double, Double>> continuation) {
        return ((Repository$weekRunRideKm$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<WeeklyActivityKm.StravaSession> list;
        Object linkedStravaActivityIds;
        List<WeeklyActivityKm.StravaSession> list2;
        Pair compute;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            list = this.$stravaSessions;
            if (list == null) {
                this.label = 1;
                obj = Repository.stravaTrainingSessions$default(this.this$0, 0, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.L$0 = list;
            this.label = 2;
            linkedStravaActivityIds = this.this$0.linkedStravaActivityIds(this);
            if (linkedStravaActivityIds != coroutine_suspended) {
                return coroutine_suspended;
            }
            list2 = list;
            obj = linkedStravaActivityIds;
            compute = WeeklyActivityKm.INSTANCE.compute(this.$localRuns, list2, (Set) obj, this.$weekStartMs, this.$weekEndMs, (r19 & 32) != 0 ? ZoneId.systemDefault() : null);
            return compute;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<WeeklyActivityKm.StravaSession> list3 = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            list2 = list3;
            compute = WeeklyActivityKm.INSTANCE.compute(this.$localRuns, list2, (Set) obj, this.$weekStartMs, this.$weekEndMs, (r19 & 32) != 0 ? ZoneId.systemDefault() : null);
            return compute;
        }
        ResultKt.throwOnFailure(obj);
        list = (List) obj;
        this.L$0 = list;
        this.label = 2;
        linkedStravaActivityIds = this.this$0.linkedStravaActivityIds(this);
        if (linkedStravaActivityIds != coroutine_suspended) {
        }
    }
}
