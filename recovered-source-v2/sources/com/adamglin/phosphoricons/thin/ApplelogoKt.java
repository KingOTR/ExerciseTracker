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

/* compiled from: Applelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AppleLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getAppleLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_appleLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApplelogoKt {
    private static ImageVector _appleLogo;

    public static final ImageVector getAppleLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _appleLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AppleLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(218.27f, 169.49f);
        pathBuilder.curveTo(199.86f, 156.84f, 196.0f, 135.6f, 196.0f, 120.0f);
        pathBuilder.curveToRelative(0.0f, -19.17f, 14.25f, -35.53f, 22.75f, -43.57f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.81f);
        pathBuilder.curveTo(207.0f, 59.48f, 186.59f, 52.0f, 168.0f, 52.0f);
        pathBuilder.arcToRelative(68.3f, 68.3f, 0.0f, false, false, -40.0f, 13.0f);
        pathBuilder.arcToRelative(67.61f, 67.61f, 0.0f, false, false, -87.88f, 7.0f);
        pathBuilder.arcTo(70.65f, 70.65f, 0.0f, false, false, 20.0f, 123.3f);
        pathBuilder.arcToRelative(123.11f, 123.11f, 0.0f, false, false, 38.9f, 86.92f);
        pathBuilder.arcTo(35.81f, 35.81f, 0.0f, false, false, 83.6f, 220.0f);
        pathBuilder.horizontalLineToRelative(87.7f);
        pathBuilder.arcToRelative(35.84f, 35.84f, 0.0f, false, false, 26.19f, -11.3f);
        pathBuilder.arcToRelative(119.93f, 119.93f, 0.0f, false, false, 17.24f, -23.79f);
        pathBuilder.curveToRelative(6.08f, -11.1f, 5.42f, -12.62f, 4.94f, -13.72f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 218.27f, 169.49f);
        pathBuilder.close();
        pathBuilder.moveTo(191.63f, 203.26f);
        pathBuilder.arcTo(27.83f, 27.83f, 0.0f, false, true, 171.3f, 212.0f);
        pathBuilder.lineTo(83.6f, 212.0f);
        pathBuilder.arcToRelative(27.84f, 27.84f, 0.0f, false, true, -19.19f, -7.6f);
        pathBuilder.arcTo(115.15f, 115.15f, 0.0f, false, true, 28.0f, 123.09f);
        pathBuilder.arcTo(62.55f, 62.55f, 0.0f, false, true, 45.81f, 77.66f);
        pathBuilder.arcTo(58.78f, 58.78f, 0.0f, false, true, 88.0f, 60.0f);
        pathBuilder.horizontalLineToRelative(0.84f);
        pathBuilder.arcToRelative(59.37f, 59.37f, 0.0f, false, true, 36.66f, 13.15f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, 0.0f);
        pathBuilder.arcTo(59.35f, 59.35f, 0.0f, false, true, 168.0f, 60.0f);
        pathBuilder.curveToRelative(15.12f, 0.0f, 31.45f, 5.41f, 42.11f, 13.73f);
        pathBuilder.curveTo(200.68f, 83.42f, 188.0f, 100.16f, 188.0f, 120.0f);
        pathBuilder.curveToRelative(0.0f, 23.79f, 8.0f, 42.44f, 23.12f, 54.17f);
        pathBuilder.arcTo(107.64f, 107.64f, 0.0f, false, true, 191.63f, 203.26f);
        pathBuilder.close();
        pathBuilder.moveTo(132.13f, 31.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 167.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -27.12f, 21.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 136.0f, 36.0f);
        pathBuilder.arcToRelative(3.87f, 3.87f, 0.0f, false, true, -1.0f, -0.13f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 132.13f, 31.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _appleLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
