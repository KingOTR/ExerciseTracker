package com.example.rungps.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;

/* compiled from: GearDao.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH'J\u0018\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH§@¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0015J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0018\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u001a\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u001b\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000fJ\u0016\u0010!\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\"\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0097@¢\u0006\u0002\u0010\u000fJ\u0016\u0010#\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0097@¢\u0006\u0002\u0010\u000f¨\u0006$"}, d2 = {"Lcom/example/rungps/data/GearDao;", "", "insert", "", "gear", "Lcom/example/rungps/data/GearEntity;", "(Lcom/example/rungps/data/GearEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "", "allFlow", "Lkotlinx/coroutines/flow/Flow;", "", "activeFlow", "byId", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activeByTypes", "types", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultForRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultForRide", "componentsForBike", "bikeId", "retire", "clearDefaultRun", "clearDefaultRide", "setDefaultRun", "setDefaultRide", "activityKmForGear", "", "gearId", "activityKmForBike", "setAsDefaultForRun", "setAsDefaultForRide", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GearDao {
    Object activeByTypes(List<String> list, Continuation<? super List<GearEntity>> continuation);

    Flow<List<GearEntity>> activeFlow();

    Object activityKmForBike(long j, Continuation<? super Double> continuation);

    Object activityKmForGear(long j, Continuation<? super Double> continuation);

    Flow<List<GearEntity>> allFlow();

    Object byId(long j, Continuation<? super GearEntity> continuation);

    Object clearDefaultRide(Continuation<? super Unit> continuation);

    Object clearDefaultRun(Continuation<? super Unit> continuation);

    Object componentsForBike(long j, Continuation<? super List<GearEntity>> continuation);

    Object defaultForRide(Continuation<? super GearEntity> continuation);

    Object defaultForRun(Continuation<? super GearEntity> continuation);

    Object insert(GearEntity gearEntity, Continuation<? super Long> continuation);

    Object retire(long j, Continuation<? super Unit> continuation);

    Object setAsDefaultForRide(long j, Continuation<? super Unit> continuation);

    Object setAsDefaultForRun(long j, Continuation<? super Unit> continuation);

    Object setDefaultRide(long j, Continuation<? super Unit> continuation);

    Object setDefaultRun(long j, Continuation<? super Unit> continuation);

    Object update(GearEntity gearEntity, Continuation<? super Unit> continuation);

    /* compiled from: GearDao.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object setAsDefaultForRun(GearDao gearDao, long j, Continuation<? super Unit> continuation) {
            GearDao$setAsDefaultForRun$1 gearDao$setAsDefaultForRun$1;
            Object coroutine_suspended;
            int i;
            if (continuation instanceof GearDao$setAsDefaultForRun$1) {
                gearDao$setAsDefaultForRun$1 = (GearDao$setAsDefaultForRun$1) continuation;
                if ((gearDao$setAsDefaultForRun$1.label & Integer.MIN_VALUE) != 0) {
                    gearDao$setAsDefaultForRun$1.label -= Integer.MIN_VALUE;
                    Object obj = gearDao$setAsDefaultForRun$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = gearDao$setAsDefaultForRun$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        gearDao$setAsDefaultForRun$1.L$0 = gearDao;
                        gearDao$setAsDefaultForRun$1.J$0 = j;
                        gearDao$setAsDefaultForRun$1.label = 1;
                        if (gearDao.clearDefaultRun(gearDao$setAsDefaultForRun$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        j = gearDao$setAsDefaultForRun$1.J$0;
                        gearDao = (GearDao) gearDao$setAsDefaultForRun$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    gearDao$setAsDefaultForRun$1.L$0 = null;
                    gearDao$setAsDefaultForRun$1.label = 2;
                    if (gearDao.setDefaultRun(j, gearDao$setAsDefaultForRun$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
            gearDao$setAsDefaultForRun$1 = new GearDao$setAsDefaultForRun$1(continuation);
            Object obj2 = gearDao$setAsDefaultForRun$1.result;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = gearDao$setAsDefaultForRun$1.label;
            if (i != 0) {
            }
            gearDao$setAsDefaultForRun$1.L$0 = null;
            gearDao$setAsDefaultForRun$1.label = 2;
            if (gearDao.setDefaultRun(j, gearDao$setAsDefaultForRun$1) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object setAsDefaultForRide(GearDao gearDao, long j, Continuation<? super Unit> continuation) {
            GearDao$setAsDefaultForRide$1 gearDao$setAsDefaultForRide$1;
            Object coroutine_suspended;
            int i;
            if (continuation instanceof GearDao$setAsDefaultForRide$1) {
                gearDao$setAsDefaultForRide$1 = (GearDao$setAsDefaultForRide$1) continuation;
                if ((gearDao$setAsDefaultForRide$1.label & Integer.MIN_VALUE) != 0) {
                    gearDao$setAsDefaultForRide$1.label -= Integer.MIN_VALUE;
                    Object obj = gearDao$setAsDefaultForRide$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = gearDao$setAsDefaultForRide$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        gearDao$setAsDefaultForRide$1.L$0 = gearDao;
                        gearDao$setAsDefaultForRide$1.J$0 = j;
                        gearDao$setAsDefaultForRide$1.label = 1;
                        if (gearDao.clearDefaultRide(gearDao$setAsDefaultForRide$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        j = gearDao$setAsDefaultForRide$1.J$0;
                        gearDao = (GearDao) gearDao$setAsDefaultForRide$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    gearDao$setAsDefaultForRide$1.L$0 = null;
                    gearDao$setAsDefaultForRide$1.label = 2;
                    if (gearDao.setDefaultRide(j, gearDao$setAsDefaultForRide$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
            gearDao$setAsDefaultForRide$1 = new GearDao$setAsDefaultForRide$1(continuation);
            Object obj2 = gearDao$setAsDefaultForRide$1.result;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = gearDao$setAsDefaultForRide$1.label;
            if (i != 0) {
            }
            gearDao$setAsDefaultForRide$1.L$0 = null;
            gearDao$setAsDefaultForRide$1.label = 2;
            if (gearDao.setDefaultRide(j, gearDao$setAsDefaultForRide$1) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }
}
