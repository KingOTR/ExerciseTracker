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

/* compiled from: Flyingsaucer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlyingSaucer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFlyingSaucer", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flyingSaucer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlyingsaucerKt {
    private static ImageVector _flyingSaucer;

    public static final ImageVector getFlyingSaucer(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(181.69f, 214.1f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.38f, 3.8f);
        pathBuilder.lineToRelative(-8.0f, -24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.38f, -3.8f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 186.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(134.0f, 192.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 186.0f);
        pathBuilder.close();
        pathBuilder.moveTo(89.9f, 186.31f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.59f, 3.79f);
        pathBuilder.lineToRelative(-8.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.38f, 3.8f);
        pathBuilder.lineToRelative(8.0f, -24.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 89.9f, 186.31f);
        pathBuilder.close();
        pathBuilder.moveTo(246.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 15.37f, -12.94f, 29.39f, -36.44f, 39.46f);
        pathBuilder.curveTo(187.67f, 160.84f, 158.71f, 166.0f, 128.0f, 166.0f);
        pathBuilder.reflectiveCurveToRelative(-59.67f, -5.16f, -81.56f, -14.54f);
        pathBuilder.curveTo(22.94f, 141.39f, 10.0f, 127.37f, 10.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, -21.16f, 25.06f, -39.65f, 65.59f, -48.57f);
        pathBuilder.arcToRelative(61.85f, 61.85f, 0.0f, false, true, 105.24f, 0.09f);
        pathBuilder.curveTo(221.1f, 72.48f, 246.0f, 90.93f, 246.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(78.0f, 96.84f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.arcToRelative(9.93f, 9.93f, 0.0f, false, false, 7.69f, 9.7f);
        pathBuilder.arcTo(190.35f, 190.35f, 0.0f, false, false, 128.0f, 114.0f);
        pathBuilder.arcToRelative(190.35f, 190.35f, 0.0f, false, false, 42.3f, -4.42f);
        pathBuilder.arcToRelative(9.93f, 9.93f, 0.0f, false, false, 7.69f, -9.7f);
        pathBuilder.lineTo(177.99f, 96.0f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, false, false, -50.0f, -50.0f);
        pathBuilder.horizontalLineToRelative(-0.67f);
        pathBuilder.curveTo(100.13f, 46.36f, 78.0f, 69.16f, 78.0f, 96.84f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, -13.33f, -18.38f, -26.61f, -46.8f, -34.52f);
        pathBuilder.arcTo(62.24f, 62.24f, 0.0f, false, true, 190.0f, 96.0f);
        pathBuilder.verticalLineToRelative(3.92f);
        pathBuilder.arcToRelative(21.86f, 21.86f, 0.0f, false, true, -17.0f, 21.35f);
        pathBuilder.arcTo(202.0f, 202.0f, 0.0f, false, true, 128.0f, 126.0f);
        pathBuilder.arcToRelative(201.89f, 201.89f, 0.0f, false, true, -45.0f, -4.73f);
        pathBuilder.arcTo(21.86f, 21.86f, 0.0f, false, true, 66.0f, 99.92f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(66.0f, 96.85f);
        pathBuilder.arcTo(63.0f, 63.0f, 0.0f, false, true, 69.08f, 77.4f);
        pathBuilder.curveTo(40.49f, 85.3f, 22.0f, 98.62f, 22.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 10.12f, 10.63f, 20.48f, 29.17f, 28.43f);
        pathBuilder.curveTo(71.59f, 149.18f, 98.88f, 154.0f, 128.0f, 154.0f);
        pathBuilder.reflectiveCurveToRelative(56.41f, -4.82f, 76.83f, -13.57f);
        pathBuilder.curveTo(223.37f, 132.48f, 234.0f, 122.12f, 234.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flyingSaucer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
