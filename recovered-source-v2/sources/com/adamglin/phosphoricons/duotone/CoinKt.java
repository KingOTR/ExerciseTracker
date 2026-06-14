package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Coin.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Coin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCoin", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coin", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinKt {
    private static ImageVector _coin;

    public static final ImageVector getCoin(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 24.0f, -40.0f, 48.0f, -104.0f, 48.0f);
        pathBuilder.reflectiveCurveTo(24.0f, 128.0f, 24.0f, 104.0f);
        pathBuilder.reflectiveCurveTo(64.0f, 56.0f, 128.0f, 56.0f);
        pathBuilder.reflectiveCurveTo(232.0f, 80.0f, 232.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(207.58f, 63.84f);
        pathBuilder2.curveTo(186.85f, 53.48f, 159.33f, 48.0f, 128.0f, 48.0f);
        pathBuilder2.reflectiveCurveTo(69.15f, 53.48f, 48.42f, 63.84f);
        pathBuilder2.reflectiveCurveTo(16.0f, 88.78f, 16.0f, 104.0f);
        pathBuilder2.verticalLineToRelative(48.0f);
        pathBuilder2.curveToRelative(0.0f, 15.22f, 11.82f, 29.85f, 32.42f, 40.16f);
        pathBuilder2.reflectiveCurveTo(96.67f, 208.0f, 128.0f, 208.0f);
        pathBuilder2.reflectiveCurveToRelative(58.85f, -5.48f, 79.58f, -15.84f);
        pathBuilder2.reflectiveCurveTo(240.0f, 167.22f, 240.0f, 152.0f);
        pathBuilder2.lineTo(240.0f, 104.0f);
        pathBuilder2.curveTo(240.0f, 88.78f, 228.18f, 74.15f, 207.58f, 63.84f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 64.0f);
        pathBuilder2.curveToRelative(62.64f, 0.0f, 96.0f, 23.23f, 96.0f, 40.0f);
        pathBuilder2.reflectiveCurveToRelative(-33.36f, 40.0f, -96.0f, 40.0f);
        pathBuilder2.reflectiveCurveToRelative(-96.0f, -23.23f, -96.0f, -40.0f);
        pathBuilder2.reflectiveCurveTo(65.36f, 64.0f, 128.0f, 64.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 159.86f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.curveToRelative(-19.0f, -0.62f, -35.0f, -3.42f, -48.0f, -7.49f);
        pathBuilder2.lineTo(72.0f, 153.05f);
        pathBuilder2.arcTo(203.43f, 203.43f, 0.0f, false, false, 120.0f, 159.86f);
        pathBuilder2.close();
        pathBuilder2.moveTo(136.0f, 159.86f);
        pathBuilder2.arcToRelative(203.43f, 203.43f, 0.0f, false, false, 48.0f, -6.81f);
        pathBuilder2.verticalLineToRelative(31.31f);
        pathBuilder2.curveToRelative(-13.0f, 4.07f, -29.0f, 6.87f, -48.0f, 7.49f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.0f, 152.0f);
        pathBuilder2.lineTo(32.0f, 133.53f);
        pathBuilder2.arcToRelative(82.88f, 82.88f, 0.0f, false, false, 16.42f, 10.63f);
        pathBuilder2.curveToRelative(2.43f, 1.21f, 5.0f, 2.35f, 7.58f, 3.43f);
        pathBuilder2.lineTo(56.0f, 178.0f);
        pathBuilder2.curveTo(40.17f, 170.16f, 32.0f, 160.29f, 32.0f, 152.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 178.0f);
        pathBuilder2.lineTo(200.0f, 147.59f);
        pathBuilder2.curveToRelative(2.61f, -1.08f, 5.15f, -2.22f, 7.58f, -3.43f);
        pathBuilder2.arcTo(82.88f, 82.88f, 0.0f, false, false, 224.0f, 133.53f);
        pathBuilder2.lineTo(224.0f, 152.0f);
        pathBuilder2.curveTo(224.0f, 160.29f, 215.83f, 170.16f, 200.0f, 178.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
