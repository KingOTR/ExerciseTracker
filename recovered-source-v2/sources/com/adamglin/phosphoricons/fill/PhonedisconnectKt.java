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

/* compiled from: Phonedisconnect.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneDisconnect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPhoneDisconnect", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneDisconnect", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhonedisconnectKt {
    private static ImageVector _phoneDisconnect;

    public static final ImageVector getPhoneDisconnect(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(236.28f, 161.84f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -18.38f, 5.06f);
        pathBuilder.lineToRelative(-49.0f, -17.39f);
        pathBuilder.lineToRelative(-0.29f, -0.11f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -9.72f, -11.59f);
        pathBuilder.lineToRelative(-6.21f, -29.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(76.52f, 76.52f, 0.0f, false, false, -49.68f, 0.11f);
        pathBuilder.lineToRelative(-5.9f, 29.52f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -9.75f, 11.73f);
        pathBuilder.lineToRelative(-0.29f, 0.11f);
        pathBuilder.lineToRelative(-49.0f, 17.37f);
        pathBuilder.arcTo(15.8f, 15.8f, 0.0f, false, true, 32.35f, 168.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.63f, -6.14f);
        pathBuilder.curveToRelative(-17.23f, -22.22f, -15.3f, -51.71f, 4.69f, -71.71f);
        pathBuilder.curveToRelative(56.15f, -56.17f, 151.0f, -56.17f, 207.18f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(251.58f, 110.13f, 253.51f, 139.62f, 236.28f, 161.84f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 192.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneDisconnect = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
