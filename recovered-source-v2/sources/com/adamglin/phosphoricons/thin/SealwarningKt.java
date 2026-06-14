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

/* compiled from: Sealwarning.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SealWarning", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSealWarning", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sealWarning", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SealwarningKt {
    private static ImageVector _sealWarning;

    public static final ImageVector getSealWarning(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _sealWarning;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SealWarning", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(223.0f, 105.58f);
        pathBuilder.curveToRelative(-4.0f, -4.2f, -8.2f, -8.54f, -10.0f, -12.8f);
        pathBuilder.curveToRelative(-1.65f, -4.0f, -1.73f, -9.53f, -1.82f, -15.41f);
        pathBuilder.curveToRelative(-0.14f, -9.0f, -0.29f, -19.19f, -6.83f, -25.74f);
        pathBuilder.reflectiveCurveToRelative(-16.74f, -6.69f, -25.74f, -6.83f);
        pathBuilder.curveToRelative(-5.88f, -0.09f, -11.43f, -0.17f, -15.41f, -1.82f);
        pathBuilder.curveToRelative(-4.26f, -1.76f, -8.6f, -5.93f, -12.8f, -9.95f);
        pathBuilder.curveToRelative(-6.68f, -6.41f, -13.59f, -13.0f, -22.42f, -13.0f);
        pathBuilder.reflectiveCurveToRelative(-15.74f, 6.62f, -22.42f, 13.0f);
        pathBuilder.curveToRelative(-4.2f, 4.0f, -8.54f, 8.2f, -12.8f, 10.0f);
        pathBuilder.curveToRelative(-4.0f, 1.65f, -9.53f, 1.73f, -15.41f, 1.82f);
        pathBuilder.curveToRelative(-9.0f, 0.14f, -19.19f, 0.29f, -25.74f, 6.83f);
        pathBuilder.reflectiveCurveTo(44.94f, 68.37f, 44.8f, 77.37f);
        pathBuilder.curveToRelative(-0.09f, 5.88f, -0.17f, 11.43f, -1.82f, 15.41f);
        pathBuilder.curveToRelative(-1.76f, 4.26f, -5.93f, 8.6f, -9.95f, 12.8f);
        pathBuilder.curveToRelative(-6.41f, 6.68f, -13.0f, 13.59f, -13.0f, 22.42f);
        pathBuilder.reflectiveCurveToRelative(6.62f, 15.74f, 13.0f, 22.42f);
        pathBuilder.curveToRelative(4.0f, 4.2f, 8.2f, 8.54f, 10.0f, 12.8f);
        pathBuilder.curveToRelative(1.65f, 4.0f, 1.73f, 9.53f, 1.82f, 15.41f);
        pathBuilder.curveToRelative(0.14f, 9.0f, 0.29f, 19.19f, 6.83f, 25.74f);
        pathBuilder.reflectiveCurveToRelative(16.74f, 6.69f, 25.74f, 6.83f);
        pathBuilder.curveToRelative(5.88f, 0.09f, 11.43f, 0.17f, 15.41f, 1.82f);
        pathBuilder.curveToRelative(4.26f, 1.76f, 8.6f, 5.93f, 12.8f, 9.95f);
        pathBuilder.curveToRelative(6.68f, 6.41f, 13.59f, 13.0f, 22.42f, 13.0f);
        pathBuilder.reflectiveCurveToRelative(15.74f, -6.62f, 22.42f, -13.0f);
        pathBuilder.curveToRelative(4.2f, -4.0f, 8.54f, -8.2f, 12.8f, -10.0f);
        pathBuilder.curveToRelative(4.0f, -1.65f, 9.53f, -1.73f, 15.41f, -1.82f);
        pathBuilder.curveToRelative(9.0f, -0.14f, 19.19f, -0.29f, 25.74f, -6.83f);
        pathBuilder.reflectiveCurveToRelative(6.69f, -16.74f, 6.83f, -25.74f);
        pathBuilder.curveToRelative(0.09f, -5.88f, 0.17f, -11.43f, 1.82f, -15.41f);
        pathBuilder.curveToRelative(1.76f, -4.26f, 5.93f, -8.6f, 9.95f, -12.8f);
        pathBuilder.curveToRelative(6.41f, -6.68f, 13.0f, -13.59f, 13.0f, -22.42f);
        pathBuilder.reflectiveCurveTo(229.38f, 112.26f, 223.0f, 105.58f);
        pathBuilder.close();
        pathBuilder.moveTo(217.22f, 144.88f);
        pathBuilder.curveToRelative(-4.54f, 4.73f, -9.24f, 9.63f, -11.57f, 15.28f);
        pathBuilder.curveToRelative(-2.23f, 5.39f, -2.33f, 12.0f, -2.43f, 18.35f);
        pathBuilder.curveToRelative(-0.12f, 8.2f, -0.24f, 16.0f, -4.49f, 20.2f);
        pathBuilder.reflectiveCurveToRelative(-12.0f, 4.37f, -20.2f, 4.49f);
        pathBuilder.curveToRelative(-6.37f, 0.1f, -13.0f, 0.2f, -18.35f, 2.43f);
        pathBuilder.curveToRelative(-5.65f, 2.33f, -10.55f, 7.0f, -15.28f, 11.57f);
        pathBuilder.curveTo(139.09f, 222.75f, 133.62f, 228.0f, 128.0f, 228.0f);
        pathBuilder.reflectiveCurveToRelative(-11.09f, -5.25f, -16.88f, -10.8f);
        pathBuilder.curveToRelative(-4.73f, -4.54f, -9.63f, -9.24f, -15.28f, -11.57f);
        pathBuilder.curveToRelative(-5.39f, -2.23f, -12.0f, -2.33f, -18.35f, -2.43f);
        pathBuilder.curveToRelative(-8.2f, -0.12f, -15.95f, -0.24f, -20.2f, -4.49f);
        pathBuilder.reflectiveCurveToRelative(-4.37f, -12.0f, -4.49f, -20.2f);
        pathBuilder.curveToRelative(-0.1f, -6.37f, -0.2f, -13.0f, -2.43f, -18.35f);
        pathBuilder.curveToRelative(-2.33f, -5.65f, -7.0f, -10.55f, -11.57f, -15.28f);
        pathBuilder.curveTo(33.25f, 139.09f, 28.0f, 133.62f, 28.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.25f, -11.09f, 10.8f, -16.88f);
        pathBuilder.curveToRelative(4.54f, -4.73f, 9.24f, -9.63f, 11.57f, -15.28f);
        pathBuilder.curveToRelative(2.23f, -5.39f, 2.33f, -12.0f, 2.43f, -18.35f);
        pathBuilder.curveToRelative(0.12f, -8.2f, 0.24f, -15.95f, 4.49f, -20.2f);
        pathBuilder.reflectiveCurveToRelative(12.0f, -4.37f, 20.2f, -4.49f);
        pathBuilder.curveToRelative(6.37f, -0.1f, 13.0f, -0.2f, 18.35f, -2.43f);
        pathBuilder.curveToRelative(5.65f, -2.33f, 10.55f, -7.0f, 15.28f, -11.57f);
        pathBuilder.curveTo(116.91f, 33.25f, 122.38f, 28.0f, 128.0f, 28.0f);
        pathBuilder.reflectiveCurveToRelative(11.09f, 5.25f, 16.88f, 10.8f);
        pathBuilder.curveToRelative(4.73f, 4.54f, 9.63f, 9.24f, 15.28f, 11.57f);
        pathBuilder.curveToRelative(5.39f, 2.23f, 12.0f, 2.33f, 18.35f, 2.43f);
        pathBuilder.curveToRelative(8.2f, 0.12f, 16.0f, 0.24f, 20.2f, 4.49f);
        pathBuilder.reflectiveCurveToRelative(4.37f, 12.0f, 4.49f, 20.2f);
        pathBuilder.curveToRelative(0.1f, 6.37f, 0.2f, 13.0f, 2.43f, 18.35f);
        pathBuilder.curveToRelative(2.33f, 5.65f, 7.0f, 10.55f, 11.57f, 15.28f);
        pathBuilder.curveToRelative(5.55f, 5.79f, 10.8f, 11.26f, 10.8f, 16.88f);
        pathBuilder.reflectiveCurveTo(222.75f, 139.09f, 217.2f, 144.88f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 136.0f);
        pathBuilder.lineTo(124.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 172.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 172.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sealWarning = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
