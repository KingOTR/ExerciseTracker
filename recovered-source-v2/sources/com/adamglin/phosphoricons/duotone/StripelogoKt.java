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

/* compiled from: Stripelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StripeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getStripeLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stripeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StripelogoKt {
    private static ImageVector _stripeLogo;

    public static final ImageVector getStripeLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 48.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(168.0f, 152.0f);
        pathBuilder2.curveToRelative(0.0f, 17.65f, -17.94f, 32.0f, -40.0f, 32.0f);
        pathBuilder2.reflectiveCurveToRelative(-40.0f, -14.35f, -40.0f, -32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, 8.67f, 11.0f, 16.0f, 24.0f, 16.0f);
        pathBuilder2.reflectiveCurveToRelative(24.0f, -7.33f, 24.0f, -16.0f);
        pathBuilder2.curveToRelative(0.0f, -9.48f, -8.61f, -13.0f, -26.88f, -18.26f);
        pathBuilder2.curveTo(109.37f, 129.2f, 89.78f, 123.55f, 89.78f, 104.0f);
        pathBuilder2.curveToRelative(0.0f, -18.24f, 16.43f, -32.0f, 38.22f, -32.0f);
        pathBuilder2.curveToRelative(15.72f, 0.0f, 29.18f, 7.3f, 35.12f, 19.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.27f, 7.22f);
        pathBuilder2.curveTo(145.64f, 91.94f, 137.65f, 88.0f, 128.0f, 88.0f);
        pathBuilder2.curveToRelative(-12.67f, 0.0f, -22.22f, 6.88f, -22.22f, 16.0f);
        pathBuilder2.curveToRelative(0.0f, 7.0f, 9.0f, 10.1f, 23.77f, 14.36f);
        pathBuilder2.curveTo(145.78f, 123.0f, 168.0f, 129.45f, 168.0f, 152.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 48.0f);
        pathBuilder2.verticalLineTo(208.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder2.horizontalLineTo(48.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder2.verticalLineTo(48.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f);
        pathBuilder2.horizontalLineTo(208.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 208.0f);
        pathBuilder2.verticalLineTo(48.0f);
        pathBuilder2.horizontalLineTo(48.0f);
        pathBuilder2.verticalLineTo(208.0f);
        pathBuilder2.horizontalLineTo(208.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stripeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
