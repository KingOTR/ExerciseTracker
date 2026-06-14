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

/* compiled from: Coinvertical.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CoinVertical", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCoinVertical", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coinVertical", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinverticalKt {
    private static ImageVector _coinVertical;

    public static final ImageVector getCoinVertical(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(195.05f, 58.1f);
        pathBuilder.curveTo(183.73f, 38.69f, 168.44f, 28.0f, 152.0f, 28.0f);
        pathBuilder.lineTo(104.0f, 28.0f);
        pathBuilder.curveTo(87.56f, 28.0f, 72.27f, 38.69f, 61.0f, 58.1f);
        pathBuilder.curveTo(50.0f, 76.84f, 44.0f, 101.66f, 44.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, 51.16f, 17.0f, 69.9f);
        pathBuilder.curveTo(72.27f, 217.31f, 87.56f, 228.0f, 104.0f, 228.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.curveToRelative(16.44f, 0.0f, 31.73f, -10.69f, 43.05f, -30.1f);
        pathBuilder.curveTo(206.0f, 179.16f, 212.0f, 154.34f, 212.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(206.0f, 76.84f, 195.05f, 58.1f);
        pathBuilder.close();
        pathBuilder.moveTo(191.27f, 188.0f);
        pathBuilder.lineTo(152.1f, 188.0f);
        pathBuilder.curveToRelative(7.24f, -16.14f, 11.37f, -35.53f, 11.84f, -56.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.curveTo(203.44f, 152.77f, 199.0f, 172.28f, 191.27f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(163.94f, 124.0f);
        pathBuilder.curveToRelative(-0.47f, -20.47f, -4.6f, -39.86f, -11.84f, -56.0f);
        pathBuilder.horizontalLineToRelative(39.17f);
        pathBuilder.curveToRelative(7.74f, 15.72f, 12.17f, 35.23f, 12.67f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 36.0f);
        pathBuilder.curveToRelative(12.89f, 0.0f, 25.19f, 8.51f, 34.84f, 24.0f);
        pathBuilder.lineTo(148.11f, 60.0f);
        pathBuilder.curveToRelative(-0.35f, -0.63f, -0.7f, -1.28f, -1.06f, -1.9f);
        pathBuilder.curveToRelative(-5.58f, -9.56f, -12.12f, -17.0f, -19.29f, -22.1f);
        pathBuilder.close();
        pathBuilder.moveTo(67.86f, 193.87f);
        pathBuilder.curveTo(57.63f, 176.34f, 52.0f, 153.0f, 52.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.63f, -48.34f, 15.86f, -65.87f);
        pathBuilder.curveTo(77.69f, 45.28f, 90.52f, 36.0f, 104.0f, 36.0f);
        pathBuilder.reflectiveCurveToRelative(26.31f, 9.28f, 36.14f, 26.13f);
        pathBuilder.curveTo(150.37f, 79.66f, 156.0f, 103.05f, 156.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(-5.63f, 48.34f, -15.86f, 65.87f);
        pathBuilder.curveTo(130.31f, 210.72f, 117.48f, 220.0f, 104.0f, 220.0f);
        pathBuilder.reflectiveCurveTo(77.69f, 210.72f, 67.86f, 193.87f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 220.0f);
        pathBuilder.lineTo(127.76f, 220.0f);
        pathBuilder.curveToRelative(7.17f, -5.09f, 13.71f, -12.54f, 19.29f, -22.1f);
        pathBuilder.curveToRelative(0.36f, -0.62f, 0.71f, -1.27f, 1.06f, -1.9f);
        pathBuilder.horizontalLineToRelative(38.73f);
        pathBuilder.curveTo(177.19f, 211.49f, 164.89f, 220.0f, 152.0f, 220.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coinVertical = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
