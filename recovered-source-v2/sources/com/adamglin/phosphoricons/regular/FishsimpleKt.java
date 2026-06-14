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

/* compiled from: Fishsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FishSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFishSimple", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fishSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FishsimpleKt {
    private static ImageVector _fishSimple;

    public static final ImageVector getFishSimple(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _fishSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FishSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 155.08f);
        pathBuilder.curveToRelative(-15.08f, 20.84f, -37.53f, 34.88f, -66.7f, 41.74f);
        pathBuilder.curveToRelative(-20.08f, 4.72f, -43.54f, 6.0f, -70.12f, 3.93f);
        pathBuilder.quadToRelative(2.4f, 17.82f, 6.72f, 37.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.1f, 9.52f);
        pathBuilder.arcToRelative(7.81f, 7.81f, 0.0f, false, true, -1.72f, 0.19f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.81f, -6.29f);
        pathBuilder.quadToRelative(-4.89f, -22.36f, -7.41f, -42.62f);
        pathBuilder.quadToRelative(-20.22f, -2.51f, -42.58f, -7.41f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.43f, -15.63f);
        pathBuilder.quadToRelative(19.7f, 4.32f, 37.5f, 6.73f);
        pathBuilder.curveToRelative(-2.09f, -26.56f, -0.78f, -50.0f, 3.93f, -70.06f);
        pathBuilder.curveTo(66.0f, 83.55f, 80.05f, 61.1f, 100.88f, 46.0f);
        pathBuilder.curveTo(115.0f, 35.76f, 140.15f, 23.64f, 179.27f, 24.0f);
        pathBuilder.curveToRelative(21.19f, 0.21f, 40.83f, 4.33f, 43.81f, 6.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.83f, 2.83f);
        pathBuilder.curveToRelative(1.75f, 3.0f, 5.87f, 22.59f, 6.08f, 43.78f);
        pathBuilder.curveTo(232.21f, 98.31f, 228.57f, 129.44f, 210.0f, 155.08f);
        pathBuilder.close();
        pathBuilder.moveTo(186.24f, 157.88f);
        pathBuilder.arcTo(112.07f, 112.07f, 0.0f, false, true, 98.12f, 69.74f);
        pathBuilder.curveTo(75.64f, 94.0f, 66.7f, 132.47f, 71.36f, 184.6f);
        pathBuilder.curveTo(123.51f, 189.28f, 162.0f, 180.35f, 186.25f, 157.88f);
        pathBuilder.close();
        pathBuilder.moveTo(212.44f, 43.56f);
        pathBuilder.arcToRelative(175.75f, 175.75f, 0.0f, false, false, -39.22f, -3.51f);
        pathBuilder.curveToRelative(-24.34f, 0.64f, -44.71f, 6.49f, -60.76f, 17.39f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, false, 86.09f, 86.1f);
        pathBuilder.curveToRelative(10.91f, -16.0f, 16.76f, -36.42f, 17.4f, -60.76f);
        pathBuilder.arcTo(175.82f, 175.82f, 0.0f, false, false, 212.44f, 43.56f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fishSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
