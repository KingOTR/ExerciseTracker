package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bell.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bell", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBell", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bell", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellKt {
    private static ImageVector _bell;

    public static final ImageVector getBell(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _bell;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bell", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(221.8f, 175.94f);
        pathBuilder.curveTo(216.25f, 166.38f, 208.0f, 139.33f, 208.0f, 104.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, true, false, -160.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 35.34f, -8.26f, 62.38f, -13.81f, 71.94f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 200.0f);
        pathBuilder.horizontalLineTo(88.81f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 78.38f, 0.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.8f, -24.06f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 216.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -22.62f, -16.0f);
        pathBuilder.horizontalLineToRelative(45.24f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 216.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bell = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
