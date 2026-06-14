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

/* compiled from: Strategy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Strategy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getStrategy", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_strategy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StrategyKt {
    private static ImageVector _strategy;

    public static final ImageVector getStrategy(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(76.0f, 156.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 76.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 212.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 76.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(45.17f, 109.17f);
        pathBuilder.lineTo(62.34f, 92.0f);
        pathBuilder.lineTo(45.17f, 74.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.lineTo(68.0f, 86.34f);
        pathBuilder.lineTo(85.17f, 69.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f);
        pathBuilder.lineTo(73.66f, 92.0f);
        pathBuilder.lineToRelative(17.17f, 17.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineTo(68.0f, 97.66f);
        pathBuilder.lineTo(50.83f, 114.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(226.83f, 205.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineTo(204.0f, 193.66f);
        pathBuilder.lineToRelative(-17.17f, 17.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f);
        pathBuilder.lineTo(198.34f, 188.0f);
        pathBuilder.lineToRelative(-17.17f, -17.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.lineTo(204.0f, 182.34f);
        pathBuilder.lineToRelative(17.17f, -17.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f);
        pathBuilder.lineTo(209.66f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.62f, 111.76f);
        pathBuilder.curveToRelative(-5.82f, 21.0f, -23.77f, 39.15f, -43.65f, 44.12f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.0f, 0.12f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, -7.88f);
        pathBuilder.curveToRelative(16.94f, -4.24f, 32.87f, -20.42f, 37.88f, -38.49f);
        pathBuilder.curveToRelative(3.47f, -12.53f, 3.55f, -31.51f, -15.74f, -50.8f);
        pathBuilder.lineTo(148.0f, 49.66f);
        pathBuilder.lineTo(148.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(153.66f, 44.0f);
        pathBuilder.lineToRelative(9.17f, 9.17f);
        pathBuilder.curveTo(180.0f, 70.35f, 186.33f, 91.16f, 180.62f, 111.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _strategy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
