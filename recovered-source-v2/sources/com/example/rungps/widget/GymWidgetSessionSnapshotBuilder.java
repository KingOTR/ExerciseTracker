package com.example.rungps.widget;

import com.example.rungps.analytics.ProgressiveOverload;
import com.example.rungps.data.ExerciseNameNormalizer;
import com.example.rungps.data.ExercisePr;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.ranges.RangesKt;

/* compiled from: GymWidgetSessionSnapshot.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ.\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/widget/GymWidgetSessionSnapshotBuilder;", "", "<init>", "()V", "build", "Lcom/example/rungps/widget/GymWidgetSessionSnapshot;", "repo", "Lcom/example/rungps/data/Repository;", "session", "Lcom/example/rungps/data/GymSessionEntity;", "(Lcom/example/rungps/data/Repository;Lcom/example/rungps/data/GymSessionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestionFor", "", "exerciseName", "sets", "", "Lcom/example/rungps/data/GymSetEntity;", "(Lcom/example/rungps/data/Repository;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymWidgetSessionSnapshotBuilder {
    public static final int $stable = 0;
    public static final GymWidgetSessionSnapshotBuilder INSTANCE = new GymWidgetSessionSnapshotBuilder();

    private GymWidgetSessionSnapshotBuilder() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x00b2, code lost:
    
        if (r4 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object build(Repository repository, GymSessionEntity gymSessionEntity, Continuation<? super GymWidgetSessionSnapshot> continuation) {
        GymWidgetSessionSnapshotBuilder$build$1 gymWidgetSessionSnapshotBuilder$build$1;
        int i;
        GymSessionEntity gymSessionEntity2;
        Object dayNameForTemplate;
        String str;
        Repository repository2;
        String str2;
        GymSessionEntity gymSessionEntity3;
        Long templateDayId;
        String str3;
        List<GymSetEntity> list;
        List list2;
        Repository repository3;
        Object obj;
        int coerceAtLeast;
        String name;
        String str4;
        String name2;
        String str5;
        String str6;
        int i2;
        int i3;
        boolean z;
        int i4;
        String str7;
        int i5;
        int coerceAtLeast2;
        String str8;
        String str9;
        int i6;
        Repository repository4 = repository;
        if (continuation instanceof GymWidgetSessionSnapshotBuilder$build$1) {
            gymWidgetSessionSnapshotBuilder$build$1 = (GymWidgetSessionSnapshotBuilder$build$1) continuation;
            if ((gymWidgetSessionSnapshotBuilder$build$1.label & Integer.MIN_VALUE) != 0) {
                gymWidgetSessionSnapshotBuilder$build$1.label -= Integer.MIN_VALUE;
                Object obj2 = gymWidgetSessionSnapshotBuilder$build$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gymWidgetSessionSnapshotBuilder$build$1.label;
                String str10 = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Long templateDayId2 = gymSessionEntity.getTemplateDayId();
                    if (templateDayId2 != null) {
                        long longValue = templateDayId2.longValue();
                        gymWidgetSessionSnapshotBuilder$build$1.L$0 = repository4;
                        gymSessionEntity2 = gymSessionEntity;
                        gymWidgetSessionSnapshotBuilder$build$1.L$1 = gymSessionEntity2;
                        gymWidgetSessionSnapshotBuilder$build$1.label = 1;
                        dayNameForTemplate = repository4.dayNameForTemplate(longValue, gymWidgetSessionSnapshotBuilder$build$1);
                        if (dayNameForTemplate == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        gymSessionEntity2 = gymSessionEntity;
                        str = gymSessionEntity2.getFreeDay() ? "Free session" : "Gym session";
                        long id = gymSessionEntity2.getId();
                        gymWidgetSessionSnapshotBuilder$build$1.L$0 = repository4;
                        gymWidgetSessionSnapshotBuilder$build$1.L$1 = gymSessionEntity2;
                        gymWidgetSessionSnapshotBuilder$build$1.L$2 = str;
                        gymWidgetSessionSnapshotBuilder$build$1.label = 2;
                        Object obj3 = repository4.setsForSession(id, gymWidgetSessionSnapshotBuilder$build$1);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        repository2 = repository4;
                        str2 = str;
                        gymSessionEntity3 = gymSessionEntity2;
                        obj2 = obj3;
                        List<GymSetEntity> list3 = (List) obj2;
                        templateDayId = gymSessionEntity3.getTemplateDayId();
                        if (templateDayId == null) {
                        }
                    }
                } else if (i == 1) {
                    GymSessionEntity gymSessionEntity4 = (GymSessionEntity) gymWidgetSessionSnapshotBuilder$build$1.L$1;
                    Repository repository5 = (Repository) gymWidgetSessionSnapshotBuilder$build$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    gymSessionEntity2 = gymSessionEntity4;
                    repository4 = repository5;
                    dayNameForTemplate = obj2;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                i6 = gymWidgetSessionSnapshotBuilder$build$1.I$0;
                                str9 = (String) gymWidgetSessionSnapshotBuilder$build$1.L$1;
                                str8 = (String) gymWidgetSessionSnapshotBuilder$build$1.L$0;
                                ResultKt.throwOnFailure(obj2);
                                str10 = (String) obj2;
                                coerceAtLeast2 = i6;
                                str3 = str8;
                                str7 = str9;
                                return new GymWidgetSessionSnapshot(str3, str7, coerceAtLeast2, str10);
                            }
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i2 = gymWidgetSessionSnapshotBuilder$build$1.I$0;
                            str6 = (String) gymWidgetSessionSnapshotBuilder$build$1.L$1;
                            str5 = (String) gymWidgetSessionSnapshotBuilder$build$1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            str4 = (String) obj2;
                            coerceAtLeast = i2;
                            str3 = str5;
                            name = str6;
                            return new GymWidgetSessionSnapshot(str3, name, coerceAtLeast, str4);
                        }
                        list = (List) gymWidgetSessionSnapshotBuilder$build$1.L$2;
                        str3 = (String) gymWidgetSessionSnapshotBuilder$build$1.L$1;
                        repository3 = (Repository) gymWidgetSessionSnapshotBuilder$build$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        list2 = (List) obj2;
                        repository2 = repository3;
                        if (list2 == null) {
                            list2 = CollectionsKt.emptyList();
                        }
                        if (list2.isEmpty()) {
                            List<GymSetEntity> list4 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                            Iterator<T> it = list4.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((GymSetEntity) it.next()).getExerciseName());
                            }
                            str7 = (String) CollectionsKt.lastOrNull(CollectionsKt.distinct(arrayList));
                            if ((list4 instanceof Collection) && list4.isEmpty()) {
                                i5 = 0;
                            } else {
                                i5 = 0;
                                for (GymSetEntity gymSetEntity : list4) {
                                    Integer reps = gymSetEntity.getReps();
                                    if (((reps != null ? reps.intValue() : 0) > 0 && gymSetEntity.getWeightKg() > 0.0d) && (i5 = i5 + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                            coerceAtLeast2 = RangesKt.coerceAtLeast(list.size() - i5, 0);
                            if (str7 != null) {
                                GymWidgetSessionSnapshotBuilder gymWidgetSessionSnapshotBuilder = INSTANCE;
                                gymWidgetSessionSnapshotBuilder$build$1.L$0 = str3;
                                gymWidgetSessionSnapshotBuilder$build$1.L$1 = str7;
                                gymWidgetSessionSnapshotBuilder$build$1.L$2 = null;
                                gymWidgetSessionSnapshotBuilder$build$1.I$0 = coerceAtLeast2;
                                gymWidgetSessionSnapshotBuilder$build$1.label = 4;
                                Object suggestionFor = gymWidgetSessionSnapshotBuilder.suggestionFor(repository2, str7, list, gymWidgetSessionSnapshotBuilder$build$1);
                                if (suggestionFor == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str8 = str3;
                                str9 = str7;
                                obj2 = suggestionFor;
                                i6 = coerceAtLeast2;
                                str10 = (String) obj2;
                                coerceAtLeast2 = i6;
                                str3 = str8;
                                str7 = str9;
                            }
                            return new GymWidgetSessionSnapshot(str3, str7, coerceAtLeast2, str10);
                        }
                        List<ExerciseTemplateEntity> list5 = list2;
                        Iterator it2 = list5.iterator();
                        int i7 = 0;
                        while (it2.hasNext()) {
                            i7 += RangesKt.coerceIn(((ExerciseTemplateEntity) it2.next()).getDefaultSets(), 1, 10);
                        }
                        int i8 = 0;
                        for (ExerciseTemplateEntity exerciseTemplateEntity : list5) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : list) {
                                if (ExerciseNameNormalizer.INSTANCE.matches(((GymSetEntity) obj4).getExerciseName(), exerciseTemplateEntity.getName())) {
                                    arrayList2.add(obj4);
                                }
                            }
                            ArrayList<GymSetEntity> arrayList3 = arrayList2;
                            if ((arrayList3 instanceof Collection) && arrayList3.isEmpty()) {
                                i4 = 0;
                            } else {
                                i4 = 0;
                                for (GymSetEntity gymSetEntity2 : arrayList3) {
                                    Integer reps2 = gymSetEntity2.getReps();
                                    if (((reps2 != null ? reps2.intValue() : 0) > 0 && gymSetEntity2.getWeightKg() > 0.0d) && (i4 = i4 + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                            i8 += i4;
                        }
                        Iterator it3 = list5.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            ExerciseTemplateEntity exerciseTemplateEntity2 = (ExerciseTemplateEntity) obj;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : list) {
                                if (ExerciseNameNormalizer.INSTANCE.matches(((GymSetEntity) obj5).getExerciseName(), exerciseTemplateEntity2.getName())) {
                                    arrayList4.add(obj5);
                                }
                            }
                            int coerceIn = RangesKt.coerceIn(exerciseTemplateEntity2.getDefaultSets(), 1, 10);
                            ArrayList<GymSetEntity> arrayList5 = arrayList4;
                            if ((arrayList5 instanceof Collection) && arrayList5.isEmpty()) {
                                i3 = 0;
                            } else {
                                i3 = 0;
                                for (GymSetEntity gymSetEntity3 : arrayList5) {
                                    Integer reps3 = gymSetEntity3.getReps();
                                    if ((reps3 != null ? reps3.intValue() : 0) > 0 && gymSetEntity3.getWeightKg() > 0.0d) {
                                        z = true;
                                        if (z && (i3 = i3 + 1) < 0) {
                                            CollectionsKt.throwCountOverflow();
                                        }
                                    }
                                    z = false;
                                    if (z) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                            if (i3 < coerceIn) {
                                break;
                            }
                        }
                        ExerciseTemplateEntity exerciseTemplateEntity3 = (ExerciseTemplateEntity) obj;
                        coerceAtLeast = RangesKt.coerceAtLeast(i7 - i8, 0);
                        name = exerciseTemplateEntity3 != null ? exerciseTemplateEntity3.getName() : null;
                        if (exerciseTemplateEntity3 == null || (name2 = exerciseTemplateEntity3.getName()) == null) {
                            str4 = null;
                            return new GymWidgetSessionSnapshot(str3, name, coerceAtLeast, str4);
                        }
                        GymWidgetSessionSnapshotBuilder gymWidgetSessionSnapshotBuilder2 = INSTANCE;
                        gymWidgetSessionSnapshotBuilder$build$1.L$0 = str3;
                        gymWidgetSessionSnapshotBuilder$build$1.L$1 = name;
                        gymWidgetSessionSnapshotBuilder$build$1.L$2 = null;
                        gymWidgetSessionSnapshotBuilder$build$1.I$0 = coerceAtLeast;
                        gymWidgetSessionSnapshotBuilder$build$1.label = 5;
                        Object suggestionFor2 = gymWidgetSessionSnapshotBuilder2.suggestionFor(repository2, name2, list, gymWidgetSessionSnapshotBuilder$build$1);
                        if (suggestionFor2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str5 = str3;
                        str6 = name;
                        obj2 = suggestionFor2;
                        i2 = coerceAtLeast;
                        str4 = (String) obj2;
                        coerceAtLeast = i2;
                        str3 = str5;
                        name = str6;
                        return new GymWidgetSessionSnapshot(str3, name, coerceAtLeast, str4);
                    }
                    str2 = (String) gymWidgetSessionSnapshotBuilder$build$1.L$2;
                    gymSessionEntity3 = (GymSessionEntity) gymWidgetSessionSnapshotBuilder$build$1.L$1;
                    repository2 = (Repository) gymWidgetSessionSnapshotBuilder$build$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    List<GymSetEntity> list32 = (List) obj2;
                    templateDayId = gymSessionEntity3.getTemplateDayId();
                    if (templateDayId == null) {
                        long longValue2 = templateDayId.longValue();
                        gymWidgetSessionSnapshotBuilder$build$1.L$0 = repository2;
                        gymWidgetSessionSnapshotBuilder$build$1.L$1 = str2;
                        gymWidgetSessionSnapshotBuilder$build$1.L$2 = list32;
                        gymWidgetSessionSnapshotBuilder$build$1.label = 3;
                        Object exercisesForDay = repository2.exercisesForDay(longValue2, gymWidgetSessionSnapshotBuilder$build$1);
                        if (exercisesForDay == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        repository3 = repository2;
                        str3 = str2;
                        list = list32;
                        obj2 = exercisesForDay;
                        list2 = (List) obj2;
                        repository2 = repository3;
                        if (list2 == null) {
                        }
                        if (list2.isEmpty()) {
                        }
                    } else {
                        str3 = str2;
                        list = list32;
                        list2 = null;
                        if (list2 == null) {
                        }
                        if (list2.isEmpty()) {
                        }
                    }
                }
                str = (String) dayNameForTemplate;
            }
        }
        gymWidgetSessionSnapshotBuilder$build$1 = new GymWidgetSessionSnapshotBuilder$build$1(this, continuation);
        Object obj22 = gymWidgetSessionSnapshotBuilder$build$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gymWidgetSessionSnapshotBuilder$build$1.label;
        String str102 = null;
        if (i != 0) {
        }
        str = (String) dayNameForTemplate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object suggestionFor(Repository repository, String str, List<GymSetEntity> list, Continuation<? super String> continuation) {
        GymWidgetSessionSnapshotBuilder$suggestionFor$1 gymWidgetSessionSnapshotBuilder$suggestionFor$1;
        int i;
        ExercisePr exercisePr;
        Object next;
        if (continuation instanceof GymWidgetSessionSnapshotBuilder$suggestionFor$1) {
            gymWidgetSessionSnapshotBuilder$suggestionFor$1 = (GymWidgetSessionSnapshotBuilder$suggestionFor$1) continuation;
            if ((gymWidgetSessionSnapshotBuilder$suggestionFor$1.label & Integer.MIN_VALUE) != 0) {
                gymWidgetSessionSnapshotBuilder$suggestionFor$1.label -= Integer.MIN_VALUE;
                Object obj = gymWidgetSessionSnapshotBuilder$suggestionFor$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gymWidgetSessionSnapshotBuilder$suggestionFor$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    gymWidgetSessionSnapshotBuilder$suggestionFor$1.L$0 = str;
                    gymWidgetSessionSnapshotBuilder$suggestionFor$1.L$1 = list;
                    gymWidgetSessionSnapshotBuilder$suggestionFor$1.label = 1;
                    obj = repository.prForExercise(str, gymWidgetSessionSnapshotBuilder$suggestionFor$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) gymWidgetSessionSnapshotBuilder$suggestionFor$1.L$1;
                    str = (String) gymWidgetSessionSnapshotBuilder$suggestionFor$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                exercisePr = (ExercisePr) obj;
                if (exercisePr != null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (ExerciseNameNormalizer.INSTANCE.matches(((GymSetEntity) obj2).getExerciseName(), str)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    GymSetEntity gymSetEntity = (GymSetEntity) obj3;
                    Integer reps = gymSetEntity.getReps();
                    boolean z = false;
                    if ((reps != null ? reps.intValue() : 0) > 0 && gymSetEntity.getWeightKg() > 0.0d) {
                        z = true;
                    }
                    if (z) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int setIndex = ((GymSetEntity) next).getSetIndex();
                        do {
                            Object next2 = it.next();
                            int setIndex2 = ((GymSetEntity) next2).getSetIndex();
                            if (setIndex < setIndex2) {
                                next = next2;
                                setIndex = setIndex2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                ProgressiveOverload.Hint hint = ProgressiveOverload.INSTANCE.hint(exercisePr, (GymSetEntity) next);
                if (hint != null) {
                    return hint.getDetail();
                }
                return null;
            }
        }
        gymWidgetSessionSnapshotBuilder$suggestionFor$1 = new GymWidgetSessionSnapshotBuilder$suggestionFor$1(this, continuation);
        Object obj4 = gymWidgetSessionSnapshotBuilder$suggestionFor$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gymWidgetSessionSnapshotBuilder$suggestionFor$1.label;
        if (i != 0) {
        }
        exercisePr = (ExercisePr) obj4;
        if (exercisePr != null) {
        }
    }
}
