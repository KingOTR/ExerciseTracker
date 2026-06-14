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

/* compiled from: Globex.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeX", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGlobeX", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeX", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobexKt {
    private static ImageVector _globeX;

    public static final ImageVector getGlobeX(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _globeX;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GlobeX", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(100.0f, 100.0f, 0.0f, false, false, 0.0f, 200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.49f, -7.11f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.3f, -0.24f, -23.57f, -19.41f, -33.78f, -56.88f);
        pathBuilder.lineTo(128.0f, 164.01f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(94.82f, 156.01f);
        pathBuilder.arcToRelative(140.42f, 140.42f, 0.0f, false, true, 0.0f, -56.0f);
        pathBuilder.horizontalLineToRelative(66.36f);
        pathBuilder.arcTo(137.89f, 137.89f, 0.0f, false, true, 164.0f, 128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.arcToRelative(149.23f, 149.23f, 0.0f, false, false, -2.59f, -28.0f);
        pathBuilder.horizontalLineToRelative(46.23f);
        pathBuilder.arcTo(91.6f, 91.6f, 0.0f, false, true, 220.0f, 128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(117.54f, 36.6f);
        pathBuilder.arcTo(129.39f, 129.39f, 0.0f, false, false, 88.35f, 92.0f);
        pathBuilder.horizontalLineToRelative(-45.0f);
        pathBuilder.arcTo(92.25f, 92.25f, 0.0f, false, true, 117.54f, 36.6f);
        pathBuilder.close();
        pathBuilder.moveTo(117.54f, 219.4f);
        pathBuilder.arcTo(92.25f, 92.25f, 0.0f, false, true, 43.34f, 164.0f);
        pathBuilder.horizontalLineToRelative(45.0f);
        pathBuilder.arcTo(129.39f, 129.39f, 0.0f, false, false, 117.54f, 219.4f);
        pathBuilder.close();
        pathBuilder.moveTo(86.59f, 156.0f);
        pathBuilder.lineTo(40.36f, 156.0f);
        pathBuilder.arcToRelative(92.09f, 92.09f, 0.0f, false, true, 0.0f, -56.0f);
        pathBuilder.lineTo(86.59f, 100.0f);
        pathBuilder.arcToRelative(152.65f, 152.65f, 0.0f, false, false, 0.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.73f, 92.0f);
        pathBuilder.curveTo(105.0f, 61.8f, 121.67f, 43.48f, 128.0f, 37.39f);
        pathBuilder.curveToRelative(6.33f, 6.09f, 23.0f, 24.41f, 31.27f, 54.61f);
        pathBuilder.close();
        pathBuilder.moveTo(167.65f, 92.0f);
        pathBuilder.arcToRelative(129.39f, 129.39f, 0.0f, false, false, -29.19f, -55.4f);
        pathBuilder.arcTo(92.25f, 92.25f, 0.0f, false, true, 212.66f, 92.0f);
        pathBuilder.close();
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
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeX = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
