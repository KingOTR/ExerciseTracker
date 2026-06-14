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

/* compiled from: Coinvertical.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CoinVertical", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCoinVertical", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coinVertical", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinverticalKt {
    private static ImageVector _coinVertical;

    public static final ImageVector getCoinVertical(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _coinVertical;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CoinVertical", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(198.51f, 56.09f);
        pathBuilder.curveTo(186.44f, 35.4f, 169.92f, 24.0f, 152.0f, 24.0f);
        pathBuilder.lineTo(104.0f, 24.0f);
        pathBuilder.curveTo(86.08f, 24.0f, 69.56f, 35.4f, 57.49f, 56.09f);
        pathBuilder.curveTo(46.21f, 75.42f, 40.0f, 101.0f, 40.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(6.21f, 52.58f, 17.49f, 71.91f);
        pathBuilder.curveTo(69.56f, 220.6f, 86.08f, 232.0f, 104.0f, 232.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.curveToRelative(17.92f, 0.0f, 34.44f, -11.4f, 46.51f, -32.09f);
        pathBuilder.curveTo(209.79f, 180.58f, 216.0f, 155.0f, 216.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(209.79f, 75.42f, 198.51f, 56.09f);
        pathBuilder.close();
        pathBuilder.moveTo(199.79f, 120.0f);
        pathBuilder.horizontalLineToRelative(-32.0f);
        pathBuilder.arcToRelative(152.78f, 152.78f, 0.0f, false, false, -9.68f, -48.0f);
        pathBuilder.lineTo(188.7f, 72.0f);
        pathBuilder.curveTo(194.82f, 85.38f, 198.86f, 102.0f, 199.79f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(179.19f, 56.0f);
        pathBuilder.lineTo(150.46f, 56.0f);
        pathBuilder.arcToRelative(83.13f, 83.13f, 0.0f, false, false, -12.0f, -16.0f);
        pathBuilder.lineTo(152.0f, 40.0f);
        pathBuilder.curveTo(162.0f, 40.0f, 171.4f, 46.0f, 179.19f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 216.0f);
        pathBuilder.lineTo(138.49f, 216.0f);
        pathBuilder.arcToRelative(83.13f, 83.13f, 0.0f, false, false, 12.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(28.73f);
        pathBuilder.curveTo(171.4f, 210.0f, 162.0f, 216.0f, 152.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.7f, 184.0f);
        pathBuilder.lineTo(158.12f, 184.0f);
        pathBuilder.arcToRelative(152.78f, 152.78f, 0.0f, false, false, 9.68f, -48.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.curveTo(198.86f, 154.0f, 194.82f, 170.62f, 188.7f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coinVertical = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
