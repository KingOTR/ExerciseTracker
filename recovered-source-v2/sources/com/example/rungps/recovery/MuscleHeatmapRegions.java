package com.example.rungps.recovery;

import androidx.health.connect.client.records.BodyTemperatureMeasurementLocation;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.analytics.ExerciseMuscleShares;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: MuscleHeatmapRegions.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005J\u0010\u0010&\u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020\u0005J$\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005J\u000e\u0010,\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0005J\u000e\u0010.\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0005J\u0010\u0010/\u001a\u00020-2\b\u0010*\u001a\u0004\u0018\u00010\u0005J\u0010\u00100\u001a\u00020-2\b\u0010*\u001a\u0004\u0018\u00010\u0005J\"\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u0006\u00105\u001a\u00020\u0005J\u0012\u00108\u001a\u00020-2\b\u0010+\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u00109\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0005H\u0002J:\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\b\u0010+\u001a\u0004\u0018\u00010\u00052\u0006\u0010)\u001a\u00020\u00052\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020204H\u0002JH\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u0006\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0005J&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u0006\u0010%\u001a\u00020\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005J\u001c\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u0006\u0010@\u001a\u00020\u0005H\u0002JL\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u0006\u0010D\u001a\u0002022\u0006\u0010E\u001a\u000202H\u0002JP\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020204H\u0002J(\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020204H\u0002J\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020204J\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020204J\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020204J\u001c\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\b\u0010+\u001a\u0004\u0018\u00010\u0005JB\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202042\u000e\b\u0002\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00050#2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005J8\u0010Q\u001a\u00020R2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002020S2\u0006\u0010T\u001a\u0002022\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020204H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\u000507X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/example/rungps/recovery/MuscleHeatmapRegions;", "", "<init>", "()V", "CHEST", "", "SHOULDERS", "ARMS", "BACK", "LEGS", "TRAPS", "TRAPS_UPPER", "TRAPS_MID", "TRAPS_LOWER", "LATS", "LOWER_BACK", "BICEPS", "TRICEPS", "FOREARMS", "FOREARM_FLEXORS", "FOREARM_EXTENSORS", "CORE", "GLUTES", "QUADS", "HAMSTRINGS", "HAMSTRINGS_MEDIAL", "HAMSTRINGS_LATERAL", "CALVES", "GASTROC", "SOLEUS", "TIBIALIS", "ABDUCTORS", "ADDUCTORS", "HIP_FLEXORS", "allRegions", "", "regionForUserTag", "tag", "groupToRegion", "group", "regionForGymSet", "exerciseName", "muscleTag", "dayName", "isLegHamstringCurl", "", "isHipAbductorExercise", "tagConflictsWithHipAbductor", "tagConflictsWithLegCurl", "fractionForRegion", "", "split", "", "target", "legRegions", "", "isUpperOnlyDay", "isLegFocusedExercise", "filterLegBiasForUpperDay", "regionsForGymSet", "secondaryTag", "tertiaryTag", "splitsForUserTag", "expandMacroRegion", "region", "mergeWeightedSplits", "primary", "secondary", "primaryWeight", "secondaryWeight", "mergeThreeSplits", "tertiary", "normalizeWeights", "weights", "regionsForRunRecovery", "regionsForBikeRecovery", "regionsForSoccerRecovery", "inferFromDay", "regionHours", "groupHours", "exerciseNames", "distribute", "", "", "hours", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MuscleHeatmapRegions {
    public static final MuscleHeatmapRegions INSTANCE = new MuscleHeatmapRegions();
    public static final String CHEST = "chest";
    public static final String SHOULDERS = "shoulders";
    public static final String ARMS = "arms";
    public static final String BACK = "back";
    public static final String LEGS = "legs";
    public static final String TRAPS = "traps";
    public static final String TRAPS_UPPER = "traps upper";
    public static final String TRAPS_MID = "traps mid";
    public static final String TRAPS_LOWER = "traps lower";
    public static final String LATS = "lats";
    public static final String LOWER_BACK = "lower back";
    public static final String BICEPS = "biceps";
    public static final String TRICEPS = "triceps";
    public static final String FOREARMS = "forearms";
    public static final String FOREARM_FLEXORS = "forearm flexors";
    public static final String FOREARM_EXTENSORS = "forearm extensors";
    public static final String CORE = "core";
    public static final String GLUTES = "glutes";
    public static final String QUADS = "quads";
    public static final String HAMSTRINGS = "hamstrings";
    public static final String HAMSTRINGS_MEDIAL = "hamstrings medial";
    public static final String HAMSTRINGS_LATERAL = "hamstrings lateral";
    public static final String CALVES = "calves";
    public static final String GASTROC = "gastroc";
    public static final String SOLEUS = "soleus";
    public static final String TIBIALIS = "tibialis";
    public static final String ABDUCTORS = "abductors";
    public static final String ADDUCTORS = "adductors";
    public static final String HIP_FLEXORS = "hip flexors";
    private static final List<String> allRegions = CollectionsKt.listOf((Object[]) new String[]{CHEST, SHOULDERS, ARMS, BACK, LEGS, TRAPS, TRAPS_UPPER, TRAPS_MID, TRAPS_LOWER, LATS, LOWER_BACK, BICEPS, TRICEPS, FOREARMS, FOREARM_FLEXORS, FOREARM_EXTENSORS, CORE, GLUTES, QUADS, HAMSTRINGS, HAMSTRINGS_MEDIAL, HAMSTRINGS_LATERAL, CALVES, GASTROC, SOLEUS, TIBIALIS, ABDUCTORS, ADDUCTORS, HIP_FLEXORS});
    private static final Set<String> legRegions = SetsKt.setOf((Object[]) new String[]{LEGS, GLUTES, QUADS, HAMSTRINGS, HAMSTRINGS_MEDIAL, HAMSTRINGS_LATERAL, CALVES, GASTROC, SOLEUS, TIBIALIS, ABDUCTORS, ADDUCTORS, HIP_FLEXORS});
    public static final int $stable = 8;

    private MuscleHeatmapRegions() {
    }

    public final String regionForUserTag(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        String obj = StringsKt.trim((CharSequence) tag).toString();
        if (obj.length() == 0) {
            return BACK;
        }
        String groupToRegion = groupToRegion(obj);
        if (groupToRegion != null) {
            return groupToRegion;
        }
        String lowerCase = obj.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (!Intrinsics.areEqual(lowerCase, "push")) {
            String str = lowerCase;
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "push day", false, 2, (Object) null)) {
                if (Intrinsics.areEqual(lowerCase, "pull") || StringsKt.contains$default((CharSequence) str, (CharSequence) "pull day", false, 2, (Object) null)) {
                    return BACK;
                }
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "upper", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "lower", false, 2, (Object) null)) {
                    return BACK;
                }
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "lower", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "upper", false, 2, (Object) null)) {
                    return LEGS;
                }
                String groupToRegion2 = groupToRegion(obj);
                return groupToRegion2 == null ? BACK : groupToRegion2;
            }
        }
        return CHEST;
    }

    public final String groupToRegion(String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        String lowerCase = group.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = lowerCase;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "trap", false, 2, (Object) null)) {
            return TRAPS;
        }
        String str2 = LATS;
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) LATS, false, 2, (Object) null) && (!StringsKt.contains$default((CharSequence) str, (CharSequence) "lat", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "lateral", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "later", false, 2, (Object) null))) {
            str2 = LOWER_BACK;
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) LOWER_BACK, false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "erector", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "spinal", false, 2, (Object) null)) {
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "bicep", false, 2, (Object) null) || (StringsKt.contains$default((CharSequence) str, (CharSequence) "curl", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "leg", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "hamstring", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "nordic", false, 2, (Object) null))) {
                    return BICEPS;
                }
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "tricep", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "skull crush", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "skullcrush", false, 2, (Object) null) || (StringsKt.contains$default((CharSequence) str, (CharSequence) "skull", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str, (CharSequence) "crush", false, 2, (Object) null))) {
                    return TRICEPS;
                }
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "forearm", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) BodyTemperatureMeasurementLocation.WRIST, false, 2, (Object) null)) {
                    return FOREARMS;
                }
                str2 = CORE;
                if (!StringsKt.contains$default((CharSequence) str, (CharSequence) CORE, false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "ab", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "oblique", false, 2, (Object) null)) {
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) "glute", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "medius", false, 2, (Object) null)) {
                        return GLUTES;
                    }
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) "abduct", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "gluteus medius", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "medius", false, 2, (Object) null)) {
                        return ABDUCTORS;
                    }
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) "adduct", false, 2, (Object) null)) {
                        return ADDUCTORS;
                    }
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) "hip flex", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "psoas", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "iliopsoas", false, 2, (Object) null)) {
                        return HIP_FLEXORS;
                    }
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) "quad", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "vastus", false, 2, (Object) null)) {
                        return QUADS;
                    }
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) "ham", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "posterior chain", false, 2, (Object) null)) {
                        return HAMSTRINGS;
                    }
                    str2 = GASTROC;
                    if (!StringsKt.contains$default((CharSequence) str, (CharSequence) GASTROC, false, 2, (Object) null)) {
                        str2 = SOLEUS;
                        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) SOLEUS, false, 2, (Object) null)) {
                            str2 = TIBIALIS;
                            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) TIBIALIS, false, 2, (Object) null)) {
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "calf", false, 2, (Object) null)) {
                                    return CALVES;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "shoulder", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "delt", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "ohp", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "overhead press", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "lateral raise", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "rear delt", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "reverse fly", false, 2, (Object) null)) {
                                    return SHOULDERS;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) CHEST, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "pec", false, 2, (Object) null) || Intrinsics.areEqual(lowerCase, "pecs") || StringsKt.contains$default((CharSequence) str, (CharSequence) "bench", false, 2, (Object) null) || ((StringsKt.contains$default((CharSequence) str, (CharSequence) "fly", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "rear", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "reverse", false, 2, (Object) null)) || (StringsKt.contains$default((CharSequence) str, (CharSequence) "press", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "leg", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "shoulder", false, 2, (Object) null)))) {
                                    return CHEST;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "arm", false, 2, (Object) null)) {
                                    return ARMS;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) BACK, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "row", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "pull", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "deadlift", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "chin", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "pulldown", false, 2, (Object) null)) {
                                    return BACK;
                                }
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "leg", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "squat", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "lunge", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "lower", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "rdl", false, 2, (Object) null)) {
                                    return LEGS;
                                }
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return str2;
    }

    public static /* synthetic */ String regionForGymSet$default(MuscleHeatmapRegions muscleHeatmapRegions, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return muscleHeatmapRegions.regionForGymSet(str, str2, str3);
    }

    public final String regionForGymSet(String exerciseName, String muscleTag, String dayName) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Iterator it = regionsForGymSet$default(this, exerciseName, muscleTag, dayName, null, null, 24, null).entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    if (Float.compare(floatValue, floatValue2) < 0) {
                        next = next2;
                        floatValue = floatValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry = (Map.Entry) obj;
        return (entry == null || (str = (String) entry.getKey()) == null) ? BACK : str;
    }

    public final boolean isLegHamstringCurl(String exerciseName) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        String lowerCase = exerciseName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String obj = StringsKt.trim((CharSequence) lowerCase).toString();
        if (obj.length() == 0) {
            return false;
        }
        return (StringsKt.contains$default((CharSequence) obj, (CharSequence) "leg curl", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "hamstring curl", false, 2, (Object) null) || (StringsKt.contains$default((CharSequence) obj, (CharSequence) "hamstring", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) obj, (CharSequence) "curl", false, 2, (Object) null))) && !StringsKt.contains$default((CharSequence) obj, (CharSequence) "nordic", false, 2, (Object) null);
    }

    public final boolean isHipAbductorExercise(String exerciseName) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        String lowerCase = exerciseName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String obj = StringsKt.trim((CharSequence) lowerCase).toString();
        if (obj.length() == 0) {
            return false;
        }
        return (StringsKt.contains$default((CharSequence) obj, (CharSequence) "abduct", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "gluteus medius", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "hip abduction", false, 2, (Object) null)) && !StringsKt.contains$default((CharSequence) obj, (CharSequence) "adduct", false, 2, (Object) null);
    }

    public final boolean tagConflictsWithHipAbductor(String muscleTag) {
        String obj;
        if (muscleTag == null || (obj = StringsKt.trim((CharSequence) muscleTag).toString()) == null) {
            return false;
        }
        String lowerCase = obj.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase == null) {
            return false;
        }
        String str = lowerCase;
        if (str.length() == 0 || Intrinsics.areEqual(lowerCase, Vo2MaxRecord.MeasurementMethod.OTHER)) {
            return false;
        }
        return StringsKt.contains$default((CharSequence) str, (CharSequence) CORE, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "ab", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "oblique", false, 2, (Object) null) || Intrinsics.areEqual(groupToRegion(lowerCase), CORE);
    }

    public final boolean tagConflictsWithLegCurl(String muscleTag) {
        String obj;
        if (muscleTag == null || (obj = StringsKt.trim((CharSequence) muscleTag).toString()) == null) {
            return false;
        }
        String lowerCase = obj.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase == null) {
            return false;
        }
        String str = lowerCase;
        if (str.length() == 0 || Intrinsics.areEqual(lowerCase, Vo2MaxRecord.MeasurementMethod.OTHER)) {
            return false;
        }
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "bicep", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "forearm", false, 2, (Object) null) || (StringsKt.contains$default((CharSequence) str, (CharSequence) "arm", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "leg", false, 2, (Object) null)) || Intrinsics.areEqual(groupToRegion(lowerCase), BICEPS) || Intrinsics.areEqual(groupToRegion(lowerCase), ARMS) || Intrinsics.areEqual(groupToRegion(lowerCase), FOREARMS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        if (r13.equals(com.example.rungps.recovery.MuscleHeatmapRegions.TIBIALIS) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x015b, code lost:
    
        r14 = r14.get(com.example.rungps.recovery.MuscleHeatmapRegions.CALVES);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0161, code lost:
    
        if (r14 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0163, code lost:
    
        r14 = r14.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x016b, code lost:
    
        if (r14 <= 0.0f) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0171, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r13, com.example.rungps.recovery.MuscleHeatmapRegions.GASTROC) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0173, code lost:
    
        r13 = 0.6f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0186, code lost:
    
        r15 = r15 + (r14 * r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x017c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r13, com.example.rungps.recovery.MuscleHeatmapRegions.SOLEUS) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x017e, code lost:
    
        r13 = 0.4f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0182, code lost:
    
        r13 = 0.1f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0168, code lost:
    
        r14 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0118, code lost:
    
        if (r13.equals(com.example.rungps.recovery.MuscleHeatmapRegions.GASTROC) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
    
        if (r13.equals(com.example.rungps.recovery.MuscleHeatmapRegions.SOLEUS) == false) goto L117;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float fractionForRegion(Map<String, Float> split, String target) {
        float floatValue;
        float floatValue2;
        float f;
        Intrinsics.checkNotNullParameter(split, "split");
        Intrinsics.checkNotNullParameter(target, "target");
        String lowerCase = StringsKt.trim((CharSequence) target).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() == 0) {
            return 0.0f;
        }
        Float f2 = split.get(lowerCase);
        float floatValue3 = f2 != null ? f2.floatValue() : 0.0f;
        switch (lowerCase.hashCode()) {
            case -1367765738:
                if (lowerCase.equals(CALVES)) {
                    Float f3 = split.get(GASTROC);
                    float floatValue4 = floatValue3 + (f3 != null ? f3.floatValue() : 0.0f);
                    Float f4 = split.get(SOLEUS);
                    floatValue3 = floatValue4 + (f4 != null ? f4.floatValue() : 0.0f);
                    Float f5 = split.get(TIBIALIS);
                    if (f5 != null) {
                        floatValue = f5.floatValue();
                        floatValue3 += floatValue;
                        break;
                    }
                    floatValue = 0.0f;
                    floatValue3 += floatValue;
                }
                break;
            case -896785869:
                break;
            case -520819385:
                if (lowerCase.equals(TRAPS_LOWER)) {
                    Float f6 = split.get(TRAPS);
                    floatValue2 = f6 != null ? f6.floatValue() : 0.0f;
                    f = 0.2f;
                    floatValue = floatValue2 * f;
                    floatValue3 += floatValue;
                    break;
                }
                break;
            case -512484632:
                if (lowerCase.equals(TRAPS_UPPER)) {
                    Float f7 = split.get(TRAPS);
                    floatValue2 = f7 != null ? f7.floatValue() : 0.0f;
                    f = 0.45f;
                    floatValue = floatValue2 * f;
                    floatValue3 += floatValue;
                    break;
                }
                break;
            case -189599957:
                break;
            case 110621414:
                if (lowerCase.equals(TRAPS)) {
                    Float f8 = split.get(TRAPS_UPPER);
                    float floatValue5 = floatValue3 + (f8 != null ? f8.floatValue() : 0.0f);
                    Float f9 = split.get(TRAPS_MID);
                    floatValue3 = floatValue5 + (f9 != null ? f9.floatValue() : 0.0f);
                    Float f10 = split.get(TRAPS_LOWER);
                    if (f10 != null) {
                        floatValue = f10.floatValue();
                        floatValue3 += floatValue;
                        break;
                    }
                    floatValue = 0.0f;
                    floatValue3 += floatValue;
                }
                break;
            case 778132474:
                if (lowerCase.equals(HAMSTRINGS_MEDIAL)) {
                    Float f11 = split.get(HAMSTRINGS);
                    floatValue2 = f11 != null ? f11.floatValue() : 0.0f;
                    f = 0.52f;
                    floatValue = floatValue2 * f;
                    floatValue3 += floatValue;
                    break;
                }
                break;
            case 914014574:
                if (lowerCase.equals(HAMSTRINGS)) {
                    Float f12 = split.get(HAMSTRINGS_MEDIAL);
                    floatValue3 += f12 != null ? f12.floatValue() : 0.0f;
                    Float f13 = split.get(HAMSTRINGS_LATERAL);
                    if (f13 != null) {
                        floatValue = f13.floatValue();
                        floatValue3 += floatValue;
                        break;
                    }
                    floatValue = 0.0f;
                    floatValue3 += floatValue;
                }
                break;
            case 1107837454:
                if (lowerCase.equals(TRAPS_MID)) {
                    Float f14 = split.get(TRAPS);
                    floatValue2 = f14 != null ? f14.floatValue() : 0.0f;
                    f = 0.35f;
                    floatValue = floatValue2 * f;
                    floatValue3 += floatValue;
                    break;
                }
                break;
            case 1659923205:
                if (lowerCase.equals(HAMSTRINGS_LATERAL)) {
                    Float f15 = split.get(HAMSTRINGS);
                    floatValue2 = f15 != null ? f15.floatValue() : 0.0f;
                    f = 0.48f;
                    floatValue = floatValue2 * f;
                    floatValue3 += floatValue;
                    break;
                }
                break;
            case 1906765329:
                break;
        }
        return RangesKt.coerceIn(floatValue3, 0.0f, 1.0f);
    }

    private final boolean isUpperOnlyDay(String dayName) {
        String str;
        if (dayName != null) {
            str = dayName.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String str2 = str;
        return StringsKt.contains$default((CharSequence) str2, (CharSequence) "upper", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "lower", false, 2, (Object) null);
    }

    private final boolean isLegFocusedExercise(String exerciseName) {
        String lowerCase = exerciseName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String obj = StringsKt.trim((CharSequence) lowerCase).toString();
        if (obj.length() == 0) {
            return false;
        }
        return StringsKt.contains$default((CharSequence) obj, (CharSequence) "squat", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "leg press", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "leg curl", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "leg extension", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "lunge", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "hack squat", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "hip thrust", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "calf raise", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) TIBIALIS, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "rdl", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "romanian", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "deadlift", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "good morning", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "glute bridge", false, 2, (Object) null);
    }

    private final Map<String, Float> filterLegBiasForUpperDay(String dayName, String exerciseName, Map<String, Float> split) {
        if (!isUpperOnlyDay(dayName) || isLegFocusedExercise(exerciseName)) {
            return split;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Float> entry : split.entrySet()) {
            if (!legRegions.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        return linkedHashMap2.isEmpty() ? split : normalizeWeights(linkedHashMap2);
    }

    public static /* synthetic */ Map regionsForGymSet$default(MuscleHeatmapRegions muscleHeatmapRegions, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        return muscleHeatmapRegions.regionsForGymSet(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public final Map<String, Float> regionsForGymSet(String exerciseName, String muscleTag, String dayName, String secondaryTag, String tertiaryTag) {
        String str;
        String str2;
        String obj;
        String obj2;
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        String str3 = null;
        if (isLegHamstringCurl(exerciseName) && tagConflictsWithLegCurl(muscleTag)) {
            Map<String, Float> sharesForExercise = ExerciseMuscleShares.INSTANCE.sharesForExercise(exerciseName, null);
            if (!sharesForExercise.isEmpty()) {
                float coerceAtLeast = RangesKt.coerceAtLeast(CollectionsKt.sumOfFloat(sharesForExercise.values()), 0.01f);
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(sharesForExercise.size()));
                Iterator<T> it = sharesForExercise.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), Float.valueOf(((Number) entry.getValue()).floatValue() / coerceAtLeast));
                }
                return filterLegBiasForUpperDay(dayName, exerciseName, linkedHashMap);
            }
        }
        if (isHipAbductorExercise(exerciseName) && tagConflictsWithHipAbductor(muscleTag)) {
            Map<String, Float> sharesForExercise2 = ExerciseMuscleShares.INSTANCE.sharesForExercise(exerciseName, null);
            if (!sharesForExercise2.isEmpty()) {
                float coerceAtLeast2 = RangesKt.coerceAtLeast(CollectionsKt.sumOfFloat(sharesForExercise2.values()), 0.01f);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(sharesForExercise2.size()));
                Iterator<T> it2 = sharesForExercise2.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    linkedHashMap2.put(entry2.getKey(), Float.valueOf(((Number) entry2.getValue()).floatValue() / coerceAtLeast2));
                }
                return filterLegBiasForUpperDay(dayName, exerciseName, linkedHashMap2);
            }
        }
        if (muscleTag == null || (obj2 = StringsKt.trim((CharSequence) muscleTag).toString()) == null) {
            str = null;
        } else {
            str = obj2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        }
        String str4 = str;
        if (str4 != null && str4.length() != 0 && !Intrinsics.areEqual(str, Vo2MaxRecord.MeasurementMethod.OTHER)) {
            Map<String, Float> splitsForUserTag = splitsForUserTag(str, dayName);
            if (secondaryTag == null || (str2 = StringsKt.trim((CharSequence) secondaryTag).toString()) == null || str2.length() <= 0 || StringsKt.equals(str2, Vo2MaxRecord.MeasurementMethod.OTHER, true)) {
                str2 = null;
            }
            if (tertiaryTag != null && (obj = StringsKt.trim((CharSequence) tertiaryTag).toString()) != null && obj.length() > 0 && !StringsKt.equals(obj, Vo2MaxRecord.MeasurementMethod.OTHER, true)) {
                str3 = obj;
            }
            if (str2 != null && str3 != null) {
                splitsForUserTag = mergeThreeSplits(splitsForUserTag, splitsForUserTag(str2, dayName), splitsForUserTag(str3, dayName));
            } else if (str2 != null) {
                splitsForUserTag = mergeWeightedSplits(splitsForUserTag, splitsForUserTag(str2, dayName), 0.65f, 0.35f);
            }
            return filterLegBiasForUpperDay(dayName, exerciseName, splitsForUserTag);
        }
        Map<String, Float> sharesForExercise3 = ExerciseMuscleShares.INSTANCE.sharesForExercise(exerciseName, muscleTag);
        if (!sharesForExercise3.isEmpty() && CollectionsKt.sumOfFloat(sharesForExercise3.values()) > 0.01f) {
            float coerceAtLeast3 = RangesKt.coerceAtLeast(CollectionsKt.sumOfFloat(sharesForExercise3.values()), 0.01f);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(sharesForExercise3.size()));
            Iterator<T> it3 = sharesForExercise3.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it3.next();
                linkedHashMap3.put(entry3.getKey(), Float.valueOf(((Number) entry3.getValue()).floatValue() / coerceAtLeast3));
            }
            return filterLegBiasForUpperDay(dayName, exerciseName, linkedHashMap3);
        }
        String groupToRegion = groupToRegion(exerciseName);
        if (groupToRegion != null) {
            MuscleHeatmapRegions muscleHeatmapRegions = INSTANCE;
            return muscleHeatmapRegions.filterLegBiasForUpperDay(dayName, exerciseName, muscleHeatmapRegions.expandMacroRegion(groupToRegion));
        }
        return filterLegBiasForUpperDay(dayName, exerciseName, normalizeWeights(inferFromDay(dayName)));
    }

    public static /* synthetic */ Map splitsForUserTag$default(MuscleHeatmapRegions muscleHeatmapRegions, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return muscleHeatmapRegions.splitsForUserTag(str, str2);
    }

    public final Map<String, Float> splitsForUserTag(String tag, String dayName) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        String lowerCase = StringsKt.trim((CharSequence) tag).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (!Intrinsics.areEqual(lowerCase, "push")) {
            String str = lowerCase;
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "push day", false, 2, (Object) null)) {
                if (Intrinsics.areEqual(lowerCase, "pull") || StringsKt.contains$default((CharSequence) str, (CharSequence) "pull day", false, 2, (Object) null)) {
                    return normalizeWeights(inferFromDay("pull"));
                }
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "upper", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "lower", false, 2, (Object) null)) {
                    return normalizeWeights(inferFromDay("upper"));
                }
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "lower", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "upper", false, 2, (Object) null)) {
                    return normalizeWeights(inferFromDay("lower"));
                }
                String groupToRegion = groupToRegion(tag);
                if (groupToRegion != null) {
                    return INSTANCE.expandMacroRegion(groupToRegion);
                }
                return expandMacroRegion(regionForUserTag(tag));
            }
        }
        return normalizeWeights(inferFromDay("push"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final Map<String, Float> expandMacroRegion(String region) {
        int hashCode = region.hashCode();
        Float valueOf = Float.valueOf(0.45f);
        Float valueOf2 = Float.valueOf(0.2f);
        Float valueOf3 = Float.valueOf(0.28f);
        Float valueOf4 = Float.valueOf(0.14f);
        switch (hashCode) {
            case -1367765738:
                if (region.equals(CALVES)) {
                    return MapsKt.mapOf(TuplesKt.to(GASTROC, Float.valueOf(0.6f)), TuplesKt.to(SOLEUS, Float.valueOf(0.4f)));
                }
                break;
            case 3002775:
                if (region.equals(ARMS)) {
                    return MapsKt.mapOf(TuplesKt.to(BICEPS, Float.valueOf(0.42f)), TuplesKt.to(TRICEPS, Float.valueOf(0.33f)), TuplesKt.to(FOREARMS, Float.valueOf(0.25f)));
                }
                break;
            case 3015911:
                if (region.equals(BACK)) {
                    return MapsKt.mapOf(TuplesKt.to(LATS, valueOf3), TuplesKt.to(LOWER_BACK, valueOf2), TuplesKt.to(TRAPS, valueOf4), TuplesKt.to(SHOULDERS, valueOf4), TuplesKt.to(BICEPS, Float.valueOf(0.12f)), TuplesKt.to(CHEST, Float.valueOf(0.12f)));
                }
                break;
            case 3317797:
                if (region.equals(LEGS)) {
                    return MapsKt.mapOf(TuplesKt.to(QUADS, Float.valueOf(0.32f)), TuplesKt.to(HAMSTRINGS, valueOf3), TuplesKt.to(GLUTES, Float.valueOf(0.18f)), TuplesKt.to(HIP_FLEXORS, Float.valueOf(0.08f)), TuplesKt.to(CALVES, valueOf4));
                }
                break;
            case 110621414:
                if (region.equals(TRAPS)) {
                    return MapsKt.mapOf(TuplesKt.to(TRAPS_UPPER, valueOf), TuplesKt.to(TRAPS_MID, Float.valueOf(0.35f)), TuplesKt.to(TRAPS_LOWER, valueOf2));
                }
                break;
            case 466690131:
                if (region.equals(FOREARMS)) {
                    return MapsKt.mapOf(TuplesKt.to(FOREARM_FLEXORS, Float.valueOf(0.55f)), TuplesKt.to(FOREARM_EXTENSORS, valueOf));
                }
                break;
            case 914014574:
                if (region.equals(HAMSTRINGS)) {
                    return MapsKt.mapOf(TuplesKt.to(HAMSTRINGS_MEDIAL, Float.valueOf(0.52f)), TuplesKt.to(HAMSTRINGS_LATERAL, Float.valueOf(0.48f)));
                }
                break;
        }
        return MapsKt.mapOf(TuplesKt.to(region, Float.valueOf(1.0f)));
    }

    private final Map<String, Float> mergeWeightedSplits(Map<String, Float> primary, Map<String, Float> secondary, float primaryWeight, float secondaryWeight) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Float>> it = primary.entrySet().iterator();
        while (true) {
            float f = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Float> next = it.next();
            String key = next.getKey();
            float floatValue = next.getValue().floatValue();
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            Float f2 = (Float) linkedHashMap.get(key);
            if (f2 != null) {
                f = f2.floatValue();
            }
            linkedHashMap2.put(key, Float.valueOf(f + (floatValue * primaryWeight)));
        }
        for (Map.Entry<String, Float> entry : secondary.entrySet()) {
            String key2 = entry.getKey();
            float floatValue2 = entry.getValue().floatValue();
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            Float f3 = (Float) linkedHashMap.get(key2);
            linkedHashMap3.put(key2, Float.valueOf((f3 != null ? f3.floatValue() : 0.0f) + (floatValue2 * secondaryWeight)));
        }
        return normalizeWeights(linkedHashMap);
    }

    private final Map<String, Float> mergeThreeSplits(Map<String, Float> primary, Map<String, Float> secondary, Map<String, Float> tertiary) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Float>> it = primary.entrySet().iterator();
        while (true) {
            float f = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Float> next = it.next();
            String key = next.getKey();
            float floatValue = next.getValue().floatValue();
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            Float f2 = (Float) linkedHashMap.get(key);
            if (f2 != null) {
                f = f2.floatValue();
            }
            linkedHashMap2.put(key, Float.valueOf(f + (floatValue * 0.55f)));
        }
        for (Map.Entry<String, Float> entry : secondary.entrySet()) {
            String key2 = entry.getKey();
            float floatValue2 = entry.getValue().floatValue();
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            Float f3 = (Float) linkedHashMap.get(key2);
            linkedHashMap3.put(key2, Float.valueOf((f3 != null ? f3.floatValue() : 0.0f) + (floatValue2 * 0.3f)));
        }
        for (Map.Entry<String, Float> entry2 : tertiary.entrySet()) {
            String key3 = entry2.getKey();
            float floatValue3 = entry2.getValue().floatValue();
            LinkedHashMap linkedHashMap4 = linkedHashMap;
            Float f4 = (Float) linkedHashMap.get(key3);
            linkedHashMap4.put(key3, Float.valueOf((f4 != null ? f4.floatValue() : 0.0f) + (floatValue3 * 0.15f)));
        }
        return normalizeWeights(linkedHashMap);
    }

    private final Map<String, Float> normalizeWeights(Map<String, Float> weights) {
        float coerceAtLeast = RangesKt.coerceAtLeast(CollectionsKt.sumOfFloat(weights.values()), 0.01f);
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(weights.size()));
        Iterator<T> it = weights.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), Float.valueOf(((Number) entry.getValue()).floatValue() / coerceAtLeast));
        }
        return linkedHashMap;
    }

    public final Map<String, Float> regionsForRunRecovery() {
        return normalizeWeights(MapsKt.mapOf(TuplesKt.to(QUADS, Float.valueOf(0.32f)), TuplesKt.to(HAMSTRINGS, Float.valueOf(0.24f)), TuplesKt.to(CALVES, Float.valueOf(0.18f)), TuplesKt.to(GLUTES, Float.valueOf(0.12f)), TuplesKt.to(CORE, Float.valueOf(0.14f))));
    }

    public final Map<String, Float> regionsForBikeRecovery() {
        Float valueOf = Float.valueOf(0.14f);
        return normalizeWeights(MapsKt.mapOf(TuplesKt.to(QUADS, Float.valueOf(0.36f)), TuplesKt.to(GLUTES, Float.valueOf(0.22f)), TuplesKt.to(HAMSTRINGS, valueOf), TuplesKt.to(CALVES, valueOf), TuplesKt.to(CORE, valueOf)));
    }

    public final Map<String, Float> regionsForSoccerRecovery() {
        return normalizeWeights(MapsKt.mapOf(TuplesKt.to(QUADS, Float.valueOf(0.34f)), TuplesKt.to(HAMSTRINGS, Float.valueOf(0.2f)), TuplesKt.to(CALVES, Float.valueOf(0.18f)), TuplesKt.to(CORE, Float.valueOf(0.16f)), TuplesKt.to(GLUTES, Float.valueOf(0.12f))));
    }

    public final Map<String, Float> inferFromDay(String dayName) {
        String str;
        if (dayName != null) {
            str = dayName.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "lower", false, 2, (Object) null)) {
            return MapsKt.mapOf(TuplesKt.to(QUADS, Float.valueOf(0.85f)), TuplesKt.to(GLUTES, Float.valueOf(0.75f)), TuplesKt.to(HAMSTRINGS, Float.valueOf(0.7f)), TuplesKt.to(ADDUCTORS, Float.valueOf(0.55f)), TuplesKt.to(ABDUCTORS, Float.valueOf(0.5f)), TuplesKt.to(HIP_FLEXORS, Float.valueOf(0.4f)), TuplesKt.to(CALVES, Float.valueOf(0.45f)));
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "upper", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str2, (CharSequence) "pull", false, 2, (Object) null)) {
            return MapsKt.mapOf(TuplesKt.to(BACK, Float.valueOf(1.0f)), TuplesKt.to(ARMS, Float.valueOf(0.7f)), TuplesKt.to(SHOULDERS, Float.valueOf(0.5f)));
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "upper", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str2, (CharSequence) "push", false, 2, (Object) null)) {
            return MapsKt.mapOf(TuplesKt.to(CHEST, Float.valueOf(1.0f)), TuplesKt.to(SHOULDERS, Float.valueOf(0.8f)), TuplesKt.to(ARMS, Float.valueOf(0.75f)));
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "upper", false, 2, (Object) null)) {
            return MapsKt.mapOf(TuplesKt.to(CHEST, Float.valueOf(0.85f)), TuplesKt.to(BACK, Float.valueOf(0.75f)), TuplesKt.to(SHOULDERS, Float.valueOf(0.7f)), TuplesKt.to(ARMS, Float.valueOf(0.65f)));
        }
        return StringsKt.contains$default((CharSequence) str2, (CharSequence) "push", false, 2, (Object) null) ? MapsKt.mapOf(TuplesKt.to(CHEST, Float.valueOf(1.0f)), TuplesKt.to(SHOULDERS, Float.valueOf(0.75f)), TuplesKt.to(ARMS, Float.valueOf(0.7f))) : StringsKt.contains$default((CharSequence) str2, (CharSequence) "pull", false, 2, (Object) null) ? MapsKt.mapOf(TuplesKt.to(BACK, Float.valueOf(1.0f)), TuplesKt.to(ARMS, Float.valueOf(0.7f)), TuplesKt.to(SHOULDERS, Float.valueOf(0.45f))) : MapsKt.mapOf(TuplesKt.to(CHEST, Float.valueOf(0.5f)), TuplesKt.to(BACK, Float.valueOf(0.5f)), TuplesKt.to(LEGS, Float.valueOf(0.5f)), TuplesKt.to(SHOULDERS, Float.valueOf(0.4f)), TuplesKt.to(ARMS, Float.valueOf(0.4f)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Map regionHours$default(MuscleHeatmapRegions muscleHeatmapRegions, Map map, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return muscleHeatmapRegions.regionHours(map, list, str);
    }

    public final Map<String, Float> regionHours(Map<String, Float> groupHours, List<String> exerciseNames, String dayName) {
        Intrinsics.checkNotNullParameter(groupHours, "groupHours");
        Intrinsics.checkNotNullParameter(exerciseNames, "exerciseNames");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Float> entry : groupHours.entrySet()) {
            String key = entry.getKey();
            float floatValue = entry.getValue().floatValue();
            if (!StringsKt.equals(key, Vo2MaxRecord.MeasurementMethod.OTHER, true)) {
                for (Map.Entry<String, Float> entry2 : INSTANCE.splitsForUserTag(key, dayName).entrySet()) {
                    String key2 = entry2.getKey();
                    float floatValue2 = entry2.getValue().floatValue();
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    Float f = (Float) linkedHashMap.get(key2);
                    linkedHashMap2.put(key2, Float.valueOf((f != null ? f.floatValue() : 0.0f) + (floatValue2 * floatValue)));
                }
            }
        }
        Set<Map.Entry<String, Float>> entrySet = groupHours.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (StringsKt.equals((String) ((Map.Entry) obj).getKey(), Vo2MaxRecord.MeasurementMethod.OTHER, true)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        }
        float f2 = (float) d;
        if (linkedHashMap.isEmpty() && f2 > 0.0f) {
            distribute(linkedHashMap, f2, inferFromDay(dayName));
        } else if (f2 > 0.0f) {
            distribute(linkedHashMap, f2 * 0.35f, inferFromDay(dayName));
        }
        if (linkedHashMap.isEmpty() && !exerciseNames.isEmpty()) {
            Float maxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) groupHours.values());
            float floatValue3 = (maxOrNull != null ? maxOrNull.floatValue() : 8.0f) / RangesKt.coerceAtLeast(exerciseNames.size(), 1);
            Iterator<T> it2 = exerciseNames.iterator();
            while (it2.hasNext()) {
                for (Map.Entry entry3 : regionsForGymSet$default(INSTANCE, (String) it2.next(), null, dayName, null, null, 24, null).entrySet()) {
                    String str = (String) entry3.getKey();
                    float floatValue4 = ((Number) entry3.getValue()).floatValue();
                    LinkedHashMap linkedHashMap3 = linkedHashMap;
                    Float f3 = (Float) linkedHashMap.get(str);
                    linkedHashMap3.put(str, Float.valueOf((f3 != null ? f3.floatValue() : 0.0f) + (floatValue4 * floatValue3)));
                }
            }
        }
        if (linkedHashMap.isEmpty() && dayName != null) {
            Float maxOrNull2 = CollectionsKt.maxOrNull((Iterable<? extends Float>) groupHours.values());
            distribute(linkedHashMap, maxOrNull2 != null ? maxOrNull2.floatValue() : 8.0f, inferFromDay(dayName));
        }
        LinkedHashMap linkedHashMap4 = linkedHashMap;
        if (!linkedHashMap4.isEmpty()) {
            return linkedHashMap4;
        }
        List<String> list = allRegions;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj2 : list) {
            linkedHashMap5.put(obj2, Float.valueOf(0.0f));
        }
        return linkedHashMap5;
    }

    private final void distribute(Map<String, Float> target, float hours, Map<String, Float> weights) {
        float coerceAtLeast = RangesKt.coerceAtLeast(CollectionsKt.sumOfFloat(weights.values()), 0.01f);
        for (Map.Entry<String, Float> entry : weights.entrySet()) {
            String key = entry.getKey();
            float floatValue = (entry.getValue().floatValue() / coerceAtLeast) * hours;
            for (Map.Entry<String, Float> entry2 : INSTANCE.expandMacroRegion(key).entrySet()) {
                String key2 = entry2.getKey();
                float floatValue2 = entry2.getValue().floatValue();
                Float f = target.get(key2);
                target.put(key2, Float.valueOf((f != null ? f.floatValue() : 0.0f) + (floatValue2 * floatValue)));
            }
        }
    }
}
