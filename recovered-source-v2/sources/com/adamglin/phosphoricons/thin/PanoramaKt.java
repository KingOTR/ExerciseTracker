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

/* compiled from: Panorama.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Panorama", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPanorama", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_panorama", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PanoramaKt {
    private static ImageVector _panorama;

    public static final ImageVector getPanorama(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _panorama;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Panorama", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(239.31f, 54.49f);
        pathBuilder.arcToRelative(11.88f, 11.88f, 0.0f, false, false, -10.39f, -2.08f);
        pathBuilder.lineToRelative(-3.47f, 0.93f);
        pathBuilder.curveTo(206.47f, 58.47f, 171.14f, 68.0f, 128.0f, 68.0f);
        pathBuilder.reflectiveCurveTo(49.53f, 58.47f, 30.55f, 53.34f);
        pathBuilder.lineToRelative(-3.47f, -0.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 64.0f);
        pathBuilder.lineTo(12.0f, 192.0f);
        pathBuilder.arcToRelative(11.95f, 11.95f, 0.0f, false, false, 15.09f, 11.59f);
        pathBuilder.lineToRelative(3.18f, -0.85f);
        pathBuilder.curveTo(49.27f, 197.58f, 84.64f, 188.0f, 128.0f, 188.0f);
        pathBuilder.reflectiveCurveToRelative(78.73f, 9.58f, 97.73f, 14.73f);
        pathBuilder.lineToRelative(3.18f, 0.85f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 192.0f);
        pathBuilder.lineTo(244.0f, 64.0f);
        pathBuilder.arcTo(11.92f, 11.92f, 0.0f, false, false, 239.31f, 54.49f);
        pathBuilder.close();
        pathBuilder.moveTo(21.57f, 60.83f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 24.0f, 60.0f);
        pathBuilder.arcToRelative(4.19f, 4.19f, 0.0f, false, true, 1.0f, 0.14f);
        pathBuilder.lineToRelative(3.44f, 0.93f);
        pathBuilder.curveTo(47.8f, 66.29f, 83.8f, 76.0f, 128.0f, 76.0f);
        pathBuilder.reflectiveCurveToRelative(80.2f, -9.71f, 99.54f, -14.93f);
        pathBuilder.lineToRelative(3.45f, -0.93f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 64.0f);
        pathBuilder.lineTo(236.0f, 192.0f);
        pathBuilder.curveToRelative(0.0f, 0.13f, 0.0f, 0.24f, 0.0f, 0.37f);
        pathBuilder.lineToRelative(-64.85f, -64.85f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineToRelative(-22.83f, 22.83f);
        pathBuilder.lineTo(84.49f, 103.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineTo(20.0f, 151.0f);
        pathBuilder.lineTo(20.0f, 64.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 21.57f, 60.83f);
        pathBuilder.close();
        pathBuilder.moveTo(28.17f, 195.0f);
        pathBuilder.lineToRelative(-3.15f, 0.85f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 192.0f);
        pathBuilder.lineTo(20.0f, 162.34f);
        pathBuilder.lineToRelative(53.17f, -53.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.lineToRelative(71.67f, 71.67f);
        pathBuilder.curveToRelative(-7.24f, -0.53f, -14.76f, -0.84f, -22.5f, -0.84f);
        pathBuilder.curveTo(83.57f, 180.0f, 46.16f, 190.13f, 28.17f, 195.0f);
        pathBuilder.close();
        pathBuilder.moveTo(163.0f, 182.0f);
        pathBuilder.lineToRelative(-26.0f, -26.0f);
        pathBuilder.lineToRelative(22.83f, -22.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.lineToRelative(61.64f, 61.64f);
        pathBuilder.curveTo(214.0f, 191.25f, 191.11f, 185.14f, 163.0f, 182.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 108.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 196.0f, 108.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _panorama = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
