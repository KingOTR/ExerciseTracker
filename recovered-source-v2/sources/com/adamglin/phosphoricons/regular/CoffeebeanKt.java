package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Coffeebean.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CoffeeBean", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCoffeeBean", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coffeeBean", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoffeebeanKt {
    private static ImageVector _coffeeBean;

    public static final ImageVector getCoffeeBean(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(211.75f, 44.25f);
        pathBuilder.curveTo(195.0f, 27.47f, 170.37f, 20.79f, 142.46f, 25.44f);
        pathBuilder.curveToRelative(-26.91f, 4.49f, -53.87f, 19.09f, -75.9f, 41.12f);
        pathBuilder.reflectiveCurveToRelative(-36.63f, 49.0f, -41.12f, 75.9f);
        pathBuilder.curveToRelative(-4.65f, 27.91f, 2.0f, 52.51f, 18.81f, 69.29f);
        pathBuilder.curveTo(57.54f, 225.05f, 75.75f, 232.0f, 96.62f, 232.0f);
        pathBuilder.arcToRelative(103.66f, 103.66f, 0.0f, false, false, 16.92f, -1.44f);
        pathBuilder.curveToRelative(26.91f, -4.49f, 53.87f, -19.09f, 75.9f, -41.12f);
        pathBuilder.reflectiveCurveToRelative(36.63f, -49.0f, 41.12f, -75.9f);
        pathBuilder.curveTo(235.21f, 85.63f, 228.53f, 61.0f, 211.75f, 44.25f);
        pathBuilder.close();
        pathBuilder.moveTo(77.87f, 77.87f);
        pathBuilder.curveTo(102.56f, 53.19f, 133.0f, 39.93f, 159.15f, 39.93f);
        pathBuilder.arcToRelative(62.26f, 62.26f, 0.0f, false, true, 29.0f, 6.67f);
        pathBuilder.arcTo(108.48f, 108.48f, 0.0f, false, false, 157.1f, 63.54f);
        pathBuilder.curveToRelative(-19.2f, 15.16f, -31.63f, 36.32f, -36.94f, 62.89f);
        pathBuilder.curveToRelative(-9.72f, 48.58f, -44.7f, 65.18f, -67.48f, 70.84f);
        pathBuilder.curveTo(28.71f, 168.76f, 39.4f, 116.35f, 77.87f, 77.87f);
        pathBuilder.close();
        pathBuilder.moveTo(178.13f, 178.13f);
        pathBuilder.curveToRelative(-34.69f, 34.68f, -80.71f, 46.78f, -110.32f, 31.27f);
        pathBuilder.arcTo(108.72f, 108.72f, 0.0f, false, false, 98.9f, 192.46f);
        pathBuilder.curveToRelative(19.2f, -15.16f, 31.63f, -36.32f, 36.94f, -62.89f);
        pathBuilder.curveToRelative(9.72f, -48.58f, 44.7f, -65.18f, 67.48f, -70.84f);
        pathBuilder.curveTo(227.29f, 87.24f, 216.6f, 139.65f, 178.13f, 178.13f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coffeeBean = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
