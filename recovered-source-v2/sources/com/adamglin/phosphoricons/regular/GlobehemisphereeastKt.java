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

/* compiled from: Globehemisphereeast.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeHemisphereEast", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getGlobeHemisphereEast", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeHemisphereEast", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobehemisphereeastKt {
    private static ImageVector _globeHemisphereEast;

    public static final ImageVector getGlobeHemisphereEast(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _globeHemisphereEast;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GlobeHemisphereEast", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 40.0f);
        pathBuilder.arcToRelative(87.5f, 87.5f, 0.0f, false, true, 48.0f, 14.28f);
        pathBuilder.lineTo(176.0f, 74.0f);
        pathBuilder.lineTo(153.83f, 99.74f);
        pathBuilder.lineTo(122.36f, 104.0f);
        pathBuilder.lineToRelative(-0.31f, -0.22f);
        pathBuilder.lineTo(102.38f, 90.92f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 79.87f, 95.1f);
        pathBuilder.lineTo(58.93f, 126.4f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.7f, 8.81f);
        pathBuilder.lineTo(56.0f, 171.44f);
        pathBuilder.lineToRelative(-3.27f, 2.15f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(62.29f, 186.47f);
        pathBuilder.lineToRelative(2.52f, -1.65f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 171.53f);
        pathBuilder.lineToRelative(0.21f, -36.23f);
        pathBuilder.lineTo(93.17f, 104.0f);
        pathBuilder.arcToRelative(3.62f, 3.62f, 0.0f, false, false, 0.32f, 0.22f);
        pathBuilder.lineToRelative(19.67f, 12.87f);
        pathBuilder.arcToRelative(15.94f, 15.94f, 0.0f, false, false, 11.35f, 2.77f);
        pathBuilder.lineTo(156.0f, 115.59f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 10.0f, -5.41f);
        pathBuilder.lineToRelative(22.17f, -25.76f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 74.0f);
        pathBuilder.lineTo(192.0f, 67.67f);
        pathBuilder.arcTo(87.87f, 87.87f, 0.0f, false, true, 211.77f, 155.0f);
        pathBuilder.lineToRelative(-16.14f, -14.76f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.93f, -3.0f);
        pathBuilder.lineToRelative(-30.46f, 12.65f);
        pathBuilder.arcToRelative(16.08f, 16.08f, 0.0f, false, false, -9.68f, 12.45f);
        pathBuilder.lineToRelative(-2.39f, 16.19f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.77f, 17.81f);
        pathBuilder.lineTo(169.4f, 202.0f);
        pathBuilder.lineToRelative(2.36f, 2.37f);
        pathBuilder.arcTo(87.88f, 87.88f, 0.0f, false, true, 62.29f, 186.47f);
        pathBuilder.close();
        pathBuilder.moveTo(185.0f, 195.0f);
        pathBuilder.lineToRelative(-4.3f, -4.31f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.26f, -4.18f);
        pathBuilder.lineTo(152.0f, 180.85f);
        pathBuilder.lineToRelative(2.39f, -16.19f);
        pathBuilder.lineTo(184.84f, 152.0f);
        pathBuilder.lineTo(205.0f, 170.48f);
        pathBuilder.arcTo(88.43f, 88.43f, 0.0f, false, true, 185.0f, 195.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeHemisphereEast = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
