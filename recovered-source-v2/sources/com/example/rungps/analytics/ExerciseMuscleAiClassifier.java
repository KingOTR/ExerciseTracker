package com.example.rungps.analytics;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.recovery.MuscleHeatmapRegions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ExerciseMuscleAiClassifier.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/analytics/ExerciseMuscleAiClassifier;", "", "<init>", "()V", "isUnilateralHeuristic", "", "exerciseName", "", "classify", "Lcom/example/rungps/analytics/ExerciseMuscleAiClassifier$Result;", "sharesForExercise", "", "", "regionToLabel", "region", "scoreExercise", HintConstants.AUTOFILL_HINT_NAME, "Result", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseMuscleAiClassifier {
    public static final int $stable = 0;
    public static final ExerciseMuscleAiClassifier INSTANCE = new ExerciseMuscleAiClassifier();

    private ExerciseMuscleAiClassifier() {
    }

    /* compiled from: ExerciseMuscleAiClassifier.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015¨\u0006\""}, d2 = {"Lcom/example/rungps/analytics/ExerciseMuscleAiClassifier$Result;", "", "primaryRegion", "", "secondaryRegion", "primaryLabel", "secondaryLabel", "regionShares", "", "", "isUnilateral", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "getPrimaryRegion", "()Ljava/lang/String;", "getSecondaryRegion", "getPrimaryLabel", "getSecondaryLabel", "getRegionShares", "()Ljava/util/Map;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {
        public static final int $stable = 8;
        private final boolean isUnilateral;
        private final String primaryLabel;
        private final String primaryRegion;
        private final Map<String, Float> regionShares;
        private final String secondaryLabel;
        private final String secondaryRegion;

        public static /* synthetic */ Result copy$default(Result result, String str, String str2, String str3, String str4, Map map, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = result.primaryRegion;
            }
            if ((i & 2) != 0) {
                str2 = result.secondaryRegion;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = result.primaryLabel;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = result.secondaryLabel;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                map = result.regionShares;
            }
            Map map2 = map;
            if ((i & 32) != 0) {
                z = result.isUnilateral;
            }
            return result.copy(str, str5, str6, str7, map2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPrimaryRegion() {
            return this.primaryRegion;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSecondaryRegion() {
            return this.secondaryRegion;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPrimaryLabel() {
            return this.primaryLabel;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSecondaryLabel() {
            return this.secondaryLabel;
        }

        public final Map<String, Float> component5() {
            return this.regionShares;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsUnilateral() {
            return this.isUnilateral;
        }

        public final Result copy(String primaryRegion, String secondaryRegion, String primaryLabel, String secondaryLabel, Map<String, Float> regionShares, boolean isUnilateral) {
            Intrinsics.checkNotNullParameter(primaryRegion, "primaryRegion");
            Intrinsics.checkNotNullParameter(primaryLabel, "primaryLabel");
            Intrinsics.checkNotNullParameter(regionShares, "regionShares");
            return new Result(primaryRegion, secondaryRegion, primaryLabel, secondaryLabel, regionShares, isUnilateral);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.primaryRegion, result.primaryRegion) && Intrinsics.areEqual(this.secondaryRegion, result.secondaryRegion) && Intrinsics.areEqual(this.primaryLabel, result.primaryLabel) && Intrinsics.areEqual(this.secondaryLabel, result.secondaryLabel) && Intrinsics.areEqual(this.regionShares, result.regionShares) && this.isUnilateral == result.isUnilateral;
        }

        public int hashCode() {
            int hashCode = this.primaryRegion.hashCode() * 31;
            String str = this.secondaryRegion;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.primaryLabel.hashCode()) * 31;
            String str2 = this.secondaryLabel;
            return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.regionShares.hashCode()) * 31) + Boolean.hashCode(this.isUnilateral);
        }

        public String toString() {
            return "Result(primaryRegion=" + this.primaryRegion + ", secondaryRegion=" + this.secondaryRegion + ", primaryLabel=" + this.primaryLabel + ", secondaryLabel=" + this.secondaryLabel + ", regionShares=" + this.regionShares + ", isUnilateral=" + this.isUnilateral + ")";
        }

        public Result(String primaryRegion, String str, String primaryLabel, String str2, Map<String, Float> regionShares, boolean z) {
            Intrinsics.checkNotNullParameter(primaryRegion, "primaryRegion");
            Intrinsics.checkNotNullParameter(primaryLabel, "primaryLabel");
            Intrinsics.checkNotNullParameter(regionShares, "regionShares");
            this.primaryRegion = primaryRegion;
            this.secondaryRegion = str;
            this.primaryLabel = primaryLabel;
            this.secondaryLabel = str2;
            this.regionShares = regionShares;
            this.isUnilateral = z;
        }

        public /* synthetic */ Result(String str, String str2, String str3, String str4, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, map, (i & 32) != 0 ? false : z);
        }

        public final String getPrimaryRegion() {
            return this.primaryRegion;
        }

        public final String getSecondaryRegion() {
            return this.secondaryRegion;
        }

        public final String getPrimaryLabel() {
            return this.primaryLabel;
        }

        public final String getSecondaryLabel() {
            return this.secondaryLabel;
        }

        public final Map<String, Float> getRegionShares() {
            return this.regionShares;
        }

        public final boolean isUnilateral() {
            return this.isUnilateral;
        }
    }

    public final boolean isUnilateralHeuristic(String exerciseName) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        String lowerCase = exerciseName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = lowerCase;
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "single", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "unilateral", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "one arm", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "one leg", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "one-arm", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "one-leg", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "single-arm", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "single-leg", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "single arm", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "single leg", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "1-arm", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "1 arm", false, 2, (Object) null);
    }

    public final Result classify(String exerciseName) {
        String str;
        Map mapOf;
        String str2;
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Set<Map.Entry<String, Float>> entrySet = scoreExercise(exerciseName).entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (((Number) ((Map.Entry) obj).getValue()).floatValue() > 0.05f) {
                arrayList.add(obj);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.rungps.analytics.ExerciseMuscleAiClassifier$classify$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Float) ((Map.Entry) t2).getValue(), (Float) ((Map.Entry) t).getValue());
            }
        });
        Map.Entry entry = (Map.Entry) CollectionsKt.firstOrNull(sortedWith);
        if (entry == null || (str = (String) entry.getKey()) == null) {
            str = MuscleHeatmapRegions.BACK;
        }
        String str3 = str;
        Map.Entry entry2 = (Map.Entry) CollectionsKt.getOrNull(sortedWith, 1);
        String str4 = (entry2 == null || (str2 = (String) entry2.getKey()) == null || Intrinsics.areEqual(str2, str3)) ? null : str2;
        Map.Entry entry3 = (Map.Entry) CollectionsKt.firstOrNull(sortedWith);
        float floatValue = entry3 != null ? ((Number) entry3.getValue()).floatValue() : 1.0f;
        Map.Entry entry4 = (Map.Entry) CollectionsKt.getOrNull(sortedWith, 1);
        float floatValue2 = entry4 != null ? ((Number) entry4.getValue()).floatValue() : 0.0f;
        if (str4 != null && floatValue2 > 0.0f) {
            float f = floatValue + floatValue2;
            mapOf = MapsKt.mapOf(TuplesKt.to(str3, Float.valueOf(floatValue / f)), TuplesKt.to(str4, Float.valueOf(floatValue2 / f)));
        } else {
            mapOf = MapsKt.mapOf(TuplesKt.to(str3, Float.valueOf(1.0f)));
        }
        return new Result(str3, str4, regionToLabel(str3), str4 != null ? INSTANCE.regionToLabel(str4) : null, mapOf, isUnilateralHeuristic(exerciseName));
    }

    public final Map<String, Float> sharesForExercise(String exerciseName) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        return classify(exerciseName).getRegionShares();
    }

    private final String regionToLabel(String region) {
        if (region.length() <= 0) {
            return region;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = region.charAt(0);
        StringBuilder append = sb.append((Object) (Character.isLowerCase(charAt) ? CharsKt.titlecase(charAt) : String.valueOf(charAt)));
        String substring = region.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return append.append(substring).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x06b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Map<String, Float> scoreExercise(String name) {
        String str;
        String str2;
        String str3;
        String str4;
        String groupToRegion;
        String lowerCase = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String obj = StringsKt.trim((CharSequence) lowerCase).toString();
        String str5 = obj;
        if (str5.length() == 0) {
            return MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.BACK, Float.valueOf(1.0f)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<String> split = new Regex("[\\s/\\-_,.+]+").split(str5, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : split) {
            if (((String) obj2).length() > 1) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = arrayList;
        boolean contains$default = StringsKt.contains$default((CharSequence) str5, (CharSequence) "back squat", false, 2, (Object) null);
        String str6 = MuscleHeatmapRegions.CHEST;
        if (contains$default) {
            str = MuscleHeatmapRegions.LOWER_BACK;
            str2 = obj;
            str3 = MuscleHeatmapRegions.LATS;
            str4 = MuscleHeatmapRegions.TRICEPS;
        } else {
            if (!StringsKt.contains$default((CharSequence) str5, (CharSequence) "squat", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str5, (CharSequence) "leg press", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str5, (CharSequence) "hack squat", false, 2, (Object) null)) {
                if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "deadlift", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "rdl", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "romanian", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "good morning", false, 2, (Object) null)) {
                    str3 = MuscleHeatmapRegions.LATS;
                    str6 = MuscleHeatmapRegions.CHEST;
                    str4 = MuscleHeatmapRegions.TRICEPS;
                    str2 = obj;
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.HAMSTRINGS, 0.3f);
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.GLUTES, 0.28f);
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.LOWER_BACK, 0.26f);
                    scoreExercise$add(linkedHashMap, str3, 0.1f);
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.TRAPS, 0.06f);
                } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "lunge", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "split squat", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "step-up", false, 2, (Object) null)) {
                    str2 = obj;
                    str3 = MuscleHeatmapRegions.LATS;
                    str6 = MuscleHeatmapRegions.CHEST;
                    str4 = MuscleHeatmapRegions.TRICEPS;
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.QUADS, 0.38f);
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.GLUTES, 0.34f);
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.HAMSTRINGS, 0.2f);
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.CORE, 0.08f);
                } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "bench", false, 2, (Object) null) || (StringsKt.contains$default((CharSequence) str5, (CharSequence) "press", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str5, (CharSequence) "leg", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str5, (CharSequence) "overhead", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str5, (CharSequence) "shoulder", false, 2, (Object) null))) {
                    str2 = obj;
                    str3 = MuscleHeatmapRegions.LATS;
                    str6 = MuscleHeatmapRegions.CHEST;
                    str4 = MuscleHeatmapRegions.TRICEPS;
                    scoreExercise$add(linkedHashMap, str6, 0.45f);
                    scoreExercise$add(linkedHashMap, str4, 0.28f);
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.SHOULDERS, 0.27f);
                } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "rear delt", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "reverse fly", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "reverse pec", false, 2, (Object) null)) {
                    str2 = obj;
                    str3 = MuscleHeatmapRegions.LATS;
                    str6 = MuscleHeatmapRegions.CHEST;
                    str4 = MuscleHeatmapRegions.TRICEPS;
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.SHOULDERS, 0.82f);
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.TRAPS, 0.18f);
                } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "fly", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "pec deck", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "cable crossover", false, 2, (Object) null)) {
                    str2 = obj;
                    str3 = MuscleHeatmapRegions.LATS;
                    str6 = MuscleHeatmapRegions.CHEST;
                    str4 = MuscleHeatmapRegions.TRICEPS;
                    scoreExercise$add(linkedHashMap, str6, 0.72f);
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.SHOULDERS, 0.28f);
                } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "row", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "pulldown", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "pull-up", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "pullup", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "chin", false, 2, (Object) null)) {
                    str6 = MuscleHeatmapRegions.CHEST;
                    str4 = MuscleHeatmapRegions.TRICEPS;
                    str3 = MuscleHeatmapRegions.LATS;
                    scoreExercise$add(linkedHashMap, str3, 0.42f);
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.BICEPS, 0.24f);
                    str2 = obj;
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.LOWER_BACK, 0.18f);
                    scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.TRAPS, 0.16f);
                } else {
                    if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "overhead", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "ohp", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "military press", false, 2, (Object) null)) {
                        str6 = MuscleHeatmapRegions.CHEST;
                        str4 = MuscleHeatmapRegions.TRICEPS;
                        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.SHOULDERS, 0.48f);
                        scoreExercise$add(linkedHashMap, str4, 0.28f);
                        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.TRAPS, 0.14f);
                        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.CORE, 0.1f);
                    } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "lateral raise", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "front raise", false, 2, (Object) null)) {
                        str6 = MuscleHeatmapRegions.CHEST;
                        str4 = MuscleHeatmapRegions.TRICEPS;
                        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.SHOULDERS, 0.78f);
                        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.TRAPS, 0.22f);
                    } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "leg curl", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "hamstring curl", false, 2, (Object) null) || (StringsKt.contains$default((CharSequence) str5, (CharSequence) "hamstring", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str5, (CharSequence) "curl", false, 2, (Object) null))) {
                        str6 = MuscleHeatmapRegions.CHEST;
                        str4 = MuscleHeatmapRegions.TRICEPS;
                        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.HAMSTRINGS, 0.92f);
                        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.CALVES, 0.08f);
                    } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "hip flex", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "psoas", false, 2, (Object) null)) {
                        str6 = MuscleHeatmapRegions.CHEST;
                        str4 = MuscleHeatmapRegions.TRICEPS;
                        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.HIP_FLEXORS, 0.78f);
                        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.CORE, 0.14f);
                        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.QUADS, 0.08f);
                    } else {
                        if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "curl", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str5, (CharSequence) "leg", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str5, (CharSequence) "hamstring", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str5, (CharSequence) "nordic", false, 2, (Object) null)) {
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.BICEPS, 0.72f);
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.FOREARMS, 0.28f);
                        } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "tricep", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "pushdown", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "dip", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "skull crush", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "skullcrush", false, 2, (Object) null) || (StringsKt.contains$default((CharSequence) str5, (CharSequence) "skull", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str5, (CharSequence) "crush", false, 2, (Object) null))) {
                            str4 = MuscleHeatmapRegions.TRICEPS;
                            scoreExercise$add(linkedHashMap, str4, 0.7f);
                            str6 = MuscleHeatmapRegions.CHEST;
                            scoreExercise$add(linkedHashMap, str6, 0.18f);
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.SHOULDERS, 0.12f);
                        } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "calf", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) MuscleHeatmapRegions.SOLEUS, false, 2, (Object) null)) {
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.CALVES, 1.0f);
                        } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "crunch", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "plank", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "ab ", false, 2, (Object) null) || StringsKt.endsWith$default(obj, " abs", false, 2, (Object) null)) {
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.CORE, 0.85f);
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.QUADS, 0.15f);
                        } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "hip thrust", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "glute bridge", false, 2, (Object) null)) {
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.GLUTES, 0.72f);
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.HAMSTRINGS, 0.28f);
                        } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "abduct", false, 2, (Object) null)) {
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.ABDUCTORS, 0.78f);
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.GLUTES, 0.22f);
                        } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "adduct", false, 2, (Object) null)) {
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.ADDUCTORS, 0.82f);
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.QUADS, 0.18f);
                        } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "shrug", false, 2, (Object) null)) {
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.TRAPS, 0.85f);
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.FOREARMS, 0.15f);
                        } else if (StringsKt.contains$default((CharSequence) str5, (CharSequence) "face pull", false, 2, (Object) null)) {
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.SHOULDERS, 0.45f);
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.TRAPS, 0.35f);
                            scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.BICEPS, 0.2f);
                        }
                        str2 = obj;
                        str3 = MuscleHeatmapRegions.LATS;
                        str6 = MuscleHeatmapRegions.CHEST;
                        str4 = MuscleHeatmapRegions.TRICEPS;
                    }
                    str2 = obj;
                    str3 = MuscleHeatmapRegions.LATS;
                }
                for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(str6, str6), TuplesKt.to("pec", str6), TuplesKt.to("incline", str6), TuplesKt.to("decline", str6), TuplesKt.to("lat", str3), TuplesKt.to("pulldown", str3), TuplesKt.to("pull", str3), TuplesKt.to(MuscleHeatmapRegions.BACK, MuscleHeatmapRegions.BACK), TuplesKt.to("trap", MuscleHeatmapRegions.TRAPS), TuplesKt.to("delt", MuscleHeatmapRegions.SHOULDERS), TuplesKt.to("shoulder", MuscleHeatmapRegions.SHOULDERS), TuplesKt.to("quad", MuscleHeatmapRegions.QUADS), TuplesKt.to("ham", MuscleHeatmapRegions.HAMSTRINGS), TuplesKt.to("glute", MuscleHeatmapRegions.GLUTES), TuplesKt.to("abduct", MuscleHeatmapRegions.ABDUCTORS), TuplesKt.to("adduct", MuscleHeatmapRegions.ADDUCTORS), TuplesKt.to("bicep", MuscleHeatmapRegions.BICEPS), TuplesKt.to("tricep", str4), TuplesKt.to("forearm", MuscleHeatmapRegions.FOREARMS), TuplesKt.to(MuscleHeatmapRegions.CORE, MuscleHeatmapRegions.CORE), TuplesKt.to("ab", MuscleHeatmapRegions.CORE), TuplesKt.to("calf", MuscleHeatmapRegions.CALVES), TuplesKt.to("leg extension", MuscleHeatmapRegions.QUADS), TuplesKt.to("leg curl", MuscleHeatmapRegions.HAMSTRINGS), TuplesKt.to("hip flex", MuscleHeatmapRegions.HIP_FLEXORS), TuplesKt.to("psoas", MuscleHeatmapRegions.HIP_FLEXORS)})) {
                    String str7 = (String) pair.component1();
                    String str8 = (String) pair.component2();
                    String str9 = str7;
                    if (!StringsKt.contains$default((CharSequence) str5, (CharSequence) str9, false, 2, (Object) null)) {
                        ArrayList<String> arrayList3 = arrayList2;
                        if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                            for (String str10 : arrayList3) {
                                if (!StringsKt.contains$default((CharSequence) str10, (CharSequence) str9, false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str9, (CharSequence) str10, false, 2, (Object) null)) {
                                }
                            }
                        }
                    }
                    scoreExercise$add(linkedHashMap, str8, 0.35f);
                }
                groupToRegion = MuscleHeatmapRegions.INSTANCE.groupToRegion(str2);
                if (groupToRegion != null) {
                    scoreExercise$add(linkedHashMap, groupToRegion, 0.5f);
                }
                if (!linkedHashMap.isEmpty()) {
                    return MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.BACK, Float.valueOf(0.4f)), TuplesKt.to(str6, Float.valueOf(0.35f)), TuplesKt.to(MuscleHeatmapRegions.LEGS, Float.valueOf(0.25f)));
                }
                Collection values = linkedHashMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                float coerceAtLeast = RangesKt.coerceAtLeast(CollectionsKt.sumOfFloat(values), 0.01f);
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    linkedHashMap3.put(entry.getKey(), Float.valueOf(((Number) entry.getValue()).floatValue() / coerceAtLeast));
                }
                return linkedHashMap3;
            }
            str = MuscleHeatmapRegions.LOWER_BACK;
            str3 = MuscleHeatmapRegions.LATS;
            str6 = MuscleHeatmapRegions.CHEST;
            str4 = MuscleHeatmapRegions.TRICEPS;
            str2 = obj;
        }
        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.QUADS, 0.48f);
        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.GLUTES, 0.3f);
        scoreExercise$add(linkedHashMap, str, 0.14f);
        scoreExercise$add(linkedHashMap, MuscleHeatmapRegions.CORE, 0.08f);
        while (r0.hasNext()) {
        }
        groupToRegion = MuscleHeatmapRegions.INSTANCE.groupToRegion(str2);
        if (groupToRegion != null) {
        }
        if (!linkedHashMap.isEmpty()) {
        }
    }

    private static final void scoreExercise$add(LinkedHashMap<String, Float> linkedHashMap, String str, float f) {
        LinkedHashMap<String, Float> linkedHashMap2 = linkedHashMap;
        Float f2 = linkedHashMap.get(str);
        linkedHashMap2.put(str, Float.valueOf((f2 != null ? f2.floatValue() : 0.0f) + f));
    }
}
