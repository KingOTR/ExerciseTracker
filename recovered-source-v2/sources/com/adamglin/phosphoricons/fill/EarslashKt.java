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

/* compiled from: Earslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EarSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getEarSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_earSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EarslashKt {
    private static ImageVector _earSlash;

    public static final ImageVector getEarSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _earSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EarSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(213.92f, 210.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f);
        pathBuilder.lineTo(191.8f, 210.07f);
        pathBuilder.arcToRelative(103.18f, 103.18f, 0.0f, false, false, 11.83f, -10.77f);
        pathBuilder.close();
        pathBuilder.moveTo(64.2f, 45.93f);
        pathBuilder.lineTo(53.92f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder.lineTo(52.37f, 56.7f);
        pathBuilder.arcTo(103.18f, 103.18f, 0.0f, false, true, 64.2f, 45.93f);
        pathBuilder.close();
        pathBuilder.moveTo(203.63f, 199.3f);
        pathBuilder.lineTo(64.2f, 45.93f);
        pathBuilder.arcTo(103.94f, 103.94f, 0.0f, false, true, 203.63f, 199.3f);
        pathBuilder.close();
        pathBuilder.moveTo(159.0f, 104.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -20.08f, -22.09f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.45f, 15.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 10.0f, 11.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.74f, 6.0f);
        pathBuilder.arcToRelative(7.68f, 7.68f, 0.0f, false, false, 2.0f, -0.26f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 159.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 112.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, -85.89f, -60.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.47f, 15.0f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, true, 176.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 168.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.arcToRelative(24.11f, 24.11f, 0.0f, false, true, 1.0f, -7.0f);
        pathBuilder.lineToRelative(-20.45f, -22.5f);
        pathBuilder.arcTo(7.91f, 7.91f, 0.0f, false, true, 104.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.68f, -6.56f);
        pathBuilder.lineTo(84.39f, 91.92f);
        pathBuilder.arcTo(47.59f, 47.59f, 0.0f, false, false, 80.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 11.9f, 6.71f, 20.5f, 13.82f, 29.6f);
        pathBuilder.curveToRelative(7.0f, 8.92f, 14.18f, 18.15f, 14.18f, 30.4f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.0f, 14.29f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.19f, 11.42f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 172.0f);
        pathBuilder.curveToRelative(0.0f, -6.74f, -5.0f, -13.14f, -10.79f, -20.55f);
        pathBuilder.curveTo(73.54f, 141.63f, 64.0f, 129.41f, 64.0f, 112.0f);
        pathBuilder.arcToRelative(63.5f, 63.5f, 0.0f, false, true, 9.0f, -32.66f);
        pathBuilder.lineTo(52.37f, 56.7f);
        pathBuilder.arcTo(103.94f, 103.94f, 0.0f, false, false, 191.8f, 210.07f);
        pathBuilder.lineTo(153.0f, 167.37f);
        pathBuilder.arcTo(19.82f, 19.82f, 0.0f, false, true, 148.0f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _earSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
