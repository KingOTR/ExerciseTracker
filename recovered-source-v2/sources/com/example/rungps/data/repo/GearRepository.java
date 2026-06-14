package com.example.rungps.data.repo;

import com.example.rungps.data.GearDao;
import com.example.rungps.data.GearEntity;
import com.example.rungps.gear.GearTypes;
import com.example.rungps.tracking.ActivityTypes;
import com.example.rungps.tracking.TrackingService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;

/* compiled from: GearRepository.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u001a\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u001b\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001d\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0011J(\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001f0\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0002\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/example/rungps/data/repo/GearRepository;", "", "dao", "Lcom/example/rungps/data/GearDao;", "<init>", "(Lcom/example/rungps/data/GearDao;)V", "allFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/GearEntity;", "activeFlow", "byId", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "gear", "(Lcom/example/rungps/data/GearEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "", "retire", "activeForActivity", TrackingService.EXTRA_ACTIVITY_TYPE, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultGearIdForActivity", "setDefaultForRun", "setDefaultForRide", "componentsForBike", "bikeId", "totalKm", "", "gearId", "kmMapForGears", "", "gears", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearRepository {
    public static final int $stable = 8;
    private final GearDao dao;

    public GearRepository(GearDao dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
    }

    public final Flow<List<GearEntity>> allFlow() {
        return this.dao.allFlow();
    }

    public final Flow<List<GearEntity>> activeFlow() {
        return this.dao.activeFlow();
    }

    public final Object byId(long j, Continuation<? super GearEntity> continuation) {
        return this.dao.byId(j, continuation);
    }

    public final Object insert(GearEntity gearEntity, Continuation<? super Long> continuation) {
        return this.dao.insert(gearEntity, continuation);
    }

    public final Object update(GearEntity gearEntity, Continuation<? super Unit> continuation) {
        Object update = this.dao.update(gearEntity, continuation);
        return update == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? update : Unit.INSTANCE;
    }

    public final Object retire(long j, Continuation<? super Unit> continuation) {
        Object retire = this.dao.retire(j, continuation);
        return retire == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? retire : Unit.INSTANCE;
    }

    public final Object activeForActivity(String str, Continuation<? super List<GearEntity>> continuation) {
        List<String> list = CollectionsKt.toList(GearTypes.INSTANCE.forActivityType(str));
        return list.isEmpty() ? CollectionsKt.emptyList() : this.dao.activeByTypes(list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object defaultGearIdForActivity(String str, Continuation<? super Long> continuation) {
        GearRepository$defaultGearIdForActivity$1 gearRepository$defaultGearIdForActivity$1;
        int i;
        GearEntity gearEntity;
        GearEntity gearEntity2;
        if (continuation instanceof GearRepository$defaultGearIdForActivity$1) {
            gearRepository$defaultGearIdForActivity$1 = (GearRepository$defaultGearIdForActivity$1) continuation;
            if ((gearRepository$defaultGearIdForActivity$1.label & Integer.MIN_VALUE) != 0) {
                gearRepository$defaultGearIdForActivity$1.label -= Integer.MIN_VALUE;
                Object obj = gearRepository$defaultGearIdForActivity$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gearRepository$defaultGearIdForActivity$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        gearEntity = (GearEntity) obj;
                        if (gearEntity == null) {
                            return Boxing.boxLong(gearEntity.getId());
                        }
                        return null;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    gearEntity2 = (GearEntity) obj;
                    if (gearEntity2 == null) {
                        return Boxing.boxLong(gearEntity2.getId());
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                if (ActivityTypes.INSTANCE.isBike(str)) {
                    GearDao gearDao = this.dao;
                    gearRepository$defaultGearIdForActivity$1.label = 1;
                    obj = gearDao.defaultForRide(gearRepository$defaultGearIdForActivity$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gearEntity = (GearEntity) obj;
                    if (gearEntity == null) {
                    }
                } else {
                    GearDao gearDao2 = this.dao;
                    gearRepository$defaultGearIdForActivity$1.label = 2;
                    obj = gearDao2.defaultForRun(gearRepository$defaultGearIdForActivity$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gearEntity2 = (GearEntity) obj;
                    if (gearEntity2 == null) {
                    }
                }
            }
        }
        gearRepository$defaultGearIdForActivity$1 = new GearRepository$defaultGearIdForActivity$1(this, continuation);
        Object obj2 = gearRepository$defaultGearIdForActivity$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gearRepository$defaultGearIdForActivity$1.label;
        if (i == 0) {
        }
    }

    public final Object setDefaultForRun(long j, Continuation<? super Unit> continuation) {
        Object asDefaultForRun = this.dao.setAsDefaultForRun(j, continuation);
        return asDefaultForRun == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? asDefaultForRun : Unit.INSTANCE;
    }

    public final Object setDefaultForRide(long j, Continuation<? super Unit> continuation) {
        Object asDefaultForRide = this.dao.setAsDefaultForRide(j, continuation);
        return asDefaultForRide == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? asDefaultForRide : Unit.INSTANCE;
    }

    public final Object componentsForBike(long j, Continuation<? super List<GearEntity>> continuation) {
        return this.dao.componentsForBike(j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object totalKm(long j, Continuation<? super Double> continuation) {
        GearRepository$totalKm$1 gearRepository$totalKm$1;
        int i;
        GearEntity gearEntity;
        if (continuation instanceof GearRepository$totalKm$1) {
            gearRepository$totalKm$1 = (GearRepository$totalKm$1) continuation;
            if ((gearRepository$totalKm$1.label & Integer.MIN_VALUE) != 0) {
                gearRepository$totalKm$1.label -= Integer.MIN_VALUE;
                Object obj = gearRepository$totalKm$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gearRepository$totalKm$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    GearDao gearDao = this.dao;
                    gearRepository$totalKm$1.L$0 = this;
                    gearRepository$totalKm$1.label = 1;
                    obj = gearDao.byId(j, gearRepository$totalKm$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (GearRepository) gearRepository$totalKm$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                gearEntity = (GearEntity) obj;
                if (gearEntity != null) {
                    return Boxing.boxDouble(0.0d);
                }
                gearRepository$totalKm$1.L$0 = null;
                gearRepository$totalKm$1.label = 2;
                obj = this.totalKm(gearEntity, gearRepository$totalKm$1);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        gearRepository$totalKm$1 = new GearRepository$totalKm$1(this, continuation);
        Object obj2 = gearRepository$totalKm$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gearRepository$totalKm$1.label;
        if (i != 0) {
        }
        gearEntity = (GearEntity) obj2;
        if (gearEntity != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object totalKm(GearEntity gearEntity, Continuation<? super Double> continuation) {
        GearRepository$totalKm$2 gearRepository$totalKm$2;
        int i;
        double d;
        double doubleValue;
        if (continuation instanceof GearRepository$totalKm$2) {
            gearRepository$totalKm$2 = (GearRepository$totalKm$2) continuation;
            if ((gearRepository$totalKm$2.label & Integer.MIN_VALUE) != 0) {
                gearRepository$totalKm$2.label -= Integer.MIN_VALUE;
                Object obj = gearRepository$totalKm$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gearRepository$totalKm$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    double startingOdometerKm = gearEntity.getStartingOdometerKm();
                    Long parentGearId = gearEntity.getParentGearId();
                    if (GearTypes.INSTANCE.isComponent(gearEntity.getGearType()) && parentGearId != null) {
                        GearDao gearDao = this.dao;
                        long longValue = parentGearId.longValue();
                        gearRepository$totalKm$2.D$0 = startingOdometerKm;
                        gearRepository$totalKm$2.label = 1;
                        obj = gearDao.activityKmForBike(longValue, gearRepository$totalKm$2);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        d = startingOdometerKm;
                        doubleValue = ((Number) obj).doubleValue();
                    } else {
                        GearDao gearDao2 = this.dao;
                        long id = gearEntity.getId();
                        gearRepository$totalKm$2.D$0 = startingOdometerKm;
                        gearRepository$totalKm$2.label = 2;
                        obj = gearDao2.activityKmForGear(id, gearRepository$totalKm$2);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        d = startingOdometerKm;
                        doubleValue = ((Number) obj).doubleValue();
                    }
                } else if (i == 1) {
                    d = gearRepository$totalKm$2.D$0;
                    ResultKt.throwOnFailure(obj);
                    doubleValue = ((Number) obj).doubleValue();
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d = gearRepository$totalKm$2.D$0;
                    ResultKt.throwOnFailure(obj);
                    doubleValue = ((Number) obj).doubleValue();
                }
                return Boxing.boxDouble(d + doubleValue);
            }
        }
        gearRepository$totalKm$2 = new GearRepository$totalKm$2(this, continuation);
        Object obj2 = gearRepository$totalKm$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gearRepository$totalKm$2.label;
        if (i != 0) {
        }
        return Boxing.boxDouble(d + doubleValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0090 -> B:10:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object kmMapForGears(List<GearEntity> list, Continuation<? super Map<Long, Double>> continuation) {
        GearRepository$kmMapForGears$1 gearRepository$kmMapForGears$1;
        int i;
        Iterator it;
        Map map;
        if (continuation instanceof GearRepository$kmMapForGears$1) {
            gearRepository$kmMapForGears$1 = (GearRepository$kmMapForGears$1) continuation;
            if ((gearRepository$kmMapForGears$1.label & Integer.MIN_VALUE) != 0) {
                gearRepository$kmMapForGears$1.label -= Integer.MIN_VALUE;
                Object obj = gearRepository$kmMapForGears$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gearRepository$kmMapForGears$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List<GearEntity> list2 = list;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
                    it = list2.iterator();
                    map = linkedHashMap;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Long l = (Long) gearRepository$kmMapForGears$1.L$4;
                    map = (Map) gearRepository$kmMapForGears$1.L$3;
                    it = (Iterator) gearRepository$kmMapForGears$1.L$2;
                    Map map2 = (Map) gearRepository$kmMapForGears$1.L$1;
                    GearRepository gearRepository = (GearRepository) gearRepository$kmMapForGears$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Pair pair = TuplesKt.to(l, obj);
                    map.put(pair.getFirst(), pair.getSecond());
                    map = map2;
                    this = gearRepository;
                    if (it.hasNext()) {
                        GearEntity gearEntity = (GearEntity) it.next();
                        Long boxLong = Boxing.boxLong(gearEntity.getId());
                        gearRepository$kmMapForGears$1.L$0 = this;
                        gearRepository$kmMapForGears$1.L$1 = map;
                        gearRepository$kmMapForGears$1.L$2 = it;
                        gearRepository$kmMapForGears$1.L$3 = map;
                        gearRepository$kmMapForGears$1.L$4 = boxLong;
                        gearRepository$kmMapForGears$1.label = 1;
                        obj = this.totalKm(gearEntity, gearRepository$kmMapForGears$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        gearRepository = this;
                        l = boxLong;
                        map2 = map;
                        Pair pair2 = TuplesKt.to(l, obj);
                        map.put(pair2.getFirst(), pair2.getSecond());
                        map = map2;
                        this = gearRepository;
                        if (it.hasNext()) {
                            return map;
                        }
                    }
                }
            }
        }
        gearRepository$kmMapForGears$1 = new GearRepository$kmMapForGears$1(this, continuation);
        Object obj2 = gearRepository$kmMapForGears$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gearRepository$kmMapForGears$1.label;
        if (i != 0) {
        }
    }
}
