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

/* compiled from: Palette.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Palette", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPalette", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_palette", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaletteKt {
    private static ImageVector _palette;

    public static final ImageVector getPalette(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _palette;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Palette", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(199.37f, 55.31f);
        pathBuilder.arcTo(101.32f, 101.32f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, false, false, 26.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 42.09f, 26.07f, 77.44f, 68.0f, 92.26f);
        pathBuilder.arcTo(30.21f, 30.21f, 0.0f, false, false, 104.11f, 222.0f);
        pathBuilder.arcTo(30.06f, 30.06f, 0.0f, false, false, 134.0f, 192.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, -18.0f);
        pathBuilder.horizontalLineToRelative(46.21f);
        pathBuilder.arcToRelative(29.82f, 29.82f, 0.0f, false, false, 29.25f, -23.31f);
        pathBuilder.arcTo(102.71f, 102.71f, 0.0f, false, false, 230.0f, 127.11f);
        pathBuilder.arcTo(101.25f, 101.25f, 0.0f, false, false, 199.37f, 55.31f);
        pathBuilder.close();
        pathBuilder.moveTo(215.76f, 148.0f);
        pathBuilder.arcToRelative(17.89f, 17.89f, 0.0f, false, true, -17.55f, 14.0f);
        pathBuilder.lineTo(152.0f, 162.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -30.0f, 30.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, -24.0f, 17.0f);
        pathBuilder.curveTo(61.0f, 195.86f, 38.0f, 164.85f, 38.0f, 128.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, 89.07f, -90.0f);
        pathBuilder.lineTo(128.0f, 38.0f);
        pathBuilder.arcToRelative(90.34f, 90.34f, 0.0f, false, true, 90.0f, 89.22f);
        pathBuilder.arcTo(90.46f, 90.46f, 0.0f, false, true, 215.76f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.0f, 76.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.0f, 100.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, true, true, 84.0f, 90.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.0f, 156.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(182.0f, 100.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 182.0f, 100.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _palette = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
