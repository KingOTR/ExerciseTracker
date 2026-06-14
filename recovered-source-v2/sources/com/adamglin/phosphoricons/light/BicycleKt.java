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

/* compiled from: Bicycle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bicycle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBicycle", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bicycle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BicycleKt {
    private static ImageVector _bicycle;

    public static final ImageVector getBicycle(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bicycle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bicycle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 114.0f);
        pathBuilder.arcToRelative(45.88f, 45.88f, 0.0f, false, false, -17.8f, 3.58f);
        pathBuilder.lineTo(162.45f, 70.0f);
        pathBuilder.lineTo(192.0f, 70.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f);
        pathBuilder.lineTo(152.0f, 58.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.18f, 9.0f);
        pathBuilder.lineToRelative(13.4f, 23.0f);
        pathBuilder.lineTo(98.11f, 90.0f);
        pathBuilder.lineTo(81.18f, 61.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 76.0f, 58.0f);
        pathBuilder.lineTo(48.0f, 58.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(72.55f, 70.0f);
        pathBuilder.lineToRelative(15.0f, 25.64f);
        pathBuilder.lineTo(70.0f, 119.62f);
        pathBuilder.arcToRelative(46.22f, 46.22f, 0.0f, true, false, 9.68f, 7.09f);
        pathBuilder.lineTo(94.11f, 107.0f);
        pathBuilder.lineTo(126.82f, 163.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.19f, 3.0f);
        pathBuilder.arcToRelative(5.91f, 5.91f, 0.0f, false, false, 3.0f, -0.82f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.16f, -8.2f);
        pathBuilder.lineToRelative(-32.07f, -55.0f);
        pathBuilder.horizontalLineToRelative(62.11f);
        pathBuilder.lineToRelative(12.63f, 21.66f);
        pathBuilder.arcTo(46.0f, 46.0f, 0.0f, true, false, 208.0f, 114.0f);
        pathBuilder.close();
        pathBuilder.moveTo(82.0f, 160.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, -19.13f, -30.57f);
        pathBuilder.lineToRelative(-19.72f, 27.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.7f, 7.08f);
        pathBuilder.lineToRelative(19.7f, -27.0f);
        pathBuilder.arcTo(33.88f, 33.88f, 0.0f, false, true, 82.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 194.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, true, -22.0f, -59.86f);
        pathBuilder.lineTo(202.82f, 163.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.19f, 3.0f);
        pathBuilder.arcToRelative(5.91f, 5.91f, 0.0f, false, false, 3.0f, -0.82f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.16f, -8.2f);
        pathBuilder.lineToRelative(-16.86f, -28.91f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, true, true, 208.0f, 194.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bicycle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
