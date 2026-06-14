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

/* compiled from: Googlechromelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GoogleChromeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGoogleChromeLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googleChromeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglechromelogoKt {
    private static ImageVector _googleChromeLogo;

    public static final ImageVector getGoogleChromeLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.0f);
        pathBuilder.arcToRelative(92.08f, 92.08f, 0.0f, false, true, 80.78f, 48.0f);
        pathBuilder.lineTo(128.0f, 84.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, false, -43.82f, 40.11f);
        pathBuilder.lineTo(54.51f, 72.72f);
        pathBuilder.arcTo(91.9f, 91.9f, 0.0f, false, true, 128.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 164.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 128.0f);
        pathBuilder.arcTo(91.52f, 91.52f, 0.0f, false, true, 49.51f, 80.05f);
        pathBuilder.lineTo(89.9f, 150.0f);
        pathBuilder.curveToRelative(0.0f, 0.09f, 0.11f, 0.17f, 0.17f, 0.26f);
        pathBuilder.arcToRelative(43.93f, 43.93f, 0.0f, false, false, 56.47f, 17.63f);
        pathBuilder.lineToRelative(-29.7f, 51.43f);
        pathBuilder.arcTo(92.13f, 92.13f, 0.0f, false, true, 36.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.curveToRelative(-0.77f, 0.0f, -1.53f, 0.0f, -2.29f, 0.0f);
        pathBuilder.lineToRelative(40.39f, -70.0f);
        pathBuilder.arcToRelative(1.21f, 1.21f, 0.0f, false, false, 0.09f, -0.2f);
        pathBuilder.arcTo(43.89f, 43.89f, 0.0f, false, false, 153.25f, 92.0f);
        pathBuilder.horizontalLineToRelative(59.41f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googleChromeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
