package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bracketsround.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BracketsRound", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBracketsRound", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bracketsRound", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BracketsroundKt {
    private static ImageVector _bracketsRound;

    public static final ImageVector getBracketsRound(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(40.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 58.29f, 34.67f, 80.25f, 36.15f, 81.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.27f, 13.7f);
        pathBuilder.curveTo(66.09f, 221.78f, 24.0f, 195.75f, 24.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(66.09f, 34.22f, 67.88f, 33.14f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.26f, 13.7f);
        pathBuilder.curveTo(74.54f, 47.83f, 40.0f, 69.82f, 40.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.12f, 33.14f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.27f, 13.7f);
        pathBuilder.curveTo(181.33f, 47.75f, 216.0f, 69.71f, 216.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(-34.67f, 80.25f, -36.12f, 81.14f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.24f, 13.72f);
        pathBuilder.curveTo(189.91f, 221.78f, 232.0f, 195.75f, 232.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(189.91f, 34.22f, 188.12f, 33.14f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bracketsRound = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
