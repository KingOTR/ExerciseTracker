package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Textaa.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TextAa", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getTextAa", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_textAa", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextaaKt {
    private static ImageVector _textAa;

    public static final ImageVector getTextAa(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(87.24f, 52.59f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.48f, 0.0f);
        pathBuilder.lineToRelative(-64.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.48f, 6.81f);
        pathBuilder.lineTo(39.9f, 160.0f);
        pathBuilder.horizontalLineToRelative(80.2f);
        pathBuilder.lineToRelative(16.66f, 35.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.48f, -6.81f);
        pathBuilder.close();
        pathBuilder.moveTo(47.43f, 144.0f);
        pathBuilder.lineTo(80.0f, 74.79f);
        pathBuilder.lineTo(112.57f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 96.0f);
        pathBuilder.curveToRelative(-12.76f, 0.0f, -22.73f, 3.47f, -29.63f, 10.32f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.26f, 11.36f);
        pathBuilder.curveToRelative(3.8f, -3.77f, 10.0f, -5.68f, 18.37f, -5.68f);
        pathBuilder.curveToRelative(13.23f, 0.0f, 24.0f, 9.0f, 24.0f, 20.0f);
        pathBuilder.verticalLineToRelative(3.22f);
        pathBuilder.arcTo(42.76f, 42.76f, 0.0f, false, false, 200.0f, 128.0f);
        pathBuilder.curveToRelative(-22.06f, 0.0f, -40.0f, 16.15f, -40.0f, 36.0f);
        pathBuilder.reflectiveCurveToRelative(17.94f, 36.0f, 40.0f, 36.0f);
        pathBuilder.arcToRelative(42.73f, 42.73f, 0.0f, false, false, 24.0f, -7.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, -0.75f);
        pathBuilder.lineTo(240.0f, 132.0f);
        pathBuilder.curveTo(240.0f, 112.15f, 222.06f, 96.0f, 200.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 184.0f);
        pathBuilder.curveToRelative(-13.23f, 0.0f, -24.0f, -9.0f, -24.0f, -20.0f);
        pathBuilder.reflectiveCurveToRelative(10.77f, -20.0f, 24.0f, -20.0f);
        pathBuilder.reflectiveCurveToRelative(24.0f, 9.0f, 24.0f, 20.0f);
        pathBuilder.reflectiveCurveTo(213.23f, 184.0f, 200.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _textAa = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
