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

/* compiled from: Snapchatlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SnapchatLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSnapchatLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_snapchatLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapchatlogoKt {
    private static ImageVector _snapchatLogo;

    public static final ImageVector getSnapchatLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _snapchatLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SnapchatLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.47f, 189.74f);
        pathBuilder.curveToRelative(-7.1f, 6.67f, -17.67f, 7.71f, -27.88f, 8.72f);
        pathBuilder.curveToRelative(-6.31f, 0.62f, -12.83f, 1.27f, -16.39f, 3.23f);
        pathBuilder.curveToRelative(-3.37f, 1.86f, -6.85f, 6.62f, -10.21f, 11.22f);
        pathBuilder.curveToRelative(-5.4f, 7.41f, -11.53f, 15.8f, -21.23f, 18.28f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(26.35f, 26.35f, 0.0f, false, true, -6.64f, 0.81f);
        pathBuilder.curveToRelative(-6.88f, 0.0f, -13.7f, -2.32f, -19.9f, -4.43f);
        pathBuilder.curveToRelative(-5.55f, -1.89f, -10.8f, -3.68f, -15.21f, -3.68f);
        pathBuilder.reflectiveCurveToRelative(-9.66f, 1.79f, -15.21f, 3.68f);
        pathBuilder.curveToRelative(-8.19f, 2.79f, -17.47f, 6.0f, -26.54f, 3.62f);
        pathBuilder.curveToRelative(-9.71f, -2.48f, -15.84f, -10.87f, -21.24f, -18.28f);
        pathBuilder.curveToRelative(-3.36f, -4.6f, -6.84f, -9.36f, -10.21f, -11.22f);
        pathBuilder.curveToRelative(-3.56f, -2.0f, -10.08f, -2.61f, -16.38f, -3.23f);
        pathBuilder.curveToRelative(-10.22f, -1.0f, -20.79f, -2.05f, -27.89f, -8.72f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.77f, -13.36f);
        pathBuilder.curveToRelative(0.09f, 0.0f, 12.84f, -4.86f, 25.36f, -19.0f);
        pathBuilder.arcToRelative(94.0f, 94.0f, 0.0f, false, false, 17.74f, -30.2f);
        pathBuilder.lineTo(37.0f, 119.43f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 43.0f, 104.57f);
        pathBuilder.lineToRelative(17.85f, 7.15f);
        pathBuilder.arcTo(151.24f, 151.24f, 0.0f, false, false, 64.0f, 80.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f);
        pathBuilder.arcToRelative(149.0f, 149.0f, 0.0f, false, false, 3.21f, 31.73f);
        pathBuilder.lineTo(213.0f, 104.57f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 219.0f, 119.43f);
        pathBuilder.lineToRelative(-19.3f, 7.72f);
        pathBuilder.curveToRelative(14.08f, 38.35f, 42.64f, 49.09f, 43.0f, 49.23f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.77f, 13.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _snapchatLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
