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

/* compiled from: Openailogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"OpenAiLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getOpenAiLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_openAiLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenailogoKt {
    private static ImageVector _openAiLogo;

    public static final ImageVector getOpenAiLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(224.32f, 114.24f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, -60.07f, -76.57f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 67.93f, 51.44f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, -36.25f, 90.32f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 69.0f, 217.0f);
        pathBuilder.arcTo(56.39f, 56.39f, 0.0f, false, false, 83.59f, 219.0f);
        pathBuilder.arcToRelative(55.75f, 55.75f, 0.0f, false, false, 8.17f, -0.61f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, 96.31f, -13.78f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, 36.25f, -90.32f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 137.24f);
        pathBuilder.lineTo(128.0f, 146.48f);
        pathBuilder.lineTo(112.0f, 137.24f);
        pathBuilder.lineTo(112.0f, 118.76f);
        pathBuilder.lineToRelative(16.0f, -9.24f);
        pathBuilder.lineToRelative(16.0f, 9.24f);
        pathBuilder.close();
        pathBuilder.moveTo(182.85f, 54.43f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 28.56f, 48.0f);
        pathBuilder.curveToRelative(-0.95f, -0.63f, -1.91f, -1.24f, -2.91f, -1.81f);
        pathBuilder.lineTo(164.0f, 74.88f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.lineToRelative(-44.0f, 25.41f);
        pathBuilder.lineTo(112.0f, 81.81f);
        pathBuilder.lineToRelative(40.5f, -23.38f);
        pathBuilder.arcTo(39.76f, 39.76f, 0.0f, false, true, 182.85f, 54.43f);
        pathBuilder.close();
        pathBuilder.moveTo(40.85f, 86.93f);
        pathBuilder.arcTo(39.75f, 39.75f, 0.0f, false, true, 64.12f, 68.57f);
        pathBuilder.curveTo(64.05f, 69.71f, 64.0f, 70.85f, 64.0f, 72.0f);
        pathBuilder.verticalLineToRelative(51.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 6.93f);
        pathBuilder.lineToRelative(44.0f, 25.4f);
        pathBuilder.lineTo(96.0f, 165.0f);
        pathBuilder.lineTo(55.5f, 141.57f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 40.86f, 86.93f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 224.0f);
        pathBuilder.arcToRelative(39.79f, 39.79f, 0.0f, false, true, -27.52f, -10.95f);
        pathBuilder.curveToRelative(1.0f, -0.51f, 2.0f, -1.05f, 3.0f, -1.63f);
        pathBuilder.lineTo(156.0f, 185.73f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -6.92f);
        pathBuilder.lineTo(160.0f, 128.0f);
        pathBuilder.lineToRelative(16.0f, 9.24f);
        pathBuilder.lineTo(176.0f, 184.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 136.0f, 224.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _openAiLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
