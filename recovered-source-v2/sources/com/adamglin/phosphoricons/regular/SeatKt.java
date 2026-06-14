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

/* compiled from: Seat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Seat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSeat", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_seat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeatKt {
    private static ImageVector _seat;

    public static final ImageVector getSeat(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(112.0f, 240.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.lineTo(216.0f, 224.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 232.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 160.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(114.11f, 208.0f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, true, -14.32f, -8.85f);
        pathBuilder.lineToRelative(-58.11f, -116.0f);
        pathBuilder.arcToRelative(16.1f, 16.1f, 0.0f, false, true, 0.0f, -14.32f);
        pathBuilder.lineToRelative(22.12f, -44.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 85.0f, 17.56f);
        pathBuilder.lineToRelative(33.69f, 14.22f);
        pathBuilder.lineToRelative(0.47f, 0.22f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 7.15f, 21.46f);
        pathBuilder.arcToRelative(1.51f, 1.51f, 0.0f, false, true, -0.11f, 0.22f);
        pathBuilder.lineTo(112.0f, 80.0f);
        pathBuilder.lineToRelative(31.78f, 64.0f);
        pathBuilder.lineTo(208.0f, 144.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 160.0f);
        pathBuilder.lineTo(143.77f, 160.0f);
        pathBuilder.arcToRelative(15.91f, 15.91f, 0.0f, false, true, -14.31f, -8.85f);
        pathBuilder.lineToRelative(-31.79f, -64.0f);
        pathBuilder.arcToRelative(16.07f, 16.07f, 0.0f, false, true, 0.0f, -14.29f);
        pathBuilder.lineToRelative(0.12f, -0.22f);
        pathBuilder.lineTo(112.0f, 46.32f);
        pathBuilder.lineTo(78.57f, 32.21f);
        pathBuilder.arcTo(4.84f, 4.84f, 0.0f, false, true, 78.1f, 32.0f);
        pathBuilder.lineTo(56.0f, 76.0f);
        pathBuilder.lineTo(114.1f, 192.0f);
        pathBuilder.lineTo(208.0f, 192.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _seat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
