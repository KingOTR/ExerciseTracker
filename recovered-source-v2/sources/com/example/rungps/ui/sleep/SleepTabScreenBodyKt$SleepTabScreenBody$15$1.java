package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepAlarmPreferences;
import com.example.rungps.sleep.SleepCalendarHelper;
import com.example.rungps.sleep.SleepWakePlanner;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$15$1", f = "SleepTabScreenBody.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$15$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Integer> $alarmHour$delegate;
    final /* synthetic */ MutableState<Integer> $alarmMinute$delegate;
    final /* synthetic */ MutableState<Boolean> $autoWakeSuggest$delegate;
    final /* synthetic */ SleepCalendarHelper.MorningCommitment $calendarCommitment;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ State<List<SleepEntryEntity>> $entries$delegate;
    final /* synthetic */ MutableState<Boolean> $trackingActive$delegate;
    final /* synthetic */ MutableState<SleepWakePlanner.Suggestion> $wakeSuggestion$delegate;
    final /* synthetic */ MutableState<Float> $windowMin$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SleepTabScreenBodyKt$SleepTabScreenBody$15$1(SleepCalendarHelper.MorningCommitment morningCommitment, Context context, State<? extends List<SleepEntryEntity>> state, MutableState<SleepWakePlanner.Suggestion> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, MutableState<Integer> mutableState4, MutableState<Integer> mutableState5, MutableState<Float> mutableState6, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$15$1> continuation) {
        super(2, continuation);
        this.$calendarCommitment = morningCommitment;
        this.$ctx = context;
        this.$entries$delegate = state;
        this.$wakeSuggestion$delegate = mutableState;
        this.$autoWakeSuggest$delegate = mutableState2;
        this.$trackingActive$delegate = mutableState3;
        this.$alarmHour$delegate = mutableState4;
        this.$alarmMinute$delegate = mutableState5;
        this.$windowMin$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$15$1(this.$calendarCommitment, this.$ctx, this.$entries$delegate, this.$wakeSuggestion$delegate, this.$autoWakeSuggest$delegate, this.$trackingActive$delegate, this.$alarmHour$delegate, this.$alarmMinute$delegate, this.$windowMin$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$15$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List SleepTabScreenBody$lambda$1;
        boolean SleepTabScreenBody$lambda$85;
        boolean SleepTabScreenBody$lambda$49;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SleepWakePlanner sleepWakePlanner = SleepWakePlanner.INSTANCE;
        SleepTabScreenBody$lambda$1 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$1(this.$entries$delegate);
        SleepWakePlanner.Suggestion suggest$default = SleepWakePlanner.suggest$default(sleepWakePlanner, SleepTabScreenBody$lambda$1, this.$calendarCommitment, 0.0d, null, 12, null);
        this.$wakeSuggestion$delegate.setValue(suggest$default);
        SleepTabScreenBody$lambda$85 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$85(this.$autoWakeSuggest$delegate);
        if (SleepTabScreenBody$lambda$85) {
            SleepTabScreenBody$lambda$49 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$49(this.$trackingActive$delegate);
            if (!SleepTabScreenBody$lambda$49 && !Intrinsics.areEqual(SleepAlarmPreferences.INSTANCE.lastAutoApplyDay(this.$ctx), LocalDate.now().toString())) {
                SleepTabScreenBodyKt.SleepTabScreenBody$lambda$57(this.$alarmHour$delegate, suggest$default.getAlarmHour());
                SleepTabScreenBodyKt.SleepTabScreenBody$lambda$61(this.$alarmMinute$delegate, suggest$default.getAlarmMinute());
                SleepTabScreenBodyKt.SleepTabScreenBody$lambda$65(this.$windowMin$delegate, suggest$default.getWindowMin());
                SleepAlarmPreferences.INSTANCE.setWindowMin(this.$ctx, suggest$default.getWindowMin());
                SleepAlarmPreferences sleepAlarmPreferences = SleepAlarmPreferences.INSTANCE;
                Context context = this.$ctx;
                String localDate = LocalDate.now().toString();
                Intrinsics.checkNotNullExpressionValue(localDate, "toString(...)");
                sleepAlarmPreferences.setLastAutoApplyDay(context, localDate);
            }
        }
        return Unit.INSTANCE;
    }
}
