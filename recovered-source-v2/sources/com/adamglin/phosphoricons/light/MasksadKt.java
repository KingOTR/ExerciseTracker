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

/* compiled from: Masksad.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MaskSad", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMaskSad", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_maskSad", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MasksadKt {
    private static ImageVector _maskSad;

    public static final ImageVector getMaskSad(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(157.0f, 187.32f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.32f, 1.67f);
        pathBuilder.curveToRelative(-6.67f, -4.43f, -12.19f, -7.0f, -20.68f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(-14.0f, 2.56f, -20.68f, 7.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.64f, -10.0f);
        pathBuilder.curveToRelative(8.13f, -5.4f, 15.88f, -9.0f, 27.32f, -9.0f);
        pathBuilder.reflectiveCurveToRelative(19.19f, 3.6f, 27.32f, 9.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 157.0f, 187.32f);
        pathBuilder.close();
        pathBuilder.moveTo(179.53f, 116.0f);
        pathBuilder.curveToRelative(-3.06f, 3.42f, -9.74f, 6.0f, -15.53f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-12.47f, -2.58f, -15.53f, -6.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.94f, 8.0f);
        pathBuilder.curveToRelative(5.35f, 6.0f, 15.19f, 10.0f, 24.47f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(19.12f, -4.0f, 24.47f, -10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.94f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 48.0f);
        pathBuilder.verticalLineToRelative(55.77f);
        pathBuilder.curveToRelative(0.0f, 35.45f, -9.53f, 68.86f, -26.83f, 94.06f);
        pathBuilder.curveTo(177.4f, 223.74f, 153.54f, 238.0f, 128.0f, 238.0f);
        pathBuilder.reflectiveCurveToRelative(-49.4f, -14.26f, -67.17f, -40.16f);
        pathBuilder.curveTo(43.53f, 172.64f, 34.0f, 139.23f, 34.0f, 103.78f);
        pathBuilder.lineTo(34.0f, 48.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 53.06f, 35.0f);
        pathBuilder.curveTo(67.25f, 40.46f, 95.86f, 49.7f, 128.0f, 49.7f);
        pathBuilder.reflectiveCurveTo(188.75f, 40.46f, 202.94f, 35.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 48.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.72f, -1.87f);
        pathBuilder.curveTo(192.31f, 52.0f, 162.1f, 61.7f, 128.0f, 61.7f);
        pathBuilder.reflectiveCurveTo(63.69f, 52.0f, 48.72f, 46.14f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.85f, 0.21f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 46.0f, 48.0f);
        pathBuilder.verticalLineToRelative(55.76f);
        pathBuilder.curveTo(46.0f, 171.17f, 82.79f, 226.0f, 128.0f, 226.0f);
        pathBuilder.reflectiveCurveToRelative(82.0f, -54.83f, 82.0f, -122.22f);
        pathBuilder.close();
        pathBuilder.moveTo(116.47f, 124.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.94f, -8.0f);
        pathBuilder.curveToRelative(-3.06f, 3.42f, -9.74f, 6.0f, -15.53f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-12.47f, -2.58f, -15.53f, -6.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.94f, 8.0f);
        pathBuilder.curveToRelative(5.35f, 6.0f, 15.19f, 10.0f, 24.47f, 10.0f);
        pathBuilder.reflectiveCurveTo(111.12f, 130.0f, 116.47f, 124.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _maskSad = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
