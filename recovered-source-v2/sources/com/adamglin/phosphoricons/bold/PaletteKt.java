package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Palette.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Palette", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPalette", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_palette", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaletteKt {
    private static ImageVector _palette;

    public static final ImageVector getPalette(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(203.57f, 51.0f);
        pathBuilder.arcTo(107.9f, 107.9f, 0.0f, false, false, 20.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 44.72f, 27.6f, 82.25f, 72.0f, 97.94f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 140.0f, 192.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(46.21f);
        pathBuilder.arcToRelative(35.79f, 35.79f, 0.0f, false, false, 35.1f, -28.0f);
        pathBuilder.arcTo(108.6f, 108.6f, 0.0f, false, false, 236.0f, 127.09f);
        pathBuilder.arcTo(107.23f, 107.23f, 0.0f, false, false, 203.57f, 51.0f);
        pathBuilder.close();
        pathBuilder.moveTo(209.91f, 146.67f);
        pathBuilder.arcToRelative(11.91f, 11.91f, 0.0f, false, true, -11.7f, 9.3f);
        pathBuilder.lineTo(152.0f, 155.97f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.0f, 11.3f);
        pathBuilder.curveToRelative(-16.65f, -5.88f, -30.65f, -15.76f, -40.48f, -28.56f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, true, 44.0f, 128.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, true, 83.13f, -84.0f);
        pathBuilder.lineTo(128.0f, 44.0f);
        pathBuilder.arcToRelative(84.35f, 84.35f, 0.0f, false, true, 84.0f, 83.29f);
        pathBuilder.arcTo(84.72f, 84.72f, 0.0f, false, true, 209.91f, 146.71f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 76.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 100.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, true, true, 84.0f, 84.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 156.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 100.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 188.0f, 100.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _palette = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
