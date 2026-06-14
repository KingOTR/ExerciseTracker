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

/* compiled from: Bracketsround.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BracketsRound", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBracketsRound", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bracketsRound", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BracketsroundKt {
    private static ImageVector _bracketsRound;

    public static final ImageVector getBracketsRound(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bracketsRound;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BracketsRound", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(56.52f, 64.0f);
        pathBuilder.curveTo(44.23f, 81.46f, 38.0f, 103.0f, 38.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(6.23f, 46.54f, 18.52f, 64.0f);
        pathBuilder.curveToRelative(9.17f, 13.0f, 18.49f, 18.81f, 18.59f, 18.87f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.2f, 10.27f);
        pathBuilder.curveTo(67.16f, 220.09f, 26.0f, 194.63f, 26.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(67.16f, 35.91f, 68.91f, 34.86f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.2f, 10.27f);
        pathBuilder.curveTo(75.0f, 45.19f, 65.69f, 51.0f, 56.52f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(187.09f, 34.86f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.2f, 10.27f);
        pathBuilder.curveToRelative(0.1f, 0.06f, 9.42f, 5.84f, 18.59f, 18.87f);
        pathBuilder.curveTo(211.77f, 81.46f, 218.0f, 103.0f, 218.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(-6.23f, 46.54f, -18.52f, 64.0f);
        pathBuilder.curveToRelative(-9.17f, 13.0f, -18.49f, 18.81f, -18.57f, 18.85f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.18f, 10.29f);
        pathBuilder.curveToRelative(1.75f, -1.0f, 42.91f, -26.51f, 42.91f, -93.14f);
        pathBuilder.reflectiveCurveTo(188.84f, 35.91f, 187.09f, 34.86f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bracketsRound = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
