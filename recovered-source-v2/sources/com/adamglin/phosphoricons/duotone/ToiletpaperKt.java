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

/* compiled from: Toiletpaper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ToiletPaper", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getToiletPaper", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_toiletPaper", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToiletpaperKt {
    private static ImageVector _toiletPaper;

    public static final ImageVector getToiletPaper(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _toiletPaper;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ToiletPaper", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(104.0f, 120.0f);
        pathBuilder.curveToRelative(0.0f, 44.18f, -17.91f, 80.0f, -40.0f, 80.0f);
        pathBuilder.reflectiveCurveToRelative(-40.0f, -35.82f, -40.0f, -80.0f);
        pathBuilder.reflectiveCurveTo(41.91f, 40.0f, 64.0f, 40.0f);
        pathBuilder.reflectiveCurveTo(104.0f, 75.82f, 104.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(76.0f, 120.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 76.0f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(240.0f, 120.0f);
        pathBuilder2.verticalLineToRelative(88.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder2.lineTo(112.0f, 224.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder2.lineTo(96.0f, 186.35f);
        pathBuilder2.curveTo(87.37f, 200.37f, 76.18f, 208.0f, 64.0f, 208.0f);
        pathBuilder2.curveToRelative(-13.87f, 0.0f, -26.46f, -9.89f, -35.44f, -27.85f);
        pathBuilder2.curveTo(20.46f, 164.0f, 16.0f, 142.59f, 16.0f, 120.0f);
        pathBuilder2.reflectiveCurveToRelative(4.46f, -43.95f, 12.56f, -60.15f);
        pathBuilder2.curveTo(37.54f, 41.89f, 50.13f, 32.0f, 64.0f, 32.0f);
        pathBuilder2.lineTo(192.0f, 32.0f);
        pathBuilder2.curveToRelative(13.87f, 0.0f, 26.46f, 9.89f, 35.44f, 27.85f);
        pathBuilder2.curveTo(235.54f, 76.05f, 240.0f, 97.41f, 240.0f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(96.0f, 120.0f);
        pathBuilder2.curveToRelative(0.0f, -42.43f, -16.86f, -72.0f, -32.0f, -72.0f);
        pathBuilder2.reflectiveCurveTo(32.0f, 77.57f, 32.0f, 120.0f);
        pathBuilder2.reflectiveCurveToRelative(16.86f, 72.0f, 32.0f, 72.0f);
        pathBuilder2.reflectiveCurveTo(96.0f, 162.43f, 96.0f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 208.0f);
        pathBuilder2.lineTo(224.0f, 128.0f);
        pathBuilder2.lineTo(208.0f, 128.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(15.79f);
        pathBuilder2.curveTo(221.84f, 73.9f, 206.16f, 48.0f, 192.0f, 48.0f);
        pathBuilder2.lineTo(92.12f, 48.0f);
        pathBuilder2.arcToRelative(73.6f, 73.6f, 0.0f, false, true, 7.32f, 11.85f);
        pathBuilder2.curveToRelative(7.14f, 14.28f, 11.44f, 32.56f, 12.37f, 52.15f);
        pathBuilder2.lineTo(128.0f, 112.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.lineTo(112.0f, 128.0f);
        pathBuilder2.verticalLineToRelative(80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(176.0f, 112.0f);
        pathBuilder2.lineTo(160.0f, 112.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _toiletPaper = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
