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

/* compiled from: Eyes.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Eyes", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getEyes", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyes", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyesKt {
    private static ImageVector _eyes;

    public static final ImageVector getEyes(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _eyes;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Eyes", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 34.0f);
        pathBuilder.curveToRelative(-21.15f, 0.0f, -39.1f, 20.15f, -48.0f, 50.26f);
        pathBuilder.curveTo(119.1f, 54.15f, 101.15f, 34.0f, 80.0f, 34.0f);
        pathBuilder.curveToRelative(-30.28f, 0.0f, -54.0f, 41.29f, -54.0f, 94.0f);
        pathBuilder.reflectiveCurveToRelative(23.72f, 94.0f, 54.0f, 94.0f);
        pathBuilder.curveToRelative(21.15f, 0.0f, 39.1f, -20.15f, 48.0f, -50.26f);
        pathBuilder.curveToRelative(8.9f, 30.11f, 26.85f, 50.26f, 48.0f, 50.26f);
        pathBuilder.curveToRelative(30.28f, 0.0f, 54.0f, -41.29f, 54.0f, -94.0f);
        pathBuilder.reflectiveCurveTo(206.28f, 34.0f, 176.0f, 34.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 210.0f);
        pathBuilder.curveToRelative(-18.24f, 0.0f, -34.19f, -24.1f, -39.83f, -56.53f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, 0.0f, -50.94f);
        pathBuilder.curveTo(45.81f, 70.1f, 61.76f, 46.0f, 80.0f, 46.0f);
        pathBuilder.curveToRelative(22.77f, 0.0f, 42.0f, 37.55f, 42.0f, 82.0f);
        pathBuilder.reflectiveCurveTo(102.77f, 210.0f, 80.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 128.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 38.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 210.0f);
        pathBuilder.curveToRelative(-18.24f, 0.0f, -34.19f, -24.1f, -39.83f, -56.53f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, 0.0f, -50.94f);
        pathBuilder.curveTo(141.81f, 70.1f, 157.76f, 46.0f, 176.0f, 46.0f);
        pathBuilder.curveToRelative(22.77f, 0.0f, 42.0f, 37.55f, 42.0f, 82.0f);
        pathBuilder.reflectiveCurveTo(198.77f, 210.0f, 176.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 128.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 134.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyes = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
