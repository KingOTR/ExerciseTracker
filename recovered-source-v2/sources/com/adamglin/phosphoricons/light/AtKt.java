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

/* compiled from: At.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"At", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAt", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_at", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AtKt {
    private static ImageVector _at;

    public static final ImageVector getAt(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _at;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("At", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcToRelative(102.0f, 102.0f, 0.0f, false, false, 0.0f, 204.0f);
        pathBuilder.curveToRelative(21.13f, 0.0f, 43.31f, -6.35f, 59.32f, -17.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.65f, -10.0f);
        pathBuilder.curveToRelative(-13.9f, 9.25f, -34.09f, 15.0f, -52.67f, 15.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f);
        pathBuilder.curveToRelative(0.0f, 29.58f, -13.78f, 34.0f, -22.0f, 34.0f);
        pathBuilder.reflectiveCurveToRelative(-22.0f, -4.42f, -22.0f, -34.0f);
        pathBuilder.lineTo(174.0f, 88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, false, 4.34f, 56.32f);
        pathBuilder.curveTo(171.76f, 166.6f, 182.0f, 174.0f, 196.0f, 174.0f);
        pathBuilder.curveToRelative(21.29f, 0.0f, 34.0f, -17.2f, 34.0f, -46.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 162.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, true, 128.0f, 162.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _at = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
