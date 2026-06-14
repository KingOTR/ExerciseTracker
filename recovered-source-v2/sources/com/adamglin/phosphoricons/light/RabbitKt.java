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

/* compiled from: Rabbit.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Rabbit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getRabbit", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rabbit", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RabbitKt {
    private static ImageVector _rabbit;

    public static final ImageVector getRabbit(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _rabbit;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Rabbit", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(110.0f, 164.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 110.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 154.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 156.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(214.0f, 188.0f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, false, true, -86.0f, 34.7f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, true, true, -69.39f, -71.91f);
        pathBuilder.arcTo(70.0f, 70.0f, 0.0f, false, true, 65.23f, 129.0f);
        pathBuilder.arcToRelative(235.12f, 235.12f, 0.0f, false, true, -20.56f, -59.3f);
        pathBuilder.curveToRelative(-3.0f, -15.62f, -5.0f, -36.91f, 2.69f, -49.62f);
        pathBuilder.arcTo(19.84f, 19.84f, 0.0f, false, true, 65.07f, 10.0f);
        pathBuilder.curveTo(89.91f, 10.0f, 105.23f, 52.92f, 114.0f, 91.43f);
        pathBuilder.arcToRelative(69.44f, 69.44f, 0.0f, false, true, 28.0f, 0.0f);
        pathBuilder.curveTo(150.77f, 52.92f, 166.09f, 10.0f, 190.93f, 10.0f);
        pathBuilder.arcToRelative(19.84f, 19.84f, 0.0f, false, true, 17.71f, 10.11f);
        pathBuilder.curveToRelative(7.68f, 12.71f, 5.7f, 34.0f, 2.69f, 49.62f);
        pathBuilder.arcTo(235.12f, 235.12f, 0.0f, false, true, 190.77f, 129.0f);
        pathBuilder.arcToRelative(70.0f, 70.0f, 0.0f, false, true, 6.62f, 21.76f);
        pathBuilder.arcTo(49.79f, 49.79f, 0.0f, false, true, 214.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(153.56f, 94.83f);
        pathBuilder.arcToRelative(70.05f, 70.05f, 0.0f, false, true, 21.64f, 13.48f);
        pathBuilder.arcToRelative(71.17f, 71.17f, 0.0f, false, true, 8.05f, 8.72f);
        pathBuilder.curveTo(199.87f, 81.2f, 207.0f, 40.54f, 198.37f, 26.32f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 190.93f, 22.0f);
        pathBuilder.curveTo(178.1f, 22.0f, 163.61f, 50.4f, 153.56f, 94.83f);
        pathBuilder.close();
        pathBuilder.moveTo(72.75f, 117.0f);
        pathBuilder.arcToRelative(71.17f, 71.17f, 0.0f, false, true, 8.0f, -8.72f);
        pathBuilder.arcToRelative(70.05f, 70.05f, 0.0f, false, true, 21.64f, -13.48f);
        pathBuilder.curveTo(92.39f, 50.4f, 77.9f, 22.0f, 65.07f, 22.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.44f, 4.32f);
        pathBuilder.curveTo(49.0f, 40.54f, 56.13f, 81.2f, 72.75f, 117.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 188.0f);
        pathBuilder.arcToRelative(37.87f, 37.87f, 0.0f, false, false, -14.07f, -29.52f);
        pathBuilder.arcToRelative(6.05f, 6.05f, 0.0f, false, true, -2.2f, -4.09f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, false, false, -115.44f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.19f, 4.08f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, false, 51.5f, 55.64f);
        pathBuilder.lineToRelative(-11.42f, -9.5f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 7.67f, -9.22f);
        pathBuilder.lineTo(128.0f, 205.5f);
        pathBuilder.lineToRelative(12.16f, -10.11f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 7.67f, 9.22f);
        pathBuilder.lineToRelative(-11.42f, 9.5f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 202.0f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rabbit = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
