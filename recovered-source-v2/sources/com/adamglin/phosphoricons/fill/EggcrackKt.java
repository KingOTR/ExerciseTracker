package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Eggcrack.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EggCrack", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getEggCrack", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eggCrack", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EggcrackKt {
    private static ImageVector _eggCrack;

    public static final ImageVector getEggCrack(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 152.0f);
        pathBuilder.arcToRelative(88.11f, 88.11f, 0.0f, false, true, -87.8f, 88.0f);
        pathBuilder.curveToRelative(-50.66f, 0.12f, -90.21f, -43.0f, -88.12f, -93.62f);
        pathBuilder.curveToRelative(1.21f, -29.21f, 11.71f, -60.54f, 29.23f, -86.82f);
        pathBuilder.curveTo(87.5f, 32.29f, 109.43f, 16.0f, 128.0f, 16.0f);
        pathBuilder.curveToRelative(13.25f, 0.0f, 28.23f, 8.32f, 42.34f, 23.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.09f, 5.44f);
        pathBuilder.lineTo(122.0f, 98.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 13.09f);
        pathBuilder.lineToRelative(24.61f, 6.15f);
        pathBuilder.lineToRelative(-6.51f, 32.52f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.28f, 9.41f);
        pathBuilder.arcTo(7.7f, 7.7f, 0.0f, false, false, 152.0f, 160.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.83f, -6.43f);
        pathBuilder.lineToRelative(8.0f, -40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.9f, -9.33f);
        pathBuilder.lineToRelative(-19.16f, -4.79f);
        pathBuilder.lineToRelative(36.89f, -41.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.29f, 0.41f);
        pathBuilder.curveToRelative(0.24f, 0.34f, 0.47f, 0.68f, 0.7f, 1.0f);
        pathBuilder.curveTo(205.3f, 87.54f, 216.0f, 121.23f, 216.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eggCrack = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
