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

/* compiled from: Campfire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Campfire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCampfire", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_campfire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CampfireKt {
    private static ImageVector _campfire;

    public static final ImageVector getCampfire(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _campfire;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Campfire", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(219.81f, 225.21f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 228.0f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, -1.21f, -0.19f);
        pathBuilder.lineTo(128.0f, 200.2f);
        pathBuilder.lineTo(41.21f, 227.81f);
        pathBuilder.arcTo(3.92f, 3.92f, 0.0f, false, true, 40.0f, 228.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.21f, -7.81f);
        pathBuilder.lineToRelative(76.0f, -24.19f);
        pathBuilder.lineToRelative(-76.0f, -24.19f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.42f, -7.62f);
        pathBuilder.lineTo(128.0f, 191.8f);
        pathBuilder.lineToRelative(86.79f, -27.61f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.42f, 7.62f);
        pathBuilder.lineToRelative(-76.0f, 24.19f);
        pathBuilder.lineToRelative(76.0f, 24.19f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 219.81f, 225.21f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 108.0f);
        pathBuilder.curveToRelative(0.0f, -19.0f, 9.38f, -38.85f, 27.12f, -57.27f);
        pathBuilder.arcTo(152.0f, 152.0f, 0.0f, false, true, 125.9f, 28.59f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.2f, 0.0f);
        pathBuilder.arcToRelative(152.0f, 152.0f, 0.0f, false, true, 26.78f, 22.14f);
        pathBuilder.curveTo(174.62f, 69.15f, 184.0f, 89.0f, 184.0f, 108.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, -54.56f, 56.0f);
        pathBuilder.curveToRelative(-0.48f, 0.0f, -1.0f, 0.0f, -1.44f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.0f, -1.44f, 0.0f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, true, 72.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 156.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.curveToRelative(0.0f, -17.39f, -14.37f, -30.53f, -20.0f, -35.0f);
        pathBuilder.curveToRelative(-5.63f, 4.48f, -20.0f, 17.62f, -20.0f, 35.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 128.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 108.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, 23.28f, 41.13f);
        pathBuilder.arcTo(27.83f, 27.83f, 0.0f, false, true, 100.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -25.84f, 24.73f, -42.63f, 25.78f, -43.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.44f, 0.0f);
        pathBuilder.curveToRelative(1.05f, 0.7f, 25.78f, 17.49f, 25.78f, 43.33f);
        pathBuilder.arcToRelative(27.83f, 27.83f, 0.0f, false, true, -3.28f, 13.13f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, false, 176.0f, 108.0f);
        pathBuilder.curveToRelative(0.0f, -36.37f, -38.49f, -64.76f, -48.0f, -71.21f);
        pathBuilder.curveTo(118.5f, 43.25f, 80.0f, 71.68f, 80.0f, 108.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _campfire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
