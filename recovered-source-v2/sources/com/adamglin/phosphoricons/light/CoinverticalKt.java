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

/* compiled from: Coinvertical.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CoinVertical", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCoinVertical", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coinVertical", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinverticalKt {
    private static ImageVector _coinVertical;

    public static final ImageVector getCoinVertical(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(196.78f, 57.09f);
        pathBuilder.curveTo(185.08f, 37.0f, 169.18f, 26.0f, 152.0f, 26.0f);
        pathBuilder.lineTo(104.0f, 26.0f);
        pathBuilder.curveTo(86.82f, 26.0f, 70.92f, 37.0f, 59.22f, 57.09f);
        pathBuilder.curveTo(48.12f, 76.13f, 42.0f, 101.31f, 42.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(6.12f, 51.87f, 17.22f, 70.91f);
        pathBuilder.curveTo(70.92f, 219.0f, 86.82f, 230.0f, 104.0f, 230.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.curveToRelative(17.18f, 0.0f, 33.08f, -11.0f, 44.78f, -31.09f);
        pathBuilder.curveToRelative(11.1f, -19.0f, 17.22f, -44.22f, 17.22f, -70.91f);
        pathBuilder.reflectiveCurveTo(207.88f, 76.13f, 196.78f, 57.09f);
        pathBuilder.close();
        pathBuilder.moveTo(201.88f, 122.0f);
        pathBuilder.horizontalLineToRelative(-36.0f);
        pathBuilder.curveToRelative(-0.65f, -18.84f, -4.37f, -36.73f, -10.74f, -52.0f);
        pathBuilder.lineTo(190.0f, 70.0f);
        pathBuilder.curveTo(197.06f, 84.74f, 201.16f, 102.77f, 201.88f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 38.0f);
        pathBuilder.curveToRelative(11.31f, 0.0f, 22.22f, 7.06f, 31.14f, 20.0f);
        pathBuilder.lineTo(149.28f, 58.0f);
        pathBuilder.lineToRelative(-0.5f, -0.91f);
        pathBuilder.arcTo(76.8f, 76.8f, 0.0f, false, false, 133.49f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(69.58f, 192.86f);
        pathBuilder.curveTo(59.54f, 175.63f, 54.0f, 152.6f, 54.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.54f, -47.63f, 15.58f, -64.86f);
        pathBuilder.curveTo(79.0f, 46.93f, 91.26f, 38.0f, 104.0f, 38.0f);
        pathBuilder.reflectiveCurveToRelative(25.0f, 8.93f, 34.42f, 25.14f);
        pathBuilder.curveTo(148.46f, 80.37f, 154.0f, 103.4f, 154.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(-5.54f, 47.63f, -15.58f, 64.86f);
        pathBuilder.curveTo(129.0f, 209.07f, 116.74f, 218.0f, 104.0f, 218.0f);
        pathBuilder.reflectiveCurveTo(79.0f, 209.07f, 69.58f, 192.86f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 218.0f);
        pathBuilder.lineTo(133.49f, 218.0f);
        pathBuilder.arcToRelative(76.8f, 76.8f, 0.0f, false, false, 15.29f, -19.09f);
        pathBuilder.lineToRelative(0.5f, -0.91f);
        pathBuilder.horizontalLineToRelative(33.86f);
        pathBuilder.curveTo(174.22f, 210.94f, 163.31f, 218.0f, 152.0f, 218.0f);
        pathBuilder.close();
        pathBuilder.moveTo(190.0f, 186.0f);
        pathBuilder.lineTo(155.14f, 186.0f);
        pathBuilder.curveToRelative(6.37f, -15.27f, 10.09f, -33.16f, 10.74f, -52.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.curveTo(201.16f, 153.23f, 197.06f, 171.26f, 190.0f, 186.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coinVertical = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
