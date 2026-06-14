package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Xlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"XLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getXLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_xLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class XlogoKt {
    private static ImageVector _xLogo;

    public static final ImageVector getXLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(213.06f, 212.78f);
        pathBuilder.lineToRelative(-63.42f, -99.66f);
        pathBuilder.lineTo(212.44f, 44.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, false, 203.56f, 36.0f);
        pathBuilder.lineTo(143.0f, 102.62f);
        pathBuilder.lineToRelative(-41.9f, -65.84f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 34.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.06f, 9.22f);
        pathBuilder.lineToRelative(63.42f, 99.66f);
        pathBuilder.lineTo(43.56f, 212.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 52.44f, 220.0f);
        pathBuilder.lineTo(113.0f, 153.38f);
        pathBuilder.lineToRelative(41.9f, 65.84f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 222.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.06f, -9.22f);
        pathBuilder.close();
        pathBuilder.moveTo(163.29f, 210.0f);
        pathBuilder.lineTo(58.93f, 46.0f);
        pathBuilder.horizontalLineTo(92.71f);
        pathBuilder.lineTo(197.07f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _xLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
