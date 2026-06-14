package com.example.rungps.recovery;

import androidx.autofill.HintConstants;
import com.example.rungps.data.GymSetEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RecoveryMuscleAdvice.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000bJ\u0016\u0010\f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¨\u0006\u0010"}, d2 = {"Lcom/example/rungps/recovery/RecoveryMuscleAdvice;", "", "<init>", "()V", "gymRecoveryDetail", "", "dayLabel", "sets", "", "Lcom/example/rungps/data/GymSetEntity;", "muscleGroupForExercise", "Lkotlin/Function1;", "inferBodyRegion", "groups", "inferGroupFromName", HintConstants.AUTOFILL_HINT_NAME, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecoveryMuscleAdvice {
    public static final int $stable = 0;
    public static final RecoveryMuscleAdvice INSTANCE = new RecoveryMuscleAdvice();

    private RecoveryMuscleAdvice() {
    }

    public final String gymRecoveryDetail(String dayLabel, List<GymSetEntity> sets, Function1<? super String, String> muscleGroupForExercise) {
        Intrinsics.checkNotNullParameter(sets, "sets");
        Intrinsics.checkNotNullParameter(muscleGroupForExercise, "muscleGroupForExercise");
        if (sets.isEmpty()) {
            Intrinsics.checkNotNullExpressionValue("Upper and lower body need time to repair after this session. Prioritise sleep and easy movement.", "toString(...)");
            return "Upper and lower body need time to repair after this session. Prioritise sleep and easy movement.";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (GymSetEntity gymSetEntity : sets) {
            String invoke = muscleGroupForExercise.invoke(gymSetEntity.getExerciseName());
            if (invoke == null) {
                invoke = inferGroupFromName(gymSetEntity.getExerciseName());
            }
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            Object obj = linkedHashMap2.get(invoke);
            if (obj == null) {
                obj = (List) new ArrayList();
                linkedHashMap2.put(invoke, obj);
            }
            ((List) obj).add(gymSetEntity.getExerciseName());
        }
        Set entrySet = linkedHashMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        List<Map.Entry> take = CollectionsKt.take(CollectionsKt.sortedWith(entrySet, new Comparator() { // from class: com.example.rungps.recovery.RecoveryMuscleAdvice$gymRecoveryDetail$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((List) ((Map.Entry) t2).getValue()).size()), Integer.valueOf(((List) ((Map.Entry) t).getValue()).size()));
            }
        }), 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
        Iterator it = take.iterator();
        while (it.hasNext()) {
            Object key = ((Map.Entry) it.next()).getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            arrayList.add((String) key);
        }
        String inferBodyRegion = inferBodyRegion(arrayList);
        StringBuilder sb = new StringBuilder();
        sb.append(inferBodyRegion + " needs recovery");
        if (dayLabel != null) {
            sb.append(" after " + dayLabel);
        }
        sb.append(". ");
        for (Map.Entry entry : take) {
            Intrinsics.checkNotNull(entry);
            Object key2 = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key2, "component1(...)");
            String str = (String) key2;
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            List list = (List) value;
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ((String) obj2).toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (hashSet.add(lowerCase)) {
                    arrayList2.add(obj2);
                }
            }
            List take2 = CollectionsKt.take(arrayList2, 4);
            sb.append(str);
            sb.append(" (");
            sb.append(CollectionsKt.joinToString$default(take2, ", ", null, null, 0, null, null, 62, null));
            if (list.size() > take2.size()) {
                sb.append(", …");
            }
            sb.append(") — ");
        }
        sb.append("keep the next 24–48h lighter on those muscles.");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final String inferBodyRegion(List<String> groups) {
        boolean z;
        boolean z2 = false;
        Set of = SetsKt.setOf((Object[]) new String[]{"Chest", "Back", "Shoulders", "Arms", "Upper", "Push", "Pull"});
        Set of2 = SetsKt.setOf((Object[]) new String[]{"Legs", "Glutes", "Hamstrings", "Quads", "Calves", "Lower"});
        List<String> list = groups;
        boolean z3 = list instanceof Collection;
        if (!z3 || !list.isEmpty()) {
            loop2: for (String str : list) {
                Set set = of;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (StringsKt.contains((CharSequence) str, (CharSequence) it.next(), true)) {
                            z = true;
                            break loop2;
                        }
                    }
                }
            }
        }
        z = false;
        if (!z3 || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            loop0: while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                Set set2 = of2;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it3 = set2.iterator();
                    while (it3.hasNext()) {
                        if (StringsKt.contains((CharSequence) str2, (CharSequence) it3.next(), true)) {
                            z2 = true;
                            break loop0;
                        }
                    }
                }
            }
        }
        if (z && z2) {
            return "Your body";
        }
        if (z) {
            return "Upper body";
        }
        if (z2) {
            return "Lower body";
        }
        return "Trained muscles";
    }

    private final String inferGroupFromName(String name) {
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = name.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = lowerCase;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "bench", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) MuscleHeatmapRegions.CHEST, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "fly", false, 2, (Object) null) || (StringsKt.contains$default((CharSequence) str, (CharSequence) "press", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str, (CharSequence) "incline", false, 2, (Object) null))) {
            return "Chest";
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "row", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "pulldown", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "pull-up", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "pullup", false, 2, (Object) null)) {
            return "Back";
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "squat", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "leg press", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "lunge", false, 2, (Object) null)) {
            return "Legs";
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "curl", false, 2, (Object) null)) {
            return "Arms";
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "tricep", false, 2, (Object) null) || (StringsKt.contains$default((CharSequence) str, (CharSequence) "extension", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str, (CharSequence) "tri", false, 2, (Object) null))) {
            return "Triceps";
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "shoulder", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "lateral", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "ohp", false, 2, (Object) null)) {
            return "Shoulders";
        }
        return "Other";
    }
}
