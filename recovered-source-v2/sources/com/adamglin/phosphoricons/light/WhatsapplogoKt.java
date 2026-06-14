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

/* compiled from: Whatsapplogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WhatsappLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWhatsappLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_whatsappLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WhatsapplogoKt {
    private static ImageVector _whatsappLogo;

    public static final ImageVector getWhatsappLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(186.68f, 146.63f);
        pathBuilder.lineToRelative(-32.0f, -16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 0.38f);
        pathBuilder.lineTo(133.0f, 141.46f);
        pathBuilder.arcTo(42.49f, 42.49f, 0.0f, false, true, 114.54f, 123.0f);
        pathBuilder.lineTo(125.0f, 107.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.38f, -6.0f);
        pathBuilder.lineToRelative(-16.0f, -32.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 66.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, 38.0f);
        pathBuilder.arcToRelative(86.1f, 86.1f, 0.0f, false, false, 86.0f, 86.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 186.68f, 146.63f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 178.0f);
        pathBuilder.arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, -74.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 22.42f, -25.75f);
        pathBuilder.lineToRelative(12.66f, 25.32f);
        pathBuilder.lineToRelative(-10.39f, 15.58f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.54f, 5.63f);
        pathBuilder.arcToRelative(54.43f, 54.43f, 0.0f, false, false, 29.07f, 29.07f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.63f, -0.54f);
        pathBuilder.lineToRelative(15.58f, -10.39f);
        pathBuilder.lineToRelative(25.32f, 12.66f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 152.0f, 178.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, false, false, 38.35f, 176.69f);
        pathBuilder.lineTo(26.73f, 211.56f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 17.71f, 17.71f);
        pathBuilder.lineToRelative(34.87f, -11.62f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 218.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, -45.06f, -12.08f);
        pathBuilder.arcToRelative(6.09f, 6.09f, 0.0f, false, false, -3.0f, -0.81f);
        pathBuilder.arcToRelative(6.2f, 6.2f, 0.0f, false, false, -1.9f, 0.31f);
        pathBuilder.lineTo(40.65f, 217.88f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.53f, -2.53f);
        pathBuilder.lineTo(50.58f, 178.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.5f, -4.91f);
        pathBuilder.arcTo(90.0f, 90.0f, 0.0f, true, true, 128.0f, 218.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _whatsappLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
