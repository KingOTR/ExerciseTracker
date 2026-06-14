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

/* compiled from: Gpsslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GpsSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGpsSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gpsSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GpsslashKt {
    private static ImageVector _gpsSlash;

    public static final ImageVector getGpsSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(240.0f, 136.0f);
        pathBuilder.horizontalLineTo(215.63f);
        pathBuilder.arcToRelative(87.21f, 87.21f, 0.0f, false, true, -10.13f, 33.61f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.5f, 0.81f);
        pathBuilder.lineTo(92.51f, 53.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.4f, -6.38f);
        pathBuilder.arcTo(87.0f, 87.0f, 0.0f, false, true, 120.0f, 40.37f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, -8.0f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, true, 136.0f, 16.27f);
        pathBuilder.verticalLineToRelative(24.1f);
        pathBuilder.arcTo(88.13f, 88.13f, 0.0f, false, true, 215.63f, 120.0f);
        pathBuilder.horizontalLineToRelative(24.1f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, 8.25f, 7.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(53.92f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder.lineToRelative(21.09f, 23.2f);
        pathBuilder.arcTo(87.63f, 87.63f, 0.0f, false, false, 40.37f, 120.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineTo(40.37f);
        pathBuilder.arcTo(88.13f, 88.13f, 0.0f, false, false, 120.0f, 215.63f);
        pathBuilder.verticalLineTo(240.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(215.63f);
        pathBuilder.arcToRelative(87.51f, 87.51f, 0.0f, false, false, 45.0f, -17.43f);
        pathBuilder.lineToRelative(21.08f, 23.18f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gpsSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
