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

/* compiled from: Facebooklogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FacebookLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFacebookLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_facebookLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FacebooklogoKt {
    private static ImageVector _facebookLogo;

    public static final ImageVector getFacebookLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _facebookLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FacebookLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 128.0f);
        pathBuilder.arcToRelative(104.16f, 104.16f, 0.0f, false, true, -91.55f, 103.26f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.45f, -4.0f);
        pathBuilder.verticalLineTo(152.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, -8.25f, -7.47f);
        pathBuilder.horizontalLineTo(136.0f);
        pathBuilder.verticalLineTo(112.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 167.73f, 80.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.53f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 96.27f, 152.0f);
        pathBuilder.horizontalLineTo(120.0f);
        pathBuilder.verticalLineToRelative(75.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.44f, 4.0f);
        pathBuilder.arcTo(104.15f, 104.15f, 0.0f, false, true, 24.07f, 124.09f);
        pathBuilder.curveToRelative(2.0f, -54.0f, 45.74f, -97.9f, 99.78f, -100.0f);
        pathBuilder.arcTo(104.12f, 104.12f, 0.0f, false, true, 232.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _facebookLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
