package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Globesimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGlobeSimple", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobesimpleKt {
    private static ImageVector _globeSimple;

    public static final ImageVector getGlobeSimple(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 128.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 24.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder2.arcTo(104.12f, 104.12f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(215.62f, 120.0f);
        pathBuilder2.lineTo(175.79f, 120.0f);
        pathBuilder2.curveTo(174.0f, 83.49f, 159.94f, 57.67f, 148.41f, 42.4f);
        pathBuilder2.arcTo(88.19f, 88.19f, 0.0f, false, true, 215.63f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(96.23f, 136.0f);
        pathBuilder2.horizontalLineToRelative(63.54f);
        pathBuilder2.curveToRelative(-2.31f, 41.61f, -22.23f, 67.11f, -31.77f, 77.0f);
        pathBuilder2.curveTo(118.45f, 203.1f, 98.54f, 177.6f, 96.23f, 136.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(96.23f, 120.0f);
        pathBuilder2.curveTo(98.54f, 78.39f, 118.46f, 52.89f, 128.0f, 43.0f);
        pathBuilder2.curveToRelative(9.55f, 9.93f, 29.46f, 35.43f, 31.77f, 77.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(107.59f, 42.4f);
        pathBuilder2.curveTo(96.06f, 57.67f, 82.0f, 83.49f, 80.21f, 120.0f);
        pathBuilder2.lineTo(40.37f, 120.0f);
        pathBuilder2.arcTo(88.19f, 88.19f, 0.0f, false, true, 107.59f, 42.4f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.37f, 136.0f);
        pathBuilder2.lineTo(80.21f, 136.0f);
        pathBuilder2.curveToRelative(1.82f, 36.51f, 15.85f, 62.33f, 27.38f, 77.6f);
        pathBuilder2.arcTo(88.19f, 88.19f, 0.0f, false, true, 40.37f, 136.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(148.37f, 213.6f);
        pathBuilder2.curveToRelative(11.53f, -15.27f, 25.56f, -41.09f, 27.38f, -77.6f);
        pathBuilder2.horizontalLineToRelative(39.84f);
        pathBuilder2.arcTo(88.19f, 88.19f, 0.0f, false, true, 148.41f, 213.6f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
