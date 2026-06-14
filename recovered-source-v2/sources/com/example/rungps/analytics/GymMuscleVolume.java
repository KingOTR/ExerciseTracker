package com.example.rungps.analytics;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.ExerciseNameNormalizer;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.recovery.MuscleHeatmapRegions;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: GymMuscleVolume.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J®\u0001\u0010\u0014\u001a\u00020\u00152\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u0005¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/analytics/GymMuscleVolume;", "", "<init>", "()V", "regionTonnage", "", "", "", "sessions", "", "Lcom/example/rungps/data/GymSessionEntity;", "setsBySessionId", "", "Lcom/example/rungps/data/GymSetEntity;", "muscleLookup", "dayNameBySessionId", "days", "", "zone", "Ljava/time/ZoneId;", "compute", "Lcom/example/rungps/analytics/MuscleVolumeHeatmap;", "secondaryLookup", "tertiaryLookup", "unilateralLookup", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymMuscleVolume {
    public static final int $stable = 0;
    public static final GymMuscleVolume INSTANCE = new GymMuscleVolume();

    private GymMuscleVolume() {
    }

    public static /* synthetic */ Map regionTonnage$default(GymMuscleVolume gymMuscleVolume, List list, Map map, Map map2, Map map3, int i, ZoneId zoneId, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            map3 = MapsKt.emptyMap();
        }
        Map map4 = map3;
        if ((i2 & 16) != 0) {
            i = 7;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return gymMuscleVolume.regionTonnage(list, map, map2, map4, i3, zoneId);
    }

    public final Map<String, Float> regionTonnage(List<GymSessionEntity> sessions, Map<Long, ? extends List<GymSetEntity>> setsBySessionId, Map<String, String> muscleLookup, Map<Long, String> dayNameBySessionId, int days, ZoneId zone) {
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(setsBySessionId, "setsBySessionId");
        Intrinsics.checkNotNullParameter(muscleLookup, "muscleLookup");
        Intrinsics.checkNotNullParameter(dayNameBySessionId, "dayNameBySessionId");
        Intrinsics.checkNotNullParameter(zone, "zone");
        return compute$default(this, sessions, setsBySessionId, muscleLookup, dayNameBySessionId, days, zone, null, null, null, 448, null).getByRegion();
    }

    public static /* synthetic */ MuscleVolumeHeatmap compute$default(GymMuscleVolume gymMuscleVolume, List list, Map map, Map map2, Map map3, int i, ZoneId zoneId, Map map4, Map map5, Map map6, int i2, Object obj) {
        return gymMuscleVolume.compute(list, map, map2, (i2 & 8) != 0 ? MapsKt.emptyMap() : map3, (i2 & 16) != 0 ? 7 : i, (i2 & 32) != 0 ? ZoneId.systemDefault() : zoneId, (i2 & 64) != 0 ? MapsKt.emptyMap() : map4, (i2 & 128) != 0 ? MapsKt.emptyMap() : map5, (i2 & 256) != 0 ? MapsKt.emptyMap() : map6);
    }

    public final MuscleVolumeHeatmap compute(List<GymSessionEntity> sessions, Map<Long, ? extends List<GymSetEntity>> setsBySessionId, Map<String, String> muscleLookup, Map<Long, String> dayNameBySessionId, int days, ZoneId zone, Map<String, String> secondaryLookup, Map<String, String> tertiaryLookup, Map<String, Boolean> unilateralLookup) {
        Iterator it;
        Instant instant;
        Map<Long, ? extends List<GymSetEntity>> setsBySessionId2 = setsBySessionId;
        Map<String, String> muscleLookup2 = muscleLookup;
        Map<String, Boolean> unilateralLookup2 = unilateralLookup;
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(setsBySessionId2, "setsBySessionId");
        Intrinsics.checkNotNullParameter(muscleLookup2, "muscleLookup");
        Intrinsics.checkNotNullParameter(dayNameBySessionId, "dayNameBySessionId");
        Intrinsics.checkNotNullParameter(zone, "zone");
        Intrinsics.checkNotNullParameter(secondaryLookup, "secondaryLookup");
        Intrinsics.checkNotNullParameter(tertiaryLookup, "tertiaryLookup");
        Intrinsics.checkNotNullParameter(unilateralLookup2, "unilateralLookup");
        Instant minusSeconds = Instant.now().minusSeconds(days * 86400);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it2 = sessions.iterator();
        while (it2.hasNext()) {
            GymSessionEntity gymSessionEntity = (GymSessionEntity) it2.next();
            Long endedAtMs = gymSessionEntity.getEndedAtMs();
            if (!Instant.ofEpochMilli(endedAtMs != null ? endedAtMs.longValue() : System.currentTimeMillis()).isBefore(minusSeconds)) {
                List<GymSetEntity> list = setsBySessionId2.get(Long.valueOf(gymSessionEntity.getId()));
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                for (GymSetEntity gymSetEntity : list) {
                    Integer reps = gymSetEntity.getReps();
                    float f = 1.0f;
                    if (RangesKt.coerceAtLeast(reps != null ? reps.intValue() : 1, 1) <= 12) {
                        it = it2;
                    } else {
                        it = it2;
                        f = (((r15 - 12) * 0.35f) / RangesKt.coerceAtLeast(r15, 1)) + 1.0f;
                    }
                    float f2 = (float) GymSetVolume.INSTANCE.tonnageKg(gymSetEntity.getWeightKg(), gymSetEntity.getReps(), GymSetVolume.INSTANCE.isUnilateralForExercise(gymSetEntity.getExerciseName(), unilateralLookup2), f);
                    if (f2 > 0.0f) {
                        String lowerCase = StringsKt.trim((CharSequence) gymSetEntity.getExerciseName()).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        String canonicalKey = ExerciseNameNormalizer.INSTANCE.canonicalKey(gymSetEntity.getExerciseName());
                        String str = muscleLookup2.get(lowerCase);
                        if (str == null) {
                            str = muscleLookup2.get(canonicalKey);
                        }
                        String obj = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
                        String str2 = obj;
                        if (str2 == null || str2.length() == 0) {
                            instant = minusSeconds;
                        } else {
                            instant = minusSeconds;
                            if (!StringsKt.equals(obj, Vo2MaxRecord.MeasurementMethod.OTHER, true)) {
                                String str3 = secondaryLookup.get(lowerCase);
                                if (str3 == null) {
                                    str3 = secondaryLookup.get(canonicalKey);
                                }
                                String str4 = tertiaryLookup.get(lowerCase);
                                if (str4 == null) {
                                    str4 = tertiaryLookup.get(canonicalKey);
                                }
                                for (Map.Entry<String, Float> entry : MuscleHeatmapRegions.INSTANCE.regionsForGymSet(gymSetEntity.getExerciseName(), obj, dayNameBySessionId.get(Long.valueOf(gymSessionEntity.getId())), str3, str4).entrySet()) {
                                    String key = entry.getKey();
                                    float floatValue = entry.getValue().floatValue();
                                    LinkedHashMap linkedHashMap4 = linkedHashMap;
                                    Float f3 = (Float) linkedHashMap.get(key);
                                    linkedHashMap4.put(key, Float.valueOf((f3 != null ? f3.floatValue() : 0.0f) + (floatValue * f2)));
                                }
                                String lowerCase2 = obj.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                if (!linkedHashMap2.containsKey(lowerCase2)) {
                                    LinkedHashMap linkedHashMap5 = linkedHashMap2;
                                    String str5 = str3;
                                    if (str5 != null && !StringsKt.isBlank(str5)) {
                                        obj = obj + " + " + str3;
                                    }
                                    linkedHashMap5.put(lowerCase2, obj);
                                }
                                LinkedHashMap linkedHashMap6 = linkedHashMap3;
                                Float f4 = (Float) linkedHashMap3.get(lowerCase2);
                                linkedHashMap6.put(lowerCase2, Float.valueOf((f4 != null ? f4.floatValue() : 0.0f) + f2));
                            }
                        }
                        MuscleHeatmapRegions muscleHeatmapRegions = MuscleHeatmapRegions.INSTANCE;
                        String exerciseName = gymSetEntity.getExerciseName();
                        String str6 = dayNameBySessionId.get(Long.valueOf(gymSessionEntity.getId()));
                        String str7 = secondaryLookup.get(lowerCase);
                        if (str7 == null) {
                            str7 = secondaryLookup.get(canonicalKey);
                        }
                        String str8 = str7;
                        String str9 = tertiaryLookup.get(lowerCase);
                        if (str9 == null) {
                            str9 = tertiaryLookup.get(canonicalKey);
                        }
                        for (Map.Entry<String, Float> entry2 : muscleHeatmapRegions.regionsForGymSet(exerciseName, obj, str6, str8, str9).entrySet()) {
                            String key2 = entry2.getKey();
                            float floatValue2 = entry2.getValue().floatValue();
                            LinkedHashMap linkedHashMap7 = linkedHashMap;
                            Float f5 = (Float) linkedHashMap.get(key2);
                            linkedHashMap7.put(key2, Float.valueOf((f5 != null ? f5.floatValue() : 0.0f) + (floatValue2 * f2)));
                        }
                    } else {
                        instant = minusSeconds;
                    }
                    muscleLookup2 = muscleLookup;
                    it2 = it;
                    minusSeconds = instant;
                    unilateralLookup2 = unilateralLookup;
                }
            }
            setsBySessionId2 = setsBySessionId;
            muscleLookup2 = muscleLookup;
            it2 = it2;
            minusSeconds = minusSeconds;
            unilateralLookup2 = unilateralLookup;
        }
        LinkedHashMap linkedHashMap8 = linkedHashMap3;
        LinkedHashMap linkedHashMap9 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap8.size()));
        for (Map.Entry entry3 : linkedHashMap8.entrySet()) {
            String str10 = (String) entry3.getKey();
            String str11 = (String) linkedHashMap2.get(str10);
            if (str11 != null) {
                str10 = str11;
            }
            linkedHashMap9.put(str10, entry3.getValue());
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        for (Map.Entry entry4 : linkedHashMap9.entrySet()) {
            if (((Number) entry4.getValue()).floatValue() > 0.0f) {
                linkedHashMap10.put(entry4.getKey(), entry4.getValue());
            }
        }
        return new MuscleVolumeHeatmap(linkedHashMap, linkedHashMap10);
    }
}
