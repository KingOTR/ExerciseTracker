package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Basket.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Basket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBasket", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_basket", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasketKt {
    private static ImageVector _basket;

    public static final ImageVector getBasket(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(140.0f, 128.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.06f, 126.81f);
        pathBuilder.lineTo(164.06f, 166.81f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.75f, 13.13f);
        pathBuilder.curveToRelative(0.4f, 0.0f, 0.81f, 0.06f, 1.2f, 0.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.93f, -10.81f);
        pathBuilder.lineToRelative(4.0f, -40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.88f, -2.38f);
        pathBuilder.close();
        pathBuilder.moveTo(87.94f, 126.81f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.88f, 2.38f);
        pathBuilder.lineToRelative(4.0f, 40.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 180.0f);
        pathBuilder.curveToRelative(0.39f, 0.0f, 0.8f, 0.0f, 1.2f, -0.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.75f, -13.13f);
        pathBuilder.close();
        pathBuilder.moveTo(243.94f, 89.59f);
        pathBuilder.lineTo(228.87f, 202.59f);
        pathBuilder.arcTo(20.06f, 20.06f, 0.0f, false, true, 209.0f, 220.0f);
        pathBuilder.lineTo(47.0f, 220.0f);
        pathBuilder.arcToRelative(20.06f, 20.06f, 0.0f, false, true, -19.82f, -17.36f);
        pathBuilder.lineToRelative(-15.07f, -113.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 24.0f, 76.0f);
        pathBuilder.lineTo(66.55f, 76.0f);
        pathBuilder.lineTo(119.0f, 16.1f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.06f, 0.0f);
        pathBuilder.lineTo(189.45f, 76.0f);
        pathBuilder.lineTo(232.0f, 76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.89f, 13.59f);
        pathBuilder.close();
        pathBuilder.moveTo(98.45f, 76.0f);
        pathBuilder.horizontalLineToRelative(59.1f);
        pathBuilder.lineTo(128.0f, 42.22f);
        pathBuilder.close();
        pathBuilder.moveTo(218.29f, 100.0f);
        pathBuilder.lineTo(37.71f, 100.0f);
        pathBuilder.lineToRelative(12.8f, 96.0f);
        pathBuilder.horizontalLineToRelative(155.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _basket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
