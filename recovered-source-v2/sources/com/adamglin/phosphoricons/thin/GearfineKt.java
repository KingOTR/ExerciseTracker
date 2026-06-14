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

/* compiled from: Gearfine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GearFine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGearFine", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gearFine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearfineKt {
    private static ImageVector _gearFine;

    public static final ImageVector getGearFine(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 124.0f);
        pathBuilder.lineTo(211.9f, 124.0f);
        pathBuilder.arcToRelative(83.35f, 83.35f, 0.0f, false, false, -9.27f, -34.47f);
        pathBuilder.lineToRelative(17.44f, -10.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -6.92f);
        pathBuilder.lineTo(198.62f, 82.61f);
        pathBuilder.arcToRelative(84.54f, 84.54f, 0.0f, false, false, -25.23f, -25.23f);
        pathBuilder.lineToRelative(10.07f, -17.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.92f, -4.0f);
        pathBuilder.lineTo(166.47f, 53.37f);
        pathBuilder.arcTo(83.35f, 83.35f, 0.0f, false, false, 132.0f, 44.1f);
        pathBuilder.lineTo(132.0f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.lineTo(124.0f, 44.1f);
        pathBuilder.arcToRelative(83.35f, 83.35f, 0.0f, false, false, -34.47f, 9.27f);
        pathBuilder.lineTo(79.46f, 35.93f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.92f, 4.0f);
        pathBuilder.lineTo(82.61f, 57.38f);
        pathBuilder.arcTo(84.54f, 84.54f, 0.0f, false, false, 57.38f, 82.61f);
        pathBuilder.lineTo(39.93f, 72.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 6.92f);
        pathBuilder.lineTo(53.37f, 89.53f);
        pathBuilder.arcTo(83.35f, 83.35f, 0.0f, false, false, 44.1f, 124.0f);
        pathBuilder.lineTo(24.0f, 124.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(44.1f, 132.0f);
        pathBuilder.arcToRelative(83.35f, 83.35f, 0.0f, false, false, 9.27f, 34.47f);
        pathBuilder.lineTo(35.93f, 176.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 7.46f);
        pathBuilder.arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.0f, -0.54f);
        pathBuilder.lineToRelative(17.45f, -10.07f);
        pathBuilder.arcToRelative(84.54f, 84.54f, 0.0f, false, false, 25.23f, 25.23f);
        pathBuilder.lineTo(72.54f, 216.07f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 74.0f, 221.53f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.46f, -1.46f);
        pathBuilder.lineToRelative(10.07f, -17.44f);
        pathBuilder.arcTo(83.35f, 83.35f, 0.0f, false, false, 124.0f, 211.9f);
        pathBuilder.lineTo(124.0f, 232.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 211.9f);
        pathBuilder.arcToRelative(83.35f, 83.35f, 0.0f, false, false, 34.47f, -9.27f);
        pathBuilder.lineToRelative(10.07f, 17.44f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.92f, -4.0f);
        pathBuilder.lineToRelative(-10.07f, -17.45f);
        pathBuilder.arcToRelative(84.54f, 84.54f, 0.0f, false, false, 25.23f, -25.23f);
        pathBuilder.lineToRelative(17.45f, 10.07f);
        pathBuilder.arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.0f, 0.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -7.46f);
        pathBuilder.lineToRelative(-17.44f, -10.07f);
        pathBuilder.arcTo(83.35f, 83.35f, 0.0f, false, false, 211.9f, 132.0f);
        pathBuilder.lineTo(232.0f, 132.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 52.0f);
        pathBuilder.arcToRelative(76.09f, 76.09f, 0.0f, false, true, 75.89f, 72.0f);
        pathBuilder.lineTo(130.31f, 124.0f);
        pathBuilder.lineTo(93.53f, 60.3f);
        pathBuilder.arcTo(75.59f, 75.59f, 0.0f, false, true, 128.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 128.0f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, true, 86.61f, 64.31f);
        pathBuilder.lineTo(123.38f, 128.0f);
        pathBuilder.lineTo(86.61f, 191.69f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, true, 52.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 204.0f);
        pathBuilder.arcToRelative(75.59f, 75.59f, 0.0f, false, true, -34.47f, -8.3f);
        pathBuilder.lineTo(130.31f, 132.0f);
        pathBuilder.horizontalLineToRelative(73.58f);
        pathBuilder.arcTo(76.09f, 76.09f, 0.0f, false, true, 128.0f, 204.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gearFine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
