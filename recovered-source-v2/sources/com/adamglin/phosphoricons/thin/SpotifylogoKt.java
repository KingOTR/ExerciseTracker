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

/* compiled from: Spotifylogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpotifyLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSpotifyLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spotifyLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotifylogoKt {
    private static ImageVector _spotifyLogo;

    public static final ImageVector getSpotifyLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f);
        pathBuilder.arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(155.54f, 167.87f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.41f, 1.67f);
        pathBuilder.arcToRelative(46.73f, 46.73f, 0.0f, false, false, -44.26f, 0.0f);
        pathBuilder.arcTo(4.07f, 4.07f, 0.0f, false, true, 104.0f, 170.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.87f, -7.54f);
        pathBuilder.arcToRelative(55.39f, 55.39f, 0.0f, false, true, 51.74f, 0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 155.54f, 167.87f);
        pathBuilder.close();
        pathBuilder.moveTo(187.54f, 111.87f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.41f, 1.65f);
        pathBuilder.arcToRelative(114.67f, 114.67f, 0.0f, false, false, -108.24f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.76f, -7.06f);
        pathBuilder.arcToRelative(122.65f, 122.65f, 0.0f, false, true, 115.76f, 0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 187.53f, 111.87f);
        pathBuilder.close();
        pathBuilder.moveTo(171.54f, 139.87f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.41f, 1.65f);
        pathBuilder.arcToRelative(81.0f, 81.0f, 0.0f, false, false, -76.24f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.76f, -7.06f);
        pathBuilder.arcToRelative(89.0f, 89.0f, 0.0f, false, true, 83.76f, 0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 171.53f, 139.88f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spotifyLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
