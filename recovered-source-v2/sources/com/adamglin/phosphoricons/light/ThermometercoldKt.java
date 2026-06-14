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

/* compiled from: Thermometercold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThermometerCold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getThermometerCold", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_thermometerCold", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThermometercoldKt {
    private static ImageVector _thermometerCold;

    public static final ImageVector getThermometerCold(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _thermometerCold;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ThermometerCold", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.29f, 75.82f);
        pathBuilder.lineToRelative(-22.58f, 7.33f);
        pathBuilder.lineToRelative(13.95f, 19.21f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.7f, 7.06f);
        pathBuilder.lineTo(216.0f, 90.21f);
        pathBuilder.lineToRelative(-14.0f, 19.21f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.7f, -7.06f);
        pathBuilder.lineToRelative(13.95f, -19.21f);
        pathBuilder.lineToRelative(-22.58f, -7.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 3.71f, -11.41f);
        pathBuilder.lineTo(210.0f, 71.74f);
        pathBuilder.lineTo(210.0f, 48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.lineTo(222.0f, 71.74f);
        pathBuilder.lineToRelative(22.58f, -7.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.71f, 11.41f);
        pathBuilder.close();
        pathBuilder.moveTo(150.0f, 184.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, true, -36.0f, -29.4f);
        pathBuilder.lineTo(114.0f, 120.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(34.6f);
        pathBuilder.arcTo(30.05f, 30.05f, 0.0f, false, true, 150.0f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.0f, 184.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, false, -18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, false, 138.0f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(182.0f, 184.0f);
        pathBuilder.arcTo(62.0f, 62.0f, 0.0f, true, true, 82.0f, 135.0f);
        pathBuilder.lineTo(82.0f, 48.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, 76.0f, 0.0f);
        pathBuilder.verticalLineToRelative(87.0f);
        pathBuilder.arcTo(62.06f, 62.06f, 0.0f, false, true, 182.0f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(170.0f, 184.0f);
        pathBuilder.arcToRelative(50.07f, 50.07f, 0.0f, false, false, -21.43f, -41.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 146.0f, 138.0f);
        pathBuilder.lineTo(146.0f, 48.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, -52.0f, 0.0f);
        pathBuilder.verticalLineToRelative(90.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 91.43f, 143.0f);
        pathBuilder.arcTo(50.0f, 50.0f, 0.0f, true, false, 170.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _thermometerCold = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
