package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Textaa.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TextAa", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTextAa", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_textAa", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextaaKt {
    private static ImageVector _textAa;

    public static final ImageVector getTextAa(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(90.86f, 50.89f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.72f, 0.0f);
        pathBuilder.lineToRelative(-64.0f, 136.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 21.71f, 10.22f);
        pathBuilder.lineTo(42.44f, 164.0f);
        pathBuilder.horizontalLineToRelative(75.12f);
        pathBuilder.lineToRelative(15.58f, 33.11f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 21.72f, -10.22f);
        pathBuilder.close();
        pathBuilder.moveTo(53.74f, 140.0f);
        pathBuilder.lineTo(80.0f, 84.18f);
        pathBuilder.lineTo(106.27f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 84.0f);
        pathBuilder.curveToRelative(-13.85f, 0.0f, -24.77f, 3.86f, -32.45f, 11.48f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 16.9f, 17.0f);
        pathBuilder.curveToRelative(3.0f, -3.0f, 8.26f, -4.52f, 15.55f, -4.52f);
        pathBuilder.curveToRelative(11.0f, 0.0f, 20.0f, 7.18f, 20.0f, 16.0f);
        pathBuilder.verticalLineToRelative(4.39f);
        pathBuilder.arcTo(47.28f, 47.28f, 0.0f, false, false, 200.0f, 124.0f);
        pathBuilder.curveToRelative(-24.26f, 0.0f, -44.0f, 17.94f, -44.0f, 40.0f);
        pathBuilder.reflectiveCurveToRelative(19.74f, 40.0f, 44.0f, 40.0f);
        pathBuilder.arcToRelative(47.18f, 47.18f, 0.0f, false, false, 22.0f, -5.38f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 192.0f);
        pathBuilder.lineTo(244.0f, 124.0f);
        pathBuilder.curveTo(244.0f, 101.94f, 224.26f, 84.0f, 200.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 180.0f);
        pathBuilder.curveToRelative(-11.0f, 0.0f, -20.0f, -7.18f, -20.0f, -16.0f);
        pathBuilder.reflectiveCurveToRelative(9.0f, -16.0f, 20.0f, -16.0f);
        pathBuilder.reflectiveCurveToRelative(20.0f, 7.18f, 20.0f, 16.0f);
        pathBuilder.reflectiveCurveTo(211.0f, 180.0f, 200.0f, 180.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _textAa = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
