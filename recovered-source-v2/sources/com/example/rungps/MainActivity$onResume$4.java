package com.example.rungps;

import com.example.rungps.nfc.GymLocationHelper;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.MainActivity$onResume$4", f = "MainActivity.kt", i = {}, l = {585}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MainActivity$onResume$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$onResume$4(MainActivity mainActivity, Continuation<? super MainActivity$onResume$4> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MainActivity$onResume$4 mainActivity$onResume$4 = new MainActivity$onResume$4(this.this$0, continuation);
        mainActivity$onResume$4.L$0 = obj;
        return mainActivity$onResume$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivity$onResume$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MainActivity mainActivity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MainActivity mainActivity2 = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                this.L$0 = mainActivity2;
                this.label = 1;
                if (GymLocationHelper.INSTANCE.refreshStoredLocation(mainActivity2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mainActivity = mainActivity2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mainActivity = (MainActivity) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mainActivity.getGymNfc().updateReaderMode();
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
