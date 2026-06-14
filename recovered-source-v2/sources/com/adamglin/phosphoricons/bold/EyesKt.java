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

/* compiled from: Eyes.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Eyes", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getEyes", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyes", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyesKt {
    private static ImageVector _eyes;

    public static final ImageVector getEyes(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _eyes;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Eyes", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.48f, 60.0f);
        pathBuilder.curveTo(209.21f, 39.37f, 193.42f, 28.0f, 176.0f, 28.0f);
        pathBuilder.reflectiveCurveToRelative(-33.21f, 11.37f, -44.48f, 32.0f);
        pathBuilder.curveToRelative(-1.24f, 2.28f, -2.42f, 4.65f, -3.52f, 7.11f);
        pathBuilder.curveToRelative(-1.1f, -2.46f, -2.28f, -4.83f, -3.52f, -7.11f);
        pathBuilder.curveTo(113.21f, 39.37f, 97.42f, 28.0f, 80.0f, 28.0f);
        pathBuilder.reflectiveCurveTo(46.79f, 39.37f, 35.52f, 60.0f);
        pathBuilder.curveTo(25.51f, 78.38f, 20.0f, 102.52f, 20.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.51f, 49.62f, 15.52f, 68.0f);
        pathBuilder.curveTo(46.79f, 216.62f, 62.58f, 228.0f, 80.0f, 228.0f);
        pathBuilder.reflectiveCurveToRelative(33.21f, -11.38f, 44.48f, -32.0f);
        pathBuilder.curveToRelative(1.24f, -2.28f, 2.42f, -4.65f, 3.52f, -7.11f);
        pathBuilder.curveToRelative(1.1f, 2.46f, 2.28f, 4.83f, 3.52f, 7.11f);
        pathBuilder.curveToRelative(11.27f, 20.65f, 27.06f, 32.0f, 44.48f, 32.0f);
        pathBuilder.reflectiveCurveToRelative(33.21f, -11.38f, 44.48f, -32.0f);
        pathBuilder.curveToRelative(10.0f, -18.35f, 15.52f, -42.49f, 15.52f, -68.0f);
        pathBuilder.reflectiveCurveTo(230.49f, 78.38f, 220.48f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 116.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 116.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 204.0f);
        pathBuilder.curveToRelative(-12.08f, 0.0f, -25.13f, -15.72f, -31.7f, -40.84f);
        pathBuilder.arcTo(35.55f, 35.55f, 0.0f, false, false, 56.0f, 164.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f);
        pathBuilder.arcToRelative(35.55f, 35.55f, 0.0f, false, false, -7.7f, 0.84f);
        pathBuilder.curveTo(54.87f, 67.72f, 67.92f, 52.0f, 80.0f, 52.0f);
        pathBuilder.curveToRelative(17.0f, 0.0f, 36.0f, 31.21f, 36.0f, 76.0f);
        pathBuilder.reflectiveCurveTo(97.0f, 204.0f, 80.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 204.0f);
        pathBuilder.curveToRelative(-12.08f, 0.0f, -25.13f, -15.72f, -31.7f, -40.84f);
        pathBuilder.arcToRelative(35.55f, 35.55f, 0.0f, false, false, 7.7f, 0.84f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f);
        pathBuilder.arcToRelative(35.55f, 35.55f, 0.0f, false, false, -7.7f, 0.84f);
        pathBuilder.curveTo(150.87f, 67.72f, 163.92f, 52.0f, 176.0f, 52.0f);
        pathBuilder.curveToRelative(17.0f, 0.0f, 36.0f, 31.21f, 36.0f, 76.0f);
        pathBuilder.reflectiveCurveTo(193.0f, 204.0f, 176.0f, 204.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyes = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
