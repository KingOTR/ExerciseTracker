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

/* compiled from: Phonedisconnect.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneDisconnect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPhoneDisconnect", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneDisconnect", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhonedisconnectKt {
    private static ImageVector _phoneDisconnect;

    public static final ImageVector getPhoneDisconnect(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(231.59f, 90.13f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(175.44f, 34.0f, 80.56f, 34.0f, 24.41f, 90.13f);
        pathBuilder.curveToRelative(-20.0f, 20.0f, -21.92f, 49.49f, -4.69f, 71.71f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.35f, 168.0f);
        pathBuilder.arcToRelative(15.8f, 15.8f, 0.0f, false, false, 5.75f, -1.08f);
        pathBuilder.lineToRelative(49.0f, -17.37f);
        pathBuilder.lineToRelative(0.29f, -0.11f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.75f, -11.73f);
        pathBuilder.lineToRelative(5.9f, -29.52f);
        pathBuilder.arcToRelative(76.52f, 76.52f, 0.0f, false, true, 49.68f, -0.11f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(6.21f, 29.75f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.72f, 11.59f);
        pathBuilder.lineToRelative(0.29f, 0.11f);
        pathBuilder.lineToRelative(49.0f, 17.39f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.38f, -5.06f);
        pathBuilder.curveTo(253.51f, 139.62f, 251.58f, 110.13f, 231.59f, 90.13f);
        pathBuilder.close();
        pathBuilder.moveTo(223.67f, 152.0f);
        pathBuilder.lineToRelative(-0.3f, -0.12f);
        pathBuilder.lineToRelative(-48.82f, -17.33f);
        pathBuilder.lineToRelative(-6.21f, -29.74f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 158.0f, 93.0f);
        pathBuilder.arcToRelative(92.56f, 92.56f, 0.0f, false, false, -60.34f, 0.13f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -10.32f, 12.0f);
        pathBuilder.lineToRelative(-5.9f, 29.51f);
        pathBuilder.lineTo(32.63f, 151.86f);
        pathBuilder.curveToRelative(-0.1f, 0.0f, -0.17f, 0.13f, -0.27f, 0.17f);
        pathBuilder.curveToRelative(-12.33f, -15.91f, -11.0f, -36.23f, 3.36f, -50.58f);
        pathBuilder.curveToRelative(25.0f, -25.0f, 58.65f, -37.53f, 92.28f, -37.53f);
        pathBuilder.reflectiveCurveToRelative(67.27f, 12.51f, 92.28f, 37.53f);
        pathBuilder.curveTo(234.61f, 115.8f, 236.0f, 136.12f, 223.67f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(223.99f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(40.0f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.lineTo(216.0f, 192.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneDisconnect = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
