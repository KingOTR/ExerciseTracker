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

/* compiled from: Redditlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RedditLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getRedditLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_redditLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedditlogoKt {
    private static ImageVector _redditLogo;

    public static final ImageVector getRedditLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(252.0f, 104.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -57.4f, -28.93f);
        pathBuilder.arcToRelative(145.56f, 145.56f, 0.0f, false, false, -52.54f, -14.45f);
        pathBuilder.lineToRelative(3.8f, -22.81f);
        pathBuilder.lineToRelative(15.67f, 2.61f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 3.95f, -23.67f);
        pathBuilder.lineTo(138.0f, 12.16f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 124.16f, 22.0f);
        pathBuilder.lineToRelative(-6.38f, 38.31f);
        pathBuilder.curveTo(97.48f, 61.62f, 78.0f, 66.7f, 61.4f, 75.07f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -47.52f, 53.68f);
        pathBuilder.arcTo(62.87f, 62.87f, 0.0f, false, false, 12.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, 23.29f, 12.65f, 44.87f, 35.63f, 60.78f);
        pathBuilder.curveTo(69.26f, 219.75f, 97.8f, 228.0f, 128.0f, 228.0f);
        pathBuilder.reflectiveCurveToRelative(58.74f, -8.25f, 80.37f, -23.22f);
        pathBuilder.curveTo(231.35f, 188.87f, 244.0f, 167.29f, 244.0f, 144.0f);
        pathBuilder.arcToRelative(62.87f, 62.87f, 0.0f, false, false, -1.88f, -15.25f);
        pathBuilder.arcTo(36.16f, 36.16f, 0.0f, false, false, 252.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(222.09f, 114.34f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.0f, 15.0f);
        pathBuilder.arcTo(39.61f, 39.61f, 0.0f, false, true, 220.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, 15.18f, -9.0f, 29.75f, -25.29f, 41.05f);
        pathBuilder.curveTo(177.05f, 197.27f, 153.36f, 204.0f, 128.0f, 204.0f);
        pathBuilder.reflectiveCurveToRelative(-49.0f, -6.73f, -66.71f, -18.95f);
        pathBuilder.curveTo(45.0f, 173.75f, 36.0f, 159.18f, 36.0f, 144.0f);
        pathBuilder.arcToRelative(39.74f, 39.74f, 0.0f, false, true, 2.84f, -14.64f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.93f, -15.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 49.71f, 97.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.94f, 3.18f);
        pathBuilder.lineToRelative(0.22f, -0.13f);
        pathBuilder.curveTo(82.94f, 89.68f, 105.0f, 84.0f, 128.0f, 84.0f);
        pathBuilder.lineTo(128.0f, 84.0f);
        pathBuilder.curveToRelative(23.0f, 0.0f, 45.0f, 5.69f, 62.09f, 16.0f);
        pathBuilder.lineToRelative(0.22f, 0.13f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 206.29f, 97.0f);
        pathBuilder.arcTo(11.88f, 11.88f, 0.0f, false, true, 216.0f, 92.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.09f, 22.34f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 148.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 88.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 128.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 188.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(167.48f, 168.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.0f, 15.0f);
        pathBuilder.arcToRelative(111.88f, 111.88f, 0.0f, false, true, -63.0f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.0f, -23.0f);
        pathBuilder.arcToRelative(88.12f, 88.12f, 0.0f, false, false, 49.0f, 0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 167.48f, 168.52f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _redditLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
