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

/* compiled from: Bracketsround.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BracketsRound", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBracketsRound", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bracketsRound", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BracketsroundKt {
    private static ImageVector _bracketsRound;

    public static final ImageVector getBracketsRound(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(55.0f, 62.67f);
        pathBuilder.curveTo(46.34f, 74.93f, 36.0f, 96.22f, 36.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(10.34f, 53.07f, 19.0f, 65.33f);
        pathBuilder.curveToRelative(9.41f, 13.3f, 19.0f, 19.19f, 19.06f, 19.24f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -0.57f);
        pathBuilder.curveTo(68.23f, 218.4f, 28.0f, 193.51f, 28.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(68.23f, 37.6f, 69.94f, 36.57f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.13f, 6.86f);
        pathBuilder.curveTo(74.0f, 43.48f, 64.42f, 49.37f, 55.0f, 62.67f);
        pathBuilder.close();
        pathBuilder.moveTo(186.05f, 36.57f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.13f, 6.86f);
        pathBuilder.curveToRelative(0.1f, 0.0f, 9.65f, 5.94f, 19.06f, 19.24f);
        pathBuilder.curveToRelative(8.67f, 12.26f, 19.0f, 33.55f, 19.0f, 65.33f);
        pathBuilder.reflectiveCurveToRelative(-10.34f, 53.07f, -19.0f, 65.33f);
        pathBuilder.curveToRelative(-9.41f, 13.3f, -19.0f, 19.19f, -19.05f, 19.24f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.12f, 6.86f);
        pathBuilder.curveToRelative(1.71f, -1.0f, 41.94f, -25.92f, 41.94f, -91.43f);
        pathBuilder.reflectiveCurveTo(187.77f, 37.6f, 186.06f, 36.57f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bracketsRound = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
