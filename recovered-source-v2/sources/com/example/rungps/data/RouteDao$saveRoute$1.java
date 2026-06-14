package com.example.rungps.data;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.data.RouteDao;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RouteDao.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.RouteDao$DefaultImpls", f = "RouteDao.kt", i = {0, 0, 1}, l = {ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING, 80}, m = "saveRoute", n = {"$this", "latLon", "routeId"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class RouteDao$saveRoute$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    RouteDao$saveRoute$1(Continuation<? super RouteDao$saveRoute$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RouteDao.DefaultImpls.saveRoute(null, null, 0L, 0.0d, null, null, null, this);
    }
}
