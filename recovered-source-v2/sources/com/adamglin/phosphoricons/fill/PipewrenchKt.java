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

/* compiled from: Pipewrench.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PipeWrench", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPipeWrench", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pipeWrench", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PipewrenchKt {
    private static ImageVector _pipeWrench;

    public static final ImageVector getPipeWrench(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(220.28f, 55.0f);
        pathBuilder.lineToRelative(-0.17f, -0.17f);
        pathBuilder.lineToRelative(-44.9f, -42.28f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.5f, 0.08f);
        pathBuilder.lineTo(108.17f, 56.87f);
        pathBuilder.lineToRelative(-1.54f, -1.56f);
        pathBuilder.arcTo(25.0f, 25.0f, 0.0f, false, false, 71.27f, 90.58f);
        pathBuilder.lineToRelative(1.46f, 1.48f);
        pathBuilder.lineTo(52.69f, 112.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f);
        pathBuilder.lineToRelative(12.68f, 12.68f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.59f, 0.0f);
        pathBuilder.lineToRelative(19.93f, -19.65f);
        pathBuilder.lineTo(120.0f, 140.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(55.31f, 205.37f);
        pathBuilder.arcToRelative(25.0f, 25.0f, 0.0f, true, false, 35.34f, 35.29f);
        pathBuilder.lineToRelative(88.67f, -89.35f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.6f);
        pathBuilder.lineTo(143.63f, 92.66f);
        pathBuilder.lineTo(156.56f, 80.0f);
        pathBuilder.lineToRelative(0.1f, 0.09f);
        pathBuilder.lineTo(194.0f, 115.4f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.53f, -0.09f);
        pathBuilder.lineToRelative(3.71f, -3.71f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -56.57f);
        pathBuilder.close();
        pathBuilder.moveTo(76.69f, 136.0f);
        pathBuilder.lineTo(64.0f, 123.33f);
        pathBuilder.lineToRelative(20.0f, -19.88f);
        pathBuilder.lineToRelative(12.69f, 12.86f);
        pathBuilder.close();
        pathBuilder.moveTo(209.0f, 100.28f);
        pathBuilder.lineTo(205.25f, 104.0f);
        pathBuilder.arcToRelative(1.21f, 1.21f, 0.0f, false, false, -0.16f, -0.16f);
        pathBuilder.lineTo(167.69f, 68.5f);
        pathBuilder.arcToRelative(16.05f, 16.05f, 0.0f, false, false, -22.39f, 0.12f);
        pathBuilder.lineTo(132.37f, 81.29f);
        pathBuilder.lineTo(119.43f, 68.23f);
        pathBuilder.lineTo(164.0f, 24.0f);
        pathBuilder.lineToRelative(0.17f, 0.16f);
        pathBuilder.lineToRelative(44.88f, 42.26f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -0.08f, 33.86f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pipeWrench = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
