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

/* compiled from: Windowslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WindowsLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWindowsLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_windowsLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WindowslogoKt {
    private static ImageVector _windowsLogo;

    public static final ImageVector getWindowsLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(208.0f, 138.0f);
        pathBuilder.lineTo(128.0f, 138.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(57.45f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.93f, 5.91f);
        pathBuilder.lineToRelative(80.0f, 14.54f);
        pathBuilder.arcToRelative(5.46f, 5.46f, 0.0f, false, false, 1.07f, 0.1f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(214.0f, 144.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 138.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 208.81f);
        pathBuilder.lineTo(134.0f, 196.45f);
        pathBuilder.lineTo(134.0f, 150.0f);
        pathBuilder.horizontalLineToRelative(68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 138.0f);
        pathBuilder.lineTo(32.0f, 138.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.93f, 5.9f);
        pathBuilder.lineToRelative(64.0f, 11.64f);
        pathBuilder.arcToRelative(6.36f, 6.36f, 0.0f, false, false, 1.07f, 0.1f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(102.0f, 144.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 138.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.0f, 188.45f);
        pathBuilder.lineTo(38.0f, 179.0f);
        pathBuilder.lineTo(38.0f, 150.0f);
        pathBuilder.lineTo(90.0f, 150.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.84f, 35.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.91f, -1.29f);
        pathBuilder.lineToRelative(-80.0f, 14.54f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 122.0f, 54.55f);
        pathBuilder.lineTo(122.0f, 112.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(214.0f, 40.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 211.84f, 35.39f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 106.0f);
        pathBuilder.lineTo(134.0f, 106.0f);
        pathBuilder.lineTo(134.0f, 59.55f);
        pathBuilder.lineToRelative(68.0f, -12.36f);
        pathBuilder.close();
        pathBuilder.moveTo(99.84f, 55.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.91f, -1.3f);
        pathBuilder.lineToRelative(-64.0f, 11.64f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 26.0f, 72.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.lineTo(96.0f, 118.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(102.0f, 60.36f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 99.84f, 55.76f);
        pathBuilder.close();
        pathBuilder.moveTo(90.0f, 106.0f);
        pathBuilder.lineTo(38.0f, 106.0f);
        pathBuilder.lineTo(38.0f, 77.0f);
        pathBuilder.lineToRelative(52.0f, -9.46f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _windowsLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
