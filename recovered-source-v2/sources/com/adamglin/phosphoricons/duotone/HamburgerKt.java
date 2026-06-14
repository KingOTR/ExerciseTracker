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

/* compiled from: Hamburger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hamburger", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHamburger", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hamburger", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HamburgerKt {
    private static ImageVector _hamburger;

    public static final ImageVector getHamburger(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _hamburger;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hamburger", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(188.0f, 176.0f);
        pathBuilder.lineToRelative(20.0f, -7.27f);
        pathBuilder.lineTo(208.0f, 184.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f);
        pathBuilder.lineTo(80.0f, 216.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f);
        pathBuilder.lineTo(48.0f, 167.27f);
        pathBuilder.lineTo(68.0f, 160.0f);
        pathBuilder.lineToRelative(40.0f, 16.0f);
        pathBuilder.lineToRelative(40.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.82f, 86.28f);
        pathBuilder.curveTo(209.32f, 55.55f, 172.48f, 32.0f, 128.0f, 32.0f);
        pathBuilder.reflectiveCurveTo(46.68f, 55.55f, 40.18f, 86.28f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 48.07f, 96.0f);
        pathBuilder.lineTo(207.93f, 96.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 215.82f, 86.28f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(48.07f, 104.0f);
        pathBuilder2.horizontalLineTo(207.93f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.72f, -19.38f);
        pathBuilder2.curveTo(216.22f, 49.5f, 176.0f, 24.0f, 128.0f, 24.0f);
        pathBuilder2.reflectiveCurveTo(39.78f, 49.5f, 32.35f, 84.62f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 48.07f, 104.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 40.0f);
        pathBuilder2.curveToRelative(39.82f, 0.0f, 74.21f, 20.61f, 79.93f, 48.0f);
        pathBuilder2.horizontalLineTo(48.07f);
        pathBuilder2.lineTo(48.0f, 87.93f);
        pathBuilder2.curveTo(53.79f, 60.61f, 88.18f, 40.0f, 128.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(229.26f, 152.48f);
        pathBuilder2.lineToRelative(-41.13f, 15.0f);
        pathBuilder2.lineTo(151.0f, 152.57f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.94f, 0.0f);
        pathBuilder2.lineToRelative(-37.0f, 14.81f);
        pathBuilder2.lineTo(71.0f, 152.57f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.7f, -0.09f);
        pathBuilder2.lineToRelative(-44.0f, 16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.47f, 15.0f);
        pathBuilder2.lineTo(40.0f, 178.69f);
        pathBuilder2.verticalLineTo(184.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder2.horizontalLineToRelative(96.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f);
        pathBuilder2.verticalLineToRelative(-9.67f);
        pathBuilder2.lineToRelative(18.73f, -6.81f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -5.47f, -15.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 184.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f);
        pathBuilder2.horizontalLineTo(80.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f);
        pathBuilder2.verticalLineTo(172.88f);
        pathBuilder2.lineToRelative(11.87f, -4.32f);
        pathBuilder2.lineTo(105.0f, 183.43f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.94f, 0.0f);
        pathBuilder2.lineToRelative(37.0f, -14.81f);
        pathBuilder2.lineToRelative(37.0f, 14.81f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.7f, 0.09f);
        pathBuilder2.lineToRelative(9.27f, -3.37f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 128.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.horizontalLineTo(232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.horizontalLineTo(24.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 128.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hamburger = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
