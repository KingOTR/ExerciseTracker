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

/* compiled from: Tooth.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tooth", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTooth", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tooth", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToothKt {
    private static ImageVector _tooth;

    public static final ImageVector getTooth(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _tooth;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tooth", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(170.23f, 69.57f);
        pathBuilder.lineTo(144.16f, 80.0f);
        pathBuilder.lineToRelative(26.07f, 10.43f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -4.46f, 11.14f);
        pathBuilder.lineTo(128.0f, 86.46f);
        pathBuilder.lineTo(90.23f, 101.57f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.8f, -3.35f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.34f, -7.79f);
        pathBuilder.lineTo(111.84f, 80.0f);
        pathBuilder.lineTo(85.77f, 69.57f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.46f, -11.14f);
        pathBuilder.lineTo(128.0f, 73.53f);
        pathBuilder.lineToRelative(37.77f, -15.1f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 4.46f, 11.14f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 79.75f);
        pathBuilder.curveToRelative(0.0f, 42.45f, -7.91f, 74.9f, -14.59f, 94.64f);
        pathBuilder.curveToRelative(-8.59f, 25.41f, -20.22f, 44.74f, -31.91f, 53.0f);
        pathBuilder.arcToRelative(13.7f, 13.7f, 0.0f, false, true, -13.94f, 1.23f);
        pathBuilder.arcToRelative(14.1f, 14.1f, 0.0f, false, true, -8.0f, -11.69f);
        pathBuilder.curveToRelative(-1.13f, -15.33f, -5.87f, -51.0f, -25.52f, -51.0f);
        pathBuilder.reflectiveCurveToRelative(-24.39f, 35.64f, -25.52f, 51.0f);
        pathBuilder.arcToRelative(14.1f, 14.1f, 0.0f, false, true, -14.0f, 13.0f);
        pathBuilder.arcToRelative(13.69f, 13.69f, 0.0f, false, true, -8.0f, -2.58f);
        pathBuilder.curveToRelative(-11.69f, -8.29f, -23.32f, -27.62f, -31.91f, -53.0f);
        pathBuilder.curveTo(41.91f, 154.65f, 34.0f, 122.2f, 34.0f, 79.75f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, true, 88.0f, 26.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, true, 222.0f, 79.75f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 79.75f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, false, 168.0f, 38.0f);
        pathBuilder.lineTo(88.0f, 38.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, false, 46.0f, 79.76f);
        pathBuilder.curveToRelative(-0.07f, 73.93f, 24.69f, 126.0f, 41.44f, 137.88f);
        pathBuilder.arcToRelative(1.77f, 1.77f, 0.0f, false, false, 1.88f, 0.15f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.19f, -1.71f);
        pathBuilder.curveTo(93.46f, 176.0f, 106.77f, 154.0f, 128.0f, 154.0f);
        pathBuilder.reflectiveCurveToRelative(34.54f, 22.0f, 37.49f, 62.09f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.19f, 1.71f);
        pathBuilder.arcToRelative(1.77f, 1.77f, 0.0f, false, false, 1.88f, -0.15f);
        pathBuilder.curveTo(185.31f, 205.74f, 210.07f, 153.69f, 210.0f, 79.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tooth = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
