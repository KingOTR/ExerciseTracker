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

/* compiled from: Graduationcap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GraduationCap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGraduationCap", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_graduationCap", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GraduationcapKt {
    private static ImageVector _graduationCap;

    public static final ImageVector getGraduationCap(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _graduationCap;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GraduationCap", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 113.07f);
        pathBuilder.verticalLineToRelative(53.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.0f, 5.31f);
        pathBuilder.curveToRelative(-11.3f, 12.59f, -38.9f, 36.4f, -86.0f, 36.4f);
        pathBuilder.reflectiveCurveToRelative(-74.68f, -23.81f, -86.0f, -36.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.0f, -5.31f);
        pathBuilder.verticalLineTo(113.07f);
        pathBuilder.lineTo(128.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(251.76f, 88.94f);
        pathBuilder2.lineToRelative(-120.0f, -64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, 0.0f);
        pathBuilder2.lineToRelative(-120.0f, 64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 14.12f);
        pathBuilder2.lineTo(32.0f, 117.87f);
        pathBuilder2.verticalLineToRelative(48.42f);
        pathBuilder2.arcToRelative(15.91f, 15.91f, 0.0f, false, false, 4.06f, 10.65f);
        pathBuilder2.curveTo(49.16f, 191.53f, 78.51f, 216.0f, 128.0f, 216.0f);
        pathBuilder2.arcToRelative(130.0f, 130.0f, 0.0f, false, false, 48.0f, -8.76f);
        pathBuilder2.lineTo(176.0f, 240.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(192.0f, 199.51f);
        pathBuilder2.arcToRelative(115.63f, 115.63f, 0.0f, false, false, 27.94f, -22.57f);
        pathBuilder2.arcTo(15.91f, 15.91f, 0.0f, false, false, 224.0f, 166.29f);
        pathBuilder2.lineTo(224.0f, 117.87f);
        pathBuilder2.lineToRelative(27.76f, -14.81f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -14.12f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 200.0f);
        pathBuilder2.curveToRelative(-43.27f, 0.0f, -68.72f, -21.14f, -80.0f, -33.71f);
        pathBuilder2.lineTo(48.0f, 126.4f);
        pathBuilder2.lineToRelative(76.24f, 40.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.52f, 0.0f);
        pathBuilder2.lineTo(176.0f, 143.47f);
        pathBuilder2.verticalLineToRelative(46.34f);
        pathBuilder2.curveTo(163.4f, 195.69f, 147.52f, 200.0f, 128.0f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 166.25f);
        pathBuilder2.arcToRelative(97.83f, 97.83f, 0.0f, false, true, -16.0f, 14.25f);
        pathBuilder2.lineTo(192.0f, 134.93f);
        pathBuilder2.lineToRelative(16.0f, -8.53f);
        pathBuilder2.close();
        pathBuilder2.moveTo(188.0f, 118.94f);
        pathBuilder2.lineToRelative(-0.22f, -0.13f);
        pathBuilder2.lineToRelative(-56.0f, -29.87f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, 14.12f);
        pathBuilder2.lineTo(171.0f, 128.0f);
        pathBuilder2.lineToRelative(-43.0f, 22.93f);
        pathBuilder2.lineTo(25.0f, 96.0f);
        pathBuilder2.lineTo(128.0f, 41.07f);
        pathBuilder2.lineTo(231.0f, 96.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _graduationCap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
