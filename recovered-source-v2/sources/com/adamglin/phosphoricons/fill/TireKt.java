package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getTire", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TireKt {
    private static ImageVector _tire;

    public static final ImageVector getTire(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(184.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 22.09f, -7.16f, 40.0f, -16.0f, 40.0f);
        pathBuilder.reflectiveCurveToRelative(-16.0f, -17.91f, -16.0f, -40.0f);
        pathBuilder.reflectiveCurveToRelative(7.16f, -40.0f, 16.0f, -40.0f);
        pathBuilder.reflectiveCurveTo(184.0f, 105.91f, 184.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(92.0f, 232.0f);
        pathBuilder.curveToRelative(-33.64f, 0.0f, -60.0f, -45.68f, -60.0f, -104.0f);
        pathBuilder.reflectiveCurveTo(58.36f, 24.0f, 92.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.curveToRelative(33.64f, 0.0f, 60.0f, 45.68f, 60.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 37.47f, -10.88f, 69.73f, -27.59f, 88.0f);
        pathBuilder.lineTo(232.0f, 216.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(57.87f, 111.81f);
        pathBuilder.arcToRelative(7.93f, 7.93f, 0.0f, false, false, 4.64f, -1.49f);
        pathBuilder.lineTo(80.0f, 97.83f);
        pathBuilder.lineToRelative(13.28f, 9.49f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.3f, -13.0f);
        pathBuilder.lineTo(84.65f, 81.49f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.3f, 0.0f);
        pathBuilder.lineTo(53.21f, 97.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.66f, 14.51f);
        pathBuilder.close();
        pathBuilder.moveTo(104.54f, 159.7f);
        pathBuilder.lineTo(84.65f, 145.49f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.3f, 0.0f);
        pathBuilder.lineTo(56.0f, 159.29f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.3f, 13.0f);
        pathBuilder.lineTo(80.0f, 161.83f);
        pathBuilder.lineToRelative(15.24f, 10.88f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.3f, -13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(193.74f, 192.07f);
        pathBuilder.curveToRelative(9.19f, -17.0f, 14.26f, -39.74f, 14.26f, -64.07f);
        pathBuilder.reflectiveCurveToRelative(-5.07f, -47.09f, -14.26f, -64.07f);
        pathBuilder.curveTo(185.38f, 48.5f, 174.82f, 40.0f, 164.0f, 40.0f);
        pathBuilder.reflectiveCurveToRelative(-21.38f, 8.5f, -29.74f, 23.93f);
        pathBuilder.curveTo(125.07f, 80.91f, 120.0f, 103.67f, 120.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.07f, 47.09f, 14.26f, 64.07f);
        pathBuilder.curveTo(142.62f, 207.5f, 153.18f, 216.0f, 164.0f, 216.0f);
        pathBuilder.reflectiveCurveTo(185.38f, 207.5f, 193.74f, 192.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
