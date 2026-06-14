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

/* compiled from: Ear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getEar", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EarKt {
    private static ImageVector _ear;

    public static final ImageVector getEar(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _ear;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Ear", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, false, -144.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 26.7f, 8.53f, 34.92f, 17.57f, 43.64f);
        pathBuilder.curveTo(82.21f, 156.0f, 92.0f, 165.41f, 92.0f, 188.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f);
        pathBuilder.curveToRelative(10.24f, 0.0f, 18.45f, -4.16f, 25.83f, -13.09f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.34f, 10.18f);
        pathBuilder.curveTo(155.81f, 233.64f, 143.0f, 240.0f, 128.0f, 240.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, -52.0f);
        pathBuilder.curveToRelative(0.0f, -15.79f, -5.68f, -21.27f, -13.54f, -28.84f);
        pathBuilder.curveTo(52.46f, 149.5f, 40.0f, 137.5f, 40.0f, 104.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 176.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.87f, 161.08f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 166.93f, 164.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 160.0f);
        pathBuilder.curveToRelative(0.0f, -9.33f, 4.82f, -15.76f, 10.4f, -23.2f);
        pathBuilder.curveToRelative(6.37f, -8.5f, 13.6f, -18.13f, 13.6f, -32.8f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 9.33f, -4.82f, 15.76f, -10.4f, 23.2f);
        pathBuilder.curveToRelative(-6.37f, 8.5f, -13.6f, 18.13f, -13.6f, 32.8f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 44.78f, 12.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 177.87f, 161.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
