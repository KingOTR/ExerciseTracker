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

/* compiled from: Openailogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"OpenAiLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getOpenAiLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_openAiLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenailogoKt {
    private static ImageVector _openAiLogo;

    public static final ImageVector getOpenAiLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _openAiLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("OpenAiLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.0f, 114.56f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, -58.67f, -74.73f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, -94.0f, 13.46f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, false, 34.0f, 141.44f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, 35.56f, 73.65f);
        pathBuilder.arcTo(54.54f, 54.54f, 0.0f, false, false, 83.59f, 217.0f);
        pathBuilder.arcToRelative(52.86f, 52.86f, 0.0f, false, false, 9.06f, -0.78f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, 94.0f, -13.46f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, false, 222.0f, 114.56f);
        pathBuilder.close();
        pathBuilder.moveTo(183.37f, 52.5f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 29.21f, 53.14f);
        pathBuilder.arcToRelative(54.84f, 54.84f, 0.0f, false, false, -5.08f, -3.33f);
        pathBuilder.lineTo(163.0f, 76.62f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 0.0f);
        pathBuilder.lineToRelative(-47.0f, 27.13f);
        pathBuilder.lineTo(110.0f, 80.66f);
        pathBuilder.lineToRelative(41.5f, -24.0f);
        pathBuilder.arcTo(41.73f, 41.73f, 0.0f, false, true, 183.37f, 52.5f);
        pathBuilder.close();
        pathBuilder.moveTo(146.0f, 138.39f);
        pathBuilder.lineToRelative(-18.0f, 10.39f);
        pathBuilder.lineToRelative(-18.0f, -10.39f);
        pathBuilder.lineTo(110.0f, 117.61f);
        pathBuilder.lineToRelative(18.0f, -10.39f);
        pathBuilder.lineToRelative(18.0f, 10.39f);
        pathBuilder.close();
        pathBuilder.moveTo(78.0f, 72.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 72.92f, -28.43f);
        pathBuilder.arcToRelative(56.18f, 56.18f, 0.0f, false, false, -5.42f, 2.74f);
        pathBuilder.lineTo(101.0f, 72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.0f, 5.19f);
        pathBuilder.verticalLineToRelative(54.27f);
        pathBuilder.lineTo(78.0f, 119.92f);
        pathBuilder.close();
        pathBuilder.moveTo(39.13f, 85.93f);
        pathBuilder.arcToRelative(41.75f, 41.75f, 0.0f, false, true, 27.22f, -20.0f);
        pathBuilder.arcTo(55.09f, 55.09f, 0.0f, false, false, 66.0f, 72.0f);
        pathBuilder.verticalLineToRelative(51.38f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, 5.2f);
        pathBuilder.lineToRelative(47.0f, 27.13f);
        pathBuilder.lineTo(96.0f, 167.26f);
        pathBuilder.lineToRelative(-41.5f, -24.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, true, 39.13f, 85.93f);
        pathBuilder.close();
        pathBuilder.moveTo(72.63f, 203.5f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -29.21f, -53.14f);
        pathBuilder.arcToRelative(54.84f, 54.84f, 0.0f, false, false, 5.08f, 3.33f);
        pathBuilder.lineTo(93.0f, 179.38f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 0.0f);
        pathBuilder.lineToRelative(47.0f, -27.13f);
        pathBuilder.verticalLineToRelative(23.09f);
        pathBuilder.lineToRelative(-41.5f, 24.0f);
        pathBuilder.arcTo(41.73f, 41.73f, 0.0f, false, true, 72.63f, 203.5f);
        pathBuilder.close();
        pathBuilder.moveTo(178.0f, 184.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -72.92f, 28.43f);
        pathBuilder.arcToRelative(56.18f, 56.18f, 0.0f, false, false, 5.42f, -2.74f);
        pathBuilder.lineTo(155.0f, 184.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, -5.19f);
        pathBuilder.lineTo(158.0f, 124.54f);
        pathBuilder.lineToRelative(20.0f, 11.54f);
        pathBuilder.close();
        pathBuilder.moveTo(216.87f, 170.07f);
        pathBuilder.arcToRelative(41.75f, 41.75f, 0.0f, false, true, -27.22f, 20.0f);
        pathBuilder.arcTo(55.09f, 55.09f, 0.0f, false, false, 190.0f, 184.0f);
        pathBuilder.lineTo(190.0f, 132.62f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.0f, -5.2f);
        pathBuilder.lineToRelative(-47.0f, -27.13f);
        pathBuilder.lineToRelative(20.0f, -11.55f);
        pathBuilder.lineToRelative(41.5f, 24.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, true, 216.87f, 170.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _openAiLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
