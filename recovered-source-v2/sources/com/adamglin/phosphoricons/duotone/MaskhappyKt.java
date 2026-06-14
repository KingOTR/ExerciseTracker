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

/* compiled from: Maskhappy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MaskHappy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMaskHappy", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_maskHappy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaskhappyKt {
    private static ImageVector _maskHappy;

    public static final ImageVector getMaskHappy(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _maskHappy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MaskHappy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 48.0f);
        pathBuilder.verticalLineToRelative(55.77f);
        pathBuilder.curveTo(216.0f, 174.6f, 176.6f, 232.0f, 128.0f, 232.0f);
        pathBuilder.reflectiveCurveTo(40.0f, 174.6f, 40.0f, 103.79f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.89f, -7.47f);
        pathBuilder.curveTo(66.0f, 46.41f, 95.11f, 55.71f, 128.0f, 55.71f);
        pathBuilder.reflectiveCurveToRelative(62.0f, -9.3f, 77.11f, -15.16f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(217.0f, 34.8f);
        pathBuilder2.arcToRelative(15.94f, 15.94f, 0.0f, false, false, -14.82f, -1.71f);
        pathBuilder2.curveTo(188.15f, 38.55f, 159.82f, 47.71f, 128.0f, 47.71f);
        pathBuilder2.reflectiveCurveTo(67.84f, 38.55f, 53.79f, 33.09f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f);
        pathBuilder2.verticalLineToRelative(55.77f);
        pathBuilder2.curveToRelative(0.0f, 35.84f, 9.65f, 69.65f, 27.18f, 95.18f);
        pathBuilder2.curveToRelative(18.16f, 26.46f, 42.6f, 41.0f, 68.82f, 41.0f);
        pathBuilder2.reflectiveCurveToRelative(50.66f, -14.57f, 68.82f, -41.0f);
        pathBuilder2.curveTo(214.35f, 173.44f, 224.0f, 139.63f, 224.0f, 103.79f);
        pathBuilder2.lineTo(224.0f, 48.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 217.0f, 34.8f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 103.8f);
        pathBuilder2.curveToRelative(0.0f, 32.64f, -8.66f, 63.23f, -24.37f, 86.13f);
        pathBuilder2.curveTo(168.54f, 211.9f, 148.79f, 224.0f, 128.0f, 224.0f);
        pathBuilder2.reflectiveCurveToRelative(-40.54f, -12.1f, -55.63f, -34.08f);
        pathBuilder2.curveTo(56.66f, 167.0f, 48.0f, 136.43f, 48.0f, 103.79f);
        pathBuilder2.lineTo(48.0f, 48.0f);
        pathBuilder2.curveToRelative(15.11f, 5.87f, 45.58f, 15.71f, 80.0f, 15.71f);
        pathBuilder2.reflectiveCurveTo(192.9f, 53.87f, 208.0f, 48.0f);
        pathBuilder2.verticalLineToRelative(55.81f);
        pathBuilder2.close();
        pathBuilder2.moveTo(190.0f, 122.67f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 178.0f, 133.33f);
        pathBuilder2.curveToRelative(-2.68f, -3.0f, -8.85f, -5.33f, -14.0f, -5.33f);
        pathBuilder2.reflectiveCurveToRelative(-11.36f, 2.34f, -14.0f, 5.33f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 138.0f, 122.66f);
        pathBuilder2.curveToRelative(5.71f, -6.38f, 16.14f, -10.66f, 26.0f, -10.66f);
        pathBuilder2.reflectiveCurveTo(184.25f, 116.28f, 190.0f, 122.66f);
        pathBuilder2.close();
        pathBuilder2.moveTo(92.0f, 128.0f);
        pathBuilder2.curveToRelative(-5.19f, 0.0f, -11.36f, 2.34f, -14.0f, 5.33f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 66.0f, 122.66f);
        pathBuilder2.curveTo(71.75f, 116.28f, 82.18f, 112.0f, 92.0f, 112.0f);
        pathBuilder2.reflectiveCurveToRelative(20.25f, 4.28f, 26.0f, 10.66f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 106.0f, 133.33f);
        pathBuilder2.curveTo(103.36f, 130.34f, 97.19f, 128.0f, 92.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(168.45f, 173.19f);
        pathBuilder2.arcToRelative(52.9f, 52.9f, 0.0f, false, true, -80.9f, 0.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 99.72f, 162.8f);
        pathBuilder2.arcToRelative(36.89f, 36.89f, 0.0f, false, false, 56.56f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.17f, 10.39f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _maskHappy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
