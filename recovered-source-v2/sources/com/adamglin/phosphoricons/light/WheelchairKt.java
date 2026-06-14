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

/* compiled from: Wheelchair.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wheelchair", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWheelchair", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wheelchair", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WheelchairKt {
    private static ImageVector _wheelchair;

    public static final ImageVector getWheelchair(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _wheelchair;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wheelchair", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(253.69f, 190.1f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.59f, -3.79f);
        pathBuilder.lineTo(227.0f, 192.66f);
        pathBuilder.lineToRelative(-29.68f, -59.34f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 192.0f, 130.0f);
        pathBuilder.horizontalLineTo(110.0f);
        pathBuilder.verticalLineTo(102.05f);
        pathBuilder.curveToRelative(0.66f, 0.0f, 1.33f, 0.0f, 2.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.curveToRelative(-0.67f, 0.0f, -1.33f, 0.0f, -2.0f, 0.0f);
        pathBuilder.verticalLineTo(77.4f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.arcTo(70.0f, 70.0f, 0.0f, false, false, 112.0f, 230.0f);
        pathBuilder.curveToRelative(32.62f, 0.0f, 62.0f, -22.08f, 69.81f, -52.5f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.62f, -3.0f);
        pathBuilder.curveToRelative(-6.49f, 25.21f, -31.0f, 43.5f, -58.19f, 43.5f);
        pathBuilder.arcTo(58.0f, 58.0f, 0.0f, false, true, 98.0f, 103.72f);
        pathBuilder.verticalLineTo(136.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(84.29f);
        pathBuilder.lineToRelative(30.34f, 60.68f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.27f, 3.0f);
        pathBuilder.lineToRelative(24.0f, -8.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 253.69f, 190.1f);
        pathBuilder.close();
        pathBuilder.moveTo(86.0f, 48.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 86.0f, 48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wheelchair = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
