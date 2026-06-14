package com.example.rungps.ui.theme;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* compiled from: Shape.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"EarthCardShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getEarthCardShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "EarthPillShape", "getEarthPillShape", "ExerciseTrackerShapes", "Landroidx/compose/material3/Shapes;", "getExerciseTrackerShapes", "()Landroidx/compose/material3/Shapes;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShapeKt {
    private static final RoundedCornerShape EarthCardShape;
    private static final RoundedCornerShape EarthPillShape;
    private static final Shapes ExerciseTrackerShapes;

    public static final RoundedCornerShape getEarthCardShape() {
        return EarthCardShape;
    }

    public static final RoundedCornerShape getEarthPillShape() {
        return EarthPillShape;
    }

    public static final Shapes getExerciseTrackerShapes() {
        return ExerciseTrackerShapes;
    }

    static {
        float f = 16;
        float f2 = 6;
        RoundedCornerShape m968RoundedCornerShapea9UjIt4 = RoundedCornerShapeKt.m968RoundedCornerShapea9UjIt4(Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f2), Dp.m6303constructorimpl(f2));
        EarthCardShape = m968RoundedCornerShapea9UjIt4;
        EarthPillShape = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(50));
        RoundedCornerShape roundedCornerShape = m968RoundedCornerShapea9UjIt4;
        float f3 = 20;
        float f4 = 8;
        ExerciseTrackerShapes = new Shapes(RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(4)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(f2)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(10)), roundedCornerShape, RoundedCornerShapeKt.m968RoundedCornerShapea9UjIt4(Dp.m6303constructorimpl(f3), Dp.m6303constructorimpl(f3), Dp.m6303constructorimpl(f4), Dp.m6303constructorimpl(f4)));
    }
}
