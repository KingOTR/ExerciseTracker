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

/* compiled from: Chartpieslice.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChartPieSlice", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getChartPieSlice", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chartPieSlice", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChartpiesliceKt {
    private static ImageVector _chartPieSlice;

    public static final ImageVector getChartPieSlice(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(93.82f, 116.64f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 106.15f);
        pathBuilder.lineTo(100.0f, 40.74f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 83.0f, 29.83f);
        pathBuilder.arcTo(108.26f, 108.26f, 0.0f, false, false, 20.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 3.37f, 0.16f, 6.76f, 0.47f, 10.1f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, 9.38f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 62.06f);
        pathBuilder.verticalLineToRelative(37.0f);
        pathBuilder.lineTo(44.81f, 116.36f);
        pathBuilder.arcTo(84.39f, 84.39f, 0.0f, false, true, 76.0f, 62.06f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(89.53f);
        pathBuilder.lineTo(39.18f, 166.27f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.3f, 16.46f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(84.47f, 84.47f, 0.0f, false, true, -65.57f, -31.5f);
        pathBuilder.lineTo(134.0f, 138.79f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.0f, -10.37f);
        pathBuilder.lineTo(140.0f, 44.85f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chartPieSlice = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
