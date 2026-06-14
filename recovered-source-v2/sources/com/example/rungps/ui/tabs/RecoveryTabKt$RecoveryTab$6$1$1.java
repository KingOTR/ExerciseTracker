package com.example.rungps.ui.tabs;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.recovery.GymAcwr;
import com.example.rungps.recovery.GymAcwrResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$1$1", f = "RecoveryTab.kt", i = {0, 0}, l = {352}, m = "invokeSuspend", n = {"recent", "now"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class RecoveryTabKt$RecoveryTab$6$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<GymAcwrResult> $gymAcwr$delegate;
    final /* synthetic */ State<List<GymSessionEntity>> $gymSessions$delegate;
    final /* synthetic */ Repository $repo;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RecoveryTabKt$RecoveryTab$6$1$1(State<? extends List<GymSessionEntity>> state, Repository repository, MutableState<GymAcwrResult> mutableState, Continuation<? super RecoveryTabKt$RecoveryTab$6$1$1> continuation) {
        super(2, continuation);
        this.$gymSessions$delegate = state;
        this.$repo = repository;
        this.$gymAcwr$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecoveryTabKt$RecoveryTab$6$1$1 recoveryTabKt$RecoveryTab$6$1$1 = new RecoveryTabKt$RecoveryTab$6$1$1(this.$gymSessions$delegate, this.$repo, this.$gymAcwr$delegate, continuation);
        recoveryTabKt$RecoveryTab$6$1$1.L$0 = obj;
        return recoveryTabKt$RecoveryTab$6$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoveryTabKt$RecoveryTab$6$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00e3  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState<GymAcwrResult> mutableState;
        long currentTimeMillis;
        List RecoveryTab$lambda$2;
        ArrayList arrayList;
        Object withContext;
        MutableState<GymAcwrResult> mutableState2;
        Throwable th;
        Object m7905constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableState = this.$gymAcwr$delegate;
            State<List<GymSessionEntity>> state = this.$gymSessions$delegate;
            Repository repository = this.$repo;
            try {
                Result.Companion companion = Result.INSTANCE;
                currentTimeMillis = System.currentTimeMillis();
                RecoveryTab$lambda$2 = RecoveryTabKt.RecoveryTab$lambda$2(state);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : RecoveryTab$lambda$2) {
                    if (((GymSessionEntity) obj2).getEndedAtMs() != null) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    Long endedAtMs = ((GymSessionEntity) obj3).getEndedAtMs();
                    if ((endedAtMs != null ? endedAtMs.longValue() : 0L) >= currentTimeMillis - 3024000000L) {
                        arrayList3.add(obj3);
                    }
                }
                arrayList = arrayList3;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                RecoveryTabKt$RecoveryTab$6$1$1$1$setsMap$1 recoveryTabKt$RecoveryTab$6$1$1$1$setsMap$1 = new RecoveryTabKt$RecoveryTab$6$1$1$1$setsMap$1(repository, arrayList, null);
                this.L$0 = arrayList;
                this.L$1 = mutableState;
                this.J$0 = currentTimeMillis;
                this.label = 1;
                withContext = BuildersKt.withContext(io2, recoveryTabKt$RecoveryTab$6$1$1$1$setsMap$1, this);
                if (withContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                mutableState2 = mutableState;
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                mutableState = mutableState2;
                mutableState.setValue((GymAcwrResult) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl));
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = this.J$0;
            mutableState2 = (MutableState) this.L$1;
            ?? r0 = (List) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                arrayList = r0;
                currentTimeMillis = j;
                mutableState = mutableState2;
                withContext = obj;
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion22 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                mutableState = mutableState2;
                mutableState.setValue((GymAcwrResult) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl));
                return Unit.INSTANCE;
            }
        }
        m7905constructorimpl = Result.m7905constructorimpl(GymAcwr.compute$default(GymAcwr.INSTANCE, arrayList, (Map) withContext, currentTimeMillis, null, 8, null));
        mutableState.setValue((GymAcwrResult) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl));
        return Unit.INSTANCE;
    }
}
