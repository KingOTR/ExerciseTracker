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

/* compiled from: Champagne.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Champagne", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getChampagne", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_champagne", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChampagneKt {
    private static ImageVector _champagne;

    public static final ImageVector getChampagne(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _champagne;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Champagne", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(142.3f, 12.0f);
        pathBuilder.lineTo(97.7f, 12.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, 2.76f);
        pathBuilder.curveToRelative(-1.45f, 4.47f, -35.2f, 109.75f, -6.13f, 149.78f);
        pathBuilder.curveTo(94.5f, 173.79f, 104.0f, 178.92f, 116.0f, 179.83f);
        pathBuilder.lineTo(116.0f, 236.0f);
        pathBuilder.lineTo(96.0f, 236.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(124.0f, 236.0f);
        pathBuilder.lineTo(124.0f, 179.83f);
        pathBuilder.curveToRelative(12.0f, -0.91f, 21.5f, -6.0f, 28.22f, -15.29f);
        pathBuilder.curveToRelative(29.08f, -40.0f, -4.67f, -145.31f, -6.12f, -149.78f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 142.3f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.65f, 20.0f);
        pathBuilder.horizontalLineToRelative(38.7f);
        pathBuilder.arcTo(455.34f, 455.34f, 0.0f, false, true, 151.0f, 68.0f);
        pathBuilder.lineTo(89.0f, 68.0f);
        pathBuilder.arcTo(462.0f, 462.0f, 0.0f, false, true, 100.65f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(145.75f, 159.83f);
        pathBuilder.curveTo(139.8f, 168.0f, 131.38f, 172.0f, 120.0f, 172.0f);
        pathBuilder.reflectiveCurveToRelative(-19.8f, -4.0f, -25.75f, -12.16f);
        pathBuilder.curveTo(81.0f, 141.63f, 82.6f, 106.72f, 87.6f, 76.0f);
        pathBuilder.horizontalLineToRelative(64.81f);
        pathBuilder.curveTo(158.86f, 116.0f, 156.57f, 144.94f, 145.75f, 159.83f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 52.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 228.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 20.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 204.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 100.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 204.0f, 100.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _champagne = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
