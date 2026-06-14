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

/* compiled from: Shoppingcartsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShoppingCartSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getShoppingCartSimple", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shoppingCartSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShoppingcartsimpleKt {
    private static ImageVector _shoppingCartSimple;

    public static final ImageVector getShoppingCartSimple(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _shoppingCartSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShoppingCartSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.78f, 68.37f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 66.0f);
        pathBuilder.lineTo(55.67f, 66.0f);
        pathBuilder.lineTo(45.78f, 30.39f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 26.0f);
        pathBuilder.lineTo(16.0f, 26.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(35.44f, 38.0f);
        pathBuilder.lineTo(71.0f, 165.89f);
        pathBuilder.arcTo(22.08f, 22.08f, 0.0f, false, false, 92.16f, 182.0f);
        pathBuilder.lineTo(191.0f, 182.0f);
        pathBuilder.arcToRelative(22.08f, 22.08f, 0.0f, false, false, 21.2f, -16.11f);
        pathBuilder.lineToRelative(25.63f, -92.28f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 236.78f, 68.37f);
        pathBuilder.close();
        pathBuilder.moveTo(200.58f, 162.68f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 191.0f, 170.0f);
        pathBuilder.lineTo(92.16f, 170.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -9.63f, -7.32f);
        pathBuilder.lineTo(59.0f, 78.0f);
        pathBuilder.lineTo(224.11f, 78.0f);
        pathBuilder.close();
        pathBuilder.moveTo(102.0f, 216.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 102.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(206.0f, 216.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 206.0f, 216.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shoppingCartSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
