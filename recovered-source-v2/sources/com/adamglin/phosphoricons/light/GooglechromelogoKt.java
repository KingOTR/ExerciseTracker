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

/* compiled from: Googlechromelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GoogleChromeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGoogleChromeLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googleChromeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglechromelogoKt {
    private static ImageVector _googleChromeLogo;

    public static final ImageVector getGoogleChromeLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _googleChromeLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GoogleChromeLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 38.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, 77.33f, 44.0f);
        pathBuilder.lineTo(128.0f, 82.0f);
        pathBuilder.arcToRelative(46.07f, 46.07f, 0.0f, false, false, -44.93f, 36.17f);
        pathBuilder.lineTo(56.91f, 72.87f);
        pathBuilder.arcTo(89.91f, 89.91f, 0.0f, false, true, 128.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(162.0f, 128.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, -34.0f, -34.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, true, 162.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 128.0f);
        pathBuilder.arcTo(89.4f, 89.4f, 0.0f, false, true, 49.5f, 84.0f);
        pathBuilder.lineToRelative(38.66f, 67.0f);
        pathBuilder.curveToRelative(0.06f, 0.1f, 0.13f, 0.18f, 0.19f, 0.27f);
        pathBuilder.arcTo(45.94f, 45.94f, 0.0f, false, false, 142.0f, 171.83f);
        pathBuilder.lineToRelative(-26.17f, 45.34f);
        pathBuilder.arcTo(90.13f, 90.13f, 0.0f, false, true, 38.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(129.16f, 218.0f);
        pathBuilder.lineTo(167.84f, 151.0f);
        pathBuilder.lineTo(168.05f, 150.59f);
        pathBuilder.arcTo(45.9f, 45.9f, 0.0f, false, false, 159.0f, 94.0f);
        pathBuilder.horizontalLineToRelative(52.37f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, -82.16f, 124.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googleChromeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
