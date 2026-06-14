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

/* compiled from: Gpsslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GpsSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGpsSlash", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gpsSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GpsslashKt {
    private static ImageVector _gpsSlash;

    public static final ImageVector getGpsSlash(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(208.0f, 128.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, true, true, -80.0f, -80.0f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, true, 208.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(248.0f, 128.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.lineTo(215.64f, 136.0f);
        pathBuilder2.arcToRelative(87.0f, 87.0f, 0.0f, false, true, -7.33f, 28.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.3f, 4.73f);
        pathBuilder2.arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.27f, -0.71f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.0f, -10.57f);
        pathBuilder2.arcToRelative(72.06f, 72.06f, 0.0f, false, false, -88.81f, -97.69f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -5.13f, -15.15f);
        pathBuilder2.arcTo(87.21f, 87.21f, 0.0f, false, true, 120.0f, 40.37f);
        pathBuilder2.lineTo(120.0f, 16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.lineTo(136.0f, 40.37f);
        pathBuilder2.arcTo(88.13f, 88.13f, 0.0f, false, true, 215.63f, 120.0f);
        pathBuilder2.lineTo(240.0f, 120.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(213.92f, 210.62f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f);
        pathBuilder2.lineTo(181.0f, 198.23f);
        pathBuilder2.arcToRelative(87.69f, 87.69f, 0.0f, false, true, -45.0f, 17.4f);
        pathBuilder2.lineTo(136.0f, 240.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(120.0f, 215.63f);
        pathBuilder2.arcTo(88.13f, 88.13f, 0.0f, false, true, 40.37f, 136.0f);
        pathBuilder2.lineTo(16.0f, 136.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.lineTo(40.37f, 120.0f);
        pathBuilder2.arcTo(88.31f, 88.31f, 0.0f, false, true, 63.14f, 68.54f);
        pathBuilder2.lineTo(42.08f, 45.38f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f);
        pathBuilder2.close();
        pathBuilder2.moveTo(170.2f, 186.32f);
        pathBuilder2.lineTo(74.0f, 80.45f);
        pathBuilder2.arcTo(72.0f, 72.0f, 0.0f, false, false, 170.2f, 186.32f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gpsSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
