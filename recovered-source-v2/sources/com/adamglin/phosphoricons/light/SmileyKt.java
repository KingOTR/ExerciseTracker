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

/* compiled from: Smiley.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Smiley", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSmiley", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_smiley", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmileyKt {
    private static ImageVector _smiley;

    public static final ImageVector getSmiley(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _smiley;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Smiley", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(173.19f, 155.0f);
        pathBuilder.curveToRelative(-9.92f, 17.16f, -26.39f, 27.0f, -45.19f, 27.0f);
        pathBuilder.reflectiveCurveToRelative(-35.27f, -9.84f, -45.19f, -27.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.38f, -6.0f);
        pathBuilder.curveToRelative(7.84f, 13.54f, 20.2f, 21.0f, 34.81f, 21.0f);
        pathBuilder.reflectiveCurveToRelative(27.0f, -7.46f, 34.81f, -21.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.38f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.0f, 128.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, true, 128.0f, 26.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, true, 230.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 128.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, true, false, -90.0f, 90.0f);
        pathBuilder.arcTo(90.1f, 90.1f, 0.0f, false, false, 218.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 118.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 92.0f, 118.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 98.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 164.0f, 98.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _smiley = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
