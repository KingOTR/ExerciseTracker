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

/* compiled from: Globehemisphereeast.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeHemisphereEast", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGlobeHemisphereEast", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeHemisphereEast", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobehemisphereeastKt {
    private static ImageVector _globeHemisphereEast;

    public static final ImageVector getGlobeHemisphereEast(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.0f);
        pathBuilder.arcToRelative(91.48f, 91.48f, 0.0f, false, true, 52.0f, 16.15f);
        pathBuilder.lineTo(180.0f, 74.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, 2.61f);
        pathBuilder.lineToRelative(-22.17f, 25.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.49f, 1.35f);
        pathBuilder.lineTo(122.9f, 108.0f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, -2.88f, -0.72f);
        pathBuilder.lineToRelative(-0.16f, -0.11f);
        pathBuilder.lineTo(100.13f, 94.22f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 83.2f, 97.33f);
        pathBuilder.lineToRelative(-21.0f, 31.3f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, -2.0f, 6.6f);
        pathBuilder.lineTo(60.0f, 171.46f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.8f, 3.33f);
        pathBuilder.lineToRelative(-6.65f, 4.36f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.32f, 185.6f);
        pathBuilder.lineToRelative(6.29f, -4.13f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.41f, -10.0f);
        pathBuilder.lineToRelative(0.21f, -36.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.67f, -2.2f);
        pathBuilder.lineToRelative(20.95f, -31.3f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.67f, -1.0f);
        pathBuilder.lineToRelative(0.15f, 0.11f);
        pathBuilder.lineToRelative(19.74f, 12.91f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.56f, 2.11f);
        pathBuilder.lineToRelative(31.47f, -4.26f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.49f, -4.06f);
        pathBuilder.lineTo(185.1f, 81.81f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 188.0f, 74.0f);
        pathBuilder.lineTo(188.0f, 58.31f);
        pathBuilder.arcTo(91.91f, 91.91f, 0.0f, false, true, 213.5f, 162.0f);
        pathBuilder.lineToRelative(-20.57f, -18.82f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.7f, -2.22f);
        pathBuilder.lineToRelative(-30.45f, 12.66f);
        pathBuilder.arcToRelative(12.06f, 12.06f, 0.0f, false, false, -7.27f, 9.33f);
        pathBuilder.lineToRelative(-2.38f, 16.19f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 149.0f, 192.46f);
        pathBuilder.lineToRelative(21.45f, 5.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.82f, 1.0f);
        pathBuilder.lineToRelative(5.94f, 6.0f);
        pathBuilder.arcTo(91.85f, 91.85f, 0.0f, false, true, 56.32f, 185.6f);
        pathBuilder.close();
        pathBuilder.moveTo(184.75f, 200.36f);
        pathBuilder.lineTo(177.89f, 193.48f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.45f, -3.13f);
        pathBuilder.lineTo(151.0f, 184.72f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, -4.45f);
        pathBuilder.lineToRelative(2.39f, -16.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.42f, -3.11f);
        pathBuilder.lineToRelative(30.45f, -12.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.24f, 0.74f);
        pathBuilder.lineTo(210.0f, 169.62f);
        pathBuilder.arcTo(92.43f, 92.43f, 0.0f, false, true, 184.75f, 200.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeHemisphereEast = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
