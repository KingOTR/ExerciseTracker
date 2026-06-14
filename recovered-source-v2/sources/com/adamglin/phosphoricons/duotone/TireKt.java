package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTire", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TireKt {
    private static ImageVector _tire;

    public static final ImageVector getTire(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(164.0f, 224.0f);
        pathBuilder.lineTo(92.0f, 224.0f);
        pathBuilder.curveToRelative(-28.72f, 0.0f, -52.0f, -43.0f, -52.0f, -96.0f);
        pathBuilder.reflectiveCurveTo(63.28f, 32.0f, 92.0f, 32.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.curveToRelative(-28.72f, 0.0f, -52.0f, 43.0f, -52.0f, 96.0f);
        pathBuilder.reflectiveCurveTo(135.28f, 224.0f, 164.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 88.0f);
        pathBuilder.curveToRelative(-8.84f, 0.0f, -16.0f, 17.91f, -16.0f, 40.0f);
        pathBuilder.reflectiveCurveToRelative(7.16f, 40.0f, 16.0f, 40.0f);
        pathBuilder.reflectiveCurveToRelative(16.0f, -17.91f, 16.0f, -40.0f);
        pathBuilder.reflectiveCurveTo(176.84f, 88.0f, 168.0f, 88.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(149.26f, 159.26f);
        pathBuilder2.curveTo(155.09f, 173.82f, 163.5f, 176.0f, 168.0f, 176.0f);
        pathBuilder2.reflectiveCurveToRelative(12.91f, -2.18f, 18.74f, -16.74f);
        pathBuilder2.curveToRelative(3.39f, -8.48f, 5.26f, -19.58f, 5.26f, -31.26f);
        pathBuilder2.reflectiveCurveToRelative(-1.87f, -22.78f, -5.26f, -31.26f);
        pathBuilder2.curveTo(180.91f, 82.18f, 172.5f, 80.0f, 168.0f, 80.0f);
        pathBuilder2.reflectiveCurveToRelative(-12.91f, 2.18f, -18.74f, 16.74f);
        pathBuilder2.curveTo(145.87f, 105.22f, 144.0f, 116.32f, 144.0f, 128.0f);
        pathBuilder2.reflectiveCurveTo(145.87f, 150.78f, 149.26f, 159.26f);
        pathBuilder2.close();
        pathBuilder2.moveTo(168.0f, 96.2f);
        pathBuilder2.curveToRelative(2.62f, 2.06f, 8.0f, 13.0f, 8.0f, 31.8f);
        pathBuilder2.reflectiveCurveToRelative(-5.38f, 29.74f, -8.0f, 31.8f);
        pathBuilder2.curveToRelative(-2.62f, -2.06f, -8.0f, -13.0f, -8.0f, -31.8f);
        pathBuilder2.reflectiveCurveTo(165.38f, 98.26f, 168.0f, 96.2f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 216.0f);
        pathBuilder2.lineTo(196.41f, 216.0f);
        pathBuilder2.curveTo(213.12f, 197.73f, 224.0f, 165.47f, 224.0f, 128.0f);
        pathBuilder2.curveToRelative(0.0f, -58.32f, -26.35f, -104.0f, -60.0f, -104.0f);
        pathBuilder2.lineTo(92.0f, 24.0f);
        pathBuilder2.curveTo(58.35f, 24.0f, 32.0f, 69.68f, 32.0f, 128.0f);
        pathBuilder2.reflectiveCurveTo(58.35f, 232.0f, 92.0f, 232.0f);
        pathBuilder2.lineTo(232.0f, 232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(193.74f, 63.93f);
        pathBuilder2.curveTo(202.93f, 80.91f, 208.0f, 103.67f, 208.0f, 128.0f);
        pathBuilder2.reflectiveCurveToRelative(-5.07f, 47.09f, -14.26f, 64.07f);
        pathBuilder2.curveTo(185.38f, 207.5f, 174.82f, 216.0f, 164.0f, 216.0f);
        pathBuilder2.reflectiveCurveToRelative(-21.38f, -8.5f, -29.74f, -23.93f);
        pathBuilder2.curveTo(125.07f, 175.09f, 120.0f, 152.33f, 120.0f, 128.0f);
        pathBuilder2.reflectiveCurveToRelative(5.07f, -47.09f, 14.26f, -64.07f);
        pathBuilder2.curveTo(142.62f, 48.5f, 153.18f, 40.0f, 164.0f, 40.0f);
        pathBuilder2.reflectiveCurveTo(185.38f, 48.5f, 193.74f, 63.93f);
        pathBuilder2.close();
        pathBuilder2.moveTo(48.0f, 128.0f);
        pathBuilder2.curveToRelative(0.0f, -2.5f, 0.07f, -5.0f, 0.17f, -7.44f);
        pathBuilder2.lineTo(80.0f, 97.83f);
        pathBuilder2.lineToRelative(24.43f, 17.45f);
        pathBuilder2.curveToRelative(-0.28f, 4.16f, -0.43f, 8.41f, -0.43f, 12.72f);
        pathBuilder2.arcToRelative(179.89f, 179.89f, 0.0f, false, false, 3.07f, 33.5f);
        pathBuilder2.lineToRelative(-22.42f, -16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.3f, 0.0f);
        pathBuilder2.lineToRelative(-23.74f, 17.0f);
        pathBuilder2.arcTo(161.0f, 161.0f, 0.0f, false, true, 48.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(62.26f, 63.93f);
        pathBuilder2.curveTo(70.62f, 48.5f, 81.18f, 40.0f, 92.0f, 40.0f);
        pathBuilder2.horizontalLineToRelative(39.59f);
        pathBuilder2.curveToRelative(-11.9f, 13.0f, -20.84f, 33.12f, -25.0f, 57.16f);
        pathBuilder2.lineTo(84.65f, 81.49f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.3f, 0.0f);
        pathBuilder2.lineTo(50.49f, 99.25f);
        pathBuilder2.curveTo(52.85f, 86.0f, 56.83f, 74.0f, 62.26f, 63.93f);
        pathBuilder2.close();
        pathBuilder2.moveTo(62.26f, 192.07f);
        pathBuilder2.arcToRelative(100.08f, 100.08f, 0.0f, false, true, -5.94f, -13.32f);
        pathBuilder2.lineTo(80.0f, 161.83f);
        pathBuilder2.lineToRelative(33.94f, 24.24f);
        pathBuilder2.curveToRelative(4.6f, 12.0f, 10.6f, 22.22f, 17.65f, 29.93f);
        pathBuilder2.lineTo(92.0f, 216.0f);
        pathBuilder2.curveTo(81.18f, 216.0f, 70.62f, 207.5f, 62.26f, 192.07f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
