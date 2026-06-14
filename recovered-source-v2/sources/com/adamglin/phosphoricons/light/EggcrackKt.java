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

/* compiled from: Eggcrack.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EggCrack", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getEggCrack", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eggCrack", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EggcrackKt {
    private static ImageVector _eggCrack;

    public static final ImageVector getEggCrack(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(185.0f, 60.67f);
        pathBuilder.curveTo(167.18f, 34.0f, 145.87f, 18.0f, 128.0f, 18.0f);
        pathBuilder.reflectiveCurveTo(88.82f, 34.0f, 71.0f, 60.67f);
        pathBuilder.curveTo(52.57f, 88.32f, 42.0f, 121.61f, 42.0f, 152.0f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f);
        pathBuilder.curveTo(214.0f, 121.61f, 203.43f, 88.32f, 185.0f, 60.67f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 226.0f);
        pathBuilder.arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, -74.0f);
        pathBuilder.curveToRelative(0.0f, -28.08f, 9.84f, -58.94f, 27.0f, -84.67f);
        pathBuilder.curveTo(96.11f, 44.65f, 114.56f, 30.0f, 128.0f, 30.0f);
        pathBuilder.curveToRelative(10.52f, 0.0f, 24.12f, 9.0f, 36.78f, 23.77f);
        pathBuilder.lineTo(123.52f, 100.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, 9.82f);
        pathBuilder.lineTo(153.0f, 116.43f);
        pathBuilder.lineToRelative(-6.87f, 34.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.7f, 7.06f);
        pathBuilder.arcTo(6.08f, 6.08f, 0.0f, false, false, 152.0f, 158.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.87f, -4.82f);
        pathBuilder.lineToRelative(8.0f, -40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.42f, -7.0f);
        pathBuilder.lineToRelative(-22.37f, -5.59f);
        pathBuilder.lineToRelative(33.2f, -37.2f);
        pathBuilder.quadToRelative(1.36f, 1.92f, 2.72f, 3.94f);
        pathBuilder.curveToRelative(17.15f, 25.73f, 27.0f, 56.59f, 27.0f, 84.67f);
        pathBuilder.arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 226.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eggCrack = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
