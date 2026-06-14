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

/* compiled from: Footprints.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Footprints", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFootprints", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_footprints", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FootprintsKt {
    private static ImageVector _footprints;

    public static final ImageVector getFootprints(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _footprints;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Footprints", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 188.0f);
        pathBuilder.lineTo(152.0f, 188.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f);
        pathBuilder.lineTo(212.0f, 192.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 204.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 164.0f);
        pathBuilder.lineTo(48.0f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f);
        pathBuilder.lineTo(108.0f, 168.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 180.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 20.0f);
        pathBuilder.curveToRelative(-9.82f, 0.0f, -20.07f, 9.75f, -28.12f, 26.75f);
        pathBuilder.curveToRelative(-13.39f, 28.27f, -18.0f, 70.05f, -0.23f, 91.78f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.1f, 1.47f);
        pathBuilder.horizontalLineToRelative(50.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.1f, -1.47f);
        pathBuilder.curveToRelative(17.79f, -21.73f, 13.16f, -63.51f, -0.23f, -91.78f);
        pathBuilder.curveTo(96.08f, 29.75f, 85.83f, 20.0f, 76.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(99.3f, 132.0f);
        pathBuilder.lineTo(52.71f, 132.0f);
        pathBuilder.curveToRelative(-13.8f, -19.0f, -9.79f, -56.08f, 2.4f, -81.82f);
        pathBuilder.curveTo(61.59f, 36.5f, 69.59f, 28.0f, 76.0f, 28.0f);
        pathBuilder.reflectiveCurveToRelative(14.42f, 8.5f, 20.9f, 22.18f);
        pathBuilder.curveTo(109.09f, 75.92f, 113.1f, 113.0f, 99.3f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.74f, 164.0f);
        pathBuilder.horizontalLineToRelative(50.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.1f, -1.47f);
        pathBuilder.curveToRelative(17.79f, -21.73f, 13.16f, -63.51f, -0.23f, -91.78f);
        pathBuilder.curveTo(200.07f, 53.75f, 189.82f, 44.0f, 180.0f, 44.0f);
        pathBuilder.reflectiveCurveToRelative(-20.08f, 9.75f, -28.13f, 26.75f);
        pathBuilder.curveToRelative(-13.39f, 28.27f, -18.0f, 70.05f, -0.23f, 91.78f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 154.74f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(159.1f, 74.18f);
        pathBuilder.curveTo(165.58f, 60.5f, 173.58f, 52.0f, 180.0f, 52.0f);
        pathBuilder.reflectiveCurveToRelative(14.41f, 8.5f, 20.89f, 22.18f);
        pathBuilder.curveToRelative(12.19f, 25.74f, 16.2f, 62.82f, 2.4f, 81.82f);
        pathBuilder.lineTo(156.7f, 156.0f);
        pathBuilder.curveTo(142.9f, 137.0f, 146.91f, 99.92f, 159.1f, 74.18f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _footprints = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
