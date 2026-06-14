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

/* compiled from: Flagcheckered.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlagCheckered", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFlagCheckered", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flagCheckered", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagcheckeredKt {
    private static ImageVector _flagCheckered;

    public static final ImageVector getFlagCheckered(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _flagCheckered;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlagCheckered", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(226.49f, 50.5f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.42f, 0.92f);
        pathBuilder.curveToRelative(-29.0f, 25.11f, -53.28f, 13.08f, -81.41f, -0.84f);
        pathBuilder.curveToRelative(-27.92f, -13.82f, -59.57f, -29.49f, -94.59f, 0.84f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 42.0f, 56.0f);
        pathBuilder.lineTo(42.0f, 224.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(54.0f, 178.78f);
        pathBuilder.curveToRelative(28.08f, -22.79f, 51.88f, -11.0f, 79.34f, 2.59f);
        pathBuilder.curveToRelative(27.92f, 13.82f, 59.58f, 29.48f, 94.59f, -0.85f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 176.0f);
        pathBuilder.lineTo(230.0f, 56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 226.49f, 50.5f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 68.0f);
        pathBuilder.verticalLineToRelative(45.2f);
        pathBuilder.curveToRelative(-15.53f, 12.6f, -29.75f, 14.65f, -44.0f, 11.65f);
        pathBuilder.lineTo(174.0f, 76.88f);
        pathBuilder.curveTo(188.0f, 79.33f, 202.64f, 77.78f, 218.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(162.0f, 73.87f);
        pathBuilder.verticalLineToRelative(47.4f);
        pathBuilder.curveToRelative(-7.6f, -2.85f, -15.31f, -6.66f, -23.34f, -10.64f);
        pathBuilder.curveToRelative(-9.16f, -4.53f, -18.71f, -9.26f, -28.66f, -12.5f);
        pathBuilder.lineTo(110.0f, 50.71f);
        pathBuilder.arcToRelative(255.17f, 255.17f, 0.0f, false, true, 23.34f, 10.63f);
        pathBuilder.curveTo(142.5f, 65.87f, 152.05f, 70.59f, 162.0f, 73.83f);
        pathBuilder.close();
        pathBuilder.moveTo(98.0f, 47.13f);
        pathBuilder.lineTo(98.0f, 95.0f);
        pathBuilder.curveToRelative(-14.0f, -2.45f, -28.64f, -0.89f, -44.0f, 8.93f);
        pathBuilder.lineTo(54.0f, 58.75f);
        pathBuilder.curveTo(69.53f, 46.15f, 83.75f, 44.13f, 98.0f, 47.13f);
        pathBuilder.close();
        pathBuilder.moveTo(86.63f, 154.0f);
        pathBuilder.curveTo(76.13f, 154.0f, 65.24f, 156.79f, 54.0f, 164.0f);
        pathBuilder.lineTo(54.0f, 118.79f);
        pathBuilder.curveToRelative(15.53f, -12.61f, 29.75f, -14.65f, 44.0f, -11.65f);
        pathBuilder.verticalLineToRelative(47.93f);
        pathBuilder.arcTo(66.32f, 66.32f, 0.0f, false, false, 86.63f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(110.0f, 158.11f);
        pathBuilder.lineTo(110.0f, 110.72f);
        pathBuilder.curveToRelative(7.6f, 2.84f, 15.31f, 6.66f, 23.34f, 10.63f);
        pathBuilder.curveToRelative(9.16f, 4.53f, 18.71f, 9.26f, 28.66f, 12.5f);
        pathBuilder.verticalLineToRelative(47.39f);
        pathBuilder.curveToRelative(-7.6f, -2.85f, -15.31f, -6.66f, -23.34f, -10.63f);
        pathBuilder.curveTo(129.5f, 166.07f, 120.0f, 161.35f, 110.0f, 158.11f);
        pathBuilder.close();
        pathBuilder.moveTo(174.0f, 184.81f);
        pathBuilder.lineTo(174.0f, 136.89f);
        pathBuilder.arcToRelative(66.32f, 66.32f, 0.0f, false, false, 11.37f, 1.0f);
        pathBuilder.curveToRelative(10.5f, 0.0f, 21.39f, -2.78f, 32.63f, -10.0f);
        pathBuilder.verticalLineToRelative(45.24f);
        pathBuilder.curveTo(202.47f, 185.79f, 188.25f, 187.81f, 174.0f, 184.81f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flagCheckered = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
