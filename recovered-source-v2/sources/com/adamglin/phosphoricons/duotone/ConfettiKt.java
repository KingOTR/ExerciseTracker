package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Confetti.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Confetti", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getConfetti", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_confetti", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfettiKt {
    private static ImageVector _confetti;

    public static final ImageVector getConfetti(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(58.89f, 154.89f);
        pathBuilder.lineToRelative(42.22f, 42.22f);
        pathBuilder.lineToRelative(-50.63f, 18.4f);
        pathBuilder.arcToRelative(7.79f, 7.79f, 0.0f, false, true, -10.0f, -10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(197.71f, 150.17f);
        pathBuilder.lineTo(105.83f, 58.29f);
        pathBuilder.arcTo(7.79f, 7.79f, 0.0f, false, false, 93.0f, 61.14f);
        pathBuilder.lineToRelative(-14.9f, 41.0f);
        pathBuilder.lineToRelative(75.82f, 75.82f);
        pathBuilder.lineToRelative(41.0f, -14.9f);
        pathBuilder.arcTo(7.79f, 7.79f, 0.0f, false, false, 197.71f, 150.17f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(111.49f, 52.63f);
        pathBuilder2.arcToRelative(15.8f, 15.8f, 0.0f, false, false, -26.0f, 5.77f);
        pathBuilder2.lineTo(33.0f, 202.78f);
        pathBuilder2.arcTo(15.83f, 15.83f, 0.0f, false, false, 47.76f, 224.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 5.46f, -1.0f);
        pathBuilder2.lineToRelative(144.37f, -52.5f);
        pathBuilder2.arcToRelative(15.8f, 15.8f, 0.0f, false, false, 5.78f, -26.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(103.16f, 187.84f);
        pathBuilder2.lineTo(68.16f, 152.84f);
        pathBuilder2.lineTo(81.32f, 116.63f);
        pathBuilder2.lineTo(139.37f, 174.68f);
        pathBuilder2.close();
        pathBuilder2.moveTo(48.16f, 207.84f);
        pathBuilder2.lineTo(62.16f, 169.43f);
        pathBuilder2.lineTo(86.61f, 193.88f);
        pathBuilder2.close();
        pathBuilder2.moveTo(156.0f, 168.64f);
        pathBuilder2.lineTo(87.36f, 100.0f);
        pathBuilder2.lineToRelative(13.0f, -35.87f);
        pathBuilder2.lineToRelative(91.43f, 91.43f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 72.0f);
        pathBuilder2.arcToRelative(37.8f, 37.8f, 0.0f, false, true, 3.84f, -15.58f);
        pathBuilder2.curveTo(169.14f, 45.83f, 179.14f, 40.0f, 192.0f, 40.0f);
        pathBuilder2.curveToRelative(6.7f, 0.0f, 11.0f, -2.29f, 13.65f, -7.21f);
        pathBuilder2.arcTo(22.0f, 22.0f, 0.0f, false, false, 208.0f, 23.94f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 24.0f);
        pathBuilder2.curveToRelative(0.0f, 12.86f, -8.52f, 32.0f, -32.0f, 32.0f);
        pathBuilder2.curveToRelative(-6.7f, 0.0f, -11.0f, 2.29f, -13.65f, 7.21f);
        pathBuilder2.arcTo(22.0f, 22.0f, 0.0f, false, false, 176.0f, 72.06f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 72.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(136.0f, 40.0f);
        pathBuilder2.lineTo(136.0f, 16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.lineTo(152.0f, 40.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(237.66f, 122.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.32f, 11.31f);
        pathBuilder2.lineToRelative(-16.0f, -16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(242.53f, 79.59f);
        pathBuilder2.lineTo(218.53f, 87.59f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.06f, -15.18f);
        pathBuilder2.lineToRelative(24.0f, -8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.06f, 15.18f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _confetti = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
