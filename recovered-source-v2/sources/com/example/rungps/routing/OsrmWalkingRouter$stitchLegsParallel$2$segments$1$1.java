package com.example.rungps.routing;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
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

/* compiled from: OsrmWalkingRouter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lorg/osmdroid/util/GeoPoint;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.routing.OsrmWalkingRouter$stitchLegsParallel$2$segments$1$1", f = "OsrmWalkingRouter.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OsrmWalkingRouter$stitchLegsParallel$2$segments$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends GeoPoint>>>, Object> {
    final /* synthetic */ boolean $addViaOnLongLegs;
    final /* synthetic */ List<GeoPoint> $chain;
    final /* synthetic */ int $i;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OsrmWalkingRouter$stitchLegsParallel$2$segments$1$1(List<? extends GeoPoint> list, int i, boolean z, Continuation<? super OsrmWalkingRouter$stitchLegsParallel$2$segments$1$1> continuation) {
        super(2, continuation);
        this.$chain = list;
        this.$i = i;
        this.$addViaOnLongLegs = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OsrmWalkingRouter$stitchLegsParallel$2$segments$1$1(this.$chain, this.$i, this.$addViaOnLongLegs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends GeoPoint>>> continuation) {
        return ((OsrmWalkingRouter$stitchLegsParallel$2$segments$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m6905requestFootGeometrygIAlus;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GeoPoint geoPoint = this.$chain.get(this.$i);
            GeoPoint geoPoint2 = this.$chain.get(this.$i + 1);
            List<GeoPoint> viaPointsOnChord = this.$addViaOnLongLegs ? OsrmWalkingRouter.INSTANCE.viaPointsOnChord(geoPoint, geoPoint2) : CollectionsKt.emptyList();
            this.label = 1;
            m6905requestFootGeometrygIAlus = OsrmWalkingRouter.INSTANCE.m6905requestFootGeometrygIAlus(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(geoPoint), (Iterable) viaPointsOnChord), (Iterable) CollectionsKt.listOf(geoPoint2)), this);
            if (m6905requestFootGeometrygIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            m6905requestFootGeometrygIAlus = ((Result) obj).getValue();
        }
        return Result.m7904boximpl(m6905requestFootGeometrygIAlus);
    }
}
