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

/* compiled from: Stripelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StripeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getStripeLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stripeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StripelogoKt {
    private static ImageVector _stripeLogo;

    public static final ImageVector getStripeLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(208.0f, 28.0f);
        pathBuilder.lineTo(48.0f, 28.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f);
        pathBuilder.lineTo(28.0f, 208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(208.0f, 228.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(228.0f, 48.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 204.0f);
        pathBuilder.lineTo(52.0f, 204.0f);
        pathBuilder.lineTo(52.0f, 52.0f);
        pathBuilder.lineTo(204.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, -6.37f, -6.29f, -9.32f, -24.0f, -14.42f);
        pathBuilder.curveToRelative(-16.14f, -4.65f, -38.23f, -11.0f, -38.23f, -33.58f);
        pathBuilder.curveToRelative(0.0f, -20.52f, 18.15f, -36.0f, 42.22f, -36.0f);
        pathBuilder.curveToRelative(17.24f, 0.0f, 32.06f, 8.14f, 38.69f, 21.24f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -21.41f, 10.84f);
        pathBuilder.curveTo(142.8f, 95.17f, 136.0f, 92.0f, 128.0f, 92.0f);
        pathBuilder.curveToRelative(-10.22f, 0.0f, -18.22f, 5.27f, -18.22f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.09f, 0.0f, 2.21f, 3.28f, 4.17f);
        pathBuilder.curveToRelative(4.18f, 2.48f, 11.0f, 4.45f, 17.6f, 6.35f);
        pathBuilder.curveToRelative(8.75f, 2.52f, 17.8f, 5.13f, 25.38f, 9.86f);
        pathBuilder.curveToRelative(13.19f, 8.23f, 16.0f, 19.56f, 16.0f, 27.62f);
        pathBuilder.curveToRelative(0.0f, 20.19f, -19.33f, 36.0f, -44.0f, 36.0f);
        pathBuilder.curveToRelative(-21.26f, 0.0f, -39.46f, -12.35f, -43.27f, -29.38f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.42f, -5.24f);
        pathBuilder.curveTo(109.3f, 158.49f, 117.21f, 164.0f, 128.0f, 164.0f);
        pathBuilder.curveTo(137.44f, 164.0f, 148.0f, 158.87f, 148.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stripeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
