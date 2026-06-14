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

/* compiled from: Globesimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGlobeSimple", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobesimpleKt {
    private static ImageVector _globeSimple;

    public static final ImageVector getGlobeSimple(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _globeSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GlobeSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.9f, 124.0f);
        pathBuilder.horizontalLineToRelative(-48.0f);
        pathBuilder.curveToRelative(-1.15f, -45.55f, -21.74f, -74.52f, -33.48f, -87.4f);
        pathBuilder.arcTo(92.14f, 92.14f, 0.0f, false, true, 219.91f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 218.61f);
        pathBuilder.curveToRelative(-8.32f, -8.0f, -34.57f, -37.13f, -35.93f, -86.61f);
        pathBuilder.horizontalLineToRelative(71.86f);
        pathBuilder.curveTo(162.57f, 181.48f, 136.32f, 210.61f, 128.0f, 218.61f);
        pathBuilder.close();
        pathBuilder.moveTo(92.07f, 124.0f);
        pathBuilder.curveTo(93.43f, 74.52f, 119.68f, 45.39f, 128.0f, 37.39f);
        pathBuilder.curveToRelative(8.32f, 8.0f, 34.57f, 37.13f, 35.93f, 86.61f);
        pathBuilder.close();
        pathBuilder.moveTo(117.54f, 36.6f);
        pathBuilder.curveTo(105.8f, 49.48f, 85.21f, 78.45f, 84.06f, 124.0f);
        pathBuilder.horizontalLineToRelative(-48.0f);
        pathBuilder.arcTo(92.14f, 92.14f, 0.0f, false, true, 117.54f, 36.6f);
        pathBuilder.close();
        pathBuilder.moveTo(36.09f, 132.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.curveToRelative(1.15f, 45.55f, 21.74f, 74.52f, 33.48f, 87.4f);
        pathBuilder.arcTo(92.14f, 92.14f, 0.0f, false, true, 36.09f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.46f, 219.4f);
        pathBuilder.curveToRelative(11.74f, -12.88f, 32.33f, -41.85f, 33.48f, -87.4f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(92.14f, 92.14f, 0.0f, false, true, 138.46f, 219.4f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
