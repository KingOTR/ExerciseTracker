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

/* compiled from: Redditlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RedditLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getRedditLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_redditLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedditlogoKt {
    private static ImageVector _redditLogo;

    public static final ImageVector getRedditLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(246.0f, 104.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -50.64f, -21.76f);
        pathBuilder.curveTo(178.0f, 72.75f, 157.0f, 67.17f, 135.05f, 66.18f);
        pathBuilder.lineToRelative(5.89f, -35.35f);
        pathBuilder.lineToRelative(21.16f, 3.26f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, false, 2.17f, -11.81f);
        pathBuilder.lineToRelative(-27.36f, -4.21f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 130.08f, 23.0f);
        pathBuilder.lineTo(122.9f, 66.09f);
        pathBuilder.curveToRelative(-22.64f, 0.74f, -44.41f, 6.38f, -62.26f, 16.15f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, -40.0f, 44.66f);
        pathBuilder.arcTo(57.07f, 57.07f, 0.0f, false, false, 18.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, 21.26f, 11.74f, 41.09f, 33.05f, 55.84f);
        pathBuilder.curveTo(71.68f, 214.13f, 99.0f, 222.0f, 128.0f, 222.0f);
        pathBuilder.reflectiveCurveToRelative(56.32f, -7.87f, 76.95f, -22.16f);
        pathBuilder.curveTo(226.26f, 185.09f, 238.0f, 165.26f, 238.0f, 144.0f);
        pathBuilder.arcToRelative(57.07f, 57.07f, 0.0f, false, false, -2.63f, -17.1f);
        pathBuilder.arcTo(30.16f, 30.16f, 0.0f, false, false, 246.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 22.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 184.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(225.15f, 119.51f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.46f, 7.51f);
        pathBuilder.arcTo(45.65f, 45.65f, 0.0f, false, true, 226.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, 36.39f, -44.0f, 66.0f, -98.0f, 66.0f);
        pathBuilder.reflectiveCurveToRelative(-98.0f, -29.61f, -98.0f, -66.0f);
        pathBuilder.arcToRelative(45.63f, 45.63f, 0.0f, false, true, 3.3f, -16.94f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.45f, -7.55f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 23.71f, -26.1f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.79f, 1.7f);
        pathBuilder.arcToRelative(3.79f, 3.79f, 0.0f, false, false, 0.34f, -0.2f);
        pathBuilder.curveTo(80.7f, 84.0f, 103.89f, 78.0f, 128.0f, 78.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(24.1f, 0.0f, 47.28f, 6.0f, 65.29f, 16.9f);
        pathBuilder.lineToRelative(0.16f, 0.11f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.0f, -1.6f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 23.71f, 26.1f);
        pathBuilder.close();
        pathBuilder.moveTo(165.3f, 173.19f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.49f, 8.11f);
        pathBuilder.arcToRelative(74.22f, 74.22f, 0.0f, false, true, -69.62f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.62f, -10.6f);
        pathBuilder.arcToRelative(62.2f, 62.2f, 0.0f, false, false, 58.38f, 0.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 165.3f, 173.19f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 142.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 88.0f, 142.0f);
        pathBuilder.close();
        pathBuilder.moveTo(182.0f, 128.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 182.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _redditLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
