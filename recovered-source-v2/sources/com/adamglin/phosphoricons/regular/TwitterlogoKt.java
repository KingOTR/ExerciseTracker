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

/* compiled from: Twitterlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TwitterLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getTwitterLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_twitterLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TwitterlogoKt {
    private static ImageVector _twitterLogo;

    public static final ImageVector getTwitterLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(247.39f, 68.94f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 64.0f);
        pathBuilder.lineTo(209.57f, 64.0f);
        pathBuilder.arcTo(48.66f, 48.66f, 0.0f, false, false, 168.1f, 40.0f);
        pathBuilder.arcToRelative(46.91f, 46.91f, 0.0f, false, false, -33.75f, 13.7f);
        pathBuilder.arcTo(47.9f, 47.9f, 0.0f, false, false, 120.0f, 88.0f);
        pathBuilder.verticalLineToRelative(6.09f);
        pathBuilder.curveTo(79.74f, 83.47f, 46.81f, 50.72f, 46.46f, 50.37f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.65f, 4.92f);
        pathBuilder.curveToRelative(-4.31f, 47.79f, 9.57f, 79.77f, 22.0f, 98.18f);
        pathBuilder.arcToRelative(110.93f, 110.93f, 0.0f, false, false, 21.88f, 24.2f);
        pathBuilder.curveToRelative(-15.23f, 17.53f, -39.21f, 26.74f, -39.47f, 26.84f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.85f, 11.93f);
        pathBuilder.curveToRelative(0.75f, 1.12f, 3.75f, 5.05f, 11.08f, 8.72f);
        pathBuilder.curveTo(53.51f, 229.7f, 65.48f, 232.0f, 80.0f, 232.0f);
        pathBuilder.curveToRelative(70.67f, 0.0f, 129.72f, -54.42f, 135.75f, -124.44f);
        pathBuilder.lineToRelative(29.91f, -29.9f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 247.39f, 68.94f);
        pathBuilder.close();
        pathBuilder.moveTo(202.39f, 98.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.32f, 5.14f);
        pathBuilder.curveTo(196.0f, 166.58f, 143.28f, 216.0f, 80.0f, 216.0f);
        pathBuilder.curveToRelative(-10.56f, 0.0f, -18.0f, -1.4f, -23.22f, -3.08f);
        pathBuilder.curveToRelative(11.51f, -6.25f, 27.56f, -17.0f, 37.88f, -32.48f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 92.0f, 169.08f);
        pathBuilder.curveToRelative(-0.47f, -0.27f, -43.91f, -26.34f, -44.0f, -96.0f);
        pathBuilder.curveToRelative(16.0f, 13.0f, 45.25f, 33.17f, 78.67f, 38.79f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 104.0f);
        pathBuilder.lineTo(136.0f, 88.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 9.6f, -22.92f);
        pathBuilder.arcTo(30.94f, 30.94f, 0.0f, false, true, 167.9f, 56.0f);
        pathBuilder.curveToRelative(12.66f, 0.16f, 24.49f, 7.88f, 29.44f, 19.21f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 204.67f, 80.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _twitterLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
