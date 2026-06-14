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

/* compiled from: Thermometerhot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThermometerHot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getThermometerHot", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_thermometerHot", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThermometerhotKt {
    private static ImageVector _thermometerHot;

    public static final ImageVector getThermometerHot(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _thermometerHot;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ThermometerHot", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 146.08f);
        pathBuilder.lineTo(152.0f, 40.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f);
        pathBuilder.lineTo(88.0f, 146.08f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, true, false, 64.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 56.0f);
        pathBuilder.lineTo(104.0f, 56.0f);
        pathBuilder.lineTo(104.0f, 40.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.3f, 80.77f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.33f, -11.07f);
        pathBuilder.curveToRelative(15.0f, -9.79f, 26.87f, -4.75f, 35.51f, -1.06f);
        pathBuilder.curveTo(223.0f, 72.0f, 227.76f, 74.0f, 235.63f, 68.89f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.74f, 13.41f);
        pathBuilder.curveTo(237.88f, 86.53f, 232.0f, 88.0f, 226.69f, 88.0f);
        pathBuilder.curveToRelative(-7.0f, 0.0f, -12.92f, -2.54f, -17.83f, -4.63f);
        pathBuilder.curveTo(201.0f, 80.0f, 196.24f, 78.0f, 188.37f, 83.11f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 177.3f, 80.77f);
        pathBuilder.close();
        pathBuilder.moveTo(246.7f, 103.23f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.33f, 11.07f);
        pathBuilder.curveTo(237.88f, 118.53f, 232.0f, 120.0f, 226.69f, 120.0f);
        pathBuilder.curveToRelative(-7.0f, 0.0f, -12.92f, -2.54f, -17.83f, -4.63f);
        pathBuilder.curveToRelative(-7.87f, -3.36f, -12.62f, -5.38f, -20.49f, -0.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.74f, -13.41f);
        pathBuilder.curveToRelative(15.0f, -9.79f, 26.87f, -4.75f, 35.51f, -1.06f);
        pathBuilder.curveToRelative(7.87f, 3.36f, 12.62f, 5.39f, 20.49f, 0.25f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 246.7f, 103.23f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _thermometerHot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
