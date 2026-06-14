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

/* compiled from: Parachute.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Parachute", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getParachute", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_parachute", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ParachuteKt {
    private static ImageVector _parachute;

    public static final ImageVector getParachute(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(230.0f, 120.0f);
        pathBuilder.arcToRelative(102.0f, 102.0f, 0.0f, false, false, -204.0f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.27f, 4.69f);
        pathBuilder.lineToRelative(0.13f, 0.11f);
        pathBuilder.lineTo(122.0f, 195.0f);
        pathBuilder.verticalLineToRelative(23.0f);
        pathBuilder.lineTo(112.0f, 218.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(134.0f, 218.0f);
        pathBuilder.lineTo(134.0f, 195.0f);
        pathBuilder.lineToRelative(93.6f, -70.2f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(217.8f, 114.0f);
        pathBuilder.lineTo(173.9f, 114.0f);
        pathBuilder.curveToRelative(-1.3f, -42.92f, -16.5f, -68.62f, -28.43f, -82.3f);
        pathBuilder.arcTo(90.2f, 90.2f, 0.0f, false, true, 217.8f, 114.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 31.43f);
        pathBuilder.arcTo(77.14f, 77.14f, 0.0f, false, true, 143.42f, 49.0f);
        pathBuilder.curveTo(157.26f, 70.08f, 161.24f, 95.0f, 161.89f, 114.0f);
        pathBuilder.lineTo(94.11f, 114.0f);
        pathBuilder.curveToRelative(1.06f, -31.88f, 10.49f, -52.86f, 18.47f, -65.0f);
        pathBuilder.arcTo(76.69f, 76.69f, 0.0f, false, true, 128.0f, 31.43f);
        pathBuilder.close();
        pathBuilder.moveTo(157.8f, 126.0f);
        pathBuilder.lineTo(128.0f, 179.65f);
        pathBuilder.lineTo(98.2f, 126.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.47f, 126.0f);
        pathBuilder.lineTo(109.09f, 170.32f);
        pathBuilder.lineTo(50.0f, 126.0f);
        pathBuilder.close();
        pathBuilder.moveTo(171.53f, 126.0f);
        pathBuilder.lineTo(206.0f, 126.0f);
        pathBuilder.lineToRelative(-59.09f, 44.32f);
        pathBuilder.close();
        pathBuilder.moveTo(110.53f, 31.7f);
        pathBuilder.curveTo(98.6f, 45.38f, 83.4f, 71.08f, 82.1f, 114.0f);
        pathBuilder.lineTo(38.2f, 114.0f);
        pathBuilder.arcTo(90.2f, 90.2f, 0.0f, false, true, 110.53f, 31.7f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _parachute = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
