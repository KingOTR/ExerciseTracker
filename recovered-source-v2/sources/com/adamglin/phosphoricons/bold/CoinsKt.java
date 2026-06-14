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

/* compiled from: Coins.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Coins", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCoins", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coins", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinsKt {
    private static ImageVector _coins;

    public static final ImageVector getCoins(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(188.0f, 86.11f);
        pathBuilder.lineTo(188.0f, 84.0f);
        pathBuilder.curveToRelative(0.0f, -14.62f, -10.83f, -27.55f, -30.51f, -36.4f);
        pathBuilder.curveTo(140.87f, 40.12f, 119.0f, 36.0f, 96.0f, 36.0f);
        pathBuilder.reflectiveCurveTo(51.13f, 40.12f, 34.51f, 47.6f);
        pathBuilder.curveTo(14.83f, 56.45f, 4.0f, 69.38f, 4.0f, 84.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.curveToRelative(0.0f, 14.62f, 10.83f, 27.55f, 30.51f, 36.4f);
        pathBuilder.arcTo(131.67f, 131.67f, 0.0f, false, false, 68.0f, 169.88f);
        pathBuilder.lineTo(68.0f, 172.0f);
        pathBuilder.curveToRelative(0.0f, 14.62f, 10.83f, 27.55f, 30.51f, 36.4f);
        pathBuilder.curveTo(115.13f, 215.88f, 137.0f, 220.0f, 160.0f, 220.0f);
        pathBuilder.reflectiveCurveToRelative(44.87f, -4.12f, 61.49f, -11.6f);
        pathBuilder.curveTo(241.17f, 199.55f, 252.0f, 186.62f, 252.0f, 172.0f);
        pathBuilder.lineTo(252.0f, 132.0f);
        pathBuilder.curveTo(252.0f, 109.86f, 226.71f, 92.08f, 188.0f, 86.11f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 132.0f);
        pathBuilder.curveToRelative(0.0f, 7.75f, -21.77f, 22.48f, -61.81f, 23.88f);
        pathBuilder.curveTo(180.33f, 147.4f, 188.0f, 136.3f, 188.0f, 124.0f);
        pathBuilder.lineTo(188.0f, 110.44f);
        pathBuilder.curveTo(213.88f, 115.15f, 228.0f, 125.48f, 228.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(107.37f, 147.63f);
        pathBuilder.curveToRelative(-3.63f, 0.24f, -7.42f, 0.37f, -11.37f, 0.37f);
        pathBuilder.curveToRelative(-5.08f, 0.0f, -9.89f, -0.22f, -14.43f, -0.61f);
        pathBuilder.arcToRelative(10.94f, 10.94f, 0.0f, false, false, -1.14f, -0.09f);
        pathBuilder.curveToRelative(-1.51f, -0.14f, -3.0f, -0.3f, -4.43f, -0.48f);
        pathBuilder.lineTo(76.0f, 130.93f);
        pathBuilder.arcTo(187.0f, 187.0f, 0.0f, false, false, 96.0f, 132.0f);
        pathBuilder.arcToRelative(187.0f, 187.0f, 0.0f, false, false, 20.0f, -1.07f);
        pathBuilder.verticalLineToRelative(15.89f);
        pathBuilder.curveToRelative(-2.49f, 0.3f, -5.07f, 0.56f, -7.75f, 0.75f);
        pathBuilder.curveTo(108.0f, 147.58f, 107.66f, 147.6f, 107.37f, 147.63f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 117.14f);
        pathBuilder.lineTo(164.0f, 124.0f);
        pathBuilder.curveToRelative(0.0f, 4.78f, -8.28f, 12.21f, -24.0f, 17.54f);
        pathBuilder.verticalLineToRelative(-15.0f);
        pathBuilder.arcToRelative(115.32f, 115.32f, 0.0f, false, false, 17.49f, -6.13f);
        pathBuilder.quadTo(160.93f, 118.86f, 164.0f, 117.14f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 60.0f);
        pathBuilder.curveToRelative(44.0f, 0.0f, 68.0f, 15.85f, 68.0f, 24.0f);
        pathBuilder.reflectiveCurveToRelative(-24.0f, 24.0f, -68.0f, 24.0f);
        pathBuilder.reflectiveCurveTo(28.0f, 92.15f, 28.0f, 84.0f);
        pathBuilder.reflectiveCurveTo(52.0f, 60.0f, 96.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 124.0f);
        pathBuilder.verticalLineToRelative(-6.86f);
        pathBuilder.quadToRelative(3.08f, 1.71f, 6.51f, 3.26f);
        pathBuilder.arcTo(115.32f, 115.32f, 0.0f, false, false, 52.0f, 126.53f);
        pathBuilder.verticalLineToRelative(15.0f);
        pathBuilder.curveTo(36.28f, 136.21f, 28.0f, 128.78f, 28.0f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 172.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(1.33f, 0.0f, 2.66f, 0.0f, 4.0f, 0.0f);
        pathBuilder.quadToRelative(5.44f, 0.0f, 10.77f, -0.32f);
        pathBuilder.quadToRelative(4.45f, 1.57f, 9.23f, 2.86f);
        pathBuilder.verticalLineToRelative(15.0f);
        pathBuilder.curveTo(100.28f, 184.21f, 92.0f, 176.78f, 92.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 194.82f);
        pathBuilder.lineTo(140.0f, 178.94f);
        pathBuilder.arcTo(186.45f, 186.45f, 0.0f, false, false, 160.0f, 180.0f);
        pathBuilder.arcToRelative(187.0f, 187.0f, 0.0f, false, false, 20.0f, -1.07f);
        pathBuilder.verticalLineToRelative(15.89f);
        pathBuilder.arcToRelative(170.08f, 170.08f, 0.0f, false, true, -40.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 189.54f);
        pathBuilder.verticalLineToRelative(-15.0f);
        pathBuilder.arcToRelative(115.32f, 115.32f, 0.0f, false, false, 17.49f, -6.13f);
        pathBuilder.quadToRelative(3.44f, -1.54f, 6.51f, -3.26f);
        pathBuilder.lineTo(228.0f, 172.0f);
        pathBuilder.curveTo(228.0f, 176.78f, 219.72f, 184.21f, 204.0f, 189.54f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coins = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
