package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import java.util.List;
import kotlin.Metadata;
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
import org.osmdroid.util.GeoPoint;

/* compiled from: MapTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapTabContentKt$MapTabContent$1$1", f = "MapTabContent.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapTabContentKt$MapTabContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $followRouteId;
    final /* synthetic */ MutableState<List<GeoPoint>> $planned;
    final /* synthetic */ MutableState<List<GeoPoint>> $plannedWaypoints;
    final /* synthetic */ Repository $repo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapTabContentKt$MapTabContent$1$1(Long l, MutableState<List<GeoPoint>> mutableState, MutableState<List<GeoPoint>> mutableState2, Repository repository, Continuation<? super MapTabContentKt$MapTabContent$1$1> continuation) {
        super(2, continuation);
        this.$followRouteId = l;
        this.$plannedWaypoints = mutableState;
        this.$planned = mutableState2;
        this.$repo = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapTabContentKt$MapTabContent$1$1(this.$followRouteId, this.$plannedWaypoints, this.$planned, this.$repo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MapTabContentKt$MapTabContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Long l = this.$followRouteId;
            if (l == null) {
                return Unit.INSTANCE;
            }
            long longValue = l.longValue();
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new MapTabContentKt$MapTabContent$1$1$pts$1(this.$repo, longValue, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List<GeoPoint> list = (List) obj;
        if (list.size() >= 2) {
            this.$plannedWaypoints.setValue(list);
            this.$planned.setValue(list);
        }
        return Unit.INSTANCE;
    }
}
