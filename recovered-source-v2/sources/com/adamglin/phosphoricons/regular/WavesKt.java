package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Waves.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Waves", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getWaves", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_waves", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WavesKt {
    private static ImageVector _waves;

    public static final ImageVector getWaves(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _waves;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Waves", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.16f, 177.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.0f, 11.25f);
        pathBuilder.curveToRelative(-17.36f, 14.39f, -32.86f, 19.5f, -47.0f, 19.5f);
        pathBuilder.curveToRelative(-18.58f, 0.0f, -34.82f, -8.82f, -49.93f, -17.0f);
        pathBuilder.curveToRelative(-25.35f, -13.76f, -47.24f, -25.64f, -79.07f, 0.74f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.22f, -12.31f);
        pathBuilder.curveToRelative(40.17f, -33.28f, 70.32f, -16.92f, 96.93f, -2.48f);
        pathBuilder.curveToRelative(25.35f, 13.75f, 47.24f, 25.63f, 79.07f, -0.74f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 222.16f, 177.25f);
        pathBuilder.close();
        pathBuilder.moveTo(210.89f, 120.25f);
        pathBuilder.curveToRelative(-31.83f, 26.38f, -53.72f, 14.5f, -79.07f, 0.74f);
        pathBuilder.curveToRelative(-26.61f, -14.43f, -56.76f, -30.79f, -96.93f, 2.49f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.22f, 12.31f);
        pathBuilder.curveToRelative(31.83f, -26.38f, 53.72f, -14.5f, 79.07f, -0.74f);
        pathBuilder.curveToRelative(15.11f, 8.19f, 31.35f, 17.0f, 49.93f, 17.0f);
        pathBuilder.curveToRelative(14.14f, 0.0f, 29.64f, -5.11f, 47.0f, -19.5f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.22f, -12.31f);
        pathBuilder.close();
        pathBuilder.moveTo(45.11f, 79.8f);
        pathBuilder.curveToRelative(31.83f, -26.37f, 53.72f, -14.49f, 79.07f, -0.74f);
        pathBuilder.curveToRelative(15.11f, 8.2f, 31.35f, 17.0f, 49.93f, 17.0f);
        pathBuilder.curveToRelative(14.14f, 0.0f, 29.64f, -5.12f, 47.0f, -19.5f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.22f, -12.31f);
        pathBuilder.curveToRelative(-31.83f, 26.38f, -53.72f, 14.5f, -79.07f, 0.74f);
        pathBuilder.curveTo(105.21f, 50.58f, 75.06f, 34.22f, 34.89f, 67.5f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 45.11f, 79.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _waves = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
