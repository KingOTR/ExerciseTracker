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

/* compiled from: Drophalfbottom.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropHalfBottom", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getDropHalfBottom", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropHalfBottom", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrophalfbottomKt {
    private static ImageVector _dropHalfBottom;

    public static final ImageVector getDropHalfBottom(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(171.0f, 50.37f);
        pathBuilder.arcToRelative(250.18f, 250.18f, 0.0f, false, false, -40.73f, -37.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.58f, 0.0f);
        pathBuilder.arcTo(250.18f, 250.18f, 0.0f, false, false, 85.0f, 50.37f);
        pathBuilder.curveTo(58.17f, 81.21f, 44.0f, 113.58f, 44.0f, 144.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f);
        pathBuilder.curveTo(212.0f, 113.58f, 197.83f, 81.21f, 171.0f, 50.37f);
        pathBuilder.close();
        pathBuilder.moveTo(189.91f, 188.0f);
        pathBuilder.horizontalLineTo(66.09f);
        pathBuilder.arcToRelative(75.63f, 75.63f, 0.0f, false, true, -11.4f, -24.0f);
        pathBuilder.horizontalLineTo(201.31f);
        pathBuilder.arcTo(75.63f, 75.63f, 0.0f, false, true, 189.91f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(53.0f, 156.0f);
        pathBuilder.arcToRelative(75.41f, 75.41f, 0.0f, false, true, -1.0f, -12.0f);
        pathBuilder.arcToRelative(93.38f, 93.38f, 0.0f, false, true, 0.79f, -12.0f);
        pathBuilder.horizontalLineTo(203.21f);
        pathBuilder.arcToRelative(93.38f, 93.38f, 0.0f, false, true, 0.79f, 12.0f);
        pathBuilder.arcToRelative(75.41f, 75.41f, 0.0f, false, true, -1.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.9f, 55.77f);
        pathBuilder.arcTo(254.0f, 254.0f, 0.0f, false, true, 128.0f, 21.0f);
        pathBuilder.arcToRelative(254.0f, 254.0f, 0.0f, false, true, 37.1f, 34.81f);
        pathBuilder.curveToRelative(14.37f, 16.55f, 31.0f, 40.61f, 36.77f, 68.23f);
        pathBuilder.horizontalLineTo(54.13f);
        pathBuilder.curveTo(59.93f, 96.38f, 76.53f, 72.32f, 90.9f, 55.77f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(75.77f, 75.77f, 0.0f, false, true, -55.35f, -24.0f);
        pathBuilder.horizontalLineToRelative(110.7f);
        pathBuilder.arcTo(75.77f, 75.77f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropHalfBottom = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
