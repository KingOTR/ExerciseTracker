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

/* compiled from: Gearsix.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GearSix", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGearSix", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gearSix", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearsixKt {
    private static ImageVector _gearSix;

    public static final ImageVector getGearSix(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _gearSix;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GearSix", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 82.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f);
        pathBuilder.arcTo(46.06f, 46.06f, 0.0f, false, false, 128.0f, 82.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 162.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, true, 128.0f, 162.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 107.6f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.92f, -4.0f);
        pathBuilder.lineTo(202.64f, 86.22f);
        pathBuilder.lineToRelative(-0.42f, -0.71f);
        pathBuilder.lineTo(202.1f, 51.2f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 46.64f);
        pathBuilder.arcToRelative(110.12f, 110.12f, 0.0f, false, false, -36.07f, -20.31f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.84f, 0.45f);
        pathBuilder.lineTo(128.46f, 43.86f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.lineTo(96.91f, 26.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.86f, -0.44f);
        pathBuilder.arcTo(109.92f, 109.92f, 0.0f, false, false, 56.0f, 46.68f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.12f, 4.55f);
        pathBuilder.lineToRelative(-0.16f, 34.34f);
        pathBuilder.curveToRelative(-0.14f, 0.23f, -0.28f, 0.47f, -0.41f, 0.71f);
        pathBuilder.lineTo(22.91f, 103.57f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 20.0f, 107.62f);
        pathBuilder.arcToRelative(104.81f, 104.81f, 0.0f, false, false, 0.0f, 40.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.92f, 4.0f);
        pathBuilder.lineToRelative(30.42f, 17.33f);
        pathBuilder.lineToRelative(0.42f, 0.71f);
        pathBuilder.lineToRelative(0.12f, 34.31f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 56.0f, 209.36f);
        pathBuilder.arcToRelative(110.12f, 110.12f, 0.0f, false, false, 36.07f, 20.31f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.84f, -0.45f);
        pathBuilder.lineToRelative(30.61f, -17.08f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.lineToRelative(30.56f, 17.1f);
        pathBuilder.arcTo(6.09f, 6.09f, 0.0f, false, false, 162.0f, 230.0f);
        pathBuilder.arcToRelative(5.83f, 5.83f, 0.0f, false, false, 1.93f, -0.32f);
        pathBuilder.arcToRelative(109.92f, 109.92f, 0.0f, false, false, 36.0f, -20.36f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.12f, -4.55f);
        pathBuilder.lineToRelative(0.16f, -34.34f);
        pathBuilder.curveToRelative(0.14f, -0.23f, 0.28f, -0.47f, 0.41f, -0.71f);
        pathBuilder.lineToRelative(30.42f, -17.29f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.92f, -4.05f);
        pathBuilder.arcTo(104.81f, 104.81f, 0.0f, false, false, 236.0f, 107.6f);
        pathBuilder.close();
        pathBuilder.moveTo(224.75f, 143.39f);
        pathBuilder.lineTo(195.32f, 160.1f);
        pathBuilder.arcToRelative(6.07f, 6.07f, 0.0f, false, false, -2.28f, 2.3f);
        pathBuilder.curveToRelative(-0.59f, 1.0f, -1.21f, 2.11f, -1.86f, 3.14f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.91f, 3.16f);
        pathBuilder.lineToRelative(-0.16f, 33.21f);
        pathBuilder.arcToRelative(98.15f, 98.15f, 0.0f, false, true, -27.52f, 15.53f);
        pathBuilder.lineTo(133.0f, 200.88f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.93f, -0.77f);
        pathBuilder.horizontalLineToRelative(-0.14f);
        pathBuilder.curveToRelative(-1.24f, 0.0f, -2.5f, 0.0f, -3.74f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.07f, 0.76f);
        pathBuilder.lineTo(93.45f, 217.43f);
        pathBuilder.arcToRelative(98.0f, 98.0f, 0.0f, false, true, -27.56f, -15.49f);
        pathBuilder.lineToRelative(-0.12f, -33.17f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.91f, -3.16f);
        pathBuilder.curveToRelative(-0.64f, -1.0f, -1.27f, -2.08f, -1.86f, -3.14f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.27f, -2.3f);
        pathBuilder.lineTo(31.3f, 143.4f);
        pathBuilder.arcToRelative(93.0f, 93.0f, 0.0f, false, true, 0.0f, -30.79f);
        pathBuilder.lineTo(60.68f, 95.9f);
        pathBuilder.arcTo(6.07f, 6.07f, 0.0f, false, false, 63.0f, 93.6f);
        pathBuilder.curveToRelative(0.59f, -1.0f, 1.21f, -2.11f, 1.86f, -3.14f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.91f, -3.16f);
        pathBuilder.lineToRelative(0.16f, -33.21f);
        pathBuilder.arcTo(98.15f, 98.15f, 0.0f, false, true, 93.41f, 38.56f);
        pathBuilder.lineTo(123.0f, 55.12f);
        pathBuilder.arcToRelative(5.81f, 5.81f, 0.0f, false, false, 3.07f, 0.76f);
        pathBuilder.curveToRelative(1.24f, 0.0f, 2.5f, 0.0f, 3.74f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.07f, -0.76f);
        pathBuilder.lineToRelative(29.65f, -16.56f);
        pathBuilder.arcToRelative(98.0f, 98.0f, 0.0f, false, true, 27.56f, 15.49f);
        pathBuilder.lineToRelative(0.12f, 33.17f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.91f, 3.16f);
        pathBuilder.curveToRelative(0.64f, 1.0f, 1.27f, 2.08f, 1.86f, 3.14f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.27f, 2.3f);
        pathBuilder.lineTo(224.7f, 112.6f);
        pathBuilder.arcTo(93.0f, 93.0f, 0.0f, false, true, 224.73f, 143.39f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gearSix = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
