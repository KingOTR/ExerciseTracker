package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Paypallogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaypalLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPaypalLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paypalLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaypallogoKt {
    private static ImageVector _paypalLogo;

    public static final ImageVector getPaypalLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _paypalLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaypalLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(191.91f, 82.7f);
        pathBuilder.arcToRelative(49.0f, 49.0f, 0.0f, false, true, -1.37f, 8.94f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, true, 144.0f, 128.0f);
        pathBuilder.horizontalLineTo(108.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.76f, 6.06f);
        pathBuilder.lineToRelative(12.0f, -48.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 80.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.arcTo(48.25f, 48.25f, 0.0f, false, true, 191.91f, 82.7f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(220.12f, 93.54f);
        pathBuilder2.arcToRelative(55.8f, 55.8f, 0.0f, false, false, -20.19f, -16.18f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, false, false, 144.0f, 24.0f);
        pathBuilder2.lineTo(84.0f, 24.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 68.48f, 36.12f);
        pathBuilder2.lineToRelative(-36.0f, 144.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 200.0f);
        pathBuilder2.horizontalLineToRelative(27.5f);
        pathBuilder2.lineToRelative(-3.0f, 12.12f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 232.0f);
        pathBuilder2.horizontalLineToRelative(31.5f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 135.0f, 219.88f);
        pathBuilder2.lineTo(144.0f, 184.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(56.0f, 56.0f, 0.0f, false, false, 44.14f, -90.46f);
        pathBuilder2.close();
        pathBuilder2.moveTo(79.52f, 184.0f);
        pathBuilder2.lineTo(48.0f, 184.0f);
        pathBuilder2.lineTo(84.0f, 40.0f);
        pathBuilder2.horizontalLineToRelative(60.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 39.3f, 32.49f);
        pathBuilder2.arcTo(57.0f, 57.0f, 0.0f, false, false, 176.0f, 72.0f);
        pathBuilder2.lineTo(120.0f, 72.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.53f, 12.12f);
        pathBuilder2.close();
        pathBuilder2.moveTo(183.0f, 88.62f);
        pathBuilder2.curveToRelative(-0.08f, 0.36f, -0.15f, 0.72f, -0.24f, 1.08f);
        pathBuilder2.arcTo(39.94f, 39.94f, 0.0f, false, true, 144.0f, 120.0f);
        pathBuilder2.lineTo(112.0f, 120.0f);
        pathBuilder2.lineToRelative(8.0f, -32.0f);
        pathBuilder2.horizontalLineToRelative(56.0f);
        pathBuilder2.arcTo(40.07f, 40.07f, 0.0f, false, true, 183.0f, 88.62f);
        pathBuilder2.close();
        pathBuilder2.moveTo(214.76f, 137.7f);
        pathBuilder2.arcTo(39.94f, 39.94f, 0.0f, false, true, 176.0f, 168.0f);
        pathBuilder2.lineTo(144.0f, 168.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.52f, 12.12f);
        pathBuilder2.lineToRelative(-9.0f, 35.88f);
        pathBuilder2.lineTo(88.0f, 216.0f);
        pathBuilder2.lineToRelative(20.0f, -80.0f);
        pathBuilder2.horizontalLineToRelative(36.0f);
        pathBuilder2.arcToRelative(55.9f, 55.9f, 0.0f, false, false, 54.0f, -41.39f);
        pathBuilder2.arcToRelative(40.2f, 40.2f, 0.0f, false, true, 9.48f, 8.77f);
        pathBuilder2.arcTo(39.73f, 39.73f, 0.0f, false, true, 214.78f, 137.7f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paypalLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
