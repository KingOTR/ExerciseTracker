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

/* compiled from: Lasso.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lasso", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getLasso", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lasso", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LassoKt {
    private static ImageVector _lasso;

    public static final ImageVector getLasso(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _lasso;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lasso", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(203.64f, 63.34f);
        pathBuilder.curveTo(183.37f, 50.87f, 156.51f, 44.0f, 128.0f, 44.0f);
        pathBuilder.reflectiveCurveTo(72.63f, 50.87f, 52.36f, 63.34f);
        pathBuilder.curveTo(31.49f, 76.19f, 20.0f, 93.48f, 20.0f, 112.0f);
        pathBuilder.reflectiveCurveToRelative(11.49f, 35.83f, 32.36f, 48.68f);
        pathBuilder.curveToRelative(19.29f, 11.87f, 44.55f, 18.65f, 71.51f, 19.28f);
        pathBuilder.curveToRelative(0.08f, 1.27f, 0.13f, 2.56f, 0.13f, 3.9f);
        pathBuilder.curveToRelative(0.0f, 15.49f, -7.28f, 28.44f, -20.51f, 36.46f);
        pathBuilder.curveToRelative(-15.79f, 9.57f, -37.34f, 10.28f, -53.64f, 1.77f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.7f, 7.09f);
        pathBuilder.arcTo(62.32f, 62.32f, 0.0f, false, false, 74.91f, 236.0f);
        pathBuilder.arcToRelative(63.56f, 63.56f, 0.0f, false, false, 32.73f, -8.82f);
        pathBuilder.curveToRelative(15.71f, -9.52f, 24.36f, -24.9f, 24.36f, -43.3f);
        pathBuilder.curveToRelative(0.0f, -1.32f, -0.05f, -2.61f, -0.12f, -3.9f);
        pathBuilder.curveToRelative(27.06f, -0.59f, 52.41f, -7.38f, 71.76f, -19.28f);
        pathBuilder.curveTo(224.51f, 147.85f, 236.0f, 130.56f, 236.0f, 112.0f);
        pathBuilder.reflectiveCurveTo(224.51f, 76.19f, 203.64f, 63.34f);
        pathBuilder.close();
        pathBuilder.moveTo(62.16f, 157.15f);
        pathBuilder.curveToRelative(5.3f, -14.49f, 18.83f, -18.22f, 29.3f, -16.85f);
        pathBuilder.curveToRelative(13.64f, 1.78f, 27.38f, 12.19f, 31.38f, 31.66f);
        pathBuilder.curveTo(99.66f, 171.25f, 78.55f, 165.78f, 62.16f, 157.15f);
        pathBuilder.close();
        pathBuilder.moveTo(131.0f, 172.0f);
        pathBuilder.arcToRelative(51.35f, 51.35f, 0.0f, false, false, -11.18f, -24.59f);
        pathBuilder.arcToRelative(43.28f, 43.28f, 0.0f, false, false, -27.3f, -15.06f);
        pathBuilder.curveToRelative(-16.82f, -2.19f, -31.24f, 6.0f, -37.33f, 20.74f);
        pathBuilder.curveTo(38.33f, 142.35f, 28.0f, 127.9f, 28.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, -33.09f, 44.86f, -60.0f, 100.0f, -60.0f);
        pathBuilder.reflectiveCurveToRelative(100.0f, 26.93f, 100.0f, 60.0f);
        pathBuilder.curveTo(228.0f, 144.52f, 184.74f, 171.06f, 131.0f, 172.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lasso = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
