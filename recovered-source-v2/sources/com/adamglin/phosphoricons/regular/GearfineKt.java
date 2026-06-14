package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Gearfine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GearFine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getGearFine", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gearFine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearfineKt {
    private static ImageVector _gearFine;

    public static final ImageVector getGearFine(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 120.0f);
        pathBuilder.lineTo(215.63f, 120.0f);
        pathBuilder.arcToRelative(87.27f, 87.27f, 0.0f, false, false, -7.74f, -28.88f);
        pathBuilder.lineToRelative(14.18f, -8.19f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -13.86f);
        pathBuilder.lineToRelative(-14.2f, 8.2f);
        pathBuilder.arcToRelative(88.78f, 88.78f, 0.0f, false, false, -21.14f, -21.14f);
        pathBuilder.lineToRelative(8.2f, -14.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, -8.0f);
        pathBuilder.lineToRelative(-8.19f, 14.18f);
        pathBuilder.arcTo(87.27f, 87.27f, 0.0f, false, false, 136.0f, 40.37f);
        pathBuilder.lineTo(136.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 40.37f);
        pathBuilder.arcToRelative(87.27f, 87.27f, 0.0f, false, false, -28.88f, 7.74f);
        pathBuilder.lineTo(82.93f, 33.93f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, 8.0f);
        pathBuilder.lineToRelative(8.2f, 14.2f);
        pathBuilder.arcTo(88.78f, 88.78f, 0.0f, false, false, 56.13f, 77.27f);
        pathBuilder.lineToRelative(-14.2f, -8.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 13.86f);
        pathBuilder.lineToRelative(14.18f, 8.19f);
        pathBuilder.arcTo(87.27f, 87.27f, 0.0f, false, false, 40.37f, 120.0f);
        pathBuilder.lineTo(24.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.lineTo(40.37f, 136.0f);
        pathBuilder.arcToRelative(87.27f, 87.27f, 0.0f, false, false, 7.74f, 28.88f);
        pathBuilder.lineToRelative(-14.18f, 8.19f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 14.93f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, false, 4.0f, -1.07f);
        pathBuilder.lineToRelative(14.2f, -8.2f);
        pathBuilder.arcToRelative(88.78f, 88.78f, 0.0f, false, false, 21.14f, 21.14f);
        pathBuilder.lineToRelative(-8.2f, 14.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, 8.0f);
        pathBuilder.lineToRelative(8.19f, -14.18f);
        pathBuilder.arcTo(87.27f, 87.27f, 0.0f, false, false, 120.0f, 215.63f);
        pathBuilder.lineTo(120.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(136.0f, 215.63f);
        pathBuilder.arcToRelative(87.27f, 87.27f, 0.0f, false, false, 28.88f, -7.74f);
        pathBuilder.lineToRelative(8.19f, 14.18f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, -8.0f);
        pathBuilder.lineToRelative(-8.2f, -14.2f);
        pathBuilder.arcToRelative(88.78f, 88.78f, 0.0f, false, false, 21.14f, -21.14f);
        pathBuilder.lineToRelative(14.2f, 8.2f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 225.0f, 184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.92f, -10.93f);
        pathBuilder.lineToRelative(-14.18f, -8.19f);
        pathBuilder.arcTo(87.27f, 87.27f, 0.0f, false, false, 215.63f, 136.0f);
        pathBuilder.lineTo(232.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 56.0f);
        pathBuilder.arcToRelative(72.08f, 72.08f, 0.0f, false, true, 71.54f, 64.0f);
        pathBuilder.lineTo(132.62f, 120.0f);
        pathBuilder.lineTo(99.16f, 62.05f);
        pathBuilder.arcTo(71.58f, 71.58f, 0.0f, false, true, 128.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 128.0f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, true, 85.31f, 70.06f);
        pathBuilder.lineTo(118.76f, 128.0f);
        pathBuilder.lineTo(85.31f, 185.94f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, true, 56.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 200.0f);
        pathBuilder.arcTo(71.58f, 71.58f, 0.0f, false, true, 99.16f, 194.0f);
        pathBuilder.lineTo(132.62f, 136.0f);
        pathBuilder.horizontalLineToRelative(66.92f);
        pathBuilder.arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gearFine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
