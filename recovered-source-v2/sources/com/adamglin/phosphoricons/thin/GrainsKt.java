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

/* compiled from: Grains.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Grains", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGrains", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_grains", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GrainsKt {
    private static ImageVector _grains;

    public static final ImageVector getGrains(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _grains;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Grains", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 60.0f);
        pathBuilder.arcToRelative(83.5f, 83.5f, 0.0f, false, false, -33.88f, 7.16f);
        pathBuilder.curveToRelative(-13.0f, -30.78f, -43.0f, -46.08f, -44.33f, -46.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f);
        pathBuilder.curveToRelative(-1.32f, 0.66f, -31.3f, 16.0f, -44.33f, 46.74f);
        pathBuilder.arcTo(83.5f, 83.5f, 0.0f, false, false, 48.0f, 60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f);
        pathBuilder.lineTo(212.0f, 64.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 219.9f);
        pathBuilder.arcTo(76.11f, 76.11f, 0.0f, false, true, 52.0f, 144.0f);
        pathBuilder.lineTo(52.0f, 124.1f);
        pathBuilder.arcTo(76.11f, 76.11f, 0.0f, false, true, 124.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 164.27f);
        pathBuilder.arcTo(84.12f, 84.12f, 0.0f, false, false, 52.0f, 116.1f);
        pathBuilder.verticalLineToRelative(-48.0f);
        pathBuilder.arcTo(76.11f, 76.11f, 0.0f, false, true, 124.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(89.05f, 70.75f);
        pathBuilder.curveToRelative(10.07f, -24.22f, 32.46f, -38.47f, 39.0f, -42.19f);
        pathBuilder.curveToRelative(6.49f, 3.72f, 28.88f, 18.0f, 38.95f, 42.19f);
        pathBuilder.arcTo(84.43f, 84.43f, 0.0f, false, false, 128.0f, 118.41f);
        pathBuilder.arcTo(84.43f, 84.43f, 0.0f, false, false, 89.05f, 70.75f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 144.0f);
        pathBuilder.arcToRelative(76.11f, 76.11f, 0.0f, false, true, -72.0f, 75.9f);
        pathBuilder.lineTo(132.0f, 200.0f);
        pathBuilder.arcToRelative(76.11f, 76.11f, 0.0f, false, true, 72.0f, -75.9f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 116.1f);
        pathBuilder.arcToRelative(84.12f, 84.12f, 0.0f, false, false, -72.0f, 48.17f);
        pathBuilder.lineTo(132.0f, 144.0f);
        pathBuilder.arcToRelative(76.11f, 76.11f, 0.0f, false, true, 72.0f, -75.9f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _grains = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
