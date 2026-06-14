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

/* compiled from: Spiral.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Spiral", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSpiral", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spiral", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpiralKt {
    private static ImageVector _spiral;

    public static final ImageVector getSpiral(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _spiral;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Spiral", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.0f, 144.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.arcToRelative(98.11f, 98.11f, 0.0f, false, false, -98.0f, -98.0f);
        pathBuilder.arcToRelative(90.1f, 90.1f, 0.0f, false, false, -90.0f, 90.0f);
        pathBuilder.arcToRelative(82.1f, 82.1f, 0.0f, false, false, 82.0f, 82.0f);
        pathBuilder.arcToRelative(74.09f, 74.09f, 0.0f, false, false, 74.0f, -74.0f);
        pathBuilder.arcToRelative(66.08f, 66.08f, 0.0f, false, false, -66.0f, -66.0f);
        pathBuilder.arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, 58.0f);
        pathBuilder.arcToRelative(50.06f, 50.06f, 0.0f, false, false, 50.0f, 50.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, false, 42.0f, -42.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, -34.0f, -34.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, -26.0f, 26.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, 18.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, 22.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, -30.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, 38.0f, -38.0f);
        pathBuilder.arcToRelative(46.06f, 46.06f, 0.0f, false, true, 46.0f, 46.0f);
        pathBuilder.arcToRelative(54.06f, 54.06f, 0.0f, false, true, -54.0f, 54.0f);
        pathBuilder.arcToRelative(62.07f, 62.07f, 0.0f, false, true, -62.0f, -62.0f);
        pathBuilder.arcToRelative(70.08f, 70.08f, 0.0f, false, true, 70.0f, -70.0f);
        pathBuilder.arcToRelative(78.09f, 78.09f, 0.0f, false, true, 78.0f, 78.0f);
        pathBuilder.arcToRelative(86.1f, 86.1f, 0.0f, false, true, -86.0f, 86.0f);
        pathBuilder.arcToRelative(94.11f, 94.11f, 0.0f, false, true, -94.0f, -94.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, true, 136.0f, 34.0f);
        pathBuilder.arcTo(110.13f, 110.13f, 0.0f, false, true, 246.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spiral = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
