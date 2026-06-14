package com.example.rungps.ui.main;

import androidx.compose.runtime.State;
import com.example.rungps.analytics.RacePredictor;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
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

/* compiled from: HomeTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/analytics/RacePredictor$Card;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$3$1$1$1", f = "HomeTabContent.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HomeTabContentKt$HomeTabContent$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RacePredictor.Card>, Object> {
    final /* synthetic */ Repository $homeRepo;
    final /* synthetic */ State<List<RecoveryEventEntity>> $recoveryHome$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HomeTabContentKt$HomeTabContent$3$1$1$1(Repository repository, State<? extends List<RecoveryEventEntity>> state, Continuation<? super HomeTabContentKt$HomeTabContent$3$1$1$1> continuation) {
        super(2, continuation);
        this.$homeRepo = repository;
        this.$recoveryHome$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeTabContentKt$HomeTabContent$3$1$1$1(this.$homeRepo, this.$recoveryHome$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RacePredictor.Card> continuation) {
        return ((HomeTabContentKt$HomeTabContent$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List HomeTabContent$lambda$6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RacePredictor racePredictor = RacePredictor.INSTANCE;
            Repository repository = this.$homeRepo;
            HomeTabContent$lambda$6 = HomeTabContentKt.HomeTabContent$lambda$6(this.$recoveryHome$delegate);
            this.label = 1;
            obj = RacePredictor.buildCard$default(racePredictor, repository, HomeTabContent$lambda$6, 0L, this, 4, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
