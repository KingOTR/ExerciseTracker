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

/* compiled from: Androidlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AndroidLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAndroidLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_androidLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidlogoKt {
    private static ImageVector _androidLogo;

    public static final ImageVector getAndroidLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _androidLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AndroidLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(174.0f, 148.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 138.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 92.0f, 138.0f);
        pathBuilder.close();
        pathBuilder.moveTo(238.0f, 160.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f);
        pathBuilder.lineTo(32.0f, 198.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f);
        pathBuilder.lineTo(18.0f, 161.13f);
        pathBuilder.arcTo(111.44f, 111.44f, 0.0f, false, true, 54.28f, 78.76f);
        pathBuilder.lineTo(27.76f, 52.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, -8.48f);
        pathBuilder.lineTo(63.61f, 71.12f);
        pathBuilder.arcToRelative(108.59f, 108.59f, 0.0f, false, true, 64.0f, -21.12f);
        pathBuilder.lineTo(128.0f, 50.0f);
        pathBuilder.arcToRelative(109.17f, 109.17f, 0.0f, false, true, 64.58f, 20.93f);
        pathBuilder.lineToRelative(27.18f, -27.17f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.lineTo(201.93f, 78.55f);
        pathBuilder.curveToRelative(1.26f, 1.15f, 2.5f, 2.32f, 3.72f, 3.53f);
        pathBuilder.arcTo(109.29f, 109.29f, 0.0f, false, true, 238.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 160.0f);
        pathBuilder.arcToRelative(98.0f, 98.0f, 0.0f, false, false, -98.0f, -98.0f);
        pathBuilder.horizontalLineToRelative(-0.35f);
        pathBuilder.curveTo(73.81f, 62.19f, 30.0f, 106.66f, 30.0f, 161.13f);
        pathBuilder.lineTo(30.0f, 184.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f);
        pathBuilder.lineTo(224.0f, 186.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _androidLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
