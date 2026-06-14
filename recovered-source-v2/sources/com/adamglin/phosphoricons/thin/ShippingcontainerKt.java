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

/* compiled from: Shippingcontainer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShippingContainer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getShippingContainer", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shippingContainer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShippingcontainerKt {
    private static ImageVector _shippingContainer;

    public static final ImageVector getShippingContainer(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(235.3f, 74.5f);
        pathBuilder.lineTo(129.1f, 44.15f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, false, -1.67f, -0.11f);
        pathBuilder.lineTo(22.3f, 59.06f);
        pathBuilder.arcTo(12.06f, 12.06f, 0.0f, false, false, 12.0f, 70.94f);
        pathBuilder.verticalLineTo(185.06f);
        pathBuilder.arcToRelative(12.06f, 12.06f, 0.0f, false, false, 10.3f, 11.88f);
        pathBuilder.lineToRelative(105.13f, 15.0f);
        pathBuilder.arcToRelative(3.64f, 3.64f, 0.0f, false, false, 0.57f, 0.0f);
        pathBuilder.arcToRelative(4.11f, 4.11f, 0.0f, false, false, 1.1f, -0.15f);
        pathBuilder.lineTo(235.3f, 181.5f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 170.0f);
        pathBuilder.verticalLineTo(86.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 235.3f, 74.5f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 124.0f);
        pathBuilder.horizontalLineTo(76.0f);
        pathBuilder.verticalLineTo(59.47f);
        pathBuilder.lineToRelative(48.0f, -6.86f);
        pathBuilder.verticalLineTo(203.39f);
        pathBuilder.lineToRelative(-48.0f, -6.86f);
        pathBuilder.verticalLineTo(132.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 185.06f);
        pathBuilder.verticalLineTo(70.94f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.43f, -4.0f);
        pathBuilder.lineTo(68.0f, 60.61f);
        pathBuilder.verticalLineTo(124.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineTo(68.0f);
        pathBuilder.verticalLineToRelative(63.39f);
        pathBuilder.lineTo(23.43f, 189.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 185.06f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 170.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.9f, 3.84f);
        pathBuilder.lineTo(132.0f, 202.7f);
        pathBuilder.verticalLineTo(53.3f);
        pathBuilder.lineTo(233.1f, 82.19f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 86.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shippingContainer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
