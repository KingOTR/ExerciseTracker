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

/* compiled from: Phonedisconnect.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneDisconnect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPhoneDisconnect", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneDisconnect", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhonedisconnectKt {
    private static ImageVector _phoneDisconnect;

    public static final ImageVector getPhoneDisconnect(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _phoneDisconnect;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PhoneDisconnect", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.19f, 91.55f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-55.39f, -55.4f, -149.0f, -55.4f, -204.38f, 0.0f);
        pathBuilder.curveTo(6.56f, 110.82f, 4.7f, 139.22f, 21.29f, 160.61f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 37.39f, 165.0f);
        pathBuilder.lineToRelative(49.0f, -17.38f);
        pathBuilder.lineToRelative(0.22f, -0.09f);
        pathBuilder.arcToRelative(13.93f, 13.93f, 0.0f, false, false, 8.53f, -10.25f);
        pathBuilder.lineToRelative(5.9f, -29.52f);
        pathBuilder.arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.21f, -1.47f);
        pathBuilder.arcToRelative(78.53f, 78.53f, 0.0f, false, true, 51.18f, -0.11f);
        pathBuilder.arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.22f, 1.45f);
        pathBuilder.lineToRelative(6.21f, 29.75f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 8.5f, 10.14f);
        pathBuilder.lineToRelative(0.23f, 0.08f);
        pathBuilder.lineToRelative(49.0f, 17.4f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 16.1f, -4.42f);
        pathBuilder.curveTo(251.3f, 139.22f, 249.44f, 110.82f, 230.19f, 91.55f);
        pathBuilder.close();
        pathBuilder.moveTo(225.19f, 153.26f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.29f, 0.58f);
        pathBuilder.lineToRelative(-0.22f, -0.09f);
        pathBuilder.lineToRelative(-49.0f, -17.38f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 172.6f, 135.0f);
        pathBuilder.lineToRelative(-6.22f, -29.74f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.06f, -10.35f);
        pathBuilder.arcToRelative(90.53f, 90.53f, 0.0f, false, false, -59.0f, 0.13f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.0f, 10.45f);
        pathBuilder.lineTo(83.37f, 135.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.15f, 1.44f);
        pathBuilder.lineTo(33.28f, 153.75f);
        pathBuilder.lineToRelative(-0.22f, 0.09f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.29f, -0.58f);
        pathBuilder.curveToRelative(-13.0f, -16.74f, -11.56f, -38.12f, 3.53f, -53.22f);
        pathBuilder.curveToRelative(25.39f, -25.4f, 59.55f, -38.1f, 93.7f, -38.1f);
        pathBuilder.reflectiveCurveToRelative(68.31f, 12.7f, 93.7f, 38.1f);
        pathBuilder.curveTo(236.79f, 115.14f, 238.21f, 136.52f, 225.23f, 153.26f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 200.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(40.0f, 206.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(216.0f, 194.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneDisconnect = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
