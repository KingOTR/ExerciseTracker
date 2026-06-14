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

/* compiled from: Translate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Translate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTranslate", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_translate", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslateKt {
    private static ImageVector _translate;

    public static final ImageVector getTranslate(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _translate;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Translate", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.37f, 213.32f);
        pathBuilder.lineToRelative(-56.0f, -112.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.74f, 0.0f);
        pathBuilder.lineToRelative(-22.3f, 44.6f);
        pathBuilder.arcTo(90.0f, 90.0f, 0.0f, false, true, 105.0f, 127.19f);
        pathBuilder.arcTo(101.73f, 101.73f, 0.0f, false, false, 133.82f, 62.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.horizontalLineTo(102.0f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineTo(50.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(89.79f);
        pathBuilder.arcTo(89.71f, 89.71f, 0.0f, false, true, 96.0f, 119.23f);
        pathBuilder.arcTo(89.81f, 89.81f, 0.0f, false, true, 75.11f, 86.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, false, 63.8f, 90.0f);
        pathBuilder.arcTo(101.66f, 101.66f, 0.0f, false, false, 87.0f, 127.2f);
        pathBuilder.arcTo(89.56f, 89.56f, 0.0f, false, true, 32.0f, 146.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.arcToRelative(101.55f, 101.55f, 0.0f, false, false, 64.0f, -22.63f);
        pathBuilder.arcToRelative(102.11f, 102.11f, 0.0f, false, false, 54.53f, 22.17f);
        pathBuilder.lineToRelative(-27.89f, 55.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.74f, 5.36f);
        pathBuilder.lineTo(147.71f, 190.0f);
        pathBuilder.horizontalLineToRelative(72.58f);
        pathBuilder.lineToRelative(14.34f, 28.68f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 240.0f, 222.0f);
        pathBuilder.arcToRelative(5.87f, 5.87f, 0.0f, false, false, 2.68f, -0.64f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 245.37f, 213.32f);
        pathBuilder.close();
        pathBuilder.moveTo(153.71f, 178.0f);
        pathBuilder.lineTo(184.0f, 117.42f);
        pathBuilder.lineTo(214.29f, 178.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _translate = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
