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

/* compiled from: Batterychargingvertical.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BatteryChargingVertical", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBatteryChargingVertical", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_batteryChargingVertical", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatterychargingverticalKt {
    private static ImageVector _batteryChargingVertical;

    public static final ImageVector getBatteryChargingVertical(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _batteryChargingVertical;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BatteryChargingVertical", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(149.1f, 132.85f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.27f, 5.83f);
        pathBuilder.lineToRelative(-16.0f, 32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.74f, -5.36f);
        pathBuilder.lineTo(134.29f, 142.0f);
        pathBuilder.lineTo(112.0f, 142.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.37f, -8.68f);
        pathBuilder.lineToRelative(16.0f, -32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.74f, 5.36f);
        pathBuilder.lineTo(121.71f, 130.0f);
        pathBuilder.lineTo(144.0f, 130.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 149.1f, 132.85f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(96.0f, 2.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.0f, 56.0f);
        pathBuilder.lineTo(198.0f, 224.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, 22.0f);
        pathBuilder.lineTo(80.0f, 246.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, -22.0f);
        pathBuilder.lineTo(58.0f, 56.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 80.0f, 34.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 198.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 56.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f);
        pathBuilder.lineTo(80.0f, 46.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 70.0f, 56.0f);
        pathBuilder.lineTo(70.0f, 224.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _batteryChargingVertical = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
