package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Filmslate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FilmSlate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFilmSlate", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_filmSlate", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilmslateKt {
    private static ImageVector _filmSlate;

    public static final ImageVector getFilmSlate(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 104.0f);
        pathBuilder.lineTo(102.09f, 104.0f);
        pathBuilder.lineTo(210.0f, 75.51f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.68f, -9.84f);
        pathBuilder.lineToRelative(-8.16f, -30.0f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, -19.42f, -11.13f);
        pathBuilder.lineTo(35.81f, 64.74f);
        pathBuilder.arcToRelative(15.75f, 15.75f, 0.0f, false, false, -9.7f, 7.4f);
        pathBuilder.arcToRelative(15.51f, 15.51f, 0.0f, false, false, -1.55f, 12.0f);
        pathBuilder.lineTo(32.0f, 111.56f);
        pathBuilder.curveToRelative(0.0f, 0.14f, 0.0f, 0.29f, 0.0f, 0.44f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(208.0f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(224.0f, 112.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.16f, 40.0f);
        pathBuilder.lineToRelative(6.0f, 22.07f);
        pathBuilder.lineToRelative(-22.62f, 6.0f);
        pathBuilder.lineTo(147.42f, 51.83f);
        pathBuilder.close();
        pathBuilder.moveTo(125.47f, 57.6f);
        pathBuilder.lineTo(153.59f, 73.84f);
        pathBuilder.lineTo(116.65f, 83.59f);
        pathBuilder.lineTo(88.53f, 67.37f);
        pathBuilder.close();
        pathBuilder.moveTo(46.07f, 102.22f);
        pathBuilder.lineTo(40.07f, 80.14f);
        pathBuilder.lineTo(66.57f, 73.14f);
        pathBuilder.lineTo(94.69f, 89.4f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 200.0f);
        pathBuilder.lineTo(48.0f, 200.0f);
        pathBuilder.lineTo(48.0f, 120.0f);
        pathBuilder.lineTo(208.0f, 120.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _filmSlate = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
