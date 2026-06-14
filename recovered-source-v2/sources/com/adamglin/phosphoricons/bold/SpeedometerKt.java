package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Speedometer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Speedometer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSpeedometer", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_speedometer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeedometerKt {
    private static ImageVector _speedometer;

    public static final ImageVector getSpeedometer(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(119.51f, 143.51f);
        pathBuilder.lineToRelative(88.0f, -88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f);
        pathBuilder.lineToRelative(-88.0f, 88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(133.74f, 100.31f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 2.62f, -23.85f);
        pathBuilder.arcTo(75.15f, 75.15f, 0.0f, false, false, 128.0f, 76.0f);
        pathBuilder.arcToRelative(76.08f, 76.08f, 0.0f, false, false, -76.0f, 76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, true, 52.0f, -52.0f);
        pathBuilder.arcTo(54.75f, 54.75f, 0.0f, false, true, 133.74f, 100.31f);
        pathBuilder.close();
        pathBuilder.moveTo(235.28f, 107.81f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 213.09f, 117.0f);
        pathBuilder.arcToRelative(92.47f, 92.47f, 0.0f, false, true, 2.58f, 63.0f);
        pathBuilder.lineTo(40.34f, 180.0f);
        pathBuilder.arcTo(92.23f, 92.23f, 0.0f, false, true, 128.0f, 60.0f);
        pathBuilder.horizontalLineToRelative(0.84f);
        pathBuilder.arcToRelative(91.43f, 91.43f, 0.0f, false, true, 34.2f, 6.91f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.14f, -22.19f);
        pathBuilder.arcTo(116.07f, 116.07f, 0.0f, false, false, 18.57f, 190.58f);
        pathBuilder.arcTo(20.09f, 20.09f, 0.0f, false, false, 37.46f, 204.0f);
        pathBuilder.lineTo(218.53f, 204.0f);
        pathBuilder.arcToRelative(20.06f, 20.06f, 0.0f, false, false, 18.88f, -13.38f);
        pathBuilder.arcToRelative(116.39f, 116.39f, 0.0f, false, false, -2.13f, -82.81f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _speedometer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
