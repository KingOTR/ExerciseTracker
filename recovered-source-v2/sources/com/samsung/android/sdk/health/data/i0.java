package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.data.Field;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.request.DataType;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements j0 {
    public static final i0 a = new i0();
    public static final Set b = SetsKt.setOf((Object[]) new Field[]{DataType.ExerciseType.EXERCISE_TYPE, DataType.BloodGlucoseType.MEASUREMENT_TYPE, DataType.BloodGlucoseType.MEAL_STATUS, DataType.BloodGlucoseType.SAMPLE_SOURCE_TYPE, DataType.NutritionType.MEAL_TYPE});

    @Override // com.samsung.android.sdk.health.data.j0
    public final Object a(Field field, Object obj, int i) {
        Enum r2 = (Enum) obj;
        Intrinsics.checkNotNullParameter(field, "field");
        if (i == 0) {
            if (r2 != null) {
                if (r2.ordinal() != 0) {
                    return Integer.valueOf(r2.ordinal());
                }
                throw new InvalidRequestException(1001, "The enum value should not be of undefined type. It needs to be explicitly specified");
            }
        } else if (r2 != null) {
            return Integer.valueOf(r2.ordinal());
        }
        return null;
    }

    @Override // com.samsung.android.sdk.health.data.j0
    public final Object a(Field field, Object obj) {
        Enum[] enumConstants;
        Integer num = (Integer) obj;
        Intrinsics.checkNotNullParameter(field, "field");
        if (num != null) {
            int intValue = num.intValue();
            if (Intrinsics.areEqual(field, DataType.ExerciseType.EXERCISE_TYPE)) {
                Enum[] enumConstants2 = (Enum[]) DataType.ExerciseType.PredefinedExerciseType.class.getEnumConstants();
                if (enumConstants2 != null) {
                    Intrinsics.checkNotNullExpressionValue(enumConstants2, "enumConstants");
                    return (intValue <= 0 || intValue >= enumConstants2.length) ? enumConstants2[0] : enumConstants2[intValue];
                }
            } else if (Intrinsics.areEqual(field, DataType.BloodGlucoseType.MEASUREMENT_TYPE)) {
                Enum[] enumConstants3 = (Enum[]) DataType.BloodGlucoseType.MeasurementType.class.getEnumConstants();
                if (enumConstants3 != null) {
                    Intrinsics.checkNotNullExpressionValue(enumConstants3, "enumConstants");
                    return (intValue <= 0 || intValue >= enumConstants3.length) ? enumConstants3[0] : enumConstants3[intValue];
                }
            } else if (Intrinsics.areEqual(field, DataType.BloodGlucoseType.MEAL_STATUS)) {
                Enum[] enumConstants4 = (Enum[]) DataType.BloodGlucoseType.MealStatus.class.getEnumConstants();
                if (enumConstants4 != null) {
                    Intrinsics.checkNotNullExpressionValue(enumConstants4, "enumConstants");
                    return (intValue <= 0 || intValue >= enumConstants4.length) ? enumConstants4[0] : enumConstants4[intValue];
                }
            } else if (Intrinsics.areEqual(field, DataType.BloodGlucoseType.SAMPLE_SOURCE_TYPE)) {
                Enum[] enumConstants5 = (Enum[]) DataType.BloodGlucoseType.SampleSourceType.class.getEnumConstants();
                if (enumConstants5 != null) {
                    Intrinsics.checkNotNullExpressionValue(enumConstants5, "enumConstants");
                    return (intValue <= 0 || intValue >= enumConstants5.length) ? enumConstants5[0] : enumConstants5[intValue];
                }
            } else if (Intrinsics.areEqual(field, DataType.NutritionType.MEAL_TYPE) && (enumConstants = (Enum[]) DataType.NutritionType.MealType.class.getEnumConstants()) != null) {
                Intrinsics.checkNotNullExpressionValue(enumConstants, "enumConstants");
                return (intValue <= 0 || intValue >= enumConstants.length) ? enumConstants[0] : enumConstants[intValue];
            }
        }
        return null;
    }

    @Override // com.samsung.android.sdk.health.data.j0
    public final Set a() {
        return b;
    }
}
