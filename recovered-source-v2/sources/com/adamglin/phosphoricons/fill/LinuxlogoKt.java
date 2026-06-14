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

/* compiled from: Linuxlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LinuxLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getLinuxLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_linuxLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinuxlogoKt {
    private static ImageVector _linuxLogo;

    public static final ImageVector getLinuxLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(161.22f, 209.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.31f, 6.26f);
        pathBuilder.lineTo(98.1f, 216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.31f, -6.26f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 66.43f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.15f, 213.11f);
        pathBuilder.arcToRelative(8.29f, 8.29f, 0.0f, false, true, -6.43f, 2.89f);
        pathBuilder.lineTo(184.56f, 216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.76f, -2.65f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, -105.59f, 0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 71.45f, 216.0f);
        pathBuilder.lineTo(32.23f, 216.0f);
        pathBuilder.arcToRelative(8.2f, 8.2f, 0.0f, false, true, -6.42f, -2.93f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 25.75f, 203.0f);
        pathBuilder.curveToRelative(0.06f, -0.07f, 7.64f, -9.78f, 15.12f, -28.72f);
        pathBuilder.curveTo(47.77f, 156.8f, 56.0f, 127.64f, 56.0f, 88.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 39.64f, 8.23f, 68.8f, 15.13f, 86.28f);
        pathBuilder.curveToRelative(7.48f, 18.94f, 15.06f, 28.65f, 15.13f, 28.74f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 230.15f, 213.11f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(167.16f, 132.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.73f, -3.58f);
        pathBuilder.lineTo(128.0f, 143.06f);
        pathBuilder.lineTo(99.58f, 128.84f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.15f, 14.32f);
        pathBuilder.lineToRelative(32.0f, 16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.15f, 0.0f);
        pathBuilder.lineToRelative(32.0f, -16.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 167.16f, 132.42f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 100.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _linuxLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
