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

/* compiled from: Shower.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Shower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getShower", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shower", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShowerKt {
    private static ImageVector _shower;

    public static final ImageVector getShower(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _shower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Shower", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(62.0f, 236.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 62.0f, 236.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 194.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 84.0f, 194.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 194.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 20.0f, 194.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 162.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 52.0f, 162.0f);
        pathBuilder.close();
        pathBuilder.moveTo(254.0f, 40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(218.49f, 46.0f);
        pathBuilder.lineToRelative(-28.9f, 28.89f);
        pathBuilder.lineTo(167.83f, 202.32f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -23.71f, 7.57f);
        pathBuilder.lineToRelative(-98.0f, -98.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 7.6f, -23.71f);
        pathBuilder.lineToRelative(127.4f, -21.76f);
        pathBuilder.lineToRelative(30.65f, -30.65f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 216.0f, 34.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 254.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.66f, 79.34f);
        pathBuilder.lineTo(55.7f, 100.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.11f, 3.39f);
        pathBuilder.lineToRelative(98.0f, 98.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.39f, -1.09f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shower = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
