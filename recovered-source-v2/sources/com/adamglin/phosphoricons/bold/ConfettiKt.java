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

/* compiled from: Confetti.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Confetti", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getConfetti", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_confetti", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfettiKt {
    private static ImageVector _confetti;

    public static final ImageVector getConfetti(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _confetti;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Confetti", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(114.32f, 49.8f);
        pathBuilder.arcTo(19.79f, 19.79f, 0.0f, false, false, 81.72f, 57.0f);
        pathBuilder.lineTo(29.22f, 201.41f);
        pathBuilder.arcTo(19.82f, 19.82f, 0.0f, false, false, 47.75f, 228.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 6.84f, -1.22f);
        pathBuilder.lineTo(199.0f, 174.28f);
        pathBuilder.arcToRelative(19.79f, 19.79f, 0.0f, false, false, 7.24f, -32.6f);
        pathBuilder.close();
        pathBuilder.moveTo(104.19f, 183.21f);
        pathBuilder.lineToRelative(-31.4f, -31.4f);
        pathBuilder.lineTo(82.94f, 123.9f);
        pathBuilder.lineToRelative(49.16f, 49.16f);
        pathBuilder.close();
        pathBuilder.moveTo(51.77f, 209.61f);
        pathBuilder.close();
        pathBuilder.moveTo(63.77f, 176.7f);
        pathBuilder.lineTo(79.3f, 192.26f);
        pathBuilder.lineToRelative(-24.45f, 8.89f);
        pathBuilder.close();
        pathBuilder.moveTo(157.0f, 164.0f);
        pathBuilder.lineTo(92.0f, 99.0f);
        pathBuilder.lineToRelative(10.0f, -27.58f);
        pathBuilder.lineTo(184.57f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 40.0f);
        pathBuilder.lineTo(128.0f, 16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.lineTo(152.0f, 40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(244.48f, 123.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(243.79f, 83.38f);
        pathBuilder.lineTo(219.79f, 91.38f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.59f, -22.77f);
        pathBuilder.lineToRelative(24.0f, -8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.59f, 22.77f);
        pathBuilder.close();
        pathBuilder.moveTo(156.6f, 65.93f);
        pathBuilder.curveTo(159.83f, 47.47f, 173.39f, 36.0f, 192.0f, 36.0f);
        pathBuilder.curveToRelative(6.45f, 0.0f, 8.69f, -2.49f, 10.0f, -4.92f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, 2.0f, -7.22f);
        pathBuilder.lineTo(204.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 14.47f, -9.59f, 36.0f, -36.0f, 36.0f);
        pathBuilder.curveToRelative(-4.94f, 0.0f, -10.21f, 1.19f, -11.76f, 10.06f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 168.43f, 80.0f);
        pathBuilder.arcToRelative(12.35f, 12.35f, 0.0f, false, true, -2.08f, -0.18f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 156.6f, 65.93f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _confetti = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
