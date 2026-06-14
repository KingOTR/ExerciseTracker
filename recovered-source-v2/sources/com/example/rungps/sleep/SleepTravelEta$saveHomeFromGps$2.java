package com.example.rungps.sleep;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepTravelEta.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepTravelEta$saveHomeFromGps$2", f = "SleepTravelEta.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTravelEta$saveHomeFromGps$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ double $lat;
    final /* synthetic */ double $lon;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTravelEta$saveHomeFromGps$2(Context context, double d, double d2, Continuation<? super SleepTravelEta$saveHomeFromGps$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$lat = d;
        this.$lon = d2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTravelEta$saveHomeFromGps$2(this.$context, this.$lat, this.$lon, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((SleepTravelEta$saveHomeFromGps$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String reverseGeocode = SleepTravelEta.INSTANCE.reverseGeocode(this.$context, this.$lat, this.$lon);
        if (reverseGeocode == null) {
            String format = String.format(Locale.US, "%.5f", Arrays.copyOf(new Object[]{Boxing.boxDouble(this.$lat)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            String format2 = String.format(Locale.US, "%.5f", Arrays.copyOf(new Object[]{Boxing.boxDouble(this.$lon)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            reverseGeocode = format + ", " + format2;
        }
        SleepAlarmPreferences.INSTANCE.setHomeAddress(this.$context, reverseGeocode);
        SleepAlarmPreferences.INSTANCE.setHomeLatLon(this.$context, this.$lat, this.$lon);
        return reverseGeocode;
    }
}
