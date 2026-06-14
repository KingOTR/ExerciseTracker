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

/* compiled from: Redditlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RedditLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getRedditLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_redditLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedditlogoKt {
    private static ImageVector _redditLogo;

    public static final ImageVector getRedditLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(228.21f, 124.67f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(51.6f, 51.6f, 0.0f, false, true, 232.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, 39.76f, -46.56f, 72.0f, -104.0f, 72.0f);
        pathBuilder.reflectiveCurveTo(24.0f, 183.76f, 24.0f, 144.0f);
        pathBuilder.arcToRelative(51.6f, 51.6f, 0.0f, false, true, 3.79f, -19.33f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, true, 59.41f, 89.88f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(77.72f, 78.75f, 101.72f, 72.0f, 128.0f, 72.0f);
        pathBuilder.reflectiveCurveToRelative(50.28f, 6.75f, 68.59f, 17.88f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 31.62f, 34.79f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(248.0f, 104.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -52.94f, -24.19f);
        pathBuilder2.curveToRelative(-16.75f, -8.9f, -36.76f, -14.28f, -57.66f, -15.53f);
        pathBuilder2.lineToRelative(5.19f, -31.17f);
        pathBuilder2.lineToRelative(17.72f, 2.72f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 2.87f, -15.74f);
        pathBuilder2.lineToRelative(-26.0f, -4.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.11f, 6.59f);
        pathBuilder2.lineTo(121.2f, 64.16f);
        pathBuilder2.curveToRelative(-21.84f, 0.94f, -42.82f, 6.38f, -60.26f, 15.65f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -42.59f, 47.74f);
        pathBuilder2.arcTo(59.0f, 59.0f, 0.0f, false, false, 16.0f, 144.0f);
        pathBuilder2.curveToRelative(0.0f, 21.93f, 12.0f, 42.35f, 33.91f, 57.49f);
        pathBuilder2.curveTo(70.88f, 216.0f, 98.61f, 224.0f, 128.0f, 224.0f);
        pathBuilder2.reflectiveCurveToRelative(57.12f, -8.0f, 78.09f, -22.51f);
        pathBuilder2.curveTo(228.0f, 186.35f, 240.0f, 165.93f, 240.0f, 144.0f);
        pathBuilder2.arcToRelative(59.0f, 59.0f, 0.0f, false, false, -2.35f, -16.45f);
        pathBuilder2.arcTo(32.16f, 32.16f, 0.0f, false, false, 248.0f, 104.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(184.0f, 24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.13f, 117.78f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.29f, 10.0f);
        pathBuilder2.arcTo(43.62f, 43.62f, 0.0f, false, true, 224.0f, 144.0f);
        pathBuilder2.curveToRelative(0.0f, 16.53f, -9.59f, 32.27f, -27.0f, 44.33f);
        pathBuilder2.curveTo(178.67f, 201.0f, 154.17f, 208.0f, 128.0f, 208.0f);
        pathBuilder2.reflectiveCurveToRelative(-50.67f, -7.0f, -69.0f, -19.67f);
        pathBuilder2.curveTo(41.59f, 176.27f, 32.0f, 160.53f, 32.0f, 144.0f);
        pathBuilder2.arcToRelative(43.75f, 43.75f, 0.0f, false, true, 3.14f, -16.17f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.27f, -10.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, true, true, 52.94f, 94.59f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.63f, 2.12f);
        pathBuilder2.lineToRelative(0.18f, -0.11f);
        pathBuilder2.curveTo(81.45f, 85.9f, 104.25f, 80.0f, 128.0f, 80.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(23.73f, 0.0f, 46.53f, 5.9f, 64.23f, 16.6f);
        pathBuilder2.lineToRelative(0.18f, 0.11f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.63f, -2.12f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 21.07f, 23.19f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.0f, 144.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(184.0f, 128.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 184.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(167.07f, 172.25f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.32f, 10.82f);
        pathBuilder2.arcToRelative(76.18f, 76.18f, 0.0f, false, true, -71.5f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.5f, -14.14f);
        pathBuilder2.arcToRelative(60.18f, 60.18f, 0.0f, false, false, 56.5f, 0.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 167.07f, 172.25f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _redditLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
