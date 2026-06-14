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

/* compiled from: Cameraslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CameraSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCameraSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cameraSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraslashKt {
    private static ImageVector _cameraSlash;

    public static final ImageVector getCameraSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _cameraSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CameraSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineTo(56.25f, 58.0f);
        pathBuilder.lineTo(48.0f, 58.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 26.0f, 80.0f);
        pathBuilder.lineTo(26.0f, 192.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f);
        pathBuilder.lineTo(198.07f, 214.0f);
        pathBuilder.lineToRelative(5.49f, 6.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(105.5f, 112.2f);
        pathBuilder.lineTo(145.61f, 156.33f);
        pathBuilder.arcTo(29.67f, 29.67f, 0.0f, false, true, 128.0f, 162.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, -22.5f, -49.84f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 202.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f);
        pathBuilder.lineTo(38.0f, 80.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 48.0f, 70.0f);
        pathBuilder.lineTo(67.16f, 70.0f);
        pathBuilder.lineToRelative(30.23f, 33.25f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, false, 56.33f, 62.0f);
        pathBuilder.lineTo(187.16f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.0f, 80.0f);
        pathBuilder.lineTo(230.0f, 186.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(218.0f, 80.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f);
        pathBuilder.lineTo(176.0f, 70.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, -2.67f);
        pathBuilder.lineTo(156.78f, 46.0f);
        pathBuilder.lineTo(99.21f, 46.0f);
        pathBuilder.lineToRelative(-0.23f, 0.34f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.0f, -6.65f);
        pathBuilder.lineToRelative(2.0f, -3.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 96.0f, 34.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.0f, 2.67f);
        pathBuilder.lineTo(179.21f, 58.0f);
        pathBuilder.lineTo(208.0f, 58.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 230.0f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cameraSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
