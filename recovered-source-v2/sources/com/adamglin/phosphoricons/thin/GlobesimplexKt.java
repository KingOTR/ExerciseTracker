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

/* compiled from: Globesimplex.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeSimpleX", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGlobeSimpleX", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeSimpleX", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobesimplexKt {
    private static ImageVector _globeSimpleX;

    public static final ImageVector getGlobeSimpleX(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _globeSimpleX;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GlobeSimpleX", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(218.83f, 170.83f);
        pathBuilder.lineTo(197.66f, 192.0f);
        pathBuilder.lineToRelative(21.17f, 21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineTo(192.0f, 197.66f);
        pathBuilder.lineToRelative(-21.17f, 21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f);
        pathBuilder.lineTo(186.34f, 192.0f);
        pathBuilder.lineToRelative(-21.17f, -21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.lineTo(192.0f, 186.34f);
        pathBuilder.lineToRelative(21.17f, -21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(92.08f, 132.0f);
        pathBuilder.curveToRelative(1.61f, 58.53f, 38.05f, 88.58f, 38.42f, 88.88f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 128.0f, 228.0f);
        pathBuilder.arcToRelative(100.0f, 100.0f, 0.0f, false, true, 0.0f, -200.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, true, 228.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.46f, 36.6f);
        pathBuilder.curveToRelative(11.74f, 12.88f, 32.33f, 41.85f, 33.48f, 87.4f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(92.14f, 92.14f, 0.0f, false, false, 138.46f, 36.6f);
        pathBuilder.close();
        pathBuilder.moveTo(92.07f, 124.0f);
        pathBuilder.horizontalLineToRelative(71.86f);
        pathBuilder.curveTo(162.57f, 74.52f, 136.32f, 45.4f, 128.0f, 37.39f);
        pathBuilder.curveTo(119.68f, 45.39f, 93.43f, 74.52f, 92.07f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.07f, 124.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.curveToRelative(1.15f, -45.55f, 21.74f, -74.52f, 33.48f, -87.4f);
        pathBuilder.arcTo(92.14f, 92.14f, 0.0f, false, false, 36.09f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.07f, 132.0f);
        pathBuilder.horizontalLineToRelative(-48.0f);
        pathBuilder.arcToRelative(92.14f, 92.14f, 0.0f, false, false, 81.45f, 87.4f);
        pathBuilder.curveTo(105.8f, 206.52f, 85.21f, 177.55f, 84.06f, 132.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeSimpleX = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
