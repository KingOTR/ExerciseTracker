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

/* compiled from: Nytimeslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NyTimesLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getNyTimesLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_nyTimesLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NytimeslogoKt {
    private static ImageVector _nyTimesLogo;

    public static final ImageVector getNyTimesLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _nyTimesLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NyTimesLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.0f, 138.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 172.0f, 138.0f);
        pathBuilder.close();
        pathBuilder.moveTo(185.46f, 101.44f);
        pathBuilder.lineTo(119.24f, 70.53f);
        pathBuilder.arcTo(74.0f, 74.0f, 0.0f, false, false, 54.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, 0.22f, 0.0f, 0.44f, 0.0f, 0.66f);
        pathBuilder.lineToRelative(71.16f, -37.95f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 134.0f, 112.0f);
        pathBuilder.lineTo(134.0f, 217.76f);
        pathBuilder.arcToRelative(73.63f, 73.63f, 0.0f, false, false, 64.61f, -51.56f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.45f, 3.6f);
        pathBuilder.arcTo(86.0f, 86.0f, 0.0f, true, true, 54.57f, 99.23f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, true, 68.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.54f, 0.56f);
        pathBuilder.lineTo(189.26f, 90.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 188.0f, 46.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 185.46f, 101.44f);
        pathBuilder.close();
        pathBuilder.moveTo(102.0f, 213.27f);
        pathBuilder.arcToRelative(73.47f, 73.47f, 0.0f, false, false, 20.0f, 4.47f);
        pathBuilder.lineTo(122.0f, 122.0f);
        pathBuilder.lineToRelative(-20.0f, 10.67f);
        pathBuilder.close();
        pathBuilder.moveTo(55.27f, 157.59f);
        pathBuilder.arcTo(74.22f, 74.22f, 0.0f, false, false, 90.0f, 207.47f);
        pathBuilder.verticalLineToRelative(-68.4f);
        pathBuilder.close();
        pathBuilder.moveTo(101.41f, 62.21f);
        pathBuilder.lineTo(66.74f, 46.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, -4.93f, 43.05f);
        pathBuilder.curveToRelative(0.86f, -1.0f, 1.75f, -2.06f, 2.67f, -3.07f);
        pathBuilder.arcTo(86.0f, 86.0f, 0.0f, false, true, 101.41f, 62.21f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _nyTimesLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
