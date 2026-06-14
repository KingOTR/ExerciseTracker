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

/* compiled from: Lasso.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lasso", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLasso", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lasso", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LassoKt {
    private static ImageVector _lasso;

    public static final ImageVector getLasso(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(204.68f, 61.63f);
        pathBuilder.curveTo(184.11f, 49.0f, 156.88f, 42.0f, 128.0f, 42.0f);
        pathBuilder.reflectiveCurveTo(71.89f, 49.0f, 51.32f, 61.63f);
        pathBuilder.curveTo(29.83f, 74.85f, 18.0f, 92.73f, 18.0f, 112.0f);
        pathBuilder.reflectiveCurveToRelative(11.83f, 37.13f, 33.32f, 50.35f);
        pathBuilder.curveTo(70.45f, 174.1f, 95.35f, 181.0f, 122.0f, 181.85f);
        pathBuilder.curveToRelative(0.0f, 0.64f, 0.0f, 1.28f, 0.0f, 1.94f);
        pathBuilder.curveToRelative(0.0f, 14.76f, -6.94f, 27.1f, -19.54f, 34.73f);
        pathBuilder.curveToRelative(-15.22f, 9.22f, -36.0f, 9.9f, -51.68f, 1.71f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.56f, 10.63f);
        pathBuilder.arcTo(64.45f, 64.45f, 0.0f, false, false, 75.0f, 238.0f);
        pathBuilder.arcToRelative(65.24f, 65.24f, 0.0f, false, false, 33.7f, -9.22f);
        pathBuilder.curveToRelative(16.34f, -9.89f, 25.33f, -25.87f, 25.33f, -45.0f);
        pathBuilder.curveToRelative(0.0f, -0.65f, 0.0f, -1.29f, 0.0f, -1.94f);
        pathBuilder.curveToRelative(26.65f, -0.89f, 51.57f, -7.74f, 70.72f, -19.52f);
        pathBuilder.curveTo(226.17f, 149.11f, 238.0f, 131.23f, 238.0f, 112.0f);
        pathBuilder.reflectiveCurveTo(226.17f, 74.85f, 204.68f, 61.63f);
        pathBuilder.close();
        pathBuilder.moveTo(64.68f, 156.09f);
        pathBuilder.curveToRelative(5.32f, -12.0f, 17.2f, -15.07f, 26.48f, -13.87f);
        pathBuilder.curveToRelative(12.28f, 1.6f, 24.64f, 10.67f, 29.08f, 27.55f);
        pathBuilder.curveTo(99.73f, 168.81f, 80.48f, 164.08f, 64.72f, 156.09f);
        pathBuilder.close();
        pathBuilder.moveTo(198.35f, 152.09f);
        pathBuilder.curveToRelative(-17.62f, 10.85f, -40.83f, 17.1f, -65.77f, 17.79f);
        pathBuilder.arcToRelative(52.77f, 52.77f, 0.0f, false, false, -11.31f, -23.84f);
        pathBuilder.arcToRelative(45.24f, 45.24f, 0.0f, false, false, -28.56f, -15.73f);
        pathBuilder.curveToRelative(-16.89f, -2.2f, -31.49f, 5.54f, -38.41f, 19.68f);
        pathBuilder.curveTo(38.61f, 139.37f, 30.0f, 126.0f, 30.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, -14.93f, 9.8f, -29.18f, 27.61f, -40.13f);
        pathBuilder.curveTo(76.32f, 60.34f, 101.32f, 54.0f, 128.0f, 54.0f);
        pathBuilder.reflectiveCurveToRelative(51.68f, 6.34f, 70.39f, 17.85f);
        pathBuilder.curveTo(216.2f, 82.8f, 226.0f, 97.05f, 226.0f, 112.0f);
        pathBuilder.reflectiveCurveTo(216.2f, 141.16f, 198.39f, 152.11f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lasso = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
