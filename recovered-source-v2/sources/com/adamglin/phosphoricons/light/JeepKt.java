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

/* compiled from: Jeep.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Jeep", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getJeep", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_jeep", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JeepKt {
    private static ImageVector _jeep;

    public static final ImageVector getJeep(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _jeep;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Jeep", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 90.0f);
        pathBuilder.lineTo(228.85f, 90.0f);
        pathBuilder.lineToRelative(-9.63f, -44.93f);
        pathBuilder.arcTo(14.06f, 14.06f, 0.0f, false, false, 205.53f, 34.0f);
        pathBuilder.lineTo(50.47f, 34.0f);
        pathBuilder.arcTo(14.06f, 14.06f, 0.0f, false, false, 36.78f, 45.07f);
        pathBuilder.lineTo(27.15f, 90.0f);
        pathBuilder.lineTo(16.0f, 90.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(26.0f, 102.0f);
        pathBuilder.verticalLineToRelative(98.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(64.0f, 214.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(78.0f, 174.0f);
        pathBuilder.lineTo(178.0f, 174.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(230.0f, 102.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.51f, 47.58f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -1.58f);
        pathBuilder.lineTo(205.53f, 46.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.58f);
        pathBuilder.lineTo(216.58f, 90.0f);
        pathBuilder.lineTo(39.42f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(66.0f, 200.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(40.0f, 202.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(38.0f, 174.0f);
        pathBuilder.lineTo(66.0f, 174.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 202.0f);
        pathBuilder.lineTo(192.0f, 202.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(190.0f, 174.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 162.0f);
        pathBuilder.lineTo(150.0f, 162.0f);
        pathBuilder.lineTo(150.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.lineTo(118.0f, 162.0f);
        pathBuilder.lineTo(118.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.lineTo(38.0f, 162.0f);
        pathBuilder.lineTo(38.0f, 102.0f);
        pathBuilder.lineTo(218.0f, 102.0f);
        pathBuilder.close();
        pathBuilder.moveTo(58.0f, 132.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 58.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.0f, 132.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 178.0f, 132.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _jeep = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
