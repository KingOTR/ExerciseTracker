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

/* compiled from: Hourglasssimplehigh.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HourglassSimpleHigh", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getHourglassSimpleHigh", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hourglassSimpleHigh", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HourglasssimplehighKt {
    private static ImageVector _hourglassSimpleHigh;

    public static final ImageVector getHourglassSimpleHigh(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _hourglassSimpleHigh;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HourglassSimpleHigh", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(211.18f, 196.56f);
        pathBuilder.lineTo(139.57f, 128.0f);
        pathBuilder.lineToRelative(71.61f, -68.56f);
        pathBuilder.arcToRelative(1.59f, 1.59f, 0.0f, false, true, 0.13f, -0.13f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 32.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 44.7f, 59.31f);
        pathBuilder.lineToRelative(0.12f, 0.13f);
        pathBuilder.lineTo(116.43f, 128.0f);
        pathBuilder.lineTo(44.82f, 196.56f);
        pathBuilder.lineToRelative(-0.12f, 0.13f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 224.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.32f, -27.31f);
        pathBuilder.arcTo(1.59f, 1.59f, 0.0f, false, true, 211.18f, 196.56f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(89.43f, 80.0f);
        pathBuilder.horizontalLineToRelative(77.14f);
        pathBuilder.lineTo(128.0f, 116.92f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 48.0f);
        pathBuilder.lineToRelative(-16.7f, 16.0f);
        pathBuilder.horizontalLineTo(72.72f);
        pathBuilder.lineTo(56.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 208.0f);
        pathBuilder.lineToRelative(72.0f, -68.92f);
        pathBuilder.lineTo(200.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hourglassSimpleHigh = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
