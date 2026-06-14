package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Flyingsaucer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlyingSaucer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFlyingSaucer", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flyingSaucer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlyingsaucerKt {
    private static ImageVector _flyingSaucer;

    public static final ImageVector getFlyingSaucer(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(187.77f, 213.65f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.42f, 14.12f);
        pathBuilder.arcTo(11.87f, 11.87f, 0.0f, false, true, 176.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.76f, -9.65f);
        pathBuilder.lineToRelative(-4.0f, -20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.54f, -4.7f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 188.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 200.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(86.35f, 184.23f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.12f, 9.42f);
        pathBuilder.lineToRelative(-4.0f, 20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.42f, 14.12f);
        pathBuilder.arcTo(11.87f, 11.87f, 0.0f, false, false, 80.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.76f, -9.65f);
        pathBuilder.lineToRelative(4.0f, -20.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 86.35f, 184.23f);
        pathBuilder.close();
        pathBuilder.moveTo(252.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 17.92f, -14.23f, 33.89f, -40.08f, 45.0f);
        pathBuilder.curveToRelative(-22.61f, 9.69f, -52.42f, 15.0f, -83.92f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(-61.31f, -5.34f, -83.92f, -15.0f);
        pathBuilder.curveTo(18.23f, 145.89f, 4.0f, 129.92f, 4.0f, 112.0f);
        pathBuilder.curveTo(4.0f, 87.94f, 29.28f, 68.0f, 71.91f, 58.11f);
        pathBuilder.arcTo(67.61f, 67.61f, 0.0f, false, true, 175.77f, 47.6f);
        pathBuilder.arcToRelative(69.05f, 69.05f, 0.0f, false, true, 8.79f, 10.62f);
        pathBuilder.curveTo(226.9f, 68.14f, 252.0f, 88.05f, 252.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 96.83f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, 3.87f);
        pathBuilder.arcTo(184.32f, 184.32f, 0.0f, false, false, 128.0f, 108.0f);
        pathBuilder.arcToRelative(184.32f, 184.32f, 0.0f, false, false, 41.0f, -4.27f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, -3.87f);
        pathBuilder.lineTo(172.0f, 96.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -44.0f, -44.0f);
        pathBuilder.horizontalLineToRelative(-0.59f);
        pathBuilder.curveTo(103.47f, 52.31f, 84.0f, 72.43f, 84.0f, 96.83f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, -6.64f, -7.65f, -12.76f, -12.21f, -15.83f);
        pathBuilder.arcToRelative(91.73f, 91.73f, 0.0f, false, false, -20.48f, -9.88f);
        pathBuilder.arcTo(69.47f, 69.47f, 0.0f, false, true, 196.0f, 96.0f);
        pathBuilder.verticalLineToRelative(3.93f);
        pathBuilder.arcToRelative(27.84f, 27.84f, 0.0f, false, true, -21.66f, 27.19f);
        pathBuilder.arcTo(207.92f, 207.92f, 0.0f, false, true, 128.0f, 132.0f);
        pathBuilder.arcToRelative(207.92f, 207.92f, 0.0f, false, true, -46.33f, -4.88f);
        pathBuilder.arcTo(27.84f, 27.84f, 0.0f, false, true, 60.0f, 99.94f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(60.0f, 96.87f);
        pathBuilder.arcToRelative(70.37f, 70.37f, 0.0f, false, true, 0.82f, -10.63f);
        pathBuilder.arcToRelative(92.39f, 92.39f, 0.0f, false, false, -20.53f, 9.88f);
        pathBuilder.curveTo(35.7f, 99.19f, 28.0f, 105.34f, 28.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 14.68f, 39.0f, 36.0f, 100.0f, 36.0f);
        pathBuilder.reflectiveCurveTo(228.0f, 126.68f, 228.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flyingSaucer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
