package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.nfc.GymCheckIn;
import com.example.rungps.nfc.GymLocation;
import com.example.rungps.nfc.RegisteredGymCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymNfcSetupPanel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.GymNfcSetupPanelKt$GymNfcSetupPanel$1$1", f = "GymNfcSetupPanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymNfcSetupPanelKt$GymNfcSetupPanel$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<RegisteredGymCard>> $cards$delegate;
    final /* synthetic */ MutableState<List<GymCheckIn>> $checkIns$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableFloatState $defaultRadiusM$delegate;
    final /* synthetic */ MutableState<List<GymLocation>> $locations$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymNfcSetupPanelKt$GymNfcSetupPanel$1$1(Context context, MutableState<List<GymLocation>> mutableState, MutableState<List<RegisteredGymCard>> mutableState2, MutableState<List<GymCheckIn>> mutableState3, MutableFloatState mutableFloatState, Continuation<? super GymNfcSetupPanelKt$GymNfcSetupPanel$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$locations$delegate = mutableState;
        this.$cards$delegate = mutableState2;
        this.$checkIns$delegate = mutableState3;
        this.$defaultRadiusM$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymNfcSetupPanelKt$GymNfcSetupPanel$1$1(this.$ctx, this.$locations$delegate, this.$cards$delegate, this.$checkIns$delegate, this.$defaultRadiusM$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymNfcSetupPanelKt$GymNfcSetupPanel$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GymNfcSetupPanelKt.GymNfcSetupPanel$refresh(this.$ctx, this.$locations$delegate, this.$cards$delegate, this.$checkIns$delegate, this.$defaultRadiusM$delegate);
        return Unit.INSTANCE;
    }
}
