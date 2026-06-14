package com.example.rungps.analytics;

import com.example.rungps.data.ExerciseNameNormalizer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: GymSetVolume.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u0012¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/analytics/GymSetVolume;", "", "<init>", "()V", "tonnageKg", "", "weightKg", "reps", "", "unilateral", "", "repFactor", "", "(DLjava/lang/Integer;ZF)D", "isUnilateralForExercise", "exerciseName", "", "unilateralLookup", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymSetVolume {
    public static final int $stable = 0;
    public static final GymSetVolume INSTANCE = new GymSetVolume();

    private GymSetVolume() {
    }

    public static /* synthetic */ double tonnageKg$default(GymSetVolume gymSetVolume, double d, Integer num, boolean z, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        return gymSetVolume.tonnageKg(d, num, z2, f);
    }

    public final double tonnageKg(double weightKg, Integer reps, boolean unilateral, float repFactor) {
        return weightKg * RangesKt.coerceAtLeast(reps != null ? reps.intValue() : 1, 1) * repFactor * (unilateral ? 2.0d : 1.0d);
    }

    public final boolean isUnilateralForExercise(String exerciseName, Map<String, Boolean> unilateralLookup) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Intrinsics.checkNotNullParameter(unilateralLookup, "unilateralLookup");
        String lowerCase = StringsKt.trim((CharSequence) exerciseName).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual((Object) unilateralLookup.get(lowerCase), (Object) true)) {
            return true;
        }
        String canonicalKey = ExerciseNameNormalizer.INSTANCE.canonicalKey(exerciseName);
        Set<Map.Entry<String, Boolean>> entrySet = unilateralLookup.entrySet();
        if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (((Boolean) entry.getValue()).booleanValue() && Intrinsics.areEqual(ExerciseNameNormalizer.INSTANCE.canonicalKey(str), canonicalKey)) {
                    return true;
                }
            }
        }
        return false;
    }
}
