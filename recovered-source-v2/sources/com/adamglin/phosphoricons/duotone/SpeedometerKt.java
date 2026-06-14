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

/* compiled from: Speedometer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Speedometer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSpeedometer", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_speedometer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeedometerKt {
    private static ImageVector _speedometer;

    public static final ImageVector getSpeedometer(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 152.0f);
        pathBuilder.arcToRelative(103.93f, 103.93f, 0.0f, false, true, -5.9f, 34.63f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.57f, 5.37f);
        pathBuilder.horizontalLineTo(37.46f);
        pathBuilder.arcToRelative(8.05f, 8.05f, 0.0f, false, true, -7.57f, -5.41f);
        pathBuilder.arcTo(104.06f, 104.06f, 0.0f, false, true, 24.0f, 151.19f);
        pathBuilder.curveTo(24.44f, 94.0f, 71.73f, 47.49f, 129.0f, 48.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, true, 232.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(114.34f, 154.34f);
        pathBuilder2.lineToRelative(96.0f, -96.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder2.lineToRelative(-96.0f, 96.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 88.0f);
        pathBuilder2.arcToRelative(63.9f, 63.9f, 0.0f, false, true, 20.44f, 3.33f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 5.11f, -15.16f);
        pathBuilder2.arcTo(80.0f, 80.0f, 0.0f, false, false, 48.49f, 160.88f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 56.43f, 168.0f);
        pathBuilder2.curveToRelative(0.29f, 0.0f, 0.59f, 0.0f, 0.89f, -0.05f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.07f, -8.83f);
        pathBuilder2.arcTo(64.92f, 64.92f, 0.0f, false, true, 64.0f, 152.0f);
        pathBuilder2.arcTo(64.07f, 64.07f, 0.0f, false, true, 128.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(227.74f, 101.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.24f, 7.3f);
        pathBuilder2.arcToRelative(96.27f, 96.27f, 0.0f, false, true, 5.0f, 75.71f);
        pathBuilder2.lineToRelative(-181.1f, -0.07f);
        pathBuilder2.arcTo(96.24f, 96.24f, 0.0f, false, true, 128.0f, 56.0f);
        pathBuilder2.horizontalLineToRelative(0.88f);
        pathBuilder2.arcToRelative(95.0f, 95.0f, 0.0f, false, true, 42.82f, 10.5f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 179.0f, 52.27f);
        pathBuilder2.arcTo(110.8f, 110.8f, 0.0f, false, false, 129.0f, 40.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.arcTo(112.05f, 112.05f, 0.0f, false, false, 22.35f, 189.25f);
        pathBuilder2.arcTo(16.07f, 16.07f, 0.0f, false, false, 37.46f, 200.0f);
        pathBuilder2.lineTo(218.53f, 200.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.11f, -10.71f);
        pathBuilder2.arcToRelative(112.35f, 112.35f, 0.0f, false, false, -5.9f, -88.3f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _speedometer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
