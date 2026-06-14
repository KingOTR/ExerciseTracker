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

/* compiled from: Cowboyhat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CowboyHat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCowboyHat", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cowboyHat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CowboyhatKt {
    private static ImageVector _cowboyHat;

    public static final ImageVector getCowboyHat(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _cowboyHat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CowboyHat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 124.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.39f, 1.88f);
        pathBuilder.arcTo(174.9f, 174.9f, 0.0f, false, true, 193.0f, 151.81f);
        pathBuilder.lineToRelative(-18.62f, -98.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 155.0f, 46.69f);
        pathBuilder.lineTo(130.5f, 67.13f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.94f, 0.05f);
        pathBuilder.lineTo(100.9f, 46.64f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.29f, 7.15f);
        pathBuilder.lineTo(63.0f, 151.81f);
        pathBuilder.arcToRelative(174.9f, 174.9f, 0.0f, false, true, -19.6f, -25.93f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 124.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 72.0f);
        pathBuilder.lineTo(216.0f, 196.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(89.48f, 55.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.37f, -2.44f);
        pathBuilder.lineTo(120.5f, 73.38f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.06f, -0.06f);
        pathBuilder.lineToRelative(24.53f, -20.43f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, 3.89f, -0.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.55f, 3.0f);
        pathBuilder.lineTo(181.11f, 132.0f);
        pathBuilder.lineTo(74.89f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 188.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -2.15f, -55.92f);
        pathBuilder.curveTo(58.3f, 164.0f, 80.59f, 180.0f, 97.9f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 188.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.27f, 0.0f, -11.78f, -0.21f, -27.77f, -7.84f);
        pathBuilder.arcToRelative(118.23f, 118.23f, 0.0f, false, true, -30.43f, -21.4f);
        pathBuilder.lineTo(73.37f, 140.0f);
        pathBuilder.lineTo(182.63f, 140.0f);
        pathBuilder.lineToRelative(3.56f, 18.76f);
        pathBuilder.arcToRelative(118.23f, 118.23f, 0.0f, false, true, -30.43f, 21.4f);
        pathBuilder.curveTo(139.77f, 187.79f, 128.26f, 188.0f, 128.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 188.0f);
        pathBuilder.lineTo(158.1f, 188.0f);
        pathBuilder.curveToRelative(17.31f, -8.0f, 39.6f, -24.0f, 60.05f, -55.92f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 216.0f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cowboyHat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
