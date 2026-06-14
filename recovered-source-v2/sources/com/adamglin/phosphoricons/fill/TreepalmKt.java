package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Treepalm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TreePalm", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getTreePalm", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_treePalm", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TreepalmKt {
    private static ImageVector _treePalm;

    public static final ImageVector getTreePalm(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _treePalm;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TreePalm", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(239.84f, 60.33f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.65f, 5.75f);
        pathBuilder.lineTo(179.0f, 90.55f);
        pathBuilder.arcToRelative(71.42f, 71.42f, 0.0f, false, true, 43.36f, 33.21f);
        pathBuilder.arcToRelative(70.64f, 70.64f, 0.0f, false, true, 7.2f, 54.32f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 217.0f, 182.36f);
        pathBuilder.lineToRelative(-81.0f, -61.68f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(120.68f);
        pathBuilder.lineTo(39.0f, 182.36f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.57f, -4.28f);
        pathBuilder.arcToRelative(70.64f, 70.64f, 0.0f, false, true, 7.2f, -54.32f);
        pathBuilder.arcTo(71.42f, 71.42f, 0.0f, false, true, 77.0f, 90.55f);
        pathBuilder.lineTo(20.81f, 66.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.6f, -12.85f);
        pathBuilder.arcToRelative(66.86f, 66.86f, 0.0f, false, true, 97.74f, 0.0f);
        pathBuilder.arcToRelative(72.21f, 72.21f, 0.0f, false, true, 12.0f, 17.0f);
        pathBuilder.arcToRelative(72.21f, 72.21f, 0.0f, false, true, 12.05f, -17.0f);
        pathBuilder.arcToRelative(66.86f, 66.86f, 0.0f, false, true, 97.74f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 239.84f, 60.33f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _treePalm = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
