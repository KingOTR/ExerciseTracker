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

/* compiled from: Filmslate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FilmSlate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFilmSlate", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_filmSlate", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilmslateKt {
    private static ImageVector _filmSlate;

    public static final ImageVector getFilmSlate(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.horizontalLineTo(102.09f);
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
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineTo(112.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.16f, 40.0f);
        pathBuilder.lineToRelative(6.0f, 22.07f);
        pathBuilder.lineTo(164.57f, 71.0f);
        pathBuilder.lineTo(136.44f, 54.72f);
        pathBuilder.close();
        pathBuilder.moveTo(77.55f, 70.27f);
        pathBuilder.lineToRelative(28.12f, 16.24f);
        pathBuilder.lineToRelative(-59.6f, 15.73f);
        pathBuilder.lineToRelative(-6.0f, -22.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _filmSlate = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
