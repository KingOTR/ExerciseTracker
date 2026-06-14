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

/* compiled from: Bellslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BellSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBellSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bellSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellslashKt {
    private static ImageVector _bellSlash;

    public static final ImageVector getBellSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _bellSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BellSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(221.84f, 192.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.arcToRelative(1.85f, 1.85f, 0.0f, false, true, -3.0f, 0.28f);
        pathBuilder.lineTo(83.27f, 43.19f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.8f, -6.0f);
        pathBuilder.arcTo(79.55f, 79.55f, 0.0f, false, true, 129.17f, 24.0f);
        pathBuilder.curveTo(173.0f, 24.66f, 207.8f, 61.1f, 208.0f, 104.92f);
        pathBuilder.curveToRelative(0.14f, 34.88f, 8.31f, 61.54f, 13.82f, 71.0f);
        pathBuilder.arcTo(15.89f, 15.89f, 0.0f, false, true, 221.84f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(213.92f, 210.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.85f, 10.76f);
        pathBuilder.lineTo(182.62f, 200.0f);
        pathBuilder.lineTo(167.16f, 200.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -78.41f, 0.0f);
        pathBuilder.lineTo(47.91f, 200.0f);
        pathBuilder.arcToRelative(15.78f, 15.78f, 0.0f, false, true, -13.59f, -7.59f);
        pathBuilder.arcToRelative(16.42f, 16.42f, 0.0f, false, true, -0.09f, -16.68f);
        pathBuilder.curveToRelative(5.55f, -9.73f, 13.7f, -36.64f, 13.7f, -71.73f);
        pathBuilder.arcTo(79.42f, 79.42f, 0.0f, false, true, 58.79f, 63.85f);
        pathBuilder.lineTo(42.0f, 45.38f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 53.84f, 34.62f);
        pathBuilder.close();
        pathBuilder.moveTo(150.59f, 200.0f);
        pathBuilder.lineTo(105.32f, 200.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 45.27f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bellSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
