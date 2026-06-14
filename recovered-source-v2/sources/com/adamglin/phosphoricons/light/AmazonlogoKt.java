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

/* compiled from: Amazonlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AmazonLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAmazonLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_amazonLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AmazonlogoKt {
    private static ImageVector _amazonLogo;

    public static final ImageVector getAmazonLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(246.0f, 168.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.verticalLineTo(182.48f);
        pathBuilder.lineToRelative(-5.66f, 5.66f);
        pathBuilder.curveTo(225.6f, 191.15f, 188.86f, 230.0f, 128.0f, 230.0f);
        pathBuilder.curveToRelative(-62.0f, 0.0f, -98.92f, -40.27f, -100.46f, -42.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.92f, -8.0f);
        pathBuilder.curveToRelative(0.34f, 0.37f, 35.09f, 38.0f, 91.54f, 38.0f);
        pathBuilder.reflectiveCurveToRelative(91.2f, -37.64f, 91.55f, -38.0f);
        pathBuilder.lineToRelative(0.21f, -0.22f);
        pathBuilder.lineToRelative(5.76f, -5.76f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(162.0f, 99.56f);
        pathBuilder.verticalLineTo(84.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 90.14f, 66.73f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.68f, -5.46f);
        pathBuilder.arcTo(50.0f, 50.0f, 0.0f, false, true, 174.0f, 84.0f);
        pathBuilder.verticalLineToRelative(92.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.verticalLineTo(164.44f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, true, true, 0.0f, -64.88f);
        pathBuilder.close();
        pathBuilder.moveTo(162.0f, 132.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, false, -38.0f, 38.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 162.0f, 132.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _amazonLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
