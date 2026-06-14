package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Guitar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Guitar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGuitar", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_guitar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GuitarKt {
    private static ImageVector _guitar;

    public static final ImageVector getGuitar(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(92.49f, 187.5f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 17.0f);
        pathBuilder.lineToRelative(-24.0f, -24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 120.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 112.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(252.49f, 60.48f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.12f, 2.12f);
        pathBuilder.lineTo(182.0f, 119.0f);
        pathBuilder.arcToRelative(73.13f, 73.13f, 0.0f, false, true, 5.36f, 18.68f);
        pathBuilder.curveToRelative(2.51f, 17.58f, -2.2f, 33.35f, -13.27f, 44.42f);
        pathBuilder.arcToRelative(46.11f, 46.11f, 0.0f, false, true, -15.73f, 10.29f);
        pathBuilder.arcToRelative(4.32f, 4.32f, 0.0f, false, false, -2.39f, 4.0f);
        pathBuilder.curveToRelative(-0.53f, 15.61f, -6.16f, 29.22f, -16.28f, 39.34f);
        pathBuilder.curveTo(129.0f, 246.37f, 114.5f, 252.0f, 98.13f, 252.0f);
        pathBuilder.arcToRelative(76.73f, 76.73f, 0.0f, false, true, -10.77f, -0.78f);
        pathBuilder.curveToRelative(-19.47f, -2.78f, -38.73f, -12.85f, -54.23f, -28.35f);
        pathBuilder.reflectiveCurveTo(7.56f, 188.11f, 4.78f, 168.64f);
        pathBuilder.curveToRelative(-3.0f, -20.75f, 2.56f, -39.34f, 15.55f, -52.33f);
        pathBuilder.curveTo(30.45f, 106.19f, 44.06f, 100.56f, 59.67f, 100.0f);
        pathBuilder.arcToRelative(4.32f, 4.32f, 0.0f, false, false, 4.0f, -2.39f);
        pathBuilder.arcTo(46.11f, 46.11f, 0.0f, false, true, 73.93f, 81.91f);
        pathBuilder.curveTo(85.0f, 70.84f, 100.77f, 66.13f, 118.35f, 68.64f);
        pathBuilder.arcTo(73.13f, 73.13f, 0.0f, false, true, 137.0f, 74.0f);
        pathBuilder.lineTo(193.4f, 17.63f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 212.49f, 3.51f);
        pathBuilder.lineToRelative(40.0f, 40.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 252.49f, 60.48f);
        pathBuilder.close();
        pathBuilder.moveTo(221.0f, 46.0f);
        pathBuilder.lineTo(210.0f, 35.0f);
        pathBuilder.lineTo(191.0f, 54.0f);
        pathBuilder.lineToRelative(11.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.69f, 109.28f);
        pathBuilder.curveTo(135.53f, 98.09f, 121.39f, 92.0f, 109.34f, 92.0f);
        pathBuilder.curveToRelative(-7.29f, 0.0f, -13.81f, 2.21f, -18.44f, 6.85f);
        pathBuilder.arcTo(22.16f, 22.16f, 0.0f, false, false, 86.0f, 106.47f);
        pathBuilder.arcTo(28.23f, 28.23f, 0.0f, false, true, 60.48f, 124.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-6.57f, 0.22f, -15.93f, 2.0f, -23.18f, 9.26f);
        pathBuilder.curveToRelative(-7.52f, 7.52f, -10.63f, 18.87f, -8.76f, 32.0f);
        pathBuilder.curveToRelative(2.05f, 14.37f, 9.71f, 28.81f, 21.56f, 40.66f);
        pathBuilder.reflectiveCurveToRelative(26.29f, 19.51f, 40.66f, 21.56f);
        pathBuilder.curveToRelative(13.09f, 1.87f, 24.44f, -1.24f, 32.0f, -8.76f);
        pathBuilder.curveToRelative(7.25f, -7.25f, 9.0f, -16.61f, 9.26f, -23.18f);
        pathBuilder.arcTo(28.23f, 28.23f, 0.0f, false, true, 149.53f, 170.0f);
        pathBuilder.arcToRelative(22.16f, 22.16f, 0.0f, false, false, 7.59f, -4.94f);
        pathBuilder.curveTo(169.43f, 152.79f, 164.67f, 127.23f, 146.72f, 109.28f);
        pathBuilder.close();
        pathBuilder.moveTo(169.0f, 98.07f);
        pathBuilder.lineTo(185.0f, 82.0f);
        pathBuilder.lineTo(174.0f, 71.0f);
        pathBuilder.lineTo(157.93f, 87.0f);
        pathBuilder.curveToRelative(2.0f, 1.67f, 3.9f, 3.42f, 5.76f, 5.27f);
        pathBuilder.reflectiveCurveTo(167.29f, 96.09f, 169.0f, 98.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _guitar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
