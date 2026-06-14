package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import com.google.logging.type.LogSeverity;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.osmdroid.util.GeoPoint;

/* compiled from: RecordingRouteMap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.RecordingRouteMapKt$RecordingRouteMap$2$1", f = "RecordingRouteMap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RecordingRouteMapKt$RecordingRouteMap$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Double $liveLat;
    final /* synthetic */ Double $liveLon;
    final /* synthetic */ MutableState<Double> $offRouteM$delegate;
    final /* synthetic */ MutableState<List<GeoPoint>> $routePts$delegate;
    final /* synthetic */ MutableState<List<GeoPoint>> $trail$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecordingRouteMapKt$RecordingRouteMap$2$1(Double d, Double d2, MutableState<List<GeoPoint>> mutableState, MutableState<Double> mutableState2, MutableState<List<GeoPoint>> mutableState3, Continuation<? super RecordingRouteMapKt$RecordingRouteMap$2$1> continuation) {
        super(2, continuation);
        this.$liveLat = d;
        this.$liveLon = d2;
        this.$routePts$delegate = mutableState;
        this.$offRouteM$delegate = mutableState2;
        this.$trail$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecordingRouteMapKt$RecordingRouteMap$2$1(this.$liveLat, this.$liveLon, this.$routePts$delegate, this.$offRouteM$delegate, this.$trail$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecordingRouteMapKt$RecordingRouteMap$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List RecordingRouteMap$lambda$2;
        List RecordingRouteMap$lambda$22;
        Double offRouteDistanceM;
        List RecordingRouteMap$lambda$8;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Double d = this.$liveLat;
        Double d2 = this.$liveLon;
        if (d != null && d2 != null) {
            RecordingRouteMap$lambda$2 = RecordingRouteMapKt.RecordingRouteMap$lambda$2(this.$routePts$delegate);
            if (RecordingRouteMap$lambda$2.size() >= 2) {
                GeoPoint geoPoint = new GeoPoint(d.doubleValue(), d2.doubleValue());
                MutableState<Double> mutableState = this.$offRouteM$delegate;
                RecordingRouteMap$lambda$22 = RecordingRouteMapKt.RecordingRouteMap$lambda$2(this.$routePts$delegate);
                offRouteDistanceM = RecordingRouteMapKt.offRouteDistanceM(geoPoint, RecordingRouteMap$lambda$22);
                mutableState.setValue(offRouteDistanceM);
                RecordingRouteMap$lambda$8 = RecordingRouteMapKt.RecordingRouteMap$lambda$8(this.$trail$delegate);
                GeoPoint geoPoint2 = (GeoPoint) CollectionsKt.lastOrNull(RecordingRouteMap$lambda$8);
                if (geoPoint2 == null || MapOsMapKitKt.geoDistanceM(geoPoint2, geoPoint) >= 3.0d) {
                    this.$trail$delegate.setValue(CollectionsKt.takeLast(CollectionsKt.plus((Collection<? extends GeoPoint>) RecordingRouteMap$lambda$8, geoPoint), LogSeverity.WARNING_VALUE));
                }
                return Unit.INSTANCE;
            }
        }
        this.$offRouteM$delegate.setValue(null);
        return Unit.INSTANCE;
    }
}
