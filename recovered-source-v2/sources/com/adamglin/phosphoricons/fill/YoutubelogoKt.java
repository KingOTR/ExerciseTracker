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

/* compiled from: Youtubelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"YoutubeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getYoutubeLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_youtubeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YoutubelogoKt {
    private static ImageVector _youtubeLogo;

    public static final ImageVector getYoutubeLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(234.33f, 69.52f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -14.49f, -16.4f);
        pathBuilder.curveTo(185.56f, 39.88f, 131.0f, 40.0f, 128.0f, 40.0f);
        pathBuilder.reflectiveCurveToRelative(-57.56f, -0.12f, -91.84f, 13.12f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -14.49f, 16.4f);
        pathBuilder.curveTo(19.08f, 79.5f, 16.0f, 97.74f, 16.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(3.08f, 48.5f, 5.67f, 58.48f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 14.49f, 16.41f);
        pathBuilder.curveTo(69.0f, 215.56f, 120.4f, 216.0f, 127.34f, 216.0f);
        pathBuilder.horizontalLineToRelative(1.32f);
        pathBuilder.curveToRelative(6.94f, 0.0f, 58.37f, -0.44f, 91.18f, -13.11f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 14.49f, -16.41f);
        pathBuilder.curveToRelative(2.59f, -10.0f, 5.67f, -28.22f, 5.67f, -58.48f);
        pathBuilder.reflectiveCurveTo(236.92f, 79.5f, 234.33f, 69.52f);
        pathBuilder.close();
        pathBuilder.moveTo(160.59f, 134.52f);
        pathBuilder.lineTo(120.59f, 162.52f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 108.0f, 156.0f);
        pathBuilder.lineTo(108.0f, 100.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.59f, -6.55f);
        pathBuilder.lineToRelative(40.0f, 28.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 13.1f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _youtubeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
