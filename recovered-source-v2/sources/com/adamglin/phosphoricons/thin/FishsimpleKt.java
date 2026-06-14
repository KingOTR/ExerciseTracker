package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fishsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FishSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFishSimple", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fishSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FishsimpleKt {
    private static ImageVector _fishSimple;

    public static final ImageVector getFishSimple(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(164.0f, 76.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 164.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(206.77f, 152.73f);
        pathBuilder.curveToRelative(-14.5f, 20.0f, -36.17f, 33.57f, -64.38f, 40.2f);
        pathBuilder.curveToRelative(-20.91f, 4.91f, -45.61f, 6.0f, -73.8f, 3.42f);
        pathBuilder.quadToRelative(2.46f, 20.18f, 7.41f, 42.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 4.77f);
        pathBuilder.arcToRelative(4.19f, 4.19f, 0.0f, false, true, -0.86f, 0.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, -3.14f);
        pathBuilder.arcToRelative(457.0f, 457.0f, 0.0f, false, true, -7.72f, -45.36f);
        pathBuilder.quadToRelative(-21.4f, -2.49f, -45.33f, -7.72f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, true, true, 16.86f, 180.0f);
        pathBuilder.quadToRelative(22.59f, 4.95f, 42.76f, 7.41f);
        pathBuilder.curveToRelative(-2.62f, -28.16f, -1.48f, -52.84f, 3.43f, -73.73f);
        pathBuilder.curveToRelative(6.63f, -28.21f, 20.14f, -49.88f, 40.18f, -64.39f);
        pathBuilder.curveTo(127.32f, 31.8f, 156.61f, 28.0f, 177.53f, 28.0f);
        pathBuilder.horizontalLineToRelative(1.71f);
        pathBuilder.curveToRelative(22.0f, 0.21f, 40.12f, 4.54f, 41.81f, 5.53f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 222.46f, 35.0f);
        pathBuilder.curveToRelative(1.0f, 1.68f, 5.31f, 19.8f, 5.53f, 41.79f);
        pathBuilder.curveTo(228.2f, 97.75f, 224.69f, 128.0f, 206.77f, 152.73f);
        pathBuilder.close();
        pathBuilder.moveTo(194.54f, 155.16f);
        pathBuilder.arcToRelative(108.0f, 108.0f, 0.0f, false, true, -93.7f, -93.7f);
        pathBuilder.curveToRelative(-27.92f, 25.08f, -39.0f, 67.62f, -33.14f, 126.81f);
        pathBuilder.curveTo(126.9f, 194.14f, 169.45f, 183.07f, 194.54f, 155.16f);
        pathBuilder.close();
        pathBuilder.moveTo(215.74f, 40.26f);
        pathBuilder.curveTo(204.9f, 37.73f, 148.5f, 26.69f, 108.3f, 55.46f);
        pathBuilder.arcToRelative(99.92f, 99.92f, 0.0f, false, false, 92.23f, 92.24f);
        pathBuilder.curveTo(229.29f, 107.52f, 218.27f, 51.11f, 215.74f, 40.26f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fishSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
