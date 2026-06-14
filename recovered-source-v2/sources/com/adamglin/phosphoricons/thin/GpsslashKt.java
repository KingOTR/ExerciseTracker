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

/* compiled from: Gpsslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GpsSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGpsSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gpsSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GpsslashKt {
    private static ImageVector _gpsSlash;

    public static final ImageVector getGpsSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(244.0f, 128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(211.9f, 132.0f);
        pathBuilder.arcToRelative(83.08f, 83.08f, 0.0f, false, true, -7.24f, 30.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.65f, 2.37f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, -1.63f, -0.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -5.28f);
        pathBuilder.arcTo(76.06f, 76.06f, 0.0f, false, false, 103.62f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.56f, -7.57f);
        pathBuilder.arcTo(83.56f, 83.56f, 0.0f, false, true, 124.0f, 44.1f);
        pathBuilder.lineTo(124.0f, 16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 44.1f);
        pathBuilder.arcTo(84.11f, 84.11f, 0.0f, false, true, 211.9f, 124.0f);
        pathBuilder.lineTo(240.0f, 124.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.0f, 213.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.92f, 5.38f);
        pathBuilder.lineToRelative(-23.56f, -25.91f);
        pathBuilder.arcTo(83.81f, 83.81f, 0.0f, false, true, 132.0f, 211.9f);
        pathBuilder.lineTo(132.0f, 240.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(124.0f, 211.9f);
        pathBuilder.arcTo(84.11f, 84.11f, 0.0f, false, true, 44.1f, 132.0f);
        pathBuilder.lineTo(16.0f, 132.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.lineTo(44.1f, 124.0f);
        pathBuilder.arcTo(84.24f, 84.24f, 0.0f, false, true, 68.6f, 68.61f);
        pathBuilder.lineTo(45.0f, 42.69f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 51.0f, 37.31f);
        pathBuilder.lineTo(184.77f, 184.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.13f, 186.84f);
        pathBuilder.lineTo(74.0f, 74.53f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 102.1f, 112.31f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gpsSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
