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

/* compiled from: Gearsix.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GearSix", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGearSix", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gearSix", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearsixKt {
    private static ImageVector _gearSix;

    public static final ImageVector getGearSix(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _gearSix;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GearSix", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 84.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 164.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 108.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, -2.7f);
        pathBuilder.lineToRelative(-30.89f, -17.6f);
        pathBuilder.quadToRelative(-0.47f, -0.82f, -1.0f, -1.62f);
        pathBuilder.lineTo(200.1f, 51.2f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, false, -1.42f, -3.0f);
        pathBuilder.arcToRelative(107.8f, 107.8f, 0.0f, false, false, -35.41f, -19.94f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.23f, 0.29f);
        pathBuilder.lineTo(129.0f, 45.87f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-31.0f, -17.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.23f, -0.3f);
        pathBuilder.arcToRelative(108.05f, 108.05f, 0.0f, false, false, -35.39f, 20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.41f, 3.0f);
        pathBuilder.lineToRelative(-0.16f, 34.9f);
        pathBuilder.lineToRelative(-1.0f, 1.62f);
        pathBuilder.lineTo(23.9f, 105.3f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 22.0f, 108.0f);
        pathBuilder.arcToRelative(102.76f, 102.76f, 0.0f, false, false, 0.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.95f, 2.7f);
        pathBuilder.lineToRelative(30.89f, 17.6f);
        pathBuilder.quadToRelative(0.47f, 0.83f, 1.0f, 1.62f);
        pathBuilder.lineToRelative(0.12f, 34.87f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, false, 1.42f, 3.0f);
        pathBuilder.arcToRelative(107.8f, 107.8f, 0.0f, false, false, 35.41f, 19.94f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.23f, -0.29f);
        pathBuilder.lineTo(127.0f, 210.13f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(31.0f, 17.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.23f, 0.3f);
        pathBuilder.arcToRelative(108.05f, 108.05f, 0.0f, false, false, 35.39f, -20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.41f, -3.0f);
        pathBuilder.lineToRelative(0.16f, -34.9f);
        pathBuilder.lineToRelative(1.0f, -1.62f);
        pathBuilder.lineTo(232.1f, 150.7f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -2.71f);
        pathBuilder.arcTo(102.76f, 102.76f, 0.0f, false, false, 234.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.52f, 144.67f);
        pathBuilder.lineTo(196.3f, 161.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.51f, 1.53f);
        pathBuilder.curveToRelative(-0.61f, 1.09f, -1.25f, 2.17f, -1.91f, 3.24f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, false, -0.61f, 2.1f);
        pathBuilder.lineToRelative(-0.16f, 34.15f);
        pathBuilder.arcToRelative(99.8f, 99.8f, 0.0f, false, true, -29.7f, 16.77f);
        pathBuilder.lineToRelative(-30.4f, -17.0f);
        pathBuilder.arcToRelative(4.06f, 4.06f, 0.0f, false, false, -2.0f, -0.51f);
        pathBuilder.lineTo(130.0f, 202.12f);
        pathBuilder.curveToRelative(-1.28f, 0.0f, -2.57f, 0.0f, -3.84f, 0.0f);
        pathBuilder.arcToRelative(4.1f, 4.1f, 0.0f, false, false, -2.05f, 0.51f);
        pathBuilder.lineToRelative(-30.45f, 17.0f);
        pathBuilder.arcTo(100.23f, 100.23f, 0.0f, false, true, 63.89f, 202.9f);
        pathBuilder.lineToRelative(-0.12f, -34.12f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, false, -0.61f, -2.11f);
        pathBuilder.curveToRelative(-0.66f, -1.0f, -1.3f, -2.14f, -1.91f, -3.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.51f, -1.53f);
        pathBuilder.lineTo(29.49f, 144.68f);
        pathBuilder.arcToRelative(94.78f, 94.78f, 0.0f, false, true, 0.0f, -33.34f);
        pathBuilder.lineTo(59.7f, 94.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.51f, -1.53f);
        pathBuilder.curveToRelative(0.61f, -1.09f, 1.25f, -2.17f, 1.91f, -3.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.61f, -2.11f);
        pathBuilder.lineToRelative(0.16f, -34.15f);
        pathBuilder.arcToRelative(99.8f, 99.8f, 0.0f, false, true, 29.7f, -16.77f);
        pathBuilder.lineToRelative(30.4f, 17.0f);
        pathBuilder.arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.05f, 0.51f);
        pathBuilder.curveToRelative(1.28f, 0.0f, 2.57f, 0.0f, 3.84f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.05f, -0.51f);
        pathBuilder.lineToRelative(30.45f, -17.0f);
        pathBuilder.arcTo(100.23f, 100.23f, 0.0f, false, true, 192.11f, 53.1f);
        pathBuilder.lineToRelative(0.12f, 34.12f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, false, 0.61f, 2.11f);
        pathBuilder.curveToRelative(0.66f, 1.0f, 1.3f, 2.14f, 1.91f, 3.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.51f, 1.53f);
        pathBuilder.lineToRelative(30.25f, 17.23f);
        pathBuilder.arcTo(94.78f, 94.78f, 0.0f, false, true, 226.54f, 144.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gearSix = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
