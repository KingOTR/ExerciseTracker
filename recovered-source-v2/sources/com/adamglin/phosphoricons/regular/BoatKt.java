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

/* compiled from: Boat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Boat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBoat", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_boat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoatKt {
    private static ImageVector _boat;

    public static final ImageVector getBoat(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _boat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Boat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(221.06f, 110.59f);
        pathBuilder.lineTo(208.0f, 106.23f);
        pathBuilder.lineTo(208.0f, 56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.lineTo(136.0f, 40.0f);
        pathBuilder.lineTo(136.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 40.0f);
        pathBuilder.lineTo(64.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 56.0f);
        pathBuilder.verticalLineToRelative(50.23f);
        pathBuilder.lineToRelative(-13.06f, 4.36f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 125.77f);
        pathBuilder.lineTo(24.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 61.54f, 97.89f, 86.72f, 102.06f, 87.76f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.88f, 0.0f);
        pathBuilder.curveTo(134.11f, 238.72f, 232.0f, 213.54f, 232.0f, 152.0f);
        pathBuilder.lineTo(232.0f, 125.77f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 221.06f, 110.59f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 56.0f);
        pathBuilder.lineTo(192.0f, 56.0f);
        pathBuilder.verticalLineToRelative(44.9f);
        pathBuilder.lineTo(130.53f, 80.41f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.06f, 0.0f);
        pathBuilder.lineTo(64.0f, 100.9f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 24.91f, -23.68f, 43.0f, -43.55f, 53.83f);
        pathBuilder.arcTo(228.13f, 228.13f, 0.0f, false, true, 128.0f, 223.72f);
        pathBuilder.arcTo(226.85f, 226.85f, 0.0f, false, true, 83.81f, 206.0f);
        pathBuilder.curveTo(47.6f, 186.35f, 40.0f, 165.79f, 40.0f, 152.0f);
        pathBuilder.lineTo(40.0f, 125.77f);
        pathBuilder.lineTo(120.0f, 99.1f);
        pathBuilder.lineTo(120.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(136.0f, 99.1f);
        pathBuilder.lineToRelative(80.0f, 26.67f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _boat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
