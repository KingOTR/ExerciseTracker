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

/* compiled from: Hamburger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hamburger", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHamburger", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hamburger", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HamburgerKt {
    private static ImageVector _hamburger;

    public static final ImageVector getHamburger(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(48.07f, 102.0f);
        pathBuilder.lineTo(207.93f, 102.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.76f, -17.0f);
        pathBuilder.curveTo(214.45f, 50.83f, 175.05f, 26.0f, 128.0f, 26.0f);
        pathBuilder.reflectiveCurveTo(41.55f, 50.83f, 34.31f, 85.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.76f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(46.07f, 87.52f);
        pathBuilder.curveTo(52.0f, 59.29f, 87.25f, 38.0f, 128.0f, 38.0f);
        pathBuilder.reflectiveCurveTo(204.0f, 59.29f, 210.0f, 87.52f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.48f);
        pathBuilder.lineTo(48.07f, 90.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.48f);
        pathBuilder.close();
        pathBuilder.moveTo(230.0f, 154.36f);
        pathBuilder.lineTo(188.1f, 169.58f);
        pathBuilder.lineToRelative(-37.87f, -15.15f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.46f, 0.0f);
        pathBuilder.lineTo(108.0f, 169.54f);
        pathBuilder.lineTo(70.23f, 154.43f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.28f, -0.07f);
        pathBuilder.lineToRelative(-44.0f, 16.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 24.0f, 182.0f);
        pathBuilder.arcToRelative(6.11f, 6.11f, 0.0f, false, false, 2.05f, -0.36f);
        pathBuilder.lineToRelative(16.0f, -5.8f);
        pathBuilder.lineTo(42.05f, 184.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f);
        pathBuilder.lineTo(214.05f, 172.93f);
        pathBuilder.lineToRelative(20.05f, -7.29f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.1f, -11.28f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 184.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 26.0f);
        pathBuilder.lineTo(80.0f, 210.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f);
        pathBuilder.lineTo(54.0f, 171.48f);
        pathBuilder.lineToRelative(13.9f, -5.06f);
        pathBuilder.lineToRelative(37.87f, 15.15f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.46f, 0.0f);
        pathBuilder.lineTo(148.0f, 166.46f);
        pathBuilder.lineToRelative(37.77f, 15.11f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.28f, 0.07f);
        pathBuilder.lineTo(202.0f, 177.29f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.lineTo(232.0f, 122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(24.0f, 134.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hamburger = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
