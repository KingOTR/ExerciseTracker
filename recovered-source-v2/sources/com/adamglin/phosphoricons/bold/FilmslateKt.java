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

/* compiled from: Filmslate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FilmSlate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFilmSlate", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_filmSlate", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilmslateKt {
    private static ImageVector _filmSlate;

    public static final ImageVector getFilmSlate(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 100.0f);
        pathBuilder.lineTo(132.92f, 100.0f);
        pathBuilder.lineToRelative(78.14f, -20.63f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.52f, -14.75f);
        pathBuilder.lineToRelative(-8.16f, -30.0f);
        pathBuilder.arcToRelative(19.94f, 19.94f, 0.0f, false, false, -24.3f, -13.95f);
        pathBuilder.lineTo(34.79f, 60.87f);
        pathBuilder.arcToRelative(19.74f, 19.74f, 0.0f, false, false, -12.14f, 9.27f);
        pathBuilder.arcToRelative(19.48f, 19.48f, 0.0f, false, false, -1.95f, 15.0f);
        pathBuilder.lineTo(28.0f, 112.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(208.0f, 220.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(228.0f, 112.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.89f, 61.91f);
        pathBuilder.lineToRelative(18.29f, 10.56f);
        pathBuilder.lineToRelative(-25.95f, 6.85f);
        pathBuilder.lineTo(98.94f, 68.76f);
        pathBuilder.close();
        pathBuilder.moveTo(189.34f, 44.91f);
        pathBuilder.lineTo(193.25f, 59.26f);
        pathBuilder.lineTo(176.12f, 63.78f);
        pathBuilder.lineTo(157.83f, 53.21f);
        pathBuilder.close();
        pathBuilder.moveTo(66.0f, 77.46f);
        pathBuilder.lineTo(84.29f, 88.0f);
        pathBuilder.lineToRelative(-35.4f, 9.35f);
        pathBuilder.lineTo(45.0f, 83.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 196.0f);
        pathBuilder.lineTo(52.0f, 196.0f);
        pathBuilder.lineTo(52.0f, 124.0f);
        pathBuilder.lineTo(204.0f, 124.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _filmSlate = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
