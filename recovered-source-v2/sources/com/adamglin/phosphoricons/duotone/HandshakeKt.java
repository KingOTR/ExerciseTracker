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

/* compiled from: Handshake.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Handshake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHandshake", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handshake", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandshakeKt {
    private static ImageVector _handshake;

    public static final ImageVector getHandshake(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(200.0f, 152.0f);
        pathBuilder.lineToRelative(-40.0f, 40.0f);
        pathBuilder.lineTo(96.0f, 176.0f);
        pathBuilder.lineTo(40.0f, 136.0f);
        pathBuilder.lineTo(72.68f, 70.63f);
        pathBuilder.lineTo(128.0f, 56.0f);
        pathBuilder.lineToRelative(55.32f, 14.63f);
        pathBuilder.lineTo(183.6f, 72.0f);
        pathBuilder.horizontalLineTo(144.0f);
        pathBuilder.lineTo(98.34f, 116.29f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.38f, 12.42f);
        pathBuilder.curveTo(117.23f, 139.9f, 141.0f, 139.13f, 160.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(254.3f, 107.91f);
        pathBuilder2.lineTo(228.78f, 56.85f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.47f, -7.15f);
        pathBuilder2.lineTo(182.44f, 62.13f);
        pathBuilder2.lineTo(130.05f, 48.27f);
        pathBuilder2.arcToRelative(8.14f, 8.14f, 0.0f, false, false, -4.1f, 0.0f);
        pathBuilder2.lineTo(73.56f, 62.13f);
        pathBuilder2.lineTo(48.69f, 49.7f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.47f, 7.15f);
        pathBuilder2.lineTo(1.7f, 107.9f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.15f, 21.47f);
        pathBuilder2.lineToRelative(27.0f, 13.51f);
        pathBuilder2.lineToRelative(55.49f, 39.63f);
        pathBuilder2.arcToRelative(8.06f, 8.06f, 0.0f, false, false, 2.71f, 1.25f);
        pathBuilder2.lineToRelative(64.0f, 16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.6f, -2.1f);
        pathBuilder2.lineToRelative(55.07f, -55.08f);
        pathBuilder2.lineToRelative(26.42f, -13.21f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.15f, -21.46f);
        pathBuilder2.close();
        pathBuilder2.moveTo(199.41f, 141.28f);
        pathBuilder2.lineTo(165.0f, 113.72f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.68f, 0.61f);
        pathBuilder2.curveTo(136.51f, 132.27f, 116.66f, 130.0f, 104.0f, 122.0f);
        pathBuilder2.lineTo(147.24f, 80.0f);
        pathBuilder2.horizontalLineToRelative(31.81f);
        pathBuilder2.lineToRelative(27.21f, 54.41f);
        pathBuilder2.close();
        pathBuilder2.moveTo(41.53f, 64.0f);
        pathBuilder2.lineTo(62.0f, 74.22f);
        pathBuilder2.lineTo(36.43f, 125.27f);
        pathBuilder2.lineTo(16.0f, 115.06f);
        pathBuilder2.close();
        pathBuilder2.moveTo(157.53f, 183.13f);
        pathBuilder2.lineTo(99.42f, 168.61f);
        pathBuilder2.lineToRelative(-49.2f, -35.14f);
        pathBuilder2.lineToRelative(28.0f, -56.0f);
        pathBuilder2.lineTo(128.0f, 64.28f);
        pathBuilder2.lineToRelative(9.8f, 2.59f);
        pathBuilder2.lineToRelative(-45.0f, 43.68f);
        pathBuilder2.lineToRelative(-0.08f, 0.09f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 2.72f, 24.81f);
        pathBuilder2.curveToRelative(20.56f, 13.13f, 45.37f, 11.0f, 64.91f, -5.0f);
        pathBuilder2.lineTo(188.0f, 152.66f);
        pathBuilder2.close();
        pathBuilder2.moveTo(219.53f, 125.26f);
        pathBuilder2.lineTo(194.01f, 74.26f);
        pathBuilder2.lineTo(214.47f, 64.0f);
        pathBuilder2.lineTo(240.0f, 115.06f);
        pathBuilder2.close();
        pathBuilder2.moveTo(131.78f, 217.93f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.75f, 6.06f);
        pathBuilder2.arcToRelative(8.13f, 8.13f, 0.0f, false, true, -1.95f, -0.24f);
        pathBuilder2.lineTo(80.41f, 213.33f);
        pathBuilder2.arcToRelative(7.89f, 7.89f, 0.0f, false, true, -2.71f, -1.25f);
        pathBuilder2.lineTo(51.35f, 193.26f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.3f, -13.0f);
        pathBuilder2.lineToRelative(25.11f, 17.94f);
        pathBuilder2.lineTo(126.0f, 208.24f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 131.82f, 217.94f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handshake = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
