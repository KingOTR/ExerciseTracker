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

/* compiled from: Hand.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getHand", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hand", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandKt {
    private static ImageVector _hand;

    public static final ImageVector getHand(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _hand;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hand", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 64.0f);
        pathBuilder.verticalLineToRelative(90.93f);
        pathBuilder.curveToRelative(0.0f, 46.2f, -36.85f, 84.55f, -83.0f, 85.06f);
        pathBuilder.arcTo(83.71f, 83.71f, 0.0f, false, true, 72.6f, 215.4f);
        pathBuilder.curveTo(50.79f, 192.33f, 26.15f, 136.0f, 26.15f, 136.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 6.53f, -22.23f);
        pathBuilder.curveToRelative(7.66f, -4.0f, 17.1f, -0.84f, 21.4f, 6.62f);
        pathBuilder.lineToRelative(21.0f, 36.44f);
        pathBuilder.arcToRelative(6.09f, 6.09f, 0.0f, false, false, 6.0f, 3.09f);
        pathBuilder.lineToRelative(0.12f, 0.0f);
        pathBuilder.arcTo(8.19f, 8.19f, 0.0f, false, false, 88.0f, 151.74f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.77f, -16.0f);
        pathBuilder.curveToRelative(8.61f, 0.4f, 15.23f, 7.82f, 15.23f, 16.43f);
        pathBuilder.verticalLineTo(112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, 8.0f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, -8.25f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.77f, -16.0f);
        pathBuilder.curveToRelative(8.61f, 0.4f, 15.23f, 7.82f, 15.23f, 16.43f);
        pathBuilder.verticalLineTo(120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, 8.0f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, -8.25f);
        pathBuilder.verticalLineTo(64.45f);
        pathBuilder.curveToRelative(0.0f, -8.61f, 6.62f, -16.0f, 15.23f, -16.43f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hand = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
