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

/* compiled from: Tire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTire", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TireKt {
    private static ImageVector _tire;

    public static final ImageVector getTire(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _tire;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tire", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, -22.09f, 7.16f, -40.0f, 16.0f, -40.0f);
        pathBuilder.reflectiveCurveToRelative(16.0f, 17.91f, 16.0f, 40.0f);
        pathBuilder.reflectiveCurveToRelative(-7.16f, 40.0f, -16.0f, 40.0f);
        pathBuilder.reflectiveCurveTo(152.0f, 150.09f, 152.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(92.0f, 236.0f);
        pathBuilder.curveToRelative(-18.5f, 0.0f, -35.3f, -12.22f, -47.32f, -34.4f);
        pathBuilder.curveTo(33.92f, 181.74f, 28.0f, 155.6f, 28.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.92f, -53.74f, 16.68f, -73.6f);
        pathBuilder.curveTo(56.7f, 32.22f, 73.5f, 20.0f, 92.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.curveToRelative(18.5f, 0.0f, 35.3f, 12.22f, 47.32f, 34.4f);
        pathBuilder.curveTo(222.08f, 74.26f, 228.0f, 100.4f, 228.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(-5.92f, 53.74f, -16.68f, 73.6f);
        pathBuilder.arcToRelative(95.07f, 95.07f, 0.0f, false, true, -6.51f, 10.4f);
        pathBuilder.lineTo(232.0f, 212.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 44.0f);
        pathBuilder.curveToRelative(-18.92f, 0.0f, -40.0f, 34.5f, -40.0f, 84.0f);
        pathBuilder.reflectiveCurveToRelative(21.08f, 84.0f, 40.0f, 84.0f);
        pathBuilder.reflectiveCurveToRelative(40.0f, -34.5f, 40.0f, -84.0f);
        pathBuilder.reflectiveCurveTo(182.92f, 44.0f, 164.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.33f, 155.59f);
        pathBuilder.lineTo(73.0f, 142.24f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.94f, 0.0f);
        pathBuilder.lineToRelative(14.66f, 10.46f);
        pathBuilder.arcTo(186.77f, 186.77f, 0.0f, false, true, 100.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, -3.61f, 0.11f, -7.2f, 0.31f, -10.75f);
        pathBuilder.lineTo(80.0f, 102.75f);
        pathBuilder.lineTo(52.09f, 122.68f);
        pathBuilder.curveTo(52.0f, 124.44f, 52.0f, 126.21f, 52.0f, 128.0f);
        pathBuilder.arcTo(160.1f, 160.1f, 0.0f, false, false, 54.33f, 155.59f);
        pathBuilder.close();
        pathBuilder.moveTo(56.54f, 90.0f);
        pathBuilder.lineTo(73.0f, 78.24f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.94f, 0.0f);
        pathBuilder.lineToRelative(16.91f, 12.07f);
        pathBuilder.arcToRelative(134.79f, 134.79f, 0.0f, false, true, 12.8f, -35.91f);
        pathBuilder.arcTo(95.07f, 95.07f, 0.0f, false, true, 123.19f, 44.0f);
        pathBuilder.lineTo(92.0f, 44.0f);
        pathBuilder.curveTo(78.44f, 44.0f, 63.77f, 61.73f, 56.54f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 212.0f);
        pathBuilder.horizontalLineToRelative(31.19f);
        pathBuilder.arcToRelative(95.07f, 95.07f, 0.0f, false, true, -6.51f, -10.4f);
        pathBuilder.arcToRelative(115.79f, 115.79f, 0.0f, false, true, -6.0f, -12.91f);
        pathBuilder.lineTo(80.0f, 166.75f);
        pathBuilder.lineTo(61.14f, 180.22f);
        pathBuilder.curveTo(69.0f, 200.08f, 80.88f, 212.0f, 92.0f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
