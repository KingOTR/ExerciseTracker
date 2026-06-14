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

/* compiled from: Hourglasssimplelow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HourglassSimpleLow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHourglassSimpleLow", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hourglassSimpleLow", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HourglasssimplelowKt {
    private static ImageVector _hourglassSimpleLow;

    public static final ImageVector getHourglassSimpleLow(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _hourglassSimpleLow;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HourglassSimpleLow", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(133.78f, 128.0f);
        pathBuilder.lineToRelative(74.68f, -71.51f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 36.0f);
        pathBuilder.lineTo(56.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 20.49f);
        pathBuilder.lineToRelative(0.07f, 0.06f);
        pathBuilder.lineTo(122.22f, 128.0f);
        pathBuilder.lineTo(47.61f, 199.45f);
        pathBuilder.lineToRelative(-0.07f, 0.06f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 220.0f);
        pathBuilder.lineTo(200.0f, 220.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.42f, -20.55f);
        pathBuilder.close();
        pathBuilder.moveTo(168.16f, 172.0f);
        pathBuilder.lineTo(87.84f, 172.0f);
        pathBuilder.lineTo(128.0f, 133.54f);
        pathBuilder.close();
        pathBuilder.moveTo(52.33f, 46.47f);
        pathBuilder.arcTo(3.93f, 3.93f, 0.0f, false, true, 56.0f, 44.0f);
        pathBuilder.lineTo(200.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.89f, 6.77f);
        pathBuilder.lineTo(128.0f, 122.46f);
        pathBuilder.lineTo(53.17f, 50.8f);
        pathBuilder.arcTo(3.92f, 3.92f, 0.0f, false, true, 52.33f, 46.47f);
        pathBuilder.close();
        pathBuilder.moveTo(203.67f, 209.53f);
        pathBuilder.arcTo(3.93f, 3.93f, 0.0f, false, true, 200.0f, 212.0f);
        pathBuilder.lineTo(56.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.86f, -6.8f);
        pathBuilder.lineTo(79.49f, 180.0f);
        pathBuilder.horizontalLineToRelative(97.0f);
        pathBuilder.lineToRelative(26.28f, 25.17f);
        pathBuilder.arcTo(3.93f, 3.93f, 0.0f, false, true, 203.67f, 209.53f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hourglassSimpleLow = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
