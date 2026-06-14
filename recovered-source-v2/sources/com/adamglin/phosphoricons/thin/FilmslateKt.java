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

/* compiled from: Filmslate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FilmSlate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFilmSlate", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_filmSlate", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilmslateKt {
    private static ImageVector _filmSlate;

    public static final ImageVector getFilmSlate(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _filmSlate;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FilmSlate", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 108.0f);
        pathBuilder.lineTo(71.26f, 108.0f);
        pathBuilder.lineTo(209.0f, 71.64f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.84f, -4.92f);
        pathBuilder.lineToRelative(-8.16f, -30.0f);
        pathBuilder.arcToRelative(11.92f, 11.92f, 0.0f, false, false, -14.54f, -8.31f);
        pathBuilder.lineTo(36.83f, 68.61f);
        pathBuilder.arcToRelative(11.78f, 11.78f, 0.0f, false, false, -7.26f, 5.53f);
        pathBuilder.arcTo(11.59f, 11.59f, 0.0f, false, false, 28.41f, 83.0f);
        pathBuilder.lineToRelative(7.67f, 28.19f);
        pathBuilder.arcTo(3.87f, 3.87f, 0.0f, false, false, 36.0f, 112.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(208.0f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(220.0f, 112.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(126.0f, 53.33f);
        pathBuilder.lineToRelative(38.0f, 21.92f);
        pathBuilder.lineTo(116.08f, 87.9f);
        pathBuilder.lineTo(78.12f, 66.0f);
        pathBuilder.close();
        pathBuilder.moveTo(191.16f, 36.13f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.0f, -0.13f);
        pathBuilder.arcTo(3.88f, 3.88f, 0.0f, false, true, 196.0f, 38.81f);
        pathBuilder.lineToRelative(7.1f, 26.12f);
        pathBuilder.lineTo(175.0f, 72.35f);
        pathBuilder.lineTo(137.0f, 50.43f);
        pathBuilder.close();
        pathBuilder.moveTo(36.46f, 78.13f);
        pathBuilder.arcToRelative(3.86f, 3.86f, 0.0f, false, true, 2.37f, -1.8f);
        pathBuilder.lineToRelative(28.27f, -7.46f);
        pathBuilder.lineToRelative(38.0f, 21.91f);
        pathBuilder.lineTo(43.25f, 107.12f);
        pathBuilder.lineTo(36.13f, 80.94f);
        pathBuilder.arcTo(3.66f, 3.66f, 0.0f, false, true, 36.5f, 78.14f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(48.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(44.0f, 116.0f);
        pathBuilder.lineTo(212.0f, 116.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _filmSlate = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
