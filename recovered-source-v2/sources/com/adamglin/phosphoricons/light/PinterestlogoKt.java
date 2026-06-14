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

/* compiled from: Pinterestlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PinterestLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPinterestLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pinterestLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinterestlogoKt {
    private static ImageVector _pinterestLogo;

    public static final ImageVector getPinterestLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pinterestLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PinterestLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 22.05f, -7.7f, 42.19f, -21.68f, 56.73f);
        pathBuilder.curveTo(187.32f, 182.25f, 169.71f, 190.0f, 152.0f, 190.0f);
        pathBuilder.curveToRelative(-19.42f, 0.0f, -31.55f, -7.07f, -38.63f, -13.64f);
        pathBuilder.lineToRelative(-11.53f, 49.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 96.0f, 230.0f);
        pathBuilder.arcToRelative(5.89f, 5.89f, 0.0f, false, true, -1.37f, -0.16f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.47f, -7.21f);
        pathBuilder.lineToRelative(32.0f, -136.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.68f, 2.74f);
        pathBuilder.lineTo(116.75f, 162.0f);
        pathBuilder.curveToRelative(2.8f, 4.33f, 12.46f, 16.0f, 35.25f, 16.0f);
        pathBuilder.curveToRelative(28.51f, 0.0f, 58.0f, -24.69f, 58.0f, -66.0f);
        pathBuilder.arcTo(74.0f, 74.0f, 0.0f, true, false, 71.9f, 149.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.39f, 6.0f);
        pathBuilder.arcTo(86.0f, 86.0f, 0.0f, true, true, 222.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pinterestLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
