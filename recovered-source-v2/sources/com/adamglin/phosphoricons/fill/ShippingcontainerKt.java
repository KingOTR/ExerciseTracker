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

/* compiled from: Shippingcontainer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShippingContainer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getShippingContainer", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shippingContainer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShippingcontainerKt {
    private static ImageVector _shippingContainer;

    public static final ImageVector getShippingContainer(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(236.4f, 70.65f);
        pathBuilder.lineTo(130.2f, 40.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.33f, -0.23f);
        pathBuilder.lineTo(21.74f, 55.1f);
        pathBuilder.arcTo(16.08f, 16.08f, 0.0f, false, false, 8.0f, 70.94f);
        pathBuilder.lineTo(8.0f, 185.06f);
        pathBuilder.arcTo(16.08f, 16.08f, 0.0f, false, false, 21.74f, 200.9f);
        pathBuilder.lineToRelative(105.13f, 15.0f);
        pathBuilder.arcTo(8.47f, 8.47f, 0.0f, false, false, 128.0f, 216.0f);
        pathBuilder.arcToRelative(7.85f, 7.85f, 0.0f, false, false, 2.2f, -0.31f);
        pathBuilder.lineToRelative(106.2f, -30.34f);
        pathBuilder.arcTo(16.07f, 16.07f, 0.0f, false, false, 248.0f, 170.0f);
        pathBuilder.lineTo(248.0f, 86.0f);
        pathBuilder.arcTo(16.07f, 16.07f, 0.0f, false, false, 236.4f, 70.65f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 120.0f);
        pathBuilder.lineTo(48.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.lineTo(64.0f, 136.0f);
        pathBuilder.verticalLineToRelative(54.78f);
        pathBuilder.lineToRelative(-40.0f, -5.72f);
        pathBuilder.lineTo(24.0f, 70.94f);
        pathBuilder.lineToRelative(40.0f, -5.72f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 198.78f);
        pathBuilder.lineTo(80.0f, 193.06f);
        pathBuilder.lineTo(80.0f, 136.0f);
        pathBuilder.lineTo(96.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.lineTo(80.0f, 120.0f);
        pathBuilder.lineTo(80.0f, 62.94f);
        pathBuilder.lineToRelative(40.0f, -5.72f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shippingContainer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
