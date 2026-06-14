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

/* compiled from: Eyeslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EyeSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getEyeSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyeSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyeslashKt {
    private static ImageVector _eyeSlash;

    public static final ImageVector getEyeSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _eyeSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EyeSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineTo(64.44f, 67.0f);
        pathBuilder.curveToRelative(-37.28f, 21.9f, -53.23f, 57.0f, -53.92f, 58.57f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 4.88f);
        pathBuilder.curveToRelative(0.34f, 0.77f, 8.66f, 19.22f, 27.24f, 37.8f);
        pathBuilder.curveTo(55.0f, 185.47f, 84.62f, 206.0f, 128.0f, 206.0f);
        pathBuilder.arcToRelative(124.91f, 124.91f, 0.0f, false, false, 52.57f, -11.25f);
        pathBuilder.lineToRelative(23.0f, 25.29f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(101.06f, 107.32f);
        pathBuilder.lineTo(146.06f, 156.84f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, true, -45.0f, -49.52f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 194.0f);
        pathBuilder.curveToRelative(-31.38f, 0.0f, -58.78f, -11.42f, -81.45f, -33.93f);
        pathBuilder.arcTo(134.57f, 134.57f, 0.0f, false, true, 22.69f, 128.0f);
        pathBuilder.curveToRelative(4.29f, -8.2f, 20.1f, -35.18f, 50.0f, -51.91f);
        pathBuilder.lineTo(92.89f, 98.3f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, false, 61.35f, 67.48f);
        pathBuilder.lineToRelative(17.81f, 19.6f);
        pathBuilder.arcTo(113.47f, 113.47f, 0.0f, false, true, 128.0f, 194.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.4f, 94.6f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.25f, -11.79f);
        pathBuilder.arcToRelative(46.17f, 46.17f, 0.0f, false, true, 37.15f, 40.87f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.42f, 6.53f);
        pathBuilder.lineToRelative(-0.56f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -5.45f);
        pathBuilder.arcTo(34.1f, 34.1f, 0.0f, false, false, 134.4f, 94.6f);
        pathBuilder.close();
        pathBuilder.moveTo(245.48f, 130.45f);
        pathBuilder.curveToRelative(-0.41f, 0.92f, -10.37f, 23.0f, -32.86f, 43.12f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.0f, -8.94f);
        pathBuilder.arcTo(134.07f, 134.07f, 0.0f, false, false, 233.31f, 128.0f);
        pathBuilder.arcToRelative(134.67f, 134.67f, 0.0f, false, false, -23.86f, -32.07f);
        pathBuilder.curveTo(186.78f, 73.42f, 159.38f, 62.0f, 128.0f, 62.0f);
        pathBuilder.arcToRelative(120.19f, 120.19f, 0.0f, false, false, -19.69f, 1.6f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -2.0f, -11.83f);
        pathBuilder.arcTo(131.12f, 131.12f, 0.0f, false, true, 128.0f, 50.0f);
        pathBuilder.curveToRelative(43.38f, 0.0f, 73.0f, 20.54f, 90.24f, 37.76f);
        pathBuilder.curveToRelative(18.58f, 18.58f, 26.9f, 37.0f, 27.24f, 37.81f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 245.48f, 130.45f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyeSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
