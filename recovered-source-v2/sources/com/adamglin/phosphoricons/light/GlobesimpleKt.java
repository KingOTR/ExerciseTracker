package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Globesimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGlobeSimple", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobesimpleKt {
    private static ImageVector _globeSimple;

    public static final ImageVector getGlobeSimple(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(217.8f, 122.0f);
        pathBuilder.lineTo(173.89f, 122.0f);
        pathBuilder.curveToRelative(-1.54f, -40.77f, -18.48f, -68.23f, -30.43f, -82.67f);
        pathBuilder.arcTo(90.19f, 90.19f, 0.0f, false, true, 217.8f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 215.83f);
        pathBuilder.arcToRelative(110.0f, 110.0f, 0.0f, false, true, -15.19f, -19.45f);
        pathBuilder.arcTo(128.37f, 128.37f, 0.0f, false, true, 94.13f, 134.0f);
        pathBuilder.horizontalLineToRelative(67.74f);
        pathBuilder.arcToRelative(128.37f, 128.37f, 0.0f, false, true, -18.68f, 62.38f);
        pathBuilder.arcTo(110.0f, 110.0f, 0.0f, false, true, 128.0f, 215.83f);
        pathBuilder.close();
        pathBuilder.moveTo(94.13f, 122.0f);
        pathBuilder.arcToRelative(128.37f, 128.37f, 0.0f, false, true, 18.68f, -62.38f);
        pathBuilder.arcTo(110.0f, 110.0f, 0.0f, false, true, 128.0f, 40.17f);
        pathBuilder.arcToRelative(110.0f, 110.0f, 0.0f, false, true, 15.19f, 19.45f);
        pathBuilder.arcTo(128.37f, 128.37f, 0.0f, false, true, 161.87f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.54f, 39.33f);
        pathBuilder.curveToRelative(-12.0f, 14.44f, -28.89f, 41.9f, -30.43f, 82.67f);
        pathBuilder.lineTo(38.2f, 122.0f);
        pathBuilder.arcTo(90.19f, 90.19f, 0.0f, false, true, 112.54f, 39.33f);
        pathBuilder.close();
        pathBuilder.moveTo(38.2f, 134.0f);
        pathBuilder.lineTo(82.11f, 134.0f);
        pathBuilder.curveToRelative(1.54f, 40.77f, 18.48f, 68.23f, 30.43f, 82.67f);
        pathBuilder.arcTo(90.19f, 90.19f, 0.0f, false, true, 38.2f, 134.0f);
        pathBuilder.close();
        pathBuilder.moveTo(143.46f, 216.67f);
        pathBuilder.curveToRelative(11.95f, -14.44f, 28.89f, -41.9f, 30.43f, -82.67f);
        pathBuilder.lineTo(217.8f, 134.0f);
        pathBuilder.arcTo(90.19f, 90.19f, 0.0f, false, true, 143.46f, 216.67f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
