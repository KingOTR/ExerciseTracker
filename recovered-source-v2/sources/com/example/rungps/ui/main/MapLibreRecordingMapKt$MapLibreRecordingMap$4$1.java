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
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Style;

/* compiled from: MapLibreRecordingMap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapLibreRecordingMapKt$MapLibreRecordingMap$4$1", f = "MapLibreRecordingMap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapLibreRecordingMapKt$MapLibreRecordingMap$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<MapLibreMap> $mapRef$delegate;
    final /* synthetic */ MutableState<List<LatLng>> $trail$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapLibreRecordingMapKt$MapLibreRecordingMap$4$1(MutableState<MapLibreMap> mutableState, MutableState<List<LatLng>> mutableState2, Continuation<? super MapLibreRecordingMapKt$MapLibreRecordingMap$4$1> continuation) {
        super(2, continuation);
        this.$mapRef$delegate = mutableState;
        this.$trail$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapLibreRecordingMapKt$MapLibreRecordingMap$4$1(this.$mapRef$delegate, this.$trail$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MapLibreRecordingMapKt$MapLibreRecordingMap$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MapLibreMap MapLibreRecordingMap$lambda$14;
        Style style;
        List MapLibreRecordingMap$lambda$5;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            MapLibreRecordingMap$lambda$14 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$14(this.$mapRef$delegate);
            if (MapLibreRecordingMap$lambda$14 != null && (style = MapLibreRecordingMap$lambda$14.getStyle()) != null) {
                MapLibreRecordingMap$lambda$5 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$5(this.$trail$delegate);
                MapLibreRecordingMapKt.updateLineSource(style, "travelled-route", MapLibreRecordingMap$lambda$5, 2);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
