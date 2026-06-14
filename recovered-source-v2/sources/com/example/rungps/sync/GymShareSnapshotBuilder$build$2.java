package com.example.rungps.sync;

import com.example.rungps.analytics.GymMuscleVolume;
import com.example.rungps.analytics.GymWeeklyVolume;
import com.example.rungps.analytics.WeekVolumeBar;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.health.GymAttendance;
import com.example.rungps.health.GymAttendanceStats;
import com.example.rungps.sync.GymShareSnapshotBuilder;
import java.util.ArrayList;
import java.util.Comparator;
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
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymShareSnapshotBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/sync/GymShareSnapshotBuilder$GymShareExtras;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.GymShareSnapshotBuilder$build$2", f = "GymShareSnapshotBuilder.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {38, 42, 43, 44}, m = "invokeSuspend", n = {"finished", "recent", "destination$iv$iv", "finished", "recent", "setsMap", "attendance", "sets7d", "finished", "recent", "setsMap", "attendance", "muscleLookup", "sets7d", "finished", "recent", "setsMap", "attendance", "muscleLookup", "secondary", "sets7d"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"})
/* loaded from: classes3.dex */
final class GymShareSnapshotBuilder$build$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GymShareSnapshotBuilder.GymShareExtras>, Object> {
    final /* synthetic */ Repository $repo;
    final /* synthetic */ List<GymSessionEntity> $sessions;
    final /* synthetic */ long $weekAgoMs;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymShareSnapshotBuilder$build$2(List<GymSessionEntity> list, Repository repository, long j, Continuation<? super GymShareSnapshotBuilder$build$2> continuation) {
        super(2, continuation);
        this.$sessions = list;
        this.$repo = repository;
        this.$weekAgoMs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymShareSnapshotBuilder$build$2(this.$sessions, this.$repo, this.$weekAgoMs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GymShareSnapshotBuilder.GymShareExtras> continuation) {
        return ((GymShareSnapshotBuilder$build$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x026f A[LOOP:0: B:9:0x0267->B:11:0x026f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02d7 A[LOOP:1: B:14:0x02d1->B:16:0x02d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0212 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x015d -> B:50:0x0160). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        Repository repository;
        List list;
        Iterator it;
        Object muscleGroupLookup;
        List list2;
        GymAttendanceStats gymAttendanceStats;
        int i;
        Map map;
        Map map2;
        Object muscleSecondaryLookup;
        List list3;
        GymAttendanceStats gymAttendanceStats2;
        List list4;
        Map map3;
        Object muscleTertiaryLookup;
        Map map4;
        Map map5;
        List list5;
        Map map6;
        GymAttendanceStats gymAttendanceStats3;
        int i2;
        List list6;
        Iterator it2;
        Object next;
        String lastSessionLine;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            List<GymSessionEntity> list7 = this.$sessions;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list7) {
                if (((GymSessionEntity) obj2).getEndedAtMs() != null) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
            ArrayList arrayList3 = arrayList;
            long j = this.$weekAgoMs;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                Long endedAtMs = ((GymSessionEntity) obj3).getEndedAtMs();
                if ((endedAtMs != null ? endedAtMs.longValue() : 0L) >= j) {
                    arrayList4.add(obj3);
                }
            }
            Repository repository2 = this.$repo;
            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList3, 10)), 16));
            repository = repository2;
            list = arrayList4;
            it = arrayList3.iterator();
            if (it.hasNext()) {
            }
        } else if (i3 == 1) {
            Long l = (Long) this.L$6;
            Map map7 = (Map) this.L$5;
            Iterator it3 = (Iterator) this.L$4;
            ?? r12 = (Map) this.L$3;
            repository = (Repository) this.L$2;
            List list8 = (List) this.L$1;
            ?? r15 = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            Iterator it4 = it3;
            ArrayList arrayList5 = r15;
            Long boxLong = l;
            Object obj4 = obj;
            linkedHashMap = r12;
            list = list8;
            Pair pair = TuplesKt.to(boxLong, obj4);
            map7.put(pair.getFirst(), pair.getSecond());
            arrayList = arrayList5;
            it = it4;
            if (it.hasNext()) {
                GymSessionEntity gymSessionEntity = (GymSessionEntity) it.next();
                boxLong = Boxing.boxLong(gymSessionEntity.getId());
                long id = gymSessionEntity.getId();
                this.L$0 = arrayList;
                this.L$1 = list;
                this.L$2 = repository;
                this.L$3 = linkedHashMap;
                this.L$4 = it;
                this.L$5 = linkedHashMap;
                this.L$6 = boxLong;
                this.label = 1;
                obj4 = repository.setsForSession(id, this);
                if (obj4 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                it4 = it;
                arrayList5 = arrayList;
                map7 = linkedHashMap;
                Pair pair2 = TuplesKt.to(boxLong, obj4);
                map7.put(pair2.getFirst(), pair2.getSecond());
                arrayList = arrayList5;
                it = it4;
                if (it.hasNext()) {
                    Iterator it5 = list.iterator();
                    int i4 = 0;
                    while (it5.hasNext()) {
                        List list9 = (List) linkedHashMap.get(Boxing.boxLong(((GymSessionEntity) it5.next()).getId()));
                        if (list9 == null) {
                            list9 = CollectionsKt.emptyList();
                        }
                        i4 += list9.size();
                    }
                    GymAttendanceStats compute$default = GymAttendance.compute$default(GymAttendance.INSTANCE, arrayList, null, 0, 6, null);
                    this.L$0 = arrayList;
                    this.L$1 = list;
                    this.L$2 = linkedHashMap;
                    this.L$3 = compute$default;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.I$0 = i4;
                    this.label = 2;
                    muscleGroupLookup = this.$repo.muscleGroupLookup(this);
                    if (muscleGroupLookup == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list2 = arrayList;
                    gymAttendanceStats = compute$default;
                    i = i4;
                    map = linkedHashMap;
                    map2 = (Map) muscleGroupLookup;
                    this.L$0 = list2;
                    this.L$1 = list;
                    this.L$2 = map;
                    this.L$3 = gymAttendanceStats;
                    this.L$4 = map2;
                    this.I$0 = i;
                    this.label = 3;
                    muscleSecondaryLookup = this.$repo.muscleSecondaryLookup(this);
                    if (muscleSecondaryLookup != coroutine_suspended) {
                    }
                }
            }
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    i = this.I$0;
                    Map map8 = (Map) this.L$4;
                    GymAttendanceStats gymAttendanceStats4 = (GymAttendanceStats) this.L$3;
                    Map map9 = (Map) this.L$2;
                    List list10 = (List) this.L$1;
                    list4 = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    muscleSecondaryLookup = obj;
                    map2 = map8;
                    gymAttendanceStats2 = gymAttendanceStats4;
                    map3 = map9;
                    list3 = list10;
                    Map map10 = (Map) muscleSecondaryLookup;
                    this.L$0 = list4;
                    this.L$1 = list3;
                    this.L$2 = map3;
                    this.L$3 = gymAttendanceStats2;
                    this.L$4 = map2;
                    this.L$5 = map10;
                    this.I$0 = i;
                    this.label = 4;
                    muscleTertiaryLookup = this.$repo.muscleTertiaryLookup(this);
                    if (muscleTertiaryLookup != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map4 = map10;
                    map5 = map2;
                    list5 = list3;
                    map6 = map3;
                    gymAttendanceStats3 = gymAttendanceStats2;
                    i2 = i;
                    list6 = list4;
                    List<Map.Entry> take = CollectionsKt.take(CollectionsKt.sortedWith(GymMuscleVolume.compute$default(GymMuscleVolume.INSTANCE, list6, map6, map5, MapsKt.emptyMap(), 7, null, map4, (Map) muscleTertiaryLookup, null, 288, null).getByUserTag().entrySet(), new Comparator() { // from class: com.example.rungps.sync.GymShareSnapshotBuilder$build$2$invokeSuspend$$inlined$sortedByDescending$1
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues((Float) ((Map.Entry) t2).getValue(), (Float) ((Map.Entry) t).getValue());
                        }
                    }), 6);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
                    while (r0.hasNext()) {
                    }
                    ArrayList arrayList7 = arrayList6;
                    List<WeekVolumeBar> compute$default2 = GymWeeklyVolume.compute$default(GymWeeklyVolume.INSTANCE, list6, map6, null, 4, 4, null);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(compute$default2, 10));
                    while (r0.hasNext()) {
                    }
                    ArrayList arrayList9 = arrayList8;
                    GymShareSnapshotBuilder gymShareSnapshotBuilder = GymShareSnapshotBuilder.INSTANCE;
                    it2 = list5.iterator();
                    if (it2.hasNext()) {
                    }
                    lastSessionLine = gymShareSnapshotBuilder.lastSessionLine((GymSessionEntity) next, map6);
                    return new GymShareSnapshotBuilder.GymShareExtras(list5.size(), i2, gymAttendanceStats3.getLabel(), gymAttendanceStats3.getPct(), arrayList7, arrayList9, lastSessionLine);
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = this.I$0;
                Map map11 = (Map) this.L$5;
                Map map12 = (Map) this.L$4;
                GymAttendanceStats gymAttendanceStats5 = (GymAttendanceStats) this.L$3;
                Map map13 = (Map) this.L$2;
                List list11 = (List) this.L$1;
                List list12 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                map4 = map11;
                map5 = map12;
                list5 = list11;
                list6 = list12;
                map6 = map13;
                muscleTertiaryLookup = obj;
                gymAttendanceStats3 = gymAttendanceStats5;
                i2 = i5;
                List<Map.Entry> take2 = CollectionsKt.take(CollectionsKt.sortedWith(GymMuscleVolume.compute$default(GymMuscleVolume.INSTANCE, list6, map6, map5, MapsKt.emptyMap(), 7, null, map4, (Map) muscleTertiaryLookup, null, 288, null).getByUserTag().entrySet(), new Comparator() { // from class: com.example.rungps.sync.GymShareSnapshotBuilder$build$2$invokeSuspend$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues((Float) ((Map.Entry) t2).getValue(), (Float) ((Map.Entry) t).getValue());
                    }
                }), 6);
                ArrayList arrayList62 = new ArrayList(CollectionsKt.collectionSizeOrDefault(take2, 10));
                for (Map.Entry entry : take2) {
                    arrayList62.add(MapsKt.mapOf(TuplesKt.to("tag", StringsKt.take((String) entry.getKey(), 40)), TuplesKt.to("kg", Boxing.boxInt(MathKt.roundToInt(((Number) entry.getValue()).floatValue())))));
                }
                ArrayList arrayList72 = arrayList62;
                List<WeekVolumeBar> compute$default22 = GymWeeklyVolume.compute$default(GymWeeklyVolume.INSTANCE, list6, map6, null, 4, 4, null);
                ArrayList arrayList82 = new ArrayList(CollectionsKt.collectionSizeOrDefault(compute$default22, 10));
                for (WeekVolumeBar weekVolumeBar : compute$default22) {
                    arrayList82.add(MapsKt.mapOf(TuplesKt.to("label", weekVolumeBar.getWeekLabel()), TuplesKt.to("kg", Boxing.boxInt(MathKt.roundToInt(weekVolumeBar.getTonnage()))), TuplesKt.to("sessions", Boxing.boxInt(weekVolumeBar.getSessionCount()))));
                }
                ArrayList arrayList92 = arrayList82;
                GymShareSnapshotBuilder gymShareSnapshotBuilder2 = GymShareSnapshotBuilder.INSTANCE;
                it2 = list5.iterator();
                if (it2.hasNext()) {
                    next = null;
                } else {
                    next = it2.next();
                    if (it2.hasNext()) {
                        Long endedAtMs2 = ((GymSessionEntity) next).getEndedAtMs();
                        long longValue = endedAtMs2 != null ? endedAtMs2.longValue() : 0L;
                        do {
                            Object next2 = it2.next();
                            Long endedAtMs3 = ((GymSessionEntity) next2).getEndedAtMs();
                            long longValue2 = endedAtMs3 != null ? endedAtMs3.longValue() : 0L;
                            if (longValue < longValue2) {
                                next = next2;
                                longValue = longValue2;
                            }
                        } while (it2.hasNext());
                    }
                }
                lastSessionLine = gymShareSnapshotBuilder2.lastSessionLine((GymSessionEntity) next, map6);
                return new GymShareSnapshotBuilder.GymShareExtras(list5.size(), i2, gymAttendanceStats3.getLabel(), gymAttendanceStats3.getPct(), arrayList72, arrayList92, lastSessionLine);
            }
            i = this.I$0;
            gymAttendanceStats = (GymAttendanceStats) this.L$3;
            map = (Map) this.L$2;
            list = (List) this.L$1;
            list2 = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            muscleGroupLookup = obj;
            map2 = (Map) muscleGroupLookup;
            this.L$0 = list2;
            this.L$1 = list;
            this.L$2 = map;
            this.L$3 = gymAttendanceStats;
            this.L$4 = map2;
            this.I$0 = i;
            this.label = 3;
            muscleSecondaryLookup = this.$repo.muscleSecondaryLookup(this);
            if (muscleSecondaryLookup != coroutine_suspended) {
                return coroutine_suspended;
            }
            list3 = list;
            gymAttendanceStats2 = gymAttendanceStats;
            list4 = list2;
            map3 = map;
            Map map102 = (Map) muscleSecondaryLookup;
            this.L$0 = list4;
            this.L$1 = list3;
            this.L$2 = map3;
            this.L$3 = gymAttendanceStats2;
            this.L$4 = map2;
            this.L$5 = map102;
            this.I$0 = i;
            this.label = 4;
            muscleTertiaryLookup = this.$repo.muscleTertiaryLookup(this);
            if (muscleTertiaryLookup != coroutine_suspended) {
            }
        }
    }
}
