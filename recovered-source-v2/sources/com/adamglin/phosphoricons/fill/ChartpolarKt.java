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

/* compiled from: Chartpolar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChartPolar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getChartPolar", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chartPolar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChartpolarKt {
    private static ImageVector _chartPolar;

    public static final ImageVector getChartPolar(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _chartPolar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChartPolar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(120.0f, 199.54f);
        pathBuilder.verticalLineToRelative(27.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.46f, 4.0f);
        pathBuilder.arcToRelative(104.22f, 104.22f, 0.0f, false, true, -90.8f, -90.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.46f);
        pathBuilder.lineTo(56.46f, 136.02f);
        pathBuilder.arcTo(72.11f, 72.11f, 0.0f, false, false, 120.0f, 199.54f);
        pathBuilder.close();
        pathBuilder.moveTo(183.42f, 136.0f);
        pathBuilder.lineTo(136.0f, 136.0f);
        pathBuilder.verticalLineToRelative(47.42f);
        pathBuilder.arcTo(56.11f, 56.11f, 0.0f, false, false, 183.42f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 72.58f);
        pathBuilder.lineTo(136.0f, 120.0f);
        pathBuilder.horizontalLineToRelative(47.42f);
        pathBuilder.arcTo(56.11f, 56.11f, 0.0f, false, false, 136.0f, 72.58f);
        pathBuilder.close();
        pathBuilder.moveTo(227.28f, 136.0f);
        pathBuilder.lineTo(199.54f, 136.0f);
        pathBuilder.arcTo(72.11f, 72.11f, 0.0f, false, true, 136.0f, 199.54f);
        pathBuilder.verticalLineToRelative(27.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.46f, 4.0f);
        pathBuilder.arcToRelative(104.22f, 104.22f, 0.0f, false, false, 90.8f, -90.8f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 227.28f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(199.54f, 120.0f);
        pathBuilder.horizontalLineToRelative(27.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.46f);
        pathBuilder.arcToRelative(104.22f, 104.22f, 0.0f, false, false, -90.8f, -90.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.46f, 4.0f);
        pathBuilder.lineTo(136.02f, 56.46f);
        pathBuilder.arcTo(72.11f, 72.11f, 0.0f, false, true, 199.54f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(115.54f, 24.74f);
        pathBuilder.arcToRelative(104.22f, 104.22f, 0.0f, false, false, -90.8f, 90.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.46f);
        pathBuilder.lineTo(56.46f, 120.0f);
        pathBuilder.arcTo(72.11f, 72.11f, 0.0f, false, true, 120.0f, 56.46f);
        pathBuilder.lineTo(120.0f, 28.72f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 115.54f, 24.74f);
        pathBuilder.close();
        pathBuilder.moveTo(72.58f, 120.0f);
        pathBuilder.lineTo(120.0f, 120.0f);
        pathBuilder.lineTo(120.0f, 72.58f);
        pathBuilder.arcTo(56.11f, 56.11f, 0.0f, false, false, 72.58f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 183.42f);
        pathBuilder.lineTo(120.0f, 136.0f);
        pathBuilder.lineTo(72.58f, 136.0f);
        pathBuilder.arcTo(56.11f, 56.11f, 0.0f, false, false, 120.0f, 183.42f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chartPolar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
