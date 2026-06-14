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

/* compiled from: Hairdryer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HairDryer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHairDryer", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hairDryer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HairdryerKt {
    private static ImageVector _hairDryer;

    public static final ImageVector getHairDryer(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _hairDryer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HairDryer", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(198.0f, 88.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, 30.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 198.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 106.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 168.0f, 106.0f);
        pathBuilder.close();
        pathBuilder.moveTo(162.85f, 214.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.74f, -8.21f);
        pathBuilder.lineToRelative(31.8f, -69.94f);
        pathBuilder.arcTo(62.0f, 62.0f, 0.0f, false, false, 168.0f, 26.0f);
        pathBuilder.arcToRelative(6.61f, 6.61f, 0.0f, false, false, -1.0f, 0.08f);
        pathBuilder.lineTo(29.7f, 49.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 62.78f);
        pathBuilder.verticalLineToRelative(50.44f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 29.7f, 127.0f);
        pathBuilder.lineTo(130.0f, 143.75f);
        pathBuilder.lineTo(130.0f, 200.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(184.0f, 242.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(30.0f, 113.22f);
        pathBuilder.lineTo(30.0f, 62.78f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.67f, -2.0f);
        pathBuilder.lineTo(168.48f, 38.0f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, false, true, 0.0f, 100.0f);
        pathBuilder.lineTo(31.67f, 115.2f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 113.22f);
        pathBuilder.close();
        pathBuilder.moveTo(142.0f, 200.0f);
        pathBuilder.lineTo(142.0f, 145.75f);
        pathBuilder.lineToRelative(25.0f, 4.17f);
        pathBuilder.arcToRelative(6.61f, 6.61f, 0.0f, false, false, 1.0f, 0.08f);
        pathBuilder.arcToRelative(61.75f, 61.75f, 0.0f, false, false, 21.53f, -3.86f);
        pathBuilder.lineToRelative(-24.86f, 54.69f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.82f, 1.17f);
        pathBuilder.lineTo(144.0f, 202.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 142.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hairDryer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
