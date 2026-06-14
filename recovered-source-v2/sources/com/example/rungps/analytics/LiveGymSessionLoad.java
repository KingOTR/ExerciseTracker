package com.example.rungps.analytics;

import com.example.rungps.data.ExerciseNameNormalizer;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.gym.GymSessionTiming;
import com.example.rungps.recovery.MuscleHeatmapRegions;
import com.example.rungps.recovery.RecoveryModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: LiveGymSessionLoad.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jt\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\fJr\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\fJ\u0016\u0010\u0015\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/analytics/LiveGymSessionLoad;", "", "<init>", "()V", "volumeFromSets", "Lcom/example/rungps/analytics/MuscleVolumeHeatmap;", "sets", "", "Lcom/example/rungps/data/GymSetEntity;", "dayName", "", "muscleLookup", "", "secondaryLookup", "tertiaryLookup", "unilateralLookup", "", "recoveryRegionsFromSets", "", "sessionStartedMs", "", "interSetRestMinutes", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LiveGymSessionLoad {
    public static final int $stable = 0;
    public static final LiveGymSessionLoad INSTANCE = new LiveGymSessionLoad();

    private LiveGymSessionLoad() {
    }

    public static /* synthetic */ MuscleVolumeHeatmap volumeFromSets$default(LiveGymSessionLoad liveGymSessionLoad, List list, String str, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 8) != 0) {
            map2 = MapsKt.emptyMap();
        }
        Map map5 = map2;
        if ((i & 16) != 0) {
            map3 = MapsKt.emptyMap();
        }
        Map map6 = map3;
        if ((i & 32) != 0) {
            map4 = MapsKt.emptyMap();
        }
        return liveGymSessionLoad.volumeFromSets(list, str, map, map5, map6, map4);
    }

    public final MuscleVolumeHeatmap volumeFromSets(List<GymSetEntity> sets, String dayName, Map<String, String> muscleLookup, Map<String, String> secondaryLookup, Map<String, String> tertiaryLookup, Map<String, Boolean> unilateralLookup) {
        Intrinsics.checkNotNullParameter(sets, "sets");
        Intrinsics.checkNotNullParameter(muscleLookup, "muscleLookup");
        Intrinsics.checkNotNullParameter(secondaryLookup, "secondaryLookup");
        Intrinsics.checkNotNullParameter(tertiaryLookup, "tertiaryLookup");
        Intrinsics.checkNotNullParameter(unilateralLookup, "unilateralLookup");
        if (sets.isEmpty()) {
            return new MuscleVolumeHeatmap(null, null, 3, null);
        }
        return GymMuscleVolume.compute$default(GymMuscleVolume.INSTANCE, CollectionsKt.listOf(new GymSessionEntity(0L, System.currentTimeMillis(), Long.valueOf(System.currentTimeMillis()), null, false, null, null, null, null, 496, null)), MapsKt.mapOf(TuplesKt.to(0L, sets)), muscleLookup, MapsKt.mapOf(TuplesKt.to(0L, dayName == null ? "" : dayName)), 1, null, secondaryLookup, tertiaryLookup, unilateralLookup, 32, null);
    }

    public final Map<String, Float> recoveryRegionsFromSets(List<GymSetEntity> sets, long sessionStartedMs, String dayName, Map<String, String> muscleLookup, Map<String, String> secondaryLookup, Map<String, String> tertiaryLookup) {
        double d;
        RecoveryModel.RecoveryEstimate estimateGym;
        Intrinsics.checkNotNullParameter(sets, "sets");
        Intrinsics.checkNotNullParameter(muscleLookup, "muscleLookup");
        Intrinsics.checkNotNullParameter(secondaryLookup, "secondaryLookup");
        Intrinsics.checkNotNullParameter(tertiaryLookup, "tertiaryLookup");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sets.iterator();
        while (true) {
            d = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            GymSetEntity gymSetEntity = (GymSetEntity) next;
            Integer reps = gymSetEntity.getReps();
            if ((reps != null ? reps.intValue() : 0) > 0 && gymSetEntity.getWeightKg() > 0.0d) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return MapsKt.emptyMap();
        }
        ArrayList<GymSetEntity> arrayList3 = arrayList2;
        for (GymSetEntity gymSetEntity2 : arrayList3) {
            d += gymSetEntity2.getWeightKg() * (gymSetEntity2.getReps() != null ? r9.intValue() : 1);
        }
        Iterator it2 = arrayList3.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        double weightKg = ((GymSetEntity) it2.next()).getWeightKg();
        while (it2.hasNext()) {
            weightKg = Math.max(weightKg, ((GymSetEntity) it2.next()).getWeightKg());
        }
        double d2 = weightKg;
        long activeWorkDurationMs = GymSessionTiming.INSTANCE.activeWorkDurationMs(arrayList2, sessionStartedMs, System.currentTimeMillis());
        double interSetRestMinutes = interSetRestMinutes(arrayList2);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Double valueOf = ((GymSetEntity) it3.next()).getRpeBorg() != null ? Double.valueOf(r10.intValue()) : null;
            if (valueOf != null) {
                arrayList4.add(valueOf);
            }
        }
        ArrayList arrayList5 = arrayList4;
        if (arrayList5.isEmpty()) {
            arrayList5 = null;
        }
        estimateGym = RecoveryModel.INSTANCE.estimateGym(d, d2, activeWorkDurationMs, (r24 & 8) != 0 ? null : null, (r24 & 16) != 0 ? 0.0d : interSetRestMinutes, (r24 & 32) != 0 ? null : arrayList5 != null ? Double.valueOf(CollectionsKt.averageOfDouble(arrayList5)) : null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        float hours = ((float) estimateGym.getHours()) / RangesKt.coerceAtLeast(arrayList2.size(), 1);
        for (GymSetEntity gymSetEntity3 : arrayList3) {
            String lowerCase = StringsKt.trim((CharSequence) gymSetEntity3.getExerciseName()).toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String canonicalKey = ExerciseNameNormalizer.INSTANCE.canonicalKey(gymSetEntity3.getExerciseName());
            String str = muscleLookup.get(lowerCase);
            if (str == null) {
                str = muscleLookup.get(canonicalKey);
            }
            String str2 = str;
            MuscleHeatmapRegions muscleHeatmapRegions = MuscleHeatmapRegions.INSTANCE;
            String exerciseName = gymSetEntity3.getExerciseName();
            String str3 = secondaryLookup.get(lowerCase);
            if (str3 == null) {
                str3 = secondaryLookup.get(canonicalKey);
            }
            String str4 = str3;
            String str5 = tertiaryLookup.get(lowerCase);
            if (str5 == null) {
                str5 = tertiaryLookup.get(canonicalKey);
            }
            for (Map.Entry<String, Float> entry : muscleHeatmapRegions.regionsForGymSet(exerciseName, str2, dayName, str4, str5).entrySet()) {
                String key = entry.getKey();
                float floatValue = entry.getValue().floatValue();
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                Float f = (Float) linkedHashMap.get(key);
                linkedHashMap2.put(key, Float.valueOf((f != null ? f.floatValue() : 0.0f) + (floatValue * hours)));
            }
        }
        return linkedHashMap;
    }

    private final double interSetRestMinutes(List<GymSetEntity> sets) {
        long j;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sets.iterator();
        while (it.hasNext()) {
            Long loggedAtMs = ((GymSetEntity) it.next()).getLoggedAtMs();
            if (loggedAtMs != null) {
                arrayList.add(loggedAtMs);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            j = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((Number) next).longValue() > 0) {
                arrayList2.add(next);
            }
        }
        List sorted = CollectionsKt.sorted(arrayList2);
        if (sorted.size() < 2) {
            return 0.0d;
        }
        int size = sorted.size();
        for (int i = 1; i < size; i++) {
            j += RangesKt.coerceAtMost(((Number) sorted.get(i)).longValue() - ((Number) sorted.get(i - 1)).longValue(), 300000L);
        }
        return j / 60000.0d;
    }
}
