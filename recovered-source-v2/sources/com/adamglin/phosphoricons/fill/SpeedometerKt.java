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

/* compiled from: Speedometer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Speedometer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSpeedometer", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_speedometer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeedometerKt {
    private static ImageVector _speedometer;

    public static final ImageVector getSpeedometer(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(221.87f, 90.86f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.17f, -0.62f);
        pathBuilder.lineToRelative(-75.42f, 75.42f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 129.0f, 154.35f);
        pathBuilder.lineToRelative(92.7f, -92.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f);
        pathBuilder.lineTo(197.0f, 63.73f);
        pathBuilder.arcTo(112.05f, 112.05f, 0.0f, false, false, 22.34f, 189.25f);
        pathBuilder.arcTo(16.09f, 16.09f, 0.0f, false, false, 37.46f, 200.0f);
        pathBuilder.horizontalLineTo(218.53f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.11f, -10.71f);
        pathBuilder.arcToRelative(112.28f, 112.28f, 0.0f, false, false, -11.77f, -98.43f);
        pathBuilder.close();
        pathBuilder.moveTo(57.44f, 166.41f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.25f, 9.43f);
        pathBuilder.arcToRelative(7.89f, 7.89f, 0.0f, false, true, -1.6f, 0.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.83f, -6.41f);
        pathBuilder.arcTo(88.06f, 88.06f, 0.0f, false, true, 143.59f, 65.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.82f, 15.75f);
        pathBuilder.arcToRelative(72.07f, 72.07f, 0.0f, false, false, -83.33f, 85.28f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _speedometer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
