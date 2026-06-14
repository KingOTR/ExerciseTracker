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

/* compiled from: Shieldcheckered.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShieldCheckered", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getShieldCheckered", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shieldCheckered", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShieldcheckeredKt {
    private static ImageVector _shieldCheckered;

    public static final ImageVector getShieldCheckered(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _shieldCheckered;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShieldCheckered", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 44.0f);
        pathBuilder.lineTo(48.0f, 44.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.curveToRelative(0.0f, 51.16f, 24.73f, 82.12f, 45.47f, 99.1f);
        pathBuilder.curveToRelative(22.4f, 18.32f, 44.55f, 24.5f, 45.48f, 24.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.1f, 0.0f);
        pathBuilder.curveToRelative(0.93f, -0.26f, 23.08f, -6.44f, 45.48f, -24.76f);
        pathBuilder.curveToRelative(20.74f, -17.0f, 45.47f, -47.94f, 45.47f, -99.1f);
        pathBuilder.lineTo(220.0f, 56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.quadToRelative(0.0f, 6.12f, -0.49f, 12.0f);
        pathBuilder.lineTo(132.0f, 124.0f);
        pathBuilder.lineTo(132.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(76.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(76.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.lineTo(44.49f, 124.0f);
        pathBuilder.quadTo(44.0f, 118.12f, 44.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(45.38f, 132.0f);
        pathBuilder.lineTo(124.0f, 132.0f);
        pathBuilder.verticalLineToRelative(94.44f);
        pathBuilder.arcToRelative(135.16f, 135.16f, 0.0f, false, true, -37.71f, -21.73f);
        pathBuilder.curveTo(63.27f, 185.78f, 49.56f, 161.38f, 45.38f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(169.71f, 204.71f);
        pathBuilder.arcTo(134.9f, 134.9f, 0.0f, false, true, 132.0f, 226.44f);
        pathBuilder.lineTo(132.0f, 132.0f);
        pathBuilder.horizontalLineToRelative(78.62f);
        pathBuilder.curveTo(206.44f, 161.38f, 192.73f, 185.78f, 169.71f, 204.71f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shieldCheckered = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
