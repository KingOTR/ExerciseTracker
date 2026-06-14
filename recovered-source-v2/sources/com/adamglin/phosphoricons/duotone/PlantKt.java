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

/* compiled from: Plant.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Plant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPlant", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_plant", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlantKt {
    private static ImageVector _plant;

    public static final ImageVector getPlant(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(138.54f, 149.46f);
        pathBuilder.curveTo(106.62f, 96.25f, 149.18f, 43.05f, 239.63f, 48.37f);
        pathBuilder.curveTo(245.0f, 138.82f, 191.75f, 181.39f, 138.54f, 149.46f);
        pathBuilder.close();
        pathBuilder.moveTo(16.26f, 88.26f);
        pathBuilder.curveToRelative(-3.8f, 64.61f, 34.21f, 95.0f, 72.21f, 72.21f);
        pathBuilder.curveTo(111.27f, 122.47f, 80.87f, 84.46f, 16.26f, 88.26f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(247.63f, 47.89f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, -7.52f);
        pathBuilder2.curveToRelative(-51.76f, -3.0f, -93.32f, 12.74f, -111.18f, 42.22f);
        pathBuilder2.curveToRelative(-11.8f, 19.48f, -11.78f, 43.16f, -0.16f, 65.74f);
        pathBuilder2.arcToRelative(71.37f, 71.37f, 0.0f, false, false, -14.17f, 26.95f);
        pathBuilder2.lineTo(98.33f, 159.0f);
        pathBuilder2.curveToRelative(7.82f, -16.33f, 7.52f, -33.36f, -1.0f, -47.49f);
        pathBuilder2.curveTo(84.09f, 89.73f, 53.62f, 78.0f, 15.79f, 80.27f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, 7.52f);
        pathBuilder2.curveToRelative(-2.23f, 37.83f, 9.46f, 68.3f, 31.25f, 81.5f);
        pathBuilder2.arcTo(45.82f, 45.82f, 0.0f, false, false, 63.44f, 176.0f);
        pathBuilder2.arcTo(54.58f, 54.58f, 0.0f, false, false, 87.0f, 170.33f);
        pathBuilder2.lineToRelative(25.0f, 25.0f);
        pathBuilder2.lineTo(112.0f, 224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(128.0f, 194.51f);
        pathBuilder2.arcToRelative(55.61f, 55.61f, 0.0f, false, true, 12.27f, -35.0f);
        pathBuilder2.arcToRelative(73.91f, 73.91f, 0.0f, false, false, 33.31f, 8.4f);
        pathBuilder2.arcToRelative(60.9f, 60.9f, 0.0f, false, false, 31.83f, -8.86f);
        pathBuilder2.curveTo(234.89f, 141.21f, 250.67f, 99.65f, 247.63f, 47.89f);
        pathBuilder2.close();
        pathBuilder2.moveTo(86.06f, 146.74f);
        pathBuilder2.lineToRelative(-24.41f, -24.4f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 11.31f);
        pathBuilder2.lineToRelative(24.41f, 24.41f);
        pathBuilder2.curveToRelative(-9.61f, 3.18f, -18.93f, 2.39f, -26.94f, -2.46f);
        pathBuilder2.curveTo(32.47f, 146.31f, 23.79f, 124.32f, 24.0f, 96.0f);
        pathBuilder2.curveToRelative(28.31f, -0.25f, 50.31f, 8.47f, 59.6f, 23.81f);
        pathBuilder2.curveTo(88.45f, 127.82f, 89.24f, 137.14f, 86.06f, 146.74f);
        pathBuilder2.close();
        pathBuilder2.moveTo(197.12f, 145.38f);
        pathBuilder2.curveToRelative(-13.4f, 8.11f, -29.15f, 8.73f, -45.15f, 2.0f);
        pathBuilder2.lineToRelative(53.69f, -53.7f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.32f);
        pathBuilder2.lineTo(140.65f, 136.0f);
        pathBuilder2.curveToRelative(-6.76f, -16.0f, -6.15f, -31.76f, 2.0f, -45.15f);
        pathBuilder2.curveToRelative(13.94f, -23.0f, 47.0f, -35.8f, 89.33f, -34.83f);
        pathBuilder2.curveTo(232.94f, 98.34f, 220.14f, 131.44f, 197.12f, 145.38f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _plant = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
