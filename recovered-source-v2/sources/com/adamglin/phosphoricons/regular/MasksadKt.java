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

/* compiled from: Masksad.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MaskSad", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getMaskSad", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_maskSad", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MasksadKt {
    private static ImageVector _maskSad;

    public static final ImageVector getMaskSad(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _maskSad;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MaskSad", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(158.66f, 188.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.09f, 2.23f);
        pathBuilder.curveTo(141.07f, 186.34f, 136.0f, 184.0f, 128.0f, 184.0f);
        pathBuilder.reflectiveCurveToRelative(-13.07f, 2.34f, -19.57f, 6.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.86f, -13.32f);
        pathBuilder.curveTo(108.0f, 171.73f, 116.06f, 168.0f, 128.0f, 168.0f);
        pathBuilder.reflectiveCurveToRelative(20.0f, 3.73f, 28.43f, 9.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 158.66f, 188.43f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 48.0f);
        pathBuilder.verticalLineToRelative(55.77f);
        pathBuilder.curveToRelative(0.0f, 35.84f, -9.65f, 69.65f, -27.18f, 95.18f);
        pathBuilder.curveToRelative(-18.16f, 26.46f, -42.6f, 41.0f, -68.82f, 41.0f);
        pathBuilder.reflectiveCurveToRelative(-50.66f, -14.57f, -68.82f, -41.0f);
        pathBuilder.curveTo(41.65f, 173.44f, 32.0f, 139.63f, 32.0f, 103.79f);
        pathBuilder.lineTo(32.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 53.79f, 33.09f);
        pathBuilder.curveTo(67.84f, 38.55f, 96.18f, 47.71f, 128.0f, 47.71f);
        pathBuilder.reflectiveCurveToRelative(60.15f, -9.16f, 74.21f, -14.62f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 48.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-15.1f, 5.89f, -45.57f, 15.73f, -80.0f, 15.73f);
        pathBuilder.reflectiveCurveTo(63.1f, 53.87f, 48.0f, 48.0f);
        pathBuilder.verticalLineToRelative(55.79f);
        pathBuilder.curveToRelative(0.0f, 32.64f, 8.66f, 63.23f, 24.37f, 86.13f);
        pathBuilder.curveTo(87.46f, 211.9f, 107.21f, 224.0f, 128.0f, 224.0f);
        pathBuilder.reflectiveCurveToRelative(40.54f, -12.1f, 55.63f, -34.08f);
        pathBuilder.curveTo(199.34f, 167.0f, 208.0f, 136.43f, 208.0f, 103.79f);
        pathBuilder.close();
        pathBuilder.moveTo(189.34f, 114.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 0.62f);
        pathBuilder.curveToRelative(-2.68f, 3.0f, -8.85f, 5.34f, -14.0f, 5.34f);
        pathBuilder.reflectiveCurveToRelative(-11.36f, -2.35f, -14.0f, -5.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 138.0f, 125.33f);
        pathBuilder.curveToRelative(5.71f, 6.38f, 16.14f, 10.67f, 26.0f, 10.67f);
        pathBuilder.reflectiveCurveToRelative(20.25f, -4.29f, 26.0f, -10.67f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 189.34f, 114.0f);
        pathBuilder.close();
        pathBuilder.moveTo(118.0f, 125.33f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 106.0f, 114.66f);
        pathBuilder.curveToRelative(-2.68f, 3.0f, -8.85f, 5.34f, -14.0f, 5.34f);
        pathBuilder.reflectiveCurveToRelative(-11.36f, -2.35f, -14.0f, -5.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 66.0f, 125.33f);
        pathBuilder.curveTo(71.75f, 131.71f, 82.18f, 136.0f, 92.0f, 136.0f);
        pathBuilder.reflectiveCurveTo(112.25f, 131.71f, 118.0f, 125.33f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _maskSad = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
