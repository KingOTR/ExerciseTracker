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

/* compiled from: Airplaneinflight.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AirplaneInFlight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getAirplaneInFlight", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airplaneInFlight", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirplaneinflightKt {
    private static ImageVector _airplaneInFlight;

    public static final ImageVector getAirplaneInFlight(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _airplaneInFlight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AirplaneInFlight", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(72.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f);
        pathBuilder.lineTo(216.0f, 208.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 136.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(61.07f, 168.0f);
        pathBuilder.arcToRelative(39.75f, 39.75f, 0.0f, false, true, -38.31f, -28.51f);
        pathBuilder.lineTo(8.69f, 92.6f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 24.0f, 72.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.65f, 2.34f);
        pathBuilder.lineTo(59.32f, 96.0f);
        pathBuilder.lineTo(81.81f, 96.0f);
        pathBuilder.lineToRelative(-9.0f, -26.94f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f);
        pathBuilder.lineTo(147.32f, 96.0f);
        pathBuilder.lineTo(208.0f, 96.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 248.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 136.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f);
        pathBuilder.lineTo(144.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.65f, -2.34f);
        pathBuilder.lineTo(92.69f, 64.0f);
        pathBuilder.lineTo(88.0f, 64.0f);
        pathBuilder.lineToRelative(12.49f, 37.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 92.91f, 112.0f);
        pathBuilder.lineTo(56.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -2.34f);
        pathBuilder.lineTo(28.69f, 88.0f);
        pathBuilder.lineTo(24.0f, 88.0f);
        pathBuilder.lineToRelative(14.07f, 46.9f);
        pathBuilder.arcToRelative(23.85f, 23.85f, 0.0f, false, false, 23.0f, 17.1f);
        pathBuilder.lineTo(232.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airplaneInFlight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
