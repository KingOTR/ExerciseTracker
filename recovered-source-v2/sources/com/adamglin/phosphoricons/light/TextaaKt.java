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

/* compiled from: Textaa.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TextAa", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTextAa", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_textAa", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextaaKt {
    private static ImageVector _textAa;

    public static final ImageVector getTextAa(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _textAa;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TextAa", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(85.43f, 53.45f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.86f, 0.0f);
        pathBuilder.lineToRelative(-64.0f, 136.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.86f, 5.11f);
        pathBuilder.lineTo(38.63f, 158.0f);
        pathBuilder.horizontalLineToRelative(82.74f);
        pathBuilder.lineToRelative(17.2f, 36.55f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.86f, -5.11f);
        pathBuilder.close();
        pathBuilder.moveTo(44.28f, 146.0f);
        pathBuilder.lineTo(80.0f, 70.09f);
        pathBuilder.lineTo(115.72f, 146.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 98.0f);
        pathBuilder.curveToRelative(-12.21f, 0.0f, -21.71f, 3.28f, -28.23f, 9.74f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.46f, 8.52f);
        pathBuilder.curveToRelative(4.18f, -4.15f, 10.84f, -6.26f, 19.77f, -6.26f);
        pathBuilder.curveToRelative(14.34f, 0.0f, 26.0f, 9.87f, 26.0f, 22.0f);
        pathBuilder.verticalLineToRelative(7.24f);
        pathBuilder.arcTo(40.36f, 40.36f, 0.0f, false, false, 200.0f, 130.0f);
        pathBuilder.curveToRelative(-20.95f, 0.0f, -38.0f, 15.25f, -38.0f, 34.0f);
        pathBuilder.reflectiveCurveToRelative(17.05f, 34.0f, 38.0f, 34.0f);
        pathBuilder.arcToRelative(40.36f, 40.36f, 0.0f, false, false, 26.0f, -9.24f);
        pathBuilder.lineTo(226.0f, 192.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(238.0f, 132.0f);
        pathBuilder.curveTo(238.0f, 113.25f, 221.0f, 98.0f, 200.0f, 98.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 186.0f);
        pathBuilder.curveToRelative(-14.34f, 0.0f, -26.0f, -9.87f, -26.0f, -22.0f);
        pathBuilder.reflectiveCurveToRelative(11.66f, -22.0f, 26.0f, -22.0f);
        pathBuilder.reflectiveCurveToRelative(26.0f, 9.87f, 26.0f, 22.0f);
        pathBuilder.reflectiveCurveTo(214.34f, 186.0f, 200.0f, 186.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _textAa = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
