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

/* compiled from: Flower.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFlower", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flower", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowerKt {
    private static ImageVector _flower;

    public static final ImageVector getFlower(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _flower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Flower", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(209.35f, 131.09f);
        pathBuilder.arcToRelative(42.24f, 42.24f, 0.0f, false, false, -6.82f, -3.09f);
        pathBuilder.arcToRelative(42.24f, 42.24f, 0.0f, false, false, 6.82f, -3.09f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, false, -38.0f, -65.82f);
        pathBuilder.arcToRelative(43.33f, 43.33f, 0.0f, false, false, -6.08f, 4.36f);
        pathBuilder.arcTo(42.94f, 42.94f, 0.0f, false, false, 166.0f, 56.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f);
        pathBuilder.arcToRelative(42.94f, 42.94f, 0.0f, false, false, 0.73f, 7.45f);
        pathBuilder.arcToRelative(43.33f, 43.33f, 0.0f, false, false, -6.08f, -4.36f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, 65.82f);
        pathBuilder.arcTo(42.24f, 42.24f, 0.0f, false, false, 53.47f, 128.0f);
        pathBuilder.arcToRelative(42.24f, 42.24f, 0.0f, false, false, -6.82f, 3.09f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 9.16f, 69.62f);
        pathBuilder.arcToRelative(38.53f, 38.53f, 0.0f, false, false, 9.9f, 1.31f);
        pathBuilder.arcToRelative(37.82f, 37.82f, 0.0f, false, false, 18.94f, -5.11f);
        pathBuilder.arcToRelative(43.33f, 43.33f, 0.0f, false, false, 6.08f, -4.36f);
        pathBuilder.arcTo(42.94f, 42.94f, 0.0f, false, false, 90.0f, 200.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 76.0f, 0.0f);
        pathBuilder.arcToRelative(42.94f, 42.94f, 0.0f, false, false, -0.73f, -7.45f);
        pathBuilder.arcToRelative(43.33f, 43.33f, 0.0f, false, false, 6.08f, 4.36f);
        pathBuilder.arcTo(37.82f, 37.82f, 0.0f, false, false, 190.29f, 202.0f);
        pathBuilder.arcToRelative(38.53f, 38.53f, 0.0f, false, false, 9.9f, -1.31f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 9.16f, -69.62f);
        pathBuilder.close();
        pathBuilder.moveTo(177.35f, 69.48f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, 45.0f);
        pathBuilder.curveToRelative(-4.77f, 2.75f, -14.92f, 6.15f, -36.4f, 7.47f);
        pathBuilder.lineToRelative(-1.44f, -0.08f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 152.0f, 98.58f);
        pathBuilder.lineToRelative(0.66f, -1.31f);
        pathBuilder.curveTo(164.56f, 79.33f, 172.58f, 72.24f, 177.35f, 69.48f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 154.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 30.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f);
        pathBuilder.curveToRelative(0.0f, 5.51f, -2.13f, 16.0f, -11.73f, 35.27f);
        pathBuilder.curveToRelative(-0.26f, 0.4f, -0.53f, 0.8f, -0.79f, 1.21f);
        pathBuilder.arcToRelative(37.88f, 37.88f, 0.0f, false, false, -27.0f, 0.0f);
        pathBuilder.lineToRelative(-0.79f, -1.22f);
        pathBuilder.curveTo(104.13f, 72.0f, 102.0f, 61.51f, 102.0f, 56.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 30.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.65f, 114.52f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, -45.0f);
        pathBuilder.curveToRelative(4.77f, 2.76f, 12.79f, 9.85f, 24.67f, 27.79f);
        pathBuilder.lineToRelative(0.66f, 1.31f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, -13.49f, 23.33f);
        pathBuilder.lineToRelative(-1.44f, 0.08f);
        pathBuilder.curveTo(67.57f, 120.67f, 57.42f, 117.27f, 52.65f, 114.52f);
        pathBuilder.close();
        pathBuilder.moveTo(78.65f, 186.52f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -45.0f);
        pathBuilder.curveToRelative(4.77f, -2.75f, 14.92f, -6.15f, 36.4f, -7.47f);
        pathBuilder.lineToRelative(1.44f, 0.08f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 104.0f, 157.42f);
        pathBuilder.lineToRelative(-0.66f, 1.31f);
        pathBuilder.curveTo(91.44f, 176.67f, 83.42f, 183.76f, 78.65f, 186.52f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 226.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f);
        pathBuilder.curveToRelative(0.0f, -5.51f, 2.13f, -16.0f, 11.73f, -35.27f);
        pathBuilder.curveToRelative(0.26f, -0.4f, 0.53f, -0.8f, 0.79f, -1.21f);
        pathBuilder.arcToRelative(37.88f, 37.88f, 0.0f, false, false, 27.0f, 0.0f);
        pathBuilder.lineToRelative(0.79f, 1.22f);
        pathBuilder.curveTo(151.87f, 184.0f, 154.0f, 194.49f, 154.0f, 200.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 226.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.87f, 177.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -35.52f, 9.52f);
        pathBuilder.curveToRelative(-4.77f, -2.76f, -12.79f, -9.85f, -24.67f, -27.79f);
        pathBuilder.lineToRelative(-0.66f, -1.31f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 13.49f, -23.33f);
        pathBuilder.lineTo(167.0f, 134.0f);
        pathBuilder.curveToRelative(21.48f, 1.32f, 31.63f, 4.72f, 36.4f, 7.47f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 212.87f, 177.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flower = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
