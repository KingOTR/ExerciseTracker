package com.example.rungps.data;

import com.example.rungps.data.repo.RunRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$importMoyoungWorkout$2", f = "Repository.kt", i = {}, l = {2155}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Repository$importMoyoungWorkout$2 extends SuspendLambda implements Function2<Long, Continuation<? super Boolean>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$importMoyoungWorkout$2(Repository repository, Continuation<? super Repository$importMoyoungWorkout$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Repository$importMoyoungWorkout$2 repository$importMoyoungWorkout$2 = new Repository$importMoyoungWorkout$2(this.this$0, continuation);
        repository$importMoyoungWorkout$2.J$0 = ((Number) obj).longValue();
        return repository$importMoyoungWorkout$2;
    }

    public final Object invoke(long j, Continuation<? super Boolean> continuation) {
        return ((Repository$importMoyoungWorkout$2) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l, Continuation<? super Boolean> continuation) {
        return invoke(l.longValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RunRepository runRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.J$0;
            runRepository = this.this$0.runRepo;
            this.label = 1;
            obj = runRepository.runByWatchImportId(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(obj != null);
    }
}
