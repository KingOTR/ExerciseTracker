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

/* compiled from: Eggcrack.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EggCrack", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getEggCrack", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eggCrack", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EggcrackKt {
    private static ImageVector _eggCrack;

    public static final ImageVector getEggCrack(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.curveTo(92.87f, 20.0f, 44.0f, 86.52f, 44.0f, 152.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f);
        pathBuilder.curveTo(212.0f, 86.52f, 163.13f, 20.0f, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 228.0f);
        pathBuilder.arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, -76.0f);
        pathBuilder.curveToRelative(0.0f, -28.46f, 10.0f, -59.73f, 27.33f, -85.78f);
        pathBuilder.curveTo(94.81f, 43.0f, 113.91f, 28.0f, 128.0f, 28.0f);
        pathBuilder.curveToRelative(11.39f, 0.0f, 26.05f, 9.8f, 39.42f, 25.82f);
        pathBuilder.lineTo(125.0f, 101.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 6.54f);
        pathBuilder.lineToRelative(28.3f, 7.08f);
        pathBuilder.lineToRelative(-7.25f, 36.26f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.14f, 4.7f);
        pathBuilder.arcToRelative(3.44f, 3.44f, 0.0f, false, false, 0.78f, 0.08f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.92f, -3.22f);
        pathBuilder.lineToRelative(8.0f, -40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.95f, -4.66f);
        pathBuilder.lineToRelative(-25.58f, -6.4f);
        pathBuilder.lineTo(172.44f, 60.2f);
        pathBuilder.quadToRelative(2.16f, 2.91f, 4.23f, 6.0f);
        pathBuilder.curveTo(194.0f, 92.27f, 204.0f, 123.54f, 204.0f, 152.0f);
        pathBuilder.arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 228.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eggCrack = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
