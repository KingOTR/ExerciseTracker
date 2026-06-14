package com.example.rungps.ui.sleep;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Pair;
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

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1", f = "SleepTabScreenBody.kt", i = {}, l = {382, 387}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $homeAddress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1(Context context, MutableState<String> mutableState, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$homeAddress$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1(this.$ctx, this.$homeAddress$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0073  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1$pt$1(this.$ctx, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                str = (String) obj;
                MutableState<String> mutableState = this.$homeAddress$delegate;
                if (str == null) {
                    str = "";
                }
                mutableState.setValue(str);
                Toast.makeText(this.$ctx, "Home saved from GPS", 0).show();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            Toast.makeText(this.$ctx, "Could not get GPS fix — try again outdoors", 0).show();
            return Unit.INSTANCE;
        }
        this.label = 2;
        obj = BuildersKt.withContext(Dispatchers.getIO(), new SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1$addr$1(this.$ctx, pair, null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        str = (String) obj;
        MutableState<String> mutableState2 = this.$homeAddress$delegate;
        if (str == null) {
        }
        mutableState2.setValue(str);
        Toast.makeText(this.$ctx, "Home saved from GPS", 0).show();
        return Unit.INSTANCE;
    }
}
