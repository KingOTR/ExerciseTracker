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

/* compiled from: Youtubelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"YoutubeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getYoutubeLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_youtubeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YoutubelogoKt {
    private static ImageVector _youtubeLogo;

    public static final ImageVector getYoutubeLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(226.59f, 71.53f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.63f, -11.0f);
        pathBuilder.curveTo(183.48f, 47.65f, 128.0f, 48.0f, 128.0f, 48.0f);
        pathBuilder.reflectiveCurveToRelative(-55.48f, -0.35f, -89.0f, 12.58f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.63f, 11.0f);
        pathBuilder.curveTo(27.07f, 80.54f, 24.0f, 98.09f, 24.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(3.07f, 47.46f, 5.41f, 56.47f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 39.0f, 195.42f);
        pathBuilder.curveTo(72.52f, 208.35f, 128.0f, 208.0f, 128.0f, 208.0f);
        pathBuilder.reflectiveCurveToRelative(55.48f, 0.35f, 89.0f, -12.58f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.63f, -10.95f);
        pathBuilder.curveToRelative(2.34f, -9.0f, 5.41f, -26.56f, 5.41f, -56.47f);
        pathBuilder.reflectiveCurveTo(228.93f, 80.54f, 226.59f, 71.53f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 160.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.lineToRelative(48.0f, 32.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(164.44f, 121.34f);
        pathBuilder2.lineToRelative(-48.0f, -32.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 96.0f);
        pathBuilder2.verticalLineToRelative(64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.44f, 6.66f);
        pathBuilder2.lineToRelative(48.0f, -32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 145.05f);
        pathBuilder2.lineTo(120.0f, 111.0f);
        pathBuilder2.lineToRelative(25.58f, 17.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(234.33f, 69.52f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -14.49f, -16.4f);
        pathBuilder2.curveTo(185.56f, 39.88f, 131.0f, 40.0f, 128.0f, 40.0f);
        pathBuilder2.reflectiveCurveToRelative(-57.56f, -0.12f, -91.84f, 13.12f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -14.49f, 16.4f);
        pathBuilder2.curveTo(19.08f, 79.5f, 16.0f, 97.74f, 16.0f, 128.0f);
        pathBuilder2.reflectiveCurveToRelative(3.08f, 48.5f, 5.67f, 58.48f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 14.49f, 16.41f);
        pathBuilder2.curveTo(69.0f, 215.56f, 120.4f, 216.0f, 127.34f, 216.0f);
        pathBuilder2.horizontalLineToRelative(1.32f);
        pathBuilder2.curveToRelative(6.94f, 0.0f, 58.37f, -0.44f, 91.18f, -13.11f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 14.49f, -16.41f);
        pathBuilder2.curveToRelative(2.59f, -10.0f, 5.67f, -28.22f, 5.67f, -58.48f);
        pathBuilder2.reflectiveCurveTo(236.92f, 79.5f, 234.33f, 69.52f);
        pathBuilder2.close();
        pathBuilder2.moveTo(218.84f, 182.52f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.77f, 5.49f);
        pathBuilder2.curveToRelative(-31.65f, 12.22f, -85.48f, 12.0f, -86.12f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-54.37f, 0.18f, -86.0f, -12.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.77f, -5.49f);
        pathBuilder2.curveTo(34.8f, 173.39f, 32.0f, 156.57f, 32.0f, 128.0f);
        pathBuilder2.reflectiveCurveToRelative(2.8f, -45.39f, 5.16f, -54.47f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 41.93f, 68.0f);
        pathBuilder2.curveTo(73.58f, 55.82f, 127.4f, 56.0f, 128.05f, 56.0f);
        pathBuilder2.reflectiveCurveToRelative(54.37f, -0.18f, 86.0f, 12.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.77f, 5.49f);
        pathBuilder2.curveTo(221.2f, 82.61f, 224.0f, 99.43f, 224.0f, 128.0f);
        pathBuilder2.reflectiveCurveTo(221.2f, 173.39f, 218.84f, 182.47f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _youtubeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
