package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.request.DataTypes;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class l0 {
    public static final List a = CollectionsKt.listOf((Object[]) new j0[]{i0.a, h0.a, k0.a});
    public static final Set b = SetsKt.setOf((Object[]) new String[]{DataTypes.SLEEP.getName(), DataTypes.STEPS.getName(), DataTypes.BLOOD_GLUCOSE.getName(), DataTypes.HEART_RATE.getName(), DataTypes.EXERCISE.getName(), DataTypes.SKIN_TEMPERATURE.getName(), DataTypes.BLOOD_OXYGEN.getName(), DataTypes.ACTIVITY_SUMMARY.getName(), DataTypes.FLOORS_CLIMBED.getName()});
    public static final Set c = SetsKt.setOf((Object[]) new String[]{DataTypes.BLOOD_PRESSURE.getName(), DataTypes.BODY_COMPOSITION.getName(), DataTypes.SLEEP_GOAL.getName(), DataTypes.STEPS_GOAL.getName(), DataTypes.ACTIVE_CALORIES_BURNED_GOAL.getName(), DataTypes.ACTIVE_TIME_GOAL.getName(), DataTypes.WATER_INTAKE.getName(), DataTypes.WATER_INTAKE_GOAL.getName(), DataTypes.NUTRITION.getName(), DataTypes.ENERGY_SCORE.getName(), DataTypes.NUTRITION_GOAL.getName(), DataTypes.SLEEP_APNEA.getName(), DataTypes.IRREGULAR_HEART_RHYTHM_NOTIFICATION.getName(), DataTypes.BODY_TEMPERATURE.getName()});

    public static Instant a(LocalDateTime time, ZoneOffset zoneOffset) {
        Intrinsics.checkNotNullParameter(time, "time");
        if (zoneOffset == null) {
            zoneOffset = ZoneOffset.systemDefault().getRules().getOffset(time);
        }
        Instant instant = time.toInstant(zoneOffset);
        Intrinsics.checkNotNullExpressionValue(instant, "time.toInstant(defaultZoneOffset)");
        return instant;
    }
}
