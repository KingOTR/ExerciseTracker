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

/* compiled from: Textaa.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TextAa", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getTextAa", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_textAa", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextaaKt {
    private static ImageVector _textAa;

    public static final ImageVector getTextAa(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(200.0f, 156.0f);
        pathBuilder.curveToRelative(0.0f, 6.5f, -7.33f, 12.0f, -16.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-16.0f, -5.5f, -16.0f, -12.0f);
        pathBuilder.reflectiveCurveToRelative(7.33f, -12.0f, 16.0f, -12.0f);
        pathBuilder.reflectiveCurveTo(200.0f, 149.5f, 200.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 56.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(143.37f, 172.88f);
        pathBuilder.lineToRelative(-44.0f, -104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.74f, 0.0f);
        pathBuilder.lineToRelative(-44.0f, 104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.74f, 6.24f);
        pathBuilder.lineTo(66.84f, 152.0f);
        pathBuilder.horizontalLineToRelative(50.32f);
        pathBuilder.lineToRelative(11.47f, 27.12f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.74f, -6.24f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 124.0f);
        pathBuilder.curveToRelative(0.0f, -15.44f, -14.36f, -28.0f, -32.0f, -28.0f);
        pathBuilder.arcToRelative(34.86f, 34.86f, 0.0f, false, false, -20.78f, 6.68f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.56f, 12.83f);
        pathBuilder.arcTo(18.84f, 18.84f, 0.0f, false, true, 184.0f, 112.0f);
        pathBuilder.curveToRelative(8.56f, 0.0f, 15.8f, 5.36f, 16.0f, 11.76f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcTo(35.24f, 35.24f, 0.0f, false, false, 184.0f, 128.0f);
        pathBuilder.curveToRelative(-17.64f, 0.0f, -32.0f, 12.56f, -32.0f, 28.0f);
        pathBuilder.reflectiveCurveToRelative(14.36f, 28.0f, 32.0f, 28.0f);
        pathBuilder.arcToRelative(35.13f, 35.13f, 0.0f, false, false, 16.93f, -4.26f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(73.61f, 136.0f);
        pathBuilder.horizontalLineToRelative(36.78f);
        pathBuilder.lineTo(92.0f, 92.53f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _textAa = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
