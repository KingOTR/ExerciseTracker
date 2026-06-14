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

/* compiled from: Linuxlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LinuxLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLinuxLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_linuxLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinuxlogoKt {
    private static ImageVector _linuxLogo;

    public static final ImageVector getLinuxLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(227.74f, 212.69f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.42f, -0.94f);
        pathBuilder.curveTo(218.0f, 210.05f, 186.0f, 169.17f, 186.0f, 88.0f);
        pathBuilder.arcTo(58.0f, 58.0f, 0.0f, false, false, 70.0f, 88.0f);
        pathBuilder.curveToRelative(0.0f, 81.17f, -31.95f, 122.05f, -33.31f, 123.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.38f, -7.49f);
        pathBuilder.curveTo(27.68f, 203.79f, 58.0f, 164.56f, 58.0f, 88.0f);
        pathBuilder.arcToRelative(70.0f, 70.0f, 0.0f, false, true, 140.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 76.63f, 30.38f, 115.87f, 30.69f, 116.26f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 227.74f, 212.69f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 90.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 100.0f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(166.0f, 100.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 166.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(98.69f, 130.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.37f, 10.74f);
        pathBuilder.lineToRelative(32.0f, 16.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 158.0f);
        pathBuilder.arcToRelative(6.07f, 6.07f, 0.0f, false, false, 2.69f, -0.63f);
        pathBuilder.lineToRelative(32.0f, -16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.37f, -10.74f);
        pathBuilder.lineTo(128.0f, 145.29f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 178.0f);
        pathBuilder.arcToRelative(52.07f, 52.07f, 0.0f, false, false, -45.24f, 27.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.49f, 5.84f);
        pathBuilder.arcToRelative(39.33f, 39.33f, 0.0f, false, true, 69.51f, 0.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 168.0f, 214.0f);
        pathBuilder.arcToRelative(5.89f, 5.89f, 0.0f, false, false, 2.91f, -0.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.33f, -8.16f);
        pathBuilder.arcTo(52.09f, 52.09f, 0.0f, false, false, 128.0f, 178.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _linuxLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
