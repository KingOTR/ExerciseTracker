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

/* compiled from: Drophalfbottom.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropHalfBottom", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getDropHalfBottom", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropHalfBottom", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrophalfbottomKt {
    private static ImageVector _dropHalfBottom;

    public static final ImageVector getDropHalfBottom(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _dropHalfBottom;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DropHalfBottom", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
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
        pathBuilder.moveTo(187.83f, 184.0f);
        pathBuilder.horizontalLineTo(68.17f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, true, -8.0f, -16.0f);
        pathBuilder.horizontalLineTo(195.87f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, true, 187.83f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 144.0f);
        pathBuilder.arcToRelative(70.57f, 70.57f, 0.0f, false, true, -0.46f, 8.0f);
        pathBuilder.horizontalLineTo(56.46f);
        pathBuilder.arcToRelative(70.57f, 70.57f, 0.0f, false, true, -0.46f, -8.0f);
        pathBuilder.quadToRelative(0.0f, -4.0f, 0.36f, -8.0f);
        pathBuilder.horizontalLineTo(199.64f);
        pathBuilder.quadTo(200.0f, 140.0f, 200.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.curveToRelative(14.16f, 11.1f, 56.86f, 47.74f, 68.84f, 94.0f);
        pathBuilder.horizontalLineTo(59.16f);
        pathBuilder.curveTo(71.14f, 73.76f, 113.84f, 37.12f, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(82.81f, 200.0f);
        pathBuilder.horizontalLineToRelative(90.38f);
        pathBuilder.arcToRelative(71.82f, 71.82f, 0.0f, false, true, -90.38f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropHalfBottom = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
