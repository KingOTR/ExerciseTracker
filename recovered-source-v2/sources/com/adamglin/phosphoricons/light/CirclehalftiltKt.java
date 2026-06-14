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

/* compiled from: Circlehalftilt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CircleHalfTilt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCircleHalfTilt", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_circleHalfTilt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CirclehalftiltKt {
    private static ImageVector _circleHalfTilt;

    public static final ImageVector getCircleHalfTilt(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _circleHalfTilt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CircleHalfTilt", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.12f, 55.88f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 55.88f, 200.13f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 200.12f, 55.88f);
        pathBuilder.close();
        pathBuilder.moveTo(90.0f, 209.62f);
        pathBuilder.arcToRelative(89.61f, 89.61f, 0.0f, false, true, -21.23f, -13.89f);
        pathBuilder.lineTo(90.0f, 174.49f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 217.78f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, -20.0f, -3.58f);
        pathBuilder.lineTo(102.0f, 162.49f);
        pathBuilder.lineToRelative(20.0f, -20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.0f, 214.2f);
        pathBuilder.arcToRelative(89.8f, 89.8f, 0.0f, false, true, -20.0f, 3.58f);
        pathBuilder.lineTo(134.0f, 130.49f);
        pathBuilder.lineToRelative(20.0f, -20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 196.8f);
        pathBuilder.arcToRelative(89.45f, 89.45f, 0.0f, false, true, -20.0f, 12.83f);
        pathBuilder.lineTo(166.0f, 98.49f);
        pathBuilder.lineToRelative(20.0f, -20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.27f, 187.24f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, 127.0f, -127.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.0f, 184.57f);
        pathBuilder.lineTo(198.0f, 71.43f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, 0.0f, 113.14f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _circleHalfTilt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
