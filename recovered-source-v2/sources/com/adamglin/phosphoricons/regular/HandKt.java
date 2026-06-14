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

/* compiled from: Hand.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getHand", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hand", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandKt {
    private static ImageVector _hand;

    public static final ImageVector getHand(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(188.0f, 48.0f);
        pathBuilder.arcToRelative(27.75f, 27.75f, 0.0f, false, false, -12.0f, 2.71f);
        pathBuilder.lineTo(176.0f, 44.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -54.65f, -8.6f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 80.0f, 60.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.lineToRelative(-3.82f, -6.13f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -48.6f, 27.82f);
        pathBuilder.curveToRelative(16.0f, 33.77f, 28.93f, 57.72f, 43.72f, 72.69f);
        pathBuilder.curveTo(86.24f, 233.54f, 103.2f, 240.0f, 128.0f, 240.0f);
        pathBuilder.arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, -88.0f);
        pathBuilder.lineTo(216.0f, 76.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 188.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 152.0f);
        pathBuilder.arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, 72.0f);
        pathBuilder.curveToRelative(-20.38f, 0.0f, -33.51f, -4.88f, -45.33f, -16.85f);
        pathBuilder.curveTo(69.44f, 193.74f, 57.26f, 171.0f, 41.9f, 138.58f);
        pathBuilder.arcToRelative(6.36f, 6.36f, 0.0f, false, false, -0.3f, -0.58f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.79f, -12.0f);
        pathBuilder.arcToRelative(1.76f, 1.76f, 0.0f, false, false, 0.14f, 0.23f);
        pathBuilder.lineToRelative(18.67f, 30.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 152.0f);
        pathBuilder.lineTo(96.0f, 60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(136.0f, 44.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(176.0f, 76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hand = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
