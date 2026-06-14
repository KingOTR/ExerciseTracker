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

/* compiled from: Chartdonut.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChartDonut", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getChartDonut", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chartDonut", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChartdonutKt {
    private static ImageVector _chartDonut;

    public static final ImageVector getChartDonut(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _chartDonut;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChartDonut", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.lineTo(124.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, -31.18f, 18.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.47f, -5.47f);
        pathBuilder.lineToRelative(-48.5f, -28.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 41.39f, 78.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(46.38f, 85.5f);
        pathBuilder.lineToRelative(41.67f, 24.0f);
        pathBuilder.arcToRelative(43.86f, 43.86f, 0.0f, false, false, -3.4f, 25.93f);
        pathBuilder.lineTo(38.18f, 147.93f);
        pathBuilder.arcToRelative(92.19f, 92.19f, 0.0f, false, true, 8.2f, -62.43f);
        pathBuilder.close();
        pathBuilder.moveTo(40.25f, 155.65f);
        pathBuilder.lineTo(86.71f, 143.2f);
        pathBuilder.arcTo(44.11f, 44.11f, 0.0f, false, false, 124.0f, 171.81f);
        pathBuilder.verticalLineToRelative(48.1f);
        pathBuilder.arcTo(92.17f, 92.17f, 0.0f, false, true, 40.25f, 155.65f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 219.91f);
        pathBuilder.verticalLineToRelative(-48.1f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -87.63f);
        pathBuilder.lineTo(132.0f, 36.09f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, 0.0f, 183.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chartDonut = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
