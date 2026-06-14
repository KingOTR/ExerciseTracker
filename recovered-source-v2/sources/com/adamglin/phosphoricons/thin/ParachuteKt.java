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

/* compiled from: Parachute.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Parachute", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getParachute", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_parachute", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ParachuteKt {
    private static ImageVector _parachute;

    public static final ImageVector getParachute(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _parachute;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Parachute", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.0f, 120.0f);
        pathBuilder.arcToRelative(100.0f, 100.0f, 0.0f, false, false, -200.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.3f, 2.94f);
        pathBuilder.arcToRelative(2.81f, 2.81f, 0.0f, false, false, 0.3f, 0.26f);
        pathBuilder.lineTo(124.0f, 194.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.lineTo(112.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(132.0f, 220.0f);
        pathBuilder.lineTo(132.0f, 194.0f);
        pathBuilder.lineToRelative(94.4f, -70.8f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 228.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.91f, 116.0f);
        pathBuilder.lineTo(172.0f, 116.0f);
        pathBuilder.curveTo(171.0f, 67.38f, 152.13f, 40.86f, 140.0f, 28.79f);
        pathBuilder.arcTo(92.14f, 92.14f, 0.0f, false, true, 219.91f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 28.89f);
        pathBuilder.arcTo(76.67f, 76.67f, 0.0f, false, true, 145.0f, 47.64f);
        pathBuilder.curveToRelative(8.36f, 12.69f, 18.27f, 34.71f, 19.0f, 68.36f);
        pathBuilder.lineTo(92.05f, 116.0f);
        pathBuilder.curveToRelative(0.73f, -33.65f, 10.64f, -55.67f, 19.0f, -68.36f);
        pathBuilder.arcTo(76.47f, 76.47f, 0.0f, false, true, 128.0f, 28.89f);
        pathBuilder.close();
        pathBuilder.moveTo(161.2f, 124.0f);
        pathBuilder.lineTo(128.0f, 183.76f);
        pathBuilder.lineTo(94.8f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(85.65f, 124.0f);
        pathBuilder.lineTo(115.39f, 177.54f);
        pathBuilder.lineTo(44.0f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(170.35f, 124.0f);
        pathBuilder.lineTo(212.0f, 124.0f);
        pathBuilder.lineToRelative(-71.39f, 53.54f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 28.79f);
        pathBuilder.curveTo(103.87f, 40.86f, 85.0f, 67.38f, 84.0f, 116.0f);
        pathBuilder.lineTo(36.09f, 116.0f);
        pathBuilder.arcTo(92.14f, 92.14f, 0.0f, false, true, 116.0f, 28.79f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _parachute = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
