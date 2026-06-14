package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rabbit.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Rabbit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getRabbit", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rabbit", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RabbitKt {
    private static ImageVector _rabbit;

    public static final ImageVector getRabbit(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(199.28f, 149.8f);
        pathBuilder.arcTo(71.58f, 71.58f, 0.0f, false, false, 193.0f, 129.0f);
        pathBuilder.curveToRelative(19.0f, -37.94f, 30.45f, -88.28f, 17.34f, -110.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 190.94f, 8.0f);
        pathBuilder.curveToRelative(-14.12f, 0.0f, -26.0f, 11.89f, -36.44f, 36.36f);
        pathBuilder.curveToRelative(-6.22f, 14.62f, -10.85f, 31.32f, -14.0f, 44.74f);
        pathBuilder.arcToRelative(71.8f, 71.8f, 0.0f, false, false, -25.0f, 0.0f);
        pathBuilder.curveToRelative(-3.13f, -13.42f, -7.76f, -30.12f, -14.0f, -44.74f);
        pathBuilder.curveTo(91.1f, 19.89f, 79.18f, 8.0f, 65.06f, 8.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 45.64f, 19.08f);
        pathBuilder.curveTo(32.53f, 40.76f, 44.0f, 91.1f, 63.0f, 129.0f);
        pathBuilder.arcToRelative(71.58f, 71.58f, 0.0f, false, false, -6.26f, 20.76f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, true, false, 128.0f, 225.52f);
        pathBuilder.lineToRelative(-21.12f, -19.37f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 10.24f, -12.3f);
        pathBuilder.lineTo(128.0f, 202.9f);
        pathBuilder.lineToRelative(10.88f, -9.05f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.24f, 12.3f);
        pathBuilder.lineTo(128.0f, 225.52f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, false, 71.28f, -75.72f);
        pathBuilder.close();
        pathBuilder.moveTo(73.28f, 113.27f);
        pathBuilder.arcTo(218.45f, 218.45f, 0.0f, false, true, 58.4f, 67.08f);
        pathBuilder.curveToRelative(-3.49f, -18.13f, -3.15f, -33.0f, 0.93f, -39.72f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 65.06f, 24.0f);
        pathBuilder.curveToRelative(6.61f, 0.0f, 14.52f, 9.7f, 21.72f, 26.62f);
        pathBuilder.curveToRelative(5.93f, 13.94f, 10.35f, 30.12f, 13.33f, 43.0f);
        pathBuilder.arcToRelative(71.72f, 71.72f, 0.0f, false, false, -26.88f, 19.64f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 176.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 176.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.55f, 106.83f);
        pathBuilder.arcToRelative(71.89f, 71.89f, 0.0f, false, false, -20.66f, -13.2f);
        pathBuilder.curveToRelative(3.0f, -12.89f, 7.4f, -29.07f, 13.33f, -43.0f);
        pathBuilder.curveTo(176.42f, 33.7f, 184.33f, 24.0f, 190.94f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.73f, 3.36f);
        pathBuilder.curveToRelative(4.08f, 6.74f, 4.42f, 21.59f, 0.93f, 39.72f);
        pathBuilder.arcToRelative(218.45f, 218.45f, 0.0f, false, true, -14.83f, 46.19f);
        pathBuilder.arcTo(72.6f, 72.6f, 0.0f, false, false, 176.55f, 106.83f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rabbit = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
