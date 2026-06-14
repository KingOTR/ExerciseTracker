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

/* compiled from: Shippingcontainer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShippingContainer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getShippingContainer", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shippingContainer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShippingcontainerKt {
    private static ImageVector _shippingContainer;

    public static final ImageVector getShippingContainer(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _shippingContainer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShippingContainer", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(237.5f, 66.8f);
        pathBuilder.lineTo(131.3f, 36.46f);
        pathBuilder.arcToRelative(12.07f, 12.07f, 0.0f, false, false, -5.0f, -0.34f);
        pathBuilder.lineToRelative(-105.13f, 15.0f);
        pathBuilder.arcTo(20.1f, 20.1f, 0.0f, false, false, 4.0f, 70.94f);
        pathBuilder.verticalLineTo(185.06f);
        pathBuilder.arcToRelative(20.1f, 20.1f, 0.0f, false, false, 17.17f, 19.8f);
        pathBuilder.lineToRelative(105.13f, 15.0f);
        pathBuilder.arcToRelative(12.15f, 12.15f, 0.0f, false, false, 1.7f, 0.12f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.3f, -0.46f);
        pathBuilder.lineTo(237.5f, 189.2f);
        pathBuilder.arcTo(20.09f, 20.09f, 0.0f, false, false, 252.0f, 170.0f);
        pathBuilder.verticalLineTo(86.0f);
        pathBuilder.arcTo(20.08f, 20.08f, 0.0f, false, false, 237.5f, 66.8f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 116.0f);
        pathBuilder.horizontalLineTo(84.0f);
        pathBuilder.verticalLineTo(66.41f);
        pathBuilder.lineToRelative(32.0f, -4.57f);
        pathBuilder.verticalLineTo(194.16f);
        pathBuilder.lineToRelative(-32.0f, -4.57f);
        pathBuilder.verticalLineTo(140.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 74.41f);
        pathBuilder.lineToRelative(32.0f, -4.57f);
        pathBuilder.verticalLineTo(116.0f);
        pathBuilder.horizontalLineTo(52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(46.16f);
        pathBuilder.lineToRelative(-32.0f, -4.57f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 167.0f);
        pathBuilder.lineToRelative(-88.0f, 25.14f);
        pathBuilder.verticalLineTo(63.91f);
        pathBuilder.lineToRelative(88.0f, 25.14f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shippingContainer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
