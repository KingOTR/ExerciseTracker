package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rabbit.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Rabbit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getRabbit", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rabbit", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RabbitKt {
    private static ImageVector _rabbit;

    public static final ImageVector getRabbit(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(112.0f, 164.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 152.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 188.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, -88.0f, 37.52f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, true, true, 56.72f, 149.8f);
        pathBuilder.arcTo(71.58f, 71.58f, 0.0f, false, true, 63.0f, 129.0f);
        pathBuilder.curveTo(44.0f, 91.1f, 32.53f, 40.76f, 45.64f, 19.08f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 65.06f, 8.0f);
        pathBuilder.curveToRelative(14.12f, 0.0f, 26.0f, 11.89f, 36.44f, 36.36f);
        pathBuilder.curveToRelative(6.22f, 14.62f, 10.85f, 31.32f, 14.0f, 44.74f);
        pathBuilder.arcToRelative(71.8f, 71.8f, 0.0f, false, true, 25.0f, 0.0f);
        pathBuilder.curveToRelative(3.13f, -13.42f, 7.76f, -30.12f, 14.0f, -44.74f);
        pathBuilder.curveTo(164.9f, 19.89f, 176.82f, 8.0f, 190.94f, 8.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, 19.42f, 11.08f);
        pathBuilder.curveTo(223.47f, 40.76f, 212.0f, 91.1f, 193.0f, 129.0f);
        pathBuilder.arcToRelative(71.58f, 71.58f, 0.0f, false, true, 6.26f, 20.76f);
        pathBuilder.arcTo(51.77f, 51.77f, 0.0f, false, true, 216.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(155.89f, 93.63f);
        pathBuilder.arcToRelative(71.72f, 71.72f, 0.0f, false, true, 26.88f, 19.64f);
        pathBuilder.arcTo(218.45f, 218.45f, 0.0f, false, false, 197.6f, 67.08f);
        pathBuilder.curveToRelative(3.49f, -18.13f, 3.15f, -33.0f, -0.93f, -39.72f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 190.94f, 24.0f);
        pathBuilder.curveToRelative(-6.61f, 0.0f, -14.52f, 9.7f, -21.72f, 26.62f);
        pathBuilder.curveTo(163.29f, 64.56f, 158.87f, 80.74f, 155.89f, 93.63f);
        pathBuilder.close();
        pathBuilder.moveTo(73.23f, 113.27f);
        pathBuilder.arcToRelative(71.72f, 71.72f, 0.0f, false, true, 26.88f, -19.64f);
        pathBuilder.curveToRelative(-3.0f, -12.89f, -7.4f, -29.07f, -13.33f, -43.0f);
        pathBuilder.curveTo(79.58f, 33.7f, 71.67f, 24.0f, 65.06f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.73f, 3.36f);
        pathBuilder.curveTo(55.25f, 34.1f, 54.91f, 49.0f, 58.4f, 67.08f);
        pathBuilder.arcTo(218.45f, 218.45f, 0.0f, false, false, 73.23f, 113.27f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 188.0f);
        pathBuilder.arcToRelative(35.87f, 35.87f, 0.0f, false, false, -13.34f, -28.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.92f, -5.45f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, -111.48f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 69.34f, 160.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, 47.28f, 54.21f);
        pathBuilder.lineToRelative(-9.74f, -8.09f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 10.24f, -12.3f);
        pathBuilder.lineTo(128.0f, 202.9f);
        pathBuilder.lineToRelative(10.88f, -9.05f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.24f, 12.3f);
        pathBuilder.lineToRelative(-9.74f, 8.09f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 200.0f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rabbit = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
