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

/* compiled from: Gearfine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GearFine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGearFine", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gearFine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearfineKt {
    private static ImageVector _gearFine;

    public static final ImageVector getGearFine(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _gearFine;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GearFine", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 122.0f);
        pathBuilder.lineTo(213.77f, 122.0f);
        pathBuilder.arcToRelative(85.56f, 85.56f, 0.0f, false, false, -8.49f, -31.69f);
        pathBuilder.lineToRelative(15.79f, -9.11f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -10.4f);
        pathBuilder.lineToRelative(-15.8f, 9.12f);
        pathBuilder.arcToRelative(86.72f, 86.72f, 0.0f, false, false, -23.19f, -23.19f);
        pathBuilder.lineToRelative(9.12f, -15.8f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.4f, -6.0f);
        pathBuilder.lineToRelative(-9.11f, 15.79f);
        pathBuilder.arcTo(85.56f, 85.56f, 0.0f, false, false, 134.0f, 42.23f);
        pathBuilder.lineTo(134.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 42.23f);
        pathBuilder.arcToRelative(85.56f, 85.56f, 0.0f, false, false, -31.69f, 8.49f);
        pathBuilder.lineTo(81.2f, 34.93f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.4f, 6.0f);
        pathBuilder.lineToRelative(9.12f, 15.8f);
        pathBuilder.arcTo(86.72f, 86.72f, 0.0f, false, false, 56.73f, 79.92f);
        pathBuilder.lineTo(40.93f, 70.8f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 10.4f);
        pathBuilder.lineToRelative(15.79f, 9.11f);
        pathBuilder.arcTo(85.56f, 85.56f, 0.0f, false, false, 42.23f, 122.0f);
        pathBuilder.lineTo(24.0f, 122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(42.23f, 134.0f);
        pathBuilder.arcToRelative(85.56f, 85.56f, 0.0f, false, false, 8.49f, 31.69f);
        pathBuilder.lineTo(34.93f, 174.8f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 10.4f);
        pathBuilder.lineToRelative(15.8f, -9.12f);
        pathBuilder.arcToRelative(86.72f, 86.72f, 0.0f, false, false, 23.19f, 23.19f);
        pathBuilder.lineToRelative(-9.12f, 15.8f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.4f, 6.0f);
        pathBuilder.lineToRelative(9.11f, -15.79f);
        pathBuilder.arcTo(85.56f, 85.56f, 0.0f, false, false, 122.0f, 213.77f);
        pathBuilder.lineTo(122.0f, 232.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(134.0f, 213.77f);
        pathBuilder.arcToRelative(85.56f, 85.56f, 0.0f, false, false, 31.69f, -8.49f);
        pathBuilder.lineToRelative(9.11f, 15.79f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.21f, 3.0f);
        pathBuilder.arcToRelative(5.93f, 5.93f, 0.0f, false, false, 3.0f, -0.81f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.2f, -8.19f);
        pathBuilder.lineToRelative(-9.12f, -15.8f);
        pathBuilder.arcToRelative(86.72f, 86.72f, 0.0f, false, false, 23.19f, -23.19f);
        pathBuilder.lineToRelative(15.8f, 9.12f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -10.4f);
        pathBuilder.lineToRelative(-15.79f, -9.11f);
        pathBuilder.arcTo(85.56f, 85.56f, 0.0f, false, false, 213.77f, 134.0f);
        pathBuilder.lineTo(232.0f, 134.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(86.0f, 188.84f);
        pathBuilder.arcTo(73.9f, 73.9f, 0.0f, false, true, 86.0f, 67.16f);
        pathBuilder.lineTo(121.07f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 202.0f);
        pathBuilder.arcToRelative(73.5f, 73.5f, 0.0f, false, true, -31.67f, -7.14f);
        pathBuilder.lineTo(131.46f, 134.0f);
        pathBuilder.horizontalLineToRelative(70.28f);
        pathBuilder.arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(131.46f, 122.0f);
        pathBuilder.lineTo(96.33f, 61.14f);
        pathBuilder.arcTo(73.95f, 73.95f, 0.0f, false, true, 201.74f, 122.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gearFine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
