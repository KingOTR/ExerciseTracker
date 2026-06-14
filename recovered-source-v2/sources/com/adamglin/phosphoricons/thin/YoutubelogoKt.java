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

/* compiled from: Youtubelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"YoutubeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getYoutubeLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_youtubeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YoutubelogoKt {
    private static ImageVector _youtubeLogo;

    public static final ImageVector getYoutubeLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _youtubeLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("YoutubeLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(162.22f, 124.67f);
        pathBuilder.lineToRelative(-48.0f, -32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.11f, 3.53f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.11f, -0.2f);
        pathBuilder.lineToRelative(48.0f, -32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.66f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 152.53f);
        pathBuilder.lineTo(116.0f, 103.47f);
        pathBuilder.lineTo(152.79f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.46f, 70.53f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 218.4f, 56.85f);
        pathBuilder.curveTo(184.6f, 43.79f, 130.27f, 44.0f, 128.0f, 44.0f);
        pathBuilder.reflectiveCurveTo(71.4f, 43.79f, 37.6f, 56.85f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 25.54f, 70.52f);
        pathBuilder.curveTo(23.0f, 80.27f, 20.0f, 98.16f, 20.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 47.73f, 5.54f, 57.48f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 37.6f, 199.15f);
        pathBuilder.curveTo(71.4f, 212.21f, 125.73f, 212.0f, 128.0f, 212.0f);
        pathBuilder.horizontalLineToRelative(0.71f);
        pathBuilder.curveToRelative(6.89f, 0.0f, 57.58f, -0.43f, 89.72f, -12.85f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 12.06f, -13.67f);
        pathBuilder.curveTo(233.0f, 175.72f, 236.0f, 157.84f, 236.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(233.0f, 80.27f, 230.46f, 70.52f);
        pathBuilder.close();
        pathBuilder.moveTo(222.72f, 183.53f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.21f, 8.22f);
        pathBuilder.curveTo(183.14f, 204.19f, 128.57f, 204.0f, 128.0f, 204.0f);
        pathBuilder.reflectiveCurveToRelative(-55.11f, 0.19f, -87.48f, -12.31f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.21f, -8.22f);
        pathBuilder.curveTo(30.87f, 174.17f, 28.0f, 157.0f, 28.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(2.87f, -46.17f, 5.28f, -55.47f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.21f, -8.22f);
        pathBuilder.curveTo(72.86f, 51.81f, 127.43f, 52.0f, 128.0f, 52.0f);
        pathBuilder.reflectiveCurveToRelative(55.11f, -0.2f, 87.48f, 12.31f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.21f, 8.22f);
        pathBuilder.curveTo(225.13f, 81.83f, 228.0f, 99.0f, 228.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(225.13f, 174.17f, 222.72f, 183.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _youtubeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
