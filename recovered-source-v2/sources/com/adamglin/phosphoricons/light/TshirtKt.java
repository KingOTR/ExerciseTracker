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

/* compiled from: Tshirt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TShirt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTShirt", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tShirt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TshirtKt {
    private static ImageVector _tShirt;

    public static final ImageVector getTShirt(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _tShirt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TShirt", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.64f, 63.0f);
        pathBuilder.lineTo(194.87f, 34.74f);
        pathBuilder.arcTo(5.93f, 5.93f, 0.0f, false, false, 192.0f, 34.0f);
        pathBuilder.lineTo(160.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.lineTo(64.0f, 34.0f);
        pathBuilder.arcToRelative(5.93f, 5.93f, 0.0f, false, false, -2.88f, 0.74f);
        pathBuilder.lineTo(9.36f, 63.0f);
        pathBuilder.arcTo(13.77f, 13.77f, 0.0f, false, false, 3.58f, 81.55f);
        pathBuilder.lineToRelative(19.28f, 36.81f);
        pathBuilder.arcTo(14.38f, 14.38f, 0.0f, false, false, 35.67f, 126.0f);
        pathBuilder.lineTo(58.0f, 126.0f);
        pathBuilder.verticalLineToRelative(82.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(184.0f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(198.0f, 126.0f);
        pathBuilder.horizontalLineToRelative(22.34f);
        pathBuilder.arcToRelative(14.38f, 14.38f, 0.0f, false, false, 12.81f, -7.64f);
        pathBuilder.lineToRelative(19.28f, -36.81f);
        pathBuilder.arcTo(13.77f, 13.77f, 0.0f, false, false, 246.64f, 63.0f);
        pathBuilder.close();
        pathBuilder.moveTo(35.64f, 114.0f);
        pathBuilder.arcToRelative(2.42f, 2.42f, 0.0f, false, true, -2.18f, -1.21f);
        pathBuilder.lineTo(14.21f, 76.0f);
        pathBuilder.arcToRelative(1.82f, 1.82f, 0.0f, false, true, 0.9f, -2.47f);
        pathBuilder.lineTo(58.0f, 50.11f);
        pathBuilder.lineTo(58.0f, 114.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 208.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(72.0f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(70.0f, 46.0f);
        pathBuilder.lineTo(90.48f, 46.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 75.0f, 0.0f);
        pathBuilder.lineTo(186.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(241.8f, 76.0f);
        pathBuilder.lineTo(222.52f, 112.8f);
        pathBuilder.arcToRelative(2.42f, 2.42f, 0.0f, false, true, -2.18f, 1.21f);
        pathBuilder.lineTo(198.0f, 114.01f);
        pathBuilder.lineTo(198.0f, 50.11f);
        pathBuilder.lineToRelative(42.9f, 23.4f);
        pathBuilder.arcTo(1.83f, 1.83f, 0.0f, false, true, 241.79f, 76.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tShirt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
