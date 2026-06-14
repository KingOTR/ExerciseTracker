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

/* compiled from: Coffeebean.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CoffeeBean", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCoffeeBean", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coffeeBean", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoffeebeanKt {
    private static ImageVector _coffeeBean;

    public static final ImageVector getCoffeeBean(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(209.0f, 47.0f);
        pathBuilder.curveToRelative(-32.36f, -32.35f, -95.0f, -22.33f, -139.7f, 22.34f);
        pathBuilder.reflectiveCurveTo(14.63f, 176.66f, 47.0f, 209.0f);
        pathBuilder.curveToRelative(12.82f, 12.81f, 30.38f, 19.0f, 49.71f, 19.0f);
        pathBuilder.curveToRelative(29.46f, 0.0f, 63.0f, -14.34f, 90.0f, -41.32f);
        pathBuilder.curveTo(231.35f, 142.0f, 241.37f, 79.34f, 209.0f, 47.0f);
        pathBuilder.close();
        pathBuilder.moveTo(75.0f, 75.0f);
        pathBuilder.curveToRelative(25.47f, -25.46f, 57.0f, -39.09f, 84.26f, -39.09f);
        pathBuilder.curveToRelative(14.51f, 0.0f, 27.83f, 3.87f, 38.43f, 11.84f);
        pathBuilder.curveToRelative(-25.76f, 7.05f, -63.0f, 26.4f, -73.6f, 79.49f);
        pathBuilder.curveToRelative(-10.5f, 52.52f, -49.25f, 69.26f, -72.91f, 74.58f);
        pathBuilder.curveTo(23.77f, 172.12f, 34.16f, 115.81f, 75.0f, 75.0f);
        pathBuilder.close();
        pathBuilder.moveTo(181.0f, 181.0f);
        pathBuilder.curveToRelative(-39.0f, 39.0f, -92.17f, 50.23f, -122.71f, 27.25f);
        pathBuilder.curveToRelative(25.75f, -7.0f, 63.0f, -26.39f, 73.62f, -79.48f);
        pathBuilder.curveToRelative(10.5f, -52.53f, 49.25f, -69.26f, 72.91f, -74.59f);
        pathBuilder.curveTo(232.23f, 83.88f, 221.84f, 140.19f, 181.0f, 181.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coffeeBean = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
