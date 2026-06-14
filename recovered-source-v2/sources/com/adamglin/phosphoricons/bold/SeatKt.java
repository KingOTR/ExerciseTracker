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

/* compiled from: Seat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Seat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSeat", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_seat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeatKt {
    private static ImageVector _seat;

    public static final ImageVector getSeat(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _seat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Seat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.0f, 232.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(112.0f, 244.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.lineTo(216.0f, 220.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 232.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 160.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(112.1f, 208.0f);
        pathBuilder.arcToRelative(19.9f, 19.9f, 0.0f, false, true, -17.89f, -11.06f);
        pathBuilder.lineTo(38.1f, 85.0f);
        pathBuilder.arcToRelative(20.12f, 20.12f, 0.0f, false, true, 0.0f, -17.9f);
        pathBuilder.lineTo(60.22f, 23.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 26.72f, -9.0f);
        pathBuilder.lineToRelative(29.81f, 14.27f);
        pathBuilder.lineToRelative(0.18f, 0.09f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 8.95f, 26.83f);
        pathBuilder.lineToRelative(-0.17f, 0.33f);
        pathBuilder.lineTo(112.5f, 80.08f);
        pathBuilder.lineTo(142.25f, 140.0f);
        pathBuilder.lineTo(208.0f, 140.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 164.0f);
        pathBuilder.lineTo(139.77f, 164.0f);
        pathBuilder.arcToRelative(19.9f, 19.9f, 0.0f, false, true, -17.89f, -11.06f);
        pathBuilder.lineToRelative(-31.79f, -64.0f);
        pathBuilder.arcToRelative(20.07f, 20.07f, 0.0f, false, true, 0.0f, -17.86f);
        pathBuilder.curveToRelative(0.06f, -0.11f, 0.12f, -0.22f, 0.17f, -0.33f);
        pathBuilder.lineToRelative(12.2f, -22.62f);
        pathBuilder.lineTo(79.91f, 37.3f);
        pathBuilder.lineTo(60.47f, 76.0f);
        pathBuilder.lineToRelative(54.1f, 108.0f);
        pathBuilder.lineTo(204.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _seat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
