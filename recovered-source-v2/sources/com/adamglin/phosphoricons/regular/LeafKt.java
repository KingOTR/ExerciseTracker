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

/* compiled from: Leaf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Leaf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getLeaf", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_leaf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeafKt {
    private static ImageVector _leaf;

    public static final ImageVector getLeaf(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _leaf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Leaf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(223.45f, 40.07f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, -7.52f);
        pathBuilder.curveTo(139.8f, 28.08f, 78.82f, 51.0f, 52.82f, 94.0f);
        pathBuilder.arcToRelative(87.09f, 87.09f, 0.0f, false, false, -12.76f, 49.0f);
        pathBuilder.curveToRelative(0.57f, 15.92f, 5.21f, 32.0f, 13.79f, 47.85f);
        pathBuilder.lineToRelative(-19.51f, 19.5f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f);
        pathBuilder.lineToRelative(19.5f, -19.51f);
        pathBuilder.curveTo(81.0f, 210.73f, 97.09f, 215.37f, 113.0f, 215.94f);
        pathBuilder.quadToRelative(1.67f, 0.06f, 3.33f, 0.06f);
        pathBuilder.arcTo(86.93f, 86.93f, 0.0f, false, false, 162.0f, 203.18f);
        pathBuilder.curveTo(205.0f, 177.18f, 227.93f, 116.21f, 223.45f, 40.07f);
        pathBuilder.close();
        pathBuilder.moveTo(153.75f, 189.5f);
        pathBuilder.curveToRelative(-22.75f, 13.78f, -49.68f, 14.0f, -76.71f, 0.77f);
        pathBuilder.lineToRelative(88.63f, -88.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f);
        pathBuilder.lineTo(65.73f, 179.0f);
        pathBuilder.curveToRelative(-13.19f, -27.0f, -13.0f, -54.0f, 0.77f, -76.71f);
        pathBuilder.curveToRelative(22.09f, -36.47f, 74.6f, -56.44f, 141.31f, -54.06f);
        pathBuilder.curveTo(210.2f, 114.89f, 190.22f, 167.41f, 153.75f, 189.5f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _leaf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
