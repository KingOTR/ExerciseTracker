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

/* compiled from: Wavesine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WaveSine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getWaveSine", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_waveSine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WavesineKt {
    private static ImageVector _waveSine;

    public static final ImageVector getWaveSine(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(242.86f, 133.1f);
        pathBuilder.curveToRelative(-23.0f, 49.0f, -43.0f, 70.9f, -64.82f, 70.9f);
        pathBuilder.curveToRelative(-27.64f, 0.0f, -43.8f, -34.44f, -60.9f, -70.9f);
        pathBuilder.curveTo(110.0f, 117.78f, 102.53f, 102.0f, 94.92f, 90.73f);
        pathBuilder.curveTo(88.39f, 81.09f, 82.53f, 76.0f, 78.0f, 76.0f);
        pathBuilder.curveToRelative(-3.82f, 0.0f, -18.24f, 4.12f, -43.09f, 57.1f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -21.73f, -10.2f);
        pathBuilder.curveToRelative(23.0f, -49.0f, 43.0f, -70.9f, 64.82f, -70.9f);
        pathBuilder.curveToRelative(27.64f, 0.0f, 43.8f, 34.44f, 60.9f, 70.9f);
        pathBuilder.curveToRelative(7.19f, 15.32f, 14.61f, 31.15f, 22.22f, 42.37f);
        pathBuilder.curveToRelative(6.53f, 9.64f, 12.39f, 14.73f, 17.0f, 14.73f);
        pathBuilder.curveToRelative(3.82f, 0.0f, 18.24f, -4.12f, 43.09f, -57.1f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 21.73f, 10.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _waveSine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
