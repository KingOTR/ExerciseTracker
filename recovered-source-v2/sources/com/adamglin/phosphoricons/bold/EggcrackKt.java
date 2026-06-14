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

/* compiled from: Eggcrack.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EggCrack", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getEggCrack", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eggCrack", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EggcrackKt {
    private static ImageVector _eggCrack;

    public static final ImageVector getEggCrack(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _eggCrack;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EggCrack", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(190.0f, 57.34f);
        pathBuilder.curveTo(171.06f, 29.0f, 147.88f, 12.0f, 128.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(84.94f, 29.0f, 66.0f, 57.34f);
        pathBuilder.curveTo(46.94f, 86.0f, 36.0f, 120.46f, 36.0f, 152.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f);
        pathBuilder.curveTo(220.0f, 120.46f, 209.06f, 86.0f, 190.0f, 57.34f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f);
        pathBuilder.curveToRelative(0.0f, -61.12f, 46.19f, -116.0f, 68.0f, -116.0f);
        pathBuilder.curveToRelative(7.59f, 0.0f, 18.13f, 6.65f, 28.64f, 17.88f);
        pathBuilder.lineTo(119.05f, 96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.0f, 19.63f);
        pathBuilder.lineToRelative(20.9f, 5.23f);
        pathBuilder.lineToRelative(-5.76f, 28.78f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.42f, 14.12f);
        pathBuilder.arcTo(11.87f, 11.87f, 0.0f, false, false, 152.0f, 164.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.76f, -9.65f);
        pathBuilder.lineToRelative(8.0f, -40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.86f, -14.0f);
        pathBuilder.lineToRelative(-12.74f, -3.19f);
        pathBuilder.lineToRelative(21.4f, -24.0f);
        pathBuilder.curveTo(185.2f, 94.34f, 196.0f, 122.44f, 196.0f, 152.0f);
        pathBuilder.arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eggCrack = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
