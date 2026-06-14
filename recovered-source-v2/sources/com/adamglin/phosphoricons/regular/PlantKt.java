package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Plant.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Plant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPlant", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_plant", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlantKt {
    private static ImageVector _plant;

    public static final ImageVector getPlant(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(247.63f, 47.89f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, -7.52f);
        pathBuilder.curveToRelative(-51.76f, -3.0f, -93.32f, 12.74f, -111.18f, 42.22f);
        pathBuilder.curveToRelative(-11.8f, 19.49f, -11.78f, 43.16f, -0.16f, 65.74f);
        pathBuilder.arcToRelative(71.34f, 71.34f, 0.0f, false, false, -14.17f, 27.0f);
        pathBuilder.lineTo(98.33f, 159.0f);
        pathBuilder.curveToRelative(7.82f, -16.33f, 7.52f, -33.35f, -1.0f, -47.49f);
        pathBuilder.curveToRelative(-13.2f, -21.79f, -43.67f, -33.47f, -81.5f, -31.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, 7.52f);
        pathBuilder.curveToRelative(-2.23f, 37.83f, 9.46f, 68.3f, 31.25f, 81.5f);
        pathBuilder.arcTo(45.82f, 45.82f, 0.0f, false, false, 63.44f, 176.0f);
        pathBuilder.arcTo(54.58f, 54.58f, 0.0f, false, false, 87.0f, 170.33f);
        pathBuilder.lineToRelative(25.0f, 25.0f);
        pathBuilder.lineTo(112.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(128.0f, 194.51f);
        pathBuilder.arcToRelative(55.61f, 55.61f, 0.0f, false, true, 12.27f, -35.0f);
        pathBuilder.arcToRelative(73.91f, 73.91f, 0.0f, false, false, 33.31f, 8.4f);
        pathBuilder.arcToRelative(60.9f, 60.9f, 0.0f, false, false, 31.83f, -8.86f);
        pathBuilder.curveTo(234.89f, 141.21f, 250.67f, 99.65f, 247.63f, 47.89f);
        pathBuilder.close();
        pathBuilder.moveTo(47.81f, 155.6f);
        pathBuilder.curveTo(32.47f, 146.31f, 23.79f, 124.32f, 24.0f, 96.0f);
        pathBuilder.curveToRelative(28.32f, -0.24f, 50.31f, 8.47f, 59.6f, 23.81f);
        pathBuilder.curveToRelative(4.85f, 8.0f, 5.64f, 17.33f, 2.46f, 26.94f);
        pathBuilder.lineTo(61.65f, 122.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 11.31f);
        pathBuilder.lineToRelative(24.41f, 24.41f);
        pathBuilder.curveTo(65.14f, 161.24f, 55.82f, 160.45f, 47.81f, 155.6f);
        pathBuilder.close();
        pathBuilder.moveTo(197.12f, 145.38f);
        pathBuilder.curveToRelative(-13.4f, 8.11f, -29.15f, 8.73f, -45.15f, 2.0f);
        pathBuilder.lineToRelative(53.69f, -53.7f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f);
        pathBuilder.lineTo(140.65f, 136.0f);
        pathBuilder.curveToRelative(-6.76f, -16.0f, -6.15f, -31.76f, 2.0f, -45.15f);
        pathBuilder.curveToRelative(13.94f, -23.0f, 47.0f, -35.82f, 89.33f, -34.83f);
        pathBuilder.curveTo(232.94f, 98.34f, 220.14f, 131.44f, 197.12f, 145.38f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _plant = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
