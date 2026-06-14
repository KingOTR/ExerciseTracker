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

/* compiled from: Shoppingcart.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShoppingCart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getShoppingCart", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shoppingCart", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShoppingcartKt {
    private static ImageVector _shoppingCart;

    public static final ImageVector getShoppingCart(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _shoppingCart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShoppingCart", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.61f, 60.16f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 58.0f);
        pathBuilder.lineTo(61.0f, 58.0f);
        pathBuilder.lineTo(54.63f, 22.93f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 48.73f, 18.0f);
        pathBuilder.lineTo(24.0f, 18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(43.72f, 30.0f);
        pathBuilder.lineTo(69.53f, 171.94f);
        pathBuilder.arcToRelative(21.93f, 21.93f, 0.0f, false, false, 6.24f, 11.77f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, true, false, 113.89f, 190.0f);
        pathBuilder.horizontalLineToRelative(52.22f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, true, false, 188.0f, 178.0f);
        pathBuilder.lineTo(91.17f, 178.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -9.84f, -8.21f);
        pathBuilder.lineTo(77.73f, 150.0f);
        pathBuilder.lineTo(196.1f, 150.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 21.65f, -18.06f);
        pathBuilder.lineTo(229.9f, 65.07f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 228.61f, 60.16f);
        pathBuilder.close();
        pathBuilder.moveTo(106.0f, 204.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 106.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 204.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 202.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(205.94f, 129.79f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 196.1f, 138.0f);
        pathBuilder.lineTo(75.55f, 138.0f);
        pathBuilder.lineTo(63.19f, 70.0f);
        pathBuilder.lineTo(216.81f, 70.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shoppingCart = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
