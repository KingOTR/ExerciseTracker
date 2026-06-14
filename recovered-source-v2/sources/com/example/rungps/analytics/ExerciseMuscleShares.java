package com.example.rungps.analytics;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.recovery.MuscleHeatmapRegions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ExerciseMuscleShares.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0007H\u0002J(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tH\u0002R&\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/analytics/ExerciseMuscleShares;", "", "<init>", "()V", "hasCuratedMatch", "", "exerciseName", "", "sharesForExercise", "", "", "muscleTag", "curatedMatch", HintConstants.AUTOFILL_HINT_NAME, "normalizeShares", "shares", "curated", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseMuscleShares {
    public static final int $stable;
    public static final ExerciseMuscleShares INSTANCE = new ExerciseMuscleShares();
    private static final Map<String, Map<String, Float>> curated;

    private ExerciseMuscleShares() {
    }

    public final boolean hasCuratedMatch(String exerciseName) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        String lowerCase = exerciseName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return curatedMatch(StringsKt.trim((CharSequence) lowerCase).toString()) != null;
    }

    public final Map<String, Float> sharesForExercise(String exerciseName, String muscleTag) {
        String str;
        String obj;
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        if (muscleTag == null || (obj = StringsKt.trim((CharSequence) muscleTag).toString()) == null) {
            str = null;
        } else {
            str = obj.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        }
        String str2 = str;
        if (str2 != null && str2.length() != 0 && !Intrinsics.areEqual(str, Vo2MaxRecord.MeasurementMethod.OTHER)) {
            return MuscleHeatmapRegions.splitsForUserTag$default(MuscleHeatmapRegions.INSTANCE, str, null, 2, null);
        }
        String lowerCase = exerciseName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Map<String, Float> curatedMatch = curatedMatch(StringsKt.trim((CharSequence) lowerCase).toString());
        if (curatedMatch != null) {
            return curatedMatch;
        }
        String groupToRegion = MuscleHeatmapRegions.INSTANCE.groupToRegion(exerciseName);
        return groupToRegion != null ? MapsKt.mapOf(TuplesKt.to(groupToRegion, Float.valueOf(1.0f))) : ExerciseMuscleAiClassifier.INSTANCE.sharesForExercise(exerciseName);
    }

    private final Map<String, Float> curatedMatch(String name) {
        Object next;
        Set<Map.Entry<String, Map<String, Float>>> entrySet = curated.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (StringsKt.contains$default((CharSequence) name, (CharSequence) ((Map.Entry) obj).getKey(), false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = ((String) ((Map.Entry) next).getKey()).length();
                do {
                    Object next2 = it.next();
                    int length2 = ((String) ((Map.Entry) next2).getKey()).length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        if (Intrinsics.areEqual(entry.getKey(), "curl")) {
            String str = name;
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "leg", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "hamstring", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "nordic", false, 2, (Object) null)) {
                return MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, Float.valueOf(0.95f)), TuplesKt.to(MuscleHeatmapRegions.CALVES, Float.valueOf(0.05f)));
            }
        }
        return normalizeShares((Map) entry.getValue());
    }

    private final Map<String, Float> normalizeShares(Map<String, Float> shares) {
        float coerceAtLeast = RangesKt.coerceAtLeast(CollectionsKt.sumOfFloat(shares.values()), 0.01f);
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(shares.size()));
        Iterator<T> it = shares.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), Float.valueOf(((Number) entry.getValue()).floatValue() / coerceAtLeast));
        }
        return linkedHashMap;
    }

    static {
        Float valueOf = Float.valueOf(0.15f);
        Pair[] pairArr = {TuplesKt.to(MuscleHeatmapRegions.CHEST, Float.valueOf(0.55f)), TuplesKt.to(MuscleHeatmapRegions.TRICEPS, Float.valueOf(0.3f)), TuplesKt.to(MuscleHeatmapRegions.SHOULDERS, valueOf)};
        Pair[] pairArr2 = {TuplesKt.to(MuscleHeatmapRegions.CHEST, Float.valueOf(0.5f)), TuplesKt.to(MuscleHeatmapRegions.SHOULDERS, Float.valueOf(0.28f)), TuplesKt.to(MuscleHeatmapRegions.TRICEPS, Float.valueOf(0.22f))};
        Float valueOf2 = Float.valueOf(0.08f);
        Float valueOf3 = Float.valueOf(0.14f);
        Pair[] pairArr3 = {TuplesKt.to(MuscleHeatmapRegions.QUADS, Float.valueOf(0.48f)), TuplesKt.to(MuscleHeatmapRegions.GLUTES, Float.valueOf(0.3f)), TuplesKt.to(MuscleHeatmapRegions.CORE, valueOf2), TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, valueOf3)};
        Float valueOf4 = Float.valueOf(0.1f);
        Pair[] pairArr4 = {TuplesKt.to(MuscleHeatmapRegions.QUADS, Float.valueOf(0.52f)), TuplesKt.to(MuscleHeatmapRegions.GLUTES, Float.valueOf(0.24f)), TuplesKt.to(MuscleHeatmapRegions.CORE, valueOf3), TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, valueOf4)};
        Pair[] pairArr5 = {TuplesKt.to(MuscleHeatmapRegions.QUADS, Float.valueOf(0.48f)), TuplesKt.to(MuscleHeatmapRegions.GLUTES, Float.valueOf(0.3f)), TuplesKt.to(MuscleHeatmapRegions.CORE, valueOf2), TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, valueOf3)};
        Float valueOf5 = Float.valueOf(0.35f);
        Pair[] pairArr6 = {TuplesKt.to(MuscleHeatmapRegions.QUADS, Float.valueOf(0.55f)), TuplesKt.to(MuscleHeatmapRegions.GLUTES, valueOf5), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, valueOf4)};
        Float valueOf6 = Float.valueOf(0.12f);
        Pair[] pairArr7 = {TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS_MEDIAL, valueOf), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS_LATERAL, Float.valueOf(0.13f)), TuplesKt.to(MuscleHeatmapRegions.GLUTES, Float.valueOf(0.26f)), TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, Float.valueOf(0.24f)), TuplesKt.to(MuscleHeatmapRegions.LATS, valueOf6), TuplesKt.to(MuscleHeatmapRegions.TRAPS_UPPER, Float.valueOf(0.06f)), TuplesKt.to(MuscleHeatmapRegions.TRAPS_MID, Float.valueOf(0.04f))};
        Float valueOf7 = Float.valueOf(0.2f);
        curated = MapsKt.mapOf(TuplesKt.to("bench press", MapsKt.mapOf(pairArr)), TuplesKt.to("incline bench", MapsKt.mapOf(pairArr2)), TuplesKt.to("back squat", MapsKt.mapOf(pairArr3)), TuplesKt.to("front squat", MapsKt.mapOf(pairArr4)), TuplesKt.to("squat", MapsKt.mapOf(pairArr5)), TuplesKt.to("leg press", MapsKt.mapOf(pairArr6)), TuplesKt.to("deadlift", MapsKt.mapOf(pairArr7)), TuplesKt.to("romanian", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS_MEDIAL, Float.valueOf(0.24f)), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS_LATERAL, Float.valueOf(0.21f)), TuplesKt.to(MuscleHeatmapRegions.GLUTES, valueOf5), TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, valueOf7))), TuplesKt.to("rdl", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS_MEDIAL, Float.valueOf(0.24f)), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS_LATERAL, Float.valueOf(0.21f)), TuplesKt.to(MuscleHeatmapRegions.GLUTES, valueOf5), TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, valueOf7))), TuplesKt.to("seated leg curl", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, Float.valueOf(0.92f)), TuplesKt.to(MuscleHeatmapRegions.GASTROC, valueOf2))), TuplesKt.to("lying leg curl", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, Float.valueOf(0.92f)), TuplesKt.to(MuscleHeatmapRegions.GASTROC, valueOf2))), TuplesKt.to("leg curl", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, Float.valueOf(0.95f)), TuplesKt.to(MuscleHeatmapRegions.GASTROC, Float.valueOf(0.05f)))), TuplesKt.to("hamstring leg curl", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, Float.valueOf(0.95f)), TuplesKt.to(MuscleHeatmapRegions.GASTROC, Float.valueOf(0.05f)))), TuplesKt.to("hamstring curl", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, Float.valueOf(0.95f)), TuplesKt.to(MuscleHeatmapRegions.GASTROC, Float.valueOf(0.05f)))), TuplesKt.to("nordic curl", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, Float.valueOf(0.88f)), TuplesKt.to(MuscleHeatmapRegions.CORE, valueOf6))), TuplesKt.to("cable hip flex", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HIP_FLEXORS, Float.valueOf(0.78f)), TuplesKt.to(MuscleHeatmapRegions.CORE, valueOf3), TuplesKt.to(MuscleHeatmapRegions.QUADS, valueOf2))), TuplesKt.to("hip flexor", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HIP_FLEXORS, Float.valueOf(0.82f)), TuplesKt.to(MuscleHeatmapRegions.CORE, valueOf6), TuplesKt.to(MuscleHeatmapRegions.QUADS, Float.valueOf(0.06f)))), TuplesKt.to("hip flexion", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HIP_FLEXORS, Float.valueOf(0.8f)), TuplesKt.to(MuscleHeatmapRegions.CORE, valueOf3), TuplesKt.to(MuscleHeatmapRegions.QUADS, Float.valueOf(0.06f)))), TuplesKt.to("hanging leg raise", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HIP_FLEXORS, Float.valueOf(0.45f)), TuplesKt.to(MuscleHeatmapRegions.CORE, Float.valueOf(0.45f)), TuplesKt.to(MuscleHeatmapRegions.QUADS, valueOf4))), TuplesKt.to("leg raise", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.HIP_FLEXORS, Float.valueOf(0.4f)), TuplesKt.to(MuscleHeatmapRegions.CORE, Float.valueOf(0.5f)), TuplesKt.to(MuscleHeatmapRegions.QUADS, valueOf4))), TuplesKt.to("row", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.LATS, Float.valueOf(0.4f)), TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, valueOf7), TuplesKt.to(MuscleHeatmapRegions.BICEPS, Float.valueOf(0.22f)), TuplesKt.to(MuscleHeatmapRegions.TRAPS_MID, valueOf6), TuplesKt.to(MuscleHeatmapRegions.TRAPS_LOWER, Float.valueOf(0.06f)))), TuplesKt.to("pulldown", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.LATS, Float.valueOf(0.5f)), TuplesKt.to(MuscleHeatmapRegions.BICEPS, Float.valueOf(0.28f)), TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, Float.valueOf(0.22f)))), TuplesKt.to("pull-up", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.LATS, Float.valueOf(0.48f)), TuplesKt.to(MuscleHeatmapRegions.BICEPS, Float.valueOf(0.32f)), TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, valueOf7))), TuplesKt.to("overhead press", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.SHOULDERS, Float.valueOf(0.5f)), TuplesKt.to(MuscleHeatmapRegions.TRICEPS, Float.valueOf(0.28f)), TuplesKt.to(MuscleHeatmapRegions.CORE, valueOf6), TuplesKt.to(MuscleHeatmapRegions.TRAPS_UPPER, Float.valueOf(0.07f)), TuplesKt.to(MuscleHeatmapRegions.TRAPS_MID, Float.valueOf(0.03f)))), TuplesKt.to("lateral raise", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.SHOULDERS, Float.valueOf(1.0f)))), TuplesKt.to("wrist curl", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.FOREARM_FLEXORS, Float.valueOf(1.0f)))), TuplesKt.to("reverse wrist", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.FOREARM_EXTENSORS, Float.valueOf(1.0f)))), TuplesKt.to("preacher curl", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.BICEPS, Float.valueOf(0.82f)), TuplesKt.to(MuscleHeatmapRegions.FOREARM_FLEXORS, Float.valueOf(0.18f)))), TuplesKt.to("hammer curl", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.BICEPS, Float.valueOf(0.75f)), TuplesKt.to(MuscleHeatmapRegions.FOREARM_FLEXORS, Float.valueOf(0.25f)))), TuplesKt.to("bicep curl", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.BICEPS, Float.valueOf(0.85f)), TuplesKt.to(MuscleHeatmapRegions.FOREARM_FLEXORS, valueOf))), TuplesKt.to("curl", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.BICEPS, Float.valueOf(0.85f)), TuplesKt.to(MuscleHeatmapRegions.FOREARM_FLEXORS, valueOf))), TuplesKt.to("tricep", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.TRICEPS, Float.valueOf(0.9f)), TuplesKt.to(MuscleHeatmapRegions.SHOULDERS, valueOf4))), TuplesKt.to("skull crush", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.TRICEPS, Float.valueOf(0.88f)), TuplesKt.to(MuscleHeatmapRegions.CORE, valueOf6))), TuplesKt.to("skull crusher", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.TRICEPS, Float.valueOf(0.88f)), TuplesKt.to(MuscleHeatmapRegions.CORE, valueOf6))), TuplesKt.to("shrug", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.TRAPS_UPPER, Float.valueOf(0.72f)), TuplesKt.to(MuscleHeatmapRegions.TRAPS_MID, Float.valueOf(0.18f)), TuplesKt.to(MuscleHeatmapRegions.FOREARMS, valueOf4))), TuplesKt.to("seated calf", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.SOLEUS, Float.valueOf(0.75f)), TuplesKt.to(MuscleHeatmapRegions.GASTROC, Float.valueOf(0.25f)))), TuplesKt.to("calf", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.GASTROC, Float.valueOf(0.6f)), TuplesKt.to(MuscleHeatmapRegions.SOLEUS, Float.valueOf(0.4f)))), TuplesKt.to("lunge", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.QUADS, Float.valueOf(0.4f)), TuplesKt.to(MuscleHeatmapRegions.GLUTES, valueOf5), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, Float.valueOf(0.25f)))), TuplesKt.to("back extension", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, Float.valueOf(0.72f)), TuplesKt.to(MuscleHeatmapRegions.GLUTES, Float.valueOf(0.18f)), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, valueOf4))), TuplesKt.to("hyperextension", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, Float.valueOf(0.7f)), TuplesKt.to(MuscleHeatmapRegions.GLUTES, valueOf7), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, valueOf4))), TuplesKt.to("good morning", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, Float.valueOf(0.42f)), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS_MEDIAL, Float.valueOf(0.18f)), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS_LATERAL, valueOf), TuplesKt.to(MuscleHeatmapRegions.GLUTES, Float.valueOf(0.25f)))), TuplesKt.to("reverse hyper", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, valueOf5), TuplesKt.to(MuscleHeatmapRegions.GLUTES, Float.valueOf(0.45f)), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, valueOf7))), TuplesKt.to("hip thrust", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.GLUTES, Float.valueOf(0.65f)), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, Float.valueOf(0.25f)), TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, valueOf4))), TuplesKt.to("abduct", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.ABDUCTORS, Float.valueOf(0.78f)), TuplesKt.to(MuscleHeatmapRegions.GLUTES, Float.valueOf(0.22f)))), TuplesKt.to("adduct", MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.ADDUCTORS, Float.valueOf(0.82f)), TuplesKt.to(MuscleHeatmapRegions.QUADS, Float.valueOf(0.18f)))));
        $stable = 8;
    }
}
