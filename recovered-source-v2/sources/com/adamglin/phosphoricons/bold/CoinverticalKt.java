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

/* compiled from: Coinvertical.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CoinVertical", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCoinVertical", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coinVertical", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinverticalKt {
    private static ImageVector _coinVertical;

    public static final ImageVector getCoinVertical(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _coinVertical;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CoinVertical", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 20.0f);
        pathBuilder.lineTo(104.0f, 20.0f);
        pathBuilder.curveTo(65.87f, 20.0f, 36.0f, 67.44f, 36.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(29.87f, 108.0f, 68.0f, 108.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.curveToRelative(38.13f, 0.0f, 68.0f, -47.44f, 68.0f, -108.0f);
        pathBuilder.reflectiveCurveTo(190.13f, 20.0f, 152.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(189.21f, 172.0f);
        pathBuilder.horizontalLineToRelative(-22.9f);
        pathBuilder.arcToRelative(162.62f, 162.62f, 0.0f, false, false, 5.29f, -32.0f);
        pathBuilder.horizontalLineToRelative(23.93f);
        pathBuilder.arcTo(133.22f, 133.22f, 0.0f, false, true, 189.21f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(171.6f, 116.0f);
        pathBuilder.arcToRelative(162.62f, 162.62f, 0.0f, false, false, -5.29f, -32.0f);
        pathBuilder.horizontalLineToRelative(22.9f);
        pathBuilder.arcToRelative(133.22f, 133.22f, 0.0f, false, true, 6.32f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.23f, 60.0f);
        pathBuilder.horizontalLineToRelative(-20.0f);
        pathBuilder.arcToRelative(98.26f, 98.26f, 0.0f, false, false, -10.0f, -16.0f);
        pathBuilder.lineTo(152.0f, 44.0f);
        pathBuilder.curveTo(157.37f, 44.0f, 167.25f, 46.25f, 177.23f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(74.77f, 189.84f);
        pathBuilder.curveTo(65.24f, 173.51f, 60.0f, 151.55f, 60.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.24f, -45.51f, 14.77f, -61.84f);
        pathBuilder.curveTo(86.0f, 46.88f, 97.91f, 44.0f, 104.0f, 44.0f);
        pathBuilder.reflectiveCurveToRelative(18.0f, 2.88f, 29.23f, 22.16f);
        pathBuilder.curveTo(142.76f, 82.49f, 148.0f, 104.45f, 148.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(-5.24f, 45.51f, -14.77f, 61.84f);
        pathBuilder.curveTo(122.0f, 209.12f, 110.09f, 212.0f, 104.0f, 212.0f);
        pathBuilder.reflectiveCurveTo(86.0f, 209.12f, 74.77f, 189.84f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 212.0f);
        pathBuilder.horizontalLineToRelative(-4.79f);
        pathBuilder.arcToRelative(98.26f, 98.26f, 0.0f, false, false, 10.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.curveTo(167.25f, 209.75f, 157.37f, 212.0f, 152.0f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coinVertical = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
