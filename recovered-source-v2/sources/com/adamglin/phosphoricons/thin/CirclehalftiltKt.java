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

/* compiled from: Circlehalftilt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CircleHalfTilt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCircleHalfTilt", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_circleHalfTilt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CirclehalftiltKt {
    private static ImageVector _circleHalfTilt;

    public static final ImageVector getCircleHalfTilt(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(198.71f, 57.29f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 57.29f, 198.71f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 198.71f, 57.29f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 197.72f);
        pathBuilder.arcToRelative(91.35f, 91.35f, 0.0f, false, true, -24.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-115.0f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 161.66f);
        pathBuilder.lineTo(124.0f, 137.66f);
        pathBuilder.lineTo(124.0f, 219.9f);
        pathBuilder.arcToRelative(91.91f, 91.91f, 0.0f, false, true, -24.0f, -4.24f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 212.66f);
        pathBuilder.arcToRelative(91.69f, 91.69f, 0.0f, false, true, -26.15f, -16.89f);
        pathBuilder.lineTo(92.0f, 169.66f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 129.66f);
        pathBuilder.lineTo(156.0f, 105.66f);
        pathBuilder.verticalLineToRelative(110.0f);
        pathBuilder.arcToRelative(91.76f, 91.76f, 0.0f, false, true, -24.0f, 4.24f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 128.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 190.16f, 60.19f);
        pathBuilder.lineToRelative(-130.0f, 130.0f);
        pathBuilder.arcTo(91.34f, 91.34f, 0.0f, false, true, 36.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 190.0f);
        pathBuilder.lineTo(196.0f, 66.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 196.0f, 190.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _circleHalfTilt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
