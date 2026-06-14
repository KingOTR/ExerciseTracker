package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Redditlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RedditLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getRedditLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_redditLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedditlogoKt {
    private static ImageVector _redditLogo;

    public static final ImageVector getRedditLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _redditLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("RedditLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.0f, 104.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -52.94f, -24.19f);
        pathBuilder.curveToRelative(-16.75f, -8.9f, -36.76f, -14.28f, -57.66f, -15.53f);
        pathBuilder.lineToRelative(5.19f, -31.17f);
        pathBuilder.lineToRelative(17.72f, 2.72f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 2.87f, -15.74f);
        pathBuilder.lineToRelative(-26.0f, -4.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.11f, 6.59f);
        pathBuilder.lineTo(121.2f, 64.16f);
        pathBuilder.curveToRelative(-21.84f, 0.94f, -42.82f, 6.38f, -60.26f, 15.65f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -42.59f, 47.74f);
        pathBuilder.arcTo(59.0f, 59.0f, 0.0f, false, false, 16.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, 21.93f, 12.0f, 42.35f, 33.91f, 57.49f);
        pathBuilder.curveTo(70.88f, 216.0f, 98.61f, 224.0f, 128.0f, 224.0f);
        pathBuilder.reflectiveCurveToRelative(57.12f, -8.0f, 78.09f, -22.51f);
        pathBuilder.curveTo(228.0f, 186.35f, 240.0f, 165.93f, 240.0f, 144.0f);
        pathBuilder.arcToRelative(59.0f, 59.0f, 0.0f, false, false, -2.35f, -16.45f);
        pathBuilder.arcTo(32.16f, 32.16f, 0.0f, false, false, 248.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 128.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(163.75f, 183.07f);
        pathBuilder.arcToRelative(76.18f, 76.18f, 0.0f, false, true, -71.5f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.5f, -14.14f);
        pathBuilder.arcToRelative(60.18f, 60.18f, 0.0f, false, false, 56.5f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.5f, 14.14f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 144.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 168.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _redditLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
