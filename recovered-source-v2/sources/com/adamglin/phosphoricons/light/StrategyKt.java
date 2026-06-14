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

/* compiled from: Strategy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Strategy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getStrategy", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_strategy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StrategyKt {
    private static ImageVector _strategy;

    public static final ImageVector getStrategy(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(76.0f, 154.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, false, 34.0f, 34.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, false, 76.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 210.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 76.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(43.76f, 107.76f);
        pathBuilder.lineTo(59.52f, 92.0f);
        pathBuilder.lineTo(43.76f, 76.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.lineTo(68.0f, 83.52f);
        pathBuilder.lineTo(83.76f, 67.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.lineTo(76.48f, 92.0f);
        pathBuilder.lineToRelative(15.76f, 15.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f);
        pathBuilder.lineTo(68.0f, 100.48f);
        pathBuilder.lineTo(52.24f, 116.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(228.24f, 203.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f);
        pathBuilder.lineTo(204.0f, 196.48f);
        pathBuilder.lineToRelative(-15.76f, 15.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.lineTo(195.52f, 188.0f);
        pathBuilder.lineToRelative(-15.76f, -15.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.lineTo(204.0f, 179.52f);
        pathBuilder.lineToRelative(15.76f, -15.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.lineTo(212.48f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(182.55f, 112.3f);
        pathBuilder.curveToRelative(-6.0f, 21.66f, -24.55f, 40.38f, -45.09f, 45.52f);
        pathBuilder.arcTo(6.14f, 6.14f, 0.0f, false, true, 136.0f, 158.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.46f, -11.82f);
        pathBuilder.curveToRelative(16.29f, -4.07f, 31.62f, -19.67f, 36.44f, -37.09f);
        pathBuilder.curveToRelative(3.33f, -12.0f, 3.39f, -30.24f, -15.22f, -48.85f);
        pathBuilder.lineTo(150.0f, 54.48f);
        pathBuilder.lineTo(150.0f, 80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(138.0f, 40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(158.48f, 46.0f);
        pathBuilder.lineToRelative(5.76f, 5.76f);
        pathBuilder.curveTo(182.0f, 69.47f, 188.45f, 91.0f, 182.55f, 112.3f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _strategy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
