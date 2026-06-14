package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.training.DailyTrainingCoach;
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
@DebugMetadata(c = "com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$2$1", f = "HomeTabContent.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HomeTabContentKt$HomeTabContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ List<GymSessionEntity> $gymSessions;
    final /* synthetic */ MutableState<DailyTrainingCoach.DailyCoachBrief> $homeCoachBrief$delegate;
    final /* synthetic */ MutableState<Boolean> $homeCoachFailed$delegate;
    final /* synthetic */ MutableState<Boolean> $loadHeavyHome$delegate;
    final /* synthetic */ State<List<RecoveryEventEntity>> $recoveryHome$delegate;
    final /* synthetic */ State<List<RunEntity>> $runsEntities$delegate;
    final /* synthetic */ State<List<SleepEntryEntity>> $sleepHome$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HomeTabContentKt$HomeTabContent$2$1(MutableState<Boolean> mutableState, Context context, List<GymSessionEntity> list, State<? extends List<RunEntity>> state, State<? extends List<RecoveryEventEntity>> state2, State<? extends List<SleepEntryEntity>> state3, MutableState<DailyTrainingCoach.DailyCoachBrief> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super HomeTabContentKt$HomeTabContent$2$1> continuation) {
        super(2, continuation);
        this.$loadHeavyHome$delegate = mutableState;
        this.$ctx = context;
        this.$gymSessions = list;
        this.$runsEntities$delegate = state;
        this.$recoveryHome$delegate = state2;
        this.$sleepHome$delegate = state3;
        this.$homeCoachBrief$delegate = mutableState2;
        this.$homeCoachFailed$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeTabContentKt$HomeTabContent$2$1 homeTabContentKt$HomeTabContent$2$1 = new HomeTabContentKt$HomeTabContent$2$1(this.$loadHeavyHome$delegate, this.$ctx, this.$gymSessions, this.$runsEntities$delegate, this.$recoveryHome$delegate, this.$sleepHome$delegate, this.$homeCoachBrief$delegate, this.$homeCoachFailed$delegate, continuation);
        homeTabContentKt$HomeTabContent$2$1.L$0 = obj;
        return homeTabContentKt$HomeTabContent$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeTabContentKt$HomeTabContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        boolean HomeTabContent$lambda$15;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HomeTabContent$lambda$15 = HomeTabContentKt.HomeTabContent$lambda$15(this.$loadHeavyHome$delegate);
                if (!HomeTabContent$lambda$15) {
                    return Unit.INSTANCE;
                }
                Context context = this.$ctx;
                List<GymSessionEntity> list = this.$gymSessions;
                State<List<RunEntity>> state = this.$runsEntities$delegate;
                State<List<RecoveryEventEntity>> state2 = this.$recoveryHome$delegate;
                State<List<SleepEntryEntity>> state3 = this.$sleepHome$delegate;
                Result.Companion companion = Result.INSTANCE;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                HomeTabContentKt$HomeTabContent$2$1$loaded$1$1 homeTabContentKt$HomeTabContent$2$1$loaded$1$1 = new HomeTabContentKt$HomeTabContent$2$1$loaded$1$1(context, list, state, state2, state3, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, homeTabContentKt$HomeTabContent$2$1$loaded$1$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m7905constructorimpl = Result.m7905constructorimpl((DailyTrainingCoach.DailyCoachBrief) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        this.$homeCoachBrief$delegate.setValue((DailyTrainingCoach.DailyCoachBrief) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl));
        HomeTabContentKt.HomeTabContent$lambda$13(this.$homeCoachFailed$delegate, Result.m7911isFailureimpl(m7905constructorimpl));
        return Unit.INSTANCE;
    }
}
