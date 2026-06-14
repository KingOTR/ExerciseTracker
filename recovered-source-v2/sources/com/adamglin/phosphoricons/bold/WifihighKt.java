package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Wifihigh.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WifiHigh", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getWifiHigh", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wifiHigh", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WifihighKt {
    private static ImageVector _wifiHigh;

    public static final ImageVector getWifiHigh(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(144.0f, 204.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(239.61f, 83.91f);
        pathBuilder.arcToRelative(176.0f, 176.0f, 0.0f, false, false, -223.22f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 15.23f, 18.55f);
        pathBuilder.arcToRelative(152.0f, 152.0f, 0.0f, false, true, 192.76f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 15.23f, -18.55f);
        pathBuilder.close();
        pathBuilder.moveTo(207.45f, 119.64f);
        pathBuilder.arcToRelative(128.0f, 128.0f, 0.0f, false, false, -158.9f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.9f, 18.81f);
        pathBuilder.arcToRelative(104.0f, 104.0f, 0.0f, false, true, 129.1f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.9f, -18.81f);
        pathBuilder.close();
        pathBuilder.moveTo(175.07f, 155.3f);
        pathBuilder.arcToRelative(80.05f, 80.05f, 0.0f, false, false, -94.14f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.14f, 19.4f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, 65.86f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.14f, -19.4f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wifiHigh = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
