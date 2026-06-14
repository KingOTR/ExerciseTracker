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

/* compiled from: Earslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EarSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getEarSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_earSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EarslashKt {
    private static ImageVector _earSlash;

    public static final ImageVector getEarSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _earSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EarSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineTo(55.72f, 57.41f);
        pathBuilder.arcTo(85.34f, 85.34f, 0.0f, false, false, 42.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 32.64f, 12.12f, 44.33f, 21.85f, 53.71f);
        pathBuilder.curveTo(71.76f, 165.34f, 78.0f, 171.36f, 78.0f, 188.0f);
        pathBuilder.arcToRelative(50.06f, 50.06f, 0.0f, false, false, 50.0f, 50.0f);
        pathBuilder.curveToRelative(14.34f, 0.0f, 26.66f, -6.12f, 36.63f, -18.18f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.26f, -7.64f);
        pathBuilder.curveTo(147.69f, 221.48f, 138.74f, 226.0f, 128.0f, 226.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, -38.0f);
        pathBuilder.curveToRelative(0.0f, -21.74f, -9.06f, -30.48f, -17.82f, -38.92f);
        pathBuilder.curveTo(62.83f, 140.06f, 54.0f, 131.55f, 54.0f, 104.0f);
        pathBuilder.arcTo(73.4f, 73.4f, 0.0f, false, true, 64.12f, 66.65f);
        pathBuilder.lineTo(84.49f, 89.06f);
        pathBuilder.arcTo(46.0f, 46.0f, 0.0f, false, false, 82.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.arcToRelative(36.39f, 36.39f, 0.0f, false, true, 0.26f, -4.19f);
        pathBuilder.lineToRelative(45.15f, 49.66f);
        pathBuilder.arcTo(39.33f, 39.33f, 0.0f, false, false, 138.0f, 160.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 29.71f, 20.6f);
        pathBuilder.lineTo(203.56f, 220.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(150.08f, 161.25f);
        pathBuilder.lineTo(157.86f, 169.8f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 150.08f, 161.21f);
        pathBuilder.close();
        pathBuilder.moveTo(81.83f, 38.38f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.07f, -8.22f);
        pathBuilder.arcTo(86.0f, 86.0f, 0.0f, false, true, 214.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.arcTo(74.0f, 74.0f, 0.0f, false, false, 90.06f, 40.45f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 81.83f, 38.38f);
        pathBuilder.close();
        pathBuilder.moveTo(158.66f, 117.25f);
        pathBuilder.arcTo(27.9f, 27.9f, 0.0f, false, false, 162.0f, 104.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, -45.0f, -32.17f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.89f, -11.35f);
        pathBuilder.arcTo(46.0f, 46.0f, 0.0f, false, true, 174.0f, 104.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -4.68f, 18.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.66f, -5.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _earSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
