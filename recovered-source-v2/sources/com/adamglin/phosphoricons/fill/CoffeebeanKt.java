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

/* compiled from: Coffeebean.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CoffeeBean", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCoffeeBean", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coffeeBean", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoffeebeanKt {
    private static ImageVector _coffeeBean;

    public static final ImageVector getCoffeeBean(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(71.22f, 190.47f);
        pathBuilder.arcToRelative(108.88f, 108.88f, 0.0f, false, true, -33.84f, 9.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.89f, -2.0f);
        pathBuilder.curveToRelative(-8.67f, -15.28f, -11.52f, -34.29f, -8.0f, -55.15f);
        pathBuilder.curveToRelative(4.49f, -26.92f, 19.09f, -53.87f, 41.12f, -75.9f);
        pathBuilder.reflectiveCurveToRelative(49.0f, -36.63f, 75.9f, -41.12f);
        pathBuilder.curveToRelative(22.79f, -3.79f, 43.37f, 0.0f, 59.29f, 10.6f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.25f, 7.23f);
        pathBuilder.arcToRelative(121.0f, 121.0f, 0.0f, false, false, -21.82f, 7.46f);
        pathBuilder.curveToRelative(-21.77f, 9.9f, -49.6f, 31.06f, -58.52f, 75.7f);
        pathBuilder.curveTo(114.1f, 156.73f, 97.63f, 178.27f, 71.22f, 190.47f);
        pathBuilder.close();
        pathBuilder.moveTo(222.51f, 58.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.88f, -2.0f);
        pathBuilder.arcToRelative(108.5f, 108.5f, 0.0f, false, false, -33.85f, 9.16f);
        pathBuilder.curveToRelative(-26.41f, 12.2f, -42.88f, 33.74f, -48.94f, 64.0f);
        pathBuilder.curveToRelative(-8.93f, 44.64f, -36.75f, 65.8f, -58.52f, 75.7f);
        pathBuilder.arcToRelative(121.0f, 121.0f, 0.0f, false, true, -21.82f, 7.46f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 54.27f, 220.0f);
        pathBuilder.curveToRelative(11.87f, 7.92f, 26.32f, 12.0f, 42.35f, 12.0f);
        pathBuilder.arcToRelative(103.66f, 103.66f, 0.0f, false, false, 16.92f, -1.44f);
        pathBuilder.curveToRelative(26.91f, -4.49f, 53.87f, -19.09f, 75.9f, -41.12f);
        pathBuilder.reflectiveCurveToRelative(36.63f, -49.0f, 41.12f, -75.9f);
        pathBuilder.curveTo(234.0f, 92.68f, 231.18f, 73.66f, 222.51f, 58.38f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coffeeBean = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
