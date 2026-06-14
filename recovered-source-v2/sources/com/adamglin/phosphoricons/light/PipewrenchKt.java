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

/* compiled from: Pipewrench.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PipeWrench", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPipeWrench", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pipeWrench", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PipewrenchKt {
    private static ImageVector _pipeWrench;

    public static final ImageVector getPipeWrench(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(218.87f, 56.44f);
        pathBuilder.arcToRelative(1.59f, 1.59f, 0.0f, false, true, -0.13f, -0.13f);
        pathBuilder.lineTo(173.83f, 14.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.71f, 0.06f);
        pathBuilder.lineToRelative(-46.0f, 45.62f);
        pathBuilder.lineToRelative(-3.0f, -3.0f);
        pathBuilder.arcTo(23.0f, 23.0f, 0.0f, false, false, 72.7f, 89.18f);
        pathBuilder.lineToRelative(2.85f, 2.89f);
        pathBuilder.lineTo(54.1f, 113.41f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f);
        pathBuilder.lineTo(66.79f, 145.9f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.76f, 0.0f);
        pathBuilder.lineToRelative(21.35f, -21.05f);
        pathBuilder.lineToRelative(13.51f, 13.7f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.83f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(56.73f, 206.79f);
        pathBuilder.arcToRelative(23.0f, 23.0f, 0.0f, true, false, 32.5f, 32.47f);
        pathBuilder.lineTo(177.9f, 149.9f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.78f);
        pathBuilder.lineTo(140.79f, 92.64f);
        pathBuilder.lineToRelative(14.35f, -14.06f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.82f, 0.0f);
        pathBuilder.lineToRelative(0.07f, 0.07f);
        pathBuilder.lineTo(195.42f, 114.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.74f, -0.07f);
        pathBuilder.lineToRelative(3.71f, -3.72f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, -53.74f);
        pathBuilder.close();
        pathBuilder.moveTo(78.1f, 137.44f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f);
        pathBuilder.lineTo(62.58f, 124.73f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.58f, -1.42f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.57f, -1.4f);
        pathBuilder.lineTo(84.0f, 100.62f);
        pathBuilder.lineToRelative(15.5f, 15.72f);
        pathBuilder.close();
        pathBuilder.moveTo(169.4f, 141.44f);
        pathBuilder.lineTo(80.73f, 230.79f);
        pathBuilder.arcToRelative(11.0f, 11.0f, 0.0f, true, true, -15.49f, -15.54f);
        pathBuilder.lineToRelative(64.67f, -65.37f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.75f);
        pathBuilder.lineTo(81.21f, 80.73f);
        pathBuilder.arcToRelative(11.0f, 11.0f, 0.0f, false, true, 15.5f, -15.54f);
        pathBuilder.lineToRelative(72.7f, 73.39f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 169.4f, 141.43f);
        pathBuilder.close();
        pathBuilder.moveTo(210.4f, 101.71f);
        pathBuilder.lineTo(206.69f, 105.42f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f);
        pathBuilder.lineToRelative(-0.12f, -0.12f);
        pathBuilder.lineTo(166.31f, 70.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.61f, 0.1f);
        pathBuilder.lineTo(132.35f, 84.12f);
        pathBuilder.lineTo(116.6f, 68.22f);
        pathBuilder.lineToRelative(46.0f, -45.64f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.84f, 0.0f);
        pathBuilder.lineToRelative(0.12f, 0.13f);
        pathBuilder.lineTo(210.45f, 65.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -0.07f, 36.71f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pipeWrench = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
