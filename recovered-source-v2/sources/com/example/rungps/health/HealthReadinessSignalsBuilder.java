package com.example.rungps.health;

import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.HealthConnectManager;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: HealthReadinessSignals.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/health/HealthReadinessSignalsBuilder;", "", "<init>", "()V", "build", "Lcom/example/rungps/health/HealthReadinessSignals;", "hc", "Lcom/example/rungps/health/HealthConnectManager;", "hcGrantedSleep", "", "hcGrantedSteps", "hcGrantedHr", "stepsToday", "", "dbSleepRecent", "", "Lcom/example/rungps/data/SleepEntryEntity;", "zone", "Ljava/time/ZoneId;", "(Lcom/example/rungps/health/HealthConnectManager;ZZZLjava/lang/Long;Ljava/util/List;Ljava/time/ZoneId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthReadinessSignalsBuilder {
    public static final int $stable = 0;
    public static final HealthReadinessSignalsBuilder INSTANCE = new HealthReadinessSignalsBuilder();

    private HealthReadinessSignalsBuilder() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r0v52, types: [T, java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v53, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v30, types: [T, java.lang.Double] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object build(HealthConnectManager healthConnectManager, boolean z, boolean z2, boolean z3, Long l, List<SleepEntryEntity> list, ZoneId zoneId, Continuation<? super HealthReadinessSignals> continuation) {
        HealthReadinessSignalsBuilder$build$1 healthReadinessSignalsBuilder$build$1;
        int i;
        boolean z4;
        Long l2;
        List<SleepEntryEntity> list2;
        ZoneId zoneId2;
        List list3;
        Ref.ObjectRef objectRef;
        Integer num;
        HealthConnectManager healthConnectManager2;
        HealthReadinessSignalsBuilder healthReadinessSignalsBuilder;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Throwable th;
        boolean z5;
        Object obj;
        String str;
        List emptyList;
        List<SleepEntryEntity> list4;
        Long l3;
        HealthConnectManager healthConnectManager3;
        Integer num2;
        Object m7905constructorimpl;
        Long l4;
        Iterator it;
        Object next;
        HealthConnectManager.SleepWindow sleepWindow;
        Object next2;
        String str2;
        String source;
        HealthReadinessSignalsBuilder healthReadinessSignalsBuilder2 = this;
        if (continuation instanceof HealthReadinessSignalsBuilder$build$1) {
            healthReadinessSignalsBuilder$build$1 = (HealthReadinessSignalsBuilder$build$1) continuation;
            if ((healthReadinessSignalsBuilder$build$1.label & Integer.MIN_VALUE) != 0) {
                healthReadinessSignalsBuilder$build$1.label -= Integer.MIN_VALUE;
                Object obj2 = healthReadinessSignalsBuilder$build$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthReadinessSignalsBuilder$build$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    LocalDate.now(zoneId);
                    ArrayList arrayList = new ArrayList();
                    Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    if (!z3 || !healthConnectManager.isReady()) {
                        z4 = z;
                        l2 = l;
                        list2 = list;
                        zoneId2 = zoneId;
                        list3 = arrayList;
                        objectRef = objectRef5;
                        num = null;
                        healthConnectManager2 = healthConnectManager;
                        healthReadinessSignalsBuilder = healthReadinessSignalsBuilder2;
                        objectRef2 = objectRef6;
                        if (z4 || !healthConnectManager2.isReady()) {
                            str = null;
                            emptyList = CollectionsKt.emptyList();
                            List list5 = list3;
                            l4 = l2;
                            HealthConnectManager healthConnectManager4 = healthConnectManager2;
                            Integer num3 = num;
                            it = emptyList.iterator();
                            if (it.hasNext()) {
                            }
                            sleepWindow = (HealthConnectManager.SleepWindow) next;
                            if (sleepWindow == null) {
                            }
                            str2 = source;
                            if (l4 != null) {
                            }
                            return new HealthReadinessSignals(l4, num3, (Double) objectRef.element, (Integer) objectRef2.element, str2, healthConnectManager4.isReady(), list5);
                        }
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            HealthReadinessSignalsBuilder healthReadinessSignalsBuilder3 = healthReadinessSignalsBuilder;
                            healthReadinessSignalsBuilder$build$1.L$0 = healthConnectManager2;
                            healthReadinessSignalsBuilder$build$1.L$1 = l2;
                            healthReadinessSignalsBuilder$build$1.L$2 = list2;
                            healthReadinessSignalsBuilder$build$1.L$3 = list3;
                            healthReadinessSignalsBuilder$build$1.L$4 = num;
                            healthReadinessSignalsBuilder$build$1.L$5 = objectRef;
                            healthReadinessSignalsBuilder$build$1.L$6 = objectRef2;
                            str = null;
                            try {
                                healthReadinessSignalsBuilder$build$1.L$7 = null;
                                healthReadinessSignalsBuilder$build$1.label = 2;
                                obj2 = healthConnectManager2.readSleepSessions(3, zoneId2, healthReadinessSignalsBuilder$build$1);
                            } catch (Throwable th2) {
                                th = th2;
                                list4 = list2;
                                l3 = l2;
                                healthConnectManager3 = healthConnectManager2;
                                Result.Companion companion2 = Result.INSTANCE;
                                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                healthConnectManager2 = healthConnectManager3;
                                l2 = l3;
                                list2 = list4;
                                if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                                }
                                emptyList = (List) m7905constructorimpl;
                                List list52 = list3;
                                l4 = l2;
                                HealthConnectManager healthConnectManager42 = healthConnectManager2;
                                Integer num32 = num;
                                it = emptyList.iterator();
                                if (it.hasNext()) {
                                }
                                sleepWindow = (HealthConnectManager.SleepWindow) next;
                                if (sleepWindow == null) {
                                }
                                str2 = source;
                                if (l4 != null) {
                                }
                                return new HealthReadinessSignals(l4, num32, (Double) objectRef.element, (Integer) objectRef2.element, str2, healthConnectManager42.isReady(), list52);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str = null;
                        }
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list4 = list2;
                        l3 = l2;
                        healthConnectManager3 = healthConnectManager2;
                        m7905constructorimpl = Result.m7905constructorimpl((List) obj2);
                        healthConnectManager2 = healthConnectManager3;
                        l2 = l3;
                        list2 = list4;
                        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                        }
                        emptyList = (List) m7905constructorimpl;
                        List list522 = list3;
                        l4 = l2;
                        HealthConnectManager healthConnectManager422 = healthConnectManager2;
                        Integer num322 = num;
                        it = emptyList.iterator();
                        if (it.hasNext()) {
                        }
                        sleepWindow = (HealthConnectManager.SleepWindow) next;
                        if (sleepWindow == null) {
                        }
                        str2 = source;
                        if (l4 != null) {
                        }
                        return new HealthReadinessSignals(l4, num322, (Double) objectRef.element, (Integer) objectRef2.element, str2, healthConnectManager422.isReady(), list522);
                    }
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        HealthReadinessSignalsBuilder healthReadinessSignalsBuilder4 = healthReadinessSignalsBuilder2;
                        healthReadinessSignalsBuilder$build$1.L$0 = healthReadinessSignalsBuilder2;
                        healthReadinessSignalsBuilder$build$1.L$1 = healthConnectManager;
                        healthReadinessSignalsBuilder$build$1.L$2 = l;
                        healthReadinessSignalsBuilder$build$1.L$3 = list;
                        healthReadinessSignalsBuilder$build$1.L$4 = zoneId;
                        healthReadinessSignalsBuilder$build$1.L$5 = arrayList;
                        healthReadinessSignalsBuilder$build$1.L$6 = objectRef5;
                        healthReadinessSignalsBuilder$build$1.L$7 = objectRef6;
                        healthReadinessSignalsBuilder$build$1.Z$0 = z;
                        healthReadinessSignalsBuilder$build$1.label = 1;
                        obj2 = HealthConnectManager.readRestingHeartRateBpm$default(healthConnectManager, 0, null, healthReadinessSignalsBuilder$build$1, 3, null);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        l2 = l;
                        list2 = list;
                        zoneId2 = zoneId;
                        list3 = arrayList;
                        objectRef3 = objectRef5;
                        objectRef4 = objectRef6;
                        healthConnectManager2 = healthConnectManager;
                        healthReadinessSignalsBuilder = healthReadinessSignalsBuilder2;
                        z5 = z;
                    } catch (Throwable th4) {
                        l2 = l;
                        list2 = list;
                        zoneId2 = zoneId;
                        list3 = arrayList;
                        objectRef3 = objectRef5;
                        objectRef4 = objectRef6;
                        healthConnectManager2 = healthConnectManager;
                        th = th4;
                        z4 = z;
                        Result.Companion companion4 = Result.INSTANCE;
                        Object m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        healthReadinessSignalsBuilder = healthReadinessSignalsBuilder2;
                        obj = m7905constructorimpl2;
                        if (Result.m7911isFailureimpl(obj)) {
                        }
                        num2 = (Integer) obj;
                        if (num2 != null) {
                        }
                        Ref.ObjectRef objectRef7 = objectRef3;
                        num = num2;
                        objectRef2 = objectRef4;
                        objectRef = objectRef7;
                        if (z4) {
                        }
                        str = null;
                        emptyList = CollectionsKt.emptyList();
                        List list5222 = list3;
                        l4 = l2;
                        HealthConnectManager healthConnectManager4222 = healthConnectManager2;
                        Integer num3222 = num;
                        it = emptyList.iterator();
                        if (it.hasNext()) {
                        }
                        sleepWindow = (HealthConnectManager.SleepWindow) next;
                        if (sleepWindow == null) {
                        }
                        str2 = source;
                        if (l4 != null) {
                        }
                        return new HealthReadinessSignals(l4, num3222, (Double) objectRef.element, (Integer) objectRef2.element, str2, healthConnectManager4222.isReady(), list5222);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objectRef2 = (Ref.ObjectRef) healthReadinessSignalsBuilder$build$1.L$6;
                        objectRef = (Ref.ObjectRef) healthReadinessSignalsBuilder$build$1.L$5;
                        num = (Integer) healthReadinessSignalsBuilder$build$1.L$4;
                        list3 = (List) healthReadinessSignalsBuilder$build$1.L$3;
                        list4 = (List) healthReadinessSignalsBuilder$build$1.L$2;
                        l3 = (Long) healthReadinessSignalsBuilder$build$1.L$1;
                        healthConnectManager3 = (HealthConnectManager) healthReadinessSignalsBuilder$build$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            str = null;
                            try {
                                m7905constructorimpl = Result.m7905constructorimpl((List) obj2);
                            } catch (Throwable th5) {
                                th = th5;
                                Result.Companion companion22 = Result.INSTANCE;
                                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                healthConnectManager2 = healthConnectManager3;
                                l2 = l3;
                                list2 = list4;
                                if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                                }
                                emptyList = (List) m7905constructorimpl;
                                List list52222 = list3;
                                l4 = l2;
                                HealthConnectManager healthConnectManager42222 = healthConnectManager2;
                                Integer num32222 = num;
                                it = emptyList.iterator();
                                if (it.hasNext()) {
                                }
                                sleepWindow = (HealthConnectManager.SleepWindow) next;
                                if (sleepWindow == null) {
                                }
                                str2 = source;
                                if (l4 != null) {
                                }
                                return new HealthReadinessSignals(l4, num32222, (Double) objectRef.element, (Integer) objectRef2.element, str2, healthConnectManager42222.isReady(), list52222);
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            str = null;
                            Result.Companion companion222 = Result.INSTANCE;
                            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                            healthConnectManager2 = healthConnectManager3;
                            l2 = l3;
                            list2 = list4;
                            if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                            }
                            emptyList = (List) m7905constructorimpl;
                            List list522222 = list3;
                            l4 = l2;
                            HealthConnectManager healthConnectManager422222 = healthConnectManager2;
                            Integer num322222 = num;
                            it = emptyList.iterator();
                            if (it.hasNext()) {
                            }
                            sleepWindow = (HealthConnectManager.SleepWindow) next;
                            if (sleepWindow == null) {
                            }
                            str2 = source;
                            if (l4 != null) {
                            }
                            return new HealthReadinessSignals(l4, num322222, (Double) objectRef.element, (Integer) objectRef2.element, str2, healthConnectManager422222.isReady(), list522222);
                        }
                        healthConnectManager2 = healthConnectManager3;
                        l2 = l3;
                        list2 = list4;
                        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                            m7905constructorimpl = CollectionsKt.emptyList();
                        }
                        emptyList = (List) m7905constructorimpl;
                        List list5222222 = list3;
                        l4 = l2;
                        HealthConnectManager healthConnectManager4222222 = healthConnectManager2;
                        Integer num3222222 = num;
                        it = emptyList.iterator();
                        if (it.hasNext()) {
                            next = str;
                        } else {
                            next = it.next();
                            if (it.hasNext()) {
                                Instant endTime = ((HealthConnectManager.SleepWindow) next).getEndTime();
                                do {
                                    Object next3 = it.next();
                                    Instant endTime2 = ((HealthConnectManager.SleepWindow) next3).getEndTime();
                                    if (endTime.compareTo(endTime2) < 0) {
                                        next = next3;
                                        endTime = endTime2;
                                    }
                                } while (it.hasNext());
                            }
                        }
                        sleepWindow = (HealthConnectManager.SleepWindow) next;
                        if (sleepWindow == null) {
                            objectRef.element = Boxing.boxDouble(sleepWindow.getAsleepMin() / 60.0d);
                            objectRef2.element = sleepWindow.getEfficiencyPercent();
                            source = sleepWindow.getSource();
                            List list6 = list5222222;
                            StringBuilder sb = new StringBuilder();
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String format = String.format("%.1f h sleep", Arrays.copyOf(new Object[]{objectRef.element}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            sb.append(format);
                            Integer num4 = (Integer) objectRef2.element;
                            if (num4 != null) {
                                sb.append(" · " + num4.intValue() + "% efficiency");
                            }
                            String sb2 = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                            list6.add(sb2);
                        } else {
                            Iterator<T> it2 = list2.iterator();
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (it2.hasNext()) {
                                    long endTimeMs = ((SleepEntryEntity) next2).getEndTimeMs();
                                    do {
                                        Object next4 = it2.next();
                                        long endTimeMs2 = ((SleepEntryEntity) next4).getEndTimeMs();
                                        if (endTimeMs < endTimeMs2) {
                                            next2 = next4;
                                            endTimeMs = endTimeMs2;
                                        }
                                    } while (it2.hasNext());
                                }
                            } else {
                                next2 = str;
                            }
                            SleepEntryEntity sleepEntryEntity = (SleepEntryEntity) next2;
                            if (sleepEntryEntity == null) {
                                str2 = str;
                                if (l4 != null) {
                                    long longValue = l4.longValue();
                                    if (longValue > 0) {
                                        String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Boxing.boxLong(longValue)}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                                        list5222222.add(format2 + " steps today");
                                    }
                                }
                                return new HealthReadinessSignals(l4, num3222222, (Double) objectRef.element, (Integer) objectRef2.element, str2, healthConnectManager4222222.isReady(), list5222222);
                            }
                            objectRef.element = Boxing.boxDouble(sleepEntryEntity.getTotalSleepMin() / 60.0d);
                            Integer sleepQuality = sleepEntryEntity.getSleepQuality();
                            T t = sleepQuality;
                            if (sleepQuality == null) {
                                t = sleepEntryEntity.getSleepEfficiency();
                            }
                            objectRef2.element = t;
                            source = sleepEntryEntity.getSource();
                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                            String format3 = String.format("%.1f h sleep (saved)", Arrays.copyOf(new Object[]{objectRef.element}, 1));
                            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                            list5222222.add(format3);
                        }
                        str2 = source;
                        if (l4 != null) {
                        }
                        return new HealthReadinessSignals(l4, num3222222, (Double) objectRef.element, (Integer) objectRef2.element, str2, healthConnectManager4222222.isReady(), list5222222);
                    }
                    z5 = healthReadinessSignalsBuilder$build$1.Z$0;
                    objectRef4 = (Ref.ObjectRef) healthReadinessSignalsBuilder$build$1.L$7;
                    objectRef3 = (Ref.ObjectRef) healthReadinessSignalsBuilder$build$1.L$6;
                    list3 = (List) healthReadinessSignalsBuilder$build$1.L$5;
                    zoneId2 = (ZoneId) healthReadinessSignalsBuilder$build$1.L$4;
                    list2 = (List) healthReadinessSignalsBuilder$build$1.L$3;
                    l2 = (Long) healthReadinessSignalsBuilder$build$1.L$2;
                    healthConnectManager2 = (HealthConnectManager) healthReadinessSignalsBuilder$build$1.L$1;
                    healthReadinessSignalsBuilder = (HealthReadinessSignalsBuilder) healthReadinessSignalsBuilder$build$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj2);
                    } catch (Throwable th7) {
                        HealthReadinessSignalsBuilder healthReadinessSignalsBuilder5 = healthReadinessSignalsBuilder;
                        th = th7;
                        z4 = z5;
                        healthReadinessSignalsBuilder2 = healthReadinessSignalsBuilder5;
                        Result.Companion companion42 = Result.INSTANCE;
                        Object m7905constructorimpl22 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        healthReadinessSignalsBuilder = healthReadinessSignalsBuilder2;
                        obj = m7905constructorimpl22;
                        if (Result.m7911isFailureimpl(obj)) {
                        }
                        num2 = (Integer) obj;
                        if (num2 != null) {
                        }
                        Ref.ObjectRef objectRef72 = objectRef3;
                        num = num2;
                        objectRef2 = objectRef4;
                        objectRef = objectRef72;
                        if (z4) {
                        }
                        str = null;
                        emptyList = CollectionsKt.emptyList();
                        List list52222222 = list3;
                        l4 = l2;
                        HealthConnectManager healthConnectManager42222222 = healthConnectManager2;
                        Integer num32222222 = num;
                        it = emptyList.iterator();
                        if (it.hasNext()) {
                        }
                        sleepWindow = (HealthConnectManager.SleepWindow) next;
                        if (sleepWindow == null) {
                        }
                        str2 = source;
                        if (l4 != null) {
                        }
                        return new HealthReadinessSignals(l4, num32222222, (Double) objectRef.element, (Integer) objectRef2.element, str2, healthConnectManager42222222.isReady(), list52222222);
                    }
                }
                boolean z6 = z5;
                obj = Result.m7905constructorimpl((Integer) obj2);
                z4 = z6;
                if (Result.m7911isFailureimpl(obj)) {
                    obj = null;
                }
                num2 = (Integer) obj;
                if (num2 != null) {
                    list3.add("Resting HR ~" + num2.intValue() + " bpm (overnight estimate)");
                }
                Ref.ObjectRef objectRef722 = objectRef3;
                num = num2;
                objectRef2 = objectRef4;
                objectRef = objectRef722;
                if (z4) {
                }
                str = null;
                emptyList = CollectionsKt.emptyList();
                List list522222222 = list3;
                l4 = l2;
                HealthConnectManager healthConnectManager422222222 = healthConnectManager2;
                Integer num322222222 = num;
                it = emptyList.iterator();
                if (it.hasNext()) {
                }
                sleepWindow = (HealthConnectManager.SleepWindow) next;
                if (sleepWindow == null) {
                }
                str2 = source;
                if (l4 != null) {
                }
                return new HealthReadinessSignals(l4, num322222222, (Double) objectRef.element, (Integer) objectRef2.element, str2, healthConnectManager422222222.isReady(), list522222222);
            }
        }
        healthReadinessSignalsBuilder$build$1 = new HealthReadinessSignalsBuilder$build$1(healthReadinessSignalsBuilder2, continuation);
        Object obj22 = healthReadinessSignalsBuilder$build$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthReadinessSignalsBuilder$build$1.label;
        if (i != 0) {
        }
        boolean z62 = z5;
        obj = Result.m7905constructorimpl((Integer) obj22);
        z4 = z62;
        if (Result.m7911isFailureimpl(obj)) {
        }
        num2 = (Integer) obj;
        if (num2 != null) {
        }
        Ref.ObjectRef objectRef7222 = objectRef3;
        num = num2;
        objectRef2 = objectRef4;
        objectRef = objectRef7222;
        if (z4) {
        }
        str = null;
        emptyList = CollectionsKt.emptyList();
        List list5222222222 = list3;
        l4 = l2;
        HealthConnectManager healthConnectManager4222222222 = healthConnectManager2;
        Integer num3222222222 = num;
        it = emptyList.iterator();
        if (it.hasNext()) {
        }
        sleepWindow = (HealthConnectManager.SleepWindow) next;
        if (sleepWindow == null) {
        }
        str2 = source;
        if (l4 != null) {
        }
        return new HealthReadinessSignals(l4, num3222222222, (Double) objectRef.element, (Integer) objectRef2.element, str2, healthConnectManager4222222222.isReady(), list5222222222);
    }
}
