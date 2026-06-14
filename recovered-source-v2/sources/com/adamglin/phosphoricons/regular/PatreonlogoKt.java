package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Patreonlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PatreonLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPatreonLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_patreonLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PatreonlogoKt {
    private static ImageVector _patreonLogo;

    public static final ImageVector getPatreonLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _patreonLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PatreonLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(187.37f, 32.0f);
        pathBuilder.curveToRelative(-18.79f, -7.68f, -41.14f, -9.92f, -62.93f, -6.3f);
        pathBuilder.curveToRelative(-23.44f, 3.9f, -43.73f, 14.0f, -58.68f, 29.2f);
        pathBuilder.curveToRelative(-11.12f, 11.32f, -24.62f, 33.35f, -25.7f, 74.0f);
        pathBuilder.curveToRelative(-0.7f, 26.49f, 4.39f, 55.44f, 13.61f, 77.45f);
        pathBuilder.reflectiveCurveTo(74.61f, 240.0f, 87.52f, 240.0f);
        pathBuilder.curveToRelative(22.94f, 0.0f, 33.23f, -20.08f, 43.17f, -39.5f);
        pathBuilder.curveToRelative(7.0f, -13.6f, 14.16f, -27.66f, 25.55f, -35.38f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(5.86f, -4.0f, 13.8f, -7.0f, 22.21f, -10.28f);
        pathBuilder.curveToRelative(23.86f, -9.2f, 53.55f, -20.66f, 53.55f, -61.67f);
        pathBuilder.curveTo(232.0f, 65.9f, 215.73f, 43.6f, 187.37f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.69f, 139.91f);
        pathBuilder.curveToRelative(-9.28f, 3.58f, -18.05f, 7.0f, -25.43f, 12.0f);
        pathBuilder.curveToRelative(-14.78f, 10.0f, -23.3f, 26.66f, -30.81f, 41.33f);
        pathBuilder.curveTo(106.67f, 212.3f, 100.05f, 224.0f, 87.52f, 224.0f);
        pathBuilder.curveToRelative(-4.52f, 0.0f, -12.18f, -7.37f, -19.09f, -23.85f);
        pathBuilder.curveToRelative(-8.39f, -20.0f, -13.0f, -46.49f, -12.37f, -70.83f);
        pathBuilder.curveToRelative(0.73f, -27.66f, 8.23f, -50.11f, 21.11f, -63.21f);
        pathBuilder.curveTo(95.23f, 47.74f, 120.79f, 40.0f, 144.57f, 40.0f);
        pathBuilder.arcToRelative(98.48f, 98.48f, 0.0f, false, true, 36.74f, 6.76f);
        pathBuilder.curveToRelative(13.0f, 5.3f, 34.69f, 18.38f, 34.69f, 46.37f);
        pathBuilder.curveTo(216.0f, 123.21f, 195.93f, 131.0f, 172.69f, 139.91f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _patreonLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
