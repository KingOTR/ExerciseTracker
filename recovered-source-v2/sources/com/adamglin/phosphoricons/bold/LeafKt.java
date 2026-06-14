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

/* compiled from: Leaf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Leaf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getLeaf", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_leaf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeafKt {
    private static ImageVector _leaf;

    public static final ImageVector getLeaf(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(227.42f, 39.86f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.28f, -11.28f);
        pathBuilder.curveToRelative(-39.6f, -2.33f, -74.59f, 2.34f, -104.0f, 13.87f);
        pathBuilder.curveTo(84.0f, 53.48f, 62.31f, 70.58f, 49.39f, 91.9f);
        pathBuilder.curveToRelative(-17.62f, 29.11f, -17.66f, 64.45f, -0.45f, 98.19f);
        pathBuilder.lineTo(31.51f, 207.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f);
        pathBuilder.lineToRelative(17.43f, -17.43f);
        pathBuilder.curveToRelative(16.74f, 8.54f, 33.88f, 12.85f, 50.45f, 12.85f);
        pathBuilder.arcToRelative(91.31f, 91.31f, 0.0f, false, false, 47.74f, -13.3f);
        pathBuilder.curveToRelative(21.32f, -12.92f, 38.42f, -34.62f, 49.45f, -62.75f);
        pathBuilder.curveTo(225.08f, 114.46f, 229.75f, 79.46f, 227.42f, 39.86f);
        pathBuilder.close();
        pathBuilder.moveTo(151.66f, 186.08f);
        pathBuilder.curveTo(131.57f, 198.25f, 108.0f, 199.17f, 83.94f, 189.0f);
        pathBuilder.lineToRelative(84.54f, -84.54f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f);
        pathBuilder.lineTo(67.0f, 172.06f);
        pathBuilder.curveToRelative(-10.14f, -24.0f, -9.22f, -47.63f, 3.0f, -67.72f);
        pathBuilder.curveToRelative(20.91f, -34.53f, 70.54f, -53.72f, 134.0f, -52.25f);
        pathBuilder.curveTo(205.38f, 115.53f, 186.19f, 165.17f, 151.66f, 186.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _leaf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
