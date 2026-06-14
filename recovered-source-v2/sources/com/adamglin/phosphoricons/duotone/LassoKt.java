package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Lasso.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lasso", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getLasso", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lasso", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LassoKt {
    private static ImageVector _lasso;

    public static final ImageVector getLasso(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 35.35f, -46.56f, 64.0f, -104.0f, 64.0f);
        pathBuilder.reflectiveCurveTo(24.0f, 147.35f, 24.0f, 112.0f);
        pathBuilder.reflectiveCurveTo(70.56f, 48.0f, 128.0f, 48.0f);
        pathBuilder.reflectiveCurveTo(232.0f, 76.65f, 232.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(205.73f, 59.93f);
        pathBuilder2.curveTo(184.85f, 47.08f, 157.24f, 40.0f, 128.0f, 40.0f);
        pathBuilder2.reflectiveCurveTo(71.15f, 47.08f, 50.27f, 59.93f);
        pathBuilder2.curveTo(28.17f, 73.52f, 16.0f, 92.0f, 16.0f, 112.0f);
        pathBuilder2.reflectiveCurveTo(28.17f, 150.44f, 50.27f, 164.0f);
        pathBuilder2.curveToRelative(19.0f, 11.67f, 43.49f, 18.56f, 69.73f, 19.73f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(37.35f, 37.35f, 0.0f, false, true, -18.58f, 33.0f);
        pathBuilder2.curveToRelative(-14.64f, 8.86f, -34.62f, 9.52f, -49.72f, 1.64f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.4f, 14.18f);
        pathBuilder2.arcTo(66.4f, 66.4f, 0.0f, false, false, 75.0f, 240.0f);
        pathBuilder2.arcToRelative(67.31f, 67.31f, 0.0f, false, false, 34.74f, -9.5f);
        pathBuilder2.curveToRelative(17.0f, -10.27f, 26.29f, -26.86f, 26.29f, -46.7f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(26.24f, -1.17f, 50.76f, -8.06f, 69.73f, -19.73f);
        pathBuilder2.curveTo(227.83f, 150.44f, 240.0f, 132.0f, 240.0f, 112.0f);
        pathBuilder2.reflectiveCurveTo(227.83f, 73.52f, 205.73f, 59.93f);
        pathBuilder2.close();
        pathBuilder2.moveTo(67.41f, 155.18f);
        pathBuilder2.curveToRelative(5.24f, -9.55f, 15.45f, -12.0f, 23.53f, -11.0f);
        pathBuilder2.curveToRelative(10.9f, 1.42f, 21.86f, 9.13f, 26.61f, 23.42f);
        pathBuilder2.curveTo(99.11f, 166.45f, 81.85f, 162.16f, 67.41f, 155.18f);
        pathBuilder2.close();
        pathBuilder2.moveTo(197.35f, 150.41f);
        pathBuilder2.curveToRelative(-16.95f, 10.43f, -39.17f, 16.53f, -63.13f, 17.43f);
        pathBuilder2.arcToRelative(54.37f, 54.37f, 0.0f, false, false, -11.39f, -23.07f);
        pathBuilder2.arcTo(47.17f, 47.17f, 0.0f, false, false, 93.0f, 128.35f);
        pathBuilder2.curveToRelative(-17.0f, -2.2f, -31.72f, 5.11f, -39.38f, 18.7f);
        pathBuilder2.curveTo(39.64f, 137.0f, 32.0f, 124.73f, 32.0f, 112.0f);
        pathBuilder2.curveToRelative(0.0f, -14.21f, 9.47f, -27.86f, 26.65f, -38.43f);
        pathBuilder2.curveTo(77.05f, 62.23f, 101.68f, 56.0f, 128.0f, 56.0f);
        pathBuilder2.reflectiveCurveTo(179.0f, 62.23f, 197.35f, 73.55f);
        pathBuilder2.curveTo(214.53f, 84.12f, 224.0f, 97.77f, 224.0f, 112.0f);
        pathBuilder2.reflectiveCurveTo(214.53f, 139.84f, 197.35f, 150.41f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lasso = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
