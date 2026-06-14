package com.example.rungps.ui.main;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.osmdroid.util.GeoPoint;

/* compiled from: MapTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapTabContentKt$MapTabContent$2$1", f = "MapTabContent.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapTabContentKt$MapTabContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ OsMapKit $kit;
    final /* synthetic */ MutableState<Boolean> $locatingFromMyLocationBtn$delegate;
    final /* synthetic */ MutableState<Boolean> $pendingGpsCenter$delegate;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapTabContentKt$MapTabContent$2$1(Context context, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, OsMapKit osMapKit, Continuation<? super MapTabContentKt$MapTabContent$2$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$pendingGpsCenter$delegate = mutableState;
        this.$locatingFromMyLocationBtn$delegate = mutableState2;
        this.$kit = osMapKit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapTabContentKt$MapTabContent$2$1(this.$ctx, this.$pendingGpsCenter$delegate, this.$locatingFromMyLocationBtn$delegate, this.$kit, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MapTabContentKt$MapTabContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x009c -> B:5:0x009f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean MapTabContent$lambda$65;
        boolean MapTabContent$lambda$69;
        OsMapKit osMapKit;
        MutableState<Boolean> mutableState;
        int i;
        MutableState<Boolean> mutableState2;
        int i2;
        boolean MapTabContent$lambda$692;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            MapTabContent$lambda$65 = MapTabContentKt.MapTabContent$lambda$65(this.$pendingGpsCenter$delegate);
            if (!MapTabContent$lambda$65) {
                return Unit.INSTANCE;
            }
            if (ContextCompat.checkSelfPermission(this.$ctx, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                MapTabContentKt.MapTabContent$lambda$66(this.$pendingGpsCenter$delegate, false);
                MapTabContent$lambda$69 = MapTabContentKt.MapTabContent$lambda$69(this.$locatingFromMyLocationBtn$delegate);
                if (MapTabContent$lambda$69) {
                    MapTabContentKt.MapTabContent$lambda$70(this.$locatingFromMyLocationBtn$delegate, false);
                    Toast.makeText(this.$ctx, "Allow location to center the map on you.", 0).show();
                }
                return Unit.INSTANCE;
            }
            osMapKit = this.$kit;
            mutableState = this.$pendingGpsCenter$delegate;
            i = 0;
            mutableState2 = this.$locatingFromMyLocationBtn$delegate;
            i2 = 200;
            if (i >= i2) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$1;
            i2 = this.I$0;
            mutableState2 = (MutableState) this.L$2;
            mutableState = (MutableState) this.L$1;
            osMapKit = (OsMapKit) this.L$0;
            ResultKt.throwOnFailure(obj);
            i++;
            if (i >= i2) {
                MapTabContentKt.MapTabContent$lambda$66(this.$pendingGpsCenter$delegate, false);
                MapTabContent$lambda$692 = MapTabContentKt.MapTabContent$lambda$69(this.$locatingFromMyLocationBtn$delegate);
                if (MapTabContent$lambda$692) {
                    MapTabContentKt.MapTabContent$lambda$70(this.$locatingFromMyLocationBtn$delegate, false);
                    Toast.makeText(this.$ctx, "No GPS fix yet (check location/privacy outdoors).", 0).show();
                }
                return Unit.INSTANCE;
            }
            GeoPoint myLocation = osMapKit.getLocationOverlay().getMyLocation();
            if (myLocation != null) {
                osMapKit.getMapView().getController().setZoom(RangesKt.coerceAtLeast(osMapKit.getMapView().getZoomLevelDouble(), 14.0d));
                osMapKit.getMapView().getController().setCenter(myLocation);
                MapTabContentKt.MapTabContent$lambda$66(mutableState, false);
                MapTabContentKt.MapTabContent$lambda$70(mutableState2, false);
                return Unit.INSTANCE;
            }
            this.L$0 = osMapKit;
            this.L$1 = mutableState;
            this.L$2 = mutableState2;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 1;
            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i++;
            if (i >= i2) {
            }
        }
    }
}
