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

/* compiled from: Thermometerhot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThermometerHot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getThermometerHot", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_thermometerHot", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThermometerhotKt {
    private static ImageVector _thermometerHot;

    public static final ImageVector getThermometerHot(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(124.0f, 156.29f);
        pathBuilder.lineTo(124.0f, 48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 156.29f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 204.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 120.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 136.0f);
        pathBuilder.lineTo(156.0f, 48.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, true, false, 72.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 236.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, -29.71f, -94.68f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 92.0f, 138.0f);
        pathBuilder.lineTo(92.0f, 48.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f);
        pathBuilder.verticalLineToRelative(90.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.71f, 3.28f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 120.0f, 236.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.65f, 78.59f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -5.54f);
        pathBuilder.curveToRelative(13.24f, -8.63f, 23.07f, -4.43f, 31.75f, -0.73f);
        pathBuilder.curveToRelative(8.15f, 3.48f, 14.58f, 6.22f, 24.25f, -0.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.36f, 6.7f);
        pathBuilder.curveTo(236.43f, 82.7f, 231.32f, 84.0f, 226.67f, 84.0f);
        pathBuilder.curveToRelative(-6.06f, 0.0f, -11.33f, -2.25f, -16.24f, -4.34f);
        pathBuilder.curveToRelative(-8.15f, -3.47f, -14.58f, -6.22f, -24.25f, 0.07f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 180.65f, 78.59f);
        pathBuilder.close();
        pathBuilder.moveTo(243.35f, 105.41f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.17f, 5.54f);
        pathBuilder.curveToRelative(-5.75f, 3.75f, -10.86f, 5.07f, -15.51f, 5.07f);
        pathBuilder.curveToRelative(-6.06f, 0.0f, -11.33f, -2.25f, -16.24f, -4.34f);
        pathBuilder.curveToRelative(-8.15f, -3.47f, -14.58f, -6.22f, -24.25f, 0.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.36f, -6.7f);
        pathBuilder.curveToRelative(13.24f, -8.63f, 23.07f, -4.43f, 31.75f, -0.73f);
        pathBuilder.curveToRelative(8.15f, 3.48f, 14.58f, 6.22f, 24.25f, -0.07f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 243.35f, 105.41f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _thermometerHot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
