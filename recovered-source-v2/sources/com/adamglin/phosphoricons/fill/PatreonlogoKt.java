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

/* compiled from: Patreonlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PatreonLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPatreonLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_patreonLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PatreonlogoKt {
    private static ImageVector _patreonLogo;

    public static final ImageVector getPatreonLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 93.17f);
        pathBuilder.curveToRelative(0.0f, 41.0f, -29.69f, 52.47f, -53.55f, 61.67f);
        pathBuilder.curveToRelative(-8.41f, 3.24f, -16.35f, 6.3f, -22.21f, 10.28f);
        pathBuilder.curveToRelative(-11.39f, 7.72f, -18.59f, 21.78f, -25.55f, 35.38f);
        pathBuilder.curveToRelative(-9.94f, 19.42f, -20.23f, 39.5f, -43.17f, 39.5f);
        pathBuilder.curveToRelative(-12.91f, 0.0f, -24.61f, -11.64f, -33.85f, -33.66f);
        pathBuilder.reflectiveCurveToRelative(-14.31f, -51.0f, -13.61f, -77.45f);
        pathBuilder.curveToRelative(1.08f, -40.65f, 14.58f, -62.68f, 25.7f, -74.0f);
        pathBuilder.curveToRelative(14.95f, -15.2f, 35.24f, -25.3f, 58.68f, -29.2f);
        pathBuilder.curveToRelative(21.79f, -3.62f, 44.14f, -1.38f, 62.93f, 6.3f);
        pathBuilder.curveTo(215.73f, 43.6f, 232.0f, 65.9f, 232.0f, 93.17f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _patreonLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
