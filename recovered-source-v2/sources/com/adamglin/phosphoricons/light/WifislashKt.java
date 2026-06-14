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

/* compiled from: Wifislash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WifiSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWifiSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wifiSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WifislashKt {
    private static ImageVector _wifiSlash;

    public static final ImageVector getWifiSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(138.0f, 204.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineTo(61.33f, 63.58f);
        pathBuilder.arcToRelative(169.41f, 169.41f, 0.0f, false, false, -41.14f, 25.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.62f, 9.27f);
        pathBuilder.arcTo(157.58f, 157.58f, 0.0f, false, true, 69.91f, 73.0f);
        pathBuilder.lineToRelative(26.48f, 29.13f);
        pathBuilder.arcToRelative(122.21f, 122.21f, 0.0f, false, false, -44.12f, 22.19f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.46f, 9.41f);
        pathBuilder.arcToRelative(110.0f, 110.0f, 0.0f, false, true, 45.87f, -21.47f);
        pathBuilder.lineToRelative(31.13f, 34.25f);
        pathBuilder.arcTo(74.4f, 74.4f, 0.0f, false, false, 128.0f, 146.0f);
        pathBuilder.arcToRelative(73.44f, 73.44f, 0.0f, false, false, -43.53f, 14.15f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 88.0f, 171.0f);
        pathBuilder.arcToRelative(5.93f, 5.93f, 0.0f, false, false, 3.53f, -1.15f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, false, true, 59.76f, -7.31f);
        pathBuilder.lineTo(203.56f, 220.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(235.81f, 88.55f);
        pathBuilder.arcTo(170.32f, 170.32f, 0.0f, false, false, 128.0f, 50.0f);
        pathBuilder.arcToRelative(173.45f, 173.45f, 0.0f, false, false, -21.76f, 1.38f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 1.52f, 11.9f);
        pathBuilder.arcTo(160.58f, 160.58f, 0.0f, false, true, 128.0f, 62.0f);
        pathBuilder.arcTo(158.26f, 158.26f, 0.0f, false, true, 228.19f, 97.82f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.62f, -9.27f);
        pathBuilder.close();
        pathBuilder.moveTo(196.27f, 133.75f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 135.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.73f, -10.7f);
        pathBuilder.arcToRelative(122.26f, 122.26f, 0.0f, false, false, -50.9f, -23.81f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -2.43f, 11.75f);
        pathBuilder.arcTo(110.0f, 110.0f, 0.0f, false, true, 196.27f, 133.75f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wifiSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
