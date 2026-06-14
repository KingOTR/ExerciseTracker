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

/* compiled from: Flower.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFlower", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flower", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowerKt {
    private static ImageVector _flower;

    public static final ImageVector getFlower(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _flower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Flower", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(210.35f, 129.36f);
        pathBuilder.curveToRelative(-0.81f, -0.47f, -1.7f, -0.92f, -2.62f, -1.36f);
        pathBuilder.curveToRelative(0.92f, -0.44f, 1.81f, -0.89f, 2.62f, -1.36f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -69.28f);
        pathBuilder.curveToRelative(-0.81f, 0.47f, -1.65f, 1.0f, -2.48f, 1.59f);
        pathBuilder.curveToRelative(0.08f, -1.0f, 0.13f, -2.0f, 0.13f, -3.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 0.94f, 0.0f, 1.94f, 0.13f, 3.0f);
        pathBuilder.curveToRelative(-0.83f, -0.57f, -1.67f, -1.12f, -2.48f, -1.59f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, 69.28f);
        pathBuilder.curveToRelative(0.81f, 0.47f, 1.7f, 0.92f, 2.62f, 1.36f);
        pathBuilder.curveToRelative(-0.92f, 0.44f, -1.81f, 0.89f, -2.62f, 1.36f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 69.28f);
        pathBuilder.curveToRelative(0.81f, -0.47f, 1.65f, -1.0f, 2.48f, -1.59f);
        pathBuilder.curveToRelative(-0.08f, 1.0f, -0.13f, 2.0f, -0.13f, 2.95f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -0.94f, -0.05f, -1.94f, -0.13f, -2.95f);
        pathBuilder.curveToRelative(0.83f, 0.57f, 1.67f, 1.12f, 2.48f, 1.59f);
        pathBuilder.arcTo(39.79f, 39.79f, 0.0f, false, false, 190.29f, 204.0f);
        pathBuilder.arcToRelative(40.43f, 40.43f, 0.0f, false, false, 10.42f, -1.38f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 9.64f, -73.28f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 128.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 104.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.35f, 71.21f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 41.57f);
        pathBuilder.curveToRelative(-6.27f, 3.63f, -18.61f, 6.13f, -35.16f, 7.19f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 154.53f, 98.1f);
        pathBuilder.curveTo(163.73f, 84.28f, 172.08f, 74.84f, 178.35f, 71.21f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 32.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f);
        pathBuilder.curveToRelative(0.0f, 7.24f, -4.0f, 19.19f, -11.36f, 34.06f);
        pathBuilder.arcToRelative(39.81f, 39.81f, 0.0f, false, false, -25.28f, 0.0f);
        pathBuilder.curveTo(108.0f, 75.19f, 104.0f, 63.24f, 104.0f, 56.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.86f, 80.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 32.79f, -8.79f);
        pathBuilder.curveToRelative(6.27f, 3.63f, 14.62f, 13.07f, 23.82f, 26.89f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 88.81f, 120.0f);
        pathBuilder.curveToRelative(-16.55f, -1.06f, -28.89f, -3.56f, -35.16f, -7.18f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 44.86f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(77.65f, 184.79f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -41.57f);
        pathBuilder.curveToRelative(6.27f, -3.63f, 18.61f, -6.13f, 35.16f, -7.19f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 12.66f, 21.87f);
        pathBuilder.curveTo(92.27f, 171.72f, 83.92f, 181.16f, 77.65f, 184.79f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 224.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f);
        pathBuilder.curveToRelative(0.0f, -7.24f, 4.0f, -19.19f, 11.36f, -34.06f);
        pathBuilder.arcToRelative(39.81f, 39.81f, 0.0f, false, false, 25.28f, 0.0f);
        pathBuilder.curveTo(148.0f, 180.81f, 152.0f, 192.76f, 152.0f, 200.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.14f, 176.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -32.79f, 8.79f);
        pathBuilder.curveToRelative(-6.27f, -3.63f, -14.62f, -13.07f, -23.82f, -26.89f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 167.19f, 136.0f);
        pathBuilder.curveToRelative(16.55f, 1.06f, 28.89f, 3.56f, 35.16f, 7.18f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 211.14f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flower = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
