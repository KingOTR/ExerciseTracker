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

/* compiled from: Windowslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WindowsLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getWindowsLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_windowsLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WindowslogoKt {
    private static ImageVector _windowsLogo;

    public static final ImageVector getWindowsLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _windowsLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WindowsLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 140.0f);
        pathBuilder.lineTo(128.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(57.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.28f, 3.94f);
        pathBuilder.lineToRelative(80.0f, 14.55f);
        pathBuilder.arcToRelative(4.37f, 4.37f, 0.0f, false, false, 0.72f, 0.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.56f, -0.93f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 212.0f, 216.0f);
        pathBuilder.lineTo(212.0f, 144.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 211.21f);
        pathBuilder.lineTo(132.0f, 198.12f);
        pathBuilder.lineTo(132.0f, 148.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 140.0f);
        pathBuilder.lineTo(32.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.28f, 3.94f);
        pathBuilder.lineToRelative(64.0f, 11.63f);
        pathBuilder.arcToRelative(3.51f, 3.51f, 0.0f, false, false, 0.72f, 0.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(100.0f, 144.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 190.84f);
        pathBuilder.lineTo(36.0f, 180.66f);
        pathBuilder.lineTo(36.0f, 148.0f);
        pathBuilder.lineTo(92.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.56f, 36.93f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.28f, -0.87f);
        pathBuilder.lineToRelative(-80.0f, 14.55f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 124.0f, 54.55f);
        pathBuilder.lineTo(124.0f, 112.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(212.0f, 40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 210.56f, 36.93f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 108.0f);
        pathBuilder.lineTo(132.0f, 108.0f);
        pathBuilder.lineTo(132.0f, 57.88f);
        pathBuilder.lineToRelative(72.0f, -13.09f);
        pathBuilder.close();
        pathBuilder.moveTo(95.28f, 56.43f);
        pathBuilder.lineToRelative(-64.0f, 11.63f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 72.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.lineTo(96.0f, 116.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(100.0f, 60.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.72f, -3.93f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 108.0f);
        pathBuilder.lineTo(36.0f, 108.0f);
        pathBuilder.lineTo(36.0f, 75.34f);
        pathBuilder.lineTo(92.0f, 65.16f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _windowsLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
