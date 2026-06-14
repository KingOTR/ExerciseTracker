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

/* compiled from: Basket.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Basket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBasket", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_basket", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasketKt {
    private static ImageVector _basket;

    public static final ImageVector getBasket(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _basket;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Basket", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(132.0f, 120.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(124.0f, 120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(181.2f, 116.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.38f, 3.58f);
        pathBuilder.lineToRelative(-5.6f, 56.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 174.8f, 180.0f);
        pathBuilder.lineToRelative(0.41f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -3.6f);
        pathBuilder.lineToRelative(5.6f, -56.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 181.2f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(74.8f, 116.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 4.38f);
        pathBuilder.lineToRelative(5.6f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 3.6f);
        pathBuilder.lineToRelative(0.41f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, -4.38f);
        pathBuilder.lineToRelative(-5.6f, -56.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 74.8f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 88.53f);
        pathBuilder.lineTo(220.89f, 201.59f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 209.0f, 212.0f);
        pathBuilder.lineTo(47.0f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.89f, -10.41f);
        pathBuilder.lineTo(20.0f, 88.53f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 21.0f, 85.37f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 24.0f, 84.0f);
        pathBuilder.lineTo(70.18f, 84.0f);
        pathBuilder.lineTo(125.0f, 21.37f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.0f, 0.0f);
        pathBuilder.lineTo(185.82f, 84.0f);
        pathBuilder.lineTo(232.0f, 84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, 1.37f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 88.53f);
        pathBuilder.close();
        pathBuilder.moveTo(80.82f, 84.0f);
        pathBuilder.horizontalLineToRelative(94.36f);
        pathBuilder.lineTo(128.0f, 30.07f);
        pathBuilder.close();
        pathBuilder.moveTo(227.43f, 92.0f);
        pathBuilder.lineTo(28.57f, 92.0f);
        pathBuilder.lineTo(43.0f, 200.53f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 47.0f, 204.0f);
        pathBuilder.lineTo(209.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -3.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _basket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
