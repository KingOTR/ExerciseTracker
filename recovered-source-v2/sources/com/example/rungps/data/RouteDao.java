package com.example.rungps.data;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RouteDao.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u0017\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004H§@¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001c\u0010!\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H§@¢\u0006\u0002\u0010\u001fJX\u0010#\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&2\u0018\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0(0\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0097@¢\u0006\u0002\u0010)¨\u0006*"}, d2 = {"Lcom/example/rungps/data/RouteDao;", "", "routesFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/RouteEntity;", "allRoutes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "routeById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "routeByName", HintConstants.AUTOFILL_HINT_NAME, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "routesByName", "routeByRemoteId", "remoteId", "routeByDedupeKey", "dedupeKey", "pointsForRoute", "Lcom/example/rungps/data/RoutePointEntity;", "routeId", "insertRoute", "route", "(Lcom/example/rungps/data/RouteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRoute", "", "insertRoutePoints", "points", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRoute", "deleteRoutes", "ids", "saveRoute", "createdAtMs", "distanceM", "", "latLon", "Lkotlin/Pair;", "(Ljava/lang/String;JDLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RouteDao {
    Object allRoutes(Continuation<? super List<RouteEntity>> continuation);

    Object deleteRoute(long j, Continuation<? super Unit> continuation);

    Object deleteRoutes(List<Long> list, Continuation<? super Unit> continuation);

    Object insertRoute(RouteEntity routeEntity, Continuation<? super Long> continuation);

    Object insertRoutePoints(List<RoutePointEntity> list, Continuation<? super Unit> continuation);

    Object pointsForRoute(long j, Continuation<? super List<RoutePointEntity>> continuation);

    Object routeByDedupeKey(String str, Continuation<? super RouteEntity> continuation);

    Object routeById(long j, Continuation<? super RouteEntity> continuation);

    Object routeByName(String str, Continuation<? super RouteEntity> continuation);

    Object routeByRemoteId(String str, Continuation<? super RouteEntity> continuation);

    Object routesByName(String str, Continuation<? super List<RouteEntity>> continuation);

    Flow<List<RouteEntity>> routesFlow();

    Object saveRoute(String str, long j, double d, List<Pair<Double, Double>> list, String str2, String str3, Continuation<? super Long> continuation);

    Object updateRoute(RouteEntity routeEntity, Continuation<? super Unit> continuation);

    /* compiled from: RouteDao.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object saveRoute(RouteDao routeDao, String str, long j, double d, List<Pair<Double, Double>> list, String str2, String str3, Continuation<? super Long> continuation) {
            RouteDao$saveRoute$1 routeDao$saveRoute$1;
            int i;
            List<Pair<Double, Double>> list2;
            ArrayList arrayList;
            long j2;
            long j3;
            RouteDao routeDao2 = routeDao;
            if (continuation instanceof RouteDao$saveRoute$1) {
                routeDao$saveRoute$1 = (RouteDao$saveRoute$1) continuation;
                if ((routeDao$saveRoute$1.label & Integer.MIN_VALUE) != 0) {
                    routeDao$saveRoute$1.label -= Integer.MIN_VALUE;
                    Object obj = routeDao$saveRoute$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = routeDao$saveRoute$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        RouteEntity routeEntity = new RouteEntity(0L, str, j, d, str2, str3, 1, null);
                        routeDao$saveRoute$1.L$0 = routeDao2;
                        list2 = list;
                        routeDao$saveRoute$1.L$1 = list2;
                        routeDao$saveRoute$1.label = 1;
                        obj = routeDao2.insertRoute(routeEntity, routeDao$saveRoute$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j3 = routeDao$saveRoute$1.J$0;
                            ResultKt.throwOnFailure(obj);
                            j2 = j3;
                            return Boxing.boxLong(j2);
                        }
                        List<Pair<Double, Double>> list3 = (List) routeDao$saveRoute$1.L$1;
                        RouteDao routeDao3 = (RouteDao) routeDao$saveRoute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        list2 = list3;
                        routeDao2 = routeDao3;
                    }
                    long longValue = ((Number) obj).longValue();
                    List<Pair<Double, Double>> list4 = list2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                    int i2 = 0;
                    for (Object obj2 : list4) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Pair pair = (Pair) obj2;
                        arrayList2.add(new RoutePointEntity(0L, longValue, i2, ((Number) pair.component1()).doubleValue(), ((Number) pair.component2()).doubleValue(), 1, null));
                        i2 = i3;
                        longValue = longValue;
                    }
                    long j4 = longValue;
                    arrayList = arrayList2;
                    if (!arrayList.isEmpty()) {
                        j2 = j4;
                        return Boxing.boxLong(j2);
                    }
                    routeDao$saveRoute$1.L$0 = null;
                    routeDao$saveRoute$1.L$1 = null;
                    routeDao$saveRoute$1.J$0 = j4;
                    routeDao$saveRoute$1.label = 2;
                    if (routeDao2.insertRoutePoints(arrayList, routeDao$saveRoute$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j3 = j4;
                    j2 = j3;
                    return Boxing.boxLong(j2);
                }
            }
            routeDao$saveRoute$1 = new RouteDao$saveRoute$1(continuation);
            Object obj3 = routeDao$saveRoute$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = routeDao$saveRoute$1.label;
            if (i != 0) {
            }
            long longValue2 = ((Number) obj3).longValue();
            List<Pair<Double, Double>> list42 = list2;
            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list42, 10));
            int i22 = 0;
            while (r4.hasNext()) {
            }
            long j42 = longValue2;
            arrayList = arrayList22;
            if (!arrayList.isEmpty()) {
            }
        }

        public static /* synthetic */ Object saveRoute$default(RouteDao routeDao, String str, long j, double d, List list, String str2, String str3, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return routeDao.saveRoute(str, j, d, list, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveRoute");
        }
    }
}
