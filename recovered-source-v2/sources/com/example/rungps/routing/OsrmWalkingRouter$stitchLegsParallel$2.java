package com.example.rungps.routing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import org.osmdroid.util.GeoPoint;

/* compiled from: OsrmWalkingRouter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lorg/osmdroid/util/GeoPoint;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.routing.OsrmWalkingRouter$stitchLegsParallel$2", f = "OsrmWalkingRouter.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OsrmWalkingRouter$stitchLegsParallel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends GeoPoint>>>, Object> {
    final /* synthetic */ boolean $addViaOnLongLegs;
    final /* synthetic */ List<GeoPoint> $chain;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OsrmWalkingRouter$stitchLegsParallel$2(List<? extends GeoPoint> list, boolean z, Continuation<? super OsrmWalkingRouter$stitchLegsParallel$2> continuation) {
        super(2, continuation);
        this.$chain = list;
        this.$addViaOnLongLegs = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OsrmWalkingRouter$stitchLegsParallel$2 osrmWalkingRouter$stitchLegsParallel$2 = new OsrmWalkingRouter$stitchLegsParallel$2(this.$chain, this.$addViaOnLongLegs, continuation);
        osrmWalkingRouter$stitchLegsParallel$2.L$0 = obj;
        return osrmWalkingRouter$stitchLegsParallel$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends GeoPoint>>> continuation) {
        return ((OsrmWalkingRouter$stitchLegsParallel$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        List simplifyPoints;
        Object m7905constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            IntRange until = RangesKt.until(0, CollectionsKt.getLastIndex(this.$chain));
            List<GeoPoint> list = this.$chain;
            boolean z = this.$addViaOnLongLegs;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new OsrmWalkingRouter$stitchLegsParallel$2$segments$1$1(list, ((IntIterator) it).nextInt(), z, null), 2, null);
                arrayList.add(async$default);
            }
            this.label = 1;
            obj = AwaitKt.awaitAll(arrayList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList2 = new ArrayList(this.$chain.size() * 24);
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            Object value = ((Result) it2.next()).getValue();
            Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(value);
            if (m7908exceptionOrNullimpl != null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(m7908exceptionOrNullimpl)));
            }
            List list2 = (List) value;
            if (list2.size() < 2) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Empty OSRM segment"))));
            }
            if (!arrayList2.isEmpty()) {
                list2 = CollectionsKt.drop(list2, 1);
            }
            arrayList2.addAll(list2);
        }
        simplifyPoints = OsrmWalkingRouter.INSTANCE.simplifyPoints(arrayList2, 1.5d, 1800);
        List list3 = simplifyPoints.size() >= 2 ? simplifyPoints : null;
        if (list3 != null) {
            Result.Companion companion3 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(list3);
        } else {
            Result.Companion companion4 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Snapped route too short")));
        }
        return Result.m7904boximpl(m7905constructorimpl);
    }
}
