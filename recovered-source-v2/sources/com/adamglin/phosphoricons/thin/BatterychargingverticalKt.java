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

/* compiled from: Batterychargingvertical.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BatteryChargingVertical", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBatteryChargingVertical", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_batteryChargingVertical", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatterychargingverticalKt {
    private static ImageVector _batteryChargingVertical;

    public static final ImageVector getBatteryChargingVertical(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(147.4f, 133.9f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.18f, 3.89f);
        pathBuilder.lineToRelative(-16.0f, 32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 128.0f, 172.0f);
        pathBuilder.arcToRelative(4.12f, 4.12f, 0.0f, false, true, -1.79f, -0.42f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.79f, -5.37f);
        pathBuilder.lineTo(137.53f, 140.0f);
        pathBuilder.lineTo(112.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, -5.79f);
        pathBuilder.lineToRelative(16.0f, -32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.16f, 3.58f);
        pathBuilder.lineTo(118.47f, 132.0f);
        pathBuilder.lineTo(144.0f, 132.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 147.4f, 133.9f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(96.0f, 4.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 56.0f);
        pathBuilder.lineTo(196.0f, 224.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(80.0f, 244.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(60.0f, 56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 196.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.lineTo(80.0f, 44.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 56.0f);
        pathBuilder.lineTo(68.0f, 224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _batteryChargingVertical = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
