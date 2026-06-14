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

/* compiled from: Pipewrench.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PipeWrench", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPipeWrench", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pipeWrench", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PipewrenchKt {
    private static ImageVector _pipeWrench;

    public static final ImageVector getPipeWrench(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(217.46f, 57.85f);
        pathBuilder.lineToRelative(-0.09f, -0.08f);
        pathBuilder.lineTo(172.44f, 15.46f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.91f, 0.0f);
        pathBuilder.lineToRelative(-47.38f, 47.0f);
        pathBuilder.lineToRelative(-4.35f, -4.39f);
        pathBuilder.arcTo(21.0f, 21.0f, 0.0f, false, false, 74.12f, 87.78f);
        pathBuilder.lineToRelative(4.25f, 4.31f);
        pathBuilder.lineTo(55.51f, 114.83f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f);
        pathBuilder.lineTo(68.2f, 144.48f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f);
        pathBuilder.lineToRelative(22.77f, -22.45f);
        pathBuilder.lineToRelative(14.91f, 15.12f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(58.14f, 208.2f);
        pathBuilder.arcToRelative(21.0f, 21.0f, 0.0f, true, false, 29.67f, 29.65f);
        pathBuilder.lineToRelative(88.68f, -89.37f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -16.95f);
        pathBuilder.lineTo(138.0f, 92.62f);
        pathBuilder.lineToRelative(15.77f, -15.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.68f, 0.0f);
        pathBuilder.lineToRelative(37.4f, 35.35f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.93f, 0.0f);
        pathBuilder.lineToRelative(3.72f, -3.71f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -50.92f);
        pathBuilder.close();
        pathBuilder.moveTo(79.51f, 138.85f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.65f, 0.0f);
        pathBuilder.lineTo(61.17f, 126.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.65f);
        pathBuilder.lineTo(84.0f, 97.78f);
        pathBuilder.lineToRelative(18.32f, 18.58f);
        pathBuilder.close();
        pathBuilder.moveTo(170.82f, 142.85f);
        pathBuilder.lineTo(82.14f, 232.2f);
        pathBuilder.arcToRelative(13.0f, 13.0f, 0.0f, true, true, -18.33f, -18.36f);
        pathBuilder.lineToRelative(64.69f, -65.37f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -16.94f);
        pathBuilder.lineTo(79.8f, 82.14f);
        pathBuilder.arcTo(13.0f, 13.0f, 0.0f, false, true, 98.13f, 63.78f);
        pathBuilder.lineToRelative(72.7f, 73.39f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 170.82f, 142.84f);
        pathBuilder.close();
        pathBuilder.moveTo(211.82f, 103.12f);
        pathBuilder.lineTo(208.1f, 106.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.65f, 0.0f);
        pathBuilder.lineToRelative(-0.09f, -0.08f);
        pathBuilder.lineTo(165.0f, 71.42f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.85f, 0.06f);
        pathBuilder.lineTo(132.33f, 86.94f);
        pathBuilder.lineTo(113.78f, 68.21f);
        pathBuilder.lineToRelative(47.39f, -47.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.lineToRelative(0.09f, 0.08f);
        pathBuilder.lineToRelative(44.92f, 42.3f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 39.56f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pipeWrench = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
