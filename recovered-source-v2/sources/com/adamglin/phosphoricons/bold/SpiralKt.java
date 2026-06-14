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

/* compiled from: Spiral.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Spiral", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSpiral", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spiral", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpiralKt {
    private static ImageVector _spiral;

    public static final ImageVector getSpiral(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _spiral;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Spiral", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(250.0f, 138.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.arcToRelative(94.11f, 94.11f, 0.0f, false, false, -94.0f, -94.0f);
        pathBuilder.arcToRelative(84.09f, 84.09f, 0.0f, false, false, -84.0f, 84.0f);
        pathBuilder.arcToRelative(74.09f, 74.09f, 0.0f, false, false, 74.0f, 74.0f);
        pathBuilder.arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f);
        pathBuilder.arcToRelative(54.06f, 54.06f, 0.0f, false, false, -54.0f, -54.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, 44.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, 34.0f, 34.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.82f, 1.17f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 124.0f, 148.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, 38.0f, 38.0f);
        pathBuilder.arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, 48.0f);
        pathBuilder.arcToRelative(58.07f, 58.07f, 0.0f, false, true, -58.0f, -58.0f);
        pathBuilder.arcToRelative(68.07f, 68.07f, 0.0f, false, true, 68.0f, -68.0f);
        pathBuilder.arcToRelative(78.09f, 78.09f, 0.0f, false, true, 78.0f, 78.0f);
        pathBuilder.arcToRelative(88.1f, 88.1f, 0.0f, false, true, -88.0f, 88.0f);
        pathBuilder.arcToRelative(98.11f, 98.11f, 0.0f, false, true, -98.0f, -98.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, true, 132.0f, 20.0f);
        pathBuilder.arcTo(118.13f, 118.13f, 0.0f, false, true, 250.0f, 138.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spiral = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
