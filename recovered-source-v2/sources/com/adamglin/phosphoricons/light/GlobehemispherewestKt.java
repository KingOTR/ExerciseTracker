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

/* compiled from: Globehemispherewest.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeHemisphereWest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGlobeHemisphereWest", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeHemisphereWest", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobehemispherewestKt {
    private static ImageVector _globeHemisphereWest;

    public static final ImageVector getGlobeHemisphereWest(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _globeHemisphereWest;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GlobeHemisphereWest", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 128.0f);
        pathBuilder.arcToRelative(89.55f, 89.55f, 0.0f, false, true, -7.46f, 35.86f);
        pathBuilder.lineToRelative(-46.69f, -28.71f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, -5.46f, -2.0f);
        pathBuilder.lineToRelative(-22.82f, -3.07f);
        pathBuilder.arcTo(14.06f, 14.06f, 0.0f, false, false, 121.06f, 138.0f);
        pathBuilder.horizontalLineToRelative(-9.92f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.8f, -1.13f);
        pathBuilder.lineToRelative(-3.8f, -7.86f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, -9.66f, -7.59f);
        pathBuilder.lineToRelative(-10.71f, -2.3f);
        pathBuilder.lineTo(94.4f, 103.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.74f, -1.0f);
        pathBuilder.horizontalLineToRelative(16.71f);
        pathBuilder.arcToRelative(13.9f, 13.9f, 0.0f, false, false, 6.76f, -1.75f);
        pathBuilder.lineToRelative(12.25f, -6.75f);
        pathBuilder.arcToRelative(14.73f, 14.73f, 0.0f, false, false, 2.62f, -1.88f);
        pathBuilder.lineToRelative(26.91f, -24.33f);
        pathBuilder.arcToRelative(13.93f, 13.93f, 0.0f, false, false, 2.83f, -17.21f);
        pathBuilder.lineTo(161.0f, 44.25f);
        pathBuilder.arcTo(90.16f, 90.16f, 0.0f, false, true, 218.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(144.6f, 39.54f);
        pathBuilder.lineToRelative(9.15f, 16.39f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.41f, 2.46f);
        pathBuilder.lineTo(126.43f, 82.72f);
        pathBuilder.arcToRelative(1.84f, 1.84f, 0.0f, false, true, -0.37f, 0.27f);
        pathBuilder.lineToRelative(-12.25f, 6.76f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, 0.25f);
        pathBuilder.lineTo(96.14f, 90.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 84.0f, 97.0f);
        pathBuilder.lineTo(73.18f, 115.91f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.19f, -0.35f);
        pathBuilder.lineTo(61.5f, 84.89f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -1.48f);
        pathBuilder.lineTo(72.68f, 57.06f);
        pathBuilder.arcTo(89.9f, 89.9f, 0.0f, false, true, 144.6f, 39.54f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 128.0f);
        pathBuilder.arcTo(89.52f, 89.52f, 0.0f, false, true, 49.38f, 84.23f);
        pathBuilder.arcToRelative(13.85f, 13.85f, 0.0f, false, false, 0.89f, 4.87f);
        pathBuilder.lineToRelative(11.49f, 30.67f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, 10.16f, 8.78f);
        pathBuilder.lineToRelative(21.44f, 4.6f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.38f, 1.09f);
        pathBuilder.lineToRelative(3.8f, 7.86f);
        pathBuilder.arcToRelative(14.07f, 14.07f, 0.0f, false, false, 12.6f, 7.9f);
        pathBuilder.horizontalLineToRelative(4.56f);
        pathBuilder.lineToRelative(-8.49f, 19.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 2.51f, 15.2f);
        pathBuilder.lineToRelative(0.1f, 0.11f);
        pathBuilder.lineToRelative(19.68f, 20.26f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.46f, 1.7f);
        pathBuilder.lineTo(127.7f, 218.0f);
        pathBuilder.arcTo(90.1f, 90.1f, 0.0f, false, true, 38.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.08f, 217.19f);
        pathBuilder.lineTo(141.75f, 208.59f);
        pathBuilder.arcToRelative(14.07f, 14.07f, 0.0f, false, false, -3.47f, -12.16f);
        pathBuilder.lineToRelative(-0.1f, -0.11f);
        pathBuilder.lineTo(118.5f, 176.06f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.33f, -2.14f);
        pathBuilder.lineToRelative(13.7f, -30.73f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 134.0f, 142.0f);
        pathBuilder.lineToRelative(22.82f, 3.08f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.78f, 0.27f);
        pathBuilder.lineTo(205.0f, 174.55f);
        pathBuilder.arcTo(90.18f, 90.18f, 0.0f, false, true, 140.08f, 217.19f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeHemisphereWest = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
