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

/* compiled from: Drophalfbottom.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropHalfBottom", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getDropHalfBottom", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropHalfBottom", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrophalfbottomKt {
    private static ImageVector _dropHalfBottom;

    public static final ImageVector getDropHalfBottom(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(134.88f, 6.17f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.76f, 0.0f);
        pathBuilder.arcToRelative(259.0f, 259.0f, 0.0f, false, false, -42.18f, 39.0f);
        pathBuilder.curveTo(50.85f, 77.43f, 36.0f, 111.63f, 36.0f, 144.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f);
        pathBuilder.curveTo(220.0f, 66.64f, 138.36f, 8.6f, 134.88f, 6.17f);
        pathBuilder.close();
        pathBuilder.moveTo(191.61f, 168.0f);
        pathBuilder.horizontalLineTo(64.39f);
        pathBuilder.arcToRelative(67.1f, 67.1f, 0.0f, false, true, -3.9f, -16.0f);
        pathBuilder.horizontalLineToRelative(135.0f);
        pathBuilder.arcTo(67.1f, 67.1f, 0.0f, false, true, 191.61f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.7f, 61.29f);
        pathBuilder.arcTo(249.35f, 249.35f, 0.0f, false, true, 128.0f, 31.11f);
        pathBuilder.arcToRelative(249.35f, 249.35f, 0.0f, false, true, 31.3f, 30.18f);
        pathBuilder.curveToRelative(14.0f, 16.19f, 30.27f, 39.89f, 35.2f, 66.71f);
        pathBuilder.horizontalLineTo(61.5f);
        pathBuilder.curveTo(66.43f, 101.18f, 82.69f, 77.48f, 96.7f, 61.29f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(67.78f, 67.78f, 0.0f, false, true, -48.12f, -20.0f);
        pathBuilder.horizontalLineToRelative(96.24f);
        pathBuilder.arcTo(67.78f, 67.78f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropHalfBottom = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
