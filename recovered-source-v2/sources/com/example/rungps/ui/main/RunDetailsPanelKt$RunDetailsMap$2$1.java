package com.example.rungps.ui.main;

import com.example.rungps.data.PointEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.Polyline;

/* compiled from: RunDetailsPanel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.RunDetailsPanelKt$RunDetailsMap$2$1", f = "RunDetailsPanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunDetailsPanelKt$RunDetailsMap$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $endIdx;
    final /* synthetic */ MapView $mapView;
    final /* synthetic */ List<PointEntity> $points;
    final /* synthetic */ int $startIdx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunDetailsPanelKt$RunDetailsMap$2$1(List<PointEntity> list, int i, int i2, MapView mapView, Continuation<? super RunDetailsPanelKt$RunDetailsMap$2$1> continuation) {
        super(2, continuation);
        this.$points = list;
        this.$startIdx = i;
        this.$endIdx = i2;
        this.$mapView = mapView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunDetailsPanelKt$RunDetailsMap$2$1(this.$points, this.$startIdx, this.$endIdx, this.$mapView, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunDetailsPanelKt$RunDetailsMap$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int lastIndex = CollectionsKt.getLastIndex(this.$points);
        int coerceAtMost = RangesKt.coerceAtMost(RangesKt.coerceIn(this.$startIdx, 0, lastIndex), RangesKt.coerceIn(this.$endIdx, 0, lastIndex));
        List<PointEntity> subList = this.$points.subList(coerceAtMost, RangesKt.coerceAtLeast(RangesKt.coerceIn(this.$endIdx, 0, lastIndex), coerceAtMost) + 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subList, 10));
        for (PointEntity pointEntity : subList) {
            arrayList.add(new GeoPoint(pointEntity.getLat(), pointEntity.getLon()));
        }
        ArrayList arrayList2 = arrayList;
        List<Overlay> overlays = this.$mapView.getOverlays();
        Intrinsics.checkNotNullExpressionValue(overlays, "getOverlays(...)");
        CollectionsKt.removeAll((List) overlays, new Function1() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$RunDetailsMap$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean invokeSuspend$lambda$1;
                invokeSuspend$lambda$1 = RunDetailsPanelKt$RunDetailsMap$2$1.invokeSuspend$lambda$1((Overlay) obj2);
                return Boolean.valueOf(invokeSuspend$lambda$1);
            }
        });
        if (arrayList2.size() >= 2) {
            Polyline polyline = new Polyline();
            polyline.getOutlinePaint().setColor(-16776961);
            polyline.getOutlinePaint().setStrokeWidth(8.0f);
            polyline.setPoints(arrayList2);
            this.$mapView.getOverlays().add(polyline);
            BoundingBox bounds = polyline.getBounds();
            if (bounds != null) {
                this.$mapView.zoomToBoundingBox(bounds, true, 60);
            }
        }
        this.$mapView.invalidate();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1(Overlay overlay) {
        return overlay instanceof Polyline;
    }
}
