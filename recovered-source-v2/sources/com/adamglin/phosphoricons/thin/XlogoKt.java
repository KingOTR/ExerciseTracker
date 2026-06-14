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

/* compiled from: Xlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"XLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getXLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_xLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class XlogoKt {
    private static ImageVector _xLogo;

    public static final ImageVector getXLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _xLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("XLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(211.37f, 213.85f);
        pathBuilder.lineTo(147.13f, 112.9f);
        pathBuilder.lineTo(211.0f, 42.69f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 205.0f, 37.31f);
        pathBuilder.lineTo(142.68f, 105.9f);
        pathBuilder.lineTo(99.38f, 37.85f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 36.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.37f, 6.15f);
        pathBuilder.lineTo(108.87f, 143.1f);
        pathBuilder.lineTo(45.0f, 213.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, true, false, 51.0f, 218.69f);
        pathBuilder.lineToRelative(62.36f, -68.59f);
        pathBuilder.lineToRelative(43.3f, 68.05f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 220.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.37f, -6.15f);
        pathBuilder.close();
        pathBuilder.moveTo(162.2f, 212.0f);
        pathBuilder.lineTo(55.29f, 44.0f);
        pathBuilder.horizontalLineTo(93.8f);
        pathBuilder.lineTo(200.71f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _xLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
