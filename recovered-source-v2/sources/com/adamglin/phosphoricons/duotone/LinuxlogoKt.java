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

/* compiled from: Linuxlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LinuxLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getLinuxLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_linuxLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinuxlogoKt {
    private static ImageVector _linuxLogo;

    public static final ImageVector getLinuxLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _linuxLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LinuxLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 208.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.curveToRelative(-8.0f, -14.35f, -22.91f, -24.0f, -40.0f, -24.0f);
        pathBuilder.reflectiveCurveToRelative(-32.0f, 9.65f, -40.0f, 24.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.reflectiveCurveTo(64.0f, 168.0f, 64.0f, 88.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f);
        pathBuilder.curveTo(192.0f, 168.0f, 224.0f, 208.0f, 224.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(229.0f, 214.25f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 217.76f, 213.0f);
        pathBuilder2.curveTo(216.39f, 211.27f, 184.0f, 169.86f, 184.0f, 88.0f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, false, false, 72.0f, 88.0f);
        pathBuilder2.curveToRelative(0.0f, 81.86f, -32.37f, 123.27f, -33.75f, 125.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.51f, -10.0f);
        pathBuilder2.curveToRelative(0.15f, -0.2f, 7.69f, -9.9f, 15.13f, -28.74f);
        pathBuilder2.curveTo(47.77f, 156.8f, 56.0f, 127.64f, 56.0f, 88.0f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, 39.64f, 8.23f, 68.8f, 15.13f, 86.28f);
        pathBuilder2.curveToRelative(7.48f, 18.94f, 15.06f, 28.64f, 15.14f, 28.74f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 229.0f, 214.25f);
        pathBuilder2.close();
        pathBuilder2.moveTo(100.0f, 88.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(168.0f, 100.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 100.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(99.58f, 128.84f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.15f, 14.31f);
        pathBuilder2.lineToRelative(32.0f, 16.0f);
        pathBuilder2.arcToRelative(7.94f, 7.94f, 0.0f, false, false, 7.15f, 0.0f);
        pathBuilder2.lineToRelative(32.0f, -16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, -14.31f);
        pathBuilder2.lineTo(128.0f, 143.05f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 176.0f);
        pathBuilder2.arcToRelative(54.07f, 54.07f, 0.0f, false, false, -47.0f, 28.11f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.0f, 7.78f);
        pathBuilder2.arcToRelative(37.35f, 37.35f, 0.0f, false, true, 66.0f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.0f, -7.78f);
        pathBuilder2.arcTo(54.07f, 54.07f, 0.0f, false, false, 128.0f, 176.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _linuxLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
