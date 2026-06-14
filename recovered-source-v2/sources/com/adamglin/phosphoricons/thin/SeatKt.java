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

/* compiled from: Seat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Seat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSeat", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_seat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeatKt {
    private static ImageVector _seat;

    public static final ImageVector getSeat(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(220.0f, 232.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(112.0f, 236.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.lineTo(216.0f, 228.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 232.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 160.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(114.11f, 204.0f);
        pathBuilder.arcToRelative(11.94f, 11.94f, 0.0f, false, true, -10.74f, -6.63f);
        pathBuilder.lineToRelative(-58.11f, -116.0f);
        pathBuilder.arcToRelative(12.07f, 12.07f, 0.0f, false, true, 0.0f, -10.74f);
        pathBuilder.lineToRelative(22.12f, -44.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.0f, -5.42f);
        pathBuilder.lineToRelative(33.78f, 14.27f);
        pathBuilder.lineToRelative(0.23f, 0.11f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.37f, 16.1f);
        pathBuilder.lineToRelative(-0.06f, 0.1f);
        pathBuilder.lineTo(108.4f, 78.26f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 3.53f);
        pathBuilder.lineToRelative(31.78f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.57f, 2.2f);
        pathBuilder.lineTo(208.0f, 147.99f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 160.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(143.77f, 156.0f);
        pathBuilder.arcTo(11.94f, 11.94f, 0.0f, false, true, 133.0f, 149.37f);
        pathBuilder.lineToRelative(-31.78f, -64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -10.72f);
        pathBuilder.lineToRelative(0.06f, -0.11f);
        pathBuilder.lineToRelative(14.27f, -26.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.71f, -5.27f);
        pathBuilder.lineTo(80.13f, 28.53f);
        pathBuilder.lineToRelative(-0.24f, -0.11f);
        pathBuilder.arcTo(3.91f, 3.91f, 0.0f, false, false, 78.11f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 2.21f);
        pathBuilder.lineToRelative(-22.12f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 3.57f);
        pathBuilder.lineToRelative(58.11f, 116.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 2.21f);
        pathBuilder.lineTo(208.0f, 195.99f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _seat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
