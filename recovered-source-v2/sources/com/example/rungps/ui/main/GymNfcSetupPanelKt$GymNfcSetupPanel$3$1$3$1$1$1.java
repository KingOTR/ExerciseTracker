package com.example.rungps.ui.main;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.rungps.nfc.GymNfcGuard;
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

/* compiled from: GymNfcSetupPanel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.GymNfcSetupPanelKt$GymNfcSetupPanel$3$1$3$1$1$1", f = "GymNfcSetupPanel.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymNfcSetupPanelKt$GymNfcSetupPanel$3$1$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $atGymState$delegate;
    final /* synthetic */ Context $ctx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymNfcSetupPanelKt$GymNfcSetupPanel$3$1$3$1$1$1(Context context, MutableState<Boolean> mutableState, Continuation<? super GymNfcSetupPanelKt$GymNfcSetupPanel$3$1$3$1$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$atGymState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymNfcSetupPanelKt$GymNfcSetupPanel$3$1$3$1$1$1(this.$ctx, this.$atGymState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymNfcSetupPanelKt$GymNfcSetupPanel$3$1$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean GymNfcSetupPanel$lambda$33;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new GymNfcSetupPanelKt$GymNfcSetupPanel$3$1$3$1$1$1$ok$1(this.$ctx, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        GymNfcSetupPanelKt.GymNfcSetupPanel$lambda$34(this.$atGymState$delegate, GymNfcGuard.INSTANCE.isAtGym(this.$ctx));
        if (booleanValue) {
            GymNfcSetupPanel$lambda$33 = GymNfcSetupPanelKt.GymNfcSetupPanel$lambda$33(this.$atGymState$delegate);
            str = GymNfcSetupPanel$lambda$33 ? "Auto-start on — you are at the gym now" : "Auto-start on — tap card at gym (GPS must be inside geofence)";
        } else {
            str = "Could not refresh GPS — grant location and try again";
        }
        Toast.makeText(this.$ctx, str, 1).show();
        return Unit.INSTANCE;
    }
}
