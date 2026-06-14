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

/* compiled from: Tree.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTree", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tree", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TreeKt {
    private static ImageVector _tree;

    public static final ImageVector getTree(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 127.82f);
        pathBuilder.curveToRelative(0.09f, 33.94f, -28.41f, 63.3f, -62.34f, 64.16f);
        pathBuilder.arcToRelative(63.72f, 63.72f, 0.0f, false, true, -41.66f, -14.0f);
        pathBuilder.arcToRelative(63.71f, 63.71f, 0.0f, false, true, -41.65f, 14.0f);
        pathBuilder.curveToRelative(-33.93f, -0.86f, -62.44f, -30.22f, -62.35f, -64.16f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 40.13f, -59.2f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, true, 127.74f, 0.0f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, true, 232.0f, 127.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(198.1f, 62.59f);
        pathBuilder2.arcToRelative(76.0f, 76.0f, 0.0f, false, false, -140.2f, 0.0f);
        pathBuilder2.arcTo(71.71f, 71.71f, 0.0f, false, false, 16.0f, 127.8f);
        pathBuilder2.curveTo(15.9f, 166.0f, 48.0f, 199.0f, 86.14f, 200.0f);
        pathBuilder2.arcTo(72.22f, 72.22f, 0.0f, false, false, 120.0f, 192.47f);
        pathBuilder2.verticalLineTo(232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.verticalLineTo(192.47f);
        pathBuilder2.arcTo(72.17f, 72.17f, 0.0f, false, false, 168.0f, 200.0f);
        pathBuilder2.lineToRelative(1.82f, 0.0f);
        pathBuilder2.curveTo(208.0f, 199.0f, 240.11f, 166.0f, 240.0f, 127.8f);
        pathBuilder2.arcTo(71.71f, 71.71f, 0.0f, false, false, 198.1f, 62.59f);
        pathBuilder2.close();
        pathBuilder2.moveTo(169.45f, 184.0f);
        pathBuilder2.arcToRelative(56.08f, 56.08f, 0.0f, false, true, -33.45f, -10.0f);
        pathBuilder2.verticalLineToRelative(-41.0f);
        pathBuilder2.lineToRelative(43.58f, -21.78f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, -14.32f);
        pathBuilder2.lineTo(136.0f, 115.06f);
        pathBuilder2.verticalLineTo(88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(51.06f);
        pathBuilder2.lineTo(83.58f, 120.84f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, 14.32f);
        pathBuilder2.lineTo(120.0f, 156.94f);
        pathBuilder2.verticalLineToRelative(17.0f);
        pathBuilder2.arcToRelative(56.0f, 56.0f, 0.0f, false, true, -33.45f, 10.0f);
        pathBuilder2.curveTo(56.9f, 183.23f, 31.92f, 157.52f, 32.0f, 127.84f);
        pathBuilder2.arcTo(55.79f, 55.79f, 0.0f, false, true, 67.11f, 76.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.53f, -4.67f);
        pathBuilder2.arcToRelative(60.0f, 60.0f, 0.0f, false, true, 112.72f, 0.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 188.89f, 76.0f);
        pathBuilder2.arcTo(55.79f, 55.79f, 0.0f, false, true, 224.0f, 127.84f);
        pathBuilder2.curveTo(224.08f, 157.52f, 199.1f, 183.23f, 169.45f, 184.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tree = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
