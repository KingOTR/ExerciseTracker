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

/* compiled from: Flyingsaucer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlyingSaucer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFlyingSaucer", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flyingSaucer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlyingsaucerKt {
    private static ImageVector _flyingSaucer;

    public static final ImageVector getFlyingSaucer(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _flyingSaucer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlyingSaucer", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(183.59f, 213.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.18f, 5.06f);
        pathBuilder.lineToRelative(-8.0f, -24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.18f, -5.06f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(136.0f, 192.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.53f, 184.41f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.12f, 5.06f);
        pathBuilder.lineToRelative(-8.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.18f, 5.06f);
        pathBuilder.lineToRelative(8.0f, -24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 90.53f, 184.41f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 16.22f, -13.37f, 30.89f, -37.65f, 41.29f);
        pathBuilder.curveTo(188.22f, 162.78f, 159.0f, 168.0f, 128.0f, 168.0f);
        pathBuilder.reflectiveCurveToRelative(-60.22f, -5.22f, -82.35f, -14.71f);
        pathBuilder.curveTo(21.37f, 142.89f, 8.0f, 128.22f, 8.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, -8.37f, 3.67f, -20.79f, 21.17f, -32.5f);
        pathBuilder.curveToRelative(11.37f, -7.61f, 26.94f, -13.76f, 45.18f, -17.85f);
        pathBuilder.arcTo(63.64f, 63.64f, 0.0f, false, true, 173.0f, 50.45f);
        pathBuilder.arcToRelative(64.84f, 64.84f, 0.0f, false, true, 9.11f, 11.3f);
        pathBuilder.curveTo(223.43f, 71.09f, 248.0f, 89.74f, 248.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 96.83f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, false, 6.13f, 7.76f);
        pathBuilder.arcTo(188.24f, 188.24f, 0.0f, false, false, 128.0f, 112.0f);
        pathBuilder.arcToRelative(188.09f, 188.09f, 0.0f, false, false, 41.85f, -4.37f);
        pathBuilder.arcTo(7.93f, 7.93f, 0.0f, false, false, 176.0f, 99.87f);
        pathBuilder.lineTo(176.0f, 96.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.64f, -48.0f);
        pathBuilder.curveTo(101.25f, 48.34f, 80.0f, 70.25f, 80.0f, 96.83f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, -11.7f, -16.63f, -23.89f, -41.9f, -31.59f);
        pathBuilder.arcTo(64.68f, 64.68f, 0.0f, false, true, 192.0f, 96.0f);
        pathBuilder.verticalLineToRelative(3.92f);
        pathBuilder.arcToRelative(23.86f, 23.86f, 0.0f, false, true, -18.56f, 23.3f);
        pathBuilder.arcTo(204.05f, 204.05f, 0.0f, false, true, 128.0f, 128.0f);
        pathBuilder.arcToRelative(204.15f, 204.15f, 0.0f, false, true, -45.44f, -4.78f);
        pathBuilder.arcTo(23.86f, 23.86f, 0.0f, false, true, 64.0f, 99.92f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(64.0f, 96.86f);
        pathBuilder.arcToRelative(65.28f, 65.28f, 0.0f, false, true, 2.13f, -16.52f);
        pathBuilder.curveTo(40.72f, 88.0f, 24.0f, 100.25f, 24.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 18.92f, 42.71f, 40.0f, 104.0f, 40.0f);
        pathBuilder.reflectiveCurveTo(232.0f, 130.92f, 232.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flyingSaucer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
