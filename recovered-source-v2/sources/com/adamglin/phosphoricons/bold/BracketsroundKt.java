package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bracketsround.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BracketsRound", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBracketsRound", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bracketsRound", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BracketsroundKt {
    private static ImageVector _bracketsRound;

    public static final ImageVector getBracketsRound(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(82.33f, 222.19f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.5f, 4.09f);
        pathBuilder.curveTo(64.0f, 225.16f, 20.0f, 198.0f, 20.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(64.0f, 30.84f, 65.83f, 29.72f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 78.24f, 50.25f);
        pathBuilder.curveTo(76.71f, 51.21f, 44.0f, 72.31f, 44.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(32.85f, 76.88f, 34.25f, 77.75f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 82.33f, 222.19f);
        pathBuilder.close();
        pathBuilder.moveTo(190.17f, 29.72f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.42f, 20.53f);
        pathBuilder.curveTo(179.15f, 51.12f, 212.0f, 72.19f, 212.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(-32.85f, 76.88f, -34.17f, 77.7f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.34f, 20.58f);
        pathBuilder.curveTo(192.0f, 225.16f, 236.0f, 198.0f, 236.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(192.0f, 30.84f, 190.17f, 29.72f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bracketsRound = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
