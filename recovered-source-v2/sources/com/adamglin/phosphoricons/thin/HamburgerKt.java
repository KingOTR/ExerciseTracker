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

/* compiled from: Hamburger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hamburger", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHamburger", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hamburger", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HamburgerKt {
    private static ImageVector _hamburger;

    public static final ImageVector getHamburger(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(48.07f, 100.0f);
        pathBuilder.lineTo(207.93f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.8f, -14.55f);
        pathBuilder.curveToRelative(-3.39f, -16.0f, -14.56f, -30.68f, -31.46f, -41.23f);
        pathBuilder.reflectiveCurveTo(150.11f, 28.0f, 128.0f, 28.0f);
        pathBuilder.reflectiveCurveTo(84.49f, 33.76f, 67.73f, 44.22f);
        pathBuilder.reflectiveCurveTo(39.66f, 69.41f, 36.27f, 85.45f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 48.07f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.07f, 87.11f);
        pathBuilder.curveTo(50.26f, 58.0f, 86.33f, 36.0f, 128.0f, 36.0f);
        pathBuilder.reflectiveCurveToRelative(77.74f, 22.0f, 83.91f, 51.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.82f, 3.39f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.16f, 1.5f);
        pathBuilder.lineTo(48.07f, 92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.16f, -1.5f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 44.09f, 87.11f);
        pathBuilder.close();
        pathBuilder.moveTo(230.61f, 156.24f);
        pathBuilder.lineTo(188.05f, 171.72f);
        pathBuilder.lineTo(149.47f, 156.29f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 0.0f);
        pathBuilder.lineTo(108.0f, 171.69f);
        pathBuilder.lineToRelative(-38.51f, -15.4f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.86f, 0.0f);
        pathBuilder.lineToRelative(-44.0f, 16.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 180.0f);
        pathBuilder.arcToRelative(4.08f, 4.08f, 0.0f, false, false, 1.37f, -0.24f);
        pathBuilder.lineTo(44.0f, 173.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f);
        pathBuilder.lineTo(212.0f, 171.53f);
        pathBuilder.lineToRelative(21.37f, -7.77f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.74f, -7.52f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 184.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f);
        pathBuilder.lineTo(80.0f, 212.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f);
        pathBuilder.lineTo(52.0f, 170.07f);
        pathBuilder.lineToRelative(15.93f, -5.79f);
        pathBuilder.lineToRelative(38.58f, 15.43f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, 0.0f);
        pathBuilder.lineTo(148.0f, 164.31f);
        pathBuilder.lineToRelative(38.51f, 15.4f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.86f, 0.0f);
        pathBuilder.lineTo(204.0f, 174.44f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(232.0f, 124.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(24.0f, 132.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hamburger = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
