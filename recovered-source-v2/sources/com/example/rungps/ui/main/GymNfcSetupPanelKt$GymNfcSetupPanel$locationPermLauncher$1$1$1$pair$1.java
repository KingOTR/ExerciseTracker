package com.example.rungps.ui.main;

import android.content.Context;
import com.example.rungps.nfc.GymLocationHelper;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymNfcSetupPanel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.GymNfcSetupPanelKt$GymNfcSetupPanel$locationPermLauncher$1$1$1$pair$1", f = "GymNfcSetupPanel.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymNfcSetupPanelKt$GymNfcSetupPanel$locationPermLauncher$1$1$1$pair$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Double, ? extends Double>>, Object> {
    final /* synthetic */ Context $ctx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymNfcSetupPanelKt$GymNfcSetupPanel$locationPermLauncher$1$1$1$pair$1(Context context, Continuation<? super GymNfcSetupPanelKt$GymNfcSetupPanel$locationPermLauncher$1$1$1$pair$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymNfcSetupPanelKt$GymNfcSetupPanel$locationPermLauncher$1$1$1$pair$1(this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Double, ? extends Double>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<Double, Double>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<Double, Double>> continuation) {
        return ((GymNfcSetupPanelKt$GymNfcSetupPanel$locationPermLauncher$1$1$1$pair$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = GymLocationHelper.INSTANCE.fetchCurrentLocation(this.$ctx, this);
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
