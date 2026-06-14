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

/* compiled from: Cake.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCake", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cake", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CakeKt {
    private static ImageVector _cake;

    public static final ImageVector getCake(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _cake;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cake", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.0f, 112.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.lineTo(132.0f, 92.0f);
        pathBuilder.lineTo(132.0f, 75.71f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 156.0f, 48.0f);
        pathBuilder.curveToRelative(0.0f, -25.84f, -24.73f, -42.63f, -25.78f, -43.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.44f, 0.0f);
        pathBuilder.curveTo(124.73f, 5.37f, 100.0f, 22.16f, 100.0f, 48.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 24.0f, 27.71f);
        pathBuilder.lineTo(124.0f, 92.0f);
        pathBuilder.lineTo(48.0f, 92.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f);
        pathBuilder.verticalLineToRelative(23.33f);
        pathBuilder.arcToRelative(36.85f, 36.85f, 0.0f, false, false, 8.0f, 22.91f);
        pathBuilder.lineTo(36.0f, 200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(200.0f, 220.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(220.0f, 158.24f);
        pathBuilder.arcToRelative(36.85f, 36.85f, 0.0f, false, false, 8.0f, -22.91f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 48.0f);
        pathBuilder.curveToRelative(0.0f, -17.39f, 14.37f, -30.53f, 20.0f, -35.0f);
        pathBuilder.curveToRelative(5.63f, 4.48f, 20.0f, 17.62f, 20.0f, 35.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 212.0f);
        pathBuilder.lineTo(56.0f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.lineTo(44.0f, 165.73f);
        pathBuilder.arcTo(35.16f, 35.16f, 0.0f, false, false, 63.0f, 172.0f);
        pathBuilder.arcToRelative(36.13f, 36.13f, 0.0f, false, false, 33.0f, -19.48f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 64.0f, 0.0f);
        pathBuilder.arcTo(36.13f, 36.13f, 0.0f, false, false, 192.0f, 172.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.arcToRelative(35.16f, 35.16f, 0.0f, false, false, 19.0f, -6.26f);
        pathBuilder.lineTo(212.0f, 200.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 135.33f);
        pathBuilder.curveToRelative(0.0f, 15.39f, -12.21f, 28.25f, -27.21f, 28.66f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 164.0f, 136.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.79f, 28.0f);
        pathBuilder.curveToRelative(-15.0f, -0.41f, -27.21f, -13.27f, -27.21f, -28.66f);
        pathBuilder.lineTo(36.0f, 112.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.lineTo(208.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cake = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
