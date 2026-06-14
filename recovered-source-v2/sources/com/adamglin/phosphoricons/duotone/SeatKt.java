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

/* compiled from: Seat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Seat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSeat", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_seat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeatKt {
    private static ImageVector _seat;

    public static final ImageVector getSeat(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 160.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(114.11f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.15f, -4.42f);
        pathBuilder.lineToRelative(-58.12f, -116.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -7.16f);
        pathBuilder.lineTo(71.0f, 28.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.73f, -3.57f);
        pathBuilder.lineToRelative(33.89f, 14.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.57f, 10.73f);
        pathBuilder.lineTo(104.84f, 76.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 7.16f);
        pathBuilder.lineToRelative(31.78f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 4.42f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(224.0f, 232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.lineTo(112.0f, 240.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.lineTo(216.0f, 224.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 232.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 160.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder2.lineTo(114.11f, 208.0f);
        pathBuilder2.arcToRelative(15.93f, 15.93f, 0.0f, false, true, -14.32f, -8.85f);
        pathBuilder2.lineToRelative(-58.11f, -116.0f);
        pathBuilder2.arcToRelative(16.1f, 16.1f, 0.0f, false, true, 0.0f, -14.32f);
        pathBuilder2.lineToRelative(22.12f, -44.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 85.0f, 17.56f);
        pathBuilder2.lineToRelative(33.69f, 14.22f);
        pathBuilder2.lineToRelative(0.47f, 0.22f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 7.15f, 21.46f);
        pathBuilder2.arcToRelative(1.51f, 1.51f, 0.0f, false, true, -0.11f, 0.22f);
        pathBuilder2.lineTo(112.0f, 80.0f);
        pathBuilder2.lineToRelative(31.78f, 64.0f);
        pathBuilder2.lineTo(208.0f, 144.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 160.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 160.0f);
        pathBuilder2.lineTo(143.77f, 160.0f);
        pathBuilder2.arcToRelative(15.91f, 15.91f, 0.0f, false, true, -14.31f, -8.85f);
        pathBuilder2.lineToRelative(-31.79f, -64.0f);
        pathBuilder2.arcToRelative(16.07f, 16.07f, 0.0f, false, true, 0.0f, -14.29f);
        pathBuilder2.lineToRelative(0.12f, -0.22f);
        pathBuilder2.lineTo(112.0f, 46.32f);
        pathBuilder2.lineTo(78.57f, 32.21f);
        pathBuilder2.curveToRelative(-0.16f, -0.06f, -0.31f, -0.14f, -0.46f, -0.21f);
        pathBuilder2.lineTo(56.0f, 76.0f);
        pathBuilder2.lineTo(114.1f, 192.0f);
        pathBuilder2.lineTo(208.0f, 192.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _seat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
