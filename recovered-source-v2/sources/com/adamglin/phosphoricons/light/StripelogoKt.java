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

/* compiled from: Stripelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StripeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getStripeLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stripeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StripelogoKt {
    private static ImageVector _stripeLogo;

    public static final ImageVector getStripeLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _stripeLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("StripeLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(166.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 16.54f, -17.05f, 30.0f, -38.0f, 30.0f);
        pathBuilder.reflectiveCurveToRelative(-38.0f, -13.46f, -38.0f, -30.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 9.76f, 11.91f, 18.0f, 26.0f, 18.0f);
        pathBuilder.reflectiveCurveToRelative(26.0f, -8.24f, 26.0f, -18.0f);
        pathBuilder.curveToRelative(0.0f, -11.21f, -10.7f, -15.1f, -28.33f, -20.18f);
        pathBuilder.curveToRelative(-15.89f, -4.58f, -33.89f, -9.77f, -33.89f, -27.82f);
        pathBuilder.curveToRelative(0.0f, -17.1f, 15.57f, -30.0f, 36.22f, -30.0f);
        pathBuilder.curveToRelative(15.0f, 0.0f, 27.74f, 6.88f, 33.34f, 18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.71f, 5.42f);
        pathBuilder.curveTo(147.08f, 90.36f, 138.41f, 86.0f, 128.0f, 86.0f);
        pathBuilder.curveToRelative(-13.81f, 0.0f, -24.22f, 7.74f, -24.22f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 8.41f, 9.52f, 11.76f, 25.21f, 16.29f);
        pathBuilder.curveTo(145.48f, 125.0f, 166.0f, 131.0f, 166.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 48.0f);
        pathBuilder.lineTo(222.0f, 208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f);
        pathBuilder.lineTo(48.0f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f);
        pathBuilder.lineTo(34.0f, 48.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 48.0f, 34.0f);
        pathBuilder.lineTo(208.0f, 34.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 48.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f);
        pathBuilder.lineTo(48.0f, 46.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f);
        pathBuilder.lineTo(46.0f, 208.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f);
        pathBuilder.lineTo(208.0f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stripeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
