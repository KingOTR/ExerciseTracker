package com.example.rungps.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$dedupeSavedRoutes$2", f = "Repository.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 2, 3}, l = {410, 416, 420, 433}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "keys", "toDelete", "route", "$this$withContext", "keys", "toDelete", "route", "toDelete"}, s = {"L$0", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2", "L$4", "L$0"})
/* loaded from: classes3.dex */
final class Repository$dedupeSavedRoutes$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$dedupeSavedRoutes$2(Repository repository, Continuation<? super Repository$dedupeSavedRoutes$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Repository$dedupeSavedRoutes$2 repository$dedupeSavedRoutes$2 = new Repository$dedupeSavedRoutes$2(this.this$0, continuation);
        repository$dedupeSavedRoutes$2.L$0 = obj;
        return repository$dedupeSavedRoutes$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((Repository$dedupeSavedRoutes$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0189  */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b8 -> B:16:0x017c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ec -> B:15:0x0171). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0170 -> B:15:0x0171). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        RouteDao routeDao;
        Object allRoutes;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Iterator it;
        Object obj2;
        CoroutineScope coroutineScope2;
        LinkedHashMap linkedHashMap2;
        Iterator it2;
        RouteEntity routeEntity;
        Repository repository;
        List list;
        RouteDao routeDao2;
        RouteEntity copy;
        RouteDao routeDao3;
        List list2;
        RouteDao routeDao4;
        RouteEntity routeEntity2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            routeDao = this.this$0.routeDao;
            this.L$0 = coroutineScope;
            this.label = 1;
            allRoutes = routeDao.allRoutes(this);
            if (allRoutes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            allRoutes = obj;
        } else if (i == 2) {
            repository = (Repository) this.L$5;
            routeEntity = (RouteEntity) this.L$4;
            it2 = (Iterator) this.L$3;
            arrayList = (List) this.L$2;
            ?? r9 = (Map) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            linkedHashMap2 = r9;
            list = (List) obj2;
            if (list.size() >= 2) {
            }
            CoroutineScope coroutineScope3 = coroutineScope2;
            String dedupeKey = r2;
            coroutineScope = coroutineScope3;
            LinkedHashMap linkedHashMap3 = r9;
            RouteEntity routeEntity3 = routeEntity;
            it = it2;
            linkedHashMap = linkedHashMap3;
            routeEntity2 = (RouteEntity) linkedHashMap.get(dedupeKey);
            if (routeEntity2 == null) {
            }
            if (!it.hasNext()) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                arrayList = list2;
                return Boxing.boxInt(arrayList.size());
            }
            String str = (String) this.L$5;
            routeEntity = (RouteEntity) this.L$4;
            it2 = (Iterator) this.L$3;
            arrayList = (List) this.L$2;
            ?? r92 = (Map) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            LinkedHashMap linkedHashMap4 = r92;
            CoroutineScope coroutineScope32 = coroutineScope2;
            String dedupeKey2 = str;
            coroutineScope = coroutineScope32;
            LinkedHashMap linkedHashMap32 = linkedHashMap4;
            RouteEntity routeEntity32 = routeEntity;
            it = it2;
            linkedHashMap = linkedHashMap32;
            routeEntity2 = (RouteEntity) linkedHashMap.get(dedupeKey2);
            if (routeEntity2 == null) {
                linkedHashMap.put(dedupeKey2, routeEntity32);
            } else {
                RouteEntity routeEntity4 = routeEntity32.getCreatedAtMs() >= routeEntity2.getCreatedAtMs() ? routeEntity2 : routeEntity32;
                if (routeEntity4.getId() == routeEntity32.getId()) {
                    routeEntity32 = routeEntity2;
                }
                linkedHashMap.put(dedupeKey2, routeEntity32);
                Boxing.boxBoolean(arrayList.add(Boxing.boxLong(routeEntity4.getId())));
            }
            if (!it.hasNext()) {
                routeEntity32 = (RouteEntity) it.next();
                dedupeKey2 = routeEntity32.getDedupeKey();
                if (dedupeKey2 == null) {
                    Repository repository2 = this.this$0;
                    routeDao4 = repository2.routeDao;
                    long id = routeEntity32.getId();
                    this.L$0 = coroutineScope;
                    this.L$1 = linkedHashMap;
                    this.L$2 = arrayList;
                    this.L$3 = it;
                    this.L$4 = routeEntity32;
                    this.L$5 = repository2;
                    this.label = 2;
                    obj2 = routeDao4.pointsForRoute(id, this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope2 = coroutineScope;
                    repository = repository2;
                    LinkedHashMap linkedHashMap5 = linkedHashMap;
                    it2 = it;
                    routeEntity = routeEntity32;
                    linkedHashMap2 = linkedHashMap5;
                    list = (List) obj2;
                    if (list.size() >= 2) {
                        str = "legacy:" + routeEntity.getId();
                        linkedHashMap4 = linkedHashMap2;
                    } else {
                        List<RoutePointEntity> list3 = list;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                        for (RoutePointEntity routePointEntity : list3) {
                            arrayList2.add(TuplesKt.to(Boxing.boxDouble(routePointEntity.getLat()), Boxing.boxDouble(routePointEntity.getLon())));
                        }
                        String key = RouteDedupe.INSTANCE.key(arrayList2, routeEntity.getDistanceM());
                        routeDao2 = repository.routeDao;
                        copy = r12.copy((r20 & 1) != 0 ? r12.id : 0L, (r20 & 2) != 0 ? r12.name : null, (r20 & 4) != 0 ? r12.createdAtMs : 0L, (r20 & 8) != 0 ? r12.distanceM : 0.0d, (r20 & 16) != 0 ? r12.remoteId : null, (r20 & 32) != 0 ? routeEntity.dedupeKey : key);
                        this.L$0 = coroutineScope2;
                        this.L$1 = linkedHashMap2;
                        this.L$2 = arrayList;
                        this.L$3 = it2;
                        this.L$4 = routeEntity;
                        this.L$5 = key;
                        this.label = 3;
                        if (routeDao2.updateRoute(copy, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = key;
                        linkedHashMap4 = linkedHashMap2;
                    }
                    CoroutineScope coroutineScope322 = coroutineScope2;
                    String dedupeKey22 = str;
                    coroutineScope = coroutineScope322;
                    LinkedHashMap linkedHashMap322 = linkedHashMap4;
                    RouteEntity routeEntity322 = routeEntity;
                    it = it2;
                    linkedHashMap = linkedHashMap322;
                }
                routeEntity2 = (RouteEntity) linkedHashMap.get(dedupeKey22);
                if (routeEntity2 == null) {
                }
                if (!it.hasNext()) {
                    if (!arrayList.isEmpty()) {
                        routeDao3 = this.this$0.routeDao;
                        this.L$0 = arrayList;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 4;
                        if (routeDao3.deleteRoutes(CollectionsKt.distinct(arrayList), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list2 = arrayList;
                        arrayList = list2;
                    }
                    return Boxing.boxInt(arrayList.size());
                }
            }
        }
        List list4 = (List) allRoutes;
        if (list4.size() < 2) {
            return Boxing.boxInt(0);
        }
        linkedHashMap = new LinkedHashMap();
        arrayList = new ArrayList();
        it = list4.iterator();
        if (!it.hasNext()) {
        }
    }
}
