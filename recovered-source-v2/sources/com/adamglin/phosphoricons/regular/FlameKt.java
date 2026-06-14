package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Flame.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flame", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFlame", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flame", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlameKt {
    private static ImageVector _flame;

    public static final ImageVector getFlame(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _flame;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Flame", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(173.79f, 51.48f);
        pathBuilder.arcToRelative(221.25f, 221.25f, 0.0f, false, false, -41.67f, -34.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.24f, 0.0f);
        pathBuilder.arcTo(221.25f, 221.25f, 0.0f, false, false, 82.21f, 51.48f);
        pathBuilder.curveTo(54.59f, 80.48f, 40.0f, 112.47f, 40.0f, 144.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f);
        pathBuilder.curveTo(216.0f, 112.47f, 201.41f, 80.48f, 173.79f, 51.48f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, -27.67f, 22.53f, -47.28f, 32.0f, -54.3f);
        pathBuilder.curveToRelative(9.48f, 7.0f, 32.0f, 26.63f, 32.0f, 54.3f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(173.27f, 199.93f);
        pathBuilder.arcTo(47.8f, 47.8f, 0.0f, false, false, 176.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, -44.0f, -42.09f, -69.79f, -43.88f, -70.86f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.24f, 0.0f);
        pathBuilder.curveTo(122.09f, 114.21f, 80.0f, 140.0f, 80.0f, 184.0f);
        pathBuilder.arcToRelative(47.8f, 47.8f, 0.0f, false, false, 2.73f, 15.93f);
        pathBuilder.arcTo(71.88f, 71.88f, 0.0f, false, true, 56.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -34.41f, 20.4f, -63.15f, 37.52f, -81.19f);
        pathBuilder.arcTo(216.21f, 216.21f, 0.0f, false, true, 128.0f, 33.54f);
        pathBuilder.arcToRelative(215.77f, 215.77f, 0.0f, false, true, 34.48f, 29.27f);
        pathBuilder.curveTo(193.49f, 95.5f, 200.0f, 125.0f, 200.0f, 144.0f);
        pathBuilder.arcTo(71.88f, 71.88f, 0.0f, false, true, 173.27f, 199.93f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flame = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
