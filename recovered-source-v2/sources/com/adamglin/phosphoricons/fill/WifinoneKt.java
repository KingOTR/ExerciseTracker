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

/* compiled from: Wifinone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WifiNone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getWifiNone", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wifiNone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WifinoneKt {
    private static ImageVector _wifiNone;

    public static final ImageVector getWifiNone(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _wifiNone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WifiNone", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(247.89f, 80.91f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, -6.17f, -10.81f);
        pathBuilder.arcTo(186.67f, 186.67f, 0.0f, false, false, 128.0f, 32.0f);
        pathBuilder.arcTo(186.67f, 186.67f, 0.0f, false, false, 14.28f, 70.1f);
        pathBuilder.arcTo(15.93f, 15.93f, 0.0f, false, false, 8.11f, 80.91f);
        pathBuilder.arcTo(15.65f, 15.65f, 0.0f, false, false, 11.65f, 92.8f);
        pathBuilder.lineToRelative(104.0f, 125.43f);
        pathBuilder.arcTo(15.93f, 15.93f, 0.0f, false, false, 128.0f, 224.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, 12.31f, -5.77f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(104.0f, -125.43f);
        pathBuilder.arcTo(15.65f, 15.65f, 0.0f, false, false, 247.89f, 80.91f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 208.0f);
        pathBuilder.lineTo(24.09f, 82.74f);
        pathBuilder.arcTo(170.76f, 170.76f, 0.0f, false, true, 128.0f, 48.0f);
        pathBuilder.arcTo(170.76f, 170.76f, 0.0f, false, true, 231.91f, 82.74f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wifiNone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
