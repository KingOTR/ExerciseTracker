package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Flowerlotus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlowerLotus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFlowerLotus", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flowerLotus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowerlotusKt {
    private static ImageVector _flowerLotus;

    public static final ImageVector getFlowerLotus(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _flowerLotus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlowerLotus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.83f, 121.63f);
        pathBuilder.arcToRelative(15.53f, 15.53f, 0.0f, false, false, -9.52f, -7.33f);
        pathBuilder.arcToRelative(73.55f, 73.55f, 0.0f, false, false, -22.17f, -2.22f);
        pathBuilder.curveToRelative(4.0f, -19.85f, 1.0f, -35.55f, -2.0f, -44.86f);
        pathBuilder.arcToRelative(16.17f, 16.17f, 0.0f, false, false, -18.8f, -10.88f);
        pathBuilder.arcToRelative(85.53f, 85.53f, 0.0f, false, false, -28.55f, 12.12f);
        pathBuilder.arcToRelative(94.58f, 94.58f, 0.0f, false, false, -27.11f, -33.25f);
        pathBuilder.arcToRelative(16.05f, 16.05f, 0.0f, false, false, -19.26f, 0.0f);
        pathBuilder.arcTo(94.58f, 94.58f, 0.0f, false, false, 91.26f, 68.46f);
        pathBuilder.arcTo(85.53f, 85.53f, 0.0f, false, false, 62.71f, 56.34f);
        pathBuilder.arcTo(16.14f, 16.14f, 0.0f, false, false, 43.92f, 67.22f);
        pathBuilder.curveToRelative(-3.0f, 9.31f, -6.0f, 25.0f, -2.06f, 44.86f);
        pathBuilder.arcToRelative(73.55f, 73.55f, 0.0f, false, false, -22.17f, 2.22f);
        pathBuilder.arcToRelative(15.53f, 15.53f, 0.0f, false, false, -9.52f, 7.33f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.6f, 12.26f);
        pathBuilder.curveToRelative(3.39f, 12.58f, 13.8f, 36.49f, 45.33f, 55.33f);
        pathBuilder.reflectiveCurveTo(113.13f, 208.0f, 128.05f, 208.0f);
        pathBuilder.reflectiveCurveToRelative(42.67f, 0.0f, 74.0f, -18.78f);
        pathBuilder.curveToRelative(31.53f, -18.84f, 41.94f, -42.75f, 45.33f, -55.33f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 245.83f, 121.63f);
        pathBuilder.close();
        pathBuilder.moveTo(62.1f, 175.49f);
        pathBuilder.curveTo(35.47f, 159.57f, 26.82f, 140.05f, 24.0f, 129.7f);
        pathBuilder.arcToRelative(59.61f, 59.61f, 0.0f, false, true, 22.5f, -1.17f);
        pathBuilder.arcToRelative(129.08f, 129.08f, 0.0f, false, false, 9.15f, 19.41f);
        pathBuilder.arcToRelative(142.28f, 142.28f, 0.0f, false, false, 34.0f, 39.56f);
        pathBuilder.arcTo(114.92f, 114.92f, 0.0f, false, true, 62.1f, 175.49f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 190.4f);
        pathBuilder.curveToRelative(-9.33f, -6.94f, -32.0f, -28.23f, -32.0f, -71.23f);
        pathBuilder.curveTo(96.0f, 76.7f, 118.38f, 55.24f, 128.0f, 48.0f);
        pathBuilder.curveToRelative(9.62f, 7.26f, 32.0f, 28.72f, 32.0f, 71.19f);
        pathBuilder.curveTo(160.0f, 162.17f, 137.33f, 183.46f, 128.0f, 190.4f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 129.72f);
        pathBuilder.curveToRelative(-2.77f, 10.24f, -11.4f, 29.81f, -38.09f, 45.77f);
        pathBuilder.arcToRelative(114.92f, 114.92f, 0.0f, false, true, -27.55f, 12.0f);
        pathBuilder.arcToRelative(142.28f, 142.28f, 0.0f, false, false, 34.0f, -39.56f);
        pathBuilder.arcToRelative(129.08f, 129.08f, 0.0f, false, false, 9.15f, -19.41f);
        pathBuilder.arcTo(59.69f, 59.69f, 0.0f, false, true, 232.0f, 129.71f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flowerLotus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
