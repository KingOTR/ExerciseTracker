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

/* compiled from: Golf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Golf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getGolf", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_golf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GolfKt {
    private static ImageVector _golf;

    public static final ImageVector getGolf(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _golf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Golf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 132.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 96.0f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, true, true, 128.0f, 8.0f);
        pathBuilder.arcTo(88.1f, 88.1f, 0.0f, false, true, 216.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 96.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, true, false, -72.0f, 72.0f);
        pathBuilder.arcTo(72.08f, 72.08f, 0.0f, false, false, 200.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(165.14f, 192.53f);
        pathBuilder.curveTo(152.0f, 197.56f, 139.85f, 200.0f, 128.0f, 200.0f);
        pathBuilder.reflectiveCurveToRelative(-24.0f, -2.44f, -37.14f, -7.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -5.72f, 14.94f);
        pathBuilder.arcTo(125.91f, 125.91f, 0.0f, false, false, 120.0f, 215.68f);
        pathBuilder.lineTo(120.0f, 248.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(136.0f, 215.68f);
        pathBuilder.arcToRelative(125.91f, 125.91f, 0.0f, false, false, 34.86f, -8.21f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -5.72f, -14.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _golf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
