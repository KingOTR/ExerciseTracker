package com.example.rungps.ui.main;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
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
import org.osmdroid.mapsforge.MapsForgeTileProvider;
import org.osmdroid.mapsforge.MapsForgeTileSource;
import org.osmdroid.tileprovider.MapTileProviderBasic;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.views.MapView;

/* compiled from: MapTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapTabContentKt$MapTabContent$7$1", f = "MapTabContent.kt", i = {0}, l = {304}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class MapTabContentKt$MapTabContent$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $mapUriString$delegate;
    final /* synthetic */ MapView $mapView;
    final /* synthetic */ MutableState<MapsForgeTileProvider> $mapsForgeProvider$delegate;
    final /* synthetic */ MutableState<Boolean> $offlineLoaded$delegate;
    final /* synthetic */ MutableState<String> $offlineStatus$delegate;
    final /* synthetic */ MutableState<Boolean> $usingOffline$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapTabContentKt$MapTabContent$7$1(Context context, MapView mapView, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, MutableState<String> mutableState4, MutableState<MapsForgeTileProvider> mutableState5, Continuation<? super MapTabContentKt$MapTabContent$7$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$mapView = mapView;
        this.$usingOffline$delegate = mutableState;
        this.$mapUriString$delegate = mutableState2;
        this.$offlineLoaded$delegate = mutableState3;
        this.$offlineStatus$delegate = mutableState4;
        this.$mapsForgeProvider$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MapTabContentKt$MapTabContent$7$1 mapTabContentKt$MapTabContent$7$1 = new MapTabContentKt$MapTabContent$7$1(this.$ctx, this.$mapView, this.$usingOffline$delegate, this.$mapUriString$delegate, this.$offlineLoaded$delegate, this.$offlineStatus$delegate, this.$mapsForgeProvider$delegate, continuation);
        mapTabContentKt$MapTabContent$7$1.L$0 = obj;
        return mapTabContentKt$MapTabContent$7$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MapTabContentKt$MapTabContent$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean MapTabContent$lambda$29;
        String MapTabContent$lambda$13;
        MapsForgeTileProvider MapTabContent$lambda$89;
        String MapTabContent$lambda$132;
        MapsForgeTileProvider MapTabContent$lambda$892;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            MapTabContent$lambda$29 = MapTabContentKt.MapTabContent$lambda$29(this.$usingOffline$delegate);
            if (MapTabContent$lambda$29) {
                MapTabContent$lambda$132 = MapTabContentKt.MapTabContent$lambda$13(this.$mapUriString$delegate);
                if (MapTabContent$lambda$132 != null) {
                    this.$offlineStatus$delegate.setValue("loading…");
                    MapTabContentKt.MapTabContent$lambda$46(this.$offlineLoaded$delegate, false);
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    obj = BuildersKt.withContext(Dispatchers.getIO(), new MapTabContentKt$MapTabContent$7$1$res$1(this.$ctx, this.$mapUriString$delegate, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            MapTabContentKt.MapTabContent$lambda$46(this.$offlineLoaded$delegate, false);
            MutableState<String> mutableState = this.$offlineStatus$delegate;
            MapTabContent$lambda$13 = MapTabContentKt.MapTabContent$lambda$13(this.$mapUriString$delegate);
            mutableState.setValue(MapTabContent$lambda$13 == null ? "none selected" : "online tiles");
            MapTabContent$lambda$89 = MapTabContentKt.MapTabContent$lambda$89(this.$mapsForgeProvider$delegate);
            if (MapTabContent$lambda$89 != null) {
                MapTabContent$lambda$89.detach();
            }
            this.$mapsForgeProvider$delegate.setValue(null);
            MapView mapView = this.$mapView;
            try {
                Result.Companion companion = Result.INSTANCE;
                mapView.getTileProvider().detach();
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            this.$mapView.setTileProvider(new MapTileProviderBasic(this.$ctx));
            this.$mapView.setTileSource(TileSourceFactory.MAPNIK);
            this.$mapView.setUseDataConnection(true);
            this.$mapView.invalidate();
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Object value = ((Result) obj).getValue();
        MapView mapView2 = this.$mapView;
        MutableState<MapsForgeTileProvider> mutableState2 = this.$mapsForgeProvider$delegate;
        MutableState<Boolean> mutableState3 = this.$offlineLoaded$delegate;
        MutableState<String> mutableState4 = this.$offlineStatus$delegate;
        if (Result.m7912isSuccessimpl(value)) {
            Pair pair = (Pair) value;
            MapsForgeTileProvider mapsForgeTileProvider = (MapsForgeTileProvider) pair.component1();
            MapsForgeTileSource mapsForgeTileSource = (MapsForgeTileSource) pair.component2();
            MapTabContent$lambda$892 = MapTabContentKt.MapTabContent$lambda$89(mutableState2);
            if (MapTabContent$lambda$892 != null) {
                MapTabContent$lambda$892.detach();
            }
            mutableState2.setValue(mapsForgeTileProvider);
            try {
                Result.Companion companion3 = Result.INSTANCE;
                mapView2.getTileProvider().detach();
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th2));
            }
            mapView2.setTileProvider(mapsForgeTileProvider);
            mapView2.setUseDataConnection(false);
            MapTabContentKt.MapTabContent$lambda$46(mutableState3, true);
            mutableState4.setValue("loaded");
            try {
                Result.Companion companion5 = Result.INSTANCE;
                mapView2.zoomToBoundingBox(mapsForgeTileSource.getBoundsOsmdroid(), true, 80);
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th3));
            }
        }
        Context context = this.$ctx;
        MutableState<String> mutableState5 = this.$offlineStatus$delegate;
        MutableState<Boolean> mutableState6 = this.$offlineLoaded$delegate;
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(value);
        if (m7908exceptionOrNullimpl != null) {
            String message = m7908exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "unknown";
            }
            mutableState5.setValue("error: " + message);
            MapTabContentKt.MapTabContent$lambda$46(mutableState6, false);
            String message2 = m7908exceptionOrNullimpl.getMessage();
            if (message2 == null) {
                message2 = "error";
            }
            Toast.makeText(context, "Offline map: " + message2, 1).show();
        }
        return Unit.INSTANCE;
    }
}
