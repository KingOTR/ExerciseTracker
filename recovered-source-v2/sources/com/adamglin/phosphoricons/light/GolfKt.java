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

/* compiled from: Golf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Golf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGolf", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_golf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GolfKt {
    private static ImageVector _golf;

    public static final ImageVector getGolf(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(174.0f, 100.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 122.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 132.0f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(214.0f, 96.0f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, true, true, -86.0f, -86.0f);
        pathBuilder.arcTo(86.1f, 86.1f, 0.0f, false, true, 214.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 96.0f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, true, false, -74.0f, 74.0f);
        pathBuilder.arcTo(74.09f, 74.09f, 0.0f, false, false, 202.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(165.86f, 194.4f);
        pathBuilder.curveToRelative(-13.38f, 5.11f, -25.77f, 7.6f, -37.86f, 7.6f);
        pathBuilder.reflectiveCurveToRelative(-24.48f, -2.49f, -37.86f, -7.6f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -4.28f, 11.2f);
        pathBuilder.arcTo(122.32f, 122.32f, 0.0f, false, false, 122.0f, 213.81f);
        pathBuilder.lineTo(122.0f, 248.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(134.0f, 213.81f);
        pathBuilder.arcToRelative(122.32f, 122.32f, 0.0f, false, false, 36.14f, -8.21f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.28f, -11.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _golf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
