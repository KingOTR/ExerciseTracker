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

/* compiled from: Pottedplant.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PottedPlant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPottedPlant", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pottedPlant", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PottedplantKt {
    private static ImageVector _pottedPlant;

    public static final ImageVector getPottedPlant(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _pottedPlant;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PottedPlant", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(122.83f, 138.83f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(145.0f, 116.7f);
        pathBuilder.curveToRelative(9.0f, 4.89f, 18.06f, 7.35f, 26.81f, 7.35f);
        pathBuilder.arcToRelative(45.57f, 45.57f, 0.0f, false, false, 23.87f, -6.74f);
        pathBuilder.curveToRelative(22.42f, -13.58f, 34.41f, -45.45f, 32.07f, -85.26f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 28.29f);
        pathBuilder.curveToRelative(-39.81f, -2.35f, -71.68f, 9.65f, -85.26f, 32.07f);
        pathBuilder.curveToRelative(-9.21f, 15.2f, -9.0f, 33.09f, 0.61f, 50.68f);
        pathBuilder.lineTo(120.0f, 130.34f);
        pathBuilder.lineToRelative(-17.06f, -17.06f);
        pathBuilder.curveToRelative(6.66f, -12.78f, 6.71f, -26.2f, 0.0f, -37.22f);
        pathBuilder.curveTo(92.89f, 59.4f, 69.33f, 50.49f, 40.0f, 52.21f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 36.21f, 56.0f);
        pathBuilder.curveToRelative(-1.73f, 29.36f, 7.19f, 52.92f, 23.85f, 63.0f);
        pathBuilder.arcTo(34.29f, 34.29f, 0.0f, false, false, 78.0f, 124.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, false, 19.34f, -5.0f);
        pathBuilder.lineToRelative(17.0f, 17.06f);
        pathBuilder.lineToRelative(-12.0f, 12.0f);
        pathBuilder.lineTo(56.0f, 148.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(68.79f, 156.06f);
        pathBuilder.lineTo(82.7f, 218.6f);
        pathBuilder.arcTo(11.93f, 11.93f, 0.0f, false, false, 94.42f, 228.0f);
        pathBuilder.horizontalLineToRelative(67.17f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, 11.71f, -9.4f);
        pathBuilder.lineTo(187.21f, 156.0f);
        pathBuilder.lineTo(200.0f, 156.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(113.66f, 148.0f);
        pathBuilder.lineToRelative(9.17f, -9.17f);
        pathBuilder.close();
        pathBuilder.moveTo(145.53f, 64.51f);
        pathBuilder.curveTo(157.15f, 45.31f, 184.8f, 34.8f, 219.9f, 36.1f);
        pathBuilder.curveToRelative(1.29f, 35.1f, -9.21f, 62.74f, -28.41f, 74.37f);
        pathBuilder.curveToRelative(-13.08f, 7.92f, -28.77f, 7.32f, -44.29f, -1.68f);
        pathBuilder.curveTo(138.21f, 93.28f, 137.61f, 77.59f, 145.53f, 64.51f);
        pathBuilder.close();
        pathBuilder.moveTo(95.05f, 111.05f);
        pathBuilder.curveToRelative(-10.84f, 6.19f, -21.76f, 6.59f, -30.84f, 1.08f);
        pathBuilder.curveTo(50.78f, 104.0f, 43.35f, 84.68f, 44.0f, 60.0f);
        pathBuilder.curveToRelative(24.64f, -0.69f, 44.0f, 6.74f, 52.1f, 20.17f);
        pathBuilder.curveTo(101.64f, 89.29f, 101.24f, 100.21f, 95.05f, 111.05f);
        pathBuilder.close();
        pathBuilder.moveTo(179.05f, 156.05f);
        pathBuilder.lineTo(165.52f, 216.92f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, 3.13f);
        pathBuilder.lineTo(94.42f, 220.05f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.91f, -3.13f);
        pathBuilder.lineTo(77.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pottedPlant = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
