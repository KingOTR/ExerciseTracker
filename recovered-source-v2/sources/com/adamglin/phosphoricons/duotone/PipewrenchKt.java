package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pipewrench.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PipeWrench", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPipeWrench", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pipeWrench", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PipewrenchKt {
    private static ImageVector _pipeWrench;

    public static final ImageVector getPipeWrench(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _pipeWrench;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PipeWrench", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(173.66f, 145.66f);
        pathBuilder.lineTo(85.0f, 235.0f);
        pathBuilder.arcToRelative(17.0f, 17.0f, 0.0f, false, true, -24.0f, -24.0f);
        pathBuilder.lineToRelative(64.69f, -65.37f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f);
        pathBuilder.lineTo(77.0f, 85.0f);
        pathBuilder.arcToRelative(17.0f, 17.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(17.0f, 17.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.lineToRelative(72.69f, 73.37f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 173.66f, 145.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(220.28f, 55.0f);
        pathBuilder2.lineToRelative(-0.17f, -0.17f);
        pathBuilder2.lineToRelative(-44.9f, -42.28f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.5f, 0.08f);
        pathBuilder2.lineTo(108.17f, 56.87f);
        pathBuilder2.lineToRelative(-1.54f, -1.56f);
        pathBuilder2.arcTo(25.0f, 25.0f, 0.0f, false, false, 71.27f, 90.58f);
        pathBuilder2.lineToRelative(1.46f, 1.48f);
        pathBuilder2.lineTo(52.69f, 112.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f);
        pathBuilder2.lineToRelative(12.68f, 12.68f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.59f, 0.0f);
        pathBuilder2.lineToRelative(19.93f, -19.65f);
        pathBuilder2.lineTo(120.0f, 140.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.lineTo(55.31f, 205.37f);
        pathBuilder2.arcToRelative(25.0f, 25.0f, 0.0f, true, false, 35.34f, 35.29f);
        pathBuilder2.lineToRelative(88.67f, -89.35f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.6f);
        pathBuilder2.lineTo(143.63f, 92.66f);
        pathBuilder2.lineTo(156.56f, 80.0f);
        pathBuilder2.lineToRelative(0.1f, 0.09f);
        pathBuilder2.lineTo(194.0f, 115.4f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.53f, -0.09f);
        pathBuilder2.lineToRelative(3.71f, -3.71f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -56.57f);
        pathBuilder2.close();
        pathBuilder2.moveTo(76.69f, 136.0f);
        pathBuilder2.lineTo(64.0f, 123.33f);
        pathBuilder2.lineToRelative(20.0f, -19.88f);
        pathBuilder2.lineToRelative(12.69f, 12.86f);
        pathBuilder2.close();
        pathBuilder2.moveTo(79.31f, 229.37f);
        pathBuilder2.arcToRelative(9.0f, 9.0f, 0.0f, true, true, -12.65f, -12.71f);
        pathBuilder2.lineToRelative(64.67f, -65.37f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.57f);
        pathBuilder2.lineTo(82.63f, 79.31f);
        pathBuilder2.arcTo(9.0f, 9.0f, 0.0f, false, true, 95.29f, 66.6f);
        pathBuilder2.lineTo(168.0f, 140.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(209.0f, 100.28f);
        pathBuilder2.lineTo(205.25f, 104.0f);
        pathBuilder2.arcToRelative(1.21f, 1.21f, 0.0f, false, false, -0.16f, -0.16f);
        pathBuilder2.lineTo(167.69f, 68.5f);
        pathBuilder2.arcToRelative(16.05f, 16.05f, 0.0f, false, false, -22.39f, 0.12f);
        pathBuilder2.lineTo(132.37f, 81.29f);
        pathBuilder2.lineTo(119.43f, 68.23f);
        pathBuilder2.lineTo(164.0f, 24.0f);
        pathBuilder2.lineToRelative(0.17f, 0.16f);
        pathBuilder2.lineToRelative(44.88f, 42.26f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -0.08f, 33.86f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pipeWrench = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
