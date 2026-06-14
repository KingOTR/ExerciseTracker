package com.example.rungps.nfc;

import android.widget.Toast;
import androidx.activity.ComponentActivity;
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

/* compiled from: GymNfcController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.nfc.GymNfcController$promptOrAutoNfcAfterLocation$1", f = "GymNfcController.kt", i = {}, l = {275}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymNfcController$promptOrAutoNfcAfterLocation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $kind;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GymNfcController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymNfcController$promptOrAutoNfcAfterLocation$1(GymNfcController gymNfcController, String str, Continuation<? super GymNfcController$promptOrAutoNfcAfterLocation$1> continuation) {
        super(2, continuation);
        this.this$0 = gymNfcController;
        this.$kind = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymNfcController$promptOrAutoNfcAfterLocation$1 gymNfcController$promptOrAutoNfcAfterLocation$1 = new GymNfcController$promptOrAutoNfcAfterLocation$1(this.this$0, this.$kind, continuation);
        gymNfcController$promptOrAutoNfcAfterLocation$1.L$0 = obj;
        return gymNfcController$promptOrAutoNfcAfterLocation$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymNfcController$promptOrAutoNfcAfterLocation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        ComponentActivity componentActivity;
        ComponentActivity componentActivity2;
        ComponentActivity componentActivity3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GymNfcController gymNfcController = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                this.label = 1;
                obj = gymNfcController.recoveryBlocksStart(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        Boolean boxBoolean = Boxing.boxBoolean(false);
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = boxBoolean;
        }
        if (!((Boolean) m7905constructorimpl).booleanValue()) {
            GymNfcHandler gymNfcHandler = GymNfcHandler.INSTANCE;
            componentActivity2 = this.this$0.activity;
            gymNfcHandler.setPending(componentActivity2, "start_next");
            this.this$0.bumpPulse();
            componentActivity3 = this.this$0.activity;
            Toast.makeText(componentActivity3, "Gym session queued — open Gym tab", 0).show();
        } else {
            this.this$0.setPrompt(this.$kind);
            this.this$0.setConfirmSeq(this.this$0.getConfirmSeq() + 1);
            this.this$0.bumpPulse();
            componentActivity = this.this$0.activity;
            Toast.makeText(componentActivity, "Gym card — start session?", 0).show();
        }
        return Unit.INSTANCE;
    }
}
