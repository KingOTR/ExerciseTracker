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

/* compiled from: Graduationcap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GraduationCap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getGraduationCap", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_graduationCap", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GraduationcapKt {
    private static ImageVector _graduationCap;

    public static final ImageVector getGraduationCap(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(251.76f, 88.94f);
        pathBuilder.lineToRelative(-120.0f, -64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, 0.0f);
        pathBuilder.lineToRelative(-120.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 14.12f);
        pathBuilder.lineTo(32.0f, 117.87f);
        pathBuilder.verticalLineToRelative(48.42f);
        pathBuilder.arcToRelative(15.91f, 15.91f, 0.0f, false, false, 4.06f, 10.65f);
        pathBuilder.curveTo(49.16f, 191.53f, 78.51f, 216.0f, 128.0f, 216.0f);
        pathBuilder.arcToRelative(130.0f, 130.0f, 0.0f, false, false, 48.0f, -8.76f);
        pathBuilder.lineTo(176.0f, 240.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(192.0f, 199.51f);
        pathBuilder.arcToRelative(115.63f, 115.63f, 0.0f, false, false, 27.94f, -22.57f);
        pathBuilder.arcTo(15.91f, 15.91f, 0.0f, false, false, 224.0f, 166.29f);
        pathBuilder.lineTo(224.0f, 117.87f);
        pathBuilder.lineToRelative(27.76f, -14.81f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -14.12f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 200.0f);
        pathBuilder.curveToRelative(-43.27f, 0.0f, -68.72f, -21.14f, -80.0f, -33.71f);
        pathBuilder.lineTo(48.0f, 126.4f);
        pathBuilder.lineToRelative(76.24f, 40.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.52f, 0.0f);
        pathBuilder.lineTo(176.0f, 143.47f);
        pathBuilder.verticalLineToRelative(46.34f);
        pathBuilder.curveTo(163.4f, 195.69f, 147.52f, 200.0f, 128.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 166.25f);
        pathBuilder.arcToRelative(97.83f, 97.83f, 0.0f, false, true, -16.0f, 14.25f);
        pathBuilder.lineTo(192.0f, 134.93f);
        pathBuilder.lineToRelative(16.0f, -8.53f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 118.94f);
        pathBuilder.lineToRelative(-0.22f, -0.13f);
        pathBuilder.lineToRelative(-56.0f, -29.87f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, 14.12f);
        pathBuilder.lineTo(171.0f, 128.0f);
        pathBuilder.lineToRelative(-43.0f, 22.93f);
        pathBuilder.lineTo(25.0f, 96.0f);
        pathBuilder.lineTo(128.0f, 41.07f);
        pathBuilder.lineTo(231.0f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _graduationCap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
