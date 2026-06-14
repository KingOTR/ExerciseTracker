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

/* compiled from: Eggcrack.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EggCrack", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getEggCrack", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eggCrack", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EggcrackKt {
    private static ImageVector _eggCrack;

    public static final ImageVector getEggCrack(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _eggCrack;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EggCrack", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(186.66f, 59.56f);
        pathBuilder.curveTo(168.47f, 32.29f, 146.54f, 16.0f, 128.0f, 16.0f);
        pathBuilder.reflectiveCurveTo(87.53f, 32.29f, 69.34f, 59.56f);
        pathBuilder.curveTo(50.7f, 87.54f, 40.0f, 121.23f, 40.0f, 152.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f);
        pathBuilder.curveTo(216.0f, 121.23f, 205.3f, 87.54f, 186.66f, 59.56f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 224.0f);
        pathBuilder.arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f);
        pathBuilder.curveToRelative(0.0f, -27.69f, 9.72f, -58.15f, 26.66f, -83.56f);
        pathBuilder.curveTo(97.19f, 46.64f, 115.41f, 32.0f, 128.0f, 32.0f);
        pathBuilder.curveToRelative(9.5f, 0.0f, 22.2f, 8.33f, 34.1f, 21.78f);
        pathBuilder.lineTo(122.0f, 98.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 13.09f);
        pathBuilder.lineToRelative(24.6f, 6.15f);
        pathBuilder.lineToRelative(-6.5f, 32.52f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.27f, 9.41f);
        pathBuilder.arcTo(7.77f, 7.77f, 0.0f, false, false, 152.0f, 160.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.83f, -6.43f);
        pathBuilder.lineToRelative(8.0f, -40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.9f, -9.33f);
        pathBuilder.lineToRelative(-19.16f, -4.79f);
        pathBuilder.lineTo(172.1f, 66.6f);
        pathBuilder.curveToRelative(0.42f, 0.61f, 0.83f, 1.22f, 1.24f, 1.84f);
        pathBuilder.curveTo(190.28f, 93.85f, 200.0f, 124.31f, 200.0f, 152.0f);
        pathBuilder.arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 224.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eggCrack = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
