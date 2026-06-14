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

/* compiled from: Flame.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flame", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFlame", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flame", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlameKt {
    private static ImageVector _flame;

    public static final ImageVector getFlame(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(172.34f, 52.86f);
        pathBuilder.arcToRelative(218.34f, 218.34f, 0.0f, false, false, -41.25f, -34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.18f, 0.0f);
        pathBuilder.arcToRelative(218.34f, 218.34f, 0.0f, false, false, -41.25f, 34.0f);
        pathBuilder.curveTo(56.4f, 81.48f, 42.0f, 113.0f, 42.0f, 144.0f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f);
        pathBuilder.curveTo(214.0f, 113.0f, 199.6f, 81.48f, 172.34f, 52.86f);
        pathBuilder.close();
        pathBuilder.moveTo(94.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, -29.8f, 25.11f, -50.41f, 34.0f, -56.78f);
        pathBuilder.curveToRelative(8.91f, 6.35f, 34.0f, 26.87f, 34.0f, 56.78f);
        pathBuilder.arcToRelative(34.05f, 34.05f, 0.0f, false, true, -32.25f, 34.0f);
        pathBuilder.curveToRelative(-0.59f, 0.0f, -1.16f, 0.0f, -1.75f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(-1.16f, 0.0f, -1.75f, 0.0f);
        pathBuilder.arcTo(34.05f, 34.05f, 0.0f, false, true, 94.0f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.42f, 205.94f);
        pathBuilder.arcTo(45.68f, 45.68f, 0.0f, false, false, 174.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, -42.9f, -41.16f, -68.09f, -42.91f, -69.14f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.18f, 0.0f);
        pathBuilder.curveTo(123.16f, 115.91f, 82.0f, 141.1f, 82.0f, 184.0f);
        pathBuilder.arcToRelative(45.68f, 45.68f, 0.0f, false, false, 5.58f, 21.94f);
        pathBuilder.arcTo(74.0f, 74.0f, 0.0f, false, true, 54.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -59.83f, 59.62f, -103.26f, 74.0f, -112.86f);
        pathBuilder.curveToRelative(14.39f, 9.6f, 74.0f, 53.0f, 74.0f, 112.86f);
        pathBuilder.arcTo(74.0f, 74.0f, 0.0f, false, true, 168.42f, 205.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flame = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
