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

/* compiled from: Wavesine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WaveSine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWaveSine", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_waveSine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WavesineKt {
    private static ImageVector _waveSine;

    public static final ImageVector getWaveSine(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _waveSine;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WaveSine", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(237.43f, 130.55f);
        pathBuilder.curveTo(215.84f, 176.57f, 197.0f, 198.0f, 178.0f, 198.0f);
        pathBuilder.curveToRelative(-23.83f, 0.0f, -39.2f, -32.76f, -55.47f, -67.45f);
        pathBuilder.curveTo(109.26f, 102.17f, 94.17f, 70.0f, 78.0f, 70.0f);
        pathBuilder.curveToRelative(-9.18f, 0.0f, -25.0f, 10.5f, -48.53f, 60.55f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.86f, -5.1f);
        pathBuilder.curveTo(40.16f, 79.43f, 59.0f, 58.0f, 78.0f, 58.0f);
        pathBuilder.curveToRelative(23.83f, 0.0f, 39.2f, 32.76f, 55.47f, 67.45f);
        pathBuilder.curveTo(146.74f, 153.83f, 161.83f, 186.0f, 178.0f, 186.0f);
        pathBuilder.curveToRelative(9.18f, 0.0f, 25.05f, -10.5f, 48.53f, -60.55f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.86f, 5.1f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _waveSine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
