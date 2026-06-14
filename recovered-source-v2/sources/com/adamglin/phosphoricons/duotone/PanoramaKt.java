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

/* compiled from: Panorama.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Panorama", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPanorama", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_panorama", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PanoramaKt {
    private static ImageVector _panorama;

    public static final ImageVector getPanorama(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(240.0f, 64.0f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.47f, 6.6f);
        pathBuilder.lineToRelative(-68.25f, -68.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 0.0f);
        pathBuilder.lineTo(131.31f, 156.0f);
        pathBuilder.lineTo(81.66f, 106.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f);
        pathBuilder.lineTo(16.0f, 160.69f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.05f, -7.74f);
        pathBuilder.curveTo(43.35f, 60.89f, 81.44f, 72.0f, 128.0f, 72.0f);
        pathBuilder.reflectiveCurveTo(212.65f, 60.89f, 230.0f, 56.27f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(241.75f, 51.32f);
        pathBuilder2.arcToRelative(15.88f, 15.88f, 0.0f, false, false, -13.86f, -2.77f);
        pathBuilder2.lineToRelative(-3.48f, 0.94f);
        pathBuilder2.curveTo(205.61f, 54.56f, 170.61f, 64.0f, 128.0f, 64.0f);
        pathBuilder2.reflectiveCurveTo(50.39f, 54.56f, 31.59f, 49.49f);
        pathBuilder2.lineToRelative(-3.48f, -0.94f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 8.0f, 64.0f);
        pathBuilder2.verticalLineTo(192.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.arcToRelative(16.22f, 16.22f, 0.0f, false, false, 4.18f, -0.55f);
        pathBuilder2.lineToRelative(3.18f, -0.86f);
        pathBuilder2.curveTo(50.13f, 201.49f, 85.17f, 192.0f, 128.0f, 192.0f);
        pathBuilder2.reflectiveCurveToRelative(77.87f, 9.49f, 96.69f, 14.59f);
        pathBuilder2.lineToRelative(3.18f, 0.86f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 248.0f, 192.0f);
        pathBuilder2.verticalLineTo(64.0f);
        pathBuilder2.arcTo(15.9f, 15.9f, 0.0f, false, false, 241.75f, 51.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(27.42f, 64.93f);
        pathBuilder2.curveTo(46.94f, 70.2f, 83.27f, 80.0f, 128.0f, 80.0f);
        pathBuilder2.reflectiveCurveToRelative(81.06f, -9.8f, 100.58f, -15.07f);
        pathBuilder2.lineTo(232.0f, 64.0f);
        pathBuilder2.verticalLineTo(182.76f);
        pathBuilder2.lineToRelative(-58.07f, -58.07f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f);
        pathBuilder2.lineToRelative(-20.0f, 20.0f);
        pathBuilder2.lineToRelative(-44.0f, -44.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f);
        pathBuilder2.lineTo(24.0f, 141.37f);
        pathBuilder2.verticalLineTo(64.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(213.84f, 187.21f);
        pathBuilder2.arcToRelative(391.22f, 391.22f, 0.0f, false, false, -49.0f, -9.0f);
        pathBuilder2.lineTo(142.63f, 156.0f);
        pathBuilder2.lineToRelative(20.0f, -20.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(27.13f, 191.14f);
        pathBuilder2.lineTo(24.0f, 192.0f);
        pathBuilder2.verticalLineTo(164.0f);
        pathBuilder2.lineToRelative(52.0f, -52.0f);
        pathBuilder2.lineToRelative(64.25f, 64.25f);
        pathBuilder2.quadToRelative(-6.0f, -0.24f, -12.25f, -0.25f);
        pathBuilder2.curveTo(83.0f, 176.0f, 45.28f, 186.23f, 27.13f, 191.14f);
        pathBuilder2.close();
        pathBuilder2.moveTo(192.0f, 108.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 108.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _panorama = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
