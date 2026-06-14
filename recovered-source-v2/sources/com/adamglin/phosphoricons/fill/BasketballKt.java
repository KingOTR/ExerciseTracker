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

/* compiled from: Basketball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Basketball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBasketball", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_basketball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasketballKt {
    private static ImageVector _basketball;

    public static final ImageVector getBasketball(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _basketball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Basketball", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(63.6f, 46.39f);
        pathBuilder.arcToRelative(103.48f, 103.48f, 0.0f, false, true, 52.0f, -21.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.45f, 4.0f);
        pathBuilder.lineTo(120.05f, 120.0f);
        pathBuilder.lineTo(95.7f, 120.0f);
        pathBuilder.arcTo(103.77f, 103.77f, 0.0f, false, false, 63.38f, 52.44f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 63.6f, 46.39f);
        pathBuilder.close();
        pathBuilder.moveTo(46.0f, 64.07f);
        pathBuilder.arcToRelative(103.51f, 103.51f, 0.0f, false, false, -21.29f, 51.46f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.47f);
        pathBuilder.lineTo(79.63f, 120.0f);
        pathBuilder.arcTo(87.86f, 87.86f, 0.0f, false, false, 51.89f, 63.59f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 46.0f, 64.07f);
        pathBuilder.close();
        pathBuilder.moveTo(192.4f, 46.39f);
        pathBuilder.arcToRelative(103.48f, 103.48f, 0.0f, false, false, -52.0f, -21.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.45f, 4.0f);
        pathBuilder.lineTo(135.95f, 120.0f);
        pathBuilder.horizontalLineToRelative(24.3f);
        pathBuilder.arcToRelative(103.77f, 103.77f, 0.0f, false, true, 32.32f, -67.56f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 192.4f, 46.39f);
        pathBuilder.close();
        pathBuilder.moveTo(231.26f, 115.53f);
        pathBuilder.arcTo(103.51f, 103.51f, 0.0f, false, false, 210.0f, 64.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.86f, -0.48f);
        pathBuilder.arcTo(87.86f, 87.86f, 0.0f, false, false, 176.37f, 120.0f);
        pathBuilder.horizontalLineToRelative(50.91f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 231.26f, 115.53f);
        pathBuilder.close();
        pathBuilder.moveTo(24.74f, 140.47f);
        pathBuilder.arcTo(103.51f, 103.51f, 0.0f, false, false, 46.0f, 191.93f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.86f, 0.48f);
        pathBuilder.arcTo(87.86f, 87.86f, 0.0f, false, false, 79.63f, 136.0f);
        pathBuilder.lineTo(28.72f, 136.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 24.74f, 140.47f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 191.93f);
        pathBuilder.arcToRelative(103.51f, 103.51f, 0.0f, false, false, 21.29f, -51.46f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.47f);
        pathBuilder.lineTo(176.37f, 136.0f);
        pathBuilder.arcToRelative(87.86f, 87.86f, 0.0f, false, false, 27.74f, 56.41f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 210.0f, 191.93f);
        pathBuilder.close();
        pathBuilder.moveTo(63.6f, 209.61f);
        pathBuilder.arcToRelative(103.48f, 103.48f, 0.0f, false, false, 52.0f, 21.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.45f, -4.0f);
        pathBuilder.lineTo(120.05f, 136.0f);
        pathBuilder.lineTo(95.7f, 136.0f);
        pathBuilder.arcToRelative(103.77f, 103.77f, 0.0f, false, true, -32.32f, 67.56f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 63.6f, 209.61f);
        pathBuilder.close();
        pathBuilder.moveTo(160.3f, 136.0f);
        pathBuilder.lineTo(136.0f, 136.0f);
        pathBuilder.verticalLineToRelative(91.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.45f, 4.0f);
        pathBuilder.arcToRelative(103.48f, 103.48f, 0.0f, false, false, 52.0f, -21.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.22f, -6.05f);
        pathBuilder.arcTo(103.77f, 103.77f, 0.0f, false, true, 160.3f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _basketball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
