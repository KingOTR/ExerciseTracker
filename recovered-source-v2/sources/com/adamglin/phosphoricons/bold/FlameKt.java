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

/* compiled from: Flame.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flame", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFlame", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flame", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlameKt {
    private static ImageVector _flame;

    public static final ImageVector getFlame(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _flame;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Flame", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.69f, 48.72f);
        pathBuilder.arcToRelative(225.0f, 225.0f, 0.0f, false, false, -42.52f, -35.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.34f, 0.0f);
        pathBuilder.arcToRelative(225.0f, 225.0f, 0.0f, false, false, -42.52f, 35.0f);
        pathBuilder.curveTo(51.0f, 78.47f, 36.0f, 111.42f, 36.0f, 144.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f);
        pathBuilder.curveTo(220.0f, 111.42f, 205.0f, 78.47f, 176.69f, 48.72f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, -13.33f, 5.53f, -26.26f, 16.45f, -38.45f);
        pathBuilder.arcTo(93.0f, 93.0f, 0.0f, false, true, 128.0f, 134.72f);
        pathBuilder.arcToRelative(93.0f, 93.0f, 0.0f, false, true, 11.55f, 10.83f);
        pathBuilder.curveTo(150.47f, 157.74f, 156.0f, 170.67f, 156.0f, 184.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(179.84f, 187.94f);
        pathBuilder.curveToRelative(0.09f, -1.3f, 0.16f, -2.61f, 0.16f, -3.94f);
        pathBuilder.curveToRelative(0.0f, -46.26f, -44.0f, -73.17f, -45.83f, -74.29f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.34f, 0.0f);
        pathBuilder.curveTo(120.0f, 110.83f, 76.0f, 137.74f, 76.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, 1.33f, 0.07f, 2.64f, 0.16f, 3.94f);
        pathBuilder.arcTo(67.68f, 67.68f, 0.0f, false, true, 60.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -26.52f, 12.21f, -52.86f, 36.28f, -78.3f);
        pathBuilder.arcTo(213.07f, 213.07f, 0.0f, false, true, 128.0f, 38.39f);
        pathBuilder.curveTo(145.82f, 50.86f, 196.0f, 90.71f, 196.0f, 144.0f);
        pathBuilder.arcTo(67.68f, 67.68f, 0.0f, false, true, 179.84f, 187.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flame = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
