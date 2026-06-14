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

/* compiled from: Phonecall.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneCall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPhoneCall", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneCall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhonecallKt {
    private static ImageVector _phoneCall;

    public static final ImageVector getPhoneCall(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.73f, -5.93f);
        pathBuilder.arcToRelative(70.35f, 70.35f, 0.0f, false, false, -50.33f, -50.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 144.27f, 45.93f);
        pathBuilder.close();
        pathBuilder.moveTo(141.94f, 87.73f);
        pathBuilder.curveToRelative(13.79f, 3.68f, 22.65f, 12.55f, 26.33f, 26.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 120.0f);
        pathBuilder.arcToRelative(8.23f, 8.23f, 0.0f, false, false, 2.07f, -0.27f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -9.8f);
        pathBuilder.curveToRelative(-5.12f, -19.16f, -18.5f, -32.54f, -37.66f, -37.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -4.13f, 15.46f);
        pathBuilder.close();
        pathBuilder.moveTo(214.37f, 166.46f);
        pathBuilder.lineTo(167.26f, 145.35f);
        pathBuilder.lineTo(167.13f, 145.29f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.17f, 1.4f);
        pathBuilder.arcToRelative(8.12f, 8.12f, 0.0f, false, false, -0.75f, 0.56f);
        pathBuilder.lineTo(126.87f, 168.0f);
        pathBuilder.curveToRelative(-15.42f, -7.49f, -31.34f, -23.29f, -38.83f, -38.51f);
        pathBuilder.lineToRelative(20.78f, -24.71f);
        pathBuilder.curveToRelative(0.2f, -0.25f, 0.39f, -0.5f, 0.57f, -0.77f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.32f, -15.06f);
        pathBuilder.lineToRelative(0.0f, -0.12f);
        pathBuilder.lineTo(89.54f, 41.64f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.62f, -9.52f);
        pathBuilder.arcTo(56.26f, 56.26f, 0.0f, false, false, 24.0f, 88.0f);
        pathBuilder.curveToRelative(0.0f, 79.4f, 64.6f, 144.0f, 144.0f, 144.0f);
        pathBuilder.arcToRelative(56.26f, 56.26f, 0.0f, false, false, 55.88f, -48.92f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 214.37f, 166.46f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneCall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
