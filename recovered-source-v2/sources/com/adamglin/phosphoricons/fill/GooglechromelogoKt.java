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

/* compiled from: Googlechromelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GoogleChromeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGoogleChromeLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googleChromeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglechromelogoKt {
    private static ImageVector _googleChromeLogo;

    public static final ImageVector getGoogleChromeLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 40.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 73.72f, 40.0f);
        pathBuilder.lineTo(128.0f, 80.0f);
        pathBuilder.arcToRelative(48.08f, 48.08f, 0.0f, false, false, -45.6f, 33.0f);
        pathBuilder.lineToRelative(-23.08f, -40.0f);
        pathBuilder.arcTo(87.89f, 87.89f, 0.0f, false, true, 128.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 128.0f);
        pathBuilder.arcToRelative(87.44f, 87.44f, 0.0f, false, true, 9.56f, -39.86f);
        pathBuilder.lineTo(86.43f, 152.0f);
        pathBuilder.curveToRelative(0.06f, 0.1f, 0.13f, 0.19f, 0.19f, 0.28f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, false, 137.82f, 175.0f);
        pathBuilder.lineToRelative(-23.1f, 40.0f);
        pathBuilder.arcTo(88.14f, 88.14f, 0.0f, false, true, 40.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.69f, 215.87f);
        pathBuilder.lineTo(169.57f, 152.0f);
        pathBuilder.curveToRelative(0.08f, -0.14f, 0.14f, -0.28f, 0.22f, -0.42f);
        pathBuilder.arcToRelative(47.88f, 47.88f, 0.0f, false, false, -6.0f, -55.58f);
        pathBuilder.lineTo(210.0f, 96.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, -77.29f, 119.87f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googleChromeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
