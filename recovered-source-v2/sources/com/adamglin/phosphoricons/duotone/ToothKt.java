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

/* compiled from: Tooth.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tooth", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTooth", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tooth", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToothKt {
    private static ImageVector _tooth;

    public static final ImageVector getTooth(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _tooth;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tooth", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 79.76f);
        pathBuilder.curveToRelative(0.07f, 71.42f, -23.48f, 128.23f, -44.0f, 142.78f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.52f, -6.0f);
        pathBuilder.curveTo(158.0f, 196.31f, 152.0f, 160.0f, 128.0f, 160.0f);
        pathBuilder.reflectiveCurveToRelative(-30.0f, 36.31f, -31.51f, 56.53f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.52f, 6.0f);
        pathBuilder.curveTo(63.48f, 208.0f, 39.93f, 151.18f, 40.0f, 79.76f);
        pathBuilder.arcTo(47.94f, 47.94f, 0.0f, false, true, 88.0f, 32.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcTo(47.94f, 47.94f, 0.0f, false, true, 216.0f, 79.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(171.0f, 71.42f);
        pathBuilder2.lineTo(149.54f, 80.0f);
        pathBuilder2.lineTo(171.0f, 88.57f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 165.0f, 103.42f);
        pathBuilder2.lineTo(128.0f, 88.61f);
        pathBuilder2.lineTo(91.0f, 103.42f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 85.0f, 88.57f);
        pathBuilder2.lineTo(106.46f, 80.0f);
        pathBuilder2.lineTo(85.0f, 71.42f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 91.0f, 56.57f);
        pathBuilder2.lineToRelative(37.0f, 14.81f);
        pathBuilder2.lineToRelative(37.0f, -14.81f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 171.0f, 71.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 79.75f);
        pathBuilder2.curveToRelative(0.0f, 42.72f, -8.0f, 75.4f, -14.7f, 95.28f);
        pathBuilder2.curveToRelative(-8.72f, 25.8f, -20.62f, 45.49f, -32.64f, 54.0f);
        pathBuilder2.arcToRelative(15.69f, 15.69f, 0.0f, false, true, -15.95f, 1.41f);
        pathBuilder2.arcToRelative(16.09f, 16.09f, 0.0f, false, true, -9.18f, -13.36f);
        pathBuilder2.curveTo(150.68f, 205.58f, 146.48f, 168.0f, 128.0f, 168.0f);
        pathBuilder2.reflectiveCurveToRelative(-22.68f, 37.59f, -23.53f, 49.11f);
        pathBuilder2.arcToRelative(16.09f, 16.09f, 0.0f, false, true, -16.0f, 14.9f);
        pathBuilder2.arcToRelative(15.67f, 15.67f, 0.0f, false, true, -9.13f, -2.95f);
        pathBuilder2.curveToRelative(-12.0f, -8.53f, -23.92f, -28.22f, -32.64f, -54.0f);
        pathBuilder2.curveTo(40.0f, 155.15f, 32.0f, 122.47f, 32.0f, 79.75f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, false, true, 88.0f, 24.0f);
        pathBuilder2.horizontalLineToRelative(80.0f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, false, true, 224.0f, 79.75f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 79.75f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, false, 168.0f, 40.0f);
        pathBuilder2.lineTo(88.0f, 40.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, false, 48.0f, 79.76f);
        pathBuilder2.curveToRelative(0.0f, 40.55f, 7.51f, 71.4f, 13.85f, 90.14f);
        pathBuilder2.curveToRelative(11.05f, 32.66f, 23.0f, 43.37f, 26.61f, 46.0f);
        pathBuilder2.curveTo(91.57f, 174.67f, 105.59f, 152.0f, 128.0f, 152.0f);
        pathBuilder2.reflectiveCurveToRelative(36.45f, 22.71f, 39.49f, 63.94f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(3.6f, -2.59f, 15.57f, -13.26f, 26.66f, -46.0f);
        pathBuilder2.curveTo(200.49f, 151.16f, 208.0f, 120.31f, 208.0f, 79.76f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tooth = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
