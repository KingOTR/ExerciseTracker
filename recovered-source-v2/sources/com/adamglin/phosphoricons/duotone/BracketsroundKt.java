package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bracketsround.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BracketsRound", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBracketsRound", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bracketsRound", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BracketsroundKt {
    private static ImageVector _bracketsRound;

    public static final ImageVector getBracketsRound(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 64.0f, -40.0f, 88.0f, -40.0f, 88.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.reflectiveCurveToRelative(-40.0f, -24.0f, -40.0f, -88.0f);
        pathBuilder.reflectiveCurveTo(72.0f, 40.0f, 72.0f, 40.0f);
        pathBuilder.horizontalLineTo(184.0f);
        pathBuilder.reflectiveCurveTo(224.0f, 64.0f, 224.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(40.0f, 128.0f);
        pathBuilder2.curveToRelative(0.0f, 58.29f, 34.67f, 80.25f, 36.15f, 81.16f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.27f, 13.7f);
        pathBuilder2.curveTo(66.09f, 221.78f, 24.0f, 195.75f, 24.0f, 128.0f);
        pathBuilder2.reflectiveCurveTo(66.09f, 34.22f, 67.88f, 33.14f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.26f, 13.7f);
        pathBuilder2.curveTo(74.54f, 47.83f, 40.0f, 69.82f, 40.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(188.12f, 33.14f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.27f, 13.7f);
        pathBuilder2.curveTo(181.33f, 47.75f, 216.0f, 69.71f, 216.0f, 128.0f);
        pathBuilder2.reflectiveCurveToRelative(-34.67f, 80.25f, -36.12f, 81.14f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.24f, 13.72f);
        pathBuilder2.curveTo(189.91f, 221.78f, 232.0f, 195.75f, 232.0f, 128.0f);
        pathBuilder2.reflectiveCurveTo(189.91f, 34.22f, 188.12f, 33.14f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bracketsRound = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
