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

/* compiled from: Volleyball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Volleyball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getVolleyball", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_volleyball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VolleyballKt {
    private static ImageVector _volleyball;

    public static final ImageVector getVolleyball(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _volleyball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Volleyball", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.37f, 161.89f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, -97.85f, 3.18f);
        pathBuilder.lineTo(131.46f, 134.0f);
        pathBuilder.lineTo(217.8f, 134.0f);
        pathBuilder.arcTo(89.49f, 89.49f, 0.0f, false, true, 211.37f, 161.89f);
        pathBuilder.close();
        pathBuilder.moveTo(88.3f, 47.24f);
        pathBuilder.arcToRelative(89.54f, 89.54f, 0.0f, false, true, 27.35f, -8.39f);
        pathBuilder.arcTo(90.0f, 90.0f, 0.0f, false, true, 167.34f, 122.0f);
        pathBuilder.lineTo(131.46f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(217.8f, 122.0f);
        pathBuilder.lineTo(179.34f, 122.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 138.5f, 38.62f);
        pathBuilder.arcTo(90.15f, 90.15f, 0.0f, false, true, 217.8f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(77.92f, 53.26f);
        pathBuilder.lineTo(97.13f, 86.53f);
        pathBuilder.arcToRelative(102.16f, 102.16f, 0.0f, false, false, -51.79f, 77.06f);
        pathBuilder.arcTo(89.93f, 89.93f, 0.0f, false, true, 77.92f, 53.26f);
        pathBuilder.close();
        pathBuilder.moveTo(57.0f, 183.19f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, 46.17f, -86.26f);
        pathBuilder.lineTo(121.07f, 128.0f);
        pathBuilder.lineTo(77.92f, 202.74f);
        pathBuilder.arcTo(90.59f, 90.59f, 0.0f, false, true, 57.0f, 183.19f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 218.0f);
        pathBuilder.arcToRelative(89.5f, 89.5f, 0.0f, false, true, -39.7f, -9.24f);
        pathBuilder.lineToRelative(19.22f, -33.29f);
        pathBuilder.arcToRelative(102.13f, 102.13f, 0.0f, false, false, 92.58f, 6.34f);
        pathBuilder.arcTo(89.91f, 89.91f, 0.0f, false, true, 128.0f, 218.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _volleyball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
