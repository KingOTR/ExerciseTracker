package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pinterestlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PinterestLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPinterestLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pinterestLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinterestlogoKt {
    private static ImageVector _pinterestLogo;

    public static final ImageVector getPinterestLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _pinterestLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PinterestLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 128.7f);
        pathBuilder.curveToRelative(-0.38f, 56.49f, -46.46f, 102.73f, -102.94f, 103.29f);
        pathBuilder.arcToRelative(104.16f, 104.16f, 0.0f, false, true, -25.94f, -3.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.91f, -4.86f);
        pathBuilder.lineToRelative(8.64f, -34.55f);
        pathBuilder.arcTo(60.57f, 60.57f, 0.0f, false, false, 144.0f, 196.0f);
        pathBuilder.curveToRelative(37.0f, 0.0f, 66.7f, -33.45f, 63.81f, -73.36f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, true, false, 69.24f, 155.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 159.29f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, false, 4.0f, -10.49f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, true, true, 107.86f, -24.93f);
        pathBuilder.curveTo(194.0f, 154.4f, 171.73f, 180.0f, 144.0f, 180.0f);
        pathBuilder.arcToRelative(44.87f, 44.87f, 0.0f, false, true, -23.14f, -6.44f);
        pathBuilder.lineToRelative(14.9f, -59.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.52f, -3.88f);
        pathBuilder.lineTo(93.38f, 217.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.71f, 2.59f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, true, 32.0f, 126.88f);
        pathBuilder.curveTo(32.6f, 70.52f, 78.67f, 24.52f, 135.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, true, 240.0f, 128.7f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pinterestLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
