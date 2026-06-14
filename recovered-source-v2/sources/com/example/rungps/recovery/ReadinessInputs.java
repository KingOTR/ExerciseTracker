package com.example.rungps.recovery;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.SoccerSessionEntity;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReadinessInputs.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007J`\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072.\u0010\u0011\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0086@¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/recovery/ReadinessInputs;", "", "<init>", "()V", "lastNightSleep", "Lcom/example/rungps/recovery/ReadinessInputs$LastNight;", "entries", "", "Lcom/example/rungps/data/SleepEntryEntity;", "zone", "Ljava/time/ZoneId;", "filterSoccerRecoveryDedupe", "Lcom/example/rungps/data/RecoveryEventEntity;", "events", "soccerSessions", "Lcom/example/rungps/data/SoccerSessionEntity;", "filterRecoveryForDisplay", "filterValid", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LastNight", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReadinessInputs {
    public static final int $stable = 0;
    public static final ReadinessInputs INSTANCE = new ReadinessInputs();

    private ReadinessInputs() {
    }

    /* compiled from: ReadinessInputs.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/recovery/ReadinessInputs$LastNight;", "", "quality", "", "totalSleepMin", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getQuality", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalSleepMin", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/example/rungps/recovery/ReadinessInputs$LastNight;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LastNight {
        public static final int $stable = 0;
        private final Integer quality;
        private final Integer totalSleepMin;

        public static /* synthetic */ LastNight copy$default(LastNight lastNight, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = lastNight.quality;
            }
            if ((i & 2) != 0) {
                num2 = lastNight.totalSleepMin;
            }
            return lastNight.copy(num, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getQuality() {
            return this.quality;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getTotalSleepMin() {
            return this.totalSleepMin;
        }

        public final LastNight copy(Integer quality, Integer totalSleepMin) {
            return new LastNight(quality, totalSleepMin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LastNight)) {
                return false;
            }
            LastNight lastNight = (LastNight) other;
            return Intrinsics.areEqual(this.quality, lastNight.quality) && Intrinsics.areEqual(this.totalSleepMin, lastNight.totalSleepMin);
        }

        public int hashCode() {
            Integer num = this.quality;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.totalSleepMin;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "LastNight(quality=" + this.quality + ", totalSleepMin=" + this.totalSleepMin + ")";
        }

        public LastNight(Integer num, Integer num2) {
            this.quality = num;
            this.totalSleepMin = num2;
        }

        public final Integer getQuality() {
            return this.quality;
        }

        public final Integer getTotalSleepMin() {
            return this.totalSleepMin;
        }
    }

    public static /* synthetic */ LastNight lastNightSleep$default(ReadinessInputs readinessInputs, List list, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return readinessInputs.lastNightSleep(list, zoneId);
    }

    public final LastNight lastNightSleep(List<SleepEntryEntity> entries, ZoneId zone) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(zone, "zone");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entries.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next3 = it.next();
            SleepEntryEntity sleepEntryEntity = (SleepEntryEntity) next3;
            int totalSleepMin = sleepEntryEntity.getTotalSleepMin();
            if (totalSleepMin < 20) {
                if (totalSleepMin <= 0) {
                    Integer sleepEfficiency = sleepEntryEntity.getSleepEfficiency();
                    if ((sleepEfficiency != null ? sleepEfficiency.intValue() : 0) <= 10) {
                    }
                }
                if (totalSleepMin > 0) {
                }
            }
            arrayList.add(next3);
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return new LastNight(null, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList2) {
            LocalDate localDate = Instant.ofEpochMilli(((SleepEntryEntity) obj).getEndTimeMs()).atZone(zone).toLocalDate();
            Object obj2 = linkedHashMap.get(localDate);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(localDate, obj2);
            }
            ((List) obj2).add(obj);
        }
        Collection values = linkedHashMap.values();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) it2.next()).iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    int totalSleepMin2 = ((SleepEntryEntity) next2).getTotalSleepMin();
                    do {
                        Object next4 = it3.next();
                        int totalSleepMin3 = ((SleepEntryEntity) next4).getTotalSleepMin();
                        if (totalSleepMin2 < totalSleepMin3) {
                            next2 = next4;
                            totalSleepMin2 = totalSleepMin3;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next2 = null;
            }
            SleepEntryEntity sleepEntryEntity2 = (SleepEntryEntity) next2;
            if (sleepEntryEntity2 != null) {
                arrayList3.add(sleepEntryEntity2);
            }
        }
        Iterator it4 = arrayList3.iterator();
        if (it4.hasNext()) {
            next = it4.next();
            if (it4.hasNext()) {
                long endTimeMs = ((SleepEntryEntity) next).getEndTimeMs();
                do {
                    Object next5 = it4.next();
                    long endTimeMs2 = ((SleepEntryEntity) next5).getEndTimeMs();
                    if (endTimeMs < endTimeMs2) {
                        next = next5;
                        endTimeMs = endTimeMs2;
                    }
                } while (it4.hasNext());
            }
        } else {
            next = null;
        }
        SleepEntryEntity sleepEntryEntity3 = (SleepEntryEntity) next;
        if (sleepEntryEntity3 == null) {
            return new LastNight(null, null);
        }
        Integer sleepQuality = sleepEntryEntity3.getSleepQuality();
        Integer valueOf = Integer.valueOf(sleepEntryEntity3.getTotalSleepMin());
        return new LastNight(sleepQuality, (valueOf.intValue() > 0 ? 1 : 0) != 0 ? valueOf : null);
    }

    public final List<RecoveryEventEntity> filterSoccerRecoveryDedupe(List<RecoveryEventEntity> events, List<SoccerSessionEntity> soccerSessions) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(soccerSessions, "soccerSessions");
        Set<Long> keptSessionIds = SoccerSessionDedup.INSTANCE.keptSessionIds(soccerSessions);
        if (keptSessionIds.isEmpty()) {
            return events;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : events) {
            RecoveryEventEntity recoveryEventEntity = (RecoveryEventEntity) obj;
            if (!Intrinsics.areEqual(recoveryEventEntity.getKind(), "SOCCER") ? true : keptSessionIds.contains(Long.valueOf(recoveryEventEntity.getSourceId()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object filterRecoveryForDisplay(List<RecoveryEventEntity> list, List<SoccerSessionEntity> list2, Function2<? super List<RecoveryEventEntity>, ? super Continuation<? super List<RecoveryEventEntity>>, ? extends Object> function2, Continuation<? super List<RecoveryEventEntity>> continuation) {
        ReadinessInputs$filterRecoveryForDisplay$1 readinessInputs$filterRecoveryForDisplay$1;
        int i;
        if (continuation instanceof ReadinessInputs$filterRecoveryForDisplay$1) {
            readinessInputs$filterRecoveryForDisplay$1 = (ReadinessInputs$filterRecoveryForDisplay$1) continuation;
            if ((readinessInputs$filterRecoveryForDisplay$1.label & Integer.MIN_VALUE) != 0) {
                readinessInputs$filterRecoveryForDisplay$1.label -= Integer.MIN_VALUE;
                Object obj = readinessInputs$filterRecoveryForDisplay$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readinessInputs$filterRecoveryForDisplay$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    readinessInputs$filterRecoveryForDisplay$1.L$0 = this;
                    readinessInputs$filterRecoveryForDisplay$1.L$1 = list2;
                    readinessInputs$filterRecoveryForDisplay$1.label = 1;
                    obj = function2.invoke(list, readinessInputs$filterRecoveryForDisplay$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) readinessInputs$filterRecoveryForDisplay$1.L$1;
                    this = (ReadinessInputs) readinessInputs$filterRecoveryForDisplay$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return this.filterSoccerRecoveryDedupe((List) obj, list2);
            }
        }
        readinessInputs$filterRecoveryForDisplay$1 = new ReadinessInputs$filterRecoveryForDisplay$1(this, continuation);
        Object obj2 = readinessInputs$filterRecoveryForDisplay$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readinessInputs$filterRecoveryForDisplay$1.label;
        if (i != 0) {
        }
        return this.filterSoccerRecoveryDedupe((List) obj2, list2);
    }
}
