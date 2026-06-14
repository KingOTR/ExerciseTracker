package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Wifislash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WifiSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getWifiSlash", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wifiSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WifislashKt {
    private static ImageVector _wifiSlash;

    public static final ImageVector getWifiSlash(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(213.92f, 210.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f);
        pathBuilder.lineToRelative(-52.0f, -57.15f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, -57.41f, 7.24f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -9.42f, -12.93f);
        pathBuilder.arcTo(75.43f, 75.43f, 0.0f, false, true, 128.0f, 144.0f);
        pathBuilder.curveToRelative(1.28f, 0.0f, 2.55f, 0.0f, 3.82f, 0.1f);
        pathBuilder.lineTo(104.9f, 114.49f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, false, false, 61.0f, 135.31f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 49.73f, 134.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 51.0f, 122.77f);
        pathBuilder.arcToRelative(124.27f, 124.27f, 0.0f, false, true, 41.71f, -21.66f);
        pathBuilder.lineTo(69.37f, 75.4f);
        pathBuilder.arcToRelative(155.43f, 155.43f, 0.0f, false, false, -40.29f, 24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 18.92f, 87.0f);
        pathBuilder.arcTo(171.87f, 171.87f, 0.0f, false, true, 58.0f, 62.86f);
        pathBuilder.lineTo(42.08f, 45.38f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 192.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(237.08f, 87.0f);
        pathBuilder.arcTo(172.3f, 172.3f, 0.0f, false, false, 106.0f, 49.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 2.0f, 15.87f);
        pathBuilder.arcTo(158.33f, 158.33f, 0.0f, false, true, 128.0f, 64.0f);
        pathBuilder.arcToRelative(156.25f, 156.25f, 0.0f, false, true, 98.92f, 35.37f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 237.08f, 87.0f);
        pathBuilder.close();
        pathBuilder.moveTo(195.0f, 135.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.24f, -1.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.3f, -11.24f);
        pathBuilder.arcToRelative(124.25f, 124.25f, 0.0f, false, false, -51.73f, -24.2f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 150.0f, 114.24f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, true, 195.0f, 135.31f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wifiSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
