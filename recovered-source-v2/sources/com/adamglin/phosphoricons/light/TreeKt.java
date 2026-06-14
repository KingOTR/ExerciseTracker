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

/* compiled from: Tree.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTree", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tree", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TreeKt {
    private static ImageVector _tree;

    public static final ImageVector getTree(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _tree;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tree", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(196.55f, 64.09f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, false, false, -137.1f, 0.0f);
        pathBuilder.arcTo(69.71f, 69.71f, 0.0f, false, false, 18.0f, 127.8f);
        pathBuilder.curveTo(17.9f, 164.91f, 49.13f, 197.0f, 86.19f, 198.0f);
        pathBuilder.arcTo(70.32f, 70.32f, 0.0f, false, false, 122.0f, 189.16f);
        pathBuilder.verticalLineTo(232.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(189.16f);
        pathBuilder.arcTo(70.1f, 70.1f, 0.0f, false, false, 168.0f, 198.0f);
        pathBuilder.lineToRelative(1.77f, 0.0f);
        pathBuilder.curveTo(206.87f, 197.0f, 238.1f, 164.9f, 238.0f, 127.8f);
        pathBuilder.arcTo(69.71f, 69.71f, 0.0f, false, false, 196.55f, 64.09f);
        pathBuilder.close();
        pathBuilder.moveTo(169.5f, 186.0f);
        pathBuilder.arcTo(57.88f, 57.88f, 0.0f, false, true, 134.0f, 175.0f);
        pathBuilder.verticalLineTo(131.71f);
        pathBuilder.lineToRelative(44.68f, -22.34f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.36f, -10.74f);
        pathBuilder.lineTo(134.0f, 118.29f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(54.29f);
        pathBuilder.lineTo(82.68f, 122.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 10.74f);
        pathBuilder.lineTo(122.0f, 155.71f);
        pathBuilder.verticalLineTo(175.0f);
        pathBuilder.arcToRelative(58.09f, 58.09f, 0.0f, false, true, -35.5f, 11.0f);
        pathBuilder.curveToRelative(-30.71f, -0.77f, -56.58f, -27.4f, -56.5f, -58.14f);
        pathBuilder.arcTo(57.78f, 57.78f, 0.0f, false, true, 66.37f, 74.19f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.39f, -3.51f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, false, true, 116.48f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.39f, 3.51f);
        pathBuilder.arcTo(57.77f, 57.77f, 0.0f, false, true, 226.0f, 127.83f);
        pathBuilder.curveTo(226.08f, 158.58f, 200.21f, 185.2f, 169.5f, 186.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tree = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
