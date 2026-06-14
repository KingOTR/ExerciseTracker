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

/* compiled from: Spinnerball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpinnerBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSpinnerBall", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spinnerBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpinnerballKt {
    private static ImageVector _spinnerBall;

    public static final ImageVector getSpinnerBall(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.92f, 124.44f);
        pathBuilder.curveToRelative(-33.69f, 24.71f, -58.55f, 15.45f, -83.94f, 3.0f);
        pathBuilder.curveToRelative(23.54f, -15.86f, 45.85f, -33.95f, 43.34f, -75.81f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 219.92f, 124.44f);
        pathBuilder.close();
        pathBuilder.moveTo(170.86f, 46.61f);
        pathBuilder.curveTo(175.4f, 88.13f, 155.0f, 105.0f, 131.55f, 120.83f);
        pathBuilder.curveToRelative(-2.0f, -28.32f, -6.47f, -56.69f, -44.0f, -75.45f);
        pathBuilder.arcToRelative(91.87f, 91.87f, 0.0f, false, true, 83.3f, 1.23f);
        pathBuilder.close();
        pathBuilder.moveTo(79.0f, 50.18f);
        pathBuilder.curveToRelative(38.22f, 16.83f, 42.63f, 43.0f, 44.58f, 71.16f);
        pathBuilder.curveToRelative(-25.5f, -12.46f, -52.33f, -22.75f, -87.34f, 0.38f);
        pathBuilder.arcTo(92.07f, 92.07f, 0.0f, false, true, 79.0f, 50.18f);
        pathBuilder.close();
        pathBuilder.moveTo(36.1f, 131.56f);
        pathBuilder.curveToRelative(33.69f, -24.71f, 58.55f, -15.45f, 83.94f, -3.05f);
        pathBuilder.curveToRelative(-23.54f, 15.86f, -45.85f, 34.0f, -43.34f, 75.81f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 36.08f, 131.56f);
        pathBuilder.close();
        pathBuilder.moveTo(85.16f, 209.39f);
        pathBuilder.curveTo(80.6f, 167.87f, 101.0f, 151.0f, 124.45f, 135.17f);
        pathBuilder.curveToRelative(2.0f, 28.32f, 6.47f, 56.69f, 44.0f, 75.45f);
        pathBuilder.arcToRelative(91.87f, 91.87f, 0.0f, false, true, -83.3f, -1.23f);
        pathBuilder.close();
        pathBuilder.moveTo(177.0f, 205.82f);
        pathBuilder.curveToRelative(-38.22f, -16.83f, -42.63f, -43.0f, -44.58f, -71.16f);
        pathBuilder.curveToRelative(14.43f, 7.05f, 29.29f, 13.41f, 45.81f, 13.41f);
        pathBuilder.curveToRelative(12.67f, 0.0f, 26.33f, -3.74f, 41.53f, -13.78f);
        pathBuilder.arcTo(92.06f, 92.06f, 0.0f, false, true, 177.0f, 205.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spinnerBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
