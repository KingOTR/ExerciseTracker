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

/* compiled from: Subtitlesslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SubtitlesSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSubtitlesSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_subtitlesSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubtitlesslashKt {
    private static ImageVector _subtitlesSlash;

    public static final ImageVector getSubtitlesSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _subtitlesSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SubtitlesSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(53.92f, 34.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.48f, -0.37f);
        pathBuilder.arcToRelative(8.23f, 8.23f, 0.0f, false, false, -0.14f, 11.38f);
        pathBuilder.lineTo(44.46f, 48.0f);
        pathBuilder.lineTo(32.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 64.0f);
        pathBuilder.lineTo(16.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(189.92f, 208.0f);
        pathBuilder.lineToRelative(12.16f, 13.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.33f, 0.51f);
        pathBuilder.arcToRelative(8.31f, 8.31f, 0.0f, false, false, 0.3f, -11.51f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 128.0f);
        pathBuilder.horizontalLineToRelative(13.19f);
        pathBuilder.lineToRelative(14.54f, 16.0f);
        pathBuilder.lineTo(104.27f, 144.0f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 96.0f, 136.53f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 128.0f);
        pathBuilder.lineTo(72.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.53f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 71.73f, 144.0f);
        pathBuilder.lineTo(56.27f, 144.0f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 48.0f, 136.53f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 176.0f);
        pathBuilder.lineTo(56.27f, 176.0f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 48.0f, 168.53f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 160.0f);
        pathBuilder.horizontalLineToRelative(90.28f);
        pathBuilder.lineToRelative(11.9f, 13.09f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 64.0f);
        pathBuilder.lineTo(240.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -5.19f, 11.78f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.7f, -0.24f);
        pathBuilder.lineTo(175.0f, 144.0f);
        pathBuilder.horizontalLineToRelative(25.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, -8.25f, -7.47f);
        pathBuilder.horizontalLineToRelative(-39.3f);
        pathBuilder.lineTo(93.79f, 54.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -6.69f);
        pathBuilder.lineTo(224.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _subtitlesSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
