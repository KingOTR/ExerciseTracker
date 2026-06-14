package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Airplanelanding.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AirplaneLanding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getAirplaneLanding", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airplaneLanding", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirplanelandingKt {
    private static ImageVector _airplaneLanding;

    public static final ImageVector getAirplaneLanding(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _airplaneLanding;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AirplaneLanding", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(256.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(104.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.lineTo(248.0f, 208.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(229.84f, 191.7f);
        pathBuilder.lineTo(53.21f, 142.24f);
        pathBuilder.arcTo(40.12f, 40.12f, 0.0f, false, true, 24.0f, 103.72f);
        pathBuilder.lineTo(24.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 45.06f, 32.82f);
        pathBuilder.lineToRelative(5.47f, 1.82f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.0f, 4.87f);
        pathBuilder.lineTo(66.13f, 68.88f);
        pathBuilder.lineTo(96.0f, 77.39f);
        pathBuilder.lineTo(96.0f, 48.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.06f, -15.18f);
        pathBuilder.lineToRelative(5.47f, 1.82f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.85f, 4.5f);
        pathBuilder.lineToRelative(22.5f, 53.63f);
        pathBuilder.lineToRelative(60.84f, 17.0f);
        pathBuilder.arcTo(40.13f, 40.13f, 0.0f, false, true, 240.0f, 148.32f);
        pathBuilder.lineTo(240.0f, 184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.16f, 7.7f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 148.32f);
        pathBuilder.arcToRelative(24.09f, 24.09f, 0.0f, false, false, -17.58f, -23.13f);
        pathBuilder.lineToRelative(-64.57f, -18.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.23f, -4.61f);
        pathBuilder.lineTo(114.0f, 48.67f);
        pathBuilder.lineTo(112.0f, 48.0f);
        pathBuilder.lineTo(112.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.19f, 7.7f);
        pathBuilder.lineToRelative(-44.0f, -12.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.33f, -5.0f);
        pathBuilder.lineTo(41.79f, 48.59f);
        pathBuilder.lineTo(40.0f, 48.0f);
        pathBuilder.verticalLineToRelative(55.72f);
        pathBuilder.arcToRelative(24.09f, 24.09f, 0.0f, false, false, 17.53f, 23.12f);
        pathBuilder.lineTo(224.0f, 173.45f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airplaneLanding = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
