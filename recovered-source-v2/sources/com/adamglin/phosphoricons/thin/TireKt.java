package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTire", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TireKt {
    private static ImageVector _tire;

    public static final ImageVector getTire(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(168.0f, 172.0f);
        pathBuilder.curveToRelative(13.0f, 0.0f, 20.0f, -22.67f, 20.0f, -44.0f);
        pathBuilder.reflectiveCurveToRelative(-7.0f, -44.0f, -20.0f, -44.0f);
        pathBuilder.reflectiveCurveToRelative(-20.0f, 22.67f, -20.0f, 44.0f);
        pathBuilder.reflectiveCurveTo(155.0f, 172.0f, 168.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 92.0f);
        pathBuilder.curveToRelative(4.89f, 0.0f, 12.0f, 14.0f, 12.0f, 36.0f);
        pathBuilder.reflectiveCurveToRelative(-7.11f, 36.0f, -12.0f, 36.0f);
        pathBuilder.reflectiveCurveToRelative(-12.0f, -14.0f, -12.0f, -36.0f);
        pathBuilder.reflectiveCurveTo(163.11f, 92.0f, 168.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 220.0f);
        pathBuilder.lineTo(186.23f, 220.0f);
        pathBuilder.curveToRelative(6.72f, -5.11f, 12.85f, -12.59f, 18.06f, -22.21f);
        pathBuilder.curveTo(214.42f, 179.08f, 220.0f, 154.3f, 220.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(-5.58f, -51.08f, -15.71f, -69.79f);
        pathBuilder.curveTo(193.73f, 38.73f, 179.43f, 28.0f, 164.0f, 28.0f);
        pathBuilder.lineTo(92.0f, 28.0f);
        pathBuilder.curveTo(76.57f, 28.0f, 62.27f, 38.73f, 51.71f, 58.21f);
        pathBuilder.curveTo(41.58f, 76.92f, 36.0f, 101.7f, 36.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.58f, 51.08f, 15.71f, 69.79f);
        pathBuilder.curveTo(62.27f, 217.27f, 76.57f, 228.0f, 92.0f, 228.0f);
        pathBuilder.lineTo(232.0f, 228.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(197.25f, 62.0f);
        pathBuilder.curveTo(206.76f, 79.58f, 212.0f, 103.0f, 212.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(-5.24f, 48.42f, -14.75f, 66.0f);
        pathBuilder.curveToRelative(-9.09f, 16.78f, -20.9f, 26.0f, -33.25f, 26.0f);
        pathBuilder.reflectiveCurveToRelative(-24.16f, -9.24f, -33.25f, -26.0f);
        pathBuilder.curveTo(121.24f, 176.42f, 116.0f, 153.0f, 116.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.24f, -48.42f, 14.75f, -66.0f);
        pathBuilder.curveToRelative(9.09f, -16.78f, 20.9f, -26.0f, 33.25f, -26.0f);
        pathBuilder.reflectiveCurveTo(188.16f, 45.24f, 197.25f, 62.0f);
        pathBuilder.close();
        pathBuilder.moveTo(58.75f, 62.0f);
        pathBuilder.curveTo(67.84f, 45.24f, 79.65f, 36.0f, 92.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(49.77f);
        pathBuilder.curveToRelative(-6.72f, 5.11f, -12.85f, 12.59f, -18.06f, 22.21f);
        pathBuilder.curveToRelative(-7.0f, 12.93f, -11.83f, 28.77f, -14.14f, 46.0f);
        pathBuilder.lineTo(82.33f, 84.75f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.66f, 0.0f);
        pathBuilder.lineTo(45.17f, 108.0f);
        pathBuilder.curveTo(47.19f, 90.66f, 51.84f, 74.78f, 58.75f, 62.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.26f, 118.44f);
        pathBuilder.lineTo(80.0f, 92.92f);
        pathBuilder.lineToRelative(28.59f, 20.42f);
        pathBuilder.curveToRelative(-0.39f, 4.81f, -0.59f, 9.71f, -0.59f, 14.66f);
        pathBuilder.arcToRelative(169.72f, 169.72f, 0.0f, false, false, 5.32f, 42.89f);
        pathBuilder.lineToRelative(-31.0f, -22.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.66f, 0.0f);
        pathBuilder.lineTo(49.13f, 169.13f);
        pathBuilder.arcTo(161.44f, 161.44f, 0.0f, false, true, 44.0f, 128.0f);
        pathBuilder.quadTo(44.0f, 123.19f, 44.26f, 118.44f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 220.0f);
        pathBuilder.curveToRelative(-12.35f, 0.0f, -24.16f, -9.24f, -33.25f, -26.0f);
        pathBuilder.arcToRelative(106.61f, 106.61f, 0.0f, false, true, -7.19f, -16.75f);
        pathBuilder.lineTo(80.0f, 156.92f);
        pathBuilder.lineToRelative(37.32f, 26.65f);
        pathBuilder.arcToRelative(111.32f, 111.32f, 0.0f, false, false, 6.39f, 14.22f);
        pathBuilder.curveToRelative(5.21f, 9.62f, 11.34f, 17.1f, 18.06f, 22.21f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
