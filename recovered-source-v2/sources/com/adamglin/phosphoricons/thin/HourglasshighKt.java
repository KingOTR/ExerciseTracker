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

/* compiled from: Hourglasshigh.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HourglassHigh", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHourglassHigh", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hourglassHigh", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HourglasshighKt {
    private static ImageVector _hourglassHigh;

    public static final ImageVector getHourglassHigh(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(184.0f, 28.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 40.0f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.8f, 9.6f);
        pathBuilder.lineTo(121.33f, 128.0f);
        pathBuilder.lineTo(64.8f, 170.4f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 180.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineTo(184.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.verticalLineTo(180.36f);
        pathBuilder.arcToRelative(12.05f, 12.05f, 0.0f, false, false, -4.76f, -9.57f);
        pathBuilder.lineTo(134.63f, 128.0f);
        pathBuilder.lineToRelative(56.61f, -42.79f);
        pathBuilder.arcTo(12.05f, 12.05f, 0.0f, false, false, 196.0f, 75.64f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 36.0f);
        pathBuilder.horizontalLineTo(184.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.verticalLineTo(60.0f);
        pathBuilder.horizontalLineTo(68.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 180.36f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.verticalLineTo(180.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.6f, -3.2f);
        pathBuilder.lineTo(128.0f, 133.0f);
        pathBuilder.lineToRelative(58.42f, 44.16f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 188.0f, 180.36f);
        pathBuilder.close();
        pathBuilder.moveTo(186.41f, 78.83f);
        pathBuilder.lineTo(128.0f, 123.0f);
        pathBuilder.lineTo(69.6f, 79.2f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 68.0f, 76.0f);
        pathBuilder.verticalLineTo(68.0f);
        pathBuilder.horizontalLineTo(188.0f);
        pathBuilder.verticalLineToRelative(7.64f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 186.41f, 78.83f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hourglassHigh = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
