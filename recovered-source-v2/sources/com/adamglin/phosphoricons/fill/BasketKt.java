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

/* compiled from: Basket.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Basket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBasket", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_basket", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasketKt {
    private static ImageVector _basket;

    public static final ImageVector getBasket(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(238.0f, 82.73f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 80.0f);
        pathBuilder.lineTo(187.63f, 80.0f);
        pathBuilder.lineTo(134.0f, 18.73f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(68.37f, 80.0f);
        pathBuilder.lineTo(24.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.93f, 9.06f);
        pathBuilder.lineTo(31.14f, 202.12f);
        pathBuilder.arcTo(16.06f, 16.06f, 0.0f, false, false, 47.0f, 216.0f);
        pathBuilder.lineTo(209.0f, 216.0f);
        pathBuilder.arcToRelative(16.06f, 16.06f, 0.0f, false, false, 15.86f, -13.88f);
        pathBuilder.lineTo(239.93f, 89.06f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 238.0f, 82.73f);
        pathBuilder.close();
        pathBuilder.moveTo(81.6f, 184.0f);
        pathBuilder.arcToRelative(7.32f, 7.32f, 0.0f, false, true, -0.81f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -7.2f);
        pathBuilder.lineToRelative(-5.6f, -56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.92f, -1.6f);
        pathBuilder.lineToRelative(5.6f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 81.6f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(89.63f, 80.0f);
        pathBuilder.lineTo(128.0f, 36.15f);
        pathBuilder.lineTo(166.37f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.76f, 120.8f);
        pathBuilder.lineTo(183.16f, 176.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.95f, 7.2f);
        pathBuilder.arcToRelative(7.32f, 7.32f, 0.0f, false, true, -0.81f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, -8.76f);
        pathBuilder.lineToRelative(5.6f, -56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.92f, 1.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _basket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
