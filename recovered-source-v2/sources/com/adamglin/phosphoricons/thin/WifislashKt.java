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

/* compiled from: Wifislash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WifiSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getWifiSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wifiSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WifislashKt {
    private static ImageVector _wifiSlash;

    public static final ImageVector getWifiSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _wifiSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WifiSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(136.0f, 204.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(51.0f, 37.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f);
        pathBuilder.lineTo(64.72f, 64.34f);
        pathBuilder.arcTo(167.64f, 167.64f, 0.0f, false, false, 21.46f, 90.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.08f, 6.19f);
        pathBuilder.arcTo(159.4f, 159.4f, 0.0f, false, true, 70.47f, 70.66f);
        pathBuilder.lineToRelative(29.64f, 32.61f);
        pathBuilder.arcToRelative(120.12f, 120.12f, 0.0f, false, false, -46.6f, 22.64f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, 6.27f);
        pathBuilder.arcToRelative(112.0f, 112.0f, 0.0f, false, true, 47.85f, -22.07f);
        pathBuilder.lineTo(142.0f, 149.37f);
        pathBuilder.arcTo(72.6f, 72.6f, 0.0f, false, false, 128.0f, 148.0f);
        pathBuilder.arcToRelative(71.49f, 71.49f, 0.0f, false, false, -42.36f, 13.77f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 88.0f, 169.0f);
        pathBuilder.arcToRelative(4.07f, 4.07f, 0.0f, false, false, 2.36f, -0.76f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 62.11f, -7.38f);
        pathBuilder.lineTo(205.0f, 218.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f);
        pathBuilder.close();
        pathBuilder.moveTo(234.54f, 90.09f);
        pathBuilder.arcTo(168.33f, 168.33f, 0.0f, false, false, 128.0f, 52.0f);
        pathBuilder.arcToRelative(171.08f, 171.08f, 0.0f, false, false, -21.5f, 1.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, 7.94f);
        pathBuilder.arcTo(162.68f, 162.68f, 0.0f, false, true, 128.0f, 60.0f);
        pathBuilder.arcTo(160.22f, 160.22f, 0.0f, false, true, 229.46f, 96.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.08f, -6.19f);
        pathBuilder.close();
        pathBuilder.moveTo(197.54f, 132.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.0f, -6.27f);
        pathBuilder.arcToRelative(120.17f, 120.17f, 0.0f, false, false, -50.06f, -23.42f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -1.62f, 7.83f);
        pathBuilder.arcTo(112.18f, 112.18f, 0.0f, false, true, 197.52f, 132.18f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wifiSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
