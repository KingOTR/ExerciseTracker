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

/* compiled from: Butterfly.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Butterfly", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getButterfly", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_butterfly", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButterflyKt {
    private static ImageVector _butterfly;

    public static final ImageVector getButterfly(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _butterfly;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Butterfly", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.79f, 48.0f);
        pathBuilder.curveToRelative(-4.27f, -5.48f, -12.4f, -12.0f, -26.88f, -12.0f);
        pathBuilder.curveToRelative(-17.86f, 0.0f, -40.5f, 11.7f, -60.57f, 31.3f);
        pathBuilder.curveToRelative(-3.0f, 2.89f, -5.74f, 5.85f, -8.34f, 8.84f);
        pathBuilder.lineTo(140.0f, 56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 76.14f);
        pathBuilder.curveToRelative(-2.6f, -3.0f, -5.38f, -6.0f, -8.34f, -8.84f);
        pathBuilder.curveTo(87.59f, 47.7f, 65.0f, 36.0f, 47.09f, 36.0f);
        pathBuilder.curveToRelative(-14.48f, 0.0f, -22.61f, 6.54f, -26.88f, 12.0f);
        pathBuilder.curveTo(7.0f, 65.0f, 12.0f, 93.91f, 19.28f, 122.66f);
        pathBuilder.curveToRelative(5.75f, 22.64f, 17.8f, 33.0f, 28.88f, 37.69f);
        pathBuilder.arcTo(48.12f, 48.12f, 0.0f, false, false, 92.0f, 228.0f);
        pathBuilder.arcToRelative(47.87f, 47.87f, 0.0f, false, false, 36.0f, -16.28f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, false, 212.0f, 180.0f);
        pathBuilder.arcToRelative(48.51f, 48.51f, 0.0f, false, false, -4.14f, -19.65f);
        pathBuilder.curveToRelative(11.08f, -4.67f, 23.13f, -15.0f, 28.88f, -37.69f);
        pathBuilder.curveTo(244.0f, 93.91f, 249.0f, 65.0f, 235.79f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 204.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f);
        pathBuilder.arcToRelative(24.36f, 24.36f, 0.0f, false, true, 21.31f, -24.07f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.64f, -23.86f);
        pathBuilder.arcTo(47.63f, 47.63f, 0.0f, false, false, 65.17f, 140.0f);
        pathBuilder.curveToRelative(-8.19f, -0.29f, -18.0f, -4.92f, -22.63f, -23.24f);
        pathBuilder.curveToRelative(-7.41f, -29.18f, -8.55f, -47.35f, -3.39f, -54.0f);
        pathBuilder.curveTo(39.74f, 62.0f, 41.3f, 60.0f, 47.09f, 60.0f);
        pathBuilder.curveTo(58.3f, 60.0f, 75.91f, 69.83f, 90.9f, 84.47f);
        pathBuilder.curveToRelative(15.25f, 14.9f, 25.1f, 31.86f, 25.1f, 43.2f);
        pathBuilder.lineTo(116.0f, 180.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 92.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(213.45f, 116.75f);
        pathBuilder.curveTo(208.81f, 135.07f, 199.0f, 139.7f, 190.82f, 140.0f);
        pathBuilder.arcToRelative(47.54f, 47.54f, 0.0f, false, false, -21.51f, -7.92f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -2.64f, 23.86f);
        pathBuilder.arcTo(24.36f, 24.36f, 0.0f, false, true, 188.0f, 180.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 127.67f);
        pathBuilder.curveToRelative(0.0f, -11.34f, 9.85f, -28.3f, 25.1f, -43.2f);
        pathBuilder.curveTo(180.09f, 69.83f, 197.7f, 60.0f, 208.91f, 60.0f);
        pathBuilder.curveToRelative(5.79f, 0.0f, 7.35f, 2.0f, 7.94f, 2.76f);
        pathBuilder.curveTo(222.0f, 69.4f, 220.87f, 87.57f, 213.46f, 116.75f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _butterfly = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
