package com.example.rungps.sleep;

import android.content.Context;
import androidx.compose.material3.MenuKt;
import com.example.rungps.sleep.SleepTravelEta;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepTravelEta.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/sleep/SleepTravelEta$TravelResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepTravelEta$resolveBufferMin$2", f = "SleepTravelEta.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTravelEta$resolveBufferMin$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SleepTravelEta.TravelResult>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $destinationAddress;
    final /* synthetic */ int $fallbackMin;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTravelEta$resolveBufferMin$2(Context context, String str, int i, Continuation<? super SleepTravelEta$resolveBufferMin$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$destinationAddress = str;
        this.$fallbackMin = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTravelEta$resolveBufferMin$2(this.$context, this.$destinationAddress, this.$fallbackMin, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SleepTravelEta.TravelResult> continuation) {
        return ((SleepTravelEta$resolveBufferMin$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer drivingDurationMinutes;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Pair<Double, Double> geocode = SleepTravelEta.INSTANCE.geocode(this.$context, this.$destinationAddress);
        if (geocode == null) {
            return new SleepTravelEta.TravelResult(this.$fallbackMin, null);
        }
        Pair<Double, Double> originLatLon = SleepTravelEta.INSTANCE.originLatLon(this.$context);
        if (originLatLon != null) {
            drivingDurationMinutes = SleepTravelEta.INSTANCE.drivingDurationMinutes(originLatLon.getFirst().doubleValue(), originLatLon.getSecond().doubleValue(), geocode.getFirst().doubleValue(), geocode.getSecond().doubleValue());
            if (drivingDurationMinutes == null) {
                return new SleepTravelEta.TravelResult(this.$fallbackMin, null);
            }
            int intValue = drivingDurationMinutes.intValue();
            return new SleepTravelEta.TravelResult(RangesKt.coerceIn(intValue + 5, 10, MenuKt.InTransitionDuration), intValue + " min drive + 5 min buffer");
        }
        return new SleepTravelEta.TravelResult(this.$fallbackMin, "Set home address for drive ETA");
    }
}
