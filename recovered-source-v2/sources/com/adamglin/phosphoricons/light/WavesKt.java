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

/* compiled from: Waves.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Waves", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWaves", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_waves", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WavesKt {
    private static ImageVector _waves;

    public static final ImageVector getWaves(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(220.62f, 178.58f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.79f, 8.45f);
        pathBuilder.curveToRelative(-16.87f, 14.0f, -32.0f, 19.0f, -45.75f, 19.0f);
        pathBuilder.curveToRelative(-18.19f, 0.0f, -34.13f, -8.66f, -48.94f, -16.7f);
        pathBuilder.curveToRelative(-26.0f, -14.12f, -48.44f, -26.31f, -81.31f, 1.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 36.17f, 181.0f);
        pathBuilder.curveToRelative(39.13f, -32.45f, 68.65f, -16.41f, 94.69f, -2.26f);
        pathBuilder.reflectiveCurveToRelative(48.44f, 26.31f, 81.31f, -1.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 220.62f, 178.58f);
        pathBuilder.close();
        pathBuilder.moveTo(212.17f, 121.77f);
        pathBuilder.curveToRelative(-32.87f, 27.27f, -55.32f, 15.07f, -81.31f, 1.0f);
        pathBuilder.reflectiveCurveTo(75.3f, 92.54f, 36.17f, 125.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.66f, 9.25f);
        pathBuilder.curveToRelative(32.87f, -27.27f, 55.32f, -15.08f, 81.31f, -1.0f);
        pathBuilder.curveToRelative(14.81f, 8.0f, 30.75f, 16.71f, 48.94f, 16.71f);
        pathBuilder.curveToRelative(13.79f, 0.0f, 28.88f, -5.0f, 45.75f, -19.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.66f, -9.24f);
        pathBuilder.close();
        pathBuilder.moveTo(43.83f, 78.21f);
        pathBuilder.curveToRelative(32.87f, -27.27f, 55.32f, -15.07f, 81.31f, -1.0f);
        pathBuilder.curveTo(140.0f, 85.3f, 155.89f, 94.0f, 174.08f, 94.0f);
        pathBuilder.curveToRelative(13.79f, 0.0f, 28.88f, -5.0f, 45.75f, -19.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -7.66f, -9.24f);
        pathBuilder.curveToRelative(-32.87f, 27.27f, -55.32f, 15.07f, -81.31f, 1.0f);
        pathBuilder.reflectiveCurveTo(75.3f, 36.52f, 36.17f, 69.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.66f, 9.24f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _waves = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
