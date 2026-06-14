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

/* compiled from: Nytimeslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NyTimesLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getNyTimesLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_nyTimesLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NytimeslogoKt {
    private static ImageVector _nyTimesLogo;

    public static final ImageVector getNyTimesLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _nyTimesLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NyTimesLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.0f, 136.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.62f, 103.25f);
        pathBuilder.lineTo(118.91f, 72.59f);
        pathBuilder.arcTo(71.95f, 71.95f, 0.0f, false, false, 56.06f, 141.3f);
        pathBuilder.lineToRelative(68.18f, -36.36f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 112.0f);
        pathBuilder.lineTo(136.0f, 215.55f);
        pathBuilder.arcToRelative(71.64f, 71.64f, 0.0f, false, false, 60.71f, -50.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 212.0f, 170.4f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, true, true, 51.74f, 100.1f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 68.0f, 32.0f);
        pathBuilder.arcToRelative(8.05f, 8.05f, 0.0f, false, true, 3.38f, 0.75f);
        pathBuilder.lineTo(189.63f, 87.93f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 188.0f, 48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f);
        pathBuilder.arcTo(8.05f, 8.05f, 0.0f, false, true, 184.62f, 103.25f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 208.47f);
        pathBuilder.lineTo(96.0f, 138.13f);
        pathBuilder.lineTo(57.51f, 158.66f);
        pathBuilder.arcTo(72.23f, 72.23f, 0.0f, false, false, 96.0f, 208.47f);
        pathBuilder.close();
        pathBuilder.moveTo(96.13f, 62.0f);
        pathBuilder.lineTo(66.37f, 48.07f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -5.2f, 38.71f);
        pathBuilder.curveToRelative(0.6f, -0.71f, 1.2f, -1.42f, 1.84f, -2.11f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 96.13f, 62.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _nyTimesLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
