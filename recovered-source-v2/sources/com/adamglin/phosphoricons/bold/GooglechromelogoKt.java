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

/* compiled from: Googlechromelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GoogleChromeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGoogleChromeLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googleChromeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglechromelogoKt {
    private static ImageVector _googleChromeLogo;

    public static final ImageVector getGoogleChromeLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _googleChromeLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GoogleChromeLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 44.0f);
        pathBuilder.arcToRelative(83.89f, 83.89f, 0.0f, false, true, 65.9f, 32.0f);
        pathBuilder.lineTo(128.0f, 76.0f);
        pathBuilder.arcToRelative(52.05f, 52.05f, 0.0f, false, false, -46.15f, 28.07f);
        pathBuilder.lineTo(64.18f, 73.47f);
        pathBuilder.arcTo(83.82f, 83.82f, 0.0f, false, true, 128.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 128.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 156.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 128.0f);
        pathBuilder.arcToRelative(83.41f, 83.41f, 0.0f, false, true, 6.0f, -31.11f);
        pathBuilder.lineTo(83.0f, 154.0f);
        pathBuilder.curveToRelative(0.06f, 0.11f, 0.14f, 0.2f, 0.2f, 0.3f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 128.0f, 180.0f);
        pathBuilder.quadToRelative(1.19f, 0.0f, 2.34f, -0.06f);
        pathBuilder.lineToRelative(-17.68f, 30.63f);
        pathBuilder.arcTo(84.12f, 84.12f, 0.0f, false, true, 44.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.05f, 211.12f);
        pathBuilder.lineTo(173.0f, 154.0f);
        pathBuilder.curveToRelative(0.09f, -0.15f, 0.16f, -0.3f, 0.24f, -0.46f);
        pathBuilder.arcTo(51.81f, 51.81f, 0.0f, false, false, 171.78f, 100.0f);
        pathBuilder.horizontalLineToRelative(35.4f);
        pathBuilder.arcToRelative(83.95f, 83.95f, 0.0f, false, true, -67.13f, 111.12f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googleChromeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
