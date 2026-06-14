package com.example.rungps.recovery;

import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.tracking.ActivityTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: RecoveryMuscleHeatmap.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jn\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@¢\u0006\u0002\u0010\u0010J8\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0016H\u0002J\u009a\u0001\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00120\u001dH\u0082@¢\u0006\u0002\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/recovery/RecoveryMuscleHeatmap;", "", "<init>", "()V", "regionsFromActiveEvents", "", "", "", "active", "", "Lcom/example/rungps/data/RecoveryEventEntity;", "repo", "Lcom/example/rungps/data/Repository;", "lookup", "secondaryLookup", "tertiaryLookup", "(Ljava/util/List;Lcom/example/rungps/data/Repository;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "distributeHours", "", "hours", "splits", "regions", "", "accumulateGymRecovery", "e", "remH", "exercises", "", "dayHintOut", "Lkotlin/Function1;", "(Lcom/example/rungps/data/RecoveryEventEntity;FLcom/example/rungps/data/Repository;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecoveryMuscleHeatmap {
    public static final int $stable = 0;
    public static final RecoveryMuscleHeatmap INSTANCE = new RecoveryMuscleHeatmap();

    private RecoveryMuscleHeatmap() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c7, code lost:
    
        if (r4.equals("STRAVA_RUN") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
    
        com.example.rungps.recovery.RecoveryMuscleHeatmap.INSTANCE.distributeHours(r11, com.example.rungps.recovery.MuscleHeatmapRegions.INSTANCE.regionsForRunRecovery(), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        if (r4.equals("RUN") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017f, code lost:
    
        if (r4.equals("STRAVA_BIKE") == false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0139 -> B:10:0x0144). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object regionsFromActiveEvents(List<RecoveryEventEntity> list, Repository repository, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Continuation<? super Map<String, Float>> continuation) {
        RecoveryMuscleHeatmap$regionsFromActiveEvents$1 recoveryMuscleHeatmap$regionsFromActiveEvents$1;
        int i;
        Iterator it;
        LinkedHashMap linkedHashMap;
        final Ref.ObjectRef objectRef;
        long j;
        Repository repository2;
        Map<String, String> map4;
        RecoveryMuscleHeatmap$regionsFromActiveEvents$1 recoveryMuscleHeatmap$regionsFromActiveEvents$12;
        List<String> list2;
        Map<String, String> map5;
        Map<String, String> map6;
        Iterator it2;
        LinkedHashMap linkedHashMap2;
        Ref.ObjectRef objectRef2;
        long j2;
        if (continuation instanceof RecoveryMuscleHeatmap$regionsFromActiveEvents$1) {
            recoveryMuscleHeatmap$regionsFromActiveEvents$1 = (RecoveryMuscleHeatmap$regionsFromActiveEvents$1) continuation;
            if ((recoveryMuscleHeatmap$regionsFromActiveEvents$1.label & Integer.MIN_VALUE) != 0) {
                recoveryMuscleHeatmap$regionsFromActiveEvents$1.label -= Integer.MIN_VALUE;
                Object obj = recoveryMuscleHeatmap$regionsFromActiveEvents$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = recoveryMuscleHeatmap$regionsFromActiveEvents$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    ArrayList arrayList = new ArrayList();
                    long currentTimeMillis = System.currentTimeMillis();
                    it = list.iterator();
                    linkedHashMap = linkedHashMap3;
                    objectRef = objectRef3;
                    j = currentTimeMillis;
                    repository2 = repository;
                    map4 = map2;
                    recoveryMuscleHeatmap$regionsFromActiveEvents$12 = recoveryMuscleHeatmap$regionsFromActiveEvents$1;
                    list2 = arrayList;
                    map5 = map;
                    map6 = map3;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j3 = recoveryMuscleHeatmap$regionsFromActiveEvents$1.J$0;
                    Iterator it3 = (Iterator) recoveryMuscleHeatmap$regionsFromActiveEvents$1.L$7;
                    list2 = (List) recoveryMuscleHeatmap$regionsFromActiveEvents$1.L$6;
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) recoveryMuscleHeatmap$regionsFromActiveEvents$1.L$5;
                    LinkedHashMap linkedHashMap4 = (LinkedHashMap) recoveryMuscleHeatmap$regionsFromActiveEvents$1.L$4;
                    Map<String, String> map7 = (Map) recoveryMuscleHeatmap$regionsFromActiveEvents$1.L$3;
                    Map<String, String> map8 = (Map) recoveryMuscleHeatmap$regionsFromActiveEvents$1.L$2;
                    Map<String, String> map9 = (Map) recoveryMuscleHeatmap$regionsFromActiveEvents$1.L$1;
                    Repository repository3 = (Repository) recoveryMuscleHeatmap$regionsFromActiveEvents$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    j = j3;
                    map6 = map7;
                    repository2 = repository3;
                    recoveryMuscleHeatmap$regionsFromActiveEvents$12 = recoveryMuscleHeatmap$regionsFromActiveEvents$1;
                    objectRef = objectRef4;
                    map5 = map9;
                    it = it3;
                    linkedHashMap = linkedHashMap4;
                    map4 = map8;
                    if (it.hasNext()) {
                        RecoveryEventEntity recoveryEventEntity = (RecoveryEventEntity) it.next();
                        Map<String, String> map10 = map6;
                        float coerceIn = RangesKt.coerceIn((recoveryEventEntity.getEndsAtMs() - j) / 3600000.0f, 0.0f, 72.0f);
                        if (coerceIn > 0.0f) {
                            String kind = recoveryEventEntity.getKind();
                            switch (kind.hashCode()) {
                                case -2047622491:
                                    map6 = map10;
                                    it2 = it;
                                    linkedHashMap2 = linkedHashMap;
                                    objectRef2 = objectRef;
                                    j2 = j;
                                    break;
                                case -1843726999:
                                    map6 = map10;
                                    it2 = it;
                                    linkedHashMap2 = linkedHashMap;
                                    objectRef2 = objectRef;
                                    j2 = j;
                                    if (kind.equals("SOCCER")) {
                                        INSTANCE.distributeHours(coerceIn, MuscleHeatmapRegions.INSTANCE.regionsForSoccerRecovery(), linkedHashMap2);
                                    }
                                    objectRef = objectRef2;
                                    linkedHashMap = linkedHashMap2;
                                    j = j2;
                                    it = it2;
                                    break;
                                case 71067:
                                    if (kind.equals("GYM")) {
                                        RecoveryMuscleHeatmap recoveryMuscleHeatmap = INSTANCE;
                                        LinkedHashMap linkedHashMap5 = linkedHashMap;
                                        Function1<? super String, Unit> function1 = new Function1() { // from class: com.example.rungps.recovery.RecoveryMuscleHeatmap$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                Unit regionsFromActiveEvents$lambda$1$lambda$0;
                                                regionsFromActiveEvents$lambda$1$lambda$0 = RecoveryMuscleHeatmap.regionsFromActiveEvents$lambda$1$lambda$0(Ref.ObjectRef.this, (String) obj2);
                                                return regionsFromActiveEvents$lambda$1$lambda$0;
                                            }
                                        };
                                        recoveryMuscleHeatmap$regionsFromActiveEvents$12.L$0 = repository2;
                                        recoveryMuscleHeatmap$regionsFromActiveEvents$12.L$1 = map5;
                                        recoveryMuscleHeatmap$regionsFromActiveEvents$12.L$2 = map4;
                                        recoveryMuscleHeatmap$regionsFromActiveEvents$12.L$3 = map10;
                                        recoveryMuscleHeatmap$regionsFromActiveEvents$12.L$4 = linkedHashMap;
                                        recoveryMuscleHeatmap$regionsFromActiveEvents$12.L$5 = objectRef;
                                        recoveryMuscleHeatmap$regionsFromActiveEvents$12.L$6 = list2;
                                        recoveryMuscleHeatmap$regionsFromActiveEvents$12.L$7 = it;
                                        recoveryMuscleHeatmap$regionsFromActiveEvents$12.J$0 = j;
                                        Iterator it4 = it;
                                        recoveryMuscleHeatmap$regionsFromActiveEvents$12.label = 1;
                                        LinkedHashMap linkedHashMap6 = linkedHashMap;
                                        objectRef4 = objectRef;
                                        long j4 = j;
                                        if (recoveryMuscleHeatmap.accumulateGymRecovery(recoveryEventEntity, coerceIn, repository2, map5, map4, map10, linkedHashMap5, list2, function1, recoveryMuscleHeatmap$regionsFromActiveEvents$12) != coroutine_suspended) {
                                            repository3 = repository2;
                                            map9 = map5;
                                            map8 = map4;
                                            map7 = map10;
                                            recoveryMuscleHeatmap$regionsFromActiveEvents$1 = recoveryMuscleHeatmap$regionsFromActiveEvents$12;
                                            linkedHashMap4 = linkedHashMap6;
                                            j3 = j4;
                                            it3 = it4;
                                            j = j3;
                                            map6 = map7;
                                            repository2 = repository3;
                                            recoveryMuscleHeatmap$regionsFromActiveEvents$12 = recoveryMuscleHeatmap$regionsFromActiveEvents$1;
                                            objectRef = objectRef4;
                                            map5 = map9;
                                            it = it3;
                                            linkedHashMap = linkedHashMap4;
                                            map4 = map8;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    map6 = map10;
                                    it2 = it;
                                    linkedHashMap2 = linkedHashMap;
                                    objectRef2 = objectRef;
                                    j2 = j;
                                    objectRef = objectRef2;
                                    linkedHashMap = linkedHashMap2;
                                    j = j2;
                                    it = it2;
                                    break;
                                case 81515:
                                    break;
                                case 2038753:
                                    if (kind.equals(ActivityTypes.BIKE)) {
                                        map6 = map10;
                                        it2 = it;
                                        linkedHashMap2 = linkedHashMap;
                                        objectRef2 = objectRef;
                                        j2 = j;
                                        INSTANCE.distributeHours(coerceIn, MuscleHeatmapRegions.INSTANCE.regionsForBikeRecovery(), linkedHashMap2);
                                        objectRef = objectRef2;
                                        linkedHashMap = linkedHashMap2;
                                        j = j2;
                                        it = it2;
                                        break;
                                    }
                                    map6 = map10;
                                    it2 = it;
                                    linkedHashMap2 = linkedHashMap;
                                    objectRef2 = objectRef;
                                    j2 = j;
                                    objectRef = objectRef2;
                                    linkedHashMap = linkedHashMap2;
                                    j = j2;
                                    it = it2;
                                case 626700071:
                                    break;
                                default:
                                    map6 = map10;
                                    it2 = it;
                                    linkedHashMap2 = linkedHashMap;
                                    objectRef2 = objectRef;
                                    j2 = j;
                                    objectRef = objectRef2;
                                    linkedHashMap = linkedHashMap2;
                                    j = j2;
                                    it = it2;
                                    break;
                            }
                        } else {
                            map6 = map10;
                            it = it;
                        }
                        if (it.hasNext()) {
                            LinkedHashMap linkedHashMap7 = linkedHashMap;
                            return (!linkedHashMap7.isEmpty() || list2.isEmpty()) ? linkedHashMap7 : MuscleHeatmapRegions.INSTANCE.regionHours(MapsKt.emptyMap(), CollectionsKt.distinct(list2), (String) objectRef.element);
                        }
                    }
                }
            }
        }
        recoveryMuscleHeatmap$regionsFromActiveEvents$1 = new RecoveryMuscleHeatmap$regionsFromActiveEvents$1(this, continuation);
        Object obj2 = recoveryMuscleHeatmap$regionsFromActiveEvents$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = recoveryMuscleHeatmap$regionsFromActiveEvents$1.label;
        if (i != 0) {
        }
    }

    public static /* synthetic */ Object regionsFromActiveEvents$default(RecoveryMuscleHeatmap recoveryMuscleHeatmap, List list, Repository repository, Map map, Map map2, Map map3, Continuation continuation, int i, Object obj) {
        if ((i & 16) != 0) {
            map3 = MapsKt.emptyMap();
        }
        return recoveryMuscleHeatmap.regionsFromActiveEvents(list, repository, map, map2, map3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit regionsFromActiveEvents$lambda$1$lambda$0(Ref.ObjectRef objectRef, String str) {
        T t = str;
        if (str == null) {
            t = (String) objectRef.element;
        }
        objectRef.element = t;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object accumulateGymRecovery(RecoveryEventEntity recoveryEventEntity, float f, Repository repository, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, Float> map4, List<String> list, Function1<? super String, Unit> function1, Continuation<? super Unit> continuation) {
        RecoveryMuscleHeatmap$accumulateGymRecovery$1 recoveryMuscleHeatmap$accumulateGymRecovery$1;
        Object coroutine_suspended;
        int i;
        Map<String, String> map5;
        Map<String, String> map6;
        float f2;
        Map<String, Float> map7;
        Map<String, String> map8;
        Function1<? super String, Unit> function12;
        RecoveryEventEntity recoveryEventEntity2;
        List<String> list2;
        Repository repository2;
        GymSessionEntity gymSessionEntity;
        float f3;
        List<String> list3;
        Repository repository3;
        String str;
        Long templateDayId;
        GymSessionEntity gymSessionEntity2;
        float f4;
        Function1<? super String, Unit> function13;
        Map<String, Float> map9;
        RecoveryEventEntity recoveryEventEntity3;
        Map<String, String> map10;
        Map<String, String> map11;
        Repository repository4;
        Map<String, String> map12;
        Object obj;
        Map<String, String> map13;
        Map<String, String> map14;
        Map<String, String> map15;
        GymSessionEntity gymSessionEntity3;
        float f5;
        String str2;
        List<GymSetEntity> list4;
        String str3;
        Map<String, Float> map16;
        List<String> list5;
        Map<String, String> map17;
        Map<String, String> map18;
        Map<String, String> map19;
        if (continuation instanceof RecoveryMuscleHeatmap$accumulateGymRecovery$1) {
            recoveryMuscleHeatmap$accumulateGymRecovery$1 = (RecoveryMuscleHeatmap$accumulateGymRecovery$1) continuation;
            if ((recoveryMuscleHeatmap$accumulateGymRecovery$1.label & Integer.MIN_VALUE) != 0) {
                recoveryMuscleHeatmap$accumulateGymRecovery$1.label -= Integer.MIN_VALUE;
                Object obj2 = recoveryMuscleHeatmap$accumulateGymRecovery$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = recoveryMuscleHeatmap$accumulateGymRecovery$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    long sourceId = recoveryEventEntity.getSourceId();
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$0 = recoveryEventEntity;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$1 = repository;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$2 = map;
                    map5 = map2;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$3 = map5;
                    map6 = map3;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$4 = map6;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$5 = map4;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$6 = list;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$7 = function1;
                    f2 = f;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.F$0 = f2;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.label = 1;
                    Object gymSessionById = repository.gymSessionById(sourceId, recoveryMuscleHeatmap$accumulateGymRecovery$1);
                    if (gymSessionById == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map7 = map4;
                    map8 = map;
                    function12 = function1;
                    recoveryEventEntity2 = recoveryEventEntity;
                    obj2 = gymSessionById;
                    list2 = list;
                    repository2 = repository;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            f4 = recoveryMuscleHeatmap$accumulateGymRecovery$1.F$0;
                            gymSessionEntity2 = (GymSessionEntity) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$8;
                            function13 = (Function1) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$7;
                            list3 = (List) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$6;
                            map9 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$5;
                            map11 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$4;
                            map12 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$3;
                            map10 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$2;
                            repository4 = (Repository) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$1;
                            recoveryEventEntity3 = (RecoveryEventEntity) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            str = (String) obj2;
                            f3 = f4;
                            gymSessionEntity = gymSessionEntity2;
                            function12 = function13;
                            repository3 = repository4;
                            map6 = map11;
                            map8 = map10;
                            recoveryEventEntity2 = recoveryEventEntity3;
                            map7 = map9;
                            map5 = map12;
                            function12.invoke(str);
                            long sourceId2 = recoveryEventEntity2.getSourceId();
                            recoveryMuscleHeatmap$accumulateGymRecovery$1.L$0 = repository3;
                            recoveryMuscleHeatmap$accumulateGymRecovery$1.L$1 = map8;
                            recoveryMuscleHeatmap$accumulateGymRecovery$1.L$2 = map5;
                            recoveryMuscleHeatmap$accumulateGymRecovery$1.L$3 = map6;
                            recoveryMuscleHeatmap$accumulateGymRecovery$1.L$4 = map7;
                            recoveryMuscleHeatmap$accumulateGymRecovery$1.L$5 = list3;
                            recoveryMuscleHeatmap$accumulateGymRecovery$1.L$6 = gymSessionEntity;
                            recoveryMuscleHeatmap$accumulateGymRecovery$1.L$7 = str;
                            recoveryMuscleHeatmap$accumulateGymRecovery$1.L$8 = null;
                            recoveryMuscleHeatmap$accumulateGymRecovery$1.F$0 = f3;
                            recoveryMuscleHeatmap$accumulateGymRecovery$1.label = 3;
                            obj = repository3.setsForSession(sourceId2, recoveryMuscleHeatmap$accumulateGymRecovery$1);
                            if (obj != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            map13 = map5;
                            map14 = map6;
                            map15 = map8;
                            gymSessionEntity3 = gymSessionEntity;
                            f5 = f3;
                            str2 = str;
                            obj2 = obj;
                            list4 = (List) obj2;
                            if (list4.isEmpty()) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            f5 = recoveryMuscleHeatmap$accumulateGymRecovery$1.F$0;
                            str3 = (String) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$5;
                            list5 = (List) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$4;
                            map16 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$3;
                            map18 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$2;
                            map19 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$1;
                            map17 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            float coerceAtLeast = f5 / RangesKt.coerceAtLeast(r1.size(), 1);
                            for (ExerciseTemplateEntity exerciseTemplateEntity : (List) obj2) {
                                list5.add(exerciseTemplateEntity.getName());
                                String lowerCase = StringsKt.trim((CharSequence) exerciseTemplateEntity.getName()).toString().toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                for (Map.Entry<String, Float> entry : MuscleHeatmapRegions.INSTANCE.regionsForGymSet(exerciseTemplateEntity.getName(), map17.get(lowerCase), str3, map19.get(lowerCase), map18.get(lowerCase)).entrySet()) {
                                    String key = entry.getKey();
                                    float coerceAtMost = RangesKt.coerceAtMost(entry.getValue().floatValue() * coerceAtLeast, 72.0f);
                                    Float f6 = map16.get(key);
                                    map16.put(key, Boxing.boxFloat(Math.max(f6 != null ? f6.floatValue() : 0.0f, coerceAtMost)));
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        f5 = recoveryMuscleHeatmap$accumulateGymRecovery$1.F$0;
                        str2 = (String) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$7;
                        GymSessionEntity gymSessionEntity4 = (GymSessionEntity) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$6;
                        list3 = (List) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$5;
                        Map<String, Float> map20 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$4;
                        map14 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$3;
                        map13 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$2;
                        map15 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$1;
                        repository3 = (Repository) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        gymSessionEntity3 = gymSessionEntity4;
                        map7 = map20;
                        list4 = (List) obj2;
                        if (list4.isEmpty()) {
                            float size = f5 / list4.size();
                            for (GymSetEntity gymSetEntity : list4) {
                                list3.add(gymSetEntity.getExerciseName());
                                String lowerCase2 = StringsKt.trim((CharSequence) gymSetEntity.getExerciseName()).toString().toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                for (Map.Entry<String, Float> entry2 : MuscleHeatmapRegions.INSTANCE.regionsForGymSet(gymSetEntity.getExerciseName(), map15.get(lowerCase2), str2, map13.get(lowerCase2), map14.get(lowerCase2)).entrySet()) {
                                    String key2 = entry2.getKey();
                                    float coerceAtMost2 = RangesKt.coerceAtMost(entry2.getValue().floatValue() * size, 72.0f);
                                    Float f7 = map7.get(key2);
                                    map7.put(key2, Boxing.boxFloat(Math.max(f7 != null ? f7.floatValue() : 0.0f, coerceAtMost2)));
                                }
                            }
                        } else {
                            Long templateDayId2 = gymSessionEntity3 != null ? gymSessionEntity3.getTemplateDayId() : null;
                            if (templateDayId2 != null) {
                                long longValue = templateDayId2.longValue();
                                recoveryMuscleHeatmap$accumulateGymRecovery$1.L$0 = map15;
                                recoveryMuscleHeatmap$accumulateGymRecovery$1.L$1 = map13;
                                recoveryMuscleHeatmap$accumulateGymRecovery$1.L$2 = map14;
                                recoveryMuscleHeatmap$accumulateGymRecovery$1.L$3 = map7;
                                recoveryMuscleHeatmap$accumulateGymRecovery$1.L$4 = list3;
                                recoveryMuscleHeatmap$accumulateGymRecovery$1.L$5 = str2;
                                recoveryMuscleHeatmap$accumulateGymRecovery$1.L$6 = null;
                                recoveryMuscleHeatmap$accumulateGymRecovery$1.L$7 = null;
                                recoveryMuscleHeatmap$accumulateGymRecovery$1.F$0 = f5;
                                recoveryMuscleHeatmap$accumulateGymRecovery$1.label = 4;
                                obj2 = repository3.exercisesForDay(longValue, recoveryMuscleHeatmap$accumulateGymRecovery$1);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str3 = str2;
                                map16 = map7;
                                list5 = list3;
                                map17 = map15;
                                map18 = map14;
                                map19 = map13;
                                float coerceAtLeast2 = f5 / RangesKt.coerceAtLeast(r1.size(), 1);
                                while (r1.hasNext()) {
                                }
                            } else {
                                for (Map.Entry<String, Float> entry3 : MuscleHeatmapRegions.INSTANCE.splitsForUserTag("Other", str2).entrySet()) {
                                    String key3 = entry3.getKey();
                                    float coerceAtMost3 = RangesKt.coerceAtMost(entry3.getValue().floatValue() * f5, 72.0f);
                                    Float f8 = map7.get(key3);
                                    map7.put(key3, Boxing.boxFloat(Math.max(f8 != null ? f8.floatValue() : 0.0f, coerceAtMost3)));
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    float f9 = recoveryMuscleHeatmap$accumulateGymRecovery$1.F$0;
                    function12 = (Function1) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$7;
                    list2 = (List) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$6;
                    map7 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$5;
                    Map<String, String> map21 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$4;
                    Map<String, String> map22 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$3;
                    map8 = (Map) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$2;
                    repository2 = (Repository) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$1;
                    recoveryEventEntity2 = (RecoveryEventEntity) recoveryMuscleHeatmap$accumulateGymRecovery$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    f2 = f9;
                    map6 = map21;
                    map5 = map22;
                }
                gymSessionEntity = (GymSessionEntity) obj2;
                if (gymSessionEntity != null || (templateDayId = gymSessionEntity.getTemplateDayId()) == null) {
                    f3 = f2;
                    list3 = list2;
                    repository3 = repository2;
                    str = null;
                    function12.invoke(str);
                    long sourceId22 = recoveryEventEntity2.getSourceId();
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$0 = repository3;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$1 = map8;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$2 = map5;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$3 = map6;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$4 = map7;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$5 = list3;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$6 = gymSessionEntity;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$7 = str;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$8 = null;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.F$0 = f3;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.label = 3;
                    obj = repository3.setsForSession(sourceId22, recoveryMuscleHeatmap$accumulateGymRecovery$1);
                    if (obj != coroutine_suspended) {
                    }
                } else {
                    float f10 = f2;
                    long longValue2 = templateDayId.longValue();
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$0 = recoveryEventEntity2;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$1 = repository2;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$2 = map8;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$3 = map5;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$4 = map6;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$5 = map7;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$6 = list2;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$7 = function12;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$8 = gymSessionEntity;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.F$0 = f10;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.label = 2;
                    Object dayNameForTemplate = repository2.dayNameForTemplate(longValue2, recoveryMuscleHeatmap$accumulateGymRecovery$1);
                    if (dayNameForTemplate == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Function1<? super String, Unit> function14 = function12;
                    gymSessionEntity2 = gymSessionEntity;
                    f4 = f10;
                    obj2 = dayNameForTemplate;
                    list3 = list2;
                    function13 = function14;
                    Map<String, String> map23 = map5;
                    map9 = map7;
                    recoveryEventEntity3 = recoveryEventEntity2;
                    map10 = map8;
                    map11 = map6;
                    repository4 = repository2;
                    map12 = map23;
                    str = (String) obj2;
                    f3 = f4;
                    gymSessionEntity = gymSessionEntity2;
                    function12 = function13;
                    repository3 = repository4;
                    map6 = map11;
                    map8 = map10;
                    recoveryEventEntity2 = recoveryEventEntity3;
                    map7 = map9;
                    map5 = map12;
                    function12.invoke(str);
                    long sourceId222 = recoveryEventEntity2.getSourceId();
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$0 = repository3;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$1 = map8;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$2 = map5;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$3 = map6;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$4 = map7;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$5 = list3;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$6 = gymSessionEntity;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$7 = str;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.L$8 = null;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.F$0 = f3;
                    recoveryMuscleHeatmap$accumulateGymRecovery$1.label = 3;
                    obj = repository3.setsForSession(sourceId222, recoveryMuscleHeatmap$accumulateGymRecovery$1);
                    if (obj != coroutine_suspended) {
                    }
                }
            }
        }
        recoveryMuscleHeatmap$accumulateGymRecovery$1 = new RecoveryMuscleHeatmap$accumulateGymRecovery$1(this, continuation);
        Object obj22 = recoveryMuscleHeatmap$accumulateGymRecovery$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = recoveryMuscleHeatmap$accumulateGymRecovery$1.label;
        if (i != 0) {
        }
        gymSessionEntity = (GymSessionEntity) obj22;
        if (gymSessionEntity != null) {
        }
        f3 = f2;
        list3 = list2;
        repository3 = repository2;
        str = null;
        function12.invoke(str);
        long sourceId2222 = recoveryEventEntity2.getSourceId();
        recoveryMuscleHeatmap$accumulateGymRecovery$1.L$0 = repository3;
        recoveryMuscleHeatmap$accumulateGymRecovery$1.L$1 = map8;
        recoveryMuscleHeatmap$accumulateGymRecovery$1.L$2 = map5;
        recoveryMuscleHeatmap$accumulateGymRecovery$1.L$3 = map6;
        recoveryMuscleHeatmap$accumulateGymRecovery$1.L$4 = map7;
        recoveryMuscleHeatmap$accumulateGymRecovery$1.L$5 = list3;
        recoveryMuscleHeatmap$accumulateGymRecovery$1.L$6 = gymSessionEntity;
        recoveryMuscleHeatmap$accumulateGymRecovery$1.L$7 = str;
        recoveryMuscleHeatmap$accumulateGymRecovery$1.L$8 = null;
        recoveryMuscleHeatmap$accumulateGymRecovery$1.F$0 = f3;
        recoveryMuscleHeatmap$accumulateGymRecovery$1.label = 3;
        obj = repository3.setsForSession(sourceId2222, recoveryMuscleHeatmap$accumulateGymRecovery$1);
        if (obj != coroutine_suspended) {
        }
    }

    private final void distributeHours(float hours, Map<String, Float> splits, Map<String, Float> regions) {
        for (Map.Entry<String, Float> entry : splits.entrySet()) {
            String key = entry.getKey();
            float floatValue = entry.getValue().floatValue();
            Float f = regions.get(key);
            regions.put(key, Float.valueOf((f != null ? f.floatValue() : 0.0f) + (floatValue * hours)));
        }
    }
}
