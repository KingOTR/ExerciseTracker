package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Eyeslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EyeSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getEyeSlash", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyeSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyeslashKt {
    private static ImageVector _eyeSlash;

    public static final ImageVector getEyeSlash(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 56.0f);
        pathBuilder.curveTo(48.0f, 56.0f, 16.0f, 128.0f, 16.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(32.0f, 72.0f, 112.0f, 72.0f);
        pathBuilder.reflectiveCurveToRelative(112.0f, -72.0f, 112.0f, -72.0f);
        pathBuilder.reflectiveCurveTo(208.0f, 56.0f, 128.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 168.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(53.92f, 34.62f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder2.lineTo(61.32f, 66.55f);
        pathBuilder2.curveTo(25.0f, 88.84f, 9.38f, 123.2f, 8.69f, 124.76f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 6.5f);
        pathBuilder2.curveToRelative(0.35f, 0.79f, 8.82f, 19.57f, 27.65f, 38.4f);
        pathBuilder2.curveTo(61.43f, 194.74f, 93.12f, 208.0f, 128.0f, 208.0f);
        pathBuilder2.arcToRelative(127.11f, 127.11f, 0.0f, false, false, 52.07f, -10.83f);
        pathBuilder2.lineToRelative(22.0f, 24.21f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(101.25f, 110.46f);
        pathBuilder2.lineTo(142.92f, 156.31f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -41.67f, -45.85f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 192.0f);
        pathBuilder2.curveToRelative(-30.78f, 0.0f, -57.67f, -11.19f, -79.93f, -33.25f);
        pathBuilder2.arcTo(133.16f, 133.16f, 0.0f, false, true, 25.0f, 128.0f);
        pathBuilder2.curveToRelative(4.69f, -8.79f, 19.66f, -33.39f, 47.35f, -49.38f);
        pathBuilder2.lineToRelative(18.0f, 19.75f);
        pathBuilder2.arcToRelative(48.0f, 48.0f, 0.0f, false, false, 63.66f, 70.0f);
        pathBuilder2.lineToRelative(14.73f, 16.2f);
        pathBuilder2.arcTo(112.0f, 112.0f, 0.0f, false, true, 128.0f, 192.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(134.0f, 96.57f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.0f, -15.72f);
        pathBuilder2.arcToRelative(48.16f, 48.16f, 0.0f, false, true, 38.77f, 42.64f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.22f, 8.71f);
        pathBuilder2.arcToRelative(6.39f, 6.39f, 0.0f, false, true, -0.75f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -7.26f);
        pathBuilder2.arcTo(32.09f, 32.09f, 0.0f, false, false, 134.0f, 96.57f);
        pathBuilder2.close();
        pathBuilder2.moveTo(247.28f, 131.26f);
        pathBuilder2.curveToRelative(-0.42f, 0.94f, -10.55f, 23.37f, -33.36f, 43.8f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.67f, -11.92f);
        pathBuilder2.arcTo(132.77f, 132.77f, 0.0f, false, false, 231.05f, 128.0f);
        pathBuilder2.arcToRelative(133.15f, 133.15f, 0.0f, false, false, -23.12f, -30.77f);
        pathBuilder2.curveTo(185.67f, 75.19f, 158.78f, 64.0f, 128.0f, 64.0f);
        pathBuilder2.arcToRelative(118.37f, 118.37f, 0.0f, false, false, -19.36f, 1.57f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 106.0f, 49.79f);
        pathBuilder2.arcTo(134.0f, 134.0f, 0.0f, false, true, 128.0f, 48.0f);
        pathBuilder2.curveToRelative(34.88f, 0.0f, 66.57f, 13.26f, 91.66f, 38.35f);
        pathBuilder2.curveToRelative(18.83f, 18.83f, 27.3f, 37.62f, 27.65f, 38.41f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 247.31f, 131.26f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyeSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
