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

/* compiled from: Mediumlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MediumLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMediumLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mediumLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediumlogoKt {
    private static ImageVector _mediumLogo;

    public static final ImageVector getMediumLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _mediumLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MediumLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(136.0f, 128.0f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, true, true, 72.0f, 64.0f);
        pathBuilder.arcTo(64.07f, 64.07f, 0.0f, false, true, 136.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 64.0f);
        pathBuilder.curveToRelative(-5.68f, 0.0f, -16.4f, 2.76f, -24.32f, 21.25f);
        pathBuilder.curveTo(154.73f, 96.8f, 152.0f, 112.0f, 152.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(2.73f, 31.2f, 7.68f, 42.75f);
        pathBuilder.curveTo(167.6f, 189.24f, 178.32f, 192.0f, 184.0f, 192.0f);
        pathBuilder.reflectiveCurveToRelative(16.4f, -2.76f, 24.32f, -21.25f);
        pathBuilder.curveTo(213.27f, 159.2f, 216.0f, 144.0f, 216.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(-2.73f, -31.2f, -7.68f, -42.75f);
        pathBuilder.curveTo(200.4f, 66.76f, 189.68f, 64.0f, 184.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.lineTo(232.0f, 184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(248.0f, 72.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mediumLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
