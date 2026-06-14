package com.example.rungps.data;

import android.content.Context;
import com.example.rungps.data.repo.RunRepository;
import com.example.rungps.sync.RunDeleteTombstones;
import com.example.rungps.sync.RunFirestoreSync;
import kotlin.Metadata;
import kotlin.Result;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$deleteRun$2", f = "Repository.kt", i = {0}, l = {334, 337, 339}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class Repository$deleteRun$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $runId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$deleteRun$2(Repository repository, long j, Continuation<? super Repository$deleteRun$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
        this.$runId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Repository$deleteRun$2 repository$deleteRun$2 = new Repository$deleteRun$2(this.this$0, this.$runId, continuation);
        repository$deleteRun$2.L$0 = obj;
        return repository$deleteRun$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Repository$deleteRun$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RunRepository runRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.L$0 = (CoroutineScope) this.L$0;
            this.label = 1;
            obj = this.this$0.runById(this.$runId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                Result.m7905constructorimpl(obj);
                runRepository = this.this$0.runRepo;
                this.L$0 = null;
                this.label = 3;
                if (runRepository.deleteRun(this.$runId, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        RunEntity runEntity = (RunEntity) obj;
        if ((runEntity != null ? runEntity.getEndedAtMs() : null) != null) {
            RunDeleteTombstones runDeleteTombstones = RunDeleteTombstones.INSTANCE;
            Context appContext = this.this$0.getAppContext();
            Intrinsics.checkNotNullExpressionValue(appContext, "<get-appContext>(...)");
            runDeleteTombstones.mark(appContext, runEntity.getStartedAtMs(), runEntity.getTotalDistanceM());
            Repository repository = this.this$0;
            long j = this.$runId;
            Result.Companion companion2 = Result.INSTANCE;
            RunFirestoreSync runFirestoreSync = RunFirestoreSync.INSTANCE;
            Context appContext2 = repository.getAppContext();
            Intrinsics.checkNotNullExpressionValue(appContext2, "<get-appContext>(...)");
            this.L$0 = null;
            this.label = 2;
            obj = runFirestoreSync.deleteRunFromCloud(appContext2, j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Result.m7905constructorimpl(obj);
        }
        runRepository = this.this$0.runRepo;
        this.L$0 = null;
        this.label = 3;
        if (runRepository.deleteRun(this.$runId, this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
