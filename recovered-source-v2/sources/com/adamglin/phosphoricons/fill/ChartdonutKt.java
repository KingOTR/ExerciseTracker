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

/* compiled from: Chartdonut.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChartDonut", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getChartDonut", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chartDonut", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChartdonutKt {
    private static ImageVector _chartDonut;

    public static final ImageVector getChartDonut(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(120.0f, 161.94f);
        pathBuilder.verticalLineToRelative(65.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.46f, 4.0f);
        pathBuilder.arcToRelative(104.28f, 104.28f, 0.0f, false, true, -84.0f, -64.5f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.69f, -5.34f);
        pathBuilder.lineTo(97.32f, 144.5f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.35f, 1.66f);
        pathBuilder.arcToRelative(32.25f, 32.25f, 0.0f, false, false, 15.59f, 12.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 120.0f, 161.94f);
        pathBuilder.close();
        pathBuilder.moveTo(128.06f, 24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 32.0f);
        pathBuilder.lineTo(120.0f, 88.0f);
        pathBuilder.arcToRelative(7.94f, 7.94f, 0.0f, false, false, 7.87f, 8.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 10.86f, 62.15f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.73f, 3.79f);
        pathBuilder.verticalLineToRelative(65.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.45f, 4.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 128.06f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.06f, 125.49f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 4.15f, -13.42f);
        pathBuilder.lineToRelative(0.0f, -0.07f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.57f, -8.87f);
        pathBuilder.arcTo(8.36f, 8.36f, 0.0f, false, false, 97.18f, 101.0f);
        pathBuilder.lineTo(48.85f, 73.06f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 37.92f, 76.0f);
        pathBuilder.arcTo(104.12f, 104.12f, 0.0f, false, false, 25.0f, 142.68f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 30.0f, 146.0f);
        pathBuilder.lineTo(93.22f, 129.0f);
        pathBuilder.arcTo(3.94f, 3.94f, 0.0f, false, false, 96.1f, 125.49f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chartDonut = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
