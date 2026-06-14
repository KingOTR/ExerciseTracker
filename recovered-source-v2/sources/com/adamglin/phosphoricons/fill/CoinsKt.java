package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Coins.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Coins", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCoins", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coins", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinsKt {
    private static ImageVector _coins;

    public static final ImageVector getCoins(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(184.0f, 89.57f);
        pathBuilder.lineTo(184.0f, 84.0f);
        pathBuilder.curveToRelative(0.0f, -25.08f, -37.83f, -44.0f, -88.0f, -44.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 58.92f, 8.0f, 84.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.curveToRelative(0.0f, 20.89f, 26.25f, 37.49f, 64.0f, 42.46f);
        pathBuilder.lineTo(72.0f, 172.0f);
        pathBuilder.curveToRelative(0.0f, 25.08f, 37.83f, 44.0f, 88.0f, 44.0f);
        pathBuilder.reflectiveCurveToRelative(88.0f, -18.92f, 88.0f, -44.0f);
        pathBuilder.lineTo(248.0f, 132.0f);
        pathBuilder.curveTo(248.0f, 111.3f, 222.58f, 94.68f, 184.0f, 89.57f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 146.87f);
        pathBuilder.curveTo(36.41f, 141.4f, 24.0f, 132.39f, 24.0f, 124.0f);
        pathBuilder.lineTo(24.0f, 109.93f);
        pathBuilder.curveToRelative(8.16f, 5.78f, 19.09f, 10.44f, 32.0f, 13.57f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 123.5f);
        pathBuilder.curveToRelative(12.91f, -3.13f, 23.84f, -7.79f, 32.0f, -13.57f);
        pathBuilder.lineTo(168.0f, 124.0f);
        pathBuilder.curveToRelative(0.0f, 8.39f, -12.41f, 17.4f, -32.0f, 22.87f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 194.87f);
        pathBuilder.curveTo(100.41f, 189.4f, 88.0f, 180.39f, 88.0f, 172.0f);
        pathBuilder.verticalLineToRelative(-4.17f);
        pathBuilder.curveToRelative(2.63f, 0.1f, 5.29f, 0.17f, 8.0f, 0.17f);
        pathBuilder.curveToRelative(3.88f, 0.0f, 7.67f, -0.13f, 11.39f, -0.35f);
        pathBuilder.arcTo(121.92f, 121.92f, 0.0f, false, false, 120.0f, 171.41f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 150.25f);
        pathBuilder.arcTo(163.0f, 163.0f, 0.0f, false, true, 96.0f, 152.0f);
        pathBuilder.arcToRelative(163.0f, 163.0f, 0.0f, false, true, -24.0f, -1.75f);
        pathBuilder.lineTo(72.0f, 126.46f);
        pathBuilder.arcTo(183.74f, 183.74f, 0.0f, false, false, 96.0f, 128.0f);
        pathBuilder.arcToRelative(183.74f, 183.74f, 0.0f, false, false, 24.0f, -1.54f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 198.25f);
        pathBuilder.arcToRelative(165.45f, 165.45f, 0.0f, false, true, -48.0f, 0.0f);
        pathBuilder.lineTo(136.0f, 174.4f);
        pathBuilder.arcToRelative(179.48f, 179.48f, 0.0f, false, false, 24.0f, 1.6f);
        pathBuilder.arcToRelative(183.74f, 183.74f, 0.0f, false, false, 24.0f, -1.54f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 172.0f);
        pathBuilder.curveToRelative(0.0f, 8.39f, -12.41f, 17.4f, -32.0f, 22.87f);
        pathBuilder.lineTo(200.0f, 171.5f);
        pathBuilder.curveToRelative(12.91f, -3.13f, 23.84f, -7.79f, 32.0f, -13.57f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coins = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
