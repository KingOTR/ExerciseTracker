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

/* compiled from: Youtubelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"YoutubeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getYoutubeLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_youtubeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YoutubelogoKt {
    private static ImageVector _youtubeLogo;

    public static final ImageVector getYoutubeLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(170.49f, 117.91f);
        pathBuilder.lineToRelative(-56.0f, -36.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 92.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.49f, 10.09f);
        pathBuilder.lineToRelative(56.0f, -36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -20.18f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 142.0f);
        pathBuilder.lineTo(120.0f, 114.0f);
        pathBuilder.lineToRelative(21.81f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(238.21f, 68.5f);
        pathBuilder.arcToRelative(28.05f, 28.05f, 0.0f, false, false, -16.93f, -19.14f);
        pathBuilder.curveTo(186.4f, 35.91f, 131.29f, 36.0f, 128.0f, 36.0f);
        pathBuilder.reflectiveCurveToRelative(-58.4f, -0.09f, -93.28f, 13.38f);
        pathBuilder.arcTo(28.05f, 28.05f, 0.0f, false, false, 17.79f, 68.52f);
        pathBuilder.curveTo(15.15f, 78.72f, 12.0f, 97.32f, 12.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(3.15f, 49.28f, 5.79f, 59.48f);
        pathBuilder.arcToRelative(28.05f, 28.05f, 0.0f, false, false, 16.93f, 19.14f);
        pathBuilder.curveTo(68.21f, 219.55f, 120.36f, 220.0f, 127.37f, 220.0f);
        pathBuilder.horizontalLineToRelative(1.26f);
        pathBuilder.curveToRelative(7.0f, 0.0f, 59.16f, -0.45f, 92.65f, -13.38f);
        pathBuilder.arcToRelative(28.05f, 28.05f, 0.0f, false, false, 16.93f, -19.14f);
        pathBuilder.curveToRelative(2.64f, -10.2f, 5.79f, -28.8f, 5.79f, -59.48f);
        pathBuilder.reflectiveCurveTo(240.85f, 78.72f, 238.21f, 68.52f);
        pathBuilder.close();
        pathBuilder.moveTo(215.0f, 181.46f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.34f, 2.77f);
        pathBuilder.curveTo(182.78f, 195.76f, 132.27f, 196.0f, 128.32f, 196.0f);
        pathBuilder.horizontalLineToRelative(-0.39f);
        pathBuilder.curveToRelative(-0.53f, 0.0f, -53.64f, 0.17f, -84.56f, -11.77f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 41.0f, 181.46f);
        pathBuilder.curveToRelative(-1.88f, -7.24f, -5.0f, -23.82f, -5.0f, -53.46f);
        pathBuilder.reflectiveCurveToRelative(3.15f, -46.22f, 5.0f, -53.46f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.34f, -2.77f);
        pathBuilder.curveTo(74.29f, 59.83f, 127.39f, 60.0f, 127.92f, 60.0f);
        pathBuilder.horizontalLineToRelative(0.15f);
        pathBuilder.curveToRelative(0.54f, 0.0f, 53.64f, -0.17f, 84.56f, 11.77f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 215.0f, 74.54f);
        pathBuilder.curveToRelative(1.88f, 7.24f, 5.0f, 23.82f, 5.0f, 53.46f);
        pathBuilder.reflectiveCurveTo(216.85f, 174.22f, 215.0f, 181.46f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _youtubeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
