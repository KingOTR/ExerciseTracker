package com.example.rungps.ui.coach;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.training.DailyTrainingCoach;
import com.example.rungps.ui.week.CoachBriefLoader;
import java.time.ZoneId;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: TrainingCoachScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$1$1", f = "TrainingCoachScreen.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TrainingCoachScreenKt$TrainingCoachScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<DailyTrainingCoach.DailyCoachBrief> $dailyBrief$delegate;
    final /* synthetic */ State<List<GymSessionEntity>> $gymSessions$delegate;
    final /* synthetic */ State<List<RecoveryEventEntity>> $recoveryEvents$delegate;
    final /* synthetic */ State<List<RunEntity>> $runs$delegate;
    final /* synthetic */ State<List<SleepEntryEntity>> $sleepDb$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TrainingCoachScreenKt$TrainingCoachScreen$1$1(Context context, State<? extends List<RunEntity>> state, State<? extends List<GymSessionEntity>> state2, State<? extends List<RecoveryEventEntity>> state3, State<? extends List<SleepEntryEntity>> state4, MutableState<DailyTrainingCoach.DailyCoachBrief> mutableState, Continuation<? super TrainingCoachScreenKt$TrainingCoachScreen$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$runs$delegate = state;
        this.$gymSessions$delegate = state2;
        this.$recoveryEvents$delegate = state3;
        this.$sleepDb$delegate = state4;
        this.$dailyBrief$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrainingCoachScreenKt$TrainingCoachScreen$1$1(this.$ctx, this.$runs$delegate, this.$gymSessions$delegate, this.$recoveryEvents$delegate, this.$sleepDb$delegate, this.$dailyBrief$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrainingCoachScreenKt$TrainingCoachScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: TrainingCoachScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$1$1$1", f = "TrainingCoachScreen.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DailyTrainingCoach.DailyCoachBrief>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ State<List<GymSessionEntity>> $gymSessions$delegate;
        final /* synthetic */ State<List<RecoveryEventEntity>> $recoveryEvents$delegate;
        final /* synthetic */ State<List<RunEntity>> $runs$delegate;
        final /* synthetic */ State<List<SleepEntryEntity>> $sleepDb$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Context context, State<? extends List<RunEntity>> state, State<? extends List<GymSessionEntity>> state2, State<? extends List<RecoveryEventEntity>> state3, State<? extends List<SleepEntryEntity>> state4, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$runs$delegate = state;
            this.$gymSessions$delegate = state2;
            this.$recoveryEvents$delegate = state3;
            this.$sleepDb$delegate = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, this.$runs$delegate, this.$gymSessions$delegate, this.$recoveryEvents$delegate, this.$sleepDb$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DailyTrainingCoach.DailyCoachBrief> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List TrainingCoachScreen$lambda$25;
            List TrainingCoachScreen$lambda$26;
            List TrainingCoachScreen$lambda$27;
            List TrainingCoachScreen$lambda$28;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoachBriefLoader coachBriefLoader = CoachBriefLoader.INSTANCE;
                Context context = this.$ctx;
                TrainingCoachScreen$lambda$25 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$25(this.$runs$delegate);
                TrainingCoachScreen$lambda$26 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$26(this.$gymSessions$delegate);
                TrainingCoachScreen$lambda$27 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$27(this.$recoveryEvents$delegate);
                TrainingCoachScreen$lambda$28 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$28(this.$sleepDb$delegate);
                this.label = 1;
                obj = coachBriefLoader.load(context, TrainingCoachScreen$lambda$25, TrainingCoachScreen$lambda$26, TrainingCoachScreen$lambda$27, TrainingCoachScreen$lambda$28, (r17 & 32) != 0 ? ZoneId.systemDefault() : null, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((CoachBriefLoader.Loaded) obj).getBrief();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState<DailyTrainingCoach.DailyCoachBrief> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<DailyTrainingCoach.DailyCoachBrief> mutableState2 = this.$dailyBrief$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, this.$runs$delegate, this.$gymSessions$delegate, this.$recoveryEvents$delegate, this.$sleepDb$delegate, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = withContext;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((DailyTrainingCoach.DailyCoachBrief) obj);
        return Unit.INSTANCE;
    }
}
