package com.example.rungps.ui.sleep;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepEntryTimeEditor;
import com.example.rungps.sleep.SleepMlFeedbackApply;
import com.example.rungps.sleep.SleepQuickTest;
import java.time.LocalTime;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1", f = "SleepTabScreenBody.kt", i = {0, 1}, l = {1655, 1656, 1661}, m = "invokeSuspend", n = {"endedOverride", "sampleCount"}, s = {"L$0", "I$0"})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<SleepMlFeedbackApply.Kind> $hypnoFeedback$delegate;
    final /* synthetic */ MutableState<SleepEntryEntity> $repairEntry$delegate;
    final /* synthetic */ MutableState<Boolean> $showRepairPrompt$delegate;
    final /* synthetic */ MutableState<Boolean> $showWakeMood$delegate;
    final /* synthetic */ MutableState<Boolean> $smartAlarm$delegate;
    final /* synthetic */ long $started;
    final /* synthetic */ MutableState<Boolean> $trackingActive$delegate;
    final /* synthetic */ MutableState<String> $wakeError$delegate;
    final /* synthetic */ MutableIntState $wakeMood$delegate;
    final /* synthetic */ MutableState<String> $wakeText$delegate;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1(MutableState<String> mutableState, long j, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, Context context, MutableState<SleepMlFeedbackApply.Kind> mutableState4, MutableIntState mutableIntState, MutableState<Boolean> mutableState5, MutableState<SleepEntryEntity> mutableState6, MutableState<Boolean> mutableState7, MutableState<Boolean> mutableState8, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1> continuation) {
        super(2, continuation);
        this.$wakeText$delegate = mutableState;
        this.$started = j;
        this.$wakeError$delegate = mutableState2;
        this.$showWakeMood$delegate = mutableState3;
        this.$ctx = context;
        this.$hypnoFeedback$delegate = mutableState4;
        this.$wakeMood$delegate = mutableIntState;
        this.$smartAlarm$delegate = mutableState5;
        this.$repairEntry$delegate = mutableState6;
        this.$showRepairPrompt$delegate = mutableState7;
        this.$trackingActive$delegate = mutableState8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1 sleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1 = new SleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1(this.$wakeText$delegate, this.$started, this.$wakeError$delegate, this.$showWakeMood$delegate, this.$ctx, this.$hypnoFeedback$delegate, this.$wakeMood$delegate, this.$smartAlarm$delegate, this.$repairEntry$delegate, this.$showRepairPrompt$delegate, this.$trackingActive$delegate, continuation);
        sleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1.L$0 = obj;
        return sleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0110 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String SleepTabScreenBody$lambda$249;
        String SleepTabScreenBody$lambda$2492;
        Long l;
        String SleepTabScreenBody$lambda$252;
        Object withContext;
        long wakeTimeToEpochMs;
        int intValue;
        Object withContext2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SleepTabScreenBody$lambda$249 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$249(this.$wakeText$delegate);
            Intrinsics.checkNotNullExpressionValue(SleepTabScreenBody$lambda$249, "access$SleepTabScreenBody$lambda$249(...)");
            LocalTime parseSleepClockTime = SleepFormattersKt.parseSleepClockTime(SleepTabScreenBody$lambda$249);
            if (parseSleepClockTime == null) {
                MutableState<String> mutableState = this.$wakeText$delegate;
                MutableState<String> mutableState2 = this.$wakeError$delegate;
                SleepTabScreenBody$lambda$2492 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$249(mutableState);
                Intrinsics.checkNotNullExpressionValue(SleepTabScreenBody$lambda$2492, "access$SleepTabScreenBody$lambda$249(...)");
                if (!StringsKt.isBlank(SleepTabScreenBody$lambda$2492)) {
                    mutableState2.setValue("Use 7:00 AM or 07:00");
                }
                l = null;
            } else {
                long j = this.$started;
                this.$wakeError$delegate.setValue(null);
                wakeTimeToEpochMs = SleepEntryTimeEditor.INSTANCE.wakeTimeToEpochMs(parseSleepClockTime.getHour(), parseSleepClockTime.getMinute(), j, (r18 & 8) != 0 ? System.currentTimeMillis() : 0L, (r18 & 16) != 0 ? ZoneId.systemDefault() : null);
                l = Boxing.boxLong(wakeTimeToEpochMs);
            }
            SleepTabScreenBody$lambda$252 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$252(this.$wakeError$delegate);
            if (SleepTabScreenBody$lambda$252 != null) {
                SleepTabScreenBodyKt.SleepTabScreenBody$lambda$127(this.$showWakeMood$delegate, true);
                return Unit.INSTANCE;
            }
            this.L$0 = l;
            this.label = 1;
            withContext = BuildersKt.withContext(Dispatchers.getIO(), new SleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1$sampleCount$1(this.$ctx, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                intValue = this.I$0;
                ResultKt.throwOnFailure(obj);
                withContext2 = obj;
                SleepTabScreenBodyKt.SleepTabScreenBody$lambda$50(this.$trackingActive$delegate, false);
                this.$hypnoFeedback$delegate.setValue(null);
                this.label = 3;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1((SleepEntryEntity) withContext2, this.$ctx, intValue, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            l = (Long) this.L$0;
            ResultKt.throwOnFailure(obj);
            withContext = obj;
        }
        Long l2 = l;
        intValue = ((Number) withContext).intValue();
        this.L$0 = null;
        this.I$0 = intValue;
        this.label = 2;
        withContext2 = BuildersKt.withContext(Dispatchers.getIO(), new SleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1$saved$1(l2, this.$hypnoFeedback$delegate, this.$ctx, this.$wakeMood$delegate, this.$smartAlarm$delegate, this.$repairEntry$delegate, this.$showRepairPrompt$delegate, null), this);
        if (withContext2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$50(this.$trackingActive$delegate, false);
        this.$hypnoFeedback$delegate.setValue(null);
        this.label = 3;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1((SleepEntryEntity) withContext2, this.$ctx, intValue, null), this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SleepTabScreenBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1$1", f = "SleepTabScreenBody.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ int $sampleCount;
        final /* synthetic */ SleepEntryEntity $saved;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SleepEntryEntity sleepEntryEntity, Context context, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$saved = sleepEntryEntity;
            this.$ctx = context;
            this.$sampleCount = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$saved, this.$ctx, this.$sampleCount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepEntryEntity sleepEntryEntity = this.$saved;
            if (sleepEntryEntity == null) {
                Toast.makeText(this.$ctx, "Nothing to save", 0).show();
            } else {
                int endTimeMs = (int) ((sleepEntryEntity.getEndTimeMs() - this.$saved.getStartTimeMs()) / 60000);
                if (endTimeMs <= 25) {
                    str = CollectionsKt.joinToString$default(SleepQuickTest.INSTANCE.successCriteria(endTimeMs, this.$saved.getTotalSleepMin(), this.$sampleCount), "\n", null, null, 0, null, null, 62, null);
                } else {
                    str = "Night saved";
                }
                Toast.makeText(this.$ctx, str, 1).show();
            }
            return Unit.INSTANCE;
        }
    }
}
