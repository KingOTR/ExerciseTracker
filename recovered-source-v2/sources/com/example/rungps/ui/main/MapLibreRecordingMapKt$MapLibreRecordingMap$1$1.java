package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RoutePointEntity;
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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.maplibre.android.geometry.LatLng;

/* compiled from: MapLibreRecordingMap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapLibreRecordingMapKt$MapLibreRecordingMap$1$1", f = "MapLibreRecordingMap.kt", i = {}, l = {ExerciseSessionRecord.EXERCISE_TYPE_VOLLEYBALL}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapLibreRecordingMapKt$MapLibreRecordingMap$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Repository $repo;
    final /* synthetic */ long $routeId;
    final /* synthetic */ MutableState<List<LatLng>> $routePts$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapLibreRecordingMapKt$MapLibreRecordingMap$1$1(Repository repository, long j, MutableState<List<LatLng>> mutableState, Continuation<? super MapLibreRecordingMapKt$MapLibreRecordingMap$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$routeId = j;
        this.$routePts$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapLibreRecordingMapKt$MapLibreRecordingMap$1$1(this.$repo, this.$routeId, this.$routePts$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MapLibreRecordingMapKt$MapLibreRecordingMap$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new MapLibreRecordingMapKt$MapLibreRecordingMap$1$1$pts$1(this.$repo, this.$routeId, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        MutableState<List<LatLng>> mutableState = this.$routePts$delegate;
        List<RoutePointEntity> list = (List) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (RoutePointEntity routePointEntity : list) {
            arrayList.add(new LatLng(routePointEntity.getLat(), routePointEntity.getLon()));
        }
        mutableState.setValue(arrayList);
        return Unit.INSTANCE;
    }
}
