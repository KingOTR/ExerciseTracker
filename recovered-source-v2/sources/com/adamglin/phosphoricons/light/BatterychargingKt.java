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

/* compiled from: Batterycharging.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BatteryCharging", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBatteryCharging", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_batteryCharging", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatterychargingKt {
    private static ImageVector _batteryCharging;

    public static final ImageVector getBatteryCharging(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _batteryCharging;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BatteryCharging", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 58.0f);
        pathBuilder.lineTo(32.0f, 58.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 10.0f, 80.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f);
        pathBuilder.lineTo(200.0f, 198.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f);
        pathBuilder.lineTo(222.0f, 80.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 200.0f, 58.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 176.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f);
        pathBuilder.lineTo(32.0f, 186.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f);
        pathBuilder.lineTo(22.0f, 80.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 32.0f, 70.0f);
        pathBuilder.lineTo(200.0f, 70.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(254.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(242.0f, 96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(137.1f, 124.85f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.27f, 5.83f);
        pathBuilder.lineToRelative(-16.0f, 32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.74f, -5.36f);
        pathBuilder.lineTo(122.29f, 134.0f);
        pathBuilder.lineTo(100.0f, 134.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.37f, -8.68f);
        pathBuilder.lineToRelative(16.0f, -32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.74f, 5.36f);
        pathBuilder.lineTo(109.71f, 122.0f);
        pathBuilder.lineTo(132.0f, 122.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 137.1f, 124.85f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _batteryCharging = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
