package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Chartdonut.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChartDonut", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getChartDonut", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chartDonut", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChartdonutKt {
    private static ImageVector _chartDonut;

    public static final ImageVector getChartDonut(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, -29.45f, 17.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.2f, -8.2f);
        pathBuilder.lineToRelative(-48.5f, -28.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 39.65f, 77.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(47.21f, 88.29f);
        pathBuilder.lineToRelative(38.29f, 22.1f);
        pathBuilder.arcTo(46.0f, 46.0f, 0.0f, false, false, 82.0f, 128.0f);
        pathBuilder.arcToRelative(47.64f, 47.64f, 0.0f, false, false, 0.4f, 6.0f);
        pathBuilder.lineTo(39.7f, 145.45f);
        pathBuilder.arcToRelative(90.27f, 90.27f, 0.0f, false, true, 7.51f, -57.16f);
        pathBuilder.close();
        pathBuilder.moveTo(42.81f, 157.0f);
        pathBuilder.lineToRelative(42.7f, -11.44f);
        pathBuilder.arcToRelative(46.12f, 46.12f, 0.0f, false, false, 36.49f, 28.0f);
        pathBuilder.verticalLineToRelative(44.2f);
        pathBuilder.arcTo(90.2f, 90.2f, 0.0f, false, true, 42.81f, 157.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 217.8f);
        pathBuilder.verticalLineTo(173.6f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, -91.21f);
        pathBuilder.verticalLineTo(38.2f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, 0.0f, 179.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chartDonut = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
