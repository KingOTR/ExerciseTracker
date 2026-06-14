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

/* compiled from: Openailogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"OpenAiLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getOpenAiLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_openAiLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenailogoKt {
    private static ImageVector _openAiLogo;

    public static final ImageVector getOpenAiLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(219.68f, 114.91f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 162.49f, 42.0f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 70.82f, 55.15f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, -34.5f, 85.94f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 70.0f, 213.16f);
        pathBuilder.arcTo(52.33f, 52.33f, 0.0f, false, false, 83.59f, 215.0f);
        pathBuilder.arcToRelative(51.66f, 51.66f, 0.0f, false, false, 9.93f, -1.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, 91.66f, -13.13f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, 34.5f, -85.94f);
        pathBuilder.close();
        pathBuilder.moveTo(183.88f, 50.57f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 29.66f, 58.36f);
        pathBuilder.arcToRelative(51.84f, 51.84f, 0.0f, false, false, -7.0f, -4.89f);
        pathBuilder.lineTo(162.0f, 78.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 0.0f);
        pathBuilder.lineToRelative(-50.0f, 28.87f);
        pathBuilder.lineTo(108.0f, 79.5f);
        pathBuilder.lineTo(150.5f, 55.0f);
        pathBuilder.arcTo(43.69f, 43.69f, 0.0f, false, true, 183.88f, 50.57f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 139.57f);
        pathBuilder.lineTo(128.0f, 151.11f);
        pathBuilder.lineTo(108.0f, 139.57f);
        pathBuilder.verticalLineToRelative(-23.1f);
        pathBuilder.lineToRelative(20.0f, -11.54f);
        pathBuilder.lineToRelative(20.0f, 11.54f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 72.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 78.25f, -27.62f);
        pathBuilder.arcTo(52.08f, 52.08f, 0.0f, false, false, 146.5f, 48.0f);
        pathBuilder.lineTo(102.0f, 73.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, 3.46f);
        pathBuilder.verticalLineToRelative(57.74f);
        pathBuilder.lineTo(76.0f, 121.07f);
        pathBuilder.close();
        pathBuilder.moveTo(37.4f, 84.93f);
        pathBuilder.arcTo(43.72f, 43.72f, 0.0f, false, true, 68.71f, 63.46f);
        pathBuilder.arcTo(52.26f, 52.26f, 0.0f, false, false, 68.0f, 72.0f);
        pathBuilder.verticalLineToRelative(51.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 3.46f);
        pathBuilder.lineToRelative(50.0f, 28.87f);
        pathBuilder.lineTo(96.0f, 169.57f);
        pathBuilder.lineTo(53.5f, 145.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 37.4f, 84.93f);
        pathBuilder.close();
        pathBuilder.moveTo(72.12f, 205.43f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -29.66f, -58.36f);
        pathBuilder.arcToRelative(51.84f, 51.84f, 0.0f, false, false, 7.0f, 4.89f);
        pathBuilder.lineTo(94.0f, 177.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 0.0f);
        pathBuilder.lineToRelative(50.0f, -28.87f);
        pathBuilder.lineTo(148.0f, 176.5f);
        pathBuilder.lineTo(105.5f, 201.0f);
        pathBuilder.arcTo(43.69f, 43.69f, 0.0f, false, true, 72.12f, 205.43f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 184.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -78.26f, 27.61f);
        pathBuilder.arcTo(51.66f, 51.66f, 0.0f, false, false, 109.5f, 208.0f);
        pathBuilder.lineTo(154.0f, 182.27f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -3.46f);
        pathBuilder.lineTo(156.0f, 121.07f);
        pathBuilder.lineToRelative(24.0f, 13.86f);
        pathBuilder.close();
        pathBuilder.moveTo(218.6f, 171.07f);
        pathBuilder.arcToRelative(43.72f, 43.72f, 0.0f, false, true, -31.31f, 21.47f);
        pathBuilder.arcTo(52.26f, 52.26f, 0.0f, false, false, 188.0f, 184.0f);
        pathBuilder.lineTo(188.0f, 132.62f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, -3.46f);
        pathBuilder.lineToRelative(-50.0f, -28.87f);
        pathBuilder.lineToRelative(24.0f, -13.86f);
        pathBuilder.lineTo(202.5f, 111.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 218.6f, 171.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _openAiLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
