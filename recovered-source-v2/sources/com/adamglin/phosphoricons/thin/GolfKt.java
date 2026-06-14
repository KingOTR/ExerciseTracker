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

/* compiled from: Golf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Golf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGolf", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_golf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GolfKt {
    private static ImageVector _golf;

    public static final ImageVector getGolf(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(172.0f, 100.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 124.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 132.0f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 96.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, true, true, -84.0f, -84.0f);
        pathBuilder.arcTo(84.09f, 84.09f, 0.0f, false, true, 212.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 96.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, true, false, -76.0f, 76.0f);
        pathBuilder.arcTo(76.08f, 76.08f, 0.0f, false, false, 204.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(166.57f, 196.26f);
        pathBuilder.curveTo(153.0f, 201.47f, 140.34f, 204.0f, 128.0f, 204.0f);
        pathBuilder.reflectiveCurveToRelative(-25.0f, -2.53f, -38.57f, -7.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -2.86f, 7.48f);
        pathBuilder.arcTo(119.31f, 119.31f, 0.0f, false, false, 124.0f, 211.91f);
        pathBuilder.lineTo(124.0f, 248.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 211.91f);
        pathBuilder.arcToRelative(119.31f, 119.31f, 0.0f, false, false, 37.43f, -8.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.86f, -7.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _golf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
