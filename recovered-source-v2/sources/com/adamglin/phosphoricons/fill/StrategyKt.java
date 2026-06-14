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

/* compiled from: Strategy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Strategy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getStrategy", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_strategy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StrategyKt {
    private static ImageVector _strategy;

    public static final ImageVector getStrategy(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(108.0f, 188.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 108.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(53.66f, 117.66f);
        pathBuilder.lineTo(68.0f, 103.31f);
        pathBuilder.lineToRelative(14.34f, 14.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f);
        pathBuilder.lineTo(79.31f, 92.0f);
        pathBuilder.lineTo(93.66f, 77.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 82.34f, 66.34f);
        pathBuilder.lineTo(68.0f, 80.69f);
        pathBuilder.lineTo(53.66f, 66.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 42.34f, 77.66f);
        pathBuilder.lineTo(56.69f, 92.0f);
        pathBuilder.lineTo(42.34f, 106.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f);
        pathBuilder.close();
        pathBuilder.moveTo(215.31f, 188.0f);
        pathBuilder.lineToRelative(14.35f, -14.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f);
        pathBuilder.lineTo(204.0f, 176.69f);
        pathBuilder.lineToRelative(-14.34f, -14.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f);
        pathBuilder.lineTo(192.69f, 188.0f);
        pathBuilder.lineToRelative(-14.35f, 14.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f);
        pathBuilder.lineTo(204.0f, 199.31f);
        pathBuilder.lineToRelative(14.34f, 14.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f);
        pathBuilder.close();
        pathBuilder.moveTo(165.66f, 50.34f);
        pathBuilder.lineTo(163.31f, 48.0f);
        pathBuilder.horizontalLineTo(184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(59.31f);
        pathBuilder.lineToRelative(2.34f, 2.35f);
        pathBuilder.curveToRelative(17.93f, 17.93f, 17.9f, 35.4f, 14.71f, 46.9f);
        pathBuilder.curveToRelative(-4.64f, 16.77f, -19.36f, 31.77f, -35.0f, 35.68f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 160.0f);
        pathBuilder.arcToRelative(8.13f, 8.13f, 0.0f, false, false, 1.95f, -0.24f);
        pathBuilder.curveToRelative(21.21f, -5.3f, 40.35f, -24.6f, 46.53f, -46.93f);
        pathBuilder.curveTo(190.58f, 90.78f, 183.9f, 68.59f, 165.66f, 50.34f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _strategy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
