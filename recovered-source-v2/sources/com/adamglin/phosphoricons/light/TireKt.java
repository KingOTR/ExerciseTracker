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

/* compiled from: Tire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTire", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TireKt {
    private static ImageVector _tire;

    public static final ImageVector getTire(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _tire;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tire", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 174.0f);
        pathBuilder.curveToRelative(14.44f, 0.0f, 22.0f, -23.14f, 22.0f, -46.0f);
        pathBuilder.reflectiveCurveToRelative(-7.56f, -46.0f, -22.0f, -46.0f);
        pathBuilder.reflectiveCurveToRelative(-22.0f, 23.14f, -22.0f, 46.0f);
        pathBuilder.reflectiveCurveTo(153.56f, 174.0f, 168.0f, 174.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 94.0f);
        pathBuilder.curveToRelative(2.57f, 0.0f, 10.0f, 11.69f, 10.0f, 34.0f);
        pathBuilder.reflectiveCurveToRelative(-7.43f, 34.0f, -10.0f, 34.0f);
        pathBuilder.reflectiveCurveToRelative(-10.0f, -11.69f, -10.0f, -34.0f);
        pathBuilder.reflectiveCurveTo(165.43f, 94.0f, 168.0f, 94.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 218.0f);
        pathBuilder.lineTo(191.71f, 218.0f);
        pathBuilder.curveTo(209.89f, 201.0f, 222.0f, 167.43f, 222.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, -57.2f, -25.48f, -102.0f, -58.0f, -102.0f);
        pathBuilder.lineTo(92.0f, 26.0f);
        pathBuilder.curveTo(59.48f, 26.0f, 34.0f, 70.8f, 34.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(59.48f, 230.0f, 92.0f, 230.0f);
        pathBuilder.lineTo(232.0f, 230.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 48.79f, -21.07f, 90.0f, -46.0f, 90.0f);
        pathBuilder.reflectiveCurveToRelative(-46.0f, -41.21f, -46.0f, -90.0f);
        pathBuilder.reflectiveCurveToRelative(21.07f, -90.0f, 46.0f, -90.0f);
        pathBuilder.reflectiveCurveTo(210.0f, 79.21f, 210.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(46.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, -2.86f, 0.08f, -5.69f, 0.22f, -8.5f);
        pathBuilder.lineTo(80.0f, 95.37f);
        pathBuilder.lineToRelative(26.5f, 18.93f);
        pathBuilder.curveToRelative(-0.33f, 4.47f, -0.5f, 9.0f, -0.5f, 13.7f);
        pathBuilder.arcToRelative(175.72f, 175.72f, 0.0f, false, false, 4.0f, 38.08f);
        pathBuilder.lineToRelative(-26.55f, -19.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.0f, 0.0f);
        pathBuilder.lineToRelative(-26.1f, 18.64f);
        pathBuilder.arcTo(160.24f, 160.24f, 0.0f, false, true, 46.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 38.0f);
        pathBuilder.horizontalLineToRelative(44.29f);
        pathBuilder.curveTo(122.49f, 50.92f, 112.2f, 73.35f, 108.0f, 100.65f);
        pathBuilder.lineTo(83.49f, 83.12f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.0f, 0.0f);
        pathBuilder.lineTo(47.79f, 103.63f);
        pathBuilder.curveTo(53.37f, 66.24f, 71.36f, 38.0f, 92.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 218.0f);
        pathBuilder.curveTo(76.42f, 218.0f, 62.36f, 201.92f, 54.0f, 178.0f);
        pathBuilder.lineToRelative(26.0f, -18.58f);
        pathBuilder.lineToRelative(35.53f, 25.39f);
        pathBuilder.curveToRelative(5.22f, 13.92f, 12.34f, 25.35f, 20.76f, 33.24f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
