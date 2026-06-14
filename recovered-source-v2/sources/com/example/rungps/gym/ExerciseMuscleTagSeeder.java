package com.example.rungps.gym;

import com.example.rungps.analytics.ExerciseMuscleShares;
import com.example.rungps.data.ExerciseMuscleTagEntity;
import com.example.rungps.data.ExerciseNameNormalizer;
import com.example.rungps.data.Repository;
import com.example.rungps.recovery.MuscleHeatmapRegions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ExerciseMuscleTagSeeder.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bJ*\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/gym/ExerciseMuscleTagSeeder;", "", "<init>", "()V", "regionToTagLabel", "", "", "repairMisclassifiedLegCurlTags", "", "repo", "Lcom/example/rungps/data/Repository;", "(Lcom/example/rungps/data/Repository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backfillAllExercises", "tagEntityFor", "Lcom/example/rungps/data/ExerciseMuscleTagEntity;", "displayName", "primary", "secondary", "tertiary", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseMuscleTagSeeder {
    public static final ExerciseMuscleTagSeeder INSTANCE = new ExerciseMuscleTagSeeder();
    private static final Map<String, String> regionToTagLabel = MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.CHEST, "Chest"), TuplesKt.to(MuscleHeatmapRegions.BACK, "Back"), TuplesKt.to(MuscleHeatmapRegions.LATS, "Back"), TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, "Back"), TuplesKt.to(MuscleHeatmapRegions.TRAPS, "Back"), TuplesKt.to(MuscleHeatmapRegions.SHOULDERS, "Shoulders"), TuplesKt.to(MuscleHeatmapRegions.BICEPS, "Arms"), TuplesKt.to(MuscleHeatmapRegions.TRICEPS, "Arms"), TuplesKt.to(MuscleHeatmapRegions.FOREARMS, "Forearms"), TuplesKt.to(MuscleHeatmapRegions.QUADS, "Legs"), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, "Legs"), TuplesKt.to(MuscleHeatmapRegions.GLUTES, "Glutes"), TuplesKt.to(MuscleHeatmapRegions.CALVES, "Calves"), TuplesKt.to(MuscleHeatmapRegions.CORE, "Core"), TuplesKt.to(MuscleHeatmapRegions.HIP_FLEXORS, "Hip flexors"), TuplesKt.to(MuscleHeatmapRegions.ABDUCTORS, "Glutes"), TuplesKt.to(MuscleHeatmapRegions.ADDUCTORS, "Legs"), TuplesKt.to(MuscleHeatmapRegions.ARMS, "Arms"), TuplesKt.to(MuscleHeatmapRegions.LEGS, "Legs"));
    public static final int $stable = 8;

    private ExerciseMuscleTagSeeder() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0099 -> B:12:0x017a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a5 -> B:12:0x017a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c3 -> B:12:0x017a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0176 -> B:11:0x0179). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object repairMisclassifiedLegCurlTags(Repository repository, Continuation<? super Integer> continuation) {
        ExerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1 exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1;
        int i;
        Object obj;
        int i2;
        Iterator it;
        Repository repository2;
        int i3;
        String str;
        String str2;
        Repository repository3 = repository;
        if (continuation instanceof ExerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1) {
            exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1 = (ExerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1) continuation;
            if ((exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.label & Integer.MIN_VALUE) != 0) {
                exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.label -= Integer.MIN_VALUE;
                Object obj2 = exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.label;
                int i4 = 0;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.L$0 = repository3;
                    exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.I$0 = 0;
                    exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.label = 1;
                    Object allExerciseMuscleTags = repository3.allExerciseMuscleTags(exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1);
                    if (allExerciseMuscleTags == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = allExerciseMuscleTags;
                    i2 = 0;
                } else if (i == 1) {
                    int i5 = exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.I$0;
                    Repository repository4 = (Repository) exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    i2 = i5;
                    repository3 = repository4;
                    obj = obj2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.I$0;
                    it = (Iterator) exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.L$1;
                    Repository repository5 = (Repository) exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    repository2 = repository5;
                    i3++;
                    i4 = 0;
                    if (!it.hasNext()) {
                        ExerciseMuscleTagEntity exerciseMuscleTagEntity = (ExerciseMuscleTagEntity) it.next();
                        String displayName = exerciseMuscleTagEntity.getDisplayName();
                        if (StringsKt.isBlank(displayName)) {
                            displayName = exerciseMuscleTagEntity.getExerciseNameLower();
                        }
                        String str3 = displayName;
                        if (MuscleHeatmapRegions.INSTANCE.isLegHamstringCurl(str3) && MuscleHeatmapRegions.INSTANCE.tagConflictsWithLegCurl(exerciseMuscleTagEntity.getMuscleGroup())) {
                            List sortedWith = CollectionsKt.sortedWith(ExerciseMuscleShares.INSTANCE.sharesForExercise(str3, null).entrySet(), new Comparator() { // from class: com.example.rungps.gym.ExerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$$inlined$sortedByDescending$1
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return ComparisonsKt.compareValues((Float) ((Map.Entry) t2).getValue(), (Float) ((Map.Entry) t).getValue());
                                }
                            });
                            if (!sortedWith.isEmpty()) {
                                Map<String, String> map = regionToTagLabel;
                                String str4 = map.get(((Map.Entry) sortedWith.get(i4)).getKey());
                                if (str4 == null) {
                                    str4 = (String) ((Map.Entry) sortedWith.get(i4)).getKey();
                                    if (str4.length() > 0) {
                                        StringBuilder sb = new StringBuilder();
                                        String valueOf = String.valueOf(str4.charAt(i4));
                                        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                                        String upperCase = valueOf.toUpperCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                        StringBuilder append = sb.append((Object) upperCase);
                                        String substring = str4.substring(1);
                                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                        str4 = append.append(substring).toString();
                                    }
                                }
                                Map.Entry entry = (Map.Entry) CollectionsKt.getOrNull(sortedWith, 1);
                                if (entry == null) {
                                    str = null;
                                } else {
                                    str = map.get(entry.getKey());
                                    if (str == null) {
                                        str = (String) entry.getKey();
                                    }
                                }
                                Map.Entry entry2 = (Map.Entry) CollectionsKt.getOrNull(sortedWith, 2);
                                if (entry2 == null) {
                                    str2 = null;
                                } else {
                                    String str5 = map.get(entry2.getKey());
                                    if (str5 == null) {
                                        str5 = (String) entry2.getKey();
                                    }
                                    str2 = str5;
                                }
                                boolean isUnilateral = exerciseMuscleTagEntity.isUnilateral();
                                exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.L$0 = repository2;
                                exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.L$1 = it;
                                exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.I$0 = i3;
                                exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.label = 2;
                                if (repository2.setExerciseMuscleGroups(str3, str4, str, str2, isUnilateral, exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i3++;
                            }
                        }
                        i4 = 0;
                        if (!it.hasNext()) {
                            return Boxing.boxInt(i3);
                        }
                    }
                }
                it = ((List) obj).iterator();
                int i6 = i2;
                repository2 = repository3;
                i3 = i6;
                if (!it.hasNext()) {
                }
            }
        }
        exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1 = new ExerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1(this, continuation);
        Object obj22 = exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = exerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1.label;
        int i42 = 0;
        if (i != 0) {
        }
        it = ((List) obj).iterator();
        int i62 = i2;
        repository2 = repository3;
        i3 = i62;
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01cd -> B:13:0x01d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object backfillAllExercises(Repository repository, Continuation<? super Integer> continuation) {
        ExerciseMuscleTagSeeder$backfillAllExercises$1 exerciseMuscleTagSeeder$backfillAllExercises$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        Repository repository2;
        Repository repository3;
        int i2;
        Set set;
        Repository repository4;
        Set set2;
        Iterator it;
        String str;
        String str2;
        Object exerciseMuscleGroups;
        if (continuation instanceof ExerciseMuscleTagSeeder$backfillAllExercises$1) {
            exerciseMuscleTagSeeder$backfillAllExercises$1 = (ExerciseMuscleTagSeeder$backfillAllExercises$1) continuation;
            if ((exerciseMuscleTagSeeder$backfillAllExercises$1.label & Integer.MIN_VALUE) != 0) {
                exerciseMuscleTagSeeder$backfillAllExercises$1.label -= Integer.MIN_VALUE;
                obj = exerciseMuscleTagSeeder$backfillAllExercises$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = exerciseMuscleTagSeeder$backfillAllExercises$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    exerciseMuscleTagSeeder$backfillAllExercises$1.L$0 = repository;
                    exerciseMuscleTagSeeder$backfillAllExercises$1.label = 1;
                    obj = repairMisclassifiedLegCurlTags(repository, exerciseMuscleTagSeeder$backfillAllExercises$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    repository2 = repository;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            i2 = exerciseMuscleTagSeeder$backfillAllExercises$1.I$0;
                            Repository repository5 = (Repository) exerciseMuscleTagSeeder$backfillAllExercises$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            repository3 = repository5;
                            set = CollectionsKt.toSet(((Map) obj).keySet());
                            exerciseMuscleTagSeeder$backfillAllExercises$1.L$0 = repository3;
                            exerciseMuscleTagSeeder$backfillAllExercises$1.L$1 = set;
                            exerciseMuscleTagSeeder$backfillAllExercises$1.I$0 = i2;
                            exerciseMuscleTagSeeder$backfillAllExercises$1.label = 3;
                            obj = repository3.distinctExerciseCatalog(exerciseMuscleTagSeeder$backfillAllExercises$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            repository4 = repository3;
                            set2 = set;
                            it = ((List) obj).iterator();
                            while (it.hasNext()) {
                            }
                            return Boxing.boxInt(i2);
                        }
                        if (i == 3) {
                            i2 = exerciseMuscleTagSeeder$backfillAllExercises$1.I$0;
                            set = (Set) exerciseMuscleTagSeeder$backfillAllExercises$1.L$1;
                            repository3 = (Repository) exerciseMuscleTagSeeder$backfillAllExercises$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            repository4 = repository3;
                            set2 = set;
                            it = ((List) obj).iterator();
                            while (it.hasNext()) {
                            }
                            return Boxing.boxInt(i2);
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = exerciseMuscleTagSeeder$backfillAllExercises$1.I$0;
                        it = (Iterator) exerciseMuscleTagSeeder$backfillAllExercises$1.L$2;
                        set2 = (Set) exerciseMuscleTagSeeder$backfillAllExercises$1.L$1;
                        repository4 = (Repository) exerciseMuscleTagSeeder$backfillAllExercises$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        i2++;
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            String lowerCase = StringsKt.trim((CharSequence) str3).toString().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (lowerCase.length() != 0 && !set2.contains(lowerCase) && !set2.contains(ExerciseNameNormalizer.INSTANCE.canonicalKey(str3))) {
                                List sortedWith = CollectionsKt.sortedWith(ExerciseMuscleShares.INSTANCE.sharesForExercise(str3, null).entrySet(), new Comparator() { // from class: com.example.rungps.gym.ExerciseMuscleTagSeeder$backfillAllExercises$$inlined$sortedByDescending$1
                                    @Override // java.util.Comparator
                                    public final int compare(T t, T t2) {
                                        return ComparisonsKt.compareValues((Float) ((Map.Entry) t2).getValue(), (Float) ((Map.Entry) t).getValue());
                                    }
                                });
                                if (!sortedWith.isEmpty()) {
                                    Map<String, String> map = regionToTagLabel;
                                    String str4 = map.get(((Map.Entry) sortedWith.get(0)).getKey());
                                    if (str4 == null) {
                                        str4 = (String) ((Map.Entry) sortedWith.get(0)).getKey();
                                        if (str4.length() > 0) {
                                            StringBuilder sb = new StringBuilder();
                                            String valueOf = String.valueOf(str4.charAt(0));
                                            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                                            String upperCase = valueOf.toUpperCase(Locale.ROOT);
                                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                            StringBuilder append = sb.append((Object) upperCase);
                                            String substring = str4.substring(1);
                                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                            str4 = append.append(substring).toString();
                                        }
                                    }
                                    Map.Entry entry = (Map.Entry) CollectionsKt.getOrNull(sortedWith, 1);
                                    if (entry == null) {
                                        str = null;
                                    } else {
                                        str = map.get(entry.getKey());
                                        if (str == null) {
                                            str = (String) entry.getKey();
                                        }
                                    }
                                    Map.Entry entry2 = (Map.Entry) CollectionsKt.getOrNull(sortedWith, 2);
                                    if (entry2 == null) {
                                        str2 = null;
                                    } else {
                                        String str5 = map.get(entry2.getKey());
                                        if (str5 == null) {
                                            str5 = (String) entry2.getKey();
                                        }
                                        str2 = str5;
                                    }
                                    exerciseMuscleTagSeeder$backfillAllExercises$1.L$0 = repository4;
                                    exerciseMuscleTagSeeder$backfillAllExercises$1.L$1 = set2;
                                    exerciseMuscleTagSeeder$backfillAllExercises$1.L$2 = it;
                                    exerciseMuscleTagSeeder$backfillAllExercises$1.I$0 = i2;
                                    exerciseMuscleTagSeeder$backfillAllExercises$1.label = 4;
                                    exerciseMuscleGroups = repository4.setExerciseMuscleGroups(str3, str4, (r16 & 4) != 0 ? null : str, (r16 & 8) != 0 ? null : str2, (r16 & 16) != 0 ? false : false, exerciseMuscleTagSeeder$backfillAllExercises$1);
                                    if (exerciseMuscleGroups == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    i2++;
                                    while (it.hasNext()) {
                                    }
                                }
                            }
                        }
                        return Boxing.boxInt(i2);
                    }
                    repository2 = (Repository) exerciseMuscleTagSeeder$backfillAllExercises$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                int intValue = ((Number) obj).intValue();
                exerciseMuscleTagSeeder$backfillAllExercises$1.L$0 = repository2;
                exerciseMuscleTagSeeder$backfillAllExercises$1.I$0 = intValue;
                exerciseMuscleTagSeeder$backfillAllExercises$1.label = 2;
                obj = repository2.muscleGroupLookup(exerciseMuscleTagSeeder$backfillAllExercises$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                repository3 = repository2;
                i2 = intValue;
                set = CollectionsKt.toSet(((Map) obj).keySet());
                exerciseMuscleTagSeeder$backfillAllExercises$1.L$0 = repository3;
                exerciseMuscleTagSeeder$backfillAllExercises$1.L$1 = set;
                exerciseMuscleTagSeeder$backfillAllExercises$1.I$0 = i2;
                exerciseMuscleTagSeeder$backfillAllExercises$1.label = 3;
                obj = repository3.distinctExerciseCatalog(exerciseMuscleTagSeeder$backfillAllExercises$1);
                if (obj == coroutine_suspended) {
                }
                repository4 = repository3;
                set2 = set;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return Boxing.boxInt(i2);
            }
        }
        exerciseMuscleTagSeeder$backfillAllExercises$1 = new ExerciseMuscleTagSeeder$backfillAllExercises$1(this, continuation);
        obj = exerciseMuscleTagSeeder$backfillAllExercises$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = exerciseMuscleTagSeeder$backfillAllExercises$1.label;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj).intValue();
        exerciseMuscleTagSeeder$backfillAllExercises$1.L$0 = repository2;
        exerciseMuscleTagSeeder$backfillAllExercises$1.I$0 = intValue2;
        exerciseMuscleTagSeeder$backfillAllExercises$1.label = 2;
        obj = repository2.muscleGroupLookup(exerciseMuscleTagSeeder$backfillAllExercises$1);
        if (obj != coroutine_suspended) {
        }
    }

    public final ExerciseMuscleTagEntity tagEntityFor(String displayName, String primary, String secondary, String tertiary) {
        String obj;
        String obj2;
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(primary, "primary");
        String str = displayName;
        String lowerCase = StringsKt.trim((CharSequence) str).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new ExerciseMuscleTagEntity(0L, lowerCase, StringsKt.trim((CharSequence) str).toString(), StringsKt.trim((CharSequence) primary).toString(), (secondary == null || (obj2 = StringsKt.trim((CharSequence) secondary).toString()) == null || obj2.length() <= 0) ? null : obj2, (tertiary == null || (obj = StringsKt.trim((CharSequence) tertiary).toString()) == null || obj.length() <= 0) ? null : obj, false, null, 193, null);
    }
}
