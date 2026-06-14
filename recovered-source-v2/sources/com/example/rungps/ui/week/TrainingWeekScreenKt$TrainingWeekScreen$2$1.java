package com.example.rungps.ui.week;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.analytics.TrainingWeekPlanner;
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

/* compiled from: TrainingWeekScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.week.TrainingWeekScreenKt$TrainingWeekScreen$2$1", f = "TrainingWeekScreen.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TrainingWeekScreenKt$TrainingWeekScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<WeekBrowseMode> $browseMode$delegate;
    final /* synthetic */ MutableState<DailyTrainingCoach.DailyCoachBrief> $coachBrief$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ State<List<GymSessionEntity>> $gymSessions$delegate;
    final /* synthetic */ MutableState<Boolean> $loading$delegate;
    final /* synthetic */ State<List<RecoveryEventEntity>> $recoveryEvents$delegate;
    final /* synthetic */ State<List<RunEntity>> $runs$delegate;
    final /* synthetic */ State<List<SleepEntryEntity>> $sleepDb$delegate;
    final /* synthetic */ MutableState<TrainingWeekPlanner.TrainingWeekView> $weekView$delegate;
    final /* synthetic */ ZoneId $zone;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TrainingWeekScreenKt$TrainingWeekScreen$2$1(MutableState<WeekBrowseMode> mutableState, MutableState<Boolean> mutableState2, Context context, ZoneId zoneId, State<? extends List<RunEntity>> state, State<? extends List<GymSessionEntity>> state2, State<? extends List<RecoveryEventEntity>> state3, State<? extends List<SleepEntryEntity>> state4, MutableState<TrainingWeekPlanner.TrainingWeekView> mutableState3, MutableState<DailyTrainingCoach.DailyCoachBrief> mutableState4, Continuation<? super TrainingWeekScreenKt$TrainingWeekScreen$2$1> continuation) {
        super(2, continuation);
        this.$browseMode$delegate = mutableState;
        this.$loading$delegate = mutableState2;
        this.$ctx = context;
        this.$zone = zoneId;
        this.$runs$delegate = state;
        this.$gymSessions$delegate = state2;
        this.$recoveryEvents$delegate = state3;
        this.$sleepDb$delegate = state4;
        this.$weekView$delegate = mutableState3;
        this.$coachBrief$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrainingWeekScreenKt$TrainingWeekScreen$2$1(this.$browseMode$delegate, this.$loading$delegate, this.$ctx, this.$zone, this.$runs$delegate, this.$gymSessions$delegate, this.$recoveryEvents$delegate, this.$sleepDb$delegate, this.$weekView$delegate, this.$coachBrief$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrainingWeekScreenKt$TrainingWeekScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WeekBrowseMode TrainingWeekScreen$lambda$7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TrainingWeekScreen$lambda$7 = TrainingWeekScreenKt.TrainingWeekScreen$lambda$7(this.$browseMode$delegate);
            if (TrainingWeekScreen$lambda$7 != WeekBrowseMode.CURRENT) {
                return Unit.INSTANCE;
            }
            TrainingWeekScreenKt.TrainingWeekScreen$lambda$20(this.$loading$delegate, true);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new TrainingWeekScreenKt$TrainingWeekScreen$2$1$loaded$1(this.$ctx, this.$zone, this.$runs$delegate, this.$gymSessions$delegate, this.$recoveryEvents$delegate, this.$sleepDb$delegate, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CoachBriefLoader.Loaded loaded = (CoachBriefLoader.Loaded) obj;
        this.$weekView$delegate.setValue(loaded.getWeek());
        this.$coachBrief$delegate.setValue(loaded.getBrief());
        TrainingWeekScreenKt.TrainingWeekScreen$lambda$20(this.$loading$delegate, false);
        return Unit.INSTANCE;
    }
}
