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

/* compiled from: Seatbelt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Seatbelt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSeatbelt", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_seatbelt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeatbeltKt {
    private static ImageVector _seatbelt;

    public static final ImageVector getSeatbelt(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 112.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, -44.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, true, 128.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 216.0f);
        pathBuilder.lineTo(77.16f, 216.0f);
        pathBuilder.lineTo(197.29f, 110.0f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, 1.1f, -1.19f);
        pathBuilder.arcToRelative(8.07f, 8.07f, 0.0f, false, false, 1.61f, -5.08f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 186.71f, 98.0f);
        pathBuilder.lineToRelative(-24.54f, 21.65f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, false, 49.0f, 179.25f);
        pathBuilder.arcToRelative(8.33f, 8.33f, 0.0f, false, false, -0.1f, 1.1f);
        pathBuilder.lineTo(48.0f, 223.83f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 232.0f);
        pathBuilder.lineTo(200.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.12f, 143.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.25f, 1.94f);
        pathBuilder.lineTo(119.47f, 200.0f);
        pathBuilder.lineTo(200.0f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.arcToRelative(79.6f, 79.6f, 0.0f, false, false, -14.27f, -45.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 188.12f, 143.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _seatbelt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
