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

/* compiled from: Twitterlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TwitterLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTwitterLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_twitterLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TwitterlogoKt {
    private static ImageVector _twitterLogo;

    public static final ImageVector getTwitterLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _twitterLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TwitterLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.54f, 69.71f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 240.0f, 66.0f);
        pathBuilder.horizontalLineTo(208.4f);
        pathBuilder.arcToRelative(46.6f, 46.6f, 0.0f, false, false, -40.33f, -24.0f);
        pathBuilder.arcToRelative(44.93f, 44.93f, 0.0f, false, false, -32.31f, 13.12f);
        pathBuilder.arcTo(45.92f, 45.92f, 0.0f, false, false, 122.0f, 88.0f);
        pathBuilder.verticalLineToRelative(8.66f);
        pathBuilder.curveToRelative(-42.0f, -10.0f, -76.6f, -44.52f, -77.0f, -44.88f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 34.8f, 55.46f);
        pathBuilder.curveToRelative(-4.25f, 47.22f, 9.42f, 78.75f, 21.64f, 96.89f);
        pathBuilder.arcToRelative(107.71f, 107.71f, 0.0f, false, false, 23.07f, 25.0f);
        pathBuilder.curveToRelative(-15.49f, 19.0f, -41.34f, 28.89f, -41.62f, 29.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.88f, 9.0f);
        pathBuilder.curveTo(36.0f, 216.83f, 45.78f, 230.0f, 80.0f, 230.0f);
        pathBuilder.curveToRelative(69.88f, 0.0f, 128.23f, -54.0f, 133.82f, -123.34f);
        pathBuilder.lineToRelative(30.42f, -30.41f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 245.54f, 69.71f);
        pathBuilder.close();
        pathBuilder.moveTo(203.76f, 99.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.75f, 3.86f);
        pathBuilder.curveTo(197.93f, 167.76f, 144.33f, 218.0f, 80.0f, 218.0f);
        pathBuilder.curveToRelative(-14.0f, 0.0f, -22.76f, -2.41f, -28.06f, -4.8f);
        pathBuilder.curveToRelative(11.3f, -5.68f, 29.72f, -16.88f, 41.05f, -33.87f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.85f, -4.67f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 91.0f, 170.82f);
        pathBuilder.curveToRelative(-0.13f, -0.08f, -13.13f, -7.86f, -25.0f, -25.72f);
        pathBuilder.curveTo(52.0f, 124.0f, 45.31f, 98.43f, 46.0f, 68.88f);
        pathBuilder.curveToRelative(14.88f, 12.6f, 45.57f, 35.09f, 81.0f, 41.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.0f, -5.92f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, true, 10.19f, -24.34f);
        pathBuilder.arcTo(33.05f, 33.05f, 0.0f, false, true, 167.93f, 54.0f);
        pathBuilder.curveToRelative(13.43f, 0.17f, 26.0f, 8.37f, 31.24f, 20.4f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.5f, 3.6f);
        pathBuilder.horizontalLineToRelative(20.84f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _twitterLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
