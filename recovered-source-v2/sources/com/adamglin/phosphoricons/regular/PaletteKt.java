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

/* compiled from: Palette.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Palette", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPalette", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_palette", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaletteKt {
    private static ImageVector _palette;

    public static final ImageVector getPalette(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(200.77f, 53.89f);
        pathBuilder.arcTo(103.27f, 103.27f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(-1.07f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 24.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 43.0f, 26.58f, 79.06f, 69.36f, 94.17f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 136.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(46.21f);
        pathBuilder.arcToRelative(31.81f, 31.81f, 0.0f, false, false, 31.2f, -24.88f);
        pathBuilder.arcToRelative(104.43f, 104.43f, 0.0f, false, false, 2.59f, -24.0f);
        pathBuilder.arcTo(103.28f, 103.28f, 0.0f, false, false, 200.77f, 53.89f);
        pathBuilder.close();
        pathBuilder.moveTo(213.77f, 147.6f);
        pathBuilder.arcTo(15.89f, 15.89f, 0.0f, false, true, 198.21f, 160.0f);
        pathBuilder.lineTo(152.0f, 160.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -21.31f, 15.07f);
        pathBuilder.curveTo(62.49f, 194.3f, 40.0f, 164.0f, 40.0f, 128.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 87.09f, -88.0f);
        pathBuilder.horizontalLineToRelative(0.9f);
        pathBuilder.arcToRelative(88.35f, 88.35f, 0.0f, false, true, 88.0f, 87.25f);
        pathBuilder.arcTo(88.86f, 88.86f, 0.0f, false, true, 213.81f, 147.6f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 100.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 84.0f, 88.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 156.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 100.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _palette = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
