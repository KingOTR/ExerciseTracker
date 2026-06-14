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

/* compiled from: Paypallogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaypalLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPaypalLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paypalLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaypallogoKt {
    private static ImageVector _paypalLogo;

    public static final ImageVector getPaypalLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(223.27f, 91.08f);
        pathBuilder.arcToRelative(59.82f, 59.82f, 0.0f, false, false, -19.5f, -16.27f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 144.0f, 20.0f);
        pathBuilder.lineTo(84.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 64.6f, 35.15f);
        pathBuilder.lineToRelative(-36.0f, 144.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 48.0f, 204.0f);
        pathBuilder.lineTo(70.39f, 204.0f);
        pathBuilder.lineToRelative(-1.79f, 7.15f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 88.0f, 236.0f);
        pathBuilder.horizontalLineToRelative(31.5f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.4f, -15.15f);
        pathBuilder.lineTo(147.13f, 188.0f);
        pathBuilder.lineTo(176.0f, 188.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, 47.29f, -96.92f);
        pathBuilder.close();
        pathBuilder.moveTo(87.13f, 44.0f);
        pathBuilder.lineTo(144.0f, 44.0f);
        pathBuilder.arcToRelative(35.77f, 35.77f, 0.0f, false, true, 28.37f, 13.85f);
        pathBuilder.arcTo(36.18f, 36.18f, 0.0f, false, true, 178.0f, 68.06f);
        pathBuilder.curveToRelative(-0.66f, 0.0f, -1.31f, -0.06f, -2.0f, -0.06f);
        pathBuilder.lineTo(120.0f, 68.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 100.6f, 83.15f);
        pathBuilder.lineTo(76.39f, 180.0f);
        pathBuilder.lineTo(53.13f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.89f, 92.05f);
        pathBuilder.arcTo(35.93f, 35.93f, 0.0f, false, true, 144.0f, 116.0f);
        pathBuilder.lineTo(117.13f, 116.0f);
        pathBuilder.lineToRelative(6.0f, -24.0f);
        pathBuilder.lineTo(176.0f, 92.0f);
        pathBuilder.curveTo(176.62f, 92.0f, 177.26f, 92.0f, 177.89f, 92.05f);
        pathBuilder.close();
        pathBuilder.moveTo(210.89f, 136.73f);
        pathBuilder.arcTo(35.94f, 35.94f, 0.0f, false, true, 176.0f, 164.0f);
        pathBuilder.lineTo(144.0f, 164.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -19.4f, 15.15f);
        pathBuilder.lineTo(116.39f, 212.0f);
        pathBuilder.lineTo(93.13f, 212.0f);
        pathBuilder.lineToRelative(18.0f, -72.0f);
        pathBuilder.lineTo(144.0f, 140.0f);
        pathBuilder.arcToRelative(59.89f, 59.89f, 0.0f, false, false, 56.1f, -38.75f);
        pathBuilder.arcToRelative(36.12f, 36.12f, 0.0f, false, true, 10.82f, 35.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paypalLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
