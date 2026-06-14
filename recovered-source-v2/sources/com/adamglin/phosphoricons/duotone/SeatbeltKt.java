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

/* compiled from: Seatbelt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Seatbelt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSeatbelt", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_seatbelt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeatbeltKt {
    private static ImageVector _seatbelt;

    public static final ImageVector getSeatbelt(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _seatbelt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Seatbelt", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(92.0f, 68.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 120.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, false, -72.0f, 72.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.lineTo(200.0f, 224.0f);
        pathBuilder.lineTo(200.0f, 192.0f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, false, 128.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(172.0f, 68.0f);
        pathBuilder2.arcToRelative(44.0f, 44.0f, 0.0f, true, false, -44.0f, 44.0f);
        pathBuilder2.arcTo(44.05f, 44.05f, 0.0f, false, false, 172.0f, 68.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 96.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 96.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.lineTo(56.0f, 232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.29f, -14.0f);
        pathBuilder2.lineToRelative(98.07f, -86.54f);
        pathBuilder2.arcToRelative(64.0f, 64.0f, 0.0f, false, false, -84.0f, 50.33f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 49.0f, 179.25f);
        pathBuilder2.arcToRelative(80.0f, 80.0f, 0.0f, false, true, 113.16f, -59.59f);
        pathBuilder2.lineTo(186.71f, 98.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.58f, 12.0f);
        pathBuilder2.lineTo(77.16f, 216.0f);
        pathBuilder2.lineTo(200.0f, 216.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 224.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(193.73f, 146.38f);
        pathBuilder2.arcTo(79.6f, 79.6f, 0.0f, false, true, 208.0f, 192.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.arcToRelative(63.67f, 63.67f, 0.0f, false, false, -11.41f, -36.49f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.14f, -9.13f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _seatbelt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
