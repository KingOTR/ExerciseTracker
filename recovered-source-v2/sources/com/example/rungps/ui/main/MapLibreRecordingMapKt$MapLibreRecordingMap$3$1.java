package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
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
import org.maplibre.android.camera.CameraUpdateFactory;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Style;

/* compiled from: MapLibreRecordingMap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapLibreRecordingMapKt$MapLibreRecordingMap$3$1", f = "MapLibreRecordingMap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapLibreRecordingMapKt$MapLibreRecordingMap$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<MapLibreMap> $mapRef$delegate;
    final /* synthetic */ MutableState<List<LatLng>> $routePts$delegate;
    final /* synthetic */ MutableState<List<LatLng>> $trail$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapLibreRecordingMapKt$MapLibreRecordingMap$3$1(MutableState<MapLibreMap> mutableState, MutableState<List<LatLng>> mutableState2, MutableState<List<LatLng>> mutableState3, Continuation<? super MapLibreRecordingMapKt$MapLibreRecordingMap$3$1> continuation) {
        super(2, continuation);
        this.$mapRef$delegate = mutableState;
        this.$routePts$delegate = mutableState2;
        this.$trail$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapLibreRecordingMapKt$MapLibreRecordingMap$3$1(this.$mapRef$delegate, this.$routePts$delegate, this.$trail$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MapLibreRecordingMapKt$MapLibreRecordingMap$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MapLibreMap MapLibreRecordingMap$lambda$14;
        Style style;
        List MapLibreRecordingMap$lambda$2;
        List MapLibreRecordingMap$lambda$22;
        List MapLibreRecordingMap$lambda$5;
        List<LatLng> MapLibreRecordingMap$lambda$23;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            MapLibreRecordingMap$lambda$14 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$14(this.$mapRef$delegate);
            if (MapLibreRecordingMap$lambda$14 != null && (style = MapLibreRecordingMap$lambda$14.getStyle()) != null) {
                MapLibreRecordingMap$lambda$2 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$2(this.$routePts$delegate);
                MapLibreRecordingMapKt.updateLineSource(style, "planned-route", MapLibreRecordingMap$lambda$2, 2);
                MapLibreRecordingMap$lambda$22 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$2(this.$routePts$delegate);
                if (MapLibreRecordingMap$lambda$22.size() >= 2) {
                    MapLibreRecordingMap$lambda$5 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$5(this.$trail$delegate);
                    if (MapLibreRecordingMap$lambda$5.isEmpty()) {
                        LatLngBounds.Builder builder = new LatLngBounds.Builder();
                        MapLibreRecordingMap$lambda$23 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$2(this.$routePts$delegate);
                        MapLibreRecordingMap$lambda$14.animateCamera(CameraUpdateFactory.newLatLngBounds(builder.includes(MapLibreRecordingMap$lambda$23).build(), 100));
                    }
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
