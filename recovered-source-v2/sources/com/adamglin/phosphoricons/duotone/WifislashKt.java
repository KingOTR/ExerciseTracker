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

/* compiled from: Wifislash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WifiSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getWifiSlash", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wifiSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WifislashKt {
    private static ImageVector _wifiSlash;

    public static final ImageVector getWifiSlash(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(238.2f, 87.69f);
        pathBuilder.lineToRelative(-104.0f, 125.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.3f, 0.0f);
        pathBuilder.lineTo(17.8f, 87.69f);
        pathBuilder.arcToRelative(7.79f, 7.79f, 0.0f, false, true, 1.31f, -11.21f);
        pathBuilder.arcToRelative(180.75f, 180.75f, 0.0f, false, true, 217.78f, 0.0f);
        pathBuilder.arcTo(7.79f, 7.79f, 0.0f, false, true, 238.2f, 87.69f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(53.92f, 34.62f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder2.lineToRelative(4.55f, 5.0f);
        pathBuilder2.arcTo(187.93f, 187.93f, 0.0f, false, false, 14.28f, 70.1f);
        pathBuilder2.arcTo(15.93f, 15.93f, 0.0f, false, false, 8.11f, 80.91f);
        pathBuilder2.arcTo(15.65f, 15.65f, 0.0f, false, false, 11.65f, 92.8f);
        pathBuilder2.lineToRelative(104.0f, 125.43f);
        pathBuilder2.arcTo(15.93f, 15.93f, 0.0f, false, false, 128.0f, 224.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(15.93f, 15.93f, 0.0f, false, false, 12.31f, -5.77f);
        pathBuilder2.lineToRelative(28.1f, -33.88f);
        pathBuilder2.lineToRelative(33.67f, 37.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 208.0f);
        pathBuilder2.lineTo(24.09f, 82.74f);
        pathBuilder2.arcTo(171.5f, 171.5f, 0.0f, false, true, 57.91f, 62.79f);
        pathBuilder2.lineToRelative(99.63f, 109.6f);
        pathBuilder2.close();
        pathBuilder2.moveTo(244.35f, 92.8f);
        pathBuilder2.lineToRelative(-49.42f, 59.58f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.32f, -10.21f);
        pathBuilder2.lineToRelative(49.3f, -59.43f);
        pathBuilder2.arcTo(170.76f, 170.76f, 0.0f, false, false, 128.0f, 48.0f);
        pathBuilder2.arcToRelative(175.15f, 175.15f, 0.0f, false, false, -32.39f, 3.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -3.0f, -15.72f);
        pathBuilder2.arcTo(190.62f, 190.62f, 0.0f, false, true, 128.0f, 32.0f);
        pathBuilder2.arcTo(186.67f, 186.67f, 0.0f, false, true, 241.72f, 70.1f);
        pathBuilder2.arcToRelative(15.93f, 15.93f, 0.0f, false, true, 6.17f, 10.81f);
        pathBuilder2.arcTo(15.65f, 15.65f, 0.0f, false, true, 244.35f, 92.8f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wifiSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
