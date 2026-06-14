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

/* compiled from: Paypallogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaypalLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPaypalLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paypalLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaypallogoKt {
    private static ImageVector _paypalLogo;

    public static final ImageVector getPaypalLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(218.54f, 94.77f);
        pathBuilder.arcTo(53.84f, 53.84f, 0.0f, false, false, 198.0f, 78.66f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, false, 144.0f, 26.0f);
        pathBuilder.lineTo(84.0f, 26.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 70.42f, 36.6f);
        pathBuilder.lineToRelative(-36.0f, 144.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 48.0f, 198.0f);
        pathBuilder.lineTo(78.07f, 198.0f);
        pathBuilder.lineToRelative(-3.65f, 14.6f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 88.0f, 230.0f);
        pathBuilder.horizontalLineToRelative(31.5f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.58f, -10.6f);
        pathBuilder.lineToRelative(9.0f, -35.88f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 144.0f, 182.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, 42.56f, -87.23f);
        pathBuilder.close();
        pathBuilder.moveTo(79.51f, 186.0f);
        pathBuilder.lineTo(48.0f, 186.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.94f, -2.49f);
        pathBuilder.lineToRelative(36.0f, -144.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 84.0f, 38.0f);
        pathBuilder.horizontalLineToRelative(60.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 41.69f, 36.87f);
        pathBuilder.arcTo(54.57f, 54.57f, 0.0f, false, false, 176.0f, 74.0f);
        pathBuilder.lineTo(120.0f, 74.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.59f, 10.6f);
        pathBuilder.lineToRelative(-25.0f, 99.89f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 79.51f, 186.0f);
        pathBuilder.close();
        pathBuilder.moveTo(185.37f, 87.05f);
        pathBuilder.curveToRelative(-0.18f, 1.0f, -0.39f, 2.09f, -0.65f, 3.14f);
        pathBuilder.arcTo(41.94f, 41.94f, 0.0f, false, true, 144.0f, 122.0f);
        pathBuilder.lineTo(109.44f, 122.0f);
        pathBuilder.lineToRelative(8.62f, -34.48f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 120.0f, 86.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.arcTo(42.43f, 42.43f, 0.0f, false, true, 185.37f, 87.05f);
        pathBuilder.close();
        pathBuilder.moveTo(216.72f, 138.19f);
        pathBuilder.arcTo(41.94f, 41.94f, 0.0f, false, true, 176.0f, 170.0f);
        pathBuilder.lineTo(144.0f, 170.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.58f, 10.6f);
        pathBuilder.lineToRelative(-9.0f, 35.89f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.94f, 1.51f);
        pathBuilder.lineTo(88.0f, 218.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.94f, -2.49f);
        pathBuilder.lineToRelative(20.0f, -80.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -1.52f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcToRelative(53.92f, 53.92f, 0.0f, false, false, 52.38f, -40.9f);
        pathBuilder.curveToRelative(0.14f, -0.55f, 0.25f, -1.1f, 0.36f, -1.64f);
        pathBuilder.arcToRelative(42.06f, 42.06f, 0.0f, false, true, 20.0f, 46.73f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paypalLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
