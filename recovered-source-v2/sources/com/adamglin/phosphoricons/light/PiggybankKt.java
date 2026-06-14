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

/* compiled from: Piggybank.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PiggyBank", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPiggyBank", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_piggyBank", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PiggybankKt {
    private static ImageVector _piggyBank;

    public static final ImageVector getPiggyBank(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _piggyBank;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PiggyBank", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(190.0f, 116.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 190.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 66.0f);
        pathBuilder.lineTo(112.0f, 66.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(246.0f, 112.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(-3.77f);
        pathBuilder.lineToRelative(-16.68f, 46.71f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 190.36f, 222.0f);
        pathBuilder.lineTo(177.64f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -13.19f, -9.29f);
        pathBuilder.lineTo(162.06f, 206.0f);
        pathBuilder.lineTo(101.94f, 206.0f);
        pathBuilder.lineToRelative(-2.39f, 6.71f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 86.36f, 222.0f);
        pathBuilder.lineTo(73.64f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -13.19f, -9.29f);
        pathBuilder.lineTo(47.76f, 177.18f);
        pathBuilder.arcToRelative(85.72f, 85.72f, 0.0f, false, true, -21.47f, -50.24f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, false, 14.0f, 144.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 24.19f, -29.43f);
        pathBuilder.arcTo(86.1f, 86.1f, 0.0f, false, true, 112.0f, 34.0f);
        pathBuilder.lineTo(216.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(187.82f, 46.0f);
        pathBuilder.arcToRelative(85.92f, 85.92f, 0.0f, false, true, 35.12f, 39.83f);
        pathBuilder.curveToRelative(0.6f, 1.38f, 1.16f, 2.77f, 1.68f, 4.18f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 246.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 112.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f);
        pathBuilder.horizontalLineToRelative(-3.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.73f, -4.2f);
        pathBuilder.arcToRelative(71.4f, 71.4f, 0.0f, false, false, -2.68f, -7.19f);
        pathBuilder.arcTo(74.0f, 74.0f, 0.0f, false, false, 144.0f, 46.0f);
        pathBuilder.lineTo(112.0f, 46.0f);
        pathBuilder.arcTo(74.0f, 74.0f, 0.0f, false, false, 57.44f, 170.0f);
        pathBuilder.arcToRelative(5.81f, 5.81f, 0.0f, false, true, 1.22f, 2.0f);
        pathBuilder.lineToRelative(13.09f, 36.64f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 73.64f, 210.0f);
        pathBuilder.lineTo(86.36f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.89f, -1.33f);
        pathBuilder.lineTo(92.06f, 198.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.65f, -4.0f);
        pathBuilder.horizontalLineToRelative(68.58f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.65f, 4.0f);
        pathBuilder.lineToRelative(3.81f, 10.69f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.89f, 1.33f);
        pathBuilder.horizontalLineToRelative(12.72f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.89f, -1.33f);
        pathBuilder.lineTo(210.35f, 158.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.65f, -4.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _piggyBank = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
