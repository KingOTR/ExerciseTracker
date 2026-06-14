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

/* compiled from: Wheelchairmotion.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WheelchairMotion", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getWheelchairMotion", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wheelchairMotion", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WheelchairmotionKt {
    private static ImageVector _wheelchairMotion;

    public static final ImageVector getWheelchairMotion(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _wheelchairMotion;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WheelchairMotion", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 84.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 176.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(205.28f, 132.39f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 2.49f, 10.0f);
        pathBuilder.lineToRelative(-16.0f, 80.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 232.0f);
        pathBuilder.arcToRelative(11.87f, 11.87f, 0.0f, false, true, -2.36f, -0.23f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.42f, -14.12f);
        pathBuilder.lineTo(181.36f, 152.0f);
        pathBuilder.lineTo(124.0f, 152.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.4f, -18.0f);
        pathBuilder.lineToRelative(17.92f, -31.2f);
        pathBuilder.arcToRelative(76.1f, 76.1f, 0.0f, false, false, -79.88f, 10.55f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 36.36f, 94.86f);
        pathBuilder.arcToRelative(100.0f, 100.0f, 0.0f, false, true, 118.19f, -6.68f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.85f, 16.0f);
        pathBuilder.lineTo(144.74f, 128.0f);
        pathBuilder.lineTo(196.0f, 128.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 205.28f, 132.39f);
        pathBuilder.close();
        pathBuilder.moveTo(163.81f, 176.91f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, true, true, -73.64f, -68.16f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.66f, 23.72f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 46.05f, 42.62f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.93f, 1.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wheelchairMotion = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
