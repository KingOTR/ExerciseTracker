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

/* compiled from: Tree.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTree", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tree", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TreeKt {
    private static ImageVector _tree;

    public static final ImageVector getTree(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(201.17f, 59.62f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, -146.34f, 0.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 61.17f, 139.0f);
        pathBuilder.verticalLineTo(232.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(198.64f);
        pathBuilder.arcTo(76.26f, 76.26f, 0.0f, false, false, 168.0f, 204.0f);
        pathBuilder.lineToRelative(1.92f, 0.0f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, false, 201.17f, 59.62f);
        pathBuilder.close();
        pathBuilder.moveTo(169.35f, 180.0f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 140.0f, 171.79f);
        pathBuilder.verticalLineTo(135.42f);
        pathBuilder.lineToRelative(41.37f, -20.69f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -10.74f, -21.46f);
        pathBuilder.lineTo(140.0f, 108.58f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(44.58f);
        pathBuilder.lineTo(85.37f, 117.27f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 21.46f);
        pathBuilder.lineTo(116.0f, 159.42f);
        pathBuilder.verticalLineToRelative(12.37f);
        pathBuilder.arcTo(52.24f, 52.24f, 0.0f, false, true, 86.65f, 180.0f);
        pathBuilder.curveToRelative(-27.53f, -0.69f, -50.72f, -24.56f, -50.65f, -52.13f);
        pathBuilder.arcToRelative(51.81f, 51.81f, 0.0f, false, true, 32.61f, -48.1f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.78f, -7.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, 105.22f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.78f, 7.0f);
        pathBuilder.arcTo(51.81f, 51.81f, 0.0f, false, true, 220.0f, 127.85f);
        pathBuilder.curveTo(220.08f, 155.41f, 196.88f, 179.29f, 169.35f, 180.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tree = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
