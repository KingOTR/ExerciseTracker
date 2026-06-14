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

/* compiled from: Shieldchevron.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShieldChevron", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getShieldChevron", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shieldChevron", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShieldchevronKt {
    private static ImageVector _shieldChevron;

    public static final ImageVector getShieldChevron(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _shieldChevron;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShieldChevron", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 44.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.curveToRelative(0.0f, 51.16f, 24.73f, 82.12f, 45.47f, 99.1f);
        pathBuilder.curveToRelative(22.4f, 18.32f, 44.55f, 24.5f, 45.48f, 24.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.1f, 0.0f);
        pathBuilder.curveToRelative(0.93f, -0.26f, 23.08f, -6.44f, 45.48f, -24.76f);
        pathBuilder.curveToRelative(20.74f, -17.0f, 45.47f, -47.94f, 45.47f, -99.1f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(169.71f, 204.71f);
        pathBuilder.arcTo(132.45f, 132.45f, 0.0f, false, true, 128.0f, 227.82f);
        pathBuilder.arcToRelative(132.23f, 132.23f, 0.0f, false, true, -41.71f, -23.11f);
        pathBuilder.arcTo(115.08f, 115.08f, 0.0f, false, true, 59.21f, 173.0f);
        pathBuilder.lineTo(128.0f, 124.88f);
        pathBuilder.lineTo(196.79f, 173.0f);
        pathBuilder.arcTo(115.08f, 115.08f, 0.0f, false, true, 169.71f, 204.71f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 20.0f, -3.85f, 38.0f, -11.46f, 53.89f);
        pathBuilder.lineToRelative(-70.25f, -49.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.58f, 0.0f);
        pathBuilder.lineTo(55.46f, 165.89f);
        pathBuilder.curveTo(47.85f, 150.0f, 44.0f, 132.0f, 44.0f, 112.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shieldChevron = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
