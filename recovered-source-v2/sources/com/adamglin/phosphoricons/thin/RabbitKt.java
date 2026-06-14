package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rabbit.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Rabbit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getRabbit", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rabbit", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RabbitKt {
    private static ImageVector _rabbit;

    public static final ImageVector getRabbit(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(108.0f, 164.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 108.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 156.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 156.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 188.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, -84.0f, 31.75f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, true, -67.51f, -68.0f);
        pathBuilder.arcToRelative(67.64f, 67.64f, 0.0f, false, true, 7.0f, -22.78f);
        pathBuilder.curveTo(48.85f, 92.61f, 36.63f, 41.7f, 49.06f, 21.15f);
        pathBuilder.arcToRelative(17.92f, 17.92f, 0.0f, false, true, 16.0f, -9.15f);
        pathBuilder.curveToRelative(12.17f, 0.0f, 23.19f, 11.41f, 32.76f, 33.92f);
        pathBuilder.curveTo(104.53f, 61.7f, 109.37f, 80.0f, 112.45f, 93.79f);
        pathBuilder.arcToRelative(68.44f, 68.44f, 0.0f, false, true, 31.1f, 0.0f);
        pathBuilder.curveToRelative(3.08f, -13.8f, 7.92f, -32.09f, 14.63f, -47.87f);
        pathBuilder.curveTo(167.75f, 23.41f, 178.77f, 12.0f, 190.94f, 12.0f);
        pathBuilder.arcToRelative(17.92f, 17.92f, 0.0f, false, true, 16.0f, 9.15f);
        pathBuilder.curveToRelative(12.43f, 20.55f, 0.21f, 71.46f, -18.4f, 107.86f);
        pathBuilder.arcToRelative(67.64f, 67.64f, 0.0f, false, true, 7.0f, 22.78f);
        pathBuilder.arcTo(47.81f, 47.81f, 0.0f, false, true, 212.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(151.23f, 96.1f);
        pathBuilder.arcToRelative(67.9f, 67.9f, 0.0f, false, true, 22.63f, 13.69f);
        pathBuilder.arcToRelative(69.0f, 69.0f, 0.0f, false, true, 9.78f, 11.11f);
        pathBuilder.curveToRelative(17.88f, -37.07f, 25.59f, -80.5f, 16.45f, -95.61f);
        pathBuilder.arcTo(9.91f, 9.91f, 0.0f, false, false, 190.94f, 20.0f);
        pathBuilder.curveTo(176.54f, 20.0f, 161.78f, 48.37f, 151.23f, 96.1f);
        pathBuilder.close();
        pathBuilder.moveTo(72.36f, 120.9f);
        pathBuilder.arcToRelative(69.0f, 69.0f, 0.0f, false, true, 9.78f, -11.11f);
        pathBuilder.arcTo(67.9f, 67.9f, 0.0f, false, true, 104.77f, 96.1f);
        pathBuilder.curveTo(94.22f, 48.37f, 79.46f, 20.0f, 65.06f, 20.0f);
        pathBuilder.arcToRelative(9.91f, 9.91f, 0.0f, false, false, -9.15f, 5.29f);
        pathBuilder.curveTo(46.77f, 40.4f, 54.48f, 83.83f, 72.36f, 120.9f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 188.0f);
        pathBuilder.arcToRelative(39.86f, 39.86f, 0.0f, false, false, -14.82f, -31.08f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.46f, -2.72f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, -119.44f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.46f, 2.72f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 55.64f, 57.0f);
        pathBuilder.lineToRelative(-13.0f, -10.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.12f, -6.16f);
        pathBuilder.lineTo(128.0f, 208.1f);
        pathBuilder.lineToRelative(13.44f, -11.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.12f, 6.16f);
        pathBuilder.lineToRelative(-13.0f, 10.82f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 204.0f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rabbit = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
