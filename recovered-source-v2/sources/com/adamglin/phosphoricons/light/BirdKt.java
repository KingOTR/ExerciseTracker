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

/* compiled from: Bird.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bird", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBird", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bird", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BirdKt {
    private static ImageVector _bird;

    public static final ImageVector getBird(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bird;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bird", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(174.0f, 68.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(238.0f, 80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.67f, 5.0f);
        pathBuilder.lineTo(214.0f, 99.21f);
        pathBuilder.lineTo(214.0f, 120.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, true, 112.0f, 222.0f);
        pathBuilder.lineTo(24.0f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -10.93f, -22.75f);
        pathBuilder.lineToRelative(0.07f, -0.09f);
        pathBuilder.lineTo(98.0f, 97.35f);
        pathBuilder.lineTo(98.0f, 76.89f);
        pathBuilder.curveTo(98.0f, 44.57f, 123.89f, 18.15f, 155.72f, 18.0f);
        pathBuilder.lineTo(156.0f, 18.0f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, false, true, 55.51f, 41.13f);
        pathBuilder.lineTo(235.33f, 75.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 238.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(221.18f, 80.0f);
        pathBuilder.lineTo(203.0f, 67.88f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.48f, -3.48f);
        pathBuilder.arcTo(46.0f, 46.0f, 0.0f, false, false, 156.0f, 30.0f);
        pathBuilder.horizontalLineToRelative(-0.23f);
        pathBuilder.curveTo(130.53f, 30.12f, 110.0f, 51.16f, 110.0f, 76.89f);
        pathBuilder.lineTo(110.0f, 99.52f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.39f, 3.85f);
        pathBuilder.lineTo(22.43f, 206.78f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 24.0f, 210.0f);
        pathBuilder.lineTo(51.86f, 210.0f);
        pathBuilder.lineToRelative(71.53f, -85.84f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.22f, 7.68f);
        pathBuilder.lineTo(67.48f, 210.0f);
        pathBuilder.lineTo(112.0f, 210.0f);
        pathBuilder.arcToRelative(90.1f, 90.1f, 0.0f, false, false, 90.0f, -90.0f);
        pathBuilder.lineTo(202.0f, 96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.67f, -5.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bird = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
