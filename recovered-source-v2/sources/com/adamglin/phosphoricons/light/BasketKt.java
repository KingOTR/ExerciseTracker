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

/* compiled from: Basket.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Basket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBasket", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_basket", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasketKt {
    private static ImageVector _basket;

    public static final ImageVector getBasket(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(134.0f, 120.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 120.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(174.83f, 119.4f);
        pathBuilder.lineTo(169.23f, 175.4f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 174.6f, 182.0f);
        pathBuilder.lineToRelative(0.61f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -5.4f);
        pathBuilder.lineToRelative(5.6f, -56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.94f, -1.2f);
        pathBuilder.close();
        pathBuilder.moveTo(81.17f, 119.4f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.94f, 1.2f);
        pathBuilder.lineToRelative(5.6f, 56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 5.4f);
        pathBuilder.lineToRelative(0.61f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.37f, -6.57f);
        pathBuilder.close();
        pathBuilder.moveTo(238.0f, 88.79f);
        pathBuilder.lineTo(222.87f, 201.85f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 209.0f, 214.0f);
        pathBuilder.lineTo(47.0f, 214.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -13.87f, -12.15f);
        pathBuilder.lineTo(18.05f, 88.79f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 24.0f, 82.0f);
        pathBuilder.lineTo(69.28f, 82.0f);
        pathBuilder.lineToRelative(54.2f, -61.95f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.0f, 0.0f);
        pathBuilder.lineToRelative(54.2f, 62.0f);
        pathBuilder.lineTo(232.0f, 82.05f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 238.0f, 88.79f);
        pathBuilder.close();
        pathBuilder.moveTo(85.22f, 82.0f);
        pathBuilder.horizontalLineToRelative(85.56f);
        pathBuilder.lineTo(128.0f, 33.11f);
        pathBuilder.close();
        pathBuilder.moveTo(225.15f, 94.0f);
        pathBuilder.lineTo(30.85f, 94.0f);
        pathBuilder.lineTo(45.0f, 200.26f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 47.0f, 202.0f);
        pathBuilder.lineTo(209.0f, 202.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -1.74f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _basket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
