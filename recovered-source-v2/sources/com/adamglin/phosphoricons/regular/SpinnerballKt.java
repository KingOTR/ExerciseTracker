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

/* compiled from: Spinnerball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpinnerBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSpinnerBall", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spinnerBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpinnerballKt {
    private static ImageVector _spinnerBall;

    public static final ImageVector getSpinnerBall(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _spinnerBall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SpinnerBall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.82f, 122.46f);
        pathBuilder.curveToRelative(-28.34f, 20.0f, -49.57f, 14.68f, -71.87f, 4.39f);
        pathBuilder.curveToRelative(20.06f, -14.19f, 38.86f, -32.21f, 39.53f, -67.11f);
        pathBuilder.arcTo(87.92f, 87.92f, 0.0f, false, true, 215.82f, 122.46f);
        pathBuilder.close();
        pathBuilder.moveTo(167.11f, 49.19f);
        pathBuilder.curveTo(170.24f, 83.71f, 155.0f, 99.44f, 135.0f, 113.61f);
        pathBuilder.curveToRelative(-2.25f, -24.48f, -8.44f, -49.8f, -38.37f, -67.82f);
        pathBuilder.arcToRelative(87.89f, 87.89f, 0.0f, false, true, 70.5f, 3.4f);
        pathBuilder.close();
        pathBuilder.moveTo(79.32f, 54.73f);
        pathBuilder.curveToRelative(31.45f, 14.55f, 37.47f, 35.58f, 39.71f, 60.0f);
        pathBuilder.curveToRelative(-22.33f, -10.29f, -47.35f, -17.59f, -77.93f, -0.68f);
        pathBuilder.arcTo(88.18f, 88.18f, 0.0f, false, true, 79.32f, 54.73f);
        pathBuilder.close();
        pathBuilder.moveTo(40.18f, 133.54f);
        pathBuilder.curveToRelative(28.34f, -20.0f, 49.57f, -14.68f, 71.87f, -4.39f);
        pathBuilder.curveTo(92.0f, 143.34f, 73.19f, 161.36f, 72.52f, 196.26f);
        pathBuilder.arcTo(87.92f, 87.92f, 0.0f, false, true, 40.18f, 133.54f);
        pathBuilder.close();
        pathBuilder.moveTo(88.89f, 206.81f);
        pathBuilder.curveTo(85.76f, 172.29f, 101.0f, 156.56f, 121.0f, 142.39f);
        pathBuilder.curveToRelative(2.25f, 24.48f, 8.44f, 49.8f, 38.37f, 67.82f);
        pathBuilder.arcToRelative(87.89f, 87.89f, 0.0f, false, true, -70.5f, -3.4f);
        pathBuilder.close();
        pathBuilder.moveTo(176.68f, 201.27f);
        pathBuilder.curveToRelative(-31.45f, -14.55f, -37.47f, -35.58f, -39.71f, -60.0f);
        pathBuilder.curveToRelative(12.72f, 5.86f, 26.31f, 10.75f, 41.3f, 10.75f);
        pathBuilder.curveToRelative(11.33f, 0.0f, 23.46f, -2.8f, 36.63f, -10.08f);
        pathBuilder.arcTo(88.2f, 88.2f, 0.0f, false, true, 176.68f, 201.27f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spinnerBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
