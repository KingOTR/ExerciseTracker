package com.example.rungps.recovery;

import com.example.rungps.analytics.ExerciseMuscleShares;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: MuscleRegionAttribution.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f¨\u0006\u000e"}, d2 = {"Lcom/example/rungps/recovery/MuscleRegionAttribution;", "", "<init>", "()V", "explain", "", "exerciseName", "primaryTag", "templateDayName", "secondaryTag", "targetRegion", "regionSplit", "", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MuscleRegionAttribution {
    public static final int $stable = 0;
    public static final MuscleRegionAttribution INSTANCE = new MuscleRegionAttribution();

    private MuscleRegionAttribution() {
    }

    public static /* synthetic */ String explain$default(MuscleRegionAttribution muscleRegionAttribution, String str, String str2, String str3, String str4, String str5, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        return muscleRegionAttribution.explain(str, str2, str3, str4, str5, map);
    }

    public final String explain(String exerciseName, String primaryTag, String templateDayName, String secondaryTag, String targetRegion, Map<String, Float> regionSplit) {
        String str;
        String obj;
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Intrinsics.checkNotNullParameter(templateDayName, "templateDayName");
        Intrinsics.checkNotNullParameter(targetRegion, "targetRegion");
        Intrinsics.checkNotNullParameter(regionSplit, "regionSplit");
        String obj2 = StringsKt.trim((CharSequence) targetRegion).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = obj2.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        float fractionForRegion = MuscleHeatmapRegions.INSTANCE.fractionForRegion(regionSplit, lowerCase);
        if (fractionForRegion <= 0.0f) {
            return "";
        }
        int coerceIn = RangesKt.coerceIn((int) (fractionForRegion * 100.0f), 1, 100);
        String str2 = primaryTag;
        if (str2 == null || StringsKt.isBlank(str2)) {
            str = ExerciseMuscleShares.INSTANCE.hasCuratedMatch(exerciseName) ? "built-in exercise map" : "estimated muscle mapping";
        } else {
            str = "primary tag «" + primaryTag + "»";
        }
        String obj3 = StringsKt.trim((CharSequence) templateDayName).toString();
        String str3 = null;
        if (obj3.length() <= 0) {
            obj3 = null;
        }
        String str4 = obj3 != null ? " · " + obj3 + " split" : null;
        if (str4 == null) {
            str4 = "";
        }
        if (secondaryTag != null && (obj = StringsKt.trim((CharSequence) secondaryTag).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                str3 = " · secondary tag " + obj;
            }
        }
        return coerceIn + "% counted here via " + str + str4 + (str3 != null ? str3 : "") + " · " + CollectionsKt.joinToString$default(CollectionsKt.take(CollectionsKt.sortedWith(regionSplit.entrySet(), new Comparator() { // from class: com.example.rungps.recovery.MuscleRegionAttribution$explain$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Float) ((Map.Entry) t2).getValue(), (Float) ((Map.Entry) t).getValue());
            }
        }), 3), ", ", null, null, 0, null, new Function1() { // from class: com.example.rungps.recovery.MuscleRegionAttribution$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                CharSequence explain$lambda$5;
                explain$lambda$5 = MuscleRegionAttribution.explain$lambda$5((Map.Entry) obj4);
                return explain$lambda$5;
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence explain$lambda$5(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        return MuscleAnatomyCatalog.INSTANCE.infoFor((String) entry.getKey()).getDisplayName() + " " + ((int) (((Number) entry.getValue()).floatValue() * 100.0f)) + "%";
    }
}
