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

/* compiled from: Drophalf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getDropHalf", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropHalf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrophalfKt {
    private static ImageVector _dropHalf;

    public static final ImageVector getDropHalf(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _dropHalf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DropHalf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(174.0f, 47.75f);
        pathBuilder.arcToRelative(254.19f, 254.19f, 0.0f, false, false, -41.45f, -38.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.18f, 0.0f);
        pathBuilder.arcTo(254.19f, 254.19f, 0.0f, false, false, 82.0f, 47.75f);
        pathBuilder.curveTo(54.51f, 79.32f, 40.0f, 112.6f, 40.0f, 144.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f);
        pathBuilder.curveTo(216.0f, 112.6f, 201.49f, 79.32f, 174.0f, 47.75f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 144.0f);
        pathBuilder.arcToRelative(70.57f, 70.57f, 0.0f, false, true, -0.46f, 8.0f);
        pathBuilder.lineTo(136.0f, 152.0f);
        pathBuilder.lineTo(136.0f, 136.0f);
        pathBuilder.horizontalLineToRelative(63.64f);
        pathBuilder.quadTo(200.0f, 140.0f, 200.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(183.39f, 88.0f);
        pathBuilder.lineTo(136.0f, 88.0f);
        pathBuilder.lineTo(136.0f, 72.0f);
        pathBuilder.horizontalLineToRelative(36.89f);
        pathBuilder.arcTo(175.85f, 175.85f, 0.0f, false, true, 183.39f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 200.0f);
        pathBuilder.horizontalLineToRelative(37.19f);
        pathBuilder.arcTo(71.67f, 71.67f, 0.0f, false, true, 136.0f, 215.54f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 184.0f);
        pathBuilder.lineTo(136.0f, 168.0f);
        pathBuilder.horizontalLineToRelative(59.87f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, true, -8.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 120.0f);
        pathBuilder.lineTo(136.0f, 104.0f);
        pathBuilder.horizontalLineToRelative(55.39f);
        pathBuilder.arcToRelative(116.84f, 116.84f, 0.0f, false, true, 5.45f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(159.89f, 56.0f);
        pathBuilder.lineTo(136.0f, 56.0f);
        pathBuilder.lineTo(136.0f, 32.6f);
        pathBuilder.arcTo(257.22f, 257.22f, 0.0f, false, true, 159.89f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -50.0f, 42.26f, -92.71f, 64.0f, -111.4f);
        pathBuilder.lineTo(120.0f, 215.54f);
        pathBuilder.arcTo(72.08f, 72.08f, 0.0f, false, true, 56.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropHalf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
