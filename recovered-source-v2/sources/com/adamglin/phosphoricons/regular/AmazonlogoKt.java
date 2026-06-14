package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Amazonlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AmazonLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getAmazonLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_amazonLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AmazonlogoKt {
    private static ImageVector _amazonLogo;

    public static final ImageVector getAmazonLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _amazonLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AmazonLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.0f, 168.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(187.31f);
        pathBuilder.lineToRelative(-2.21f, 2.22f);
        pathBuilder.curveTo(226.69f, 192.9f, 189.44f, 232.0f, 128.0f, 232.0f);
        pathBuilder.curveToRelative(-62.84f, 0.0f, -100.38f, -40.91f, -101.95f, -42.65f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 38.0f, 178.65f);
        pathBuilder.curveTo(38.27f, 179.0f, 72.5f, 216.0f, 128.0f, 216.0f);
        pathBuilder.reflectiveCurveToRelative(89.73f, -37.0f, 90.07f, -37.36f);
        pathBuilder.arcToRelative(3.85f, 3.85f, 0.0f, false, true, 0.27f, -0.3f);
        pathBuilder.lineToRelative(2.35f, -2.34f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 94.53f);
        pathBuilder.verticalLineTo(84.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 91.92f, 67.64f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.25f, -7.28f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 176.0f, 84.0f);
        pathBuilder.verticalLineToRelative(92.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-6.53f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, true, 0.0f, -74.94f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 132.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, 36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 160.0f, 132.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _amazonLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
