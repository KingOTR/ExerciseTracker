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

/* compiled from: Flowerlotus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlowerLotus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFlowerLotus", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flowerLotus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowerlotusKt {
    private static ImageVector _flowerLotus;

    public static final ImageVector getFlowerLotus(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(242.37f, 123.65f);
        pathBuilder.arcToRelative(11.54f, 11.54f, 0.0f, false, false, -7.08f, -5.46f);
        pathBuilder.arcTo(71.5f, 71.5f, 0.0f, false, false, 209.0f, 116.52f);
        pathBuilder.curveToRelative(5.48f, -21.46f, 2.38f, -38.36f, -0.75f, -48.0f);
        pathBuilder.arcToRelative(12.16f, 12.16f, 0.0f, false, false, -14.16f, -8.19f);
        pathBuilder.arcToRelative(82.85f, 82.85f, 0.0f, false, false, -31.0f, 14.17f);
        pathBuilder.arcToRelative(91.06f, 91.06f, 0.0f, false, false, -27.9f, -36.0f);
        pathBuilder.arcToRelative(11.91f, 11.91f, 0.0f, false, false, -14.44f, 0.0f);
        pathBuilder.arcToRelative(91.06f, 91.06f, 0.0f, false, false, -27.9f, 36.0f);
        pathBuilder.arcToRelative(82.92f, 82.92f, 0.0f, false, false, -31.0f, -14.17f);
        pathBuilder.arcToRelative(12.16f, 12.16f, 0.0f, false, false, -14.16f, 8.19f);
        pathBuilder.curveToRelative(-3.13f, 9.68f, -6.23f, 26.58f, -0.75f, 48.0f);
        pathBuilder.arcToRelative(71.5f, 71.5f, 0.0f, false, false, -26.26f, 1.67f);
        pathBuilder.arcToRelative(11.54f, 11.54f, 0.0f, false, false, -7.08f, 5.46f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.2f, 9.22f);
        pathBuilder.curveToRelative(3.24f, 12.0f, 13.2f, 34.81f, 43.52f, 52.92f);
        pathBuilder.reflectiveCurveTo(113.45f, 204.0f, 128.0f, 204.0f);
        pathBuilder.reflectiveCurveToRelative(41.61f, 0.0f, 72.07f, -18.21f);
        pathBuilder.reflectiveCurveToRelative(40.28f, -40.93f, 43.52f, -52.92f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 242.37f, 123.65f);
        pathBuilder.close();
        pathBuilder.moveTo(195.8f, 68.11f);
        pathBuilder.arcTo(4.2f, 4.2f, 0.0f, false, true, 200.67f, 71.0f);
        pathBuilder.curveToRelative(4.0f, 12.5f, 8.0f, 38.35f, -10.77f, 71.0f);
        pathBuilder.curveToRelative(-10.45f, 18.19f, -25.11f, 32.2f, -38.11f, 41.44f);
        pathBuilder.curveTo(162.0f, 170.0f, 172.0f, 149.24f, 172.0f, 119.19f);
        pathBuilder.arcToRelative(113.35f, 113.35f, 0.0f, false, false, -5.88f, -37.0f);
        pathBuilder.arcTo(75.28f, 75.28f, 0.0f, false, true, 195.8f, 68.11f);
        pathBuilder.close();
        pathBuilder.moveTo(55.33f, 71.0f);
        pathBuilder.arcToRelative(4.19f, 4.19f, 0.0f, false, true, 4.87f, -2.84f);
        pathBuilder.arcTo(75.28f, 75.28f, 0.0f, false, true, 89.88f, 82.19f);
        pathBuilder.arcToRelative(113.35f, 113.35f, 0.0f, false, false, -5.88f, 37.0f);
        pathBuilder.curveToRelative(0.0f, 30.05f, 10.0f, 50.82f, 20.21f, 64.23f);
        pathBuilder.curveToRelative(-13.0f, -9.24f, -27.66f, -23.25f, -38.11f, -41.44f);
        pathBuilder.curveTo(47.32f, 109.3f, 51.29f, 83.45f, 55.33f, 71.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.05f, 179.0f);
        pathBuilder.curveToRelative(-27.9f, -16.67f, -37.0f, -37.32f, -39.9f, -48.15f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.41f, -3.13f);
        pathBuilder.arcToRelative(3.59f, 3.59f, 0.0f, false, true, 2.21f, -1.73f);
        pathBuilder.arcToRelative(64.62f, 64.62f, 0.0f, false, true, 26.73f, -1.0f);
        pathBuilder.arcToRelative(123.48f, 123.48f, 0.0f, false, false, 9.66f, 21.0f);
        pathBuilder.curveToRelative(13.28f, 23.1f, 32.66f, 39.67f, 48.27f, 49.11f);
        pathBuilder.arcTo(116.34f, 116.34f, 0.0f, false, true, 60.05f, 178.93f);
        pathBuilder.close();
        pathBuilder.moveTo(128.05f, 195.34f);
        pathBuilder.arcToRelative(75.75f, 75.75f, 0.0f, false, true, -17.08f, -16.4f);
        pathBuilder.curveTo(98.37f, 162.58f, 92.0f, 142.5f, 92.0f, 119.19f);
        pathBuilder.curveToRelative(0.0f, -44.25f, 23.49f, -66.75f, 33.59f, -74.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.82f, 0.0f);
        pathBuilder.curveTo(140.51f, 52.44f, 164.0f, 74.94f, 164.0f, 119.19f);
        pathBuilder.curveToRelative(0.0f, 23.31f, -6.37f, 43.39f, -18.92f, 59.68f);
        pathBuilder.arcTo(75.75f, 75.75f, 0.0f, false, true, 128.0f, 195.27f);
        pathBuilder.close();
        pathBuilder.moveTo(235.9f, 130.85f);
        pathBuilder.curveToRelative(-2.92f, 10.83f, -12.0f, 31.48f, -39.9f, 48.15f);
        pathBuilder.arcToRelative(116.34f, 116.34f, 0.0f, false, true, -47.38f, 16.15f);
        pathBuilder.curveToRelative(15.61f, -9.44f, 35.0f, -26.0f, 48.27f, -49.11f);
        pathBuilder.arcToRelative(123.48f, 123.48f, 0.0f, false, false, 9.66f, -21.0f);
        pathBuilder.arcToRelative(64.45f, 64.45f, 0.0f, false, true, 26.73f, 1.0f);
        pathBuilder.arcToRelative(3.59f, 3.59f, 0.0f, false, true, 2.21f, 1.73f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 235.85f, 130.78f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flowerLotus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
