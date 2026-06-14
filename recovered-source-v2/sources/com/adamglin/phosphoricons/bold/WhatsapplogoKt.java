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

/* compiled from: Whatsapplogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WhatsappLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getWhatsappLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_whatsappLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WhatsapplogoKt {
    private static ImageVector _whatsappLogo;

    public static final ImageVector getWhatsappLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(187.3f, 159.06f);
        pathBuilder.arcTo(36.09f, 36.09f, 0.0f, false, true, 152.0f, 188.0f);
        pathBuilder.arcToRelative(84.09f, 84.09f, 0.0f, false, true, -84.0f, -84.0f);
        pathBuilder.arcTo(36.09f, 36.09f, 0.0f, false, true, 96.94f, 68.7f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 110.0f, 75.1f);
        pathBuilder.lineToRelative(11.48f, 23.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.75f, 12.0f);
        pathBuilder.lineToRelative(-8.52f, 12.78f);
        pathBuilder.arcToRelative(44.56f, 44.56f, 0.0f, false, false, 20.91f, 20.91f);
        pathBuilder.lineToRelative(12.78f, -8.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -0.75f);
        pathBuilder.lineToRelative(23.0f, 11.48f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 187.3f, 159.06f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 128.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, false, true, 78.77f, 224.15f);
        pathBuilder.lineTo(46.34f, 235.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 21.0f, 209.66f);
        pathBuilder.lineToRelative(10.81f, -32.43f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, true, 236.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 128.0f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, true, false, 55.27f, 170.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 1.0f, 9.81f);
        pathBuilder.lineToRelative(-9.93f, 29.79f);
        pathBuilder.lineToRelative(29.79f, -9.93f);
        pathBuilder.arcToRelative(12.1f, 12.1f, 0.0f, false, true, 3.8f, -0.62f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.0f, 1.62f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, false, 212.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _whatsappLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
