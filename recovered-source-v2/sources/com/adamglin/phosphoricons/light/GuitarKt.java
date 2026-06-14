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

/* compiled from: Guitar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Guitar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGuitar", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_guitar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GuitarKt {
    private static ImageVector _guitar;

    public static final ImageVector getGuitar(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _guitar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Guitar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.24f, 47.76f);
        pathBuilder.lineToRelative(-40.0f, -40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f);
        pathBuilder.lineTo(203.52f, 20.0f);
        pathBuilder.lineTo(140.9f, 82.62f);
        pathBuilder.curveTo(118.54f, 70.42f, 93.29f, 71.0f, 78.17f, 86.16f);
        pathBuilder.arcToRelative(39.94f, 39.94f, 0.0f, false, false, -9.0f, 13.69f);
        pathBuilder.arcTo(10.24f, 10.24f, 0.0f, false, true, 59.87f, 106.0f);
        pathBuilder.curveToRelative(-14.06f, 0.48f, -26.27f, 5.5f, -35.3f, 14.53f);
        pathBuilder.curveTo(13.0f, 132.18f, 8.0f, 149.0f, 10.72f, 167.79f);
        pathBuilder.curveTo(13.32f, 186.0f, 22.78f, 204.0f, 37.37f, 218.63f);
        pathBuilder.reflectiveCurveTo(70.0f, 242.68f, 88.21f, 245.28f);
        pathBuilder.arcToRelative(70.0f, 70.0f, 0.0f, false, false, 9.88f, 0.72f);
        pathBuilder.curveToRelative(14.79f, 0.0f, 27.81f, -5.0f, 37.35f, -14.57f);
        pathBuilder.curveToRelative(9.0f, -9.0f, 14.05f, -21.23f, 14.53f, -35.3f);
        pathBuilder.arcToRelative(10.24f, 10.24f, 0.0f, false, true, 6.18f, -9.35f);
        pathBuilder.arcToRelative(39.94f, 39.94f, 0.0f, false, false, 13.69f, -8.95f);
        pathBuilder.curveToRelative(15.12f, -15.12f, 15.74f, -40.37f, 3.54f, -62.73f);
        pathBuilder.lineTo(236.0f, 52.48f);
        pathBuilder.lineToRelative(3.76f, 3.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(161.36f, 169.35f);
        pathBuilder.arcToRelative(28.06f, 28.06f, 0.0f, false, true, -9.63f, 6.27f);
        pathBuilder.arcTo(22.22f, 22.22f, 0.0f, false, false, 138.0f, 195.72f);
        pathBuilder.curveToRelative(-0.37f, 11.0f, -4.18f, 20.39f, -11.0f, 27.22f);
        pathBuilder.curveToRelative(-8.89f, 8.89f, -22.0f, 12.61f, -37.0f, 10.46f);
        pathBuilder.curveToRelative(-15.65f, -2.23f, -31.29f, -10.49f, -44.06f, -23.25f);
        pathBuilder.reflectiveCurveToRelative(-21.0f, -28.41f, -23.25f, -44.06f);
        pathBuilder.curveToRelative(-2.15f, -15.0f, 1.57f, -28.16f, 10.46f, -37.05f);
        pathBuilder.curveToRelative(6.83f, -6.84f, 16.25f, -10.65f, 27.22f, -11.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(22.21f, 22.21f, 0.0f, false, false, 20.1f, -13.76f);
        pathBuilder.arcToRelative(28.12f, 28.12f, 0.0f, false, true, 6.27f, -9.62f);
        pathBuilder.curveTo(92.52f, 88.77f, 100.57f, 86.0f, 109.44f, 86.0f);
        pathBuilder.arcTo(52.74f, 52.74f, 0.0f, false, true, 132.0f, 91.49f);
        pathBuilder.lineTo(109.4f, 114.12f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, 32.48f, 32.48f);
        pathBuilder.lineTo(164.52f, 124.0f);
        pathBuilder.curveTo(172.63f, 140.82f, 172.0f, 158.68f, 161.36f, 169.35f);
        pathBuilder.close();
        pathBuilder.moveTo(151.0f, 105.0f);
        pathBuilder.arcToRelative(73.0f, 73.0f, 0.0f, false, true, 7.17f, 8.34f);
        pathBuilder.lineTo(139.5f, 132.0f);
        pathBuilder.arcTo(30.18f, 30.18f, 0.0f, false, false, 124.0f, 116.5f);
        pathBuilder.lineToRelative(18.62f, -18.62f);
        pathBuilder.arcTo(72.16f, 72.16f, 0.0f, false, true, 151.0f, 105.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 126.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, -18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(159.44f, 96.56f);
        pathBuilder.arcToRelative(83.19f, 83.19f, 0.0f, false, false, -8.28f, -7.23f);
        pathBuilder.lineTo(176.0f, 64.48f);
        pathBuilder.lineTo(191.52f, 80.0f);
        pathBuilder.lineToRelative(-24.84f, 24.83f);
        pathBuilder.arcTo(84.5f, 84.5f, 0.0f, false, false, 159.45f, 96.55f);
        pathBuilder.close();
        pathBuilder.moveTo(199.99f, 71.56f);
        pathBuilder.lineTo(184.49f, 56.0f);
        pathBuilder.lineTo(212.0f, 28.48f);
        pathBuilder.lineTo(227.52f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.25f, 195.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f);
        pathBuilder.lineToRelative(-32.0f, -32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _guitar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
