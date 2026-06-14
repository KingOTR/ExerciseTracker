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

/* compiled from: Textsuperscript.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TextSuperscript", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTextSuperscript", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_textSuperscript", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextsuperscriptKt {
    private static ImageVector _textSuperscript;

    public static final ImageVector getTextSuperscript(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _textSuperscript;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TextSuperscript", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.0f, 144.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.horizontalLineTo(192.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.8f, -9.6f);
        pathBuilder.lineToRelative(43.17f, -57.55f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, true, false, 199.0f, 66.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.31f, -4.0f);
        pathBuilder.arcTo(30.12f, 30.12f, 0.0f, false, true, 192.0f, 54.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, true, 240.0f, 90.06f);
        pathBuilder.lineTo(204.0f, 138.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(147.93f, 75.47f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.46f, 0.6f);
        pathBuilder.lineTo(92.0f, 130.84f);
        pathBuilder.lineTo(44.53f, 76.07f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.06f, 7.86f);
        pathBuilder.lineTo(84.06f, 140.0f);
        pathBuilder.lineTo(35.47f, 196.07f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.06f, 7.86f);
        pathBuilder.lineTo(92.0f, 149.16f);
        pathBuilder.lineToRelative(47.47f, 54.77f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.06f, -7.86f);
        pathBuilder.lineTo(99.94f, 140.0f);
        pathBuilder.lineToRelative(48.59f, -56.07f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 147.93f, 75.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _textSuperscript = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
