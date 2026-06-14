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

/* compiled from: Tree.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTree", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tree", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TreeKt {
    private static ImageVector _tree;

    public static final ImageVector getTree(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(195.0f, 65.59f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, false, -134.0f, 0.0f);
        pathBuilder.arcToRelative(67.72f, 67.72f, 0.0f, false, false, -41.0f, 62.22f);
        pathBuilder.curveToRelative(-0.1f, 36.0f, 30.24f, 67.26f, 66.25f, 68.17f);
        pathBuilder.arcTo(68.24f, 68.24f, 0.0f, false, false, 124.0f, 185.66f);
        pathBuilder.verticalLineTo(232.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineTo(185.67f);
        pathBuilder.arcTo(68.09f, 68.09f, 0.0f, false, false, 168.0f, 196.0f);
        pathBuilder.lineToRelative(1.72f, 0.0f);
        pathBuilder.curveToRelative(36.0f, -0.91f, 66.34f, -32.13f, 66.24f, -68.17f);
        pathBuilder.arcTo(67.73f, 67.73f, 0.0f, false, false, 195.0f, 65.59f);
        pathBuilder.close();
        pathBuilder.moveTo(169.55f, 188.0f);
        pathBuilder.arcTo(60.15f, 60.15f, 0.0f, false, true, 132.0f, 176.0f);
        pathBuilder.verticalLineToRelative(-45.5f);
        pathBuilder.lineToRelative(45.79f, -22.89f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.58f, -7.16f);
        pathBuilder.lineTo(132.0f, 121.53f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(57.53f);
        pathBuilder.lineTo(81.79f, 124.42f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.58f, 7.16f);
        pathBuilder.lineTo(124.0f, 154.47f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, true, -37.55f, 12.0f);
        pathBuilder.curveToRelative(-31.77f, -0.8f, -58.54f, -28.35f, -58.45f, -60.15f);
        pathBuilder.arcToRelative(59.77f, 59.77f, 0.0f, false, true, 37.62f, -55.5f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 67.88f, 70.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 120.24f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.26f, 2.33f);
        pathBuilder.arcTo(59.79f, 59.79f, 0.0f, false, true, 228.0f, 127.83f);
        pathBuilder.curveTo(228.09f, 159.63f, 201.32f, 187.18f, 169.55f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tree = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
