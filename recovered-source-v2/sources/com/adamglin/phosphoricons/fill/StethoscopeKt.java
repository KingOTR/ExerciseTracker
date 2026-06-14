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

/* compiled from: Stethoscope.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Stethoscope", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getStethoscope", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stethoscope", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StethoscopeKt {
    private static ImageVector _stethoscope;

    public static final ImageVector getStethoscope(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _stethoscope;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Stethoscope", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 160.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -39.93f, 31.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.07f, 1.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f);
        pathBuilder.lineTo(144.0f, 224.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f);
        pathBuilder.lineTo(112.0f, 151.48f);
        pathBuilder.curveToRelative(31.47f, -4.0f, 56.0f, -31.47f, 56.0f, -64.31f);
        pathBuilder.lineTo(168.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder.lineTo(136.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.lineTo(152.0f, 87.17f);
        pathBuilder.curveToRelative(0.0f, 26.58f, -21.25f, 48.49f, -47.36f, 48.83f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, true, 56.0f, 88.0f);
        pathBuilder.lineTo(56.0f, 48.0f);
        pathBuilder.lineTo(72.0f, 48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.lineTo(48.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.lineTo(40.0f, 88.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, 56.0f, 63.49f);
        pathBuilder.lineTo(96.0f, 192.0f);
        pathBuilder.arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, -48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.07f, -1.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 240.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stethoscope = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
