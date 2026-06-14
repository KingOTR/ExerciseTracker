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

/* compiled from: Patreonlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PatreonLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPatreonLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_patreonLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PatreonlogoKt {
    private static ImageVector _patreonLogo;

    public static final ImageVector getPatreonLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(185.85f, 35.7f);
        pathBuilder.curveToRelative(-18.11f, -7.41f, -39.68f, -9.56f, -60.76f, -6.06f);
        pathBuilder.curveTo(102.5f, 33.4f, 83.0f, 43.1f, 68.62f, 57.7f);
        pathBuilder.curveTo(58.0f, 68.5f, 45.11f, 89.65f, 44.06f, 129.0f);
        pathBuilder.curveToRelative(-0.69f, 25.95f, 4.29f, 54.29f, 13.3f, 75.79f);
        pathBuilder.curveTo(65.8f, 224.92f, 76.51f, 236.0f, 87.52f, 236.0f);
        pathBuilder.curveToRelative(20.5f, 0.0f, 29.78f, -18.13f, 39.61f, -37.32f);
        pathBuilder.curveToRelative(7.19f, -14.05f, 14.63f, -28.57f, 26.86f, -36.87f);
        pathBuilder.curveToRelative(6.25f, -4.23f, 14.39f, -7.37f, 23.0f, -10.7f);
        pathBuilder.curveToRelative(22.72f, -8.76f, 51.0f, -19.67f, 51.0f, -57.94f);
        pathBuilder.curveTo(228.0f, 67.6f, 212.64f, 46.66f, 185.85f, 35.7f);
        pathBuilder.close();
        pathBuilder.moveTo(174.13f, 143.64f);
        pathBuilder.curveToRelative(-9.06f, 3.5f, -17.63f, 6.8f, -24.63f, 11.55f);
        pathBuilder.curveToRelative(-13.93f, 9.45f, -22.2f, 25.6f, -29.49f, 39.84f);
        pathBuilder.curveToRelative(-9.06f, 17.69f, -16.88f, 33.0f, -32.49f, 33.0f);
        pathBuilder.curveToRelative(-7.36f, 0.0f, -15.88f, -9.83f, -22.78f, -26.3f);
        pathBuilder.curveToRelative(-8.6f, -20.51f, -13.34f, -47.61f, -12.68f, -72.49f);
        pathBuilder.curveToRelative(1.0f, -36.75f, 12.64f, -56.12f, 22.26f, -65.9f);
        pathBuilder.curveToRelative(18.86f, -19.19f, 45.53f, -27.23f, 70.33f, -27.23f);
        pathBuilder.curveToRelative(13.88f, 0.0f, 27.18f, 2.52f, 38.17f, 7.0f);
        pathBuilder.curveTo(215.17f, 56.34f, 220.0f, 80.15f, 220.0f, 93.17f);
        pathBuilder.curveTo(220.0f, 126.0f, 196.68f, 135.0f, 174.13f, 143.64f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _patreonLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
