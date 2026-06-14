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

/* compiled from: Wind.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wind", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWind", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wind", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WindKt {
    private static ImageVector _wind;

    public static final ImageVector getWind(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _wind;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wind", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(182.0f, 184.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, 30.0f);
        pathBuilder.curveToRelative(-12.9f, 0.0f, -25.36f, -8.38f, -29.63f, -19.92f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.26f, -4.16f);
        pathBuilder.curveTo(136.13f, 196.69f, 144.2f, 202.0f, 152.0f, 202.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, 0.0f, -36.0f);
        pathBuilder.lineTo(40.0f, 166.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(152.0f, 154.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, true, 182.0f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(150.0f, 72.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -30.0f, -30.0f);
        pathBuilder.curveToRelative(-12.9f, 0.0f, -25.36f, 8.38f, -29.63f, 19.92f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.26f, 4.16f);
        pathBuilder.curveTo(104.13f, 59.31f, 112.2f, 54.0f, 120.0f, 54.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 36.0f);
        pathBuilder.lineTo(24.0f, 90.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 150.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 74.0f);
        pathBuilder.curveToRelative(-12.9f, 0.0f, -25.36f, 8.38f, -29.63f, 19.92f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.26f, 4.16f);
        pathBuilder.curveTo(192.13f, 91.31f, 200.2f, 86.0f, 208.0f, 86.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 36.0f);
        pathBuilder.lineTo(32.0f, 122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(208.0f, 134.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -60.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wind = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
