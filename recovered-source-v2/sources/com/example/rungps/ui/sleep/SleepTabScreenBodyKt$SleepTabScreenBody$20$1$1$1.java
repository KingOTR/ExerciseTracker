package com.example.rungps.ui.sleep;

import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.data.SleepEntryEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$20$1$1$1", f = "SleepTabScreenBody.kt", i = {}, l = {726}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$20$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $deep;
    final /* synthetic */ Integer $eff;
    final /* synthetic */ Ref.LongRef $end;
    final /* synthetic */ Integer $light;
    final /* synthetic */ int $qual;
    final /* synthetic */ String $src;
    final /* synthetic */ Ref.LongRef $start;
    final /* synthetic */ Integer $totalMin;
    final /* synthetic */ ExerciseTrackerUseCases $useCases;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$20$1$1$1(ExerciseTrackerUseCases exerciseTrackerUseCases, Ref.LongRef longRef, Ref.LongRef longRef2, Integer num, Integer num2, Integer num3, Integer num4, int i, String str, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$20$1$1$1> continuation) {
        super(2, continuation);
        this.$useCases = exerciseTrackerUseCases;
        this.$start = longRef;
        this.$end = longRef2;
        this.$totalMin = num;
        this.$deep = num2;
        this.$light = num3;
        this.$eff = num4;
        this.$qual = i;
        this.$src = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$20$1$1$1(this.$useCases, this.$start, this.$end, this.$totalMin, this.$deep, this.$light, this.$eff, this.$qual, this.$src, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$20$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$useCases.getAddSleepEntry().invoke(new SleepEntryEntity(0L, this.$start.element, this.$end.element, this.$totalMin.intValue(), this.$deep, this.$light, this.$eff, Boxing.boxInt(this.$qual), this.$src, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741313, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
