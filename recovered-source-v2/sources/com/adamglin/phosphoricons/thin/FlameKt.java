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

/* compiled from: Flame.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flame", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFlame", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flame", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlameKt {
    private static ImageVector _flame;

    public static final ImageVector getFlame(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(170.9f, 54.24f);
        pathBuilder.arcToRelative(216.79f, 216.79f, 0.0f, false, false, -40.84f, -33.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.12f, 0.0f);
        pathBuilder.arcTo(216.79f, 216.79f, 0.0f, false, false, 85.1f, 54.24f);
        pathBuilder.curveTo(58.21f, 82.48f, 44.0f, 113.51f, 44.0f, 144.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f);
        pathBuilder.curveTo(212.0f, 113.51f, 197.79f, 82.48f, 170.9f, 54.24f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, -32.11f, 28.07f, -53.75f, 36.0f, -59.21f);
        pathBuilder.curveToRelative(7.93f, 5.47f, 36.0f, 27.1f, 36.0f, 59.21f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -72.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(161.94f, 212.0f);
        pathBuilder.arcTo(43.82f, 43.82f, 0.0f, false, false, 172.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, -41.78f, -40.23f, -66.4f, -41.94f, -67.43f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.12f, 0.0f);
        pathBuilder.curveTo(124.23f, 117.6f, 84.0f, 142.22f, 84.0f, 184.0f);
        pathBuilder.arcToRelative(43.82f, 43.82f, 0.0f, false, false, 10.06f, 28.0f);
        pathBuilder.arcTo(76.07f, 76.07f, 0.0f, false, true, 52.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -62.48f, 63.64f, -107.17f, 76.0f, -115.26f);
        pathBuilder.curveToRelative(12.36f, 8.09f, 76.0f, 52.78f, 76.0f, 115.26f);
        pathBuilder.arcTo(76.07f, 76.07f, 0.0f, false, true, 161.94f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flame = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
