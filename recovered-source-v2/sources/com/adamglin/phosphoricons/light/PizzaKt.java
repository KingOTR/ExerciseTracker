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

/* compiled from: Pizza.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pizza", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPizza", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pizza", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PizzaKt {
    private static ImageVector _pizza;

    public static final ImageVector getPizza(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pizza;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pizza", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(237.6f, 63.47f);
        pathBuilder.arcToRelative(13.91f, 13.91f, 0.0f, false, false, -6.35f, -8.67f);
        pathBuilder.arcToRelative(199.48f, 199.48f, 0.0f, false, false, -206.5f, 0.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 20.05f, 74.0f);
        pathBuilder.lineToRelative(96.0f, 157.27f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(236.0f, 74.0f);
        pathBuilder.arcTo(13.81f, 13.81f, 0.0f, false, false, 237.6f, 63.47f);
        pathBuilder.close();
        pathBuilder.moveTo(61.07f, 118.2f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, true, true, 87.17f, 161.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.07f, 188.52f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.91f, -44.1f);
        pathBuilder.close();
        pathBuilder.moveTo(185.27f, 134.12f);
        pathBuilder.arcTo(37.65f, 37.65f, 0.0f, false, false, 168.0f, 130.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, -22.25f, 68.8f);
        pathBuilder.lineToRelative(-16.0f, 26.24f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.46f, 0.0f);
        pathBuilder.lineTo(93.59f, 171.49f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, true, false, 54.66f, 107.7f);
        pathBuilder.lineTo(46.05f, 93.59f);
        pathBuilder.arcToRelative(154.14f, 154.14f, 0.0f, false, true, 163.9f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(225.76f, 67.77f);
        pathBuilder.lineTo(216.2f, 83.35f);
        pathBuilder.arcToRelative(166.11f, 166.11f, 0.0f, false, false, -176.4f, 0.0f);
        pathBuilder.lineTo(30.29f, 67.77f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(1.88f, 1.88f, 0.0f, false, true, -0.23f, -1.47f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 31.0f, 65.06f);
        pathBuilder.arcToRelative(187.46f, 187.46f, 0.0f, false, true, 194.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.92f, 1.24f);
        pathBuilder.arcTo(1.88f, 1.88f, 0.0f, false, true, 225.71f, 67.77f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pizza = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
