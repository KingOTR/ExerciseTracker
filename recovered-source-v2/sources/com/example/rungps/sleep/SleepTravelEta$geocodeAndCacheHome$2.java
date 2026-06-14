package com.example.rungps.sleep;

import android.content.Context;
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

/* compiled from: SleepTravelEta.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepTravelEta$geocodeAndCacheHome$2", f = "SleepTravelEta.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTravelEta$geocodeAndCacheHome$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTravelEta$geocodeAndCacheHome$2(Context context, String str, Continuation<? super SleepTravelEta$geocodeAndCacheHome$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$address = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTravelEta$geocodeAndCacheHome$2(this.$context, this.$address, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTravelEta$geocodeAndCacheHome$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SleepAlarmPreferences.INSTANCE.setHomeAddress(this.$context, this.$address);
        Pair<Double, Double> geocode = SleepTravelEta.INSTANCE.geocode(this.$context, this.$address);
        if (geocode != null) {
            SleepAlarmPreferences.INSTANCE.setHomeLatLon(this.$context, geocode.getFirst().doubleValue(), geocode.getSecond().doubleValue());
        } else {
            SleepAlarmPreferences.INSTANCE.clearHomeLatLon(this.$context);
        }
        return Unit.INSTANCE;
    }
}
