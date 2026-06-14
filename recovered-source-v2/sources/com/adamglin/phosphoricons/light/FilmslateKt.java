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

/* compiled from: Filmslate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FilmSlate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFilmSlate", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_filmSlate", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilmslateKt {
    private static ImageVector _filmSlate;

    public static final ImageVector getFilmSlate(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 106.0f);
        pathBuilder.lineTo(86.68f, 106.0f);
        pathBuilder.lineTo(209.53f, 73.57f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.26f, -7.38f);
        pathBuilder.lineToRelative(-8.16f, -30.0f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, -17.0f, -9.72f);
        pathBuilder.lineTo(36.32f, 66.67f);
        pathBuilder.arcToRelative(13.77f, 13.77f, 0.0f, false, false, -8.48f, 6.47f);
        pathBuilder.arcToRelative(13.57f, 13.57f, 0.0f, false, false, -1.36f, 10.42f);
        pathBuilder.lineTo(34.0f, 111.34f);
        pathBuilder.curveToRelative(0.0f, 0.22f, 0.0f, 0.44f, 0.0f, 0.66f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(208.0f, 214.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(222.0f, 112.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 106.0f);
        pathBuilder.close();
        pathBuilder.moveTo(125.75f, 55.48f);
        pathBuilder.lineToRelative(33.0f, 19.07f);
        pathBuilder.lineToRelative(-42.43f, 11.2f);
        pathBuilder.lineToRelative(-33.0f, -19.07f);
        pathBuilder.close();
        pathBuilder.moveTo(191.75f, 38.07f);
        pathBuilder.arcToRelative(1.92f, 1.92f, 0.0f, false, true, 2.34f, 1.26f);
        pathBuilder.lineToRelative(6.57f, 24.18f);
        pathBuilder.lineTo(175.26f, 70.2f);
        pathBuilder.lineToRelative(-33.0f, -19.07f);
        pathBuilder.close();
        pathBuilder.moveTo(38.23f, 79.14f);
        pathBuilder.arcToRelative(1.85f, 1.85f, 0.0f, false, true, 1.15f, -0.87f);
        pathBuilder.lineTo(66.86f, 71.0f);
        pathBuilder.lineToRelative(33.0f, 19.08f);
        pathBuilder.lineTo(44.66f, 104.68f);
        pathBuilder.lineToRelative(-6.6f, -24.27f);
        pathBuilder.arcTo(1.63f, 1.63f, 0.0f, false, true, 38.23f, 79.14f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 200.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(48.0f, 202.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(46.0f, 118.0f);
        pathBuilder.lineTo(210.0f, 118.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _filmSlate = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
