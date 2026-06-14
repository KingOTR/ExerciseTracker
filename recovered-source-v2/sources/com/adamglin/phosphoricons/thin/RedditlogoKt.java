package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Redditlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RedditLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getRedditLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_redditLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedditlogoKt {
    private static ImageVector _redditLogo;

    public static final ImageVector getRedditLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(244.0f, 104.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -48.3f, -19.28f);
        pathBuilder.curveToRelative(-17.9f, -10.11f, -40.0f, -15.94f, -63.0f, -16.65f);
        pathBuilder.lineToRelative(6.59f, -39.52f);
        pathBuilder.lineTo(164.0f, 32.36f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, false, 1.46f, -7.87f);
        pathBuilder.lineToRelative(-28.87f, -4.44f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.56f, 3.29f);
        pathBuilder.lineTo(124.6f, 68.05f);
        pathBuilder.curveToRelative(-23.48f, 0.52f, -46.06f, 6.36f, -64.3f, 16.67f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, false, 23.0f, 126.21f);
        pathBuilder.arcTo(55.14f, 55.14f, 0.0f, false, false, 20.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, 20.58f, 11.43f, 39.83f, 32.18f, 54.2f);
        pathBuilder.curveTo(72.49f, 212.26f, 99.42f, 220.0f, 128.0f, 220.0f);
        pathBuilder.reflectiveCurveToRelative(55.51f, -7.74f, 75.82f, -21.8f);
        pathBuilder.curveTo(224.57f, 183.83f, 236.0f, 164.58f, 236.0f, 144.0f);
        pathBuilder.arcToRelative(55.14f, 55.14f, 0.0f, false, false, -3.0f, -17.79f);
        pathBuilder.arcTo(28.14f, 28.14f, 0.0f, false, false, 244.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.53f, 126.25f);
        pathBuilder.arcTo(47.69f, 47.69f, 0.0f, false, true, 228.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, 37.5f, -44.86f, 68.0f, -100.0f, 68.0f);
        pathBuilder.reflectiveCurveTo(28.0f, 181.5f, 28.0f, 144.0f);
        pathBuilder.arcToRelative(47.71f, 47.71f, 0.0f, false, true, 3.45f, -17.72f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.62f, -5.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 26.35f, -29.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.19f, 1.13f);
        pathBuilder.lineToRelative(0.25f, -0.16f);
        pathBuilder.curveTo(80.0f, 82.11f, 103.51f, 76.0f, 128.0f, 76.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(24.48f, 0.0f, 48.0f, 6.11f, 66.37f, 17.21f);
        pathBuilder.lineToRelative(0.25f, 0.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.19f, -1.13f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 26.35f, 29.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 224.53f, 126.25f);
        pathBuilder.close();
        pathBuilder.moveTo(163.53f, 174.13f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.65f, 5.4f);
        pathBuilder.arcToRelative(72.22f, 72.22f, 0.0f, false, true, -67.76f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.76f, -7.06f);
        pathBuilder.arcToRelative(64.23f, 64.23f, 0.0f, false, false, 60.24f, 0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 163.53f, 174.13f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _redditLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
