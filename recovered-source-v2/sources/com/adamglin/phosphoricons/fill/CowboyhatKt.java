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

/* compiled from: Cowboyhat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CowboyHat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCowboyHat", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cowboyHat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CowboyhatKt {
    private static ImageVector _cowboyHat;

    public static final ImageVector getCowboyHat(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _cowboyHat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CowboyHat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.78f, 3.76f);
        pathBuilder.arcTo(179.9f, 179.9f, 0.0f, false, true, 195.41f, 143.0f);
        pathBuilder.lineToRelative(-1.63f, -8.57f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.lineTo(178.32f, 53.07f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -25.72f, -9.55f);
        pathBuilder.lineToRelative(-0.13f, 0.1f);
        pathBuilder.lineTo(128.0f, 64.0f);
        pathBuilder.lineTo(103.53f, 43.62f);
        pathBuilder.lineToRelative(-0.13f, -0.1f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -25.72f, 9.53f);
        pathBuilder.lineTo(62.23f, 134.38f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.lineTo(60.59f, 143.0f);
        pathBuilder.arcToRelative(179.27f, 179.27f, 0.0f, false, true, -13.81f, -19.25f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 120.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, 80.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.68f, 144.0f);
        pathBuilder.horizontalLineTo(179.31f);
        pathBuilder.lineToRelative(2.54f, 13.35f);
        pathBuilder.arcToRelative(113.28f, 113.28f, 0.0f, false, true, -27.35f, 19.0f);
        pathBuilder.curveTo(139.1f, 183.77f, 128.06f, 184.0f, 128.0f, 184.0f);
        pathBuilder.curveToRelative(-0.33f, 0.0f, -25.49f, -0.4f, -53.86f, -26.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cowboyHat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
