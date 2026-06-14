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

/* compiled from: Pinterestlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PinterestLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPinterestLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pinterestLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinterestlogoKt {
    private static ImageVector _pinterestLogo;

    public static final ImageVector getPinterestLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(228.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 23.6f, -8.29f, 45.23f, -23.35f, 60.88f);
        pathBuilder.curveTo(190.52f, 187.57f, 171.33f, 196.0f, 152.0f, 196.0f);
        pathBuilder.curveToRelative(-15.45f, 0.0f, -26.78f, -4.18f, -34.89f, -9.31f);
        pathBuilder.lineToRelative(-9.43f, 40.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -23.36f, -5.5f);
        pathBuilder.lineToRelative(32.0f, -136.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.36f, 5.5f);
        pathBuilder.lineToRelative(-16.45f, 69.93f);
        pathBuilder.curveTo(126.72f, 164.86f, 135.16f, 172.0f, 152.0f, 172.0f);
        pathBuilder.curveToRelative(25.56f, 0.0f, 52.0f, -22.45f, 52.0f, -60.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, true, false, 77.09f, 146.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.77f, 12.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, true, true, 228.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pinterestLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
