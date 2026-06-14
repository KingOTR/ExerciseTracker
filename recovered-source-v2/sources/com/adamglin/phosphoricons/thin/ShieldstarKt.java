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

/* compiled from: Shieldstar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShieldStar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getShieldStar", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shieldStar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShieldstarKt {
    private static ImageVector _shieldStar;

    public static final ImageVector getShieldStar(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _shieldStar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShieldStar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(171.71f, 118.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.22f, 5.2f);
        pathBuilder.lineToRelative(-35.16f, 14.07f);
        pathBuilder.lineTo(155.2f, 165.6f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.4f, 4.8f);
        pathBuilder.lineTo(128.0f, 142.67f);
        pathBuilder.lineTo(107.2f, 170.4f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.4f, -4.8f);
        pathBuilder.lineToRelative(20.87f, -27.82f);
        pathBuilder.lineTo(86.51f, 123.71f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.0f, -7.42f);
        pathBuilder.lineTo(124.0f, 130.09f);
        pathBuilder.lineTo(124.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(34.09f);
        pathBuilder.lineToRelative(34.51f, -13.8f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 171.71f, 118.51f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.curveToRelative(0.0f, 51.16f, -24.73f, 82.12f, -45.47f, 99.1f);
        pathBuilder.curveToRelative(-22.4f, 18.32f, -44.55f, 24.5f, -45.48f, 24.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.1f, 0.0f);
        pathBuilder.curveToRelative(-0.93f, -0.26f, -23.08f, -6.44f, -45.48f, -24.76f);
        pathBuilder.curveTo(60.73f, 194.12f, 36.0f, 163.16f, 36.0f, 112.0f);
        pathBuilder.lineTo(36.0f, 56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 44.0f);
        pathBuilder.lineTo(208.0f, 44.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(48.0f, 52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.curveToRelative(0.0f, 38.44f, 14.23f, 69.63f, 42.29f, 92.71f);
        pathBuilder.arcTo(132.23f, 132.23f, 0.0f, false, false, 128.0f, 227.82f);
        pathBuilder.arcToRelative(132.45f, 132.45f, 0.0f, false, false, 41.71f, -23.11f);
        pathBuilder.curveTo(197.77f, 181.63f, 212.0f, 150.44f, 212.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shieldStar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
