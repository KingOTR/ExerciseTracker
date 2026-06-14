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

/* compiled from: Clover.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Clover", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getClover", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_clover", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloverKt {
    private static ImageVector _clover;

    public static final ImageVector getClover(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _clover;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Clover", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 120.0f);
        pathBuilder.reflectiveCurveToRelative(-90.0f, -96.0f, 0.0f, -96.0f);
        pathBuilder.reflectiveCurveTo(128.0f, 120.0f, 128.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 120.0f);
        pathBuilder.curveToRelative(0.0f, 90.0f, 96.0f, 0.0f, 96.0f, 0.0f);
        pathBuilder.reflectiveCurveTo(32.0f, 30.0f, 32.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 216.0f);
        pathBuilder.curveToRelative(90.0f, 0.0f, 0.0f, -96.0f, 0.0f, -96.0f);
        pathBuilder.reflectiveCurveTo(38.0f, 216.0f, 128.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 120.0f);
        pathBuilder.reflectiveCurveToRelative(96.0f, 90.0f, 96.0f, 0.0f);
        pathBuilder.reflectiveCurveTo(128.0f, 120.0f, 128.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(211.66f, 165.54f);
        pathBuilder2.curveTo(225.16f, 159.7f, 232.0f, 144.37f, 232.0f, 120.0f);
        pathBuilder2.reflectiveCurveToRelative(-6.84f, -39.7f, -20.34f, -45.55f);
        pathBuilder2.curveToRelative(-11.65f, -5.0f, -27.24f, -2.23f, -46.46f, 8.35f);
        pathBuilder2.curveToRelative(10.58f, -19.22f, 13.39f, -34.81f, 8.35f, -46.46f);
        pathBuilder2.curveTo(167.7f, 22.84f, 152.37f, 16.0f, 128.0f, 16.0f);
        pathBuilder2.reflectiveCurveTo(88.3f, 22.84f, 82.45f, 36.34f);
        pathBuilder2.curveTo(77.41f, 48.0f, 80.22f, 63.58f, 90.8f, 82.8f);
        pathBuilder2.curveTo(71.58f, 72.22f, 56.0f, 69.4f, 44.34f, 74.45f);
        pathBuilder2.curveTo(30.84f, 80.3f, 24.0f, 95.63f, 24.0f, 120.0f);
        pathBuilder2.reflectiveCurveToRelative(6.84f, 39.7f, 20.34f, 45.54f);
        pathBuilder2.arcTo(31.0f, 31.0f, 0.0f, false, false, 56.8f, 168.0f);
        pathBuilder2.curveToRelative(9.6f, 0.0f, 21.0f, -3.62f, 34.0f, -10.79f);
        pathBuilder2.curveTo(80.22f, 176.41f, 77.41f, 192.0f, 82.45f, 203.65f);
        pathBuilder2.curveTo(88.3f, 217.15f, 103.63f, 224.0f, 128.0f, 224.0f);
        pathBuilder2.reflectiveCurveToRelative(39.7f, -6.85f, 45.55f, -20.35f);
        pathBuilder2.arcToRelative(32.24f, 32.24f, 0.0f, false, false, 2.34f, -15.0f);
        pathBuilder2.curveToRelative(10.45f, 16.23f, 19.64f, 34.48f, 24.35f, 53.33f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 248.0f);
        pathBuilder2.arcToRelative(8.13f, 8.13f, 0.0f, false, false, 1.95f, -0.24f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.82f, -9.7f);
        pathBuilder2.curveToRelative(-6.94f, -27.76f, -22.27f, -53.8f, -37.86f, -74.79f);
        pathBuilder2.quadTo(189.68f, 168.0f, 199.2f, 168.0f);
        pathBuilder2.arcTo(31.0f, 31.0f, 0.0f, false, false, 211.66f, 165.54f);
        pathBuilder2.close();
        pathBuilder2.moveTo(205.29f, 89.14f);
        pathBuilder2.curveTo(214.14f, 93.0f, 216.0f, 108.0f, 216.0f, 120.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.86f, 27.0f, -10.7f, 30.86f);
        pathBuilder2.curveToRelative(-8.36f, 3.63f, -23.52f, -1.31f, -42.68f, -13.91f);
        pathBuilder2.arcToRelative(243.4f, 243.4f, 0.0f, false, true, -22.54f, -17.0f);
        pathBuilder2.curveTo(158.49f, 104.37f, 190.4f, 82.68f, 205.29f, 89.14f);
        pathBuilder2.close();
        pathBuilder2.moveTo(97.14f, 42.7f);
        pathBuilder2.curveTo(101.0f, 33.86f, 116.0f, 32.0f, 128.0f, 32.0f);
        pathBuilder2.reflectiveCurveToRelative(27.0f, 1.86f, 30.86f, 10.7f);
        pathBuilder2.curveToRelative(3.63f, 8.36f, -1.31f, 23.52f, -13.91f, 42.68f);
        pathBuilder2.arcToRelative(243.4f, 243.4f, 0.0f, false, true, -17.0f, 22.54f);
        pathBuilder2.curveTo(112.37f, 89.51f, 90.69f, 57.59f, 97.14f, 42.7f);
        pathBuilder2.close();
        pathBuilder2.moveTo(50.71f, 150.86f);
        pathBuilder2.curveTo(41.86f, 147.0f, 40.0f, 132.0f, 40.0f, 120.0f);
        pathBuilder2.reflectiveCurveToRelative(1.86f, -27.0f, 10.7f, -30.86f);
        pathBuilder2.arcTo(15.64f, 15.64f, 0.0f, false, true, 57.0f, 88.0f);
        pathBuilder2.curveToRelative(8.75f, 0.0f, 21.34f, 5.17f, 36.4f, 15.07f);
        pathBuilder2.arcToRelative(243.4f, 243.4f, 0.0f, false, true, 22.54f, 17.0f);
        pathBuilder2.curveTo(97.51f, 135.62f, 65.59f, 157.32f, 50.71f, 150.86f);
        pathBuilder2.close();
        pathBuilder2.moveTo(158.86f, 197.29f);
        pathBuilder2.curveTo(155.0f, 206.14f, 140.0f, 208.0f, 128.0f, 208.0f);
        pathBuilder2.reflectiveCurveToRelative(-27.0f, -1.86f, -30.86f, -10.7f);
        pathBuilder2.curveToRelative(-3.63f, -8.36f, 1.31f, -23.52f, 13.91f, -42.68f);
        pathBuilder2.arcToRelative(243.4f, 243.4f, 0.0f, false, true, 17.0f, -22.54f);
        pathBuilder2.curveTo(143.63f, 150.49f, 165.31f, 182.41f, 158.86f, 197.29f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _clover = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
