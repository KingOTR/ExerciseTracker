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

/* compiled from: Gearfine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GearFine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGearFine", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gearFine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearfineKt {
    private static ImageVector _gearFine;

    public static final ImageVector getGearFine(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(208.0f, 128.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, true, true, -80.0f, -80.0f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, true, 208.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(232.0f, 120.0f);
        pathBuilder2.lineTo(215.63f, 120.0f);
        pathBuilder2.arcToRelative(87.27f, 87.27f, 0.0f, false, false, -7.74f, -28.88f);
        pathBuilder2.lineToRelative(14.18f, -8.19f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -13.86f);
        pathBuilder2.lineToRelative(-14.2f, 8.2f);
        pathBuilder2.arcToRelative(88.78f, 88.78f, 0.0f, false, false, -21.14f, -21.14f);
        pathBuilder2.lineToRelative(8.2f, -14.2f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, -8.0f);
        pathBuilder2.lineToRelative(-8.19f, 14.18f);
        pathBuilder2.arcTo(87.27f, 87.27f, 0.0f, false, false, 136.0f, 40.37f);
        pathBuilder2.lineTo(136.0f, 24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.lineTo(120.0f, 40.37f);
        pathBuilder2.arcToRelative(87.27f, 87.27f, 0.0f, false, false, -28.88f, 7.74f);
        pathBuilder2.lineTo(82.93f, 33.93f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, 8.0f);
        pathBuilder2.lineToRelative(8.2f, 14.2f);
        pathBuilder2.arcTo(88.78f, 88.78f, 0.0f, false, false, 56.13f, 77.27f);
        pathBuilder2.lineToRelative(-14.2f, -8.2f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 13.86f);
        pathBuilder2.lineToRelative(14.18f, 8.19f);
        pathBuilder2.arcTo(87.27f, 87.27f, 0.0f, false, false, 40.37f, 120.0f);
        pathBuilder2.lineTo(24.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(40.37f, 136.0f);
        pathBuilder2.arcToRelative(87.27f, 87.27f, 0.0f, false, false, 7.74f, 28.88f);
        pathBuilder2.lineToRelative(-14.18f, 8.19f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 14.93f);
        pathBuilder2.arcToRelative(7.92f, 7.92f, 0.0f, false, false, 4.0f, -1.07f);
        pathBuilder2.lineToRelative(14.2f, -8.2f);
        pathBuilder2.arcToRelative(88.78f, 88.78f, 0.0f, false, false, 21.14f, 21.14f);
        pathBuilder2.lineToRelative(-8.2f, 14.2f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, 8.0f);
        pathBuilder2.lineToRelative(8.19f, -14.18f);
        pathBuilder2.arcTo(87.27f, 87.27f, 0.0f, false, false, 120.0f, 215.63f);
        pathBuilder2.lineTo(120.0f, 232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(136.0f, 215.63f);
        pathBuilder2.arcToRelative(87.27f, 87.27f, 0.0f, false, false, 28.88f, -7.74f);
        pathBuilder2.lineToRelative(8.19f, 14.18f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, -8.0f);
        pathBuilder2.lineToRelative(-8.2f, -14.2f);
        pathBuilder2.arcToRelative(88.78f, 88.78f, 0.0f, false, false, 21.14f, -21.14f);
        pathBuilder2.lineToRelative(14.2f, 8.2f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 225.0f, 184.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.92f, -10.93f);
        pathBuilder2.lineToRelative(-14.18f, -8.19f);
        pathBuilder2.arcTo(87.27f, 87.27f, 0.0f, false, false, 215.63f, 136.0f);
        pathBuilder2.lineTo(232.0f, 136.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(85.31f, 185.94f);
        pathBuilder2.arcToRelative(71.92f, 71.92f, 0.0f, false, true, 0.0f, -115.88f);
        pathBuilder2.lineTo(118.76f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 200.0f);
        pathBuilder2.arcTo(71.58f, 71.58f, 0.0f, false, true, 99.16f, 194.0f);
        pathBuilder2.lineTo(132.62f, 136.0f);
        pathBuilder2.horizontalLineToRelative(66.92f);
        pathBuilder2.arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(132.62f, 120.0f);
        pathBuilder2.lineTo(99.16f, 62.05f);
        pathBuilder2.arcToRelative(71.94f, 71.94f, 0.0f, false, true, 100.38f, 58.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gearFine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
