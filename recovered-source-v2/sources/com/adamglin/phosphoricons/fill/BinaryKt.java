package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Binary.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Binary", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBinary", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_binary", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BinaryKt {
    private static ImageVector _binary;

    public static final ImageVector getBinary(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _binary;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Binary", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 168.0f);
        pathBuilder.curveToRelative(0.0f, 4.75f, -1.11f, 9.16f, -3.05f, 12.11f);
        pathBuilder.arcTo(7.77f, 7.77f, 0.0f, false, true, 158.0f, 184.0f);
        pathBuilder.curveToRelative(-9.72f, 0.0f, -10.0f, -14.36f, -10.0f, -16.0f);
        pathBuilder.curveToRelative(0.0f, -4.74f, 1.11f, -9.16f, 3.05f, -12.11f);
        pathBuilder.arcTo(7.77f, 7.77f, 0.0f, false, true, 158.0f, 152.0f);
        pathBuilder.curveTo(167.72f, 152.0f, 168.0f, 166.36f, 168.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 48.0f);
        pathBuilder.lineTo(224.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(48.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(32.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f);
        pathBuilder.lineTo(208.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.84f, 75.58f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.74f, 3.58f);
        pathBuilder.lineTo(156.0f, 76.94f);
        pathBuilder.lineTo(156.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(172.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.58f, -7.16f);
        pathBuilder.lineToRelative(-16.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 140.84f, 75.58f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.58f, -7.16f);
        pathBuilder.lineToRelative(-16.0f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 14.32f);
        pathBuilder.lineTo(96.0f, 156.94f);
        pathBuilder.lineTo(96.0f, 192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 88.0f);
        pathBuilder.curveToRelative(0.0f, -18.84f, -10.69f, -32.0f, -26.0f, -32.0f);
        pathBuilder.reflectiveCurveTo(76.0f, 69.16f, 76.0f, 88.0f);
        pathBuilder.reflectiveCurveToRelative(10.69f, 32.0f, 26.0f, 32.0f);
        pathBuilder.reflectiveCurveTo(128.0f, 106.84f, 128.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 168.0f);
        pathBuilder.curveToRelative(0.0f, -18.84f, -10.69f, -32.0f, -26.0f, -32.0f);
        pathBuilder.reflectiveCurveToRelative(-26.0f, 13.16f, -26.0f, 32.0f);
        pathBuilder.reflectiveCurveToRelative(10.69f, 32.0f, 26.0f, 32.0f);
        pathBuilder.reflectiveCurveTo(184.0f, 186.84f, 184.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(102.0f, 72.0f);
        pathBuilder.arcToRelative(7.77f, 7.77f, 0.0f, false, false, -7.0f, 3.89f);
        pathBuilder.curveToRelative(-1.94f, 3.0f, -3.0f, 7.37f, -3.0f, 12.11f);
        pathBuilder.curveToRelative(0.0f, 1.64f, 0.28f, 16.0f, 10.0f, 16.0f);
        pathBuilder.arcToRelative(7.77f, 7.77f, 0.0f, false, false, 7.0f, -3.89f);
        pathBuilder.curveToRelative(1.94f, -3.0f, 3.0f, -7.36f, 3.0f, -12.11f);
        pathBuilder.curveTo(112.0f, 86.36f, 111.72f, 72.0f, 102.0f, 72.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _binary = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
