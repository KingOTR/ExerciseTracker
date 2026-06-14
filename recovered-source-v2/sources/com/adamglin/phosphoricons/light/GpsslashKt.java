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

/* compiled from: Gpsslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GpsSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGpsSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gpsSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GpsslashKt {
    private static ImageVector _gpsSlash;

    public static final ImageVector getGpsSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _gpsSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GpsSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(213.79f, 134.0f);
        pathBuilder.arcToRelative(85.2f, 85.2f, 0.0f, false, true, -7.3f, 29.2f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.48f, 3.55f);
        pathBuilder.arcToRelative(5.91f, 5.91f, 0.0f, false, true, -2.45f, -0.53f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.0f, -7.93f);
        pathBuilder.arcToRelative(74.05f, 74.05f, 0.0f, false, false, -91.28f, -100.4f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.84f, -11.37f);
        pathBuilder.arcTo(85.64f, 85.64f, 0.0f, false, true, 122.0f, 42.22f);
        pathBuilder.lineTo(122.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.lineTo(134.0f, 42.23f);
        pathBuilder.arcTo(86.12f, 86.12f, 0.0f, false, true, 213.77f, 122.0f);
        pathBuilder.lineTo(240.0f, 122.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.44f, 212.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.88f, 8.08f);
        pathBuilder.lineToRelative(-22.3f, -24.54f);
        pathBuilder.arcTo(85.73f, 85.73f, 0.0f, false, true, 134.0f, 213.77f);
        pathBuilder.lineTo(134.0f, 240.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 213.77f);
        pathBuilder.arcTo(86.12f, 86.12f, 0.0f, false, true, 42.23f, 134.0f);
        pathBuilder.lineTo(16.0f, 134.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(42.22f, 122.0f);
        pathBuilder.arcTo(86.23f, 86.23f, 0.0f, false, true, 65.86f, 68.56f);
        pathBuilder.lineTo(43.56f, 44.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 52.44f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(173.17f, 186.6f);
        pathBuilder.lineTo(74.0f, 77.48f);
        pathBuilder.arcTo(74.0f, 74.0f, 0.0f, false, false, 173.17f, 186.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gpsSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
