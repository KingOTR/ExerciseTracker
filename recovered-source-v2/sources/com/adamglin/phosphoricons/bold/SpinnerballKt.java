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

/* compiled from: Spinnerball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpinnerBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSpinnerBall", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spinnerBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpinnerballKt {
    private static ImageVector _spinnerBall;

    public static final ImageVector getSpinnerBall(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.65f, 120.47f);
        pathBuilder.curveTo(188.51f, 136.0f, 170.71f, 133.74f, 151.92f, 126.0f);
        pathBuilder.curveToRelative(7.87f, -6.0f, 15.29f, -12.73f, 21.35f, -21.16f);
        pathBuilder.arcTo(74.85f, 74.85f, 0.0f, false, false, 187.0f, 68.25f);
        pathBuilder.arcTo(83.73f, 83.73f, 0.0f, false, true, 211.65f, 120.47f);
        pathBuilder.close();
        pathBuilder.moveTo(163.3f, 51.8f);
        pathBuilder.curveToRelative(1.9f, 27.81f, -9.0f, 42.09f, -25.09f, 54.48f);
        pathBuilder.curveToRelative(-1.24f, -9.82f, -3.38f, -19.61f, -7.64f, -29.08f);
        pathBuilder.arcTo(75.0f, 75.0f, 0.0f, false, false, 105.69f, 47.0f);
        pathBuilder.arcTo(83.73f, 83.73f, 0.0f, false, true, 163.3f, 51.8f);
        pathBuilder.close();
        pathBuilder.moveTo(79.69f, 59.35f);
        pathBuilder.curveToRelative(25.0f, 12.25f, 31.93f, 28.8f, 34.6f, 48.94f);
        pathBuilder.curveToRelative(-9.12f, -3.82f, -18.66f, -6.87f, -29.0f, -7.91f);
        pathBuilder.arcToRelative(75.0f, 75.0f, 0.0f, false, false, -38.59f, 6.46f);
        pathBuilder.arcTo(84.2f, 84.2f, 0.0f, false, true, 79.69f, 59.35f);
        pathBuilder.close();
        pathBuilder.moveTo(44.35f, 135.53f);
        pathBuilder.curveTo(67.49f, 120.0f, 85.29f, 122.26f, 104.08f, 130.0f);
        pathBuilder.curveToRelative(-7.87f, 6.0f, -15.29f, 12.73f, -21.35f, 21.16f);
        pathBuilder.arcTo(74.85f, 74.85f, 0.0f, false, false, 69.0f, 187.75f);
        pathBuilder.arcTo(83.73f, 83.73f, 0.0f, false, true, 44.35f, 135.53f);
        pathBuilder.close();
        pathBuilder.moveTo(92.7f, 204.2f);
        pathBuilder.curveToRelative(-1.9f, -27.81f, 9.0f, -42.09f, 25.09f, -54.48f);
        pathBuilder.curveToRelative(1.24f, 9.82f, 3.38f, 19.61f, 7.64f, 29.08f);
        pathBuilder.arcTo(75.0f, 75.0f, 0.0f, false, false, 150.31f, 209.0f);
        pathBuilder.arcTo(83.73f, 83.73f, 0.0f, false, true, 92.7f, 204.2f);
        pathBuilder.close();
        pathBuilder.moveTo(176.31f, 196.65f);
        pathBuilder.curveToRelative(-25.0f, -12.25f, -31.93f, -28.8f, -34.6f, -48.94f);
        pathBuilder.curveToRelative(9.12f, 3.82f, 18.66f, 6.87f, 29.0f, 7.91f);
        pathBuilder.quadToRelative(3.75f, 0.38f, 7.47f, 0.38f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 31.12f, -6.85f);
        pathBuilder.arcTo(84.19f, 84.19f, 0.0f, false, true, 176.31f, 196.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spinnerBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
