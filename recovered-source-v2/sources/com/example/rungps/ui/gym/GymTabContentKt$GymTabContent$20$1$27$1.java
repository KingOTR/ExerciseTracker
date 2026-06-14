package com.example.rungps.ui.gym;

import android.content.Context;
import android.media.ToneGenerator;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.notify.RestTimerNotifier;
import com.example.rungps.notify.RestTimerScheduler;
import com.example.rungps.util.HapticFeedback;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$27$1", f = "GymTabContent.kt", i = {0}, l = {1097}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$27$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Long> $restEndsAtMs$delegate;
    final /* synthetic */ MutableIntState $restTick$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$20$1$27$1(Context context, MutableState<Long> mutableState, MutableIntState mutableIntState, Continuation<? super GymTabContentKt$GymTabContent$20$1$27$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$restEndsAtMs$delegate = mutableState;
        this.$restTick$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymTabContentKt$GymTabContent$20$1$27$1 gymTabContentKt$GymTabContent$20$1$27$1 = new GymTabContentKt$GymTabContent$20$1$27$1(this.$ctx, this.$restEndsAtMs$delegate, this.$restTick$delegate, continuation);
        gymTabContentKt$GymTabContent$20$1$27$1.L$0 = obj;
        return gymTabContentKt$GymTabContent$20$1$27$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$27$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0038 -> B:5:0x003b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Long invoke$lambda$264$lambda$132;
        int invoke$lambda$264$lambda$135;
        Long invoke$lambda$264$lambda$1322;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            invoke$lambda$264$lambda$132 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$132(this.$restEndsAtMs$delegate);
            if (invoke$lambda$264$lambda$132 != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        invoke$lambda$264$lambda$135 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$135(this.$restTick$delegate);
        this.$restTick$delegate.setIntValue(invoke$lambda$264$lambda$135 + 1);
        invoke$lambda$264$lambda$1322 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$132(this.$restEndsAtMs$delegate);
        if (invoke$lambda$264$lambda$1322 != null) {
            if (System.currentTimeMillis() >= invoke$lambda$264$lambda$1322.longValue()) {
                this.$restEndsAtMs$delegate.setValue(null);
                RestTimerNotifier.INSTANCE.showRestComplete(this.$ctx);
                HapticFeedback.INSTANCE.pulse(this.$ctx, HapticFeedback.Pattern.RestDone);
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(Boxing.boxBoolean(new ToneGenerator(5, 80).startTone(24, 200)));
                RestTimerScheduler.INSTANCE.cancel(this.$ctx);
            }
            invoke$lambda$264$lambda$132 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$132(this.$restEndsAtMs$delegate);
            if (invoke$lambda$264$lambda$132 != null) {
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                invoke$lambda$264$lambda$135 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$135(this.$restTick$delegate);
                this.$restTick$delegate.setIntValue(invoke$lambda$264$lambda$135 + 1);
                invoke$lambda$264$lambda$1322 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$132(this.$restEndsAtMs$delegate);
                if (invoke$lambda$264$lambda$1322 != null) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
