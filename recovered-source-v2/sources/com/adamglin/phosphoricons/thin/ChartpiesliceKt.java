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

/* compiled from: Chartpieslice.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChartPieSlice", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getChartPieSlice", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chartPieSlice", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChartpiesliceKt {
    private static ImageVector _chartPieSlice;

    public static final ImageVector getChartPieSlice(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _chartPieSlice;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChartPieSlice", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(100.0f, 109.5f);
        pathBuilder.verticalLineToRelative(-72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.33f, -3.77f);
        pathBuilder.arcToRelative(100.0f, 100.0f, 0.0f, false, false, -65.0f, 112.5f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 35.6f, 149.0f);
        pathBuilder.lineTo(98.0f, 113.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 100.0f, 109.5f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 107.19f);
        pathBuilder.lineTo(36.67f, 139.11f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 92.0f, 43.34f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(94.12f);
        pathBuilder.lineTo(43.2f, 173.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.43f, 5.49f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(92.47f, 92.47f, 0.0f, false, true, -77.22f, -42.0f);
        pathBuilder.lineTo(130.0f, 131.88f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -3.46f);
        pathBuilder.lineTo(132.0f, 36.09f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chartPieSlice = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
