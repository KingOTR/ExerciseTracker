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

/* compiled from: Plant.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Plant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPlant", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_plant", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlantKt {
    private static ImageVector _plant;

    public static final ImageVector getPlant(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(243.63f, 48.12f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.76f, -3.75f);
        pathBuilder.curveToRelative(-50.25f, -3.0f, -90.44f, 12.1f, -107.52f, 40.29f);
        pathBuilder.curveToRelative(-11.64f, 19.22f, -11.17f, 41.92f, 1.24f, 64.21f);
        pathBuilder.arcToRelative(67.33f, 67.33f, 0.0f, false, false, -16.65f, 34.41f);
        pathBuilder.lineTo(93.45f, 159.79f);
        pathBuilder.curveToRelative(8.63f, -16.0f, 8.81f, -32.33f, 0.42f, -46.19f);
        pathBuilder.curveTo(81.45f, 93.09f, 52.35f, 82.13f, 16.0f, 84.26f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 12.26f, 88.0f);
        pathBuilder.curveToRelative(-2.13f, 36.33f, 8.83f, 65.43f, 29.34f, 77.85f);
        pathBuilder.arcToRelative(41.82f, 41.82f, 0.0f, false, false, 21.88f, 6.18f);
        pathBuilder.arcToRelative(51.29f, 51.29f, 0.0f, false, false, 24.31f, -6.6f);
        pathBuilder.lineTo(116.0f, 193.67f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.0f, 0.56f, 0.0f, 0.84f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineTo(194.51f);
        pathBuilder.arcToRelative(59.57f, 59.57f, 0.0f, false, true, 15.29f, -40.0f);
        pathBuilder.curveToRelative(11.49f, 6.36f, 23.07f, 9.56f, 34.24f, 9.56f);
        pathBuilder.arcToRelative(57.0f, 57.0f, 0.0f, false, false, 29.81f, -8.41f);
        pathBuilder.curveTo(231.52f, 138.57f, 246.59f, 98.38f, 243.63f, 48.12f);
        pathBuilder.close();
        pathBuilder.moveTo(45.74f, 159.0f);
        pathBuilder.curveTo(28.47f, 148.56f, 19.0f, 123.69f, 20.08f, 92.08f);
        pathBuilder.curveToRelative(31.61f, -1.09f, 56.48f, 8.39f, 67.0f, 25.66f);
        pathBuilder.curveToRelative(6.48f, 10.71f, 6.59f, 23.37f, 0.46f, 36.09f);
        pathBuilder.lineTo(58.82f, 125.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 5.65f);
        pathBuilder.lineToRelative(28.67f, 28.67f);
        pathBuilder.curveTo(69.11f, 165.62f, 56.45f, 165.51f, 45.74f, 159.0f);
        pathBuilder.close();
        pathBuilder.moveTo(199.19f, 148.8f);
        pathBuilder.curveToRelative(-16.05f, 9.72f, -35.09f, 9.59f, -54.08f, -0.25f);
        pathBuilder.lineToRelative(57.72f, -57.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, -5.66f);
        pathBuilder.lineToRelative(-57.73f, 57.73f);
        pathBuilder.curveToRelative(-9.84f, -19.0f, -10.0f, -38.0f, -0.25f, -54.08f);
        pathBuilder.curveToRelative(15.11f, -25.0f, 51.08f, -38.53f, 96.63f, -36.64f);
        pathBuilder.curveTo(237.73f, 97.72f, 224.15f, 133.69f, 199.19f, 148.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _plant = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
