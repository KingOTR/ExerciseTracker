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

/* compiled from: Thermometerhot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThermometerHot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getThermometerHot", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_thermometerHot", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThermometerhotKt {
    private static ImageVector _thermometerHot;

    public static final ImageVector getThermometerHot(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(126.0f, 154.6f);
        pathBuilder.lineTo(126.0f, 48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(114.0f, 154.6f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 202.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 120.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.0f, 135.0f);
        pathBuilder.lineTo(158.0f, 48.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f);
        pathBuilder.verticalLineToRelative(87.0f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, true, false, 76.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 234.0f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, false, true, -28.57f, -91.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 94.0f, 138.0f);
        pathBuilder.lineTo(94.0f, 48.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f);
        pathBuilder.verticalLineToRelative(90.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.57f, 4.92f);
        pathBuilder.arcTo(50.0f, 50.0f, 0.0f, false, true, 120.0f, 234.0f);
        pathBuilder.close();
        pathBuilder.moveTo(179.0f, 79.68f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.75f, -8.3f);
        pathBuilder.curveToRelative(14.14f, -9.21f, 24.95f, -4.61f, 33.63f, -0.9f);
        pathBuilder.curveToRelative(7.9f, 3.37f, 13.6f, 5.8f, 22.37f, 0.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.55f, 10.05f);
        pathBuilder.curveToRelative(-6.12f, 4.0f, -11.62f, 5.39f, -16.59f, 5.39f);
        pathBuilder.curveToRelative(-6.51f, 0.0f, -12.11f, -2.39f, -17.0f, -4.49f);
        pathBuilder.curveToRelative(-7.89f, -3.37f, -13.59f, -5.8f, -22.37f, -0.09f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 179.0f, 79.68f);
        pathBuilder.close();
        pathBuilder.moveTo(245.0f, 104.32f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.76f, 8.3f);
        pathBuilder.curveToRelative(-6.12f, 4.0f, -11.62f, 5.39f, -16.59f, 5.39f);
        pathBuilder.curveToRelative(-6.51f, 0.0f, -12.11f, -2.39f, -17.0f, -4.49f);
        pathBuilder.curveToRelative(-7.89f, -3.37f, -13.59f, -5.8f, -22.37f, -0.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.55f, -10.05f);
        pathBuilder.curveToRelative(14.14f, -9.21f, 24.95f, -4.6f, 33.63f, -0.9f);
        pathBuilder.curveToRelative(7.9f, 3.37f, 13.6f, 5.8f, 22.37f, 0.09f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 245.0f, 104.32f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _thermometerHot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
