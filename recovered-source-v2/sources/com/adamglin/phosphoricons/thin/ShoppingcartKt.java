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

/* compiled from: Shoppingcart.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShoppingCart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getShoppingCart", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shoppingCart", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShoppingcartKt {
    private static ImageVector _shoppingCart;

    public static final ImageVector getShoppingCart(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(227.07f, 61.44f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 60.0f);
        pathBuilder.lineTo(59.34f, 60.0f);
        pathBuilder.lineTo(52.66f, 23.28f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 48.73f, 20.0f);
        pathBuilder.lineTo(24.0f, 20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(45.39f, 28.0f);
        pathBuilder.lineToRelative(6.69f, 36.8f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(71.49f, 171.58f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 79.0f, 183.85f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 109.87f, 188.0f);
        pathBuilder.horizontalLineToRelative(60.26f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 188.0f, 180.0f);
        pathBuilder.lineTo(91.17f, 180.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.8f, -9.85f);
        pathBuilder.lineToRelative(-4.0f, -22.15f);
        pathBuilder.lineTo(196.1f, 148.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.68f, -16.42f);
        pathBuilder.lineToRelative(12.16f, -66.86f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 227.07f, 61.44f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 204.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 108.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 204.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 204.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(207.91f, 130.15f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 196.1f, 140.0f);
        pathBuilder.lineTo(73.88f, 140.0f);
        pathBuilder.lineTo(60.79f, 68.0f);
        pathBuilder.lineTo(219.21f, 68.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shoppingCart = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
