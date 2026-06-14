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

/* compiled from: Handeye.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandEye", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHandEye", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handEye", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandeyeKt {
    private static ImageVector _handEye;

    public static final ImageVector getHandEye(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _handEye;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandEye", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(188.0f, 96.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f);
        pathBuilder.verticalLineTo(60.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f);
        pathBuilder.verticalLineTo(44.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, 160.0f, 0.0f);
        pathBuilder.verticalLineTo(116.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 188.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 200.0f);
        pathBuilder.curveToRelative(-32.0f, 0.0f, -48.0f, -32.0f, -48.0f, -32.0f);
        pathBuilder.reflectiveCurveToRelative(16.0f, -32.0f, 48.0f, -32.0f);
        pathBuilder.reflectiveCurveToRelative(48.0f, 32.0f, 48.0f, 32.0f);
        pathBuilder.reflectiveCurveTo(160.0f, 200.0f, 128.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(188.0f, 88.0f);
        pathBuilder2.arcToRelative(27.75f, 27.75f, 0.0f, false, false, -12.0f, 2.71f);
        pathBuilder2.lineTo(176.0f, 60.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -41.36f, -24.6f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, false, 80.0f, 44.0f);
        pathBuilder2.verticalLineToRelative(6.71f);
        pathBuilder2.arcTo(27.75f, 27.75f, 0.0f, false, false, 68.0f, 48.0f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, false, 40.0f, 76.0f);
        pathBuilder2.verticalLineToRelative(76.0f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f);
        pathBuilder2.lineTo(216.0f, 116.0f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, false, 188.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 152.0f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, false, true, -144.0f, 0.0f);
        pathBuilder2.lineTo(56.0f, 76.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(36.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(96.0f, 44.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(60.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(136.0f, 60.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(60.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(140.0f, 168.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 168.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 128.0f);
        pathBuilder2.curveToRelative(-36.52f, 0.0f, -54.41f, 34.94f, -55.16f, 36.42f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 7.16f);
        pathBuilder2.curveTo(73.59f, 173.06f, 91.48f, 208.0f, 128.0f, 208.0f);
        pathBuilder2.reflectiveCurveToRelative(54.41f, -34.94f, 55.16f, -36.42f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -7.16f);
        pathBuilder2.curveTo(182.41f, 162.94f, 164.52f, 128.0f, 128.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 192.0f);
        pathBuilder2.curveToRelative(-20.63f, 0.0f, -33.8f, -16.52f, -38.7f, -24.0f);
        pathBuilder2.curveToRelative(4.9f, -7.48f, 18.07f, -24.0f, 38.7f, -24.0f);
        pathBuilder2.reflectiveCurveToRelative(33.81f, 16.53f, 38.7f, 24.0f);
        pathBuilder2.curveTo(161.8f, 175.48f, 148.63f, 192.0f, 128.0f, 192.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handEye = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
