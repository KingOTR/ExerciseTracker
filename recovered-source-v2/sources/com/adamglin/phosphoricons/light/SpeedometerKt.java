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

/* compiled from: Speedometer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Speedometer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSpeedometer", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_speedometer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeedometerKt {
    private static ImageVector _speedometer;

    public static final ImageVector getSpeedometer(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _speedometer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Speedometer", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(115.76f, 155.76f);
        pathBuilder.lineToRelative(96.0f, -96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.lineToRelative(-96.0f, 96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 86.0f);
        pathBuilder.arcToRelative(65.9f, 65.9f, 0.0f, false, true, 21.08f, 3.44f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.83f, -11.38f);
        pathBuilder.arcToRelative(78.0f, 78.0f, 0.0f, false, false, -102.43f, 82.6f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 5.34f);
        pathBuilder.arcToRelative(5.12f, 5.12f, 0.0f, false, false, 0.67f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.3f, -6.62f);
        pathBuilder.arcTo(69.0f, 69.0f, 0.0f, false, true, 62.0f, 152.0f);
        pathBuilder.arcTo(66.08f, 66.08f, 0.0f, false, true, 128.0f, 86.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 101.9f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.68f, 5.48f);
        pathBuilder.arcToRelative(98.35f, 98.35f, 0.0f, false, true, 5.16f, 77.25f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.91f, 1.37f);
        pathBuilder.lineTo(37.46f, 186.0f);
        pathBuilder.arcToRelative(2.07f, 2.07f, 0.0f, false, true, -1.91f, -1.41f);
        pathBuilder.arcTo(98.23f, 98.23f, 0.0f, false, true, 128.0f, 54.0f);
        pathBuilder.horizontalLineToRelative(0.9f);
        pathBuilder.arcToRelative(97.0f, 97.0f, 0.0f, false, true, 43.71f, 10.72f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, false, 178.1f, 54.0f);
        pathBuilder.arcTo(108.92f, 108.92f, 0.0f, false, false, 129.0f, 42.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.arcTo(110.06f, 110.06f, 0.0f, false, false, 24.23f, 188.58f);
        pathBuilder.arcTo(14.08f, 14.08f, 0.0f, false, false, 37.46f, 198.0f);
        pathBuilder.lineTo(218.53f, 198.0f);
        pathBuilder.arcToRelative(14.06f, 14.06f, 0.0f, false, false, 13.22f, -9.37f);
        pathBuilder.arcTo(110.34f, 110.34f, 0.0f, false, false, 226.0f, 101.9f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _speedometer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
