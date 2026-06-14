package com.example.rungps.notify;

import android.content.Context;
import com.example.rungps.data.ExercisePr;
import com.example.rungps.data.Repository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PrNotifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/ExercisePr;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.notify.PrNotifier$maybeNotifyPr$prior$1", f = "PrNotifier.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class PrNotifier$maybeNotifyPr$prior$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ExercisePr>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $exerciseName;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrNotifier$maybeNotifyPr$prior$1(Context context, String str, Continuation<? super PrNotifier$maybeNotifyPr$prior$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$exerciseName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PrNotifier$maybeNotifyPr$prior$1(this.$context, this.$exerciseName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ExercisePr> continuation) {
        return ((PrNotifier$maybeNotifyPr$prior$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = Repository.INSTANCE.get(this.$context).prForExercise(this.$exerciseName, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
