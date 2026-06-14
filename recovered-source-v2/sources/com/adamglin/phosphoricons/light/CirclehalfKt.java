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

/* compiled from: Circlehalf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CircleHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCircleHalf", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_circleHalf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CirclehalfKt {
    private static ImageVector _circleHalf;

    public static final ImageVector getCircleHalf(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _circleHalf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CircleHalf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 38.2f);
        pathBuilder.arcToRelative(89.86f, 89.86f, 0.0f, false, true, 20.0f, 3.63f);
        pathBuilder.lineTo(154.0f, 214.17f);
        pathBuilder.arcToRelative(89.86f, 89.86f, 0.0f, false, true, -20.0f, 3.63f);
        pathBuilder.close();
        pathBuilder.moveTo(166.0f, 46.43f);
        pathBuilder.arcToRelative(90.48f, 90.48f, 0.0f, false, true, 20.0f, 12.81f);
        pathBuilder.lineTo(186.0f, 196.76f);
        pathBuilder.arcToRelative(90.48f, 90.48f, 0.0f, false, true, -20.0f, 12.81f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 128.0f);
        pathBuilder.arcToRelative(90.12f, 90.12f, 0.0f, false, true, 84.0f, -89.8f);
        pathBuilder.lineTo(122.0f, 217.8f);
        pathBuilder.arcTo(90.12f, 90.12f, 0.0f, false, true, 38.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.0f, 184.5f);
        pathBuilder.lineTo(198.0f, 71.5f);
        pathBuilder.arcToRelative(89.81f, 89.81f, 0.0f, false, true, 0.0f, 113.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _circleHalf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
