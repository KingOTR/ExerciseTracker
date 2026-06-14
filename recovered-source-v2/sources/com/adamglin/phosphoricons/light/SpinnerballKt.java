package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Spinnerball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpinnerBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSpinnerBall", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spinnerBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpinnerballKt {
    private static ImageVector _spinnerBall;

    public static final ImageVector getSpinnerBall(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _spinnerBall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SpinnerBall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(217.89f, 123.44f);
        pathBuilder.curveToRelative(-31.0f, 22.37f, -53.66f, 15.36f, -77.93f, 3.75f);
        pathBuilder.curveToRelative(21.43f, -14.75f, 42.27f, -33.21f, 41.51f, -71.54f);
        pathBuilder.arcTo(90.0f, 90.0f, 0.0f, false, true, 217.89f, 123.44f);
        pathBuilder.close();
        pathBuilder.moveTo(169.0f, 47.89f);
        pathBuilder.curveToRelative(3.84f, 38.0f, -13.53f, 54.13f, -35.71f, 69.34f);
        pathBuilder.curveTo(131.22f, 91.29f, 125.67f, 64.0f, 92.06f, 45.5f);
        pathBuilder.arcTo(89.88f, 89.88f, 0.0f, false, true, 169.0f, 47.89f);
        pathBuilder.close();
        pathBuilder.moveTo(79.14f, 52.45f);
        pathBuilder.curveTo(114.0f, 68.15f, 119.23f, 91.23f, 121.32f, 118.0f);
        pathBuilder.curveToRelative(-23.5f, -11.18f, -49.92f, -20.0f, -82.75f, -0.17f);
        pathBuilder.arcTo(90.12f, 90.12f, 0.0f, false, true, 79.14f, 52.45f);
        pathBuilder.close();
        pathBuilder.moveTo(38.14f, 132.56f);
        pathBuilder.curveToRelative(31.05f, -22.37f, 53.66f, -15.36f, 77.93f, -3.75f);
        pathBuilder.curveTo(94.61f, 143.56f, 73.77f, 162.0f, 74.53f, 200.35f);
        pathBuilder.arcTo(90.0f, 90.0f, 0.0f, false, true, 38.11f, 132.56f);
        pathBuilder.close();
        pathBuilder.moveTo(87.0f, 208.11f);
        pathBuilder.curveToRelative(-3.84f, -38.0f, 13.53f, -54.13f, 35.71f, -69.34f);
        pathBuilder.curveToRelative(2.06f, 25.94f, 7.61f, 53.24f, 41.22f, 71.73f);
        pathBuilder.arcTo(89.88f, 89.88f, 0.0f, false, true, 87.0f, 208.11f);
        pathBuilder.close();
        pathBuilder.moveTo(176.85f, 203.55f);
        pathBuilder.curveTo(142.0f, 187.85f, 136.77f, 164.77f, 134.68f, 138.0f);
        pathBuilder.curveToRelative(13.36f, 6.36f, 27.67f, 12.0f, 43.56f, 12.0f);
        pathBuilder.curveToRelative(12.06f, 0.0f, 25.0f, -3.23f, 39.19f, -11.79f);
        pathBuilder.arcTo(90.15f, 90.15f, 0.0f, false, true, 176.86f, 203.55f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spinnerBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
