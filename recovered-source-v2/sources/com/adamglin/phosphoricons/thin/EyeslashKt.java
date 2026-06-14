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

/* compiled from: Eyeslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EyeSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getEyeSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyeSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyeslashKt {
    private static ImageVector _eyeSlash;

    public static final ImageVector getEyeSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(51.0f, 37.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f);
        pathBuilder.lineTo(67.59f, 67.5f);
        pathBuilder.curveTo(29.34f, 89.0f, 13.0f, 124.81f, 12.34f, 126.38f);
        pathBuilder.arcToRelative(4.08f, 4.08f, 0.0f, false, false, 0.0f, 3.25f);
        pathBuilder.curveToRelative(0.34f, 0.77f, 8.52f, 18.89f, 26.83f, 37.2f);
        pathBuilder.curveToRelative(17.0f, 17.0f, 46.14f, 37.17f, 88.83f, 37.17f);
        pathBuilder.arcToRelative(122.59f, 122.59f, 0.0f, false, false, 53.06f, -11.69f);
        pathBuilder.lineToRelative(24.0f, 26.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f);
        pathBuilder.close();
        pathBuilder.moveTo(149.1f, 157.16f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 101.0f, 104.22f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 196.0f);
        pathBuilder.curveToRelative(-32.0f, 0.0f, -59.89f, -11.65f, -83.0f, -34.62f);
        pathBuilder.arcTo(135.81f, 135.81f, 0.0f, false, true, 20.44f, 128.0f);
        pathBuilder.curveToRelative(3.65f, -7.23f, 20.09f, -36.81f, 52.68f, -54.43f);
        pathBuilder.lineToRelative(22.45f, 24.7f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 59.0f, 64.83f);
        pathBuilder.lineToRelative(20.89f, 23.0f);
        pathBuilder.arcTo(114.94f, 114.94f, 0.0f, false, true, 128.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.78f, 92.64f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.49f, -7.86f);
        pathBuilder.arcToRelative(44.15f, 44.15f, 0.0f, false, true, 35.54f, 39.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.61f, 4.35f);
        pathBuilder.lineToRelative(-0.38f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -3.63f);
        pathBuilder.arcTo(36.1f, 36.1f, 0.0f, false, false, 134.78f, 92.64f);
        pathBuilder.close();
        pathBuilder.moveTo(243.66f, 129.64f);
        pathBuilder.curveToRelative(-0.41f, 0.91f, -10.2f, 22.58f, -32.38f, 42.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.67f, 1.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.67f, -7.0f);
        pathBuilder.arcTo(136.71f, 136.71f, 0.0f, false, false, 235.56f, 128.0f);
        pathBuilder.arcTo(136.07f, 136.07f, 0.0f, false, false, 211.0f, 94.62f);
        pathBuilder.curveTo(187.89f, 71.65f, 160.0f, 60.0f, 128.0f, 60.0f);
        pathBuilder.arcToRelative(122.0f, 122.0f, 0.0f, false, false, -20.0f, 1.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.32f, -7.89f);
        pathBuilder.arcTo(129.3f, 129.3f, 0.0f, false, true, 128.0f, 52.0f);
        pathBuilder.curveToRelative(42.7f, 0.0f, 71.87f, 20.22f, 88.83f, 37.18f);
        pathBuilder.curveToRelative(18.31f, 18.31f, 26.49f, 36.44f, 26.83f, 37.2f);
        pathBuilder.arcTo(4.08f, 4.08f, 0.0f, false, true, 243.66f, 129.63f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyeSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
