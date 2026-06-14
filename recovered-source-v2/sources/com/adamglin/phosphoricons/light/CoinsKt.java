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

/* compiled from: Coins.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Coins", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCoins", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coins", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinsKt {
    private static ImageVector _coins;

    public static final ImageVector getCoins(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _coins;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Coins", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.56f, 103.81f);
        pathBuilder.curveTo(213.43f, 97.75f, 198.47f, 93.39f, 182.0f, 91.34f);
        pathBuilder.lineTo(182.0f, 84.0f);
        pathBuilder.curveToRelative(0.0f, -12.12f, -9.58f, -23.1f, -27.0f, -30.93f);
        pathBuilder.curveTo(139.16f, 45.93f, 118.2f, 42.0f, 96.0f, 42.0f);
        pathBuilder.reflectiveCurveTo(52.84f, 45.93f, 37.0f, 53.07f);
        pathBuilder.curveTo(19.58f, 60.9f, 10.0f, 71.88f, 10.0f, 84.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.curveToRelative(0.0f, 12.12f, 9.58f, 23.1f, 27.0f, 30.93f);
        pathBuilder.curveToRelative(10.49f, 4.72f, 23.21f, 8.0f, 37.0f, 9.73f);
        pathBuilder.lineTo(74.0f, 172.0f);
        pathBuilder.curveToRelative(0.0f, 12.12f, 9.58f, 23.1f, 27.0f, 30.93f);
        pathBuilder.curveTo(116.84f, 210.07f, 137.8f, 214.0f, 160.0f, 214.0f);
        pathBuilder.reflectiveCurveToRelative(43.16f, -3.93f, 59.0f, -11.07f);
        pathBuilder.curveToRelative(17.39f, -7.83f, 27.0f, -18.81f, 27.0f, -30.93f);
        pathBuilder.lineTo(246.0f, 132.0f);
        pathBuilder.curveTo(246.0f, 121.35f, 238.39f, 111.34f, 224.56f, 103.81f);
        pathBuilder.close();
        pathBuilder.moveTo(218.82f, 114.35f);
        pathBuilder.curveTo(228.61f, 119.68f, 234.0f, 126.0f, 234.0f, 132.0f);
        pathBuilder.curveToRelative(0.0f, 14.19f, -30.39f, 30.0f, -74.0f, 30.0f);
        pathBuilder.arcToRelative(166.9f, 166.9f, 0.0f, false, true, -21.21f, -1.34f);
        pathBuilder.arcTo(110.79f, 110.79f, 0.0f, false, false, 155.0f, 154.93f);
        pathBuilder.curveToRelative(17.39f, -7.83f, 27.0f, -18.81f, 27.0f, -30.93f);
        pathBuilder.lineTo(182.0f, 103.43f);
        pathBuilder.curveTo(196.4f, 105.36f, 209.3f, 109.16f, 218.82f, 114.35f);
        pathBuilder.close();
        pathBuilder.moveTo(108.16f, 153.58f);
        pathBuilder.curveToRelative(-3.92f, 0.27f, -8.0f, 0.42f, -12.16f, 0.42f);
        pathBuilder.curveToRelative(-5.3f, 0.0f, -10.4f, -0.24f, -15.28f, -0.67f);
        pathBuilder.arcToRelative(2.22f, 2.22f, 0.0f, false, false, -0.37f, 0.0f);
        pathBuilder.curveToRelative(-3.58f, -0.33f, -7.0f, -0.77f, -10.35f, -1.3f);
        pathBuilder.lineTo(70.0f, 124.12f);
        pathBuilder.arcTo(178.0f, 178.0f, 0.0f, false, false, 96.0f, 126.0f);
        pathBuilder.arcToRelative(178.0f, 178.0f, 0.0f, false, false, 26.0f, -1.88f);
        pathBuilder.lineTo(122.0f, 152.0f);
        pathBuilder.curveToRelative(-4.34f, 0.69f, -8.91f, 1.22f, -13.69f, 1.56f);
        pathBuilder.close();
        pathBuilder.moveTo(170.0f, 105.89f);
        pathBuilder.lineTo(170.0f, 124.0f);
        pathBuilder.curveToRelative(0.0f, 9.54f, -13.75f, 19.8f, -36.0f, 25.51f);
        pathBuilder.lineTo(134.0f, 121.85f);
        pathBuilder.arcToRelative(115.0f, 115.0f, 0.0f, false, false, 21.0f, -6.92f);
        pathBuilder.arcTo(66.2f, 66.2f, 0.0f, false, false, 170.0f, 105.89f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 54.0f);
        pathBuilder.curveToRelative(43.61f, 0.0f, 74.0f, 15.81f, 74.0f, 30.0f);
        pathBuilder.reflectiveCurveToRelative(-30.39f, 30.0f, -74.0f, 30.0f);
        pathBuilder.reflectiveCurveTo(22.0f, 98.19f, 22.0f, 84.0f);
        pathBuilder.reflectiveCurveTo(52.39f, 54.0f, 96.0f, 54.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 124.0f);
        pathBuilder.lineTo(22.0f, 105.89f);
        pathBuilder.arcToRelative(66.2f, 66.2f, 0.0f, false, false, 15.0f, 9.0f);
        pathBuilder.arcToRelative(115.0f, 115.0f, 0.0f, false, false, 21.0f, 6.92f);
        pathBuilder.verticalLineToRelative(27.66f);
        pathBuilder.curveTo(35.75f, 143.8f, 22.0f, 133.54f, 22.0f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(86.0f, 172.0f);
        pathBuilder.verticalLineToRelative(-6.28f);
        pathBuilder.curveToRelative(3.3f, 0.18f, 6.63f, 0.28f, 10.0f, 0.28f);
        pathBuilder.quadToRelative(5.91f, 0.0f, 11.66f, -0.37f);
        pathBuilder.arcTo(123.17f, 123.17f, 0.0f, false, false, 122.0f, 169.84f);
        pathBuilder.verticalLineToRelative(27.67f);
        pathBuilder.curveTo(99.75f, 191.8f, 86.0f, 181.54f, 86.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 200.0f);
        pathBuilder.lineTo(134.0f, 172.1f);
        pathBuilder.arcToRelative(177.84f, 177.84f, 0.0f, false, false, 26.0f, 1.9f);
        pathBuilder.arcToRelative(178.0f, 178.0f, 0.0f, false, false, 26.0f, -1.88f);
        pathBuilder.lineTo(186.0f, 200.0f);
        pathBuilder.arcToRelative(170.0f, 170.0f, 0.0f, false, true, -52.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.0f, 197.51f);
        pathBuilder.lineTo(198.0f, 169.85f);
        pathBuilder.arcToRelative(115.0f, 115.0f, 0.0f, false, false, 21.0f, -6.92f);
        pathBuilder.arcToRelative(66.2f, 66.2f, 0.0f, false, false, 15.0f, -9.0f);
        pathBuilder.lineTo(234.0f, 172.0f);
        pathBuilder.curveTo(234.0f, 181.54f, 220.25f, 191.8f, 198.0f, 197.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coins = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
