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

/* compiled from: Skull.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Skull", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSkull", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_skull", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SkullKt {
    private static ImageVector _skull;

    public static final ImageVector getSkull(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _skull;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Skull", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(92.0f, 108.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 92.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 148.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 92.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 108.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 164.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 148.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 164.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.curveTo(72.86f, 20.0f, 28.0f, 63.07f, 28.0f, 116.0f);
        pathBuilder.curveToRelative(0.0f, 33.43f, 18.33f, 64.64f, 48.0f, 82.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(180.0f, 198.0f);
        pathBuilder.curveToRelative(29.67f, -17.38f, 48.0f, -48.59f, 48.0f, -82.0f);
        pathBuilder.curveTo(228.0f, 63.07f, 183.14f, 20.0f, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(174.06f, 192.19f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.06f, 3.5f);
        pathBuilder.lineTo(172.0f, 216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(148.0f, 220.0f);
        pathBuilder.lineTo(148.0f, 192.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.lineTo(116.0f, 220.0f);
        pathBuilder.lineTo(116.0f, 192.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.lineTo(88.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(84.0f, 195.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.06f, -3.5f);
        pathBuilder.curveTo(53.6f, 176.48f, 36.0f, 147.29f, 36.0f, 116.0f);
        pathBuilder.curveToRelative(0.0f, -48.52f, 41.27f, -88.0f, 92.0f, -88.0f);
        pathBuilder.reflectiveCurveToRelative(92.0f, 39.48f, 92.0f, 88.0f);
        pathBuilder.curveTo(220.0f, 147.29f, 202.4f, 176.48f, 174.06f, 192.19f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _skull = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
