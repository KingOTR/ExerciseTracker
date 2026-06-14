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

/* compiled from: Beachball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BeachBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBeachBall", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_beachBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeachballKt {
    private static ImageVector _beachBall;

    public static final ImageVector getBeachBall(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _beachBall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BeachBall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(213.0f, 98.45f);
        pathBuilder.arcToRelative(197.9f, 197.9f, 0.0f, false, false, -46.09f, -9.37f);
        pathBuilder.arcTo(197.9f, 197.9f, 0.0f, false, false, 157.55f, 43.0f);
        pathBuilder.arcTo(90.47f, 90.47f, 0.0f, false, true, 213.0f, 98.45f);
        pathBuilder.close();
        pathBuilder.moveTo(143.52f, 39.34f);
        pathBuilder.arcToRelative(186.57f, 186.57f, 0.0f, false, true, 10.11f, 39.0f);
        pathBuilder.arcTo(198.45f, 198.45f, 0.0f, false, false, 95.15f, 44.21f);
        pathBuilder.arcToRelative(90.17f, 90.17f, 0.0f, false, true, 48.37f, -4.87f);
        pathBuilder.close();
        pathBuilder.moveTo(80.15f, 51.81f);
        pathBuilder.arcTo(186.09f, 186.09f, 0.0f, false, true, 147.0f, 88.47f);
        pathBuilder.arcToRelative(198.32f, 198.32f, 0.0f, false, false, -108.92f, 35.0f);
        pathBuilder.arcTo(90.05f, 90.05f, 0.0f, false, true, 80.15f, 51.81f);
        pathBuilder.close();
        pathBuilder.moveTo(38.55f, 138.0f);
        pathBuilder.arcToRelative(186.16f, 186.16f, 0.0f, false, true, 117.0f, -37.46f);
        pathBuilder.arcToRelative(186.16f, 186.16f, 0.0f, false, true, -37.46f, 117.0f);
        pathBuilder.arcTo(90.18f, 90.18f, 0.0f, false, true, 38.55f, 138.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.55f, 217.94f);
        pathBuilder.arcToRelative(198.33f, 198.33f, 0.0f, false, false, 35.0f, -108.93f);
        pathBuilder.arcToRelative(186.21f, 186.21f, 0.0f, false, true, 36.66f, 66.89f);
        pathBuilder.arcTo(90.05f, 90.05f, 0.0f, false, true, 132.55f, 217.89f);
        pathBuilder.close();
        pathBuilder.moveTo(211.79f, 160.94f);
        pathBuilder.arcToRelative(198.45f, 198.45f, 0.0f, false, false, -34.11f, -58.48f);
        pathBuilder.arcToRelative(186.57f, 186.57f, 0.0f, false, true, 39.0f, 10.11f);
        pathBuilder.arcToRelative(90.17f, 90.17f, 0.0f, false, true, -4.87f, 48.37f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _beachBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
