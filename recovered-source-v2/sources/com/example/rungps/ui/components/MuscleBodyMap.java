package com.example.rungps.ui.components;

import android.content.Context;
import com.example.rungps.recovery.MuscleHeatmapRegions;
import com.example.rungps.ui.components.MuscleAtlasConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: MuscleBodyMap.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u000b\u001a\u00020\fJ,\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ$\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0002J\u001d\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001aJ&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0011J(\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0011H\u0002J\u001c\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050!H\u0002J\u001c\u0010\"\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/example/rungps/ui/components/MuscleBodyMap;", "", "<init>", "()V", "MIN_REGION_LOAD", "", "isTrainableMuscleId", "", "id", "", "regionForMuscleId", "context", "Landroid/content/Context;", "heatmapMuscleIds", "", "toBodyStateJson", "regionHours", "", "uniformMacroGroups", "legacyIsTrainable", "legacyHeatmapIds", "legacyRegionForMuscleId", "intensityForRegionLoad", "", "load", "maxLoad", "intensityForRegionLoad$app_sideload", "resolveRegionLoadForDisplay", "raw", "resolveRegionLoad", "distributeParentRegionsForAtlas", "", "out", "", "aggregateChildRegionsForDisplay", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MuscleBodyMap {
    public static final int $stable = 0;
    public static final MuscleBodyMap INSTANCE = new MuscleBodyMap();
    public static final float MIN_REGION_LOAD = 0.001f;

    private MuscleBodyMap() {
    }

    public final boolean isTrainableMuscleId(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return legacyIsTrainable(id);
    }

    public final String regionForMuscleId(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return legacyRegionForMuscleId(id);
    }

    public final String regionForMuscleId(String id, Context context) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(context, "context");
        return MuscleAtlasConfig.INSTANCE.regionForMuscleId(id, MuscleAtlasConfig.INSTANCE.load(context));
    }

    public final List<String> heatmapMuscleIds(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return MuscleAtlasConfig.INSTANCE.load(context).getHeatmapMuscleIds();
    }

    public static /* synthetic */ String toBodyStateJson$default(MuscleBodyMap muscleBodyMap, Map map, boolean z, Context context, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return muscleBodyMap.toBodyStateJson(map, z, context);
    }

    public final String toBodyStateJson(Map<String, Float> regionHours, boolean uniformMacroGroups, Context context) {
        Intrinsics.checkNotNullParameter(regionHours, "regionHours");
        Intrinsics.checkNotNullParameter(context, "context");
        MuscleAtlasConfig.Atlas load = MuscleAtlasConfig.INSTANCE.load(context);
        Map<String, Float> resolveRegionLoad = resolveRegionLoad(regionHours);
        Float maxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) resolveRegionLoad.values());
        float coerceAtLeast = maxOrNull != null ? RangesKt.coerceAtLeast(maxOrNull.floatValue(), 0.5f) : 1.0f;
        JSONObject jSONObject = new JSONObject();
        for (String str : load.getHeatmapMuscleIds()) {
            String regionForMuscleId = MuscleAtlasConfig.INSTANCE.regionForMuscleId(str, load);
            if (regionForMuscleId.length() != 0) {
                Float f = resolveRegionLoad.get(regionForMuscleId);
                float floatValue = f != null ? f.floatValue() : 0.0f;
                int intensityForRegionLoad$app_sideload = floatValue > 0.001f ? intensityForRegionLoad$app_sideload(floatValue, coerceAtLeast) : 0;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("intensity", intensityForRegionLoad$app_sideload);
                jSONObject2.put("selected", false);
                Unit unit = Unit.INSTANCE;
                jSONObject.put(str, jSONObject2);
            }
        }
        String jSONObject3 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    public static /* synthetic */ String toBodyStateJson$default(MuscleBodyMap muscleBodyMap, Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return muscleBodyMap.toBodyStateJson(map, z);
    }

    public final String toBodyStateJson(Map<String, Float> regionHours, boolean uniformMacroGroups) {
        Intrinsics.checkNotNullParameter(regionHours, "regionHours");
        Map<String, Float> resolveRegionLoad = resolveRegionLoad(regionHours);
        Float maxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) resolveRegionLoad.values());
        float coerceAtLeast = maxOrNull != null ? RangesKt.coerceAtLeast(maxOrNull.floatValue(), 0.5f) : 1.0f;
        JSONObject jSONObject = new JSONObject();
        for (String str : legacyHeatmapIds()) {
            String legacyRegionForMuscleId = legacyRegionForMuscleId(str);
            if (legacyRegionForMuscleId.length() != 0) {
                Float f = resolveRegionLoad.get(legacyRegionForMuscleId);
                float floatValue = f != null ? f.floatValue() : 0.0f;
                int intensityForRegionLoad$app_sideload = floatValue > 0.001f ? intensityForRegionLoad$app_sideload(floatValue, coerceAtLeast) : 0;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("intensity", intensityForRegionLoad$app_sideload);
                jSONObject2.put("selected", false);
                Unit unit = Unit.INSTANCE;
                jSONObject.put(str, jSONObject2);
            }
        }
        String jSONObject3 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    private final boolean legacyIsTrainable(String id) {
        return MuscleAtlasConfig.INSTANCE.isTrainable(id, SetsKt.setOf((Object[]) new String[]{"head", "face", "head-back", "nape", "hand-left", "hand-right", "hand-back-left", "hand-back-right", "foot-left", "foot-right", "foot-back-left", "foot-back-right", "elbow-left", "elbow-right", "knee-left", "knee-right", "knee-back-left", "knee-back-right"}));
    }

    private final List<String> legacyHeatmapIds() {
        return CollectionsKt.listOf((Object[]) new String[]{"neck-right", "neck-left", "shoulder-front-left", "shoulder-front-right", "shoulder-side-left", "shoulder-side-right", "deltoid-rear-left", "deltoid-rear-right", "traps-upper-left", "traps-mid-left", "traps-lower-left", "traps-upper-right", "traps-mid-right", "traps-lower-right", "biceps-left", "biceps-right", "triceps-long-left", "triceps-lateral-left", "triceps-long-right", "triceps-lateral-right", "forearm-left", "forearm-right", "forearm-flexors-left", "forearm-extensors-left", "forearm-flexors-right", "forearm-extensors-right", "chest-upper-left", "chest-upper-right", "chest-lower-left", "chest-lower-right", "lats-upper-left", "lats-mid-left", "lats-lower-left", "lats-upper-right", "lats-mid-right", "lats-lower-right", "lower-back-erectors-left", "lower-back-ql-left", "lower-back-erectors-right", "lower-back-ql-right", "spine", "gluteus-medius-left", "gluteus-maximus-left", "gluteus-medius-right", "gluteus-maximus-right", "abs-upper-left", "abs-upper-right", "abs-lower-left", "abs-lower-right", "serratus-anterior-left", "serratus-anterior-right", "obliques-left", "obliques-right", "quads-left", "quads-right", "hamstrings-medial-left", "hamstrings-lateral-left", "hamstrings-medial-right", "hamstrings-lateral-right", "adductors-left", "adductors-right", "tibialis-anterior-left", "tibialis-anterior-right", "calves-gastroc-medial-left", "calves-gastroc-lateral-left", "calves-soleus-left", "calves-gastroc-medial-right", "calves-gastroc-lateral-right", "calves-soleus-right", "hip-flexor-left", "hip-flexor-right"});
    }

    private final String legacyRegionForMuscleId(String id) {
        if (!legacyIsTrainable(id)) {
            return "";
        }
        String str = id;
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "hand", false, 2, (Object) null)) {
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "foot", false, 2, (Object) null)) {
                String str2 = MuscleHeatmapRegions.BICEPS;
                if (!StringsKt.contains$default((CharSequence) str, (CharSequence) MuscleHeatmapRegions.BICEPS, false, 2, (Object) null)) {
                    str2 = MuscleHeatmapRegions.TRICEPS;
                    if (!StringsKt.contains$default((CharSequence) str, (CharSequence) MuscleHeatmapRegions.TRICEPS, false, 2, (Object) null)) {
                        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "forearm", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "elbow", false, 2, (Object) null)) {
                            str2 = MuscleHeatmapRegions.CHEST;
                            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) MuscleHeatmapRegions.CHEST, false, 2, (Object) null)) {
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "trap", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "nape", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "neck", false, 2, (Object) null)) {
                                    return MuscleHeatmapRegions.TRAPS;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "deltoid", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "shoulder", false, 2, (Object) null)) {
                                    return MuscleHeatmapRegions.SHOULDERS;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "hamstring", false, 2, (Object) null)) {
                                    return MuscleHeatmapRegions.HAMSTRINGS;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "lats-lower", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "lats-mid", false, 2, (Object) null) || StringsKt.startsWith$default(id, "lats-", false, 2, (Object) null)) {
                                    return MuscleHeatmapRegions.LATS;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "lower-back", false, 2, (Object) null) || Intrinsics.areEqual(id, "spine")) {
                                    return MuscleHeatmapRegions.LOWER_BACK;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "gluteus-medius", false, 2, (Object) null)) {
                                    return MuscleHeatmapRegions.ABDUCTORS;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "gluteus", false, 2, (Object) null)) {
                                    return MuscleHeatmapRegions.GLUTES;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "quad", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "knee", false, 2, (Object) null)) {
                                    return MuscleHeatmapRegions.QUADS;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "adductor", false, 2, (Object) null)) {
                                    return MuscleHeatmapRegions.ADDUCTORS;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "hip-flexor", false, 2, (Object) null)) {
                                    return MuscleHeatmapRegions.HIP_FLEXORS;
                                }
                                String str3 = MuscleHeatmapRegions.GASTROC;
                                if (!StringsKt.contains$default((CharSequence) str, (CharSequence) MuscleHeatmapRegions.GASTROC, false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "calves-gastroc", false, 2, (Object) null)) {
                                    str3 = MuscleHeatmapRegions.SOLEUS;
                                    if (!StringsKt.contains$default((CharSequence) str, (CharSequence) MuscleHeatmapRegions.SOLEUS, false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "calves-soleus", false, 2, (Object) null)) {
                                        str3 = MuscleHeatmapRegions.TIBIALIS;
                                        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) MuscleHeatmapRegions.TIBIALIS, false, 2, (Object) null)) {
                                            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) MuscleHeatmapRegions.CALVES, false, 2, (Object) null)) {
                                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "abs", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "oblique", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "serratus", false, 2, (Object) null)) {
                                                    return MuscleHeatmapRegions.CORE;
                                                }
                                                return MuscleHeatmapRegions.BACK;
                                            }
                                        }
                                    }
                                }
                                return str3;
                            }
                        }
                    }
                }
                return str2;
            }
            return MuscleHeatmapRegions.CALVES;
        }
        return MuscleHeatmapRegions.FOREARMS;
    }

    public final int intensityForRegionLoad$app_sideload(float load, float maxLoad) {
        if (load <= 0.0f || maxLoad <= 0.0f) {
            return 2;
        }
        return RangesKt.coerceIn((int) (4 + (((float) Math.pow(RangesKt.coerceIn(load / maxLoad, 0.0f, 1.0f), 0.65d)) * 6.0f)), 4, 10);
    }

    public final Map<String, Float> resolveRegionLoadForDisplay(Map<String, Float> raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        return resolveRegionLoad(raw);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Map<String, Float> resolveRegionLoad(Map<String, Float> raw) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Float> entry : raw.entrySet()) {
            String key = entry.getKey();
            float floatValue = entry.getValue().floatValue();
            if (floatValue > 0.0f) {
                int hashCode = key.hashCode();
                if (hashCode != 3002775) {
                    if (hashCode == 3015911) {
                        if (key.equals(MuscleHeatmapRegions.BACK)) {
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            Float f = (Float) linkedHashMap.get(MuscleHeatmapRegions.LATS);
                            linkedHashMap2.put(MuscleHeatmapRegions.LATS, Float.valueOf((f != null ? f.floatValue() : 0.0f) + (0.35f * floatValue)));
                            Float f2 = (Float) linkedHashMap.get(MuscleHeatmapRegions.LOWER_BACK);
                            linkedHashMap2.put(MuscleHeatmapRegions.LOWER_BACK, Float.valueOf((f2 != null ? f2.floatValue() : 0.0f) + (0.25f * floatValue)));
                            Float f3 = (Float) linkedHashMap.get(MuscleHeatmapRegions.TRAPS);
                            float f4 = 0.15f * floatValue;
                            linkedHashMap2.put(MuscleHeatmapRegions.TRAPS, Float.valueOf((f3 != null ? f3.floatValue() : 0.0f) + f4));
                            Float f5 = (Float) linkedHashMap.get(MuscleHeatmapRegions.SHOULDERS);
                            linkedHashMap2.put(MuscleHeatmapRegions.SHOULDERS, Float.valueOf((f5 != null ? f5.floatValue() : 0.0f) + f4));
                            Float f6 = (Float) linkedHashMap.get(MuscleHeatmapRegions.BICEPS);
                            linkedHashMap2.put(MuscleHeatmapRegions.BICEPS, Float.valueOf((f6 != null ? f6.floatValue() : 0.0f) + (floatValue * 0.1f)));
                        } else {
                            LinkedHashMap linkedHashMap3 = linkedHashMap;
                            Float f7 = (Float) linkedHashMap.get(key);
                            linkedHashMap3.put(key, Float.valueOf((f7 != null ? f7.floatValue() : 0.0f) + floatValue));
                        }
                    } else {
                        if (hashCode == 3317797 && key.equals(MuscleHeatmapRegions.LEGS)) {
                            LinkedHashMap linkedHashMap4 = linkedHashMap;
                            Float f8 = (Float) linkedHashMap.get(MuscleHeatmapRegions.QUADS);
                            linkedHashMap4.put(MuscleHeatmapRegions.QUADS, Float.valueOf((f8 != null ? f8.floatValue() : 0.0f) + (0.32f * floatValue)));
                            Float f9 = (Float) linkedHashMap.get(MuscleHeatmapRegions.HAMSTRINGS);
                            linkedHashMap4.put(MuscleHeatmapRegions.HAMSTRINGS, Float.valueOf((f9 != null ? f9.floatValue() : 0.0f) + (0.28f * floatValue)));
                            Float f10 = (Float) linkedHashMap.get(MuscleHeatmapRegions.GLUTES);
                            linkedHashMap4.put(MuscleHeatmapRegions.GLUTES, Float.valueOf((f10 != null ? f10.floatValue() : 0.0f) + (0.18f * floatValue)));
                            Float f11 = (Float) linkedHashMap.get(MuscleHeatmapRegions.HIP_FLEXORS);
                            linkedHashMap4.put(MuscleHeatmapRegions.HIP_FLEXORS, Float.valueOf((f11 != null ? f11.floatValue() : 0.0f) + (0.08f * floatValue)));
                            Float f12 = (Float) linkedHashMap.get(MuscleHeatmapRegions.CALVES);
                            linkedHashMap4.put(MuscleHeatmapRegions.CALVES, Float.valueOf((f12 != null ? f12.floatValue() : 0.0f) + (floatValue * 0.14f)));
                        }
                        LinkedHashMap linkedHashMap32 = linkedHashMap;
                        Float f72 = (Float) linkedHashMap.get(key);
                        linkedHashMap32.put(key, Float.valueOf((f72 != null ? f72.floatValue() : 0.0f) + floatValue));
                    }
                } else if (key.equals(MuscleHeatmapRegions.ARMS)) {
                    LinkedHashMap linkedHashMap5 = linkedHashMap;
                    Float f13 = (Float) linkedHashMap.get(MuscleHeatmapRegions.BICEPS);
                    linkedHashMap5.put(MuscleHeatmapRegions.BICEPS, Float.valueOf((f13 != null ? f13.floatValue() : 0.0f) + (0.55f * floatValue)));
                    Float f14 = (Float) linkedHashMap.get(MuscleHeatmapRegions.TRICEPS);
                    linkedHashMap5.put(MuscleHeatmapRegions.TRICEPS, Float.valueOf((f14 != null ? f14.floatValue() : 0.0f) + (floatValue * 0.45f)));
                } else {
                    LinkedHashMap linkedHashMap322 = linkedHashMap;
                    Float f722 = (Float) linkedHashMap.get(key);
                    linkedHashMap322.put(key, Float.valueOf((f722 != null ? f722.floatValue() : 0.0f) + floatValue));
                }
            }
        }
        LinkedHashMap linkedHashMap6 = linkedHashMap;
        distributeParentRegionsForAtlas(linkedHashMap6);
        aggregateChildRegionsForDisplay(linkedHashMap6);
        return linkedHashMap6.isEmpty() ? raw : linkedHashMap6;
    }

    private static final void distributeParentRegionsForAtlas$splitParent(Map<String, Float> map, String str, List<Pair<String, Float>> list) {
        Float f = map.get(str);
        if (f != null) {
            float floatValue = f.floatValue();
            if (floatValue <= 0.0f) {
                return;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str2 = (String) pair.component1();
                float floatValue2 = ((Number) pair.component2()).floatValue();
                Float f2 = map.get(str2);
                map.put(str2, Float.valueOf((f2 != null ? f2.floatValue() : 0.0f) + (floatValue2 * floatValue)));
            }
            map.remove(str);
        }
    }

    private final void distributeParentRegionsForAtlas(Map<String, Float> out) {
        distributeParentRegionsForAtlas$splitParent(out, MuscleHeatmapRegions.HAMSTRINGS, CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS_MEDIAL, Float.valueOf(0.52f)), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS_LATERAL, Float.valueOf(0.48f))}));
        distributeParentRegionsForAtlas$splitParent(out, MuscleHeatmapRegions.CALVES, CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(MuscleHeatmapRegions.GASTROC, Float.valueOf(0.6f)), TuplesKt.to(MuscleHeatmapRegions.SOLEUS, Float.valueOf(0.4f))}));
        distributeParentRegionsForAtlas$splitParent(out, MuscleHeatmapRegions.TRAPS, CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(MuscleHeatmapRegions.TRAPS_UPPER, Float.valueOf(0.45f)), TuplesKt.to(MuscleHeatmapRegions.TRAPS_MID, Float.valueOf(0.35f)), TuplesKt.to(MuscleHeatmapRegions.TRAPS_LOWER, Float.valueOf(0.2f))}));
    }

    private static final void aggregateChildRegionsForDisplay$sumIntoParent(Map<String, Float> map, String str, String... strArr) {
        int length = strArr.length;
        double d = 0.0d;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Float f = map.get(strArr[i]);
            if (f != null) {
                r4 = f.floatValue();
            }
            d += r4;
            i++;
        }
        float f2 = (float) d;
        if (f2 > 0.0f) {
            Float f3 = map.get(str);
            map.put(str, Float.valueOf((f3 != null ? f3.floatValue() : 0.0f) + f2));
        }
    }

    private final void aggregateChildRegionsForDisplay(Map<String, Float> out) {
        aggregateChildRegionsForDisplay$sumIntoParent(out, MuscleHeatmapRegions.HAMSTRINGS, MuscleHeatmapRegions.HAMSTRINGS_MEDIAL, MuscleHeatmapRegions.HAMSTRINGS_LATERAL);
        aggregateChildRegionsForDisplay$sumIntoParent(out, MuscleHeatmapRegions.CALVES, MuscleHeatmapRegions.GASTROC, MuscleHeatmapRegions.SOLEUS, MuscleHeatmapRegions.TIBIALIS);
        aggregateChildRegionsForDisplay$sumIntoParent(out, MuscleHeatmapRegions.TRAPS, MuscleHeatmapRegions.TRAPS_UPPER, MuscleHeatmapRegions.TRAPS_MID, MuscleHeatmapRegions.TRAPS_LOWER);
    }
}
