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

/* compiled from: Wifihigh.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WifiHigh", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getWifiHigh", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wifiHigh", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WifihighKt {
    private static ImageVector _wifiHigh;

    public static final ImageVector getWifiHigh(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _wifiHigh;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WifiHigh", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(140.0f, 204.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(237.08f, 87.0f);
        pathBuilder.arcTo(172.0f, 172.0f, 0.0f, false, false, 18.92f, 87.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 29.08f, 99.37f);
        pathBuilder.arcToRelative(156.0f, 156.0f, 0.0f, false, true, 197.84f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 237.08f, 87.0f);
        pathBuilder.close();
        pathBuilder.moveTo(205.0f, 122.77f);
        pathBuilder.arcToRelative(124.0f, 124.0f, 0.0f, false, false, -153.94f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 61.0f, 135.31f);
        pathBuilder.arcToRelative(108.0f, 108.0f, 0.0f, false, true, 134.06f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.24f, -1.3f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 205.0f, 122.77f);
        pathBuilder.close();
        pathBuilder.moveTo(172.74f, 158.53f);
        pathBuilder.arcToRelative(76.05f, 76.05f, 0.0f, false, false, -89.42f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.42f, 12.94f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, true, 70.58f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.42f, -12.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wifiHigh = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
