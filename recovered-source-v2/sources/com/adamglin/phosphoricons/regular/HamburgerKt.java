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

/* compiled from: Hamburger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hamburger", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getHamburger", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hamburger", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HamburgerKt {
    private static ImageVector _hamburger;

    public static final ImageVector getHamburger(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(48.07f, 104.0f);
        pathBuilder.horizontalLineTo(207.93f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.72f, -19.38f);
        pathBuilder.curveTo(216.22f, 49.5f, 176.0f, 24.0f, 128.0f, 24.0f);
        pathBuilder.reflectiveCurveTo(39.78f, 49.5f, 32.35f, 84.62f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 48.07f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 40.0f);
        pathBuilder.curveToRelative(39.82f, 0.0f, 74.21f, 20.61f, 79.93f, 48.0f);
        pathBuilder.horizontalLineTo(48.07f);
        pathBuilder.lineTo(48.0f, 87.93f);
        pathBuilder.curveTo(53.79f, 60.61f, 88.18f, 40.0f, 128.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(229.26f, 152.48f);
        pathBuilder.lineToRelative(-41.13f, 15.0f);
        pathBuilder.lineTo(151.0f, 152.57f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.94f, 0.0f);
        pathBuilder.lineToRelative(-37.0f, 14.81f);
        pathBuilder.lineTo(71.0f, 152.57f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.7f, -0.09f);
        pathBuilder.lineToRelative(-44.0f, 16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.47f, 15.0f);
        pathBuilder.lineTo(40.0f, 178.69f);
        pathBuilder.verticalLineTo(184.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f);
        pathBuilder.verticalLineToRelative(-9.67f);
        pathBuilder.lineToRelative(18.73f, -6.81f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -5.47f, -15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 184.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f);
        pathBuilder.verticalLineTo(172.88f);
        pathBuilder.lineToRelative(11.87f, -4.32f);
        pathBuilder.lineTo(105.0f, 183.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.94f, 0.0f);
        pathBuilder.lineToRelative(37.0f, -14.81f);
        pathBuilder.lineToRelative(37.0f, 14.81f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.7f, 0.09f);
        pathBuilder.lineToRelative(9.27f, -3.37f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineTo(232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hamburger = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
