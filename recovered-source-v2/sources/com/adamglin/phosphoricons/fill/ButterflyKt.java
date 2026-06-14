package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Butterfly.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Butterfly", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getButterfly", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_butterfly", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButterflyKt {
    private static ImageVector _butterfly;

    public static final ImageVector getButterfly(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 100.17f);
        pathBuilder.arcToRelative(108.42f, 108.42f, 0.0f, false, false, -8.0f, -12.64f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(87.53f);
        pathBuilder.arcTo(108.42f, 108.42f, 0.0f, false, false, 128.0f, 100.17f);
        pathBuilder.close();
        pathBuilder.moveTo(232.7f, 50.48f);
        pathBuilder.curveTo(229.0f, 45.7f, 221.84f, 40.0f, 209.0f, 40.0f);
        pathBuilder.curveToRelative(-16.85f, 0.0f, -38.46f, 11.28f, -57.81f, 30.16f);
        pathBuilder.arcTo(140.07f, 140.07f, 0.0f, false, false, 136.0f, 87.53f);
        pathBuilder.verticalLineTo(180.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(87.53f);
        pathBuilder.arcToRelative(140.07f, 140.07f, 0.0f, false, false, -15.15f, -17.37f);
        pathBuilder.curveTo(85.49f, 51.28f, 63.88f, 40.0f, 47.0f, 40.0f);
        pathBuilder.curveTo(34.16f, 40.0f, 27.0f, 45.7f, 23.3f, 50.48f);
        pathBuilder.curveToRelative(-6.82f, 8.77f, -12.18f, 24.08f, -0.21f, 71.2f);
        pathBuilder.curveToRelative(6.05f, 23.83f, 19.51f, 33.0f, 30.63f, 36.42f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 205.27f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 74.28f, -47.17f);
        pathBuilder.curveToRelative(11.12f, -3.4f, 24.57f, -12.59f, 30.63f, -36.42f);
        pathBuilder.curveTo(239.63f, 95.24f, 244.85f, 66.1f, 232.7f, 50.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _butterfly = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
