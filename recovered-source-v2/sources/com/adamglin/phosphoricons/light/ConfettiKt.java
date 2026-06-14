package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Confetti.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Confetti", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getConfetti", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_confetti", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfettiKt {
    private static ImageVector _confetti;

    public static final ImageVector getConfetti(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(110.08f, 54.0f);
        pathBuilder.arcToRelative(13.8f, 13.8f, 0.0f, false, false, -22.73f, 5.05f);
        pathBuilder.lineTo(34.85f, 203.47f);
        pathBuilder.arcTo(13.82f, 13.82f, 0.0f, false, false, 47.76f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 4.77f, -0.85f);
        pathBuilder.lineToRelative(144.38f, -52.5f);
        pathBuilder.arcToRelative(13.8f, 13.8f, 0.0f, false, false, 5.0f, -22.73f);
        pathBuilder.close();
        pathBuilder.moveTo(48.43f, 209.87f);
        pathBuilder.arcToRelative(1.79f, 1.79f, 0.0f, false, true, -2.3f, -2.3f);
        pathBuilder.lineTo(61.31f, 165.8f);
        pathBuilder.lineTo(90.2f, 194.68f);
        pathBuilder.close();
        pathBuilder.moveTo(102.64f, 190.16f);
        pathBuilder.lineTo(65.84f, 153.35f);
        pathBuilder.lineTo(80.51f, 113.0f);
        pathBuilder.lineTo(143.0f, 175.49f);
        pathBuilder.close();
        pathBuilder.moveTo(194.0f, 156.07f);
        pathBuilder.arcToRelative(1.74f, 1.74f, 0.0f, false, true, -1.14f, 1.3f);
        pathBuilder.lineTo(155.44f, 171.0f);
        pathBuilder.lineTo(85.0f, 100.55f);
        pathBuilder.lineTo(98.63f, 63.19f);
        pathBuilder.arcToRelative(1.72f, 1.72f, 0.0f, false, true, 1.3f, -1.14f);
        pathBuilder.arcToRelative(1.58f, 1.58f, 0.0f, false, true, 0.41f, 0.0f);
        pathBuilder.arcToRelative(1.72f, 1.72f, 0.0f, false, true, 1.25f, 0.53f);
        pathBuilder.lineToRelative(91.88f, 91.88f);
        pathBuilder.arcTo(1.73f, 1.73f, 0.0f, false, true, 194.0f, 156.07f);
        pathBuilder.close();
        pathBuilder.moveTo(162.0f, 72.0f);
        pathBuilder.arcToRelative(35.52f, 35.52f, 0.0f, false, true, 3.63f, -14.68f);
        pathBuilder.curveTo(170.57f, 47.44f, 179.93f, 42.0f, 192.0f, 42.0f);
        pathBuilder.curveToRelative(7.47f, 0.0f, 12.53f, -2.74f, 15.48f, -8.38f);
        pathBuilder.arcTo(24.18f, 24.18f, 0.0f, false, false, 210.0f, 24.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 216.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, 10.38f, -6.27f, 30.0f, -30.0f, 30.0f);
        pathBuilder.curveToRelative(-7.47f, 0.0f, -12.53f, 2.74f, -15.48f, 8.38f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 174.0f, 72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 162.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.0f, 40.0f);
        pathBuilder.lineTo(138.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.lineTo(150.0f, 40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.24f, 123.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(241.9f, 77.69f);
        pathBuilder.lineTo(217.9f, 85.69f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -3.8f, -11.38f);
        pathBuilder.lineToRelative(24.0f, -8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.8f, 11.38f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _confetti = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
