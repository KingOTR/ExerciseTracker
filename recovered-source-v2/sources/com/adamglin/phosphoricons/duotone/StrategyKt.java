package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Strategy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Strategy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getStrategy", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_strategy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StrategyKt {
    private static ImageVector _strategy;

    public static final ImageVector getStrategy(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _strategy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Strategy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(104.0f, 188.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 104.0f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(76.0f, 152.0f);
        pathBuilder2.arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f);
        pathBuilder2.arcTo(36.0f, 36.0f, 0.0f, false, false, 76.0f, 152.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(76.0f, 208.0f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder2.arcTo(20.0f, 20.0f, 0.0f, false, true, 76.0f, 208.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(42.34f, 106.34f);
        pathBuilder2.lineTo(56.69f, 92.0f);
        pathBuilder2.lineTo(42.34f, 77.66f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 53.66f, 66.34f);
        pathBuilder2.lineTo(68.0f, 80.69f);
        pathBuilder2.lineTo(82.34f, 66.34f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 93.66f, 77.66f);
        pathBuilder2.lineTo(79.31f, 92.0f);
        pathBuilder2.lineToRelative(14.35f, 14.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder2.lineTo(68.0f, 103.31f);
        pathBuilder2.lineTo(53.66f, 117.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(229.66f, 202.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder2.lineTo(204.0f, 199.31f);
        pathBuilder2.lineToRelative(-14.34f, 14.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder2.lineTo(192.69f, 188.0f);
        pathBuilder2.lineToRelative(-14.35f, -14.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder2.lineTo(204.0f, 176.69f);
        pathBuilder2.lineToRelative(14.34f, -14.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder2.lineTo(215.31f, 188.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(184.47f, 112.83f);
        pathBuilder2.curveToRelative(-6.18f, 22.33f, -25.32f, 41.63f, -46.53f, 46.93f);
        pathBuilder2.arcTo(8.13f, 8.13f, 0.0f, false, true, 136.0f, 160.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.93f, -15.76f);
        pathBuilder2.curveToRelative(15.63f, -3.91f, 30.35f, -18.91f, 35.0f, -35.68f);
        pathBuilder2.curveToRelative(3.19f, -11.5f, 3.22f, -29.0f, -14.71f, -46.9f);
        pathBuilder2.lineTo(152.0f, 59.31f);
        pathBuilder2.lineTo(152.0f, 80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(136.0f, 40.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.horizontalLineToRelative(40.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.lineTo(163.31f, 48.0f);
        pathBuilder2.lineToRelative(2.35f, 2.34f);
        pathBuilder2.curveTo(183.9f, 68.59f, 190.58f, 90.78f, 184.47f, 112.83f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _strategy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
