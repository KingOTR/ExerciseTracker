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

/* compiled from: Snapchatlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SnapchatLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSnapchatLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_snapchatLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapchatlogoKt {
    private static ImageVector _snapchatLogo;

    public static final ImageVector getSnapchatLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(251.75f, 181.48f);
        pathBuilder.arcToRelative(11.88f, 11.88f, 0.0f, false, false, -7.66f, -8.84f);
        pathBuilder.curveToRelative(-1.42f, -0.54f, -25.86f, -10.18f, -39.35f, -43.23f);
        pathBuilder.lineToRelative(15.68f, -6.27f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -8.91f, -22.28f);
        pathBuilder.lineToRelative(-13.35f, 5.34f);
        pathBuilder.arcTo(150.23f, 150.23f, 0.0f, false, true, 196.0f, 80.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 60.0f, 80.0f);
        pathBuilder.arcToRelative(151.26f, 151.26f, 0.0f, false, true, -2.18f, 26.23f);
        pathBuilder.lineToRelative(-13.36f, -5.34f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -8.91f, 22.28f);
        pathBuilder.lineToRelative(15.68f, 6.27f);
        pathBuilder.curveTo(37.74f, 162.46f, 13.31f, 172.09f, 12.0f, 172.6f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.17f, 20.05f);
        pathBuilder.curveToRelative(8.09f, 7.6f, 19.85f, 8.76f, 30.23f, 9.79f);
        pathBuilder.curveToRelative(5.62f, 0.55f, 12.0f, 1.18f, 14.85f, 2.75f);
        pathBuilder.curveToRelative(2.59f, 1.42f, 5.94f, 6.0f, 8.9f, 10.07f);
        pathBuilder.curveToRelative(5.51f, 7.56f, 12.38f, 17.0f, 23.47f, 19.8f);
        pathBuilder.curveToRelative(10.23f, 2.61f, 20.11f, -0.75f, 28.82f, -3.72f);
        pathBuilder.curveToRelative(5.0f, -1.7f, 10.17f, -3.46f, 13.92f, -3.46f);
        pathBuilder.reflectiveCurveToRelative(8.92f, 1.76f, 13.92f, 3.46f);
        pathBuilder.curveToRelative(6.51f, 2.22f, 13.67f, 4.66f, 21.15f, 4.66f);
        pathBuilder.arcToRelative(30.9f, 30.9f, 0.0f, false, false, 7.67f, -0.94f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(11.09f, -2.84f, 18.0f, -12.24f, 23.47f, -19.8f);
        pathBuilder.curveToRelative(3.0f, -4.0f, 6.31f, -8.65f, 8.9f, -10.07f);
        pathBuilder.curveToRelative(2.85f, -1.57f, 9.23f, -2.2f, 14.85f, -2.75f);
        pathBuilder.curveToRelative(10.38f, -1.0f, 22.14f, -2.19f, 30.23f, -9.79f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 251.75f, 181.48f);
        pathBuilder.close();
        pathBuilder.moveTo(191.53f, 184.16f);
        pathBuilder.curveToRelative(-7.27f, 4.0f, -12.29f, 10.88f, -16.72f, 17.0f);
        pathBuilder.curveToRelative(-3.25f, 4.45f, -7.3f, 10.0f, -10.0f, 10.7f);
        pathBuilder.curveToRelative(-3.3f, 0.85f, -9.32f, -1.2f, -15.14f, -3.18f);
        pathBuilder.curveToRelative(-6.53f, -2.23f, -13.93f, -4.75f, -21.65f, -4.75f);
        pathBuilder.reflectiveCurveToRelative(-15.12f, 2.52f, -21.65f, 4.75f);
        pathBuilder.curveToRelative(-5.82f, 2.0f, -11.84f, 4.0f, -15.14f, 3.18f);
        pathBuilder.curveToRelative(-2.74f, -0.7f, -6.79f, -6.25f, -10.0f, -10.7f);
        pathBuilder.curveToRelative(-4.43f, -6.07f, -9.45f, -13.0f, -16.72f, -17.0f);
        pathBuilder.curveToRelative(-5.75f, -3.17f, -12.44f, -4.34f, -19.16f, -5.1f);
        pathBuilder.arcToRelative(105.29f, 105.29f, 0.0f, false, false, 7.63f, -7.62f);
        pathBuilder.curveToRelative(8.64f, -9.57f, 18.29f, -24.0f, 24.52f, -44.4f);
        pathBuilder.arcToRelative(0.14f, 0.14f, 0.0f, false, false, 0.0f, -0.06f);
        pathBuilder.arcToRelative(11.24f, 11.24f, 0.0f, false, false, 0.63f, -2.13f);
        pathBuilder.arcTo(162.57f, 162.57f, 0.0f, false, false, 84.0f, 80.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 88.0f, 0.0f);
        pathBuilder.arcToRelative(162.57f, 162.57f, 0.0f, false, false, 5.92f, 44.88f);
        pathBuilder.arcToRelative(12.64f, 12.64f, 0.0f, false, false, 0.63f, 2.13f);
        pathBuilder.arcToRelative(0.14f, 0.14f, 0.0f, false, false, 0.0f, 0.06f);
        pathBuilder.curveToRelative(6.23f, 20.44f, 15.88f, 34.83f, 24.52f, 44.4f);
        pathBuilder.arcToRelative(105.29f, 105.29f, 0.0f, false, false, 7.63f, 7.62f);
        pathBuilder.curveTo(204.0f, 179.82f, 197.29f, 181.0f, 191.53f, 184.16f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _snapchatLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
