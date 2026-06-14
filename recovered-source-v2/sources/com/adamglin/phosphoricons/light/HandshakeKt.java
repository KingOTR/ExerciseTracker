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

/* compiled from: Handshake.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Handshake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHandshake", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handshake", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandshakeKt {
    private static ImageVector _handshake;

    public static final ImageVector getHandshake(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _handshake;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Handshake", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(252.51f, 108.8f);
        pathBuilder.lineTo(227.0f, 57.75f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -18.78f, -6.27f);
        pathBuilder.lineTo(182.66f, 64.26f);
        pathBuilder.lineTo(129.53f, 50.2f);
        pathBuilder.arcToRelative(6.1f, 6.1f, 0.0f, false, false, -3.06f, 0.0f);
        pathBuilder.lineTo(73.34f, 64.26f);
        pathBuilder.lineTo(47.79f, 51.48f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 29.0f, 57.75f);
        pathBuilder.lineTo(3.49f, 108.8f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.26f, 18.78f);
        pathBuilder.lineTo(36.9f, 141.16f);
        pathBuilder.lineToRelative(55.61f, 39.72f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.0f, 0.94f);
        pathBuilder.lineToRelative(64.0f, 16.0f);
        pathBuilder.arcTo(6.08f, 6.08f, 0.0f, false, false, 160.0f, 198.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, -1.76f);
        pathBuilder.lineToRelative(55.31f, -55.31f);
        pathBuilder.lineToRelative(26.7f, -13.35f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.26f, -18.78f);
        pathBuilder.close();
        pathBuilder.moveTo(199.51f, 143.96f);
        pathBuilder.lineTo(163.71f, 115.28f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.0f, 0.45f);
        pathBuilder.curveToRelative(-18.65f, 18.79f, -39.5f, 16.42f, -52.79f, 7.92f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.94f, -1.5f);
        pathBuilder.arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.51f, -1.55f);
        pathBuilder.lineTo(146.43f, 78.0f);
        pathBuilder.horizontalLineToRelative(33.86f);
        pathBuilder.lineToRelative(28.41f, 56.82f);
        pathBuilder.close();
        pathBuilder.moveTo(14.11f, 115.69f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.11f, -1.52f);
        pathBuilder.lineTo(39.74f, 63.11f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.8f, -1.1f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.89f, 0.21f);
        pathBuilder.lineToRelative(22.21f, 11.1f);
        pathBuilder.lineTo(37.32f, 128.0f);
        pathBuilder.lineToRelative(-22.21f, -11.1f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 14.11f, 115.69f);
        pathBuilder.close();
        pathBuilder.moveTo(158.16f, 185.36f);
        pathBuilder.lineTo(98.56f, 170.46f);
        pathBuilder.lineTo(47.66f, 134.1f);
        pathBuilder.lineTo(76.84f, 75.75f);
        pathBuilder.lineTo(128.0f, 62.21f);
        pathBuilder.lineToRelative(14.8f, 3.92f);
        pathBuilder.arcToRelative(5.92f, 5.92f, 0.0f, false, false, -3.0f, 1.57f);
        pathBuilder.lineTo(94.1f, 112.05f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 2.39f, 21.72f);
        pathBuilder.curveToRelative(20.22f, 12.92f, 44.75f, 10.49f, 63.8f, -5.89f);
        pathBuilder.lineTo(191.0f, 152.5f);
        pathBuilder.close();
        pathBuilder.moveTo(241.89f, 115.69f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, 1.16f);
        pathBuilder.lineTo(218.68f, 128.0f);
        pathBuilder.lineTo(191.36f, 73.32f);
        pathBuilder.lineToRelative(22.21f, -11.1f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.53f, -0.11f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.16f, 1.0f);
        pathBuilder.lineToRelative(25.52f, 51.06f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 241.89f, 115.69f);
        pathBuilder.close();
        pathBuilder.moveTo(129.89f, 217.45f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.27f, 4.37f);
        pathBuilder.lineTo(80.89f, 211.39f);
        pathBuilder.arcToRelative(5.88f, 5.88f, 0.0f, false, true, -2.0f, -0.94f);
        pathBuilder.lineTo(52.52f, 191.64f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 7.0f, -9.77f);
        pathBuilder.lineTo(84.91f, 200.0f);
        pathBuilder.lineToRelative(40.61f, 10.15f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 129.88f, 217.45f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handshake = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
