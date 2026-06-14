package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Whatsapplogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WhatsappLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getWhatsappLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_whatsappLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WhatsapplogoKt {
    private static ImageVector _whatsappLogo;

    public static final ImageVector getWhatsappLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(185.79f, 148.42f);
        pathBuilder.lineToRelative(-32.0f, -16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 0.25f);
        pathBuilder.lineToRelative(-16.64f, 11.1f);
        pathBuilder.arcToRelative(44.56f, 44.56f, 0.0f, false, true, -20.91f, -20.91f);
        pathBuilder.lineToRelative(11.1f, -16.64f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.25f, -4.0f);
        pathBuilder.lineToRelative(-16.0f, -32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 68.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f);
        pathBuilder.arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, 84.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 185.79f, 148.42f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 180.0f);
        pathBuilder.arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, -76.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 25.58f, -27.9f);
        pathBuilder.lineToRelative(13.8f, 27.61f);
        pathBuilder.lineToRelative(-11.0f, 16.54f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 124.0f);
        pathBuilder.arcToRelative(52.43f, 52.43f, 0.0f, false, false, 28.0f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.76f, -0.37f);
        pathBuilder.lineToRelative(16.54f, -11.0f);
        pathBuilder.lineToRelative(27.61f, 13.8f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 152.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, false, false, 40.53f, 176.5f);
        pathBuilder.lineToRelative(-11.9f, 35.69f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.18f, 15.18f);
        pathBuilder.lineToRelative(35.69f, -11.9f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, -46.07f, -12.35f);
        pathBuilder.arcToRelative(4.05f, 4.05f, 0.0f, false, false, -2.0f, -0.54f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, false, -1.27f, 0.21f);
        pathBuilder.lineTo(41.28f, 219.78f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.06f, -5.06f);
        pathBuilder.lineToRelative(12.46f, -37.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.33f, -3.27f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, true, true, 128.0f, 220.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _whatsappLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
