package com.example.rungps.ui.main;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RoutePointEntity;
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

/* compiled from: MapLibreRecordingMap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/data/RoutePointEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapLibreRecordingMapKt$MapLibreRecordingMap$1$1$pts$1", f = "MapLibreRecordingMap.kt", i = {}, l = {ExerciseSessionRecord.EXERCISE_TYPE_VOLLEYBALL}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapLibreRecordingMapKt$MapLibreRecordingMap$1$1$pts$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends RoutePointEntity>>, Object> {
    final /* synthetic */ Repository $repo;
    final /* synthetic */ long $routeId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapLibreRecordingMapKt$MapLibreRecordingMap$1$1$pts$1(Repository repository, long j, Continuation<? super MapLibreRecordingMapKt$MapLibreRecordingMap$1$1$pts$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$routeId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapLibreRecordingMapKt$MapLibreRecordingMap$1$1$pts$1(this.$repo, this.$routeId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends RoutePointEntity>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<RoutePointEntity>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<RoutePointEntity>> continuation) {
        return ((MapLibreRecordingMapKt$MapLibreRecordingMap$1$1$pts$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$repo.routePoints(this.$routeId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
