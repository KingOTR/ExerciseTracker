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

/* compiled from: Wavesine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WaveSine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getWaveSine", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_waveSine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WavesineKt {
    private static ImageVector _waveSine;

    public static final ImageVector getWaveSine(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(239.24f, 131.4f);
        pathBuilder.curveToRelative(-22.0f, 46.8f, -41.4f, 68.6f, -61.2f, 68.6f);
        pathBuilder.curveToRelative(-25.1f, 0.0f, -40.73f, -33.32f, -57.28f, -68.6f);
        pathBuilder.curveTo(107.7f, 103.56f, 92.9f, 72.0f, 78.0f, 72.0f);
        pathBuilder.curveToRelative(-16.4f, 0.0f, -36.31f, 37.21f, -46.72f, 59.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.48f, -6.8f);
        pathBuilder.curveTo(38.71f, 77.8f, 58.16f, 56.0f, 78.0f, 56.0f);
        pathBuilder.curveToRelative(25.1f, 0.0f, 40.73f, 33.32f, 57.28f, 68.6f);
        pathBuilder.curveTo(148.3f, 152.44f, 163.1f, 184.0f, 178.0f, 184.0f);
        pathBuilder.curveToRelative(16.4f, 0.0f, 36.31f, -37.21f, 46.72f, -59.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.48f, 6.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _waveSine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
