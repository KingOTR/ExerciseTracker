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

/* compiled from: Coffeebean.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CoffeeBean", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCoffeeBean", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coffeeBean", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoffeebeanKt {
    private static ImageVector _coffeeBean;

    public static final ImageVector getCoffeeBean(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _coffeeBean;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CoffeeBean", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(210.34f, 45.66f);
        pathBuilder.curveTo(194.0f, 29.35f, 170.0f, 22.87f, 142.79f, 27.42f);
        pathBuilder.curveTo(116.28f, 31.83f, 89.71f, 46.24f, 68.0f, 68.0f);
        pathBuilder.reflectiveCurveToRelative(-36.14f, 48.3f, -40.56f, 74.81f);
        pathBuilder.curveTo(22.87f, 170.0f, 29.35f, 194.0f, 45.66f, 210.34f);
        pathBuilder.curveTo(58.57f, 223.25f, 76.29f, 230.0f, 96.64f, 230.0f);
        pathBuilder.arcToRelative(101.59f, 101.59f, 0.0f, false, false, 16.57f, -1.41f);
        pathBuilder.curveToRelative(26.51f, -4.42f, 53.08f, -18.83f, 74.82f, -40.56f);
        pathBuilder.reflectiveCurveToRelative(36.14f, -48.31f, 40.56f, -74.82f);
        pathBuilder.curveTo(233.13f, 86.0f, 226.65f, 62.0f, 210.34f, 45.66f);
        pathBuilder.close();
        pathBuilder.moveTo(76.46f, 76.46f);
        pathBuilder.curveTo(101.52f, 51.4f, 132.46f, 38.0f, 159.18f, 38.0f);
        pathBuilder.curveToRelative(12.58f, 0.0f, 24.22f, 3.0f, 33.87f, 9.12f);
        pathBuilder.arcToRelative(108.0f, 108.0f, 0.0f, false, false, -34.71f, 18.0f);
        pathBuilder.curveToRelative(-18.82f, 14.86f, -31.0f, 35.62f, -36.22f, 61.71f);
        pathBuilder.curveTo(112.0f, 177.35f, 75.18f, 194.0f, 52.0f, 199.5f);
        pathBuilder.curveTo(26.3f, 170.42f, 36.83f, 116.09f, 76.46f, 76.46f);
        pathBuilder.close();
        pathBuilder.moveTo(179.54f, 179.54f);
        pathBuilder.curveTo(142.68f, 216.4f, 93.1f, 228.1f, 63.0f, 208.91f);
        pathBuilder.arcToRelative(108.0f, 108.0f, 0.0f, false, false, 34.71f, -18.0f);
        pathBuilder.curveToRelative(18.82f, -14.86f, 31.0f, -35.62f, 36.22f, -61.71f);
        pathBuilder.curveTo(144.0f, 78.65f, 180.82f, 62.0f, 204.05f, 56.5f);
        pathBuilder.curveTo(229.7f, 85.59f, 219.17f, 139.91f, 179.54f, 179.54f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coffeeBean = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
