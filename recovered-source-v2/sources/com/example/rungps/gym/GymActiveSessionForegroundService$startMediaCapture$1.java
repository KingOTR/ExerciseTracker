package com.example.rungps.gym;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.data.Repository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* compiled from: GymActiveSessionForegroundService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.gym.GymActiveSessionForegroundService$startMediaCapture$1", f = "GymActiveSessionForegroundService.kt", i = {0, 1, 2}, l = {80, ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR, ExerciseSessionRecord.EXERCISE_TYPE_YOGA}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class GymActiveSessionForegroundService$startMediaCapture$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Repository $repo;
    final /* synthetic */ long $sessionId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GymActiveSessionForegroundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymActiveSessionForegroundService$startMediaCapture$1(GymActiveSessionForegroundService gymActiveSessionForegroundService, long j, Repository repository, Continuation<? super GymActiveSessionForegroundService$startMediaCapture$1> continuation) {
        super(2, continuation);
        this.this$0 = gymActiveSessionForegroundService;
        this.$sessionId = j;
        this.$repo = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymActiveSessionForegroundService$startMediaCapture$1 gymActiveSessionForegroundService$startMediaCapture$1 = new GymActiveSessionForegroundService$startMediaCapture$1(this.this$0, this.$sessionId, this.$repo, continuation);
        gymActiveSessionForegroundService$startMediaCapture$1.L$0 = obj;
        return gymActiveSessionForegroundService$startMediaCapture$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymActiveSessionForegroundService$startMediaCapture$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007f -> B:12:0x004f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        GymSessionMediaRecorder gymSessionMediaRecorder;
        GymSessionMediaRecorder gymSessionMediaRecorder2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    gymSessionMediaRecorder2 = this.this$0.mediaRecorder;
                    this.L$0 = coroutineScope;
                    this.label = 3;
                    if (gymSessionMediaRecorder2.pollAndSave(this.$sessionId, this.this$0, this.$repo, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            gymSessionMediaRecorder = this.this$0.mediaRecorder;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (gymSessionMediaRecorder.pollAndSave(this.$sessionId, this.this$0, this.$repo, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            this.L$0 = coroutineScope;
            this.label = 2;
            if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            gymSessionMediaRecorder2 = this.this$0.mediaRecorder;
            this.L$0 = coroutineScope;
            this.label = 3;
            if (gymSessionMediaRecorder2.pollAndSave(this.$sessionId, this.this$0, this.$repo, this) == coroutine_suspended) {
            }
            if (!CoroutineScopeKt.isActive(coroutineScope)) {
                return Unit.INSTANCE;
            }
        }
    }
}
