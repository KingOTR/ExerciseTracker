package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.request.DataType;
import com.samsung.android.sdk.health.data.request.DataTypes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes5.dex */
public final class s extends HashMap {
    public s() {
        put(DataTypes.HEART_RATE, new HashSet(Arrays.asList(DataType.HeartRateType.MIN, DataType.HeartRateType.MAX)));
        put(DataTypes.SLEEP, new HashSet(Arrays.asList(DataType.SleepType.TOTAL_DURATION)));
        put(DataTypes.SLEEP_GOAL, new HashSet(Arrays.asList(DataType.SleepGoalType.LAST_BED_TIME, DataType.SleepGoalType.LAST_WAKE_UP_TIME)));
        put(DataTypes.STEPS_GOAL, new HashSet(Arrays.asList(DataType.StepsGoalType.LAST)));
        put(DataTypes.STEPS, new HashSet(Arrays.asList(DataType.StepsType.TOTAL)));
        put(DataTypes.ACTIVE_CALORIES_BURNED_GOAL, new HashSet(Arrays.asList(DataType.ActiveCaloriesBurnedGoalType.LAST)));
        put(DataTypes.ACTIVE_TIME_GOAL, new HashSet(Arrays.asList(DataType.ActiveTimeGoalType.LAST)));
        put(DataTypes.WATER_INTAKE, new HashSet(Arrays.asList(DataType.WaterIntakeType.TOTAL)));
        put(DataTypes.WATER_INTAKE_GOAL, new HashSet(Arrays.asList(DataType.WaterIntakeGoalType.LAST)));
        put(DataTypes.NUTRITION, new HashSet(Arrays.asList(DataType.NutritionType.TOTAL_CALORIES)));
        put(DataTypes.NUTRITION_GOAL, new HashSet(Arrays.asList(DataType.NutritionGoalType.LAST_CALORIES)));
        put(DataTypes.EXERCISE, new HashSet(Arrays.asList(DataType.ExerciseType.TOTAL_CALORIES, DataType.ExerciseType.TOTAL_DURATION)));
        put(DataTypes.FLOORS_CLIMBED, new HashSet(Arrays.asList(DataType.FloorsClimbedType.TOTAL)));
        put(DataTypes.ACTIVITY_SUMMARY, new HashSet(Arrays.asList(DataType.ActivitySummaryType.TOTAL_ACTIVE_CALORIES_BURNED, DataType.ActivitySummaryType.TOTAL_CALORIES_BURNED, DataType.ActivitySummaryType.TOTAL_ACTIVE_TIME, DataType.ActivitySummaryType.TOTAL_DISTANCE)));
    }
}
