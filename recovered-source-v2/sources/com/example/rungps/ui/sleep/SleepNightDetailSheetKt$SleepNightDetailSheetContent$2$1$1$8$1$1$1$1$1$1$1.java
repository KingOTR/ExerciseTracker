package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.SleepSoundEventEntity;
import com.example.rungps.sleep.SleepClipPlayer;
import java.io.File;
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

/* compiled from: SleepNightDetailSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$1$1$1", f = "SleepNightDetailSheet.kt", i = {}, l = {325}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ SleepSoundEventEntity $ev;
    final /* synthetic */ MutableState<Boolean> $soundBusy$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$1$1$1(Context context, MutableState<Boolean> mutableState, SleepSoundEventEntity sleepSoundEventEntity, Continuation<? super SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$soundBusy$delegate = mutableState;
        this.$ev = sleepSoundEventEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$1$1$1(this.$ctx, this.$soundBusy$delegate, this.$ev, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$22(this.$soundBusy$delegate, true);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$1$1$1$wav$1(this.$ctx, this.$ev, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        SleepClipPlayer.INSTANCE.play(this.$ctx, (File) obj);
        SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$22(this.$soundBusy$delegate, false);
        return Unit.INSTANCE;
    }
}
