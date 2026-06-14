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

/* compiled from: Treepalm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TreePalm", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTreePalm", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_treePalm", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TreepalmKt {
    private static ImageVector _treePalm;

    public static final ImageVector getTreePalm(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(234.9f, 56.0f);
        pathBuilder.arcToRelative(62.86f, 62.86f, 0.0f, false, false, -92.0f, 0.0f);
        pathBuilder.arcTo(68.16f, 68.16f, 0.0f, false, false, 128.0f, 80.44f);
        pathBuilder.arcToRelative(68.16f, 68.16f, 0.0f, false, false, -15.0f, -24.45f);
        pathBuilder.arcTo(62.86f, 62.86f, 0.0f, false, false, 21.1f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.3f, 6.42f);
        pathBuilder.lineTo(90.86f, 92.2f);
        pathBuilder.arcToRelative(68.66f, 68.66f, 0.0f, false, false, -12.45f, 2.11f);
        pathBuilder.arcToRelative(67.49f, 67.49f, 0.0f, false, false, -41.28f, 31.46f);
        pathBuilder.arcTo(66.72f, 66.72f, 0.0f, false, false, 30.33f, 177.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.57f, 2.75f);
        pathBuilder.arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.29f, 0.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.43f, -0.82f);
        pathBuilder.lineTo(124.0f, 112.6f);
        pathBuilder.lineTo(124.0f, 224.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 112.6f);
        pathBuilder.lineToRelative(87.38f, 66.58f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.43f, 0.82f);
        pathBuilder.arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.29f, -0.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.57f, -2.75f);
        pathBuilder.arcToRelative(66.72f, 66.72f, 0.0f, false, false, -6.8f, -51.27f);
        pathBuilder.arcToRelative(67.49f, 67.49f, 0.0f, false, false, -41.28f, -31.46f);
        pathBuilder.arcToRelative(68.66f, 68.66f, 0.0f, false, false, -12.45f, -2.11f);
        pathBuilder.lineTo(233.6f, 62.41f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 234.9f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(67.08f, 44.0f);
        pathBuilder.arcToRelative(55.13f, 55.13f, 0.0f, false, true, 40.18f, 17.5f);
        pathBuilder.arcTo(60.86f, 60.86f, 0.0f, false, true, 123.7f, 97.77f);
        pathBuilder.lineTo(31.12f, 57.48f);
        pathBuilder.arcTo(54.75f, 54.75f, 0.0f, false, true, 67.08f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.77f, 169.0f);
        pathBuilder.arcTo(58.72f, 58.72f, 0.0f, false, true, 44.0f, 129.79f);
        pathBuilder.arcTo(59.57f, 59.57f, 0.0f, false, true, 80.47f, 102.0f);
        pathBuilder.arcTo(61.0f, 61.0f, 0.0f, false, true, 96.1f, 100.0f);
        pathBuilder.arcToRelative(59.71f, 59.71f, 0.0f, false, true, 24.41f, 5.22f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 129.79f);
        pathBuilder.arcTo(58.72f, 58.72f, 0.0f, false, true, 219.23f, 169.0f);
        pathBuilder.lineTo(135.49f, 105.2f);
        pathBuilder.arcTo(60.24f, 60.24f, 0.0f, false, true, 212.0f, 129.79f);
        pathBuilder.close();
        pathBuilder.moveTo(132.34f, 97.79f);
        pathBuilder.arcTo(60.86f, 60.86f, 0.0f, false, true, 148.74f, 61.5f);
        pathBuilder.arcToRelative(54.8f, 54.8f, 0.0f, false, true, 76.14f, -4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _treePalm = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
