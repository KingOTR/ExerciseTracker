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

/* compiled from: Coins.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Coins", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCoins", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coins", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinsKt {
    private static ImageVector _coins;

    public static final ImageVector getCoins(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(180.0f, 93.11f);
        pathBuilder.lineTo(180.0f, 84.0f);
        pathBuilder.curveToRelative(0.0f, -22.43f, -36.9f, -40.0f, -84.0f, -40.0f);
        pathBuilder.reflectiveCurveTo(12.0f, 61.57f, 12.0f, 84.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.curveToRelative(0.0f, 19.14f, 26.86f, 34.72f, 64.0f, 38.89f);
        pathBuilder.lineTo(76.0f, 172.0f);
        pathBuilder.curveToRelative(0.0f, 22.43f, 36.9f, 40.0f, 84.0f, 40.0f);
        pathBuilder.reflectiveCurveToRelative(84.0f, -17.57f, 84.0f, -40.0f);
        pathBuilder.lineTo(244.0f, 132.0f);
        pathBuilder.curveTo(244.0f, 113.12f, 217.87f, 97.37f, 180.0f, 93.11f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 132.0f);
        pathBuilder.curveToRelative(0.0f, 15.45f, -30.54f, 32.0f, -76.0f, 32.0f);
        pathBuilder.arcToRelative(165.71f, 165.71f, 0.0f, false, true, -28.0f, -2.34f);
        pathBuilder.verticalLineToRelative(-1.39f);
        pathBuilder.curveToRelative(28.61f, -6.31f, 48.0f, -20.0f, 48.0f, -36.27f);
        pathBuilder.lineTo(180.0f, 101.17f);
        pathBuilder.curveTo(212.22f, 105.0f, 236.0f, 117.93f, 236.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.19f, 155.59f);
        pathBuilder.quadTo(102.3f, 156.0f, 96.0f, 156.0f);
        pathBuilder.curveToRelative(-5.47f, 0.0f, -10.72f, -0.25f, -15.73f, -0.69f);
        pathBuilder.lineToRelative(-0.27f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-4.16f, -0.38f, -8.16f, -0.9f, -12.0f, -1.56f);
        pathBuilder.lineTo(68.0f, 121.8f);
        pathBuilder.arcTo(174.87f, 174.87f, 0.0f, false, false, 96.0f, 124.0f);
        pathBuilder.arcToRelative(174.87f, 174.87f, 0.0f, false, false, 28.0f, -2.2f);
        pathBuilder.verticalLineToRelative(31.92f);
        pathBuilder.arcToRelative(155.0f, 155.0f, 0.0f, false, true, -15.52f, 1.85f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 101.32f);
        pathBuilder.lineTo(172.0f, 124.0f);
        pathBuilder.curveToRelative(0.0f, 10.88f, -15.16f, 22.3f, -40.0f, 28.11f);
        pathBuilder.lineTo(132.0f, 120.27f);
        pathBuilder.curveTo(149.63f, 116.38f, 163.75f, 109.69f, 172.0f, 101.32f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 52.0f);
        pathBuilder.curveToRelative(45.46f, 0.0f, 76.0f, 16.55f, 76.0f, 32.0f);
        pathBuilder.reflectiveCurveToRelative(-30.54f, 32.0f, -76.0f, 32.0f);
        pathBuilder.reflectiveCurveTo(20.0f, 99.45f, 20.0f, 84.0f);
        pathBuilder.reflectiveCurveTo(50.54f, 52.0f, 96.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 124.0f);
        pathBuilder.lineTo(20.0f, 101.32f);
        pathBuilder.curveToRelative(8.25f, 8.37f, 22.37f, 15.06f, 40.0f, 19.0f);
        pathBuilder.verticalLineToRelative(31.84f);
        pathBuilder.curveTo(35.16f, 146.3f, 20.0f, 134.88f, 20.0f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 172.0f);
        pathBuilder.verticalLineToRelative(-8.4f);
        pathBuilder.curveToRelative(3.91f, 0.26f, 7.92f, 0.4f, 12.0f, 0.4f);
        pathBuilder.reflectiveCurveToRelative(8.06f, -0.14f, 12.0f, -0.39f);
        pathBuilder.arcToRelative(123.93f, 123.93f, 0.0f, false, false, 16.0f, 4.63f);
        pathBuilder.verticalLineToRelative(31.87f);
        pathBuilder.curveTo(99.16f, 194.3f, 84.0f, 182.88f, 84.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 201.72f);
        pathBuilder.lineTo(132.0f, 169.77f);
        pathBuilder.arcTo(174.48f, 174.48f, 0.0f, false, false, 160.0f, 172.0f);
        pathBuilder.arcToRelative(174.87f, 174.87f, 0.0f, false, false, 28.0f, -2.2f);
        pathBuilder.verticalLineToRelative(31.92f);
        pathBuilder.arcToRelative(173.07f, 173.07f, 0.0f, false, true, -56.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 172.0f);
        pathBuilder.curveToRelative(0.0f, 10.88f, -15.16f, 22.3f, -40.0f, 28.11f);
        pathBuilder.lineTo(196.0f, 168.27f);
        pathBuilder.curveToRelative(17.63f, -3.89f, 31.75f, -10.58f, 40.0f, -19.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coins = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
