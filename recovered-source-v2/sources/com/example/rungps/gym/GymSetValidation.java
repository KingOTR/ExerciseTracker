package com.example.rungps.gym;

import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* compiled from: GymSetValidation.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/example/rungps/gym/GymSetValidation;", "", "<init>", "()V", "MAX_WEIGHT_KG", "", "MAX_REPS", "", "validateSet", "", "weightKg", "reps", "(DLjava/lang/Integer;)Ljava/lang/String;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymSetValidation {
    public static final int $stable = 0;
    public static final GymSetValidation INSTANCE = new GymSetValidation();
    public static final int MAX_REPS = 100;
    public static final double MAX_WEIGHT_KG = 500.0d;

    private GymSetValidation() {
    }

    public final String validateSet(double weightKg, Integer reps) {
        if (weightKg <= 0.0d) {
            return "Enter a weight above 0 kg";
        }
        if (weightKg > 500.0d) {
            return "Weight must be at most 500 kg";
        }
        if (reps == null || new IntRange(1, 100).contains(reps.intValue())) {
            return null;
        }
        return "Reps must be between 1 and 100";
    }
}
