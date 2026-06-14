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

/* compiled from: Youtubelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"YoutubeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getYoutubeLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_youtubeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YoutubelogoKt {
    private static ImageVector _youtubeLogo;

    public static final ImageVector getYoutubeLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(163.33f, 123.0f);
        pathBuilder.lineToRelative(-48.0f, -32.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 106.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.33f, 5.0f);
        pathBuilder.lineToRelative(48.0f, -32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(118.0f, 148.79f);
        pathBuilder.verticalLineTo(107.21f);
        pathBuilder.lineTo(149.18f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.4f, 70.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, -13.28f, -15.0f);
        pathBuilder.curveTo(185.0f, 41.79f, 130.27f, 42.0f, 128.0f, 42.0f);
        pathBuilder.reflectiveCurveToRelative(-57.0f, -0.21f, -91.16f, 13.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 23.6f, 70.0f);
        pathBuilder.curveTo(21.05f, 79.89f, 18.0f, 98.0f, 18.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(3.05f, 48.11f, 5.6f, 58.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 13.28f, 15.0f);
        pathBuilder.curveTo(71.0f, 214.21f, 125.72f, 214.0f, 128.0f, 214.0f);
        pathBuilder.horizontalLineToRelative(0.71f);
        pathBuilder.curveToRelative(6.91f, 0.0f, 58.0f, -0.44f, 90.45f, -13.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 13.28f, -15.0f);
        pathBuilder.curveToRelative(2.55f, -9.87f, 5.6f, -27.93f, 5.6f, -58.0f);
        pathBuilder.reflectiveCurveTo(235.0f, 79.89f, 232.4f, 70.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.78f, 183.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -6.0f, 6.86f);
        pathBuilder.curveTo(182.78f, 202.19f, 128.58f, 202.0f, 128.0f, 202.0f);
        pathBuilder.reflectiveCurveToRelative(-54.71f, 0.2f, -86.75f, -12.17f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -6.0f, -6.86f);
        pathBuilder.curveTo(32.84f, 173.78f, 30.0f, 156.78f, 30.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(2.84f, -45.78f, 5.22f, -55.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 6.0f, -6.86f);
        pathBuilder.curveTo(72.06f, 54.26f, 123.53f, 54.0f, 127.76f, 54.0f);
        pathBuilder.horizontalLineTo(128.0f);
        pathBuilder.curveToRelative(0.54f, 0.0f, 54.71f, -0.2f, 86.75f, 12.17f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 6.0f, 6.86f);
        pathBuilder.curveToRelative(2.38f, 9.19f, 5.22f, 26.19f, 5.22f, 55.0f);
        pathBuilder.reflectiveCurveTo(223.16f, 173.78f, 220.78f, 183.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _youtubeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
