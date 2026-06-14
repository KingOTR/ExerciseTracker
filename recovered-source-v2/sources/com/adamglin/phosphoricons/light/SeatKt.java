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

/* compiled from: Seat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Seat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSeat", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_seat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeatKt {
    private static ImageVector _seat;

    public static final ImageVector getSeat(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(222.0f, 232.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(112.0f, 238.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, -12.0f);
        pathBuilder.lineTo(216.0f, 226.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 232.0f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 160.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f);
        pathBuilder.lineTo(114.11f, 206.0f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, true, -12.53f, -7.74f);
        pathBuilder.lineToRelative(-58.11f, -116.0f);
        pathBuilder.arcToRelative(14.06f, 14.06f, 0.0f, false, true, 0.0f, -12.52f);
        pathBuilder.lineToRelative(22.12f, -44.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 18.58f, -6.35f);
        pathBuilder.lineToRelative(33.74f, 14.24f);
        pathBuilder.lineToRelative(0.34f, 0.17f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 6.27f, 18.78f);
        pathBuilder.lineToRelative(-0.09f, 0.16f);
        pathBuilder.lineTo(110.18f, 79.16f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 1.73f);
        pathBuilder.lineToRelative(31.78f, 64.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.78f, 1.09f);
        pathBuilder.lineTo(208.0f, 145.98f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 160.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f);
        pathBuilder.lineTo(143.77f, 158.0f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, true, -12.52f, -7.74f);
        pathBuilder.lineToRelative(-31.78f, -64.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, -12.5f);
        pathBuilder.lineToRelative(0.09f, -0.17f);
        pathBuilder.lineToRelative(14.25f, -26.42f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.08f, -1.47f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.89f, -1.1f);
        pathBuilder.lineTo(79.35f, 30.37f);
        pathBuilder.lineTo(79.0f, 30.21f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.89f, -0.21f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.79f, 1.1f);
        pathBuilder.lineToRelative(-22.12f, 44.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 1.78f);
        pathBuilder.lineToRelative(58.12f, 116.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.79f, 1.11f);
        pathBuilder.lineTo(208.0f, 193.99f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _seat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
