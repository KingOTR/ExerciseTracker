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

/* compiled from: Coin.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Coin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCoin", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coin", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinKt {
    private static ImageVector _coin;

    public static final ImageVector getCoin(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _coin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Coin", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(206.68f, 65.63f);
        pathBuilder.curveTo(186.23f, 55.41f, 159.0f, 50.0f, 128.0f, 50.0f);
        pathBuilder.reflectiveCurveTo(69.77f, 55.41f, 49.32f, 65.63f);
        pathBuilder.curveTo(29.41f, 75.58f, 18.0f, 89.57f, 18.0f, 104.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.curveToRelative(0.0f, 14.43f, 11.41f, 28.42f, 31.32f, 38.37f);
        pathBuilder.curveTo(69.77f, 200.59f, 97.0f, 206.0f, 128.0f, 206.0f);
        pathBuilder.reflectiveCurveToRelative(58.23f, -5.41f, 78.68f, -15.63f);
        pathBuilder.curveTo(226.59f, 180.42f, 238.0f, 166.43f, 238.0f, 152.0f);
        pathBuilder.lineTo(238.0f, 104.0f);
        pathBuilder.curveTo(238.0f, 89.57f, 226.59f, 75.58f, 206.68f, 65.63f);
        pathBuilder.close();
        pathBuilder.moveTo(54.68f, 76.37f);
        pathBuilder.curveTo(73.21f, 67.1f, 99.25f, 62.0f, 128.0f, 62.0f);
        pathBuilder.reflectiveCurveToRelative(54.79f, 5.1f, 73.32f, 14.37f);
        pathBuilder.curveTo(217.0f, 84.21f, 226.0f, 94.28f, 226.0f, 104.0f);
        pathBuilder.reflectiveCurveToRelative(-9.0f, 19.79f, -24.68f, 27.63f);
        pathBuilder.curveTo(182.79f, 140.9f, 156.75f, 146.0f, 128.0f, 146.0f);
        pathBuilder.reflectiveCurveToRelative(-54.79f, -5.1f, -73.32f, -14.37f);
        pathBuilder.curveTo(39.0f, 123.79f, 30.0f, 113.72f, 30.0f, 104.0f);
        pathBuilder.reflectiveCurveTo(39.0f, 84.21f, 54.68f, 76.37f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 157.93f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.curveToRelative(-19.24f, -0.48f, -37.07f, -3.28f, -52.0f, -8.11f);
        pathBuilder.verticalLineToRelative(-35.4f);
        pathBuilder.curveTo(85.27f, 154.93f, 102.85f, 157.49f, 122.0f, 157.93f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 157.93f);
        pathBuilder.curveToRelative(19.15f, -0.44f, 36.73f, -3.0f, 52.0f, -7.52f);
        pathBuilder.verticalLineToRelative(35.4f);
        pathBuilder.curveToRelative(-14.93f, 4.83f, -32.76f, 7.63f, -52.0f, 8.11f);
        pathBuilder.close();
        pathBuilder.moveTo(30.0f, 152.0f);
        pathBuilder.lineTo(30.0f, 129.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 19.32f, 13.36f);
        pathBuilder.quadToRelative(4.16f, 2.07f, 8.68f, 3.88f);
        pathBuilder.verticalLineToRelative(35.0f);
        pathBuilder.curveToRelative(-1.13f, -0.52f, -2.24f, -1.0f, -3.32f, -1.58f);
        pathBuilder.curveTo(39.0f, 171.79f, 30.0f, 161.72f, 30.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(201.32f, 179.63f);
        pathBuilder.curveToRelative(-1.08f, 0.54f, -2.19f, 1.06f, -3.32f, 1.58f);
        pathBuilder.verticalLineToRelative(-35.0f);
        pathBuilder.quadToRelative(4.51f, -1.81f, 8.68f, -3.88f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, false, 226.0f, 129.0f);
        pathBuilder.verticalLineToRelative(23.0f);
        pathBuilder.curveTo(226.0f, 161.72f, 217.0f, 171.79f, 201.32f, 179.63f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
