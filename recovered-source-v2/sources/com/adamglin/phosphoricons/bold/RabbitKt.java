package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rabbit.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Rabbit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getRabbit", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rabbit", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RabbitKt {
    private static ImageVector _rabbit;

    public static final ImageVector getRabbit(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(120.0f, 160.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 144.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 152.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 188.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, -92.0f, 42.89f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, -75.0f, -83.0f);
        pathBuilder.arcToRelative(75.47f, 75.47f, 0.0f, false, true, 5.59f, -18.74f);
        pathBuilder.arcToRelative(241.48f, 241.48f, 0.0f, false, true, -19.8f, -58.23f);
        pathBuilder.curveTo(35.55f, 54.21f, 33.54f, 31.35f, 42.21f, 17.0f);
        pathBuilder.arcTo(25.89f, 25.89f, 0.0f, false, true, 65.06f, 4.0f);
        pathBuilder.curveToRelative(22.63f, 0.0f, 40.6f, 27.11f, 53.48f, 80.6f);
        pathBuilder.arcToRelative(74.88f, 74.88f, 0.0f, false, true, 18.92f, 0.0f);
        pathBuilder.curveTo(150.34f, 31.11f, 168.31f, 4.0f, 190.94f, 4.0f);
        pathBuilder.arcToRelative(25.89f, 25.89f, 0.0f, false, true, 22.85f, 13.0f);
        pathBuilder.curveToRelative(8.67f, 14.34f, 6.66f, 37.2f, 3.45f, 53.86f);
        pathBuilder.arcToRelative(241.48f, 241.48f, 0.0f, false, true, -19.8f, 58.23f);
        pathBuilder.arcTo(75.6f, 75.6f, 0.0f, false, true, 203.0f, 147.84f);
        pathBuilder.arcTo(55.76f, 55.76f, 0.0f, false, true, 220.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.53f, 91.32f);
        pathBuilder.arcToRelative(75.84f, 75.84f, 0.0f, false, true, 18.72f, 12.56f);
        pathBuilder.curveToRelative(0.78f, 0.71f, 1.53f, 1.43f, 2.28f, 2.17f);
        pathBuilder.arcToRelative(211.0f, 211.0f, 0.0f, false, false, 12.14f, -39.73f);
        pathBuilder.curveToRelative(3.9f, -20.23f, 2.34f, -32.33f, -0.42f, -36.9f);
        pathBuilder.curveTo(192.43f, 28.07f, 192.0f, 28.0f, 190.94f, 28.0f);
        pathBuilder.curveTo(184.77f, 28.0f, 171.51f, 45.4f, 160.53f, 91.32f);
        pathBuilder.close();
        pathBuilder.moveTo(74.47f, 106.05f);
        pathBuilder.curveToRelative(0.74f, -0.73f, 1.5f, -1.46f, 2.28f, -2.17f);
        pathBuilder.arcTo(75.84f, 75.84f, 0.0f, false, true, 95.47f, 91.32f);
        pathBuilder.curveTo(84.49f, 45.4f, 71.23f, 28.0f, 65.06f, 28.0f);
        pathBuilder.curveToRelative(-1.08f, 0.0f, -1.49f, 0.07f, -2.31f, 1.42f);
        pathBuilder.curveTo(56.54f, 39.7f, 60.73f, 72.84f, 74.47f, 106.05f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 188.0f);
        pathBuilder.arcToRelative(31.9f, 31.9f, 0.0f, false, false, -11.86f, -24.87f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.38f, -8.17f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, -103.52f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.38f, 8.17f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 38.47f, 51.08f);
        pathBuilder.lineToRelative(-6.0f, -5.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.34f, -18.46f);
        pathBuilder.lineTo(128.0f, 197.7f);
        pathBuilder.lineToRelative(8.33f, -6.93f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 15.34f, 18.46f);
        pathBuilder.lineToRelative(-6.0f, 5.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 196.0f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rabbit = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
