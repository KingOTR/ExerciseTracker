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

/* compiled from: Magicwand.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MagicWand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMagicWand", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_magicWand", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MagicwandKt {
    private static ImageVector _magicWand;

    public static final ImageVector getMagicWand(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _magicWand;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MagicWand", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.0f, 152.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(222.0f, 158.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(210.0f, 158.0f);
        pathBuilder.lineTo(192.0f, 158.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(210.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 70.0f);
        pathBuilder.lineTo(74.0f, 70.0f);
        pathBuilder.lineTo(74.0f, 88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(86.0f, 70.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(86.0f, 58.0f);
        pathBuilder.lineTo(86.0f, 40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(74.0f, 58.0f);
        pathBuilder.lineTo(56.0f, 58.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 194.0f);
        pathBuilder.lineTo(174.0f, 194.0f);
        pathBuilder.lineTo(174.0f, 184.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.lineTo(152.0f, 194.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(174.0f, 206.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(217.9f, 78.59f);
        pathBuilder.lineTo(78.58f, 217.9f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -19.8f, 0.0f);
        pathBuilder.lineTo(38.09f, 197.21f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, -19.8f);
        pathBuilder.lineTo(177.41f, 38.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 19.8f, 0.0f);
        pathBuilder.lineTo(217.9f, 58.79f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 217.9f, 78.59f);
        pathBuilder.close();
        pathBuilder.moveTo(167.51f, 112.0f);
        pathBuilder.lineTo(144.0f, 88.49f);
        pathBuilder.lineTo(46.58f, 185.9f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.83f);
        pathBuilder.lineToRelative(20.69f, 20.68f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.82f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(209.41f, 67.27f);
        pathBuilder.lineTo(188.73f, 46.59f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.83f, 0.0f);
        pathBuilder.lineTo(152.48f, 80.0f);
        pathBuilder.lineTo(176.0f, 103.52f);
        pathBuilder.lineTo(209.41f, 70.1f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 209.41f, 67.27f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _magicWand = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
