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

/* compiled from: Phonecall.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneCall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPhoneCall", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneCall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhonecallKt {
    private static ImageVector _phoneCall;

    public static final ImageVector getPhoneCall(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _phoneCall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PhoneCall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(144.27f, 45.93f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.8f, -5.66f);
        pathBuilder.arcToRelative(86.22f, 86.22f, 0.0f, false, true, 61.66f, 61.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, 9.8f);
        pathBuilder.arcTo(8.23f, 8.23f, 0.0f, false, true, 208.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.73f, -5.94f);
        pathBuilder.arcToRelative(70.35f, 70.35f, 0.0f, false, false, -50.33f, -50.33f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 144.27f, 45.93f);
        pathBuilder.close();
        pathBuilder.moveTo(141.94f, 87.73f);
        pathBuilder.curveToRelative(13.79f, 3.68f, 22.65f, 12.54f, 26.33f, 26.33f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 120.0f);
        pathBuilder.arcToRelative(8.23f, 8.23f, 0.0f, false, false, 2.07f, -0.27f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -9.8f);
        pathBuilder.curveToRelative(-5.12f, -19.16f, -18.5f, -32.54f, -37.66f, -37.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -4.13f, 15.46f);
        pathBuilder.close();
        pathBuilder.moveTo(223.88f, 183.08f);
        pathBuilder.arcTo(56.26f, 56.26f, 0.0f, false, true, 168.0f, 232.0f);
        pathBuilder.curveTo(88.6f, 232.0f, 24.0f, 167.4f, 24.0f, 88.0f);
        pathBuilder.arcTo(56.26f, 56.26f, 0.0f, false, true, 72.92f, 32.12f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.62f, 9.52f);
        pathBuilder.lineToRelative(21.12f, 47.15f);
        pathBuilder.lineToRelative(0.0f, 0.12f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 109.39f, 104.0f);
        pathBuilder.curveToRelative(-0.18f, 0.27f, -0.37f, 0.52f, -0.57f, 0.77f);
        pathBuilder.lineTo(88.0f, 129.45f);
        pathBuilder.curveToRelative(7.49f, 15.22f, 23.41f, 31.0f, 38.83f, 38.51f);
        pathBuilder.lineToRelative(24.34f, -20.71f);
        pathBuilder.arcToRelative(8.12f, 8.12f, 0.0f, false, true, 0.75f, -0.56f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.17f, -1.4f);
        pathBuilder.lineToRelative(0.13f, 0.06f);
        pathBuilder.lineToRelative(47.11f, 21.11f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 223.88f, 183.08f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 181.08f);
        pathBuilder.reflectiveCurveToRelative(-0.07f, 0.0f, -0.11f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-47.0f, -21.05f);
        pathBuilder.lineToRelative(-24.35f, 20.71f);
        pathBuilder.arcToRelative(8.44f, 8.44f, 0.0f, false, true, -0.74f, 0.56f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.75f, 1.14f);
        pathBuilder.curveToRelative(-18.73f, -9.05f, -37.4f, -27.58f, -46.46f, -46.11f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 1.0f, -15.7f);
        pathBuilder.arcToRelative(6.13f, 6.13f, 0.0f, false, true, 0.57f, -0.77f);
        pathBuilder.lineTo(96.0f, 95.15f);
        pathBuilder.lineToRelative(-21.0f, -47.0f);
        pathBuilder.arcToRelative(0.61f, 0.61f, 0.0f, false, true, 0.0f, -0.12f);
        pathBuilder.arcTo(40.2f, 40.2f, 0.0f, false, false, 40.0f, 88.0f);
        pathBuilder.arcTo(128.14f, 128.14f, 0.0f, false, false, 168.0f, 216.0f);
        pathBuilder.arcTo(40.21f, 40.21f, 0.0f, false, false, 208.0f, 181.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneCall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
