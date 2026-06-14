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

/* compiled from: Butterfly.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Butterfly", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getButterfly", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_butterfly", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButterflyKt {
    private static ImageVector _butterfly;

    public static final ImageVector getButterfly(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _butterfly;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Butterfly", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(231.1f, 51.71f);
        pathBuilder.curveTo(226.09f, 45.27f, 218.64f, 42.0f, 209.0f, 42.0f);
        pathBuilder.curveToRelative(-16.33f, 0.0f, -37.41f, 11.06f, -56.4f, 29.59f);
        pathBuilder.arcTo(132.0f, 132.0f, 0.0f, false, false, 134.0f, 93.94f);
        pathBuilder.lineTo(134.0f, 56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 93.94f);
        pathBuilder.arcToRelative(132.0f, 132.0f, 0.0f, false, false, -18.54f, -22.35f);
        pathBuilder.curveTo(84.49f, 53.06f, 63.4f, 42.0f, 47.07f, 42.0f);
        pathBuilder.curveToRelative(-9.69f, 0.0f, -17.14f, 3.27f, -22.15f, 9.71f);
        pathBuilder.curveToRelative(-5.53f, 7.11f, -7.71f, 17.69f, -6.66f, 32.34f);
        pathBuilder.curveToRelative(0.91f, 12.73f, 4.12f, 26.53f, 6.81f, 37.13f);
        pathBuilder.curveToRelative(6.28f, 24.74f, 20.77f, 33.0f, 31.78f, 35.68f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, true, false, 128.0f, 201.62f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, true, false, 71.16f, -44.76f);
        pathBuilder.curveToRelative(11.0f, -2.63f, 25.5f, -10.94f, 31.78f, -35.68f);
        pathBuilder.curveTo(237.55f, 95.21f, 242.72f, 66.65f, 231.1f, 51.71f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 210.0f);
        pathBuilder.arcToRelative(30.12f, 30.12f, 0.0f, false, true, -3.34f, -60.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 87.35f, 138.0f);
        pathBuilder.arcToRelative(41.71f, 41.71f, 0.0f, false, false, -20.28f, 8.0f);
        pathBuilder.curveToRelative(-9.0f, 0.31f, -24.12f, -3.16f, -30.37f, -27.76f);
        pathBuilder.curveToRelative(-3.25f, -12.81f, -11.89f, -46.83f, -2.31f, -59.15f);
        pathBuilder.curveTo(37.05f, 55.66f, 41.2f, 54.0f, 47.07f, 54.0f);
        pathBuilder.curveToRelative(12.88f, 0.0f, 31.72f, 10.28f, 48.0f, 26.18f);
        pathBuilder.curveTo(111.69f, 96.39f, 122.0f, 114.59f, 122.0f, 127.67f);
        pathBuilder.lineTo(122.0f, 180.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, true, 92.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.31f, 118.23f);
        pathBuilder.curveTo(213.07f, 142.83f, 198.0f, 146.29f, 189.0f, 146.0f);
        pathBuilder.arcToRelative(41.62f, 41.62f, 0.0f, false, false, -20.28f, -8.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, false, 167.36f, 150.0f);
        pathBuilder.arcTo(30.11f, 30.11f, 0.0f, true, true, 134.0f, 180.0f);
        pathBuilder.lineTo(134.0f, 127.67f);
        pathBuilder.curveToRelative(0.0f, -13.08f, 10.32f, -31.28f, 26.93f, -47.49f);
        pathBuilder.curveTo(177.23f, 64.28f, 196.07f, 54.0f, 209.0f, 54.0f);
        pathBuilder.curveToRelative(5.87f, 0.0f, 10.0f, 1.66f, 12.68f, 5.08f);
        pathBuilder.curveTo(231.21f, 71.4f, 222.57f, 105.42f, 219.32f, 118.23f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _butterfly = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
