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

/* compiled from: Paintbrush.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaintBrush", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPaintBrush", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paintBrush", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaintbrushKt {
    private static ImageVector _paintBrush;

    public static final ImageVector getPaintBrush(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _paintBrush;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaintBrush", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 28.0f);
        pathBuilder.curveToRelative(-20.29f, 0.0f, -43.16f, 11.24f, -68.0f, 33.4f);
        pathBuilder.curveToRelative(-18.47f, 16.49f, -34.39f, 35.83f, -45.0f, 49.93f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 36.0f, 164.0f);
        pathBuilder.curveToRelative(0.0f, 33.22f, -21.26f, 48.0f, -22.22f, 48.68f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 220.0f);
        pathBuilder.lineTo(92.0f, 220.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, 52.67f, -75.0f);
        pathBuilder.curveToRelative(14.11f, -10.63f, 33.44f, -26.55f, 49.93f, -45.0f);
        pathBuilder.curveTo(216.76f, 75.16f, 228.0f, 52.29f, 228.0f, 32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 212.0f);
        pathBuilder.lineTo(26.35f, 212.0f);
        pathBuilder.curveTo(33.91f, 203.69f, 44.0f, 188.08f, 44.0f, 164.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(118.52f, 114.69f);
        pathBuilder.curveToRelative(4.13f, -5.44f, 9.32f, -12.0f, 15.29f, -18.9f);
        pathBuilder.arcToRelative(80.08f, 80.08f, 0.0f, false, true, 26.4f, 26.4f);
        pathBuilder.curveToRelative(-6.94f, 6.0f, -13.46f, 11.16f, -18.9f, 15.29f);
        pathBuilder.arcTo(56.32f, 56.32f, 0.0f, false, false, 118.52f, 114.69f);
        pathBuilder.close();
        pathBuilder.moveTo(166.29f, 116.83f);
        pathBuilder.arcToRelative(88.17f, 88.17f, 0.0f, false, false, -27.12f, -27.12f);
        pathBuilder.curveTo(161.0f, 65.43f, 191.26f, 38.63f, 219.82f, 36.18f);
        pathBuilder.curveTo(217.37f, 64.74f, 190.57f, 95.0f, 166.29f, 116.83f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paintBrush = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
