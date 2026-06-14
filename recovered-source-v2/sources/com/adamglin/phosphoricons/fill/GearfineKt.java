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

/* compiled from: Gearfine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GearFine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGearFine", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gearFine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearfineKt {
    private static ImageVector _gearFine;

    public static final ImageVector getGearFine(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.horizontalLineToRelative(-8.34f);
        pathBuilder.arcToRelative(95.07f, 95.07f, 0.0f, false, false, -8.82f, -32.9f);
        pathBuilder.lineToRelative(7.23f, -4.17f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -13.86f);
        pathBuilder.lineToRelative(-7.25f, 4.19f);
        pathBuilder.arcToRelative(97.0f, 97.0f, 0.0f, false, false, -24.08f, -24.08f);
        pathBuilder.lineToRelative(4.19f, -7.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, -8.0f);
        pathBuilder.lineToRelative(-4.17f, 7.23f);
        pathBuilder.arcTo(95.07f, 95.07f, 0.0f, false, false, 136.0f, 32.34f);
        pathBuilder.lineTo(136.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.34f);
        pathBuilder.arcToRelative(95.07f, 95.07f, 0.0f, false, false, -32.9f, 8.82f);
        pathBuilder.lineToRelative(-4.17f, -7.23f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, 8.0f);
        pathBuilder.lineToRelative(4.19f, 7.25f);
        pathBuilder.arcTo(97.0f, 97.0f, 0.0f, false, false, 49.18f, 73.26f);
        pathBuilder.lineToRelative(-7.25f, -4.19f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 13.86f);
        pathBuilder.lineToRelative(7.23f, 4.17f);
        pathBuilder.arcTo(95.07f, 95.07f, 0.0f, false, false, 32.34f, 120.0f);
        pathBuilder.lineTo(24.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(8.34f);
        pathBuilder.arcToRelative(95.07f, 95.07f, 0.0f, false, false, 8.82f, 32.9f);
        pathBuilder.lineToRelative(-7.23f, 4.17f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 14.93f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, false, 4.0f, -1.07f);
        pathBuilder.lineToRelative(7.25f, -4.19f);
        pathBuilder.arcToRelative(97.0f, 97.0f, 0.0f, false, false, 24.08f, 24.08f);
        pathBuilder.lineToRelative(-4.19f, 7.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, 8.0f);
        pathBuilder.lineToRelative(4.17f, -7.23f);
        pathBuilder.arcToRelative(95.07f, 95.07f, 0.0f, false, false, 32.9f, 8.82f);
        pathBuilder.lineTo(120.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-8.34f);
        pathBuilder.arcToRelative(95.07f, 95.07f, 0.0f, false, false, 32.9f, -8.82f);
        pathBuilder.lineToRelative(4.17f, 7.23f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, -8.0f);
        pathBuilder.lineToRelative(-4.19f, -7.25f);
        pathBuilder.arcToRelative(97.0f, 97.0f, 0.0f, false, false, 24.08f, -24.08f);
        pathBuilder.lineToRelative(7.25f, 4.19f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 225.0f, 184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.92f, -10.93f);
        pathBuilder.lineToRelative(-7.23f, -4.17f);
        pathBuilder.arcToRelative(95.07f, 95.07f, 0.0f, false, false, 8.82f, -32.9f);
        pathBuilder.lineTo(232.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 128.0f);
        pathBuilder.arcTo(55.91f, 55.91f, 0.0f, false, true, 93.38f, 84.0f);
        pathBuilder.lineToRelative(25.38f, 44.0f);
        pathBuilder.lineTo(93.38f, 172.0f);
        pathBuilder.arcTo(55.91f, 55.91f, 0.0f, false, true, 72.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 184.0f);
        pathBuilder.arcToRelative(55.67f, 55.67f, 0.0f, false, true, -20.78f, -4.0f);
        pathBuilder.lineToRelative(25.4f, -44.0f);
        pathBuilder.horizontalLineToRelative(50.8f);
        pathBuilder.arcTo(56.09f, 56.09f, 0.0f, false, true, 128.0f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.62f, 120.0f);
        pathBuilder.lineTo(107.22f, 76.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, 76.2f, 44.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gearFine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
