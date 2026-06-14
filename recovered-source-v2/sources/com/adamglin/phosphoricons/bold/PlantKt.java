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

/* compiled from: Plant.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Plant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPlant", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_plant", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlantKt {
    private static ImageVector _plant;

    public static final ImageVector getPlant(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(255.62f, 51.65f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.27f, -11.27f);
        pathBuilder.curveToRelative(-53.27f, -3.13f, -96.2f, 13.36f, -114.84f, 44.14f);
        pathBuilder.curveToRelative(-12.14f, 20.0f, -12.56f, 44.17f, -1.46f, 67.3f);
        pathBuilder.arcToRelative(75.14f, 75.14f, 0.0f, false, false, -12.28f, 23.0f);
        pathBuilder.lineToRelative(-12.66f, -12.66f);
        pathBuilder.curveToRelative(7.19f, -16.77f, 6.43f, -34.11f, -2.4f, -48.69f);
        pathBuilder.curveTo(86.73f, 90.36f, 54.89f, 78.0f, 15.55f, 80.27f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 4.28f, 91.55f);
        pathBuilder.curveTo(2.0f, 130.89f, 14.36f, 162.73f, 37.45f, 176.71f);
        pathBuilder.arcToRelative(49.76f, 49.76f, 0.0f, false, false, 26.0f, 7.27f);
        pathBuilder.arcToRelative(57.54f, 57.54f, 0.0f, false, false, 22.7f, -4.87f);
        pathBuilder.lineTo(112.0f, 205.0f);
        pathBuilder.verticalLineToRelative(23.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(198.51f);
        pathBuilder.arcToRelative(51.63f, 51.63f, 0.0f, false, true, 9.49f, -29.95f);
        pathBuilder.arcToRelative(76.82f, 76.82f, 0.0f, false, false, 32.1f, 7.39f);
        pathBuilder.arcToRelative(64.91f, 64.91f, 0.0f, false, false, 33.89f, -9.46f);
        pathBuilder.curveTo(242.25f, 147.85f, 258.76f, 104.92f, 255.62f, 51.65f);
        pathBuilder.close();
        pathBuilder.moveTo(49.88f, 156.18f);
        pathBuilder.curveToRelative(-13.19f, -8.0f, -21.18f, -27.46f, -21.83f, -52.13f);
        pathBuilder.curveToRelative(24.67f, 0.65f, 44.14f, 8.64f, 52.13f, 21.83f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 3.63f, 17.0f);
        pathBuilder.lineTo(72.48f, 131.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f);
        pathBuilder.lineToRelative(11.34f, 11.34f);
        pathBuilder.arcTo(26.27f, 26.27f, 0.0f, false, true, 49.88f, 156.18f);
        pathBuilder.close();
        pathBuilder.moveTo(199.05f, 146.0f);
        pathBuilder.curveToRelative(-10.66f, 6.45f, -23.0f, 7.67f, -35.81f, 3.76f);
        pathBuilder.lineToRelative(37.25f, -37.24f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f);
        pathBuilder.lineToRelative(-37.25f, 37.24f);
        pathBuilder.curveTo(142.37f, 120.0f, 143.59f, 107.61f, 150.0f, 97.0f);
        pathBuilder.curveToRelative(12.7f, -21.0f, 42.65f, -33.0f, 81.32f, -33.0f);
        pathBuilder.horizontalLineTo(232.0f);
        pathBuilder.curveTo(232.14f, 103.0f, 220.14f, 133.18f, 199.05f, 146.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _plant = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
