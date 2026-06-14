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

/* compiled from: Leaf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Leaf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getLeaf", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_leaf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeafKt {
    private static ImageVector _leaf;

    public static final ImageVector getLeaf(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(219.45f, 40.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.76f, -3.76f);
        pathBuilder.curveTo(141.06f, 32.16f, 81.46f, 54.39f, 56.24f, 96.0f);
        pathBuilder.curveTo(39.0f, 124.56f, 39.9f, 158.37f, 58.8f, 191.54f);
        pathBuilder.lineTo(37.17f, 213.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f);
        pathBuilder.lineToRelative(21.63f, -21.64f);
        pathBuilder.curveToRelative(17.39f, 9.91f, 35.0f, 14.89f, 51.83f, 14.89f);
        pathBuilder.arcTo(83.43f, 83.43f, 0.0f, false, false, 160.0f, 199.76f);
        pathBuilder.curveTo(201.61f, 174.54f, 223.84f, 114.93f, 219.45f, 40.31f);
        pathBuilder.close();
        pathBuilder.moveTo(155.82f, 192.92f);
        pathBuilder.curveToRelative(-25.37f, 15.37f, -55.56f, 14.75f, -85.48f, -1.61f);
        pathBuilder.lineToRelative(92.5f, -92.49f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f);
        pathBuilder.lineToRelative(-92.49f, 92.5f);
        pathBuilder.curveToRelative(-16.36f, -29.92f, -17.0f, -60.11f, -1.61f, -85.48f);
        pathBuilder.curveTo(86.34f, 61.77f, 141.72f, 41.0f, 211.66f, 44.34f);
        pathBuilder.curveTo(215.0f, 114.28f, 194.23f, 169.66f, 155.82f, 192.92f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _leaf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
