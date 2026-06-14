package com.example.rungps.analytics;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SplitProgrammeMusclePreview.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tJD\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\r\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/example/rungps/analytics/SplitProgrammeMusclePreview;", "", "<init>", "()V", "regionWeightsForExercises", "", "", "", "exerciseNames", "", "mergeWithVolume", "volumeByRegion", "programme", "ghostScale", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SplitProgrammeMusclePreview {
    public static final int $stable = 0;
    public static final SplitProgrammeMusclePreview INSTANCE = new SplitProgrammeMusclePreview();

    private SplitProgrammeMusclePreview() {
    }

    public final Map<String, Float> regionWeightsForExercises(List<String> exerciseNames) {
        Intrinsics.checkNotNullParameter(exerciseNames, "exerciseNames");
        if (exerciseNames.isEmpty()) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = CollectionsKt.distinct(exerciseNames).iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, Float> entry : ExerciseMuscleAiClassifier.INSTANCE.sharesForExercise((String) it.next()).entrySet()) {
                String key = entry.getKey();
                float floatValue = entry.getValue().floatValue();
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                Float f = (Float) linkedHashMap.get(key);
                linkedHashMap2.put(key, Float.valueOf((f != null ? f.floatValue() : 0.0f) + floatValue));
            }
        }
        Collection values = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Float maxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) values);
        float coerceAtLeast = maxOrNull != null ? RangesKt.coerceAtLeast(maxOrNull.floatValue(), 0.01f) : 1.0f;
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap3.size()));
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            linkedHashMap4.put(entry2.getKey(), Float.valueOf(RangesKt.coerceIn(((Number) entry2.getValue()).floatValue() / coerceAtLeast, 0.18f, 1.0f)));
        }
        return linkedHashMap4;
    }

    public static /* synthetic */ Map mergeWithVolume$default(SplitProgrammeMusclePreview splitProgrammeMusclePreview, Map map, Map map2, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 0.32f;
        }
        return splitProgrammeMusclePreview.mergeWithVolume(map, map2, f);
    }

    public final Map<String, Float> mergeWithVolume(Map<String, Float> volumeByRegion, Map<String, Float> programme, float ghostScale) {
        Intrinsics.checkNotNullParameter(volumeByRegion, "volumeByRegion");
        Intrinsics.checkNotNullParameter(programme, "programme");
        Map<String, Float> mutableMap = MapsKt.toMutableMap(volumeByRegion);
        for (Map.Entry<String, Float> entry : programme.entrySet()) {
            String key = entry.getKey();
            float floatValue = entry.getValue().floatValue();
            Float f = mutableMap.get(key);
            float floatValue2 = f != null ? f.floatValue() : 0.0f;
            if (floatValue2 > 0.01f) {
                mutableMap.put(key, Float.valueOf(Math.max(floatValue2, floatValue * ghostScale)));
            }
        }
        return mutableMap;
    }
}
