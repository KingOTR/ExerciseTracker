package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.request.DataType;
import com.samsung.android.sdk.health.data.request.DataTypes;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class p extends HashMap {
    public p() {
        DataType.BloodGlucoseType bloodGlucoseType = DataTypes.BLOOD_GLUCOSE;
        put(bloodGlucoseType.getName(), bloodGlucoseType);
        DataType.BloodPressureType bloodPressureType = DataTypes.BLOOD_PRESSURE;
        put(bloodPressureType.getName(), bloodPressureType);
        DataType.BodyCompositionType bodyCompositionType = DataTypes.BODY_COMPOSITION;
        put(bodyCompositionType.getName(), bodyCompositionType);
        DataType.HeartRateType heartRateType = DataTypes.HEART_RATE;
        put(heartRateType.getName(), heartRateType);
        DataType.SleepType sleepType = DataTypes.SLEEP;
        put(sleepType.getName(), sleepType);
        DataType.SleepGoalType sleepGoalType = DataTypes.SLEEP_GOAL;
        put(sleepGoalType.getName(), sleepGoalType);
        DataType.StepsType stepsType = DataTypes.STEPS;
        put(stepsType.getName(), stepsType);
        DataType.StepsGoalType stepsGoalType = DataTypes.STEPS_GOAL;
        put(stepsGoalType.getName(), stepsGoalType);
        DataType.ActiveCaloriesBurnedGoalType activeCaloriesBurnedGoalType = DataTypes.ACTIVE_CALORIES_BURNED_GOAL;
        put(activeCaloriesBurnedGoalType.getName(), activeCaloriesBurnedGoalType);
        DataType.ActiveTimeGoalType activeTimeGoalType = DataTypes.ACTIVE_TIME_GOAL;
        put(activeTimeGoalType.getName(), activeTimeGoalType);
        DataType.WaterIntakeType waterIntakeType = DataTypes.WATER_INTAKE;
        put(waterIntakeType.getName(), waterIntakeType);
        DataType.WaterIntakeGoalType waterIntakeGoalType = DataTypes.WATER_INTAKE_GOAL;
        put(waterIntakeGoalType.getName(), waterIntakeGoalType);
        DataType.NutritionType nutritionType = DataTypes.NUTRITION;
        put(nutritionType.getName(), nutritionType);
        DataType.NutritionGoalType nutritionGoalType = DataTypes.NUTRITION_GOAL;
        put(nutritionGoalType.getName(), nutritionGoalType);
        DataType.ExerciseType exerciseType = DataTypes.EXERCISE;
        put(exerciseType.getName(), exerciseType);
        DataType.ExerciseLocationType exerciseLocationType = DataTypes.EXERCISE_LOCATION;
        put(exerciseLocationType.getName(), exerciseLocationType);
        DataType.BloodOxygenType bloodOxygenType = DataTypes.BLOOD_OXYGEN;
        put(bloodOxygenType.getName(), bloodOxygenType);
        DataType.SkinTemperatureType skinTemperatureType = DataTypes.SKIN_TEMPERATURE;
        put(skinTemperatureType.getName(), skinTemperatureType);
        DataType.ActivitySummaryType activitySummaryType = DataTypes.ACTIVITY_SUMMARY;
        put(activitySummaryType.getName(), activitySummaryType);
        DataType.FloorsClimbedType floorsClimbedType = DataTypes.FLOORS_CLIMBED;
        put(floorsClimbedType.getName(), floorsClimbedType);
        DataType.EnergyScoreType energyScoreType = DataTypes.ENERGY_SCORE;
        put(energyScoreType.getName(), energyScoreType);
        DataType.UserProfileDataType userProfileDataType = DataTypes.USER_PROFILE;
        put(userProfileDataType.getName(), userProfileDataType);
        DataType.SleepApneaType sleepApneaType = DataTypes.SLEEP_APNEA;
        put(sleepApneaType.getName(), sleepApneaType);
        DataType.IrregularHeartRhythmNotificationType irregularHeartRhythmNotificationType = DataTypes.IRREGULAR_HEART_RHYTHM_NOTIFICATION;
        put(irregularHeartRhythmNotificationType.getName(), irregularHeartRhythmNotificationType);
        DataType.BodyTemperatureType bodyTemperatureType = DataTypes.BODY_TEMPERATURE;
        put(bodyTemperatureType.getName(), bodyTemperatureType);
    }
}
