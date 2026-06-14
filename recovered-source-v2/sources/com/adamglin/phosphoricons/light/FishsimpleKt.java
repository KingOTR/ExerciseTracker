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

/* compiled from: Fishsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FishSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFishSimple", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fishSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FishsimpleKt {
    private static ImageVector _fishSimple;

    public static final ImageVector getFishSimple(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(166.0f, 76.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 166.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.38f, 153.9f);
        pathBuilder.curveToRelative(-14.79f, 20.44f, -36.84f, 34.22f, -65.53f, 41.0f);
        pathBuilder.curveToRelative(-20.5f, 4.81f, -44.58f, 6.0f, -72.0f, 3.68f);
        pathBuilder.quadToRelative(2.43f, 19.0f, 7.07f, 40.15f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.58f, 7.15f);
        pathBuilder.arcToRelative(6.29f, 6.29f, 0.0f, false, true, -1.29f, 0.14f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.85f, -4.72f);
        pathBuilder.quadToRelative(-5.07f, -23.13f, -7.57f, -44.0f);
        pathBuilder.quadToRelative(-20.8f, -2.51f, -43.94f, -7.57f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, true, 17.29f, 178.0f);
        pathBuilder.quadToRelative(21.14f, 4.63f, 40.12f, 7.07f);
        pathBuilder.curveToRelative(-2.35f, -27.36f, -1.13f, -51.41f, 3.69f, -71.9f);
        pathBuilder.curveTo(67.84f, 84.49f, 81.61f, 62.44f, 102.0f, 47.64f);
        pathBuilder.curveToRelative(47.55f, -34.44f, 116.31f, -18.0f, 120.0f, -15.81f);
        pathBuilder.arcToRelative(5.93f, 5.93f, 0.0f, false, true, 2.11f, 2.11f);
        pathBuilder.curveTo(226.34f, 37.63f, 242.81f, 106.33f, 208.37f, 153.91f);
        pathBuilder.close();
        pathBuilder.moveTo(190.44f, 156.59f);
        pathBuilder.arcToRelative(110.06f, 110.06f, 0.0f, false, true, -91.0f, -91.0f);
        pathBuilder.curveToRelative(-25.13f, 24.7f, -35.12f, 65.24f, -29.87f, 120.89f);
        pathBuilder.curveTo(125.19f, 191.71f, 165.72f, 181.73f, 190.43f, 156.6f);
        pathBuilder.close();
        pathBuilder.moveTo(214.06f, 41.93f);
        pathBuilder.curveToRelative(-12.78f, -2.84f, -65.42f, -12.17f, -103.69f, 14.52f);
        pathBuilder.arcToRelative(97.92f, 97.92f, 0.0f, false, false, 89.16f, 89.17f);
        pathBuilder.curveTo(226.21f, 107.37f, 216.89f, 54.72f, 214.06f, 41.93f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fishSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
