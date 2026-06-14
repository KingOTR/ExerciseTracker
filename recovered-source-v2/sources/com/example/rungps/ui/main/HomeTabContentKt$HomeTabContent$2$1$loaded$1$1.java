package com.example.rungps.ui.main;

import android.content.Context;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HomeTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$2$1$loaded$1$1", f = "HomeTabContent.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HomeTabContentKt$HomeTabContent$2$1$loaded$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DailyTrainingCoach.DailyCoachBrief>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ List<GymSessionEntity> $gymSessions;
    final /* synthetic */ State<List<RecoveryEventEntity>> $recoveryHome$delegate;
    final /* synthetic */ State<List<RunEntity>> $runsEntities$delegate;
    final /* synthetic */ State<List<SleepEntryEntity>> $sleepHome$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HomeTabContentKt$HomeTabContent$2$1$loaded$1$1(Context context, List<GymSessionEntity> list, State<? extends List<RunEntity>> state, State<? extends List<RecoveryEventEntity>> state2, State<? extends List<SleepEntryEntity>> state3, Continuation<? super HomeTabContentKt$HomeTabContent$2$1$loaded$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$gymSessions = list;
        this.$runsEntities$delegate = state;
        this.$recoveryHome$delegate = state2;
        this.$sleepHome$delegate = state3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeTabContentKt$HomeTabContent$2$1$loaded$1$1(this.$ctx, this.$gymSessions, this.$runsEntities$delegate, this.$recoveryHome$delegate, this.$sleepHome$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DailyTrainingCoach.DailyCoachBrief> continuation) {
        return ((HomeTabContentKt$HomeTabContent$2$1$loaded$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List HomeTabContent$lambda$5;
        List HomeTabContent$lambda$6;
        List HomeTabContent$lambda$7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoachBriefLoader coachBriefLoader = CoachBriefLoader.INSTANCE;
            Context context = this.$ctx;
            HomeTabContent$lambda$5 = HomeTabContentKt.HomeTabContent$lambda$5(this.$runsEntities$delegate);
            List<GymSessionEntity> list = this.$gymSessions;
            HomeTabContent$lambda$6 = HomeTabContentKt.HomeTabContent$lambda$6(this.$recoveryHome$delegate);
            HomeTabContent$lambda$7 = HomeTabContentKt.HomeTabContent$lambda$7(this.$sleepHome$delegate);
            this.label = 1;
            obj = coachBriefLoader.load(context, HomeTabContent$lambda$5, list, HomeTabContent$lambda$6, HomeTabContent$lambda$7, (r17 & 32) != 0 ? ZoneId.systemDefault() : null, this);
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
