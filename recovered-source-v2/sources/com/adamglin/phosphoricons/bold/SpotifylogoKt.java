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

/* compiled from: Spotifylogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpotifyLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSpotifyLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spotifyLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotifylogoKt {
    private static ImageVector _spotifyLogo;

    public static final ImageVector getSpotifyLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _spotifyLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SpotifyLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f);
        pathBuilder.arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(194.59f, 127.64f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.24f, 4.93f);
        pathBuilder.arcToRelative(106.7f, 106.7f, 0.0f, false, false, -100.7f, 0.0f);
        pathBuilder.arcTo(11.83f, 11.83f, 0.0f, false, true, 72.0f, 134.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.66f, -22.58f);
        pathBuilder.arcToRelative(130.61f, 130.61f, 0.0f, false, true, 123.3f, 0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 194.59f, 127.64f);
        pathBuilder.close();
        pathBuilder.moveTo(178.59f, 163.64f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.23f, 5.0f);
        pathBuilder.arcToRelative(73.0f, 73.0f, 0.0f, false, false, -68.72f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.28f, -21.18f);
        pathBuilder.arcToRelative(97.0f, 97.0f, 0.0f, false, true, 91.28f, 0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 178.59f, 163.64f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spotifyLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
