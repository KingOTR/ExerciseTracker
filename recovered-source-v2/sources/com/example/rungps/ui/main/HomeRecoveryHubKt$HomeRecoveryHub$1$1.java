package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SoccerSessionEntity;
import com.example.rungps.recovery.ReadinessInputs;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HomeRecoveryHub.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HomeRecoveryHubKt$HomeRecoveryHub$1$1", f = "HomeRecoveryHub.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HomeRecoveryHubKt$HomeRecoveryHub$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<RecoveryEventEntity> $recoveryEvents;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ State<List<SoccerSessionEntity>> $soccerSessions$delegate;
    final /* synthetic */ MutableState<List<RecoveryEventEntity>> $visibleEvents$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HomeRecoveryHubKt$HomeRecoveryHub$1$1(Repository repository, List<RecoveryEventEntity> list, State<? extends List<SoccerSessionEntity>> state, MutableState<List<RecoveryEventEntity>> mutableState, Continuation<? super HomeRecoveryHubKt$HomeRecoveryHub$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$recoveryEvents = list;
        this.$soccerSessions$delegate = state;
        this.$visibleEvents$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeRecoveryHubKt$HomeRecoveryHub$1$1(this.$repo, this.$recoveryEvents, this.$soccerSessions$delegate, this.$visibleEvents$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeRecoveryHubKt$HomeRecoveryHub$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<SoccerSessionEntity> HomeRecoveryHub$lambda$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$repo.filterValidRecoveryEvents(this.$recoveryEvents, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        MutableState<List<RecoveryEventEntity>> mutableState = this.$visibleEvents$delegate;
        ReadinessInputs readinessInputs = ReadinessInputs.INSTANCE;
        HomeRecoveryHub$lambda$1 = HomeRecoveryHubKt.HomeRecoveryHub$lambda$1(this.$soccerSessions$delegate);
        mutableState.setValue(readinessInputs.filterSoccerRecoveryDedupe((List) obj, HomeRecoveryHub$lambda$1));
        return Unit.INSTANCE;
    }
}
