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

/* compiled from: Knife.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Knife", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getKnife", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_knife", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KnifeKt {
    private static ImageVector _knife;

    public static final ImageVector getKnife(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _knife;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Knife", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(234.7f, 29.3f);
        pathBuilder.arcToRelative(31.83f, 31.83f, 0.0f, false, false, -45.0f, 0.0f);
        pathBuilder.lineTo(15.52f, 203.56f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.78f, 20.19f);
        pathBuilder.arcTo(164.85f, 164.85f, 0.0f, false, false, 58.42f, 228.0f);
        pathBuilder.curveToRelative(33.71f, 0.0f, 67.41f, -10.42f, 99.1f, -30.87f);
        pathBuilder.curveToRelative(32.32f, -20.86f, 51.16f, -44.7f, 51.94f, -45.7f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.0f, -15.89f);
        pathBuilder.lineTo(191.0f, 118.0f);
        pathBuilder.lineTo(234.7f, 74.29f);
        pathBuilder.arcTo(31.86f, 31.86f, 0.0f, false, false, 234.7f, 29.3f);
        pathBuilder.close();
        pathBuilder.moveTo(143.87f, 177.36f);
        pathBuilder.curveTo(113.0f, 197.12f, 81.28f, 206.0f, 49.28f, 203.74f);
        pathBuilder.lineTo(146.0f, 107.0f);
        pathBuilder.lineToRelative(19.5f, 19.51f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(18.0f, 18.0f);
        pathBuilder.arcTo(216.69f, 216.69f, 0.0f, false, true, 143.87f, 177.36f);
        pathBuilder.close();
        pathBuilder.moveTo(217.73f, 57.36f);
        pathBuilder.lineTo(174.0f, 101.0f);
        pathBuilder.lineTo(163.0f, 90.0f);
        pathBuilder.lineTo(206.7f, 46.28f);
        pathBuilder.arcToRelative(7.8f, 7.8f, 0.0f, false, true, 11.0f, 11.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _knife = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
