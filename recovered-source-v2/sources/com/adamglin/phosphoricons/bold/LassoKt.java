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

/* compiled from: Lasso.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lasso", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getLasso", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lasso", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LassoKt {
    private static ImageVector _lasso;

    public static final ImageVector getLasso(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(207.83f, 56.53f);
        pathBuilder.curveTo(186.32f, 43.29f, 158.0f, 36.0f, 128.0f, 36.0f);
        pathBuilder.reflectiveCurveTo(69.68f, 43.29f, 48.17f, 56.53f);
        pathBuilder.curveTo(24.85f, 70.89f, 12.0f, 90.6f, 12.0f, 112.0f);
        pathBuilder.reflectiveCurveToRelative(12.85f, 41.14f, 36.17f, 55.5f);
        pathBuilder.curveToRelative(18.48f, 11.37f, 42.0f, 18.34f, 67.29f, 20.08f);
        pathBuilder.curveToRelative(-2.0f, 11.07f, -9.09f, 17.75f, -15.22f, 21.54f);
        pathBuilder.curveToRelative(-13.48f, 8.31f, -32.75f, 9.18f, -46.86f, 2.1f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 42.62f, 232.7f);
        pathBuilder.arcToRelative(71.76f, 71.76f, 0.0f, false, false, 32.0f, 7.3f);
        pathBuilder.arcToRelative(73.2f, 73.2f, 0.0f, false, false, 38.18f, -10.43f);
        pathBuilder.curveToRelative(15.45f, -9.54f, 25.0f, -24.58f, 26.83f, -41.9f);
        pathBuilder.curveToRelative(25.6f, -1.64f, 49.47f, -8.65f, 68.16f, -20.15f);
        pathBuilder.curveTo(231.15f, 153.16f, 244.0f, 133.45f, 244.0f, 112.0f);
        pathBuilder.reflectiveCurveTo(231.15f, 70.89f, 207.83f, 56.53f);
        pathBuilder.close();
        pathBuilder.moveTo(73.39f, 153.53f);
        pathBuilder.arcToRelative(21.0f, 21.0f, 0.0f, false, true, 20.16f, -9.35f);
        pathBuilder.curveToRelative(10.36f, 1.39f, 16.54f, 9.43f, 19.72f, 19.13f);
        pathBuilder.arcTo(135.3f, 135.3f, 0.0f, false, true, 73.39f, 153.56f);
        pathBuilder.close();
        pathBuilder.moveTo(138.26f, 163.67f);
        pathBuilder.arcToRelative(61.84f, 61.84f, 0.0f, false, false, -10.76f, -24.82f);
        pathBuilder.arcToRelative(46.08f, 46.08f, 0.0f, false, false, -30.75f, -18.46f);
        pathBuilder.curveToRelative(-18.0f, -2.41f, -34.52f, 5.89f, -44.1f, 21.0f);
        pathBuilder.curveTo(42.2f, 133.0f, 36.0f, 122.84f, 36.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, -28.19f, 42.13f, -52.0f, 92.0f, -52.0f);
        pathBuilder.reflectiveCurveToRelative(92.0f, 23.82f, 92.0f, 52.0f);
        pathBuilder.curveTo(220.0f, 138.26f, 183.51f, 160.71f, 138.26f, 163.7f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lasso = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
