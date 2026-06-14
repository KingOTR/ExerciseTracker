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

/* compiled from: Hearthalf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeartHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHeartHalf", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartHalf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HearthalfKt {
    private static ImageVector _heartHalf;

    public static final ImageVector getHeartHalf(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _heartHalf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HeartHalf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(169.1f, 54.82f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, false, 166.9f, 43.0f);
        pathBuilder.curveTo(150.3f, 46.13f, 136.65f, 54.82f, 128.0f, 67.4f);
        pathBuilder.curveTo(117.3f, 51.5f, 99.0f, 42.0f, 78.0f, 42.0f);
        pathBuilder.arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f);
        pathBuilder.curveToRelative(0.0f, 29.2f, 18.2f, 59.59f, 54.1f, 90.31f);
        pathBuilder.arcToRelative(334.68f, 334.68f, 0.0f, false, false, 53.06f, 37.0f);
        pathBuilder.arcToRelative(5.93f, 5.93f, 0.0f, false, false, 5.68f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(329.42f, 329.42f, 0.0f, false, false, 40.82f, -27.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.32f, -9.51f);
        pathBuilder.arcTo(341.88f, 341.88f, 0.0f, false, true, 134.0f, 213.56f);
        pathBuilder.lineTo(134.0f, 81.28f);
        pathBuilder.curveTo(140.0f, 67.5f, 152.76f, 57.88f, 169.1f, 54.82f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 213.54f);
        pathBuilder.curveTo(97.4f, 198.51f, 30.0f, 152.7f, 30.0f, 102.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, true, 78.0f, 54.0f);
        pathBuilder.curveToRelative(19.87f, 0.0f, 36.62f, 10.4f, 44.0f, 27.22f);
        pathBuilder.close();
        pathBuilder.moveTo(232.33f, 102.0f);
        pathBuilder.arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.67f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.95f, -5.34f);
        pathBuilder.arcToRelative(47.89f, 47.89f, 0.0f, false, false, -21.05f, -34.58f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.68f, -10.0f);
        pathBuilder.arcToRelative(59.85f, 59.85f, 0.0f, false, true, 26.29f, 43.23f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 232.33f, 102.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.67f, 138.72f);
        pathBuilder.curveToRelative(-5.58f, 11.2f, -13.75f, 22.65f, -24.26f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.82f, -8.15f);
        pathBuilder.curveToRelative(9.75f, -10.54f, 17.27f, -21.05f, 22.35f, -31.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.73f, 5.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartHalf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
