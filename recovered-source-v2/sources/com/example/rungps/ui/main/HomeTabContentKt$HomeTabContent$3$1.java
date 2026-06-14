package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.analytics.RacePredictor;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import java.util.List;
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

/* compiled from: HomeTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$3$1", f = "HomeTabContent.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HomeTabContentKt$HomeTabContent$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Repository $homeRepo;
    final /* synthetic */ MutableState<Boolean> $loadHeavyHome$delegate;
    final /* synthetic */ MutableState<RacePredictor.Card> $racePredictor$delegate;
    final /* synthetic */ State<List<RecoveryEventEntity>> $recoveryHome$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HomeTabContentKt$HomeTabContent$3$1(MutableState<Boolean> mutableState, Repository repository, State<? extends List<RecoveryEventEntity>> state, MutableState<RacePredictor.Card> mutableState2, Continuation<? super HomeTabContentKt$HomeTabContent$3$1> continuation) {
        super(2, continuation);
        this.$loadHeavyHome$delegate = mutableState;
        this.$homeRepo = repository;
        this.$recoveryHome$delegate = state;
        this.$racePredictor$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeTabContentKt$HomeTabContent$3$1 homeTabContentKt$HomeTabContent$3$1 = new HomeTabContentKt$HomeTabContent$3$1(this.$loadHeavyHome$delegate, this.$homeRepo, this.$recoveryHome$delegate, this.$racePredictor$delegate, continuation);
        homeTabContentKt$HomeTabContent$3$1.L$0 = obj;
        return homeTabContentKt$HomeTabContent$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeTabContentKt$HomeTabContent$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean HomeTabContent$lambda$15;
        Throwable th;
        MutableState<RacePredictor.Card> mutableState;
        Object m7905constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HomeTabContent$lambda$15 = HomeTabContentKt.HomeTabContent$lambda$15(this.$loadHeavyHome$delegate);
            if (!HomeTabContent$lambda$15) {
                return Unit.INSTANCE;
            }
            MutableState<RacePredictor.Card> mutableState2 = this.$racePredictor$delegate;
            Repository repository = this.$homeRepo;
            State<List<RecoveryEventEntity>> state = this.$recoveryHome$delegate;
            try {
                Result.Companion companion = Result.INSTANCE;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                HomeTabContentKt$HomeTabContent$3$1$1$1 homeTabContentKt$HomeTabContent$3$1$1$1 = new HomeTabContentKt$HomeTabContent$3$1$1$1(repository, state, null);
                this.L$0 = mutableState2;
                this.label = 1;
                Object withContext = BuildersKt.withContext(io2, homeTabContentKt$HomeTabContent$3$1$1$1, this);
                if (withContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = withContext;
                mutableState = mutableState2;
            } catch (Throwable th2) {
                th = th2;
                mutableState = mutableState2;
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                mutableState.setValue((RacePredictor.Card) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl));
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion22 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                mutableState.setValue((RacePredictor.Card) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl));
                return Unit.INSTANCE;
            }
        }
        m7905constructorimpl = Result.m7905constructorimpl((RacePredictor.Card) obj);
        mutableState.setValue((RacePredictor.Card) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl));
        return Unit.INSTANCE;
    }
}
