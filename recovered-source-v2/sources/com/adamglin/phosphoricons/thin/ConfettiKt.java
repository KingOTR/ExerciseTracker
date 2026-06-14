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

/* compiled from: Confetti.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Confetti", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getConfetti", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_confetti", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfettiKt {
    private static ImageVector _confetti;

    public static final ImageVector getConfetti(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(108.66f, 55.46f);
        pathBuilder.arcToRelative(11.79f, 11.79f, 0.0f, false, false, -19.43f, 4.31f);
        pathBuilder.lineTo(36.73f, 204.15f);
        pathBuilder.arcToRelative(11.81f, 11.81f, 0.0f, false, false, 11.0f, 15.85f);
        pathBuilder.arcToRelative(11.88f, 11.88f, 0.0f, false, false, 4.08f, -0.73f);
        pathBuilder.lineToRelative(144.38f, -52.5f);
        pathBuilder.arcToRelative(11.79f, 11.79f, 0.0f, false, false, 4.31f, -19.43f);
        pathBuilder.close();
        pathBuilder.moveTo(102.13f, 192.46f);
        pathBuilder.lineTo(63.52f, 153.87f);
        pathBuilder.lineToRelative(16.19f, -44.51f);
        pathBuilder.lineToRelative(66.92f, 66.93f);
        pathBuilder.close();
        pathBuilder.moveTo(49.13f, 211.74f);
        pathBuilder.arcToRelative(3.81f, 3.81f, 0.0f, false, true, -4.87f, -4.87f);
        pathBuilder.lineToRelative(16.27f, -44.72f);
        pathBuilder.lineToRelative(33.32f, 33.32f);
        pathBuilder.close();
        pathBuilder.moveTo(195.93f, 156.49f);
        pathBuilder.arcToRelative(3.77f, 3.77f, 0.0f, false, true, -2.42f, 2.74f);
        pathBuilder.lineToRelative(-38.56f, 14.0f);
        pathBuilder.lineTo(82.72f, 101.07f);
        pathBuilder.lineToRelative(14.0f, -38.56f);
        pathBuilder.arcToRelative(3.77f, 3.77f, 0.0f, false, true, 2.74f, -2.42f);
        pathBuilder.arcToRelative(4.32f, 4.32f, 0.0f, false, true, 0.85f, -0.09f);
        pathBuilder.arcTo(3.65f, 3.65f, 0.0f, false, true, 103.0f, 61.12f);
        pathBuilder.lineTo(194.88f, 153.0f);
        pathBuilder.arcTo(3.78f, 3.78f, 0.0f, false, true, 195.91f, 156.51f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 24.0f);
        pathBuilder.curveToRelative(0.0f, 9.68f, -5.85f, 28.0f, -28.0f, 28.0f);
        pathBuilder.curveToRelative(-8.31f, 0.0f, -14.18f, 3.29f, -17.42f, 9.79f);
        pathBuilder.arcTo(26.12f, 26.12f, 0.0f, false, false, 172.0f, 72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.arcToRelative(34.06f, 34.06f, 0.0f, false, true, 3.42f, -13.79f);
        pathBuilder.curveTo(170.66f, 51.73f, 177.56f, 44.0f, 192.0f, 44.0f);
        pathBuilder.curveToRelative(19.29f, 0.0f, 20.0f, -18.0f, 20.0f, -20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 40.0f);
        pathBuilder.lineTo(140.0f, 16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.lineTo(148.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.83f, 125.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(241.26f, 75.8f);
        pathBuilder.lineTo(217.26f, 83.8f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.27f, -7.79f);
        pathBuilder.lineToRelative(24.0f, -8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.53f, 7.59f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _confetti = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
