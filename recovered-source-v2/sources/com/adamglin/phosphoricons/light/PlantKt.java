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

/* compiled from: Plant.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Plant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPlant", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_plant", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlantKt {
    private static ImageVector _plant;

    public static final ImageVector getPlant(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _plant;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Plant", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.63f, 48.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 240.0f, 42.37f);
        pathBuilder.curveToRelative(-51.0f, -3.0f, -91.88f, 12.42f, -109.35f, 41.26f);
        pathBuilder.curveToRelative(-11.63f, 19.21f, -11.38f, 42.68f, 0.53f, 65.0f);
        pathBuilder.arcToRelative(69.42f, 69.42f, 0.0f, false, false, -15.48f, 30.59f);
        pathBuilder.lineTo(95.9f, 159.41f);
        pathBuilder.curveToRelative(8.15f, -16.1f, 8.1f, -32.95f, -0.32f, -46.85f);
        pathBuilder.curveTo(82.77f, 91.41f, 53.0f, 80.07f, 15.9f, 82.27f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.63f, 5.64f);
        pathBuilder.curveTo(8.09f, 125.0f, 19.41f, 154.77f, 40.56f, 167.58f);
        pathBuilder.arcTo(43.75f, 43.75f, 0.0f, false, false, 63.44f, 174.0f);
        pathBuilder.arcToRelative(53.17f, 53.17f, 0.0f, false, false, 24.0f, -6.0f);
        pathBuilder.lineTo(114.0f, 194.48f);
        pathBuilder.lineTo(114.0f, 224.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(126.0f, 194.51f);
        pathBuilder.arcTo(57.55f, 57.55f, 0.0f, false, true, 139.76f, 157.0f);
        pathBuilder.curveToRelative(11.21f, 5.93f, 22.72f, 8.91f, 33.82f, 8.91f);
        pathBuilder.arcToRelative(58.9f, 58.9f, 0.0f, false, false, 30.79f, -8.57f);
        pathBuilder.curveTo(233.21f, 139.89f, 248.63f, 99.0f, 245.63f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(46.78f, 157.31f);
        pathBuilder.curveTo(30.47f, 147.44f, 21.39f, 124.0f, 22.0f, 94.0f);
        pathBuilder.curveToRelative(30.0f, -0.65f, 53.41f, 8.44f, 63.28f, 24.75f);
        pathBuilder.curveToRelative(5.68f, 9.37f, 6.16f, 20.38f, 1.54f, 31.59f);
        pathBuilder.lineTo(60.24f, 123.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, 8.49f);
        pathBuilder.lineToRelative(26.62f, 26.61f);
        pathBuilder.curveTo(67.16f, 163.47f, 56.15f, 163.0f, 46.78f, 157.31f);
        pathBuilder.close();
        pathBuilder.moveTo(198.16f, 147.09f);
        pathBuilder.curveToRelative(-14.74f, 8.92f, -32.14f, 9.18f, -49.67f, 0.9f);
        pathBuilder.lineToRelative(55.76f, -55.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, -8.49f);
        pathBuilder.lineTo(140.0f, 139.51f);
        pathBuilder.curveToRelative(-8.28f, -17.53f, -8.0f, -34.93f, 0.9f, -49.66f);
        pathBuilder.curveToRelative(14.52f, -24.0f, 49.06f, -37.18f, 93.0f, -35.75f);
        pathBuilder.curveTo(235.33f, 98.0f, 222.14f, 132.56f, 198.16f, 147.09f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _plant = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
