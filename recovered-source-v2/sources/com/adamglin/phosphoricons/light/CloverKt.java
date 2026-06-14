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

/* compiled from: Clover.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Clover", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getClover", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_clover", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloverKt {
    private static ImageVector _clover;

    public static final ImageVector getClover(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(210.86f, 163.71f);
        pathBuilder.curveTo(223.56f, 158.21f, 230.0f, 143.5f, 230.0f, 120.0f);
        pathBuilder.reflectiveCurveToRelative(-6.44f, -38.21f, -19.14f, -43.71f);
        pathBuilder.curveToRelative(-14.5f, -6.29f, -34.0f, 1.5f, -51.0f, 11.8f);
        pathBuilder.curveToRelative(10.3f, -16.93f, 18.08f, -36.45f, 11.8f, -50.95f);
        pathBuilder.curveTo(166.21f, 24.44f, 151.5f, 18.0f, 128.0f, 18.0f);
        pathBuilder.reflectiveCurveTo(89.79f, 24.44f, 84.29f, 37.14f);
        pathBuilder.curveToRelative(-6.28f, 14.5f, 1.5f, 34.0f, 11.8f, 51.0f);
        pathBuilder.curveTo(79.17f, 77.79f, 59.64f, 70.0f, 45.14f, 76.29f);
        pathBuilder.curveTo(32.44f, 81.79f, 26.0f, 96.5f, 26.0f, 120.0f);
        pathBuilder.reflectiveCurveToRelative(6.44f, 38.21f, 19.14f, 43.71f);
        pathBuilder.arcTo(29.08f, 29.08f, 0.0f, false, false, 56.78f, 166.0f);
        pathBuilder.curveToRelative(12.42f, 0.0f, 26.6f, -6.33f, 39.32f, -14.08f);
        pathBuilder.curveToRelative(-10.31f, 16.93f, -18.1f, 36.46f, -11.81f, 51.0f);
        pathBuilder.curveTo(89.79f, 215.56f, 104.5f, 222.0f, 128.0f, 222.0f);
        pathBuilder.reflectiveCurveToRelative(38.21f, -6.44f, 43.71f, -19.14f);
        pathBuilder.curveToRelative(3.0f, -6.82f, 2.79f, -14.76f, 0.72f, -23.0f);
        pathBuilder.curveToRelative(12.62f, 18.21f, 24.22f, 39.49f, 29.75f, 61.6f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 246.0f);
        pathBuilder.arcToRelative(6.14f, 6.14f, 0.0f, false, false, 1.46f, -0.18f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.36f, -7.28f);
        pathBuilder.curveToRelative(-7.56f, -30.24f, -25.2f, -58.44f, -42.18f, -80.2f);
        pathBuilder.curveToRelative(9.32f, 4.51f, 18.88f, 7.63f, 27.58f, 7.63f);
        pathBuilder.arcTo(29.11f, 29.11f, 0.0f, false, false, 210.86f, 163.71f);
        pathBuilder.close();
        pathBuilder.moveTo(95.3f, 41.91f);
        pathBuilder.curveTo(98.73f, 34.0f, 109.73f, 30.0f, 128.0f, 30.0f);
        pathBuilder.reflectiveCurveToRelative(29.27f, 4.0f, 32.7f, 11.91f);
        pathBuilder.curveToRelative(3.9f, 9.0f, -1.11f, 24.85f, -14.11f, 44.61f);
        pathBuilder.arcTo(247.27f, 247.27f, 0.0f, false, true, 128.0f, 111.0f);
        pathBuilder.arcToRelative(247.27f, 247.27f, 0.0f, false, true, -18.59f, -24.45f);
        pathBuilder.curveTo(96.41f, 66.76f, 91.4f, 50.91f, 95.3f, 41.91f);
        pathBuilder.close();
        pathBuilder.moveTo(49.91f, 152.7f);
        pathBuilder.curveTo(42.0f, 149.27f, 38.0f, 138.27f, 38.0f, 120.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, -29.27f, 11.91f, -32.7f);
        pathBuilder.arcToRelative(17.46f, 17.46f, 0.0f, false, true, 7.0f, -1.29f);
        pathBuilder.curveToRelative(9.26f, 0.0f, 22.27f, 5.28f, 37.65f, 15.4f);
        pathBuilder.arcTo(246.07f, 246.07f, 0.0f, false, true, 119.0f, 120.0f);
        pathBuilder.arcToRelative(246.07f, 246.07f, 0.0f, false, true, -24.45f, 18.59f);
        pathBuilder.curveTo(74.76f, 151.59f, 58.91f, 156.6f, 49.91f, 152.7f);
        pathBuilder.close();
        pathBuilder.moveTo(160.7f, 198.09f);
        pathBuilder.curveTo(157.27f, 206.0f, 146.27f, 210.0f, 128.0f, 210.0f);
        pathBuilder.reflectiveCurveToRelative(-29.27f, -4.0f, -32.7f, -11.91f);
        pathBuilder.curveToRelative(-3.9f, -9.0f, 1.11f, -24.85f, 14.11f, -44.61f);
        pathBuilder.arcTo(246.07f, 246.07f, 0.0f, false, true, 128.0f, 129.0f);
        pathBuilder.arcToRelative(246.07f, 246.07f, 0.0f, false, true, 18.59f, 24.45f);
        pathBuilder.curveTo(159.59f, 173.24f, 164.6f, 189.08f, 160.7f, 198.09f);
        pathBuilder.close();
        pathBuilder.moveTo(161.48f, 138.59f);
        pathBuilder.arcTo(246.07f, 246.07f, 0.0f, false, true, 137.0f, 120.0f);
        pathBuilder.arcToRelative(246.07f, 246.07f, 0.0f, false, true, 24.45f, -18.59f);
        pathBuilder.curveToRelative(19.76f, -13.0f, 35.61f, -18.0f, 44.61f, -14.11f);
        pathBuilder.curveTo(214.0f, 90.73f, 218.0f, 101.73f, 218.0f, 120.0f);
        pathBuilder.reflectiveCurveToRelative(-4.0f, 29.27f, -11.91f, 32.7f);
        pathBuilder.curveTo(197.09f, 156.6f, 181.24f, 151.59f, 161.48f, 138.59f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _clover = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
