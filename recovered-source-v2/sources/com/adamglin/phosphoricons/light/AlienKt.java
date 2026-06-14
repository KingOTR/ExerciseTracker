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

/* compiled from: Alien.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Alien", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAlien", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_alien", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AlienKt {
    private static ImageVector _alien;

    public static final ImageVector getAlien(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _alien;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Alien", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 18.0f);
        pathBuilder.arcToRelative(94.11f, 94.11f, 0.0f, false, false, -94.0f, 94.0f);
        pathBuilder.curveToRelative(0.0f, 23.6f, 12.41f, 54.2f, 33.21f, 81.83f);
        pathBuilder.curveTo(83.27f, 215.18f, 107.68f, 238.0f, 128.0f, 238.0f);
        pathBuilder.reflectiveCurveToRelative(44.73f, -22.82f, 60.79f, -44.17f);
        pathBuilder.curveTo(209.59f, 166.2f, 222.0f, 135.6f, 222.0f, 112.0f);
        pathBuilder.arcTo(94.11f, 94.11f, 0.0f, false, false, 128.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(179.21f, 186.62f);
        pathBuilder.curveTo(161.48f, 210.17f, 140.91f, 226.0f, 128.0f, 226.0f);
        pathBuilder.reflectiveCurveToRelative(-33.48f, -15.83f, -51.21f, -39.38f);
        pathBuilder.curveTo(57.8f, 161.37f, 46.0f, 132.78f, 46.0f, 112.0f);
        pathBuilder.arcToRelative(82.0f, 82.0f, 0.0f, false, true, 164.0f, 0.0f);
        pathBuilder.curveTo(210.0f, 132.78f, 198.2f, 161.37f, 179.21f, 186.62f);
        pathBuilder.close();
        pathBuilder.moveTo(118.0f, 136.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 80.0f, 98.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 118.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 138.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 104.0f, 138.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 98.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, 38.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 176.0f, 98.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 138.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, -26.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 152.0f, 138.0f);
        pathBuilder.close();
        pathBuilder.moveTo(150.0f, 184.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(112.0f, 190.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 150.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _alien = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
