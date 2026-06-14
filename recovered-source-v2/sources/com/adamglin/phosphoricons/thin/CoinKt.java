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

/* compiled from: Coin.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Coin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCoin", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coin", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinKt {
    private static ImageVector _coin;

    public static final ImageVector getCoin(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(205.79f, 67.42f);
        pathBuilder.curveTo(185.9f, 57.48f, 158.27f, 52.0f, 128.0f, 52.0f);
        pathBuilder.reflectiveCurveTo(70.1f, 57.48f, 50.21f, 67.42f);
        pathBuilder.curveTo(31.0f, 77.0f, 20.0f, 90.35f, 20.0f, 104.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.curveToRelative(0.0f, 13.65f, 11.0f, 27.0f, 30.21f, 36.58f);
        pathBuilder.curveTo(70.1f, 198.52f, 97.73f, 204.0f, 128.0f, 204.0f);
        pathBuilder.reflectiveCurveToRelative(57.9f, -5.48f, 77.79f, -15.42f);
        pathBuilder.curveTo(225.0f, 179.0f, 236.0f, 165.65f, 236.0f, 152.0f);
        pathBuilder.lineTo(236.0f, 104.0f);
        pathBuilder.curveTo(236.0f, 90.35f, 225.0f, 77.0f, 205.79f, 67.42f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 60.0f);
        pathBuilder.curveToRelative(61.77f, 0.0f, 100.0f, 22.84f, 100.0f, 44.0f);
        pathBuilder.reflectiveCurveToRelative(-38.23f, 44.0f, -100.0f, 44.0f);
        pathBuilder.reflectiveCurveTo(28.0f, 125.16f, 28.0f, 104.0f);
        pathBuilder.reflectiveCurveTo(66.23f, 60.0f, 128.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 156.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.curveToRelative(-22.0f, -0.35f, -40.94f, -3.65f, -56.0f, -8.71f);
        pathBuilder.lineTo(68.0f, 147.65f);
        pathBuilder.curveTo(84.23f, 152.75f, 103.44f, 155.62f, 124.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 156.0f);
        pathBuilder.curveToRelative(20.56f, -0.33f, 39.77f, -3.2f, 56.0f, -8.3f);
        pathBuilder.verticalLineToRelative(39.59f);
        pathBuilder.curveToRelative(-15.06f, 5.06f, -33.95f, 8.36f, -56.0f, 8.71f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 152.0f);
        pathBuilder.lineTo(28.0f, 123.92f);
        pathBuilder.curveToRelative(5.15f, 6.19f, 12.67f, 11.89f, 22.21f, 16.66f);
        pathBuilder.curveToRelative(3.08f, 1.54f, 6.36f, 2.95f, 9.79f, 4.28f);
        pathBuilder.verticalLineToRelative(39.38f);
        pathBuilder.curveTo(39.49f, 175.67f, 28.0f, 163.59f, 28.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 11.59f, -11.49f, 23.67f, -32.0f, 32.24f);
        pathBuilder.lineTo(196.0f, 144.86f);
        pathBuilder.curveToRelative(3.43f, -1.33f, 6.71f, -2.74f, 9.79f, -4.28f);
        pathBuilder.curveToRelative(9.54f, -4.77f, 17.06f, -10.47f, 22.21f, -16.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
