package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.request.DataType;
import com.samsung.android.sdk.health.data.request.DataTypes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes5.dex */
public final class q extends HashMap {
    public q() {
        put(DataTypes.BLOOD_GLUCOSE, new HashSet(Arrays.asList(DataType.BloodGlucoseType.GLUCOSE_LEVEL, DataType.BloodGlucoseType.SERIES_DATA, DataType.BloodGlucoseType.MEASUREMENT_TYPE, DataType.BloodGlucoseType.SAMPLE_SOURCE_TYPE, DataType.BloodGlucoseType.MEAL_TIME, DataType.BloodGlucoseType.MEAL_STATUS, DataType.BloodGlucoseType.INSULIN_INJECTED, DataType.BloodGlucoseType.MEDICATION_TAKEN)));
        put(DataTypes.BLOOD_PRESSURE, new HashSet(Arrays.asList(DataType.BloodPressureType.SYSTOLIC, DataType.BloodPressureType.DIASTOLIC, DataType.BloodPressureType.MEAN, DataType.BloodPressureType.PULSE_RATE, DataType.BloodPressureType.MEDICATION_TAKEN)));
        put(DataTypes.BODY_COMPOSITION, new HashSet(Arrays.asList(DataType.BodyCompositionType.WEIGHT, DataType.BodyCompositionType.HEIGHT, DataType.BodyCompositionType.BODY_FAT, DataType.BodyCompositionType.SKELETAL_MUSCLE, DataType.BodyCompositionType.MUSCLE_MASS, DataType.BodyCompositionType.BASAL_METABOLIC_RATE, DataType.BodyCompositionType.BODY_FAT_MASS, DataType.BodyCompositionType.FAT_FREE_MASS, DataType.BodyCompositionType.FAT_FREE, DataType.BodyCompositionType.SKELETAL_MUSCLE_MASS, DataType.BodyCompositionType.TOTAL_BODY_WATER, DataType.BodyCompositionType.BODY_MASS_INDEX)));
        put(DataTypes.HEART_RATE, new HashSet(Arrays.asList(DataType.HeartRateType.HEART_RATE, DataType.HeartRateType.MIN_HEART_RATE, DataType.HeartRateType.MAX_HEART_RATE, DataType.HeartRateType.SERIES_DATA)));
        put(DataTypes.SLEEP, new HashSet(Arrays.asList(DataType.SleepType.DURATION, DataType.SleepType.SESSIONS, DataType.SleepType.SLEEP_SCORE)));
        put(DataTypes.WATER_INTAKE, new HashSet(Arrays.asList(DataType.WaterIntakeType.AMOUNT)));
        put(DataTypes.FLOORS_CLIMBED, new HashSet(Arrays.asList(DataType.FloorsClimbedType.FLOOR)));
        put(DataTypes.NUTRITION, new HashSet(Arrays.asList(DataType.NutritionType.MEAL_TYPE, DataType.NutritionType.CALORIES, DataType.NutritionType.TITLE, DataType.NutritionType.TOTAL_FAT, DataType.NutritionType.SATURATED_FAT, DataType.NutritionType.POLYSATURATED_FAT, DataType.NutritionType.MONOSATURATED_FAT, DataType.NutritionType.TRANS_FAT, DataType.NutritionType.CARBOHYDRATE, DataType.NutritionType.DIETARY_FIBER, DataType.NutritionType.SUGAR, DataType.NutritionType.PROTEIN, DataType.NutritionType.CHOLESTEROL, DataType.NutritionType.SODIUM, DataType.NutritionType.POTASSIUM, DataType.NutritionType.VITAMIN_A, DataType.NutritionType.VITAMIN_C, DataType.NutritionType.CALCIUM, DataType.NutritionType.IRON)));
        put(DataTypes.EXERCISE, new HashSet(Arrays.asList(DataType.ExerciseType.EXERCISE_TYPE, DataType.ExerciseType.CUSTOM_TITLE, DataType.ExerciseType.SESSIONS)));
        put(DataTypes.BLOOD_OXYGEN, new HashSet(Arrays.asList(DataType.BloodOxygenType.OXYGEN_SATURATION, DataType.BloodOxygenType.MIN_OXYGEN_SATURATION, DataType.BloodOxygenType.MAX_OXYGEN_SATURATION, DataType.BloodOxygenType.SERIES_DATA)));
        put(DataTypes.SKIN_TEMPERATURE, new HashSet(Arrays.asList(DataType.SkinTemperatureType.SKIN_TEMPERATURE, DataType.SkinTemperatureType.MIN_SKIN_TEMPERATURE, DataType.SkinTemperatureType.MAX_SKIN_TEMPERATURE, DataType.SkinTemperatureType.SERIES_DATA)));
        put(DataTypes.ENERGY_SCORE, new HashSet(Arrays.asList(DataType.EnergyScoreType.ENERGY_SCORE)));
        put(DataTypes.USER_PROFILE, new HashSet(Arrays.asList(DataType.UserProfileDataType.DATE_OF_BIRTH, DataType.UserProfileDataType.HEIGHT, DataType.UserProfileDataType.WEIGHT, DataType.UserProfileDataType.GENDER, DataType.UserProfileDataType.NICKNAME)));
        put(DataTypes.SLEEP_APNEA, new HashSet(Arrays.asList(DataType.SleepApneaType.DETECTED_SIGN)));
        put(DataTypes.IRREGULAR_HEART_RHYTHM_NOTIFICATION, new HashSet(Arrays.asList(DataType.IrregularHeartRhythmNotificationType.STATUS)));
        put(DataTypes.BODY_TEMPERATURE, new HashSet(Arrays.asList(DataType.BodyTemperatureType.BODY_TEMPERATURE)));
    }
}
