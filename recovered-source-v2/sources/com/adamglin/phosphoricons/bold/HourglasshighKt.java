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

/* compiled from: Hourglasshigh.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HourglassHigh", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHourglassHigh", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hourglassHigh", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HourglasshighKt {
    private static ImageVector _hourglassHigh;

    public static final ImageVector getHourglassHigh(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _hourglassHigh;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HourglassHigh", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(184.0f, 20.0f);
        pathBuilder.lineTo(72.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 52.0f, 40.0f);
        pathBuilder.lineTo(52.0f, 76.0f);
        pathBuilder.arcToRelative(20.1f, 20.1f, 0.0f, false, false, 8.0f, 16.0f);
        pathBuilder.lineToRelative(48.0f, 36.0f);
        pathBuilder.lineTo(60.0f, 164.0f);
        pathBuilder.arcToRelative(20.1f, 20.1f, 0.0f, false, false, -8.0f, 16.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(184.0f, 236.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(204.0f, 180.36f);
        pathBuilder.arcToRelative(20.13f, 20.13f, 0.0f, false, false, -7.94f, -16.0f);
        pathBuilder.lineTo(147.9f, 128.0f);
        pathBuilder.lineToRelative(48.16f, -36.4f);
        pathBuilder.arcToRelative(20.13f, 20.13f, 0.0f, false, false, 7.94f, -16.0f);
        pathBuilder.lineTo(204.0f, 40.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 184.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 44.0f);
        pathBuilder.lineTo(180.0f, 60.0f);
        pathBuilder.lineTo(76.0f, 60.0f);
        pathBuilder.lineTo(76.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 113.0f);
        pathBuilder.lineTo(89.33f, 84.0f);
        pathBuilder.horizontalLineToRelative(77.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 212.0f);
        pathBuilder.lineTo(76.0f, 212.0f);
        pathBuilder.lineTo(76.0f, 182.0f);
        pathBuilder.lineToRelative(52.0f, -39.0f);
        pathBuilder.lineToRelative(52.0f, 39.33f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hourglassHigh = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
