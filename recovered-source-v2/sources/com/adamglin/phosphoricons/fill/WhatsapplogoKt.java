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

/* compiled from: Whatsapplogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WhatsappLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getWhatsappLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_whatsappLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WhatsapplogoKt {
    private static ImageVector _whatsappLogo;

    public static final ImageVector getWhatsappLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _whatsappLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WhatsappLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.58f, 145.23f);
        pathBuilder.lineToRelative(23.0f, 11.48f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 176.0f);
        pathBuilder.arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 99.29f, 80.46f);
        pathBuilder.lineToRelative(11.48f, 23.0f);
        pathBuilder.lineTo(101.0f, 118.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.73f, 7.51f);
        pathBuilder.arcToRelative(56.47f, 56.47f, 0.0f, false, false, 30.15f, 30.15f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 138.0f, 155.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 128.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, true, 79.12f, 219.82f);
        pathBuilder.lineTo(45.07f, 231.17f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -20.24f, -20.24f);
        pathBuilder.lineToRelative(11.35f, -34.05f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, true, 232.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.42f, -7.16f);
        pathBuilder.lineToRelative(-32.0f, -16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 0.5f);
        pathBuilder.lineToRelative(-14.69f, 9.8f);
        pathBuilder.arcToRelative(40.55f, 40.55f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineToRelative(9.8f, -14.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.5f, -8.0f);
        pathBuilder.lineToRelative(-16.0f, -32.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 64.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f);
        pathBuilder.arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, 88.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 192.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _whatsappLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
