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

/* compiled from: Shippingcontainer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShippingContainer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getShippingContainer", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shippingContainer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShippingcontainerKt {
    private static ImageVector _shippingContainer;

    public static final ImageVector getShippingContainer(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(235.85f, 72.57f);
        pathBuilder.lineTo(129.65f, 42.23f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.5f, -0.17f);
        pathBuilder.lineTo(22.0f, 57.08f);
        pathBuilder.arcTo(14.07f, 14.07f, 0.0f, false, false, 10.0f, 70.94f);
        pathBuilder.verticalLineTo(185.06f);
        pathBuilder.arcToRelative(14.07f, 14.07f, 0.0f, false, false, 12.0f, 13.86f);
        pathBuilder.lineToRelative(105.13f, 15.0f);
        pathBuilder.arcToRelative(6.07f, 6.07f, 0.0f, false, false, 0.85f, 0.06f);
        pathBuilder.arcToRelative(6.14f, 6.14f, 0.0f, false, false, 1.65f, -0.23f);
        pathBuilder.lineToRelative(106.2f, -30.34f);
        pathBuilder.arcTo(14.06f, 14.06f, 0.0f, false, false, 246.0f, 170.0f);
        pathBuilder.verticalLineTo(86.0f);
        pathBuilder.arcTo(14.06f, 14.06f, 0.0f, false, false, 235.85f, 72.57f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 122.0f);
        pathBuilder.horizontalLineTo(78.0f);
        pathBuilder.verticalLineTo(61.2f);
        pathBuilder.lineToRelative(44.0f, -6.28f);
        pathBuilder.verticalLineTo(201.08f);
        pathBuilder.lineTo(78.0f, 194.8f);
        pathBuilder.verticalLineTo(134.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 185.06f);
        pathBuilder.verticalLineTo(70.94f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.72f, -2.0f);
        pathBuilder.lineToRelative(42.28f, -6.0f);
        pathBuilder.verticalLineTo(122.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineTo(66.0f);
        pathBuilder.verticalLineToRelative(59.08f);
        pathBuilder.lineToRelative(-42.28f, -6.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 185.06f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 170.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.45f, 1.92f);
        pathBuilder.lineTo(134.0f, 200.05f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.lineToRelative(98.55f, 28.16f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 234.0f, 86.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shippingContainer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
