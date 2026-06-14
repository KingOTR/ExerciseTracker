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

/* compiled from: Aperture.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Aperture", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAperture", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_aperture", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApertureKt {
    private static ImageVector _aperture;

    public static final ImageVector getAperture(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _aperture;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Aperture", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.12f, 55.88f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, false, false, 55.87f, 200.12f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 200.12f, 55.88f);
        pathBuilder.close();
        pathBuilder.moveTo(98.12f, 122.55f);
        pathBuilder.lineTo(117.77f, 99.41f);
        pathBuilder.lineTo(147.63f, 104.87f);
        pathBuilder.lineTo(157.84f, 133.45f);
        pathBuilder.lineTo(138.19f, 156.59f);
        pathBuilder.lineTo(108.33f, 151.13f);
        pathBuilder.close();
        pathBuilder.moveTo(209.93f, 90.69f);
        pathBuilder.arcToRelative(90.24f, 90.24f, 0.0f, false, true, -2.0f, 78.63f);
        pathBuilder.lineToRelative(-56.14f, -10.24f);
        pathBuilder.close();
        pathBuilder.moveTo(203.77f, 79.41f);
        pathBuilder.lineTo(166.83f, 122.89f);
        pathBuilder.lineTo(136.66f, 38.42f);
        pathBuilder.arcToRelative(89.31f, 89.31f, 0.0f, false, true, 55.0f, 25.94f);
        pathBuilder.arcTo(91.33f, 91.33f, 0.0f, false, true, 203.77f, 79.41f);
        pathBuilder.close();
        pathBuilder.moveTo(64.36f, 64.41f);
        pathBuilder.arcTo(89.37f, 89.37f, 0.0f, false, true, 123.81f, 38.1f);
        pathBuilder.lineTo(143.0f, 91.82f);
        pathBuilder.lineTo(54.75f, 75.71f);
        pathBuilder.arcTo(91.2f, 91.2f, 0.0f, false, true, 64.36f, 64.36f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 86.68f);
        pathBuilder.lineToRelative(56.14f, 10.24f);
        pathBuilder.lineTo(46.07f, 165.31f);
        pathBuilder.arcToRelative(90.24f, 90.24f, 0.0f, false, true, 2.0f, -78.63f);
        pathBuilder.close();
        pathBuilder.moveTo(52.21f, 176.59f);
        pathBuilder.lineTo(89.15f, 133.11f);
        pathBuilder.lineTo(119.32f, 217.58f);
        pathBuilder.arcToRelative(89.31f, 89.31f, 0.0f, false, true, -55.0f, -25.94f);
        pathBuilder.arcTo(91.33f, 91.33f, 0.0f, false, true, 52.23f, 176.59f);
        pathBuilder.close();
        pathBuilder.moveTo(191.62f, 191.59f);
        pathBuilder.arcToRelative(89.32f, 89.32f, 0.0f, false, true, -59.45f, 26.26f);
        pathBuilder.lineTo(113.0f, 164.18f);
        pathBuilder.lineToRelative(88.24f, 16.11f);
        pathBuilder.arcTo(91.2f, 91.2f, 0.0f, false, true, 191.64f, 191.64f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _aperture = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
